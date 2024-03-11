package o;

/* loaded from: classes3.dex */
public final class HX extends HO {
    private final Long a;
    private final Integer b;
    private final AbstractC0935Ig<GW> c;
    private final Long e;

    @Override // o.HO
    public Long a() {
        return this.e;
    }

    @Override // o.HO
    public Integer c() {
        return this.b;
    }

    @Override // o.HO
    public Long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HX) {
            HX hx = (HX) obj;
            return C8632dsu.c(this.c, hx.c) && C8632dsu.c(this.e, hx.e) && C8632dsu.c(this.a, hx.a) && C8632dsu.c(this.b, hx.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Long l = this.e;
        int hashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.a;
        int hashCode3 = l2 == null ? 0 : l2.hashCode();
        Integer num = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final AbstractC0935Ig<GW> i() {
        return this.c;
    }

    public String toString() {
        AbstractC0935Ig<GW> abstractC0935Ig = this.c;
        Long l = this.e;
        Long l2 = this.a;
        Integer num = this.b;
        return "JsonGraphReference(path=" + abstractC0935Ig + ", expires=" + l + ", timestamp=" + l2 + ", size=" + num + ")";
    }

    @Override // o.HZ
    public boolean u_() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HX(AbstractC0935Ig<? extends GW> abstractC0935Ig, Long l, Long l2, Integer num) {
        super(null);
        C8632dsu.c((Object) abstractC0935Ig, "");
        this.c = abstractC0935Ig;
        this.e = l;
        this.a = l2;
        this.b = num;
    }
}
