package o;

import java.util.Arrays;

/* renamed from: o.dEd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7755dEd extends dDX<short[]> {
    private short[] d;
    private int e;

    @Override // o.dDX
    public int e() {
        return this.e;
    }

    public C7755dEd(short[] sArr) {
        C8632dsu.c((Object) sArr, "");
        this.d = sArr;
        this.e = sArr.length;
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        short[] sArr = this.d;
        if (sArr.length < i) {
            b = C8657dts.b(i, sArr.length * 2);
            short[] copyOf = Arrays.copyOf(sArr, b);
            C8632dsu.a(copyOf, "");
            this.d = copyOf;
        }
    }

    public final void a(short s) {
        dDX.d(this, 0, 1, null);
        short[] sArr = this.d;
        int e = e();
        this.e = e + 1;
        sArr[e] = s;
    }

    @Override // o.dDX
    /* renamed from: c */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.d, e());
        C8632dsu.a(copyOf, "");
        return copyOf;
    }
}
