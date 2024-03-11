package o;

import java.util.Arrays;

/* renamed from: o.dDz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7750dDz extends dDX<long[]> {
    private int c;
    private long[] d;

    @Override // o.dDX
    public int e() {
        return this.c;
    }

    public C7750dDz(long[] jArr) {
        C8632dsu.c((Object) jArr, "");
        this.d = jArr;
        this.c = jArr.length;
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        long[] jArr = this.d;
        if (jArr.length < i) {
            b = C8657dts.b(i, jArr.length * 2);
            long[] copyOf = Arrays.copyOf(jArr, b);
            C8632dsu.a(copyOf, "");
            this.d = copyOf;
        }
    }

    public final void d(long j) {
        dDX.d(this, 0, 1, null);
        long[] jArr = this.d;
        int e = e();
        this.c = e + 1;
        jArr[e] = j;
    }

    @Override // o.dDX
    /* renamed from: b */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.d, e());
        C8632dsu.a(copyOf, "");
        return copyOf;
    }
}
