package o;

/* renamed from: o.bBm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3536bBm {
    private final long a;
    private final long b;
    private final long c;
    private final float d;
    private final float e;
    private final long f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;

    public final long a() {
        return this.b;
    }

    public final float b() {
        return this.e;
    }

    public final long c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    public final long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3536bBm) {
            C3536bBm c3536bBm = (C3536bBm) obj;
            return this.a == c3536bBm.a && Float.compare(this.i, c3536bBm.i) == 0 && Float.compare(this.j, c3536bBm.j) == 0 && Float.compare(this.h, c3536bBm.h) == 0 && Float.compare(this.g, c3536bBm.g) == 0 && this.b == c3536bBm.b && Float.compare(this.d, c3536bBm.d) == 0 && Float.compare(this.e, c3536bBm.e) == 0 && this.c == c3536bBm.c && this.f == c3536bBm.f;
        }
        return false;
    }

    public final float f() {
        return this.j;
    }

    public final float g() {
        return this.h;
    }

    public final float h() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.a) * 31) + Float.hashCode(this.i)) * 31) + Float.hashCode(this.j)) * 31) + Float.hashCode(this.h)) * 31) + Float.hashCode(this.g)) * 31) + Long.hashCode(this.b)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Long.hashCode(this.c)) * 31) + Long.hashCode(this.f);
    }

    public final float i() {
        return this.g;
    }

    public final long j() {
        return this.f;
    }

    public String toString() {
        long j = this.a;
        float f = this.i;
        float f2 = this.j;
        float f3 = this.h;
        float f4 = this.g;
        long j2 = this.b;
        float f5 = this.d;
        float f6 = this.e;
        long j3 = this.c;
        long j4 = this.f;
        return "CollectTasteRatingOverlayAnimationConfig(scaleDuration=" + j + ", scaleFromX=" + f + ", scaleToX=" + f2 + ", scaleFromY=" + f3 + ", scaleToY=" + f4 + ", alphaDuration=" + j2 + ", alphaFrom=" + f5 + ", alphaTo=" + f6 + ", alphaStartOffset=" + j3 + ", startOffset=" + j4 + ")";
    }

    public C3536bBm(long j, float f, float f2, float f3, float f4, long j2, float f5, float f6, long j3, long j4) {
        this.a = j;
        this.i = f;
        this.j = f2;
        this.h = f3;
        this.g = f4;
        this.b = j2;
        this.d = f5;
        this.e = f6;
        this.c = j3;
        this.f = j4;
    }
}
