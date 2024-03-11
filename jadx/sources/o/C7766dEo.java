package o;

import java.util.Arrays;

/* renamed from: o.dEo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7766dEo extends dDX<dpI> {
    private byte[] a;
    private int b;

    public /* synthetic */ C7766dEo(byte[] bArr, C8627dsp c8627dsp) {
        this(bArr);
    }

    @Override // o.dDX
    public int e() {
        return this.b;
    }

    @Override // o.dDX
    public /* synthetic */ dpI a() {
        return dpI.d(b());
    }

    private C7766dEo(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        this.a = bArr;
        this.b = dpI.b(bArr);
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        if (dpI.b(this.a) < i) {
            byte[] bArr = this.a;
            b = C8657dts.b(i, dpI.b(bArr) * 2);
            byte[] copyOf = Arrays.copyOf(bArr, b);
            C8632dsu.a(copyOf, "");
            this.a = dpI.c(copyOf);
        }
    }

    public final void a(byte b) {
        dDX.d(this, 0, 1, null);
        byte[] bArr = this.a;
        int e = e();
        this.b = e + 1;
        dpI.a(bArr, e, b);
    }

    public byte[] b() {
        byte[] copyOf = Arrays.copyOf(this.a, e());
        C8632dsu.a(copyOf, "");
        return dpI.c(copyOf);
    }
}
