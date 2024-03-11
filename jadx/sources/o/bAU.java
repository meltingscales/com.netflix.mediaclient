package o;

/* loaded from: classes4.dex */
public final class bAU {
    private final long a;
    private final float b;
    private final long c;
    private final long d;
    private final long e;

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.c;
    }

    public final float c() {
        return this.b;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bAU) {
            bAU bau = (bAU) obj;
            return this.d == bau.d && this.e == bau.e && Float.compare(this.b, bau.b) == 0 && this.c == bau.c && this.a == bau.a;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.d) * 31) + Long.hashCode(this.e)) * 31) + Float.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Long.hashCode(this.a);
    }

    public String toString() {
        long j = this.d;
        long j2 = this.e;
        float f = this.b;
        long j3 = this.c;
        long j4 = this.a;
        return "CollectTasteLolomoOverlayAnimationConfig(scaleDuration=" + j + ", scaleStartOffset=" + j2 + ", scaleTo=" + f + ", alphaDuration=" + j3 + ", alphaStartOffset=" + j4 + ")";
    }

    public bAU(long j, long j2, float f, long j3, long j4) {
        this.d = j;
        this.e = j2;
        this.b = f;
        this.c = j3;
        this.a = j4;
    }
}
