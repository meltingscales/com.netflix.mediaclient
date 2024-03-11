package o;

/* loaded from: classes5.dex */
public final class dCG extends dDW<Byte, byte[], dCF> {
    public static final dCG d = new dCG();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: c */
    public byte[] a() {
        return new byte[0];
    }

    private dCG() {
        super(C7706dCi.a(C8623dsl.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    public int d(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    public dCF b(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        return new dCF(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    /* renamed from: d */
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, dCF dcf, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) dcf, "");
        dcf.e(interfaceC7717dCt.d(e(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: c */
    public void d(InterfaceC7719dCv interfaceC7719dCv, byte[] bArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) bArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.e(e(), i2, bArr[i2]);
        }
    }
}
