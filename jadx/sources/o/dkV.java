package o;

/* loaded from: classes5.dex */
public class dkV extends AbstractC8424dlb {
    private final String a;
    private final dkO c;
    private final dkU e;

    public dkV(dkU dku, String str) {
        super(dkT.h);
        this.e = dku;
        this.a = str;
        this.c = null;
    }

    @Override // o.AbstractC8424dlb
    public C8401dkf d(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("useridtoken", abstractC8399dkd.c(this.e.c(abstractC8399dkd, c8404dki)));
        e.e("profileguid", this.a);
        return e;
    }

    @Override // o.AbstractC8424dlb
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkV) {
            dkV dkv = (dkV) obj;
            return super.equals(obj) && this.e.equals(dkv.e) && this.a.equals(dkv.a);
        }
        return false;
    }

    @Override // o.AbstractC8424dlb
    public int hashCode() {
        return (super.hashCode() ^ this.e.hashCode()) ^ this.a.hashCode();
    }
}
