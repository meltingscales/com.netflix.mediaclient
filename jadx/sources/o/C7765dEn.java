package o;

import java.util.Arrays;

/* renamed from: o.dEn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7765dEn extends dDX<dpN> {
    private int[] a;
    private int d;

    public /* synthetic */ C7765dEn(int[] iArr, C8627dsp c8627dsp) {
        this(iArr);
    }

    @Override // o.dDX
    public int e() {
        return this.d;
    }

    @Override // o.dDX
    public /* synthetic */ dpN a() {
        return dpN.d(b());
    }

    private C7765dEn(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        this.a = iArr;
        this.d = dpN.a(iArr);
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        if (dpN.a(this.a) < i) {
            int[] iArr = this.a;
            b = C8657dts.b(i, dpN.a(iArr) * 2);
            int[] copyOf = Arrays.copyOf(iArr, b);
            C8632dsu.a(copyOf, "");
            this.a = dpN.b(copyOf);
        }
    }

    public final void a(int i) {
        dDX.d(this, 0, 1, null);
        int[] iArr = this.a;
        int e = e();
        this.d = e + 1;
        dpN.b(iArr, e, i);
    }

    public int[] b() {
        int[] copyOf = Arrays.copyOf(this.a, e());
        C8632dsu.a(copyOf, "");
        return dpN.b(copyOf);
    }
}
