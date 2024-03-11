package o;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class dCF extends dDX<byte[]> {
    private int b;
    private byte[] e;

    @Override // o.dDX
    public int e() {
        return this.b;
    }

    public dCF(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        this.e = bArr;
        this.b = bArr.length;
        d(10);
    }

    @Override // o.dDX
    public void d(int i) {
        int b;
        byte[] bArr = this.e;
        if (bArr.length < i) {
            b = C8657dts.b(i, bArr.length * 2);
            byte[] copyOf = Arrays.copyOf(bArr, b);
            C8632dsu.a(copyOf, "");
            this.e = copyOf;
        }
    }

    public final void e(byte b) {
        dDX.d(this, 0, 1, null);
        byte[] bArr = this.e;
        int e = e();
        this.b = e + 1;
        bArr[e] = b;
    }

    @Override // o.dDX
    /* renamed from: b */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.e, e());
        C8632dsu.a(copyOf, "");
        return copyOf;
    }
}
