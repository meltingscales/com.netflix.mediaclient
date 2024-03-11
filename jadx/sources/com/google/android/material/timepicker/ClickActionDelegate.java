package com.google.android.material.timepicker;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
class ClickActionDelegate extends AccessibilityDelegateCompat {
    private static int a = 0;
    private static int e = 1;
    private static byte e$ss2$32 = 24;
    private final AccessibilityNodeInfoCompat.AccessibilityActionCompat clickAction;

    public ClickActionDelegate(Context context, int i) {
        String string = context.getString(i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i2 = a + 81;
            e = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.clickAction = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, string);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(this.clickAction);
    }

    private static void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$32);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
