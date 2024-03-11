package o;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class dCE extends dDX<boolean[]> {
    private boolean[] a;
    private int c;

    @Override // o.dDX
    public int e() {
        return this.c;
    }

    public dCE(boolean[] zArr) {
        C8632dsu.c((Object) zArr, "");
        this.a = zArr;
        this.c = zArr.length;
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            b = C8657dts.b(i, zArr.length * 2);
            boolean[] copyOf = Arrays.copyOf(zArr, b);
            C8632dsu.a(copyOf, "");
            this.a = copyOf;
        }
    }

    public final void d(boolean z) {
        dDX.d(this, 0, 1, null);
        boolean[] zArr = this.a;
        int e = e();
        this.c = e + 1;
        zArr[e] = z;
    }

    @Override // o.dDX
    /* renamed from: b */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.a, e());
        C8632dsu.a(copyOf, "");
        return copyOf;
    }
}
