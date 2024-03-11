package o;

import android.content.Context;

/* renamed from: o.aJj  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C1656aJj {
    private static String a;
    private static String d;
    private static String e;

    C1656aJj() {
    }

    public static boolean c(Context context, String str) {
        boolean z;
        if (str.equals(e)) {
            z = false;
        } else {
            e = str;
            z = true;
        }
        if (z) {
            C8157dfA.a(context, "pref_ngp_sso_store", e);
        }
        return z;
    }

    public static boolean a(Context context, String str) {
        boolean z;
        if (str.equals(d)) {
            z = false;
        } else {
            d = str;
            z = true;
        }
        if (z) {
            C8157dfA.a(context, "pref_ngp_device_id_store", d);
        }
        return z;
    }

    public static String b(Context context) {
        String str = e;
        if (str != null) {
            return str;
        }
        String e2 = C8157dfA.e(context, "pref_ngp_sso_store", "{}");
        e = e2;
        return e2;
    }

    public static String a(Context context) {
        String str = d;
        if (str != null) {
            return str;
        }
        String e2 = C8157dfA.e(context, "pref_ngp_device_id_store", "{}");
        d = e2;
        return e2;
    }

    public static boolean e(Context context, String str) {
        boolean z;
        if (str.equals(a)) {
            z = false;
        } else {
            a = str;
            z = true;
        }
        if (z) {
            C8157dfA.a(context, "pref_ngp_logout_store", a);
        }
        return z;
    }

    public static String e(Context context) {
        String str = a;
        if (str != null) {
            return str;
        }
        String e2 = C8157dfA.e(context, "pref_ngp_logout_store", "{}");
        a = e2;
        return e2;
    }
}
