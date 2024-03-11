package o;

/* renamed from: o.dEg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7758dEg extends dDW<Short, short[], C7755dEd> {
    public static final C7758dEg e = new C7758dEg();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: b */
    public short[] a() {
        return new short[0];
    }

    private C7758dEg() {
        super(C7706dCi.a(dsF.d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: a */
    public int d(short[] sArr) {
        C8632dsu.c((Object) sArr, "");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: d */
    public C7755dEd b(short[] sArr) {
        C8632dsu.c((Object) sArr, "");
        return new C7755dEd(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, C7755dEd c7755dEd, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) c7755dEd, "");
        c7755dEd.a(interfaceC7717dCt.g(e(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: b */
    public void d(InterfaceC7719dCv interfaceC7719dCv, short[] sArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) sArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.a(e(), i2, sArr[i2]);
        }
    }
}
