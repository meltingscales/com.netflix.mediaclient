package o;

import android.content.Context;

/* loaded from: classes3.dex */
public final class aYN extends C1045Mp {
    public static final aYN a = new aYN();

    private aYN() {
        super("nf_msl_utils");
    }

    public static final void b(Context context, String str) {
        synchronized (aYN.class) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            a.getLogTag();
            C8157dfA.a(context, "pref_appboot_ssl_truststore_hash", str);
        }
    }

    public static final String a(Context context) {
        String e;
        synchronized (aYN.class) {
            C8632dsu.c((Object) context, "");
            a.getLogTag();
            e = C8157dfA.e(context, "pref_appboot_ssl_truststore_hash", (String) null);
        }
        return e;
    }
}
