import java.util.*;
import java.lang.*;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
class Apicalls
{  
    public static void main(String args[])
    {
        String format = ZonedDateTime.now(ZoneId.of("UTC")).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String UUID = "ad47266c-ac54-11e9-a2a3-2a2ae2dbcce4";
        String toHash = format + UUID + "so8#@xsMbkVFyvjV";
        
        byte[] bytes = toHash.getBytes(Charset.forName("UTF-8"));
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);
            int length = digest.length;
            char[] cArr2 = new char[(length << 1)];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i + 1;
                cArr2[i] = DIGITS_LOWER[(digest[i2] & 240) >>> 4];
                i = i3 + 1;
                cArr2[i3] = DIGITS_LOWER[digest[i2] & 15];
            }
            String hash = new String(cArr2);
            
            String curl = "curl -H 'Host: kkiosk-ufeed.feeds.barcodes.no' -H 'accept: */*' -H 'content-type: application/json' -H 'accept-language: de-ch' -H 'X-Liquid-Timestamp: " + format + "' -H 'user-agent: K-Kiosk/437 CFNetwork/975.0.3 Darwin/18.2.0' -H 'X-Liquid-Signature: " + hash + "' --data-binary '{  \"Culture\" : \"de-CH\",  \"DeviceId\" : \"" + UUID + "\"}' --compressed 'https://kkiosk-ufeed.feeds.barcodes.no/v1/initialize'";
            System.out.println(curl);
        }
        catch(Exception ex) {}
        
 
    }
}