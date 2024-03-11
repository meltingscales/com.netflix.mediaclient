package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class djI {
    private final String l;
    private final boolean m;
    private final boolean n;
    private static Map<String, djI> g = new HashMap();
    public static final djI f = new djI("PSK", true, true);
    public static final djI h = new djI("PSK_PROFILE", true, true);
    public static final djI i = new djI("X509", false, true);
    public static final djI j = new djI(AleCryptoBouncyCastle.RSA_KEY_ALG, false, true);
    public static final djI b = new djI("ECC", false, true);
    public static final djI d = new djI("NONE", false, false);
    public static final djI a = new djI("NONE_SUFFIXED", false, false);
    public static final djI e = new djI("MT_PROTECTED", false, false);
    public static final djI c = new djI("PROVISIONED", false, false);

    public boolean a() {
        return this.n;
    }

    public String c() {
        return this.l;
    }

    public boolean d() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public djI(String str, boolean z, boolean z2) {
        this.l = str;
        this.m = z;
        this.n = z2;
        synchronized (g) {
            g.put(str, this);
        }
    }

    public static djI a(String str) {
        return g.get(str);
    }

    public String toString() {
        return c();
    }

    public int hashCode() {
        return this.l.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djI) {
            return this.l.equals(((djI) obj).l);
        }
        return false;
    }
}
