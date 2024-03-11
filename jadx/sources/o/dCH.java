package o;

/* loaded from: classes5.dex */
public final class dCH extends dDW<Boolean, boolean[], dCE> {
    public static final dCH a = new dCH();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: b */
    public boolean[] a() {
        return new boolean[0];
    }

    private dCH() {
        super(C7706dCi.d(C8624dsm.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: e */
    public int d(boolean[] zArr) {
        C8632dsu.c((Object) zArr, "");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: a */
    public dCE b(boolean[] zArr) {
        C8632dsu.c((Object) zArr, "");
        return new dCE(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    /* renamed from: d */
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, dCE dce, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) dce, "");
        dce.d(interfaceC7717dCt.a(e(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: e */
    public void d(InterfaceC7719dCv interfaceC7719dCv, boolean[] zArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) zArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.d(e(), i2, zArr[i2]);
        }
    }
}
