package o;

/* loaded from: classes3.dex */
public final class HS extends HT {
    private final long d;

    @Override // o.HT
    public int d() {
        return (int) this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HS) && this.d == ((HS) obj).d;
    }

    public final long h() {
        return this.d;
    }

    public int hashCode() {
        return Long.hashCode(this.d);
    }

    @Override // o.HT
    public long j() {
        return this.d;
    }

    public String toString() {
        long j = this.d;
        return "JsonGraphPrimitiveLong(value=" + j + ")";
    }

    public HS(long j) {
        super(null);
        this.d = j;
    }

    @Override // o.HT
    public Number i() {
        return Long.valueOf(this.d);
    }
}
