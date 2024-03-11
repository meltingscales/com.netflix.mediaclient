package o;

/* loaded from: classes3.dex */
public final class GT extends GW {
    private final int d;

    public final int c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GT) && this.d == ((GT) obj).d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d);
    }

    public GT(int i) {
        super(null);
        this.d = i;
    }

    @Override // o.GW
    public String b() {
        return String.valueOf(this.d);
    }

    public String toString() {
        return b();
    }
}
