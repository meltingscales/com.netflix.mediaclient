package o;

/* loaded from: classes3.dex */
public final class HV extends HO {
    private final int c;
    private final long d;
    private final Long e;

    public HV() {
        this(null, 1, null);
    }

    @Override // o.HO
    public Long a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HV) && C8632dsu.c(this.e, ((HV) obj).e);
    }

    public int hashCode() {
        Long l = this.e;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        Long l = this.e;
        return "JsonGraphUndefined(expires=" + l + ")";
    }

    @Override // o.HZ
    public boolean v_() {
        return true;
    }

    public /* synthetic */ HV(Long l, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : l);
    }

    public HV(Long l) {
        super(null);
        this.e = l;
    }

    @Override // o.HO
    public Long e() {
        return Long.valueOf(this.d);
    }

    @Override // o.HO
    public Integer c() {
        return Integer.valueOf(this.c);
    }
}
