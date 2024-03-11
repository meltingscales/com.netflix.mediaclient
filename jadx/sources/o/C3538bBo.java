package o;

/* renamed from: o.bBo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3538bBo {
    private final long a;
    private final long b;
    private final long c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final long i;
    private final float j;
    private final long k;
    private final long l;
    private final float m;
    private final float n;

    /* renamed from: o  reason: collision with root package name */
    private final long f13496o;

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    public final float e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3538bBo) {
            C3538bBo c3538bBo = (C3538bBo) obj;
            return this.c == c3538bBo.c && this.i == c3538bBo.i && Float.compare(this.h, c3538bBo.h) == 0 && Float.compare(this.j, c3538bBo.j) == 0 && Float.compare(this.g, c3538bBo.g) == 0 && Float.compare(this.f, c3538bBo.f) == 0 && this.a == c3538bBo.a && this.b == c3538bBo.b && Float.compare(this.d, c3538bBo.d) == 0 && Float.compare(this.e, c3538bBo.e) == 0 && this.k == c3538bBo.k && this.l == c3538bBo.l && Float.compare(this.m, c3538bBo.m) == 0 && Float.compare(this.n, c3538bBo.n) == 0 && this.f13496o == c3538bBo.f13496o;
        }
        return false;
    }

    public final long f() {
        return this.i;
    }

    public final float g() {
        return this.j;
    }

    public final float h() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Long.hashCode(this.c) * 31) + Long.hashCode(this.i)) * 31) + Float.hashCode(this.h)) * 31) + Float.hashCode(this.j)) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.f)) * 31) + Long.hashCode(this.a)) * 31) + Long.hashCode(this.b)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Long.hashCode(this.k)) * 31) + Long.hashCode(this.l)) * 31) + Float.hashCode(this.m)) * 31) + Float.hashCode(this.n)) * 31) + Long.hashCode(this.f13496o);
    }

    public final float i() {
        return this.h;
    }

    public final float j() {
        return this.f;
    }

    public final long k() {
        return this.l;
    }

    public final float l() {
        return this.m;
    }

    public final long m() {
        return this.f13496o;
    }

    public final float n() {
        return this.n;
    }

    public final long o() {
        return this.k;
    }

    public String toString() {
        long j = this.c;
        long j2 = this.i;
        float f = this.h;
        float f2 = this.j;
        float f3 = this.g;
        float f4 = this.f;
        long j3 = this.a;
        long j4 = this.b;
        float f5 = this.d;
        float f6 = this.e;
        long j5 = this.k;
        long j6 = this.l;
        float f7 = this.m;
        float f8 = this.n;
        long j7 = this.f13496o;
        return "CollectTasteRatingIndicationIconAnimationConfig(scaleDuration=" + j + ", scaleStartOffset=" + j2 + ", scaleFromX=" + f + ", scaleToX=" + f2 + ", scaleFromY=" + f3 + ", scaleToY=" + f4 + ", alphaDuration=" + j3 + ", alphaStartOffset=" + j4 + ", alphaFrom=" + f5 + ", alphaTo=" + f6 + ", translateDuration=" + j5 + ", translateStartOffset=" + j6 + ", translateFromX=" + f7 + ", translateToX=" + f8 + ", startOffset=" + j7 + ")";
    }

    public C3538bBo(long j, long j2, float f, float f2, float f3, float f4, long j3, long j4, float f5, float f6, long j5, long j6, float f7, float f8, long j7) {
        this.c = j;
        this.i = j2;
        this.h = f;
        this.j = f2;
        this.g = f3;
        this.f = f4;
        this.a = j3;
        this.b = j4;
        this.d = f5;
        this.e = f6;
        this.k = j5;
        this.l = j6;
        this.m = f7;
        this.n = f8;
        this.f13496o = j7;
    }

    public /* synthetic */ C3538bBo(long j, long j2, float f, float f2, float f3, float f4, long j3, long j4, float f5, float f6, long j5, long j6, float f7, float f8, long j7, int i, C8627dsp c8627dsp) {
        this(j, j2, f, f2, f3, f4, j3, j4, f5, f6, j5, j6, f7, f8, (i & 16384) != 0 ? 0L : j7);
    }
}
