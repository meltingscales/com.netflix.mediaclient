package o;

/* loaded from: classes3.dex */
public final class GN extends GW {
    private final boolean a;

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GN) && this.a == ((GN) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public GN(boolean z) {
        super(null);
        this.a = z;
    }

    @Override // o.GW
    public String b() {
        return String.valueOf(this.a);
    }

    public String toString() {
        return b();
    }
}
