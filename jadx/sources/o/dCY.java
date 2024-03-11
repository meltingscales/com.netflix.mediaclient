package o;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class dCY extends dDX<double[]> {
    private double[] d;
    private int e;

    @Override // o.dDX
    public int e() {
        return this.e;
    }

    public dCY(double[] dArr) {
        C8632dsu.c((Object) dArr, "");
        this.d = dArr;
        this.e = dArr.length;
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        double[] dArr = this.d;
        if (dArr.length < i) {
            b = C8657dts.b(i, dArr.length * 2);
            double[] copyOf = Arrays.copyOf(dArr, b);
            C8632dsu.a(copyOf, "");
            this.d = copyOf;
        }
    }

    public final void b(double d) {
        dDX.d(this, 0, 1, null);
        double[] dArr = this.d;
        int e = e();
        this.e = e + 1;
        dArr[e] = d;
    }

    @Override // o.dDX
    /* renamed from: c */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.d, e());
        C8632dsu.a(copyOf, "");
        return copyOf;
    }
}
