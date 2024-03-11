package o;

/* loaded from: classes5.dex */
public class dkX extends AbstractC8424dlb {
    private final String b;
    private final String c;

    public String a() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public String toString() {
        return "NetflixIdAuthenticationData(netflixId=" + e() + ", secureNetflixId=" + a() + ")";
    }

    protected boolean e(Object obj) {
        return obj instanceof dkX;
    }

    @Override // o.AbstractC8424dlb
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkX) {
            dkX dkx = (dkX) obj;
            if (dkx.e(this) && super.equals(obj)) {
                String e = e();
                String e2 = dkx.e();
                if (e != null ? e.equals(e2) : e2 == null) {
                    String a = a();
                    String a2 = dkx.a();
                    return a != null ? a.equals(a2) : a2 == null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC8424dlb
    public int hashCode() {
        int hashCode = super.hashCode();
        String e = e();
        int hashCode2 = e == null ? 43 : e.hashCode();
        String a = a();
        return (((hashCode * 59) + hashCode2) * 59) + (a != null ? a.hashCode() : 43);
    }

    public dkX(String str, String str2) {
        super(dkT.c);
        this.c = str;
        this.b = str2;
    }

    @Override // o.AbstractC8424dlb
    public C8401dkf d(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("netflixid", this.c);
        String str = this.b;
        if (str != null) {
            e.e("securenetflixid", str);
        }
        return e;
    }
}
