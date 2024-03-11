package o;

/* loaded from: classes4.dex */
public final class bFL {
    private final int e;

    public final int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bFL) && this.e == ((bFL) obj).e;
    }

    public int hashCode() {
        return Integer.hashCode(this.e);
    }

    public String toString() {
        int i = this.e;
        return "TabConfig(tabType=" + i + ")";
    }

    public bFL(int i) {
        this.e = i;
    }
}
