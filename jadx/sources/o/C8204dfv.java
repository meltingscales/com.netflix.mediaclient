package o;

import android.content.Context;
import androidx.core.content.ContextCompat;

/* renamed from: o.dfv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8204dfv {
    public static boolean d(String[] strArr, String[] strArr2, int[] iArr) {
        if (iArr.length >= 1 && strArr.length == iArr.length) {
            for (int i = 0; i < iArr.length; i++) {
                if (iArr[i] != 0 && !e(strArr[i], strArr2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    static boolean e(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(int[] iArr) {
        if (iArr.length < 1) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(int[] iArr, int i) {
        if (iArr.length != i) {
            return false;
        }
        return d(iArr);
    }

    public static boolean d(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) != 0;
    }

    public static boolean e(Context context, String[] strArr) {
        for (String str : strArr) {
            if (d(context, str)) {
                return true;
            }
        }
        return false;
    }
}
