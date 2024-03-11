package o;

import java.util.Arrays;

/* renamed from: o.dDo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7739dDo extends dDX<int[]> {
    private int b;
    private int[] e;

    @Override // o.dDX
    public int e() {
        return this.b;
    }

    public C7739dDo(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        this.e = iArr;
        this.b = iArr.length;
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        int[] iArr = this.e;
        if (iArr.length < i) {
            b = C8657dts.b(i, iArr.length * 2);
            int[] copyOf = Arrays.copyOf(iArr, b);
            C8632dsu.a(copyOf, "");
            this.e = copyOf;
        }
    }

    public final void b(int i) {
        dDX.d(this, 0, 1, null);
        int[] iArr = this.e;
        int e = e();
        this.b = e + 1;
        iArr[e] = i;
    }

    @Override // o.dDX
    /* renamed from: b */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.e, e());
        C8632dsu.a(copyOf, "");
        return copyOf;
    }
}
