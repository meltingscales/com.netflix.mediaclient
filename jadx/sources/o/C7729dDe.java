package o;

import java.util.Arrays;

/* renamed from: o.dDe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7729dDe extends dDX<float[]> {
    private float[] b;
    private int e;

    @Override // o.dDX
    public int e() {
        return this.e;
    }

    public C7729dDe(float[] fArr) {
        C8632dsu.c((Object) fArr, "");
        this.b = fArr;
        this.e = fArr.length;
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        float[] fArr = this.b;
        if (fArr.length < i) {
            b = C8657dts.b(i, fArr.length * 2);
            float[] copyOf = Arrays.copyOf(fArr, b);
            C8632dsu.a(copyOf, "");
            this.b = copyOf;
        }
    }

    public final void c(float f) {
        dDX.d(this, 0, 1, null);
        float[] fArr = this.b;
        int e = e();
        this.e = e + 1;
        fArr[e] = f;
    }

    @Override // o.dDX
    /* renamed from: c */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.b, e());
        C8632dsu.a(copyOf, "");
        return copyOf;
    }
}
