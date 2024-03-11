package o;

import android.text.TextUtils;

/* renamed from: o.dfz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8208dfz {
    private static boolean c = false;

    public static boolean e(CharSequence charSequence) {
        return b(charSequence, false, "String cannot be empty") && c(charSequence, false, "String cannot be empty");
    }

    private static boolean b(Object obj, boolean z, String str) {
        if (obj == null) {
            b(new NullPointerException(str), z);
            return false;
        }
        return true;
    }

    private static boolean c(CharSequence charSequence, boolean z, String str) {
        if (TextUtils.isEmpty(charSequence)) {
            b(new IllegalArgumentException(str), z);
            return false;
        }
        return true;
    }

    private static boolean b(RuntimeException runtimeException, boolean z) {
        if (c || z) {
            throw runtimeException;
        }
        InterfaceC1598aHf.a(new C1596aHd().d(runtimeException));
        return false;
    }
}
