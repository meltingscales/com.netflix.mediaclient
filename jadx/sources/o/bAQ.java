package o;

/* loaded from: classes4.dex */
public final class bAQ {
    private final float a;
    private final long b;
    private final float c;
    private final float d;
    private final long e;
    private final float j;

    public final float a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final long d() {
        return this.e;
    }

    public final float e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bAQ) {
            bAQ baq = (bAQ) obj;
            return this.e == baq.e && this.b == baq.b && Float.compare(this.c, baq.c) == 0 && Float.compare(this.a, baq.a) == 0 && Float.compare(this.j, baq.j) == 0 && Float.compare(this.d, baq.d) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.e) * 31) + Long.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.a)) * 31) + Float.hashCode(this.j)) * 31) + Float.hashCode(this.d);
    }

    public final float i() {
        return this.j;
    }

    public String toString() {
        long j = this.e;
        long j2 = this.b;
        float f = this.c;
        float f2 = this.a;
        float f3 = this.j;
        float f4 = this.d;
        return "CollectTasteLolomoTitleCardAnimationConfig(duration=" + j + ", startOffset=" + j2 + ", scaleTo=" + f + ", translateXTo=" + f2 + ", translateYTo=" + f3 + ", rotateTo=" + f4 + ")";
    }

    public bAQ(long j, long j2, float f, float f2, float f3, float f4) {
        this.e = j;
        this.b = j2;
        this.c = f;
        this.a = f2;
        this.j = f3;
        this.d = f4;
    }
}
