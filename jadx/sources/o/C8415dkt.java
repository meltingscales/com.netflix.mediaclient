package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.dkt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8415dkt {
    private final String j;
    private static Map<String, C8415dkt> f = new HashMap();
    public static final C8415dkt e = new C8415dkt("ASYMMETRIC_WRAPPED");
    public static final C8415dkt b = new C8415dkt("DIFFIE_HELLMAN");
    public static final C8415dkt c = new C8415dkt("JWE_LADDER");
    public static final C8415dkt d = new C8415dkt("JWK_LADDER");
    public static final C8415dkt a = new C8415dkt("SYMMETRIC_WRAPPED");

    public String b() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8415dkt(String str) {
        this.j = str;
        synchronized (f) {
            f.put(str, this);
        }
    }

    public static C8415dkt e(String str) {
        return f.get(str);
    }

    public String toString() {
        return b();
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8415dkt) {
            return this.j.equals(((C8415dkt) obj).j);
        }
        return false;
    }
}
