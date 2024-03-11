package o;

import java.util.Arrays;

/* renamed from: o.dEq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7768dEq extends dDX<dpK> {
    private int b;
    private long[] d;

    public /* synthetic */ C7768dEq(long[] jArr, C8627dsp c8627dsp) {
        this(jArr);
    }

    @Override // o.dDX
    public int e() {
        return this.b;
    }

    @Override // o.dDX
    public /* synthetic */ dpK a() {
        return dpK.c(c());
    }

    private C7768dEq(long[] jArr) {
        C8632dsu.c((Object) jArr, "");
        this.d = jArr;
        this.b = dpK.b(jArr);
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        if (dpK.b(this.d) < i) {
            long[] jArr = this.d;
            b = C8657dts.b(i, dpK.b(jArr) * 2);
            long[] copyOf = Arrays.copyOf(jArr, b);
            C8632dsu.a(copyOf, "");
            this.d = dpK.d(copyOf);
        }
    }

    public final void e(long j) {
        dDX.d(this, 0, 1, null);
        long[] jArr = this.d;
        int e = e();
        this.b = e + 1;
        dpK.c(jArr, e, j);
    }

    public long[] c() {
        long[] copyOf = Arrays.copyOf(this.d, e());
        C8632dsu.a(copyOf, "");
        return dpK.d(copyOf);
    }
}
