package com.valora.kkiosk;

import android.content.Intent;
import android.os.Bundle;
import android.support.p000v4.app.ActivityCompat;
import android.support.p003v7.app.ActionBar;
import android.support.p003v7.app.AppCompatActivity;
import android.support.p003v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.afollestad.materialdialogs.MaterialDialog.Builder;
import com.afollestad.materialdialogs.MaterialDialog.InputCallback;
import com.google.zxing.ResultPoint;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.valora.kkioskPreview.C1224R;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo21491d2 = {"Lcom/valora/kkiosk/CodeActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/journeyapps/barcodescanner/BarcodeCallback;", "()V", "groupName", "", "lastScannedCode", "", "barcodeResult", "", "result", "Lcom/journeyapps/barcodescanner/BarcodeResult;", "checkPermission", "enterCodeManually", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "possibleResultPoints", "resultPoints", "", "Lcom/google/zxing/ResultPoint;", "setResultAndExit", "code", "Companion", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: CodeActivity.kt */
public final class CodeActivity extends AppCompatActivity implements BarcodeCallback {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTRA_CODE = "code";
    @NotNull
    public static final String EXTRA_GROUP_NAME = "name";
    public static final int PERMISSION_REQUEST_CAMERA = 2607;
    public static final int SCAN_INTERVAL = 1000;
    private HashMap _$_findViewCache;
    private String groupName = "";
    private long lastScannedCode;

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo21491d2 = {"Lcom/valora/kkiosk/CodeActivity$Companion;", "", "()V", "EXTRA_CODE", "", "EXTRA_GROUP_NAME", "PERMISSION_REQUEST_CAMERA", "", "SCAN_INTERVAL", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: CodeActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void possibleResultPoints(@Nullable List<ResultPoint> list) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_code);
        setSupportActionBar((Toolbar) _$_findCachedViewById(C1224R.C1226id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        String str = "";
        if (supportActionBar != null) {
            supportActionBar.setTitle((CharSequence) str);
        }
        ((Button) _$_findCachedViewById(C1224R.C1226id.button_code_manual)).setOnClickListener(new CodeActivity$onCreate$1(this));
        ((DecoratedBarcodeView) _$_findCachedViewById(C1224R.C1226id.qr_code_view)).decodeContinuous(this);
        DecoratedBarcodeView decoratedBarcodeView = (DecoratedBarcodeView) _$_findCachedViewById(C1224R.C1226id.qr_code_view);
        Intrinsics.checkExpressionValueIsNotNull(decoratedBarcodeView, "qr_code_view");
        TextView statusView = decoratedBarcodeView.getStatusView();
        Intrinsics.checkExpressionValueIsNotNull(statusView, "qr_code_view.statusView");
        statusView.setText(str);
        checkPermission();
        String stringExtra = getIntent().getStringExtra("name");
        Intrinsics.checkExpressionValueIsNotNull(stringExtra, "intent.getStringExtra(EXTRA_GROUP_NAME)");
        this.groupName = stringExtra;
    }

    public void onResume() {
        super.onResume();
        if (ActivityCompat.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            ((DecoratedBarcodeView) _$_findCachedViewById(C1224R.C1226id.qr_code_view)).resume();
        }
    }

    public void onPause() {
        super.onPause();
        ((DecoratedBarcodeView) _$_findCachedViewById(C1224R.C1226id.qr_code_view)).pause();
    }

    private final void checkPermission() {
        String str = "android.permission.CAMERA";
        if (ActivityCompat.checkSelfPermission(this, str) != 0) {
            ActivityCompat.requestPermissions(this, new String[]{str}, 2607);
        }
    }

    /* access modifiers changed from: private */
    public final void enterCodeManually() {
        new Builder(this).title((int) R.string.membergroups_qr_enter_manually).input((CharSequence) "Code", (CharSequence) "", (InputCallback) new CodeActivity$enterCodeManually$1(this)).show();
    }

    /* access modifiers changed from: private */
    public final void setResultAndExit(String str) {
        if (!(str.length() == 0)) {
            Intent intent = new Intent();
            intent.putExtra(EXTRA_CODE, str);
            intent.putExtra("name", this.groupName);
            setResult(-1, intent);
            finish();
        }
    }

    public void barcodeResult(@Nullable BarcodeResult barcodeResult) {
        if (barcodeResult == null) {
            Intrinsics.throwNpe();
        }
        if (barcodeResult.getText() != null && barcodeResult.getText().length() <= 16 && System.currentTimeMillis() - this.lastScannedCode > ((long) 1000)) {
            this.lastScannedCode = System.currentTimeMillis();
            String text = barcodeResult.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "result.text");
            setResultAndExit(text);
        }
    }
}
