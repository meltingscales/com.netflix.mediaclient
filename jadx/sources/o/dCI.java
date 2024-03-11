package o;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class dCI extends dDX<char[]> {
    private int a;
    private char[] c;

    @Override // o.dDX
    public int e() {
        return this.a;
    }

    public dCI(char[] cArr) {
        C8632dsu.c((Object) cArr, "");
        this.c = cArr;
        this.a = cArr.length;
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        char[] cArr = this.c;
        if (cArr.length < i) {
            b = C8657dts.b(i, cArr.length * 2);
            char[] copyOf = Arrays.copyOf(cArr, b);
            C8632dsu.a(copyOf, "");
            this.c = copyOf;
        }
    }

    public final void a(char c) {
        dDX.d(this, 0, 1, null);
        char[] cArr = this.c;
        int e = e();
        this.a = e + 1;
        cArr[e] = c;
    }

    @Override // o.dDX
    /* renamed from: b */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.c, e());
        C8632dsu.a(copyOf, "");
        return copyOf;
    }
}
