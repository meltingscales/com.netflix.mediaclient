package o;

/* loaded from: classes5.dex */
public class djS extends djG {
    private final String c;

    @Override // o.djG
    public String d() {
        return this.c;
    }

    public djS(String str) {
        super(djI.d);
        this.c = str;
    }

    @Override // o.djG
    public C8401dkf e(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("identity", this.c);
        return e;
    }

    @Override // o.djG
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djS) {
            return super.equals(obj) && this.c.equals(((djS) obj).c);
        }
        return false;
    }

    @Override // o.djG
    public int hashCode() {
        return super.hashCode() ^ this.c.hashCode();
    }
}
