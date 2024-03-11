package o;

/* loaded from: classes3.dex */
public final class HU extends HT {
    private final double a;

    @Override // o.HT
    public int d() {
        return (int) this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HU) && Double.compare(this.a, ((HU) obj).a) == 0;
    }

    public final double h() {
        return this.a;
    }

    public int hashCode() {
        return Double.hashCode(this.a);
    }

    @Override // o.HT
    public long j() {
        return (long) this.a;
    }

    public String toString() {
        double d = this.a;
        return "JsonGraphPrimitiveDouble(value=" + d + ")";
    }

    public HU(double d) {
        super(null);
        this.a = d;
    }

    @Override // o.HT
    public Number i() {
        return Double.valueOf(this.a);
    }
}
