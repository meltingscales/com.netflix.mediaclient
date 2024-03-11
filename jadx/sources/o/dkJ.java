package o;

/* loaded from: classes5.dex */
public final class dkJ {
    private final int d;
    private final String e;

    public int d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public dkJ(String str, int i) {
        this.e = str;
        this.d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dkJ) {
            dkJ dkj = (dkJ) obj;
            String str = this.e;
            if ((str == null || dkj.e == null) && str != dkj.e) {
                return false;
            }
            return str.equals(dkj.e) && this.d == dkj.d;
        }
        return false;
    }

    public int hashCode() {
        return (this.e + ":" + this.d).hashCode();
    }

    public String toString() {
        return "ApplicationIdentity(identity=" + e() + ", keyVersion=" + d() + ")";
    }
}
