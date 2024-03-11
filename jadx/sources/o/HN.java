package o;

/* loaded from: classes3.dex */
public final class HN extends HY {
    private final boolean c;

    public final boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HN) && this.c == ((HN) obj).c;
    }

    public int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public String toString() {
        boolean z = this.c;
        return "JsonGraphPrimitiveBoolean(value=" + z + ")";
    }

    public HN(boolean z) {
        super(null);
        this.c = z;
    }
}
