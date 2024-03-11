package o;

/* renamed from: o.bBn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3537bBn {
    private final long a;
    private final float b;
    private final float c;
    private final long d;
    private final float e;
    private final float i;

    public final float a() {
        return this.c;
    }

    public final float b() {
        return this.e;
    }

    public final long c() {
        return this.d;
    }

    public final float d() {
        return this.b;
    }

    public final long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3537bBn) {
            C3537bBn c3537bBn = (C3537bBn) obj;
            return Float.compare(this.e, c3537bBn.e) == 0 && Float.compare(this.c, c3537bBn.c) == 0 && this.a == c3537bBn.a && Float.compare(this.b, c3537bBn.b) == 0 && Float.compare(this.i, c3537bBn.i) == 0 && this.d == c3537bBn.d;
        }
        return false;
    }

    public final float h() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.e) * 31) + Float.hashCode(this.c)) * 31) + Long.hashCode(this.a)) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.i)) * 31) + Long.hashCode(this.d);
    }

    public String toString() {
        float f = this.e;
        float f2 = this.c;
        long j = this.a;
        float f3 = this.b;
        float f4 = this.i;
        long j2 = this.d;
        return "CollectTasteRatingTitleCardAnimationConfig(rotateFromDegrees=" + f + ", rotateToDegrees=" + f2 + ", duration=" + j + ", translateFromXValue=" + f3 + ", translateToXValue=" + f4 + ", startOffset=" + j2 + ")";
    }

    public C3537bBn(float f, float f2, long j, float f3, float f4, long j2) {
        this.e = f;
        this.c = f2;
        this.a = j;
        this.b = f3;
        this.i = f4;
        this.d = j2;
    }
}
