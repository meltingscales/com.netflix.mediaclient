package o;

/* renamed from: o.dtj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8648dtj implements InterfaceC8650dtl<Float> {
    private final float b;
    private final float d;

    public boolean a(float f) {
        return f >= this.b && f <= this.d;
    }

    public boolean d(float f, float f2) {
        return f <= f2;
    }

    @Override // o.InterfaceC8650dtl
    public boolean e() {
        return this.b > this.d;
    }

    public C8648dtj(float f, float f2) {
        this.b = f;
        this.d = f2;
    }

    @Override // o.InterfaceC8650dtl
    public /* synthetic */ boolean d(Float f, Float f2) {
        return d(f.floatValue(), f2.floatValue());
    }

    @Override // o.InterfaceC8650dtl
    public /* synthetic */ boolean e(Float f) {
        return a(f.floatValue());
    }

    @Override // o.InterfaceC8649dtk
    /* renamed from: c */
    public Float h() {
        return Float.valueOf(this.b);
    }

    @Override // o.InterfaceC8649dtk
    /* renamed from: a */
    public Float g() {
        return Float.valueOf(this.d);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8648dtj) {
            if (!e() || !((C8648dtj) obj).e()) {
                C8648dtj c8648dtj = (C8648dtj) obj;
                if (this.b != c8648dtj.b || this.d != c8648dtj.d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (e()) {
            return -1;
        }
        return (Float.hashCode(this.b) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        return this.b + ".." + this.d;
    }
}
