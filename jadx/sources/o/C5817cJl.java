package o;

/* renamed from: o.cJl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5817cJl {
    private final boolean a;
    private final boolean b;
    private final boolean d;

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5817cJl) {
            C5817cJl c5817cJl = (C5817cJl) obj;
            return this.b == c5817cJl.b && this.a == c5817cJl.a && this.d == c5817cJl.d;
        }
        return false;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.b) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        boolean z = this.b;
        boolean z2 = this.a;
        boolean z3 = this.d;
        return "SeekButtonState(visible=" + z + ", enabled=" + z2 + ", animate=" + z3 + ")";
    }

    public C5817cJl(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.a = z2;
        this.d = z3;
    }
}
