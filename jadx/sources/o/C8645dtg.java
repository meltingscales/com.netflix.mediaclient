package o;

/* renamed from: o.dtg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8645dtg implements InterfaceC8650dtl<Double> {
    private final double b;
    private final double e;

    public boolean c(double d) {
        return d >= this.e && d <= this.b;
    }

    public boolean c(double d, double d2) {
        return d <= d2;
    }

    @Override // o.InterfaceC8650dtl
    public boolean e() {
        return this.e > this.b;
    }

    public C8645dtg(double d, double d2) {
        this.e = d;
        this.b = d2;
    }

    @Override // o.InterfaceC8650dtl
    public /* synthetic */ boolean d(Double d, Double d2) {
        return c(d.doubleValue(), d2.doubleValue());
    }

    @Override // o.InterfaceC8650dtl
    public /* synthetic */ boolean e(Double d) {
        return c(d.doubleValue());
    }

    @Override // o.InterfaceC8649dtk
    /* renamed from: d */
    public Double h() {
        return Double.valueOf(this.e);
    }

    @Override // o.InterfaceC8649dtk
    /* renamed from: c */
    public Double g() {
        return Double.valueOf(this.b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8645dtg) {
            if (!e() || !((C8645dtg) obj).e()) {
                C8645dtg c8645dtg = (C8645dtg) obj;
                if (this.e != c8645dtg.e || this.b != c8645dtg.b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (e()) {
            return -1;
        }
        return (Double.hashCode(this.e) * 31) + Double.hashCode(this.b);
    }

    public String toString() {
        return this.e + ".." + this.b;
    }
}
