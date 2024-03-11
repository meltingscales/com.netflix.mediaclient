package o;

import java.util.Arrays;

/* renamed from: o.dEw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7774dEw extends dDX<dpP> {
    private short[] c;
    private int e;

    public /* synthetic */ C7774dEw(short[] sArr, C8627dsp c8627dsp) {
        this(sArr);
    }

    @Override // o.dDX
    public int e() {
        return this.e;
    }

    @Override // o.dDX
    public /* synthetic */ dpP a() {
        return dpP.a(d());
    }

    private C7774dEw(short[] sArr) {
        C8632dsu.c((Object) sArr, "");
        this.c = sArr;
        this.e = dpP.c(sArr);
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        if (dpP.c(this.c) < i) {
            short[] sArr = this.c;
            b = C8657dts.b(i, dpP.c(sArr) * 2);
            short[] copyOf = Arrays.copyOf(sArr, b);
            C8632dsu.a(copyOf, "");
            this.c = dpP.e(copyOf);
        }
    }

    public final void c(short s) {
        dDX.d(this, 0, 1, null);
        short[] sArr = this.c;
        int e = e();
        this.e = e + 1;
        dpP.b(sArr, e, s);
    }

    public short[] d() {
        short[] copyOf = Arrays.copyOf(this.c, e());
        C8632dsu.a(copyOf, "");
        return dpP.e(copyOf);
    }
}
