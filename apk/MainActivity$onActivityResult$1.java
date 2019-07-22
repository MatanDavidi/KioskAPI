package com.valora.kkiosk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.text.StringsKt;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo21491d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "item", "", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
final class MainActivity$onActivityResult$1 implements OnClickListener {
    final /* synthetic */ String[] $items;
    final /* synthetic */ ObjectRef $phoneInput;

    MainActivity$onActivityResult$1(String[] strArr, ObjectRef objectRef) {
        this.$items = strArr;
        this.$phoneInput = objectRef;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String replace$default = StringsKt.replace$default(String.valueOf(this.$items[i]), "-", "", false, 4, (Object) null);
        EditText editText = (EditText) this.$phoneInput.element;
        if (editText != null) {
            editText.setText(replace$default);
        }
    }
}
