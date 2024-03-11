package o;

import com.netflix.msl.MslInternalException;

/* loaded from: classes5.dex */
public class dkY extends AbstractC8424dlb {
    private final dkO a;
    private final dkU d;

    public dkY(dkO dko, dkU dku) {
        super(dkZ.j);
        if (!dku.d(dko)) {
            throw new MslInternalException("User ID token must be bound to master token.");
        }
        this.a = dko;
        this.d = dku;
    }

    @Override // o.AbstractC8424dlb
    public C8401dkf d(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("mastertoken", this.a.b(abstractC8399dkd, c8404dki));
        e.e("useridtoken", this.d.b(abstractC8399dkd, c8404dki));
        return e;
    }

    @Override // o.AbstractC8424dlb
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkY) {
            dkY dky = (dkY) obj;
            return super.equals(obj) && this.a.equals(dky.a) && this.d.equals(dky.d);
        }
        return false;
    }

    @Override // o.AbstractC8424dlb
    public int hashCode() {
        return (super.hashCode() ^ this.a.hashCode()) ^ this.d.hashCode();
    }
}
