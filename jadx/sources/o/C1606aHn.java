package o;

/* renamed from: o.aHn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1606aHn {
    private final boolean c;
    private final int e;

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1606aHn) {
            C1606aHn c1606aHn = (C1606aHn) obj;
            return this.c == c1606aHn.c && this.e == c1606aHn.e;
        }
        return false;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.c) * 31) + Integer.hashCode(this.e);
    }

    public String toString() {
        boolean z = this.c;
        int i = this.e;
        return "ShouldLogEvent(shouldLog=" + z + ", samplingPercentage=" + i + ")";
    }

    public C1606aHn(boolean z, int i) {
        this.c = z;
        this.e = i;
    }
}
