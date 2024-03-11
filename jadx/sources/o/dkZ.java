package o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class dkZ {
    private static Map<String, dkZ> a = new HashMap();
    public static final dkZ f = new dkZ("EMAIL_PASSWORD");
    public static final dkZ j = new dkZ("USER_ID_TOKEN");
    private final String e;

    public String d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dkZ(String str) {
        this.e = str;
        synchronized (a) {
            a.put(str, this);
        }
    }

    public static dkZ d(String str) {
        return a.get(str);
    }

    public String toString() {
        return d();
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkZ) {
            return this.e.equals(((dkZ) obj).e);
        }
        return false;
    }
}
