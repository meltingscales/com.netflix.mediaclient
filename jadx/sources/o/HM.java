package o;

/* loaded from: classes3.dex */
public final class HM extends HO {
    private final Integer a;
    private final Long b;
    private final String c;
    private final Long e;

    @Override // o.HO
    public Long a() {
        return this.b;
    }

    @Override // o.HO
    public Integer c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    @Override // o.HO
    public Long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HM) {
            HM hm = (HM) obj;
            return C8632dsu.c((Object) this.c, (Object) hm.c) && C8632dsu.c(this.b, hm.b) && C8632dsu.c(this.e, hm.e) && C8632dsu.c(this.a, hm.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Long l = this.b;
        int hashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.e;
        int hashCode3 = l2 == null ? 0 : l2.hashCode();
        Integer num = this.a;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        Long l = this.b;
        Long l2 = this.e;
        Integer num = this.a;
        return "JsonGraphError(errorMessage=" + str + ", expires=" + l + ", timestamp=" + l2 + ", size=" + num + ")";
    }

    public /* synthetic */ HM(String str, Long l, Long l2, Integer num, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HM(String str, Long l, Long l2, Integer num) {
        super(null);
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.b = l;
        this.e = l2;
        this.a = num;
    }
}
