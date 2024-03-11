package o;

/* renamed from: o.cdG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6432cdG {
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    public final float b() {
        return this.c;
    }

    public final float d() {
        return this.e;
    }

    public final float e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6432cdG) {
            C6432cdG c6432cdG = (C6432cdG) obj;
            return Float.compare(this.b, c6432cdG.b) == 0 && Float.compare(this.e, c6432cdG.e) == 0 && Float.compare(this.c, c6432cdG.c) == 0 && Float.compare(this.d, c6432cdG.d) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.b) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        float f = this.b;
        float f2 = this.e;
        float f3 = this.c;
        float f4 = this.d;
        return "HSBComponents(hue=" + f + ", saturation=" + f2 + ", brightness=" + f3 + ", alpha=" + f4 + ")";
    }

    public C6432cdG(float f, float f2, float f3, float f4) {
        this.b = f;
        this.e = f2;
        this.c = f3;
        this.d = f4;
    }
}
