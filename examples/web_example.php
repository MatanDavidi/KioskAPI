<a href="/">Go back to /</a>
<hr>
<?php
use Classes\KioskAPI;
use Classes\Logger;
use Classes\UUID;
use Classes\Signature;

require_once __DIR__ . '/../vendor/autoload.php';

$files = [];
$phone = false;
$logged = false;
$session = "";
$shared = "";

$settings["app"]["deviceuuid"] = UUID::getRandomUUID();
$settings["logger"]["path"] = "KioskAPI.log";
$settings["logger"]["display"] = Logger::VISIBLE;
$settings["logger"]["displaylength"] = 255;

$ka = new KioskAPI($settings);

if (isset($_GET["session"])) {
    $session = $_GET["session"];
    $ka->load($_GET["session"]);
    $logged = true;
    if (isset($_GET["couponId"]) && isset($_GET["scheduleId"]) && isset($_GET["phone"])) {
        $couponId = $_GET["couponId"];
        $scheduleId = $_GET["scheduleId"];
        $msn = $_GET["phone"];
        $shared = $ka->api->shareCoupon($couponId, $scheduleId, $msn)["ResultCode"];
    }
} elseif (isset($_GET["pin"]) && isset($_GET["phone"])) {
    $phone = $_GET["phone"];
    $pin = $_GET["pin"];
    $userId = file_get_contents($phone);
    $register = $ka->api->register($pin, "1980-01-01", $userId);
    if (isset($register["UserId"])) {
        $ka->save();
        unlink($phone);
        $phone = false;
        $logged = true;
    }
} elseif (isset($_GET["phone"])) {
    $phone = $_GET["phone"];
    $initialize = $ka->api->initialize();
    $pin = $ka->api->requestPin($phone);
    $userId = $ka->getUserId();
    file_put_contents($phone, $userId);
} else {
    if (file_exists("sessions")) {
        $files = glob("sessions/*.json");
    }
}
?>
<?php if ($logged):
        $coup = $ka->api->getCoupons();
        $userId = $ka->getUserId();
        $msn = $ka->api->getUser()["Msn"];
?>
    <h1>Logged as <?php echo $userId." ".$msn;?></h1>
    <?php if ($shared != "") {
    echo "<h3>Shared: $shared<h3>";
} ?>
    <?php
    foreach ($coup as $type => $coupons) {
        echo "<h2>$type</h2>";
        foreach ($coupons as $c) {
            echo "<div style='display: inline-block; padding: 10px; border: 2px solid black;'>";
            if ($c["ShareType"] == "Shareable") {
                echo '<form method="get">
                    <input type="hidden" name="session" value="'.$session.'" />
                    <input type="hidden" name="couponId" value="'.$c["ContentId"].'" />
                    <input type="hidden" name="scheduleId" value="'.$c["ScheduleId"].'" />
                    <input type="tel" name="phone" placeholder="00000000">
                    <input type="submit" value="Share"/>
                </form>';
            }
            echo $c["ScheduleId"]." ".$c["ContentId"]." ".$c["TopText"]." ".$c["ShareType"].((isset($c["ContentUrl"]))?' <a href="'.$c["ContentUrl"].'">ContentUrl (probably a game)</a>':'')."<br>";
            echo '<img width="150px" src="'.$c["TopImageUrl"].'">';
            if (isset($c["BarcodeUrl"])) {
                echo '<img width="80" src="'.$c["BarcodeUrl"].'">';
            }
            echo "</div>";
        }
    }
    ?>
<?php endif; ?>

<?php if (count($files) > 0 && !$phone): ?>
    <h1>Select a session:</h1>
    <ul>
        <?php foreach ($files as $file): ?>
            <li><a href="?session=<?php echo $file; ?>"><?php echo $file; ?></a></li>
        <?php endforeach; ?>
    </ul>
<?php endif; ?>

<?php if ($phone): ?>
    <h1>Pin</h1>
    <form method="get">
        <input type="number" name="pin" placeholder="1234"/>
        <input type="hidden" name="phone" value="<?php echo $phone; ?>"/>
        <input type="submit" value="Send">
    </form>
<?php else: ?>
    <h1>Create a new session</h1>
    <form method="get">
        <input type="tel" name="phone" placeholder="000000000"/>
        <input type="submit" value="Send">
    </form>
<?php endif; ?>
