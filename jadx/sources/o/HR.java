package o;

/* loaded from: classes3.dex */
public final class HR extends HT {
    private final int a;

    @Override // o.HT
    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HR) && this.a == ((HR) obj).a;
    }

    public final int h() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // o.HT
    public long j() {
        return this.a;
    }

    public String toString() {
        int i = this.a;
        return "JsonGraphPrimitiveInt(value=" + i + ")";
    }

    public HR(int i) {
        super(null);
        this.a = i;
    }

    @Override // o.HT
    public Number i() {
        return Integer.valueOf(this.a);
    }
}
