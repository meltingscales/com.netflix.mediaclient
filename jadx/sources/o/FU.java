package o;

/* loaded from: classes2.dex */
public final class FU implements FD {
    private final String c;
    private final int e;

    public final int d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FU) {
            FU fu = (FU) obj;
            return C8632dsu.c((Object) this.c, (Object) fu.c) && this.e == fu.e;
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + Integer.hashCode(this.e);
    }

    public String toString() {
        String str = this.c;
        int i = this.e;
        return "Spacer(key=" + str + ", size=" + i + ")";
    }

    public FU(String str, int i) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.e = i;
    }
}
