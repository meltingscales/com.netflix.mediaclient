package o;

/* renamed from: o.dEk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7762dEk extends dDW<dpF, dpI, C7766dEo> {
    public static final C7762dEk b = new C7762dEk();

    @Override // o.dDW
    public /* synthetic */ dpI a() {
        return dpI.d(c());
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object b(Object obj) {
        return b(((dpI) obj).d());
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ int d(Object obj) {
        return a(((dpI) obj).d());
    }

    @Override // o.dDW
    public /* synthetic */ void d(InterfaceC7719dCv interfaceC7719dCv, dpI dpi, int i) {
        a(interfaceC7719dCv, dpi.d(), i);
    }

    private C7762dEk() {
        super(C7706dCi.d(dpF.c));
    }

    protected int a(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        return dpI.b(bArr);
    }

    protected C7766dEo b(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        return new C7766dEo(bArr, null);
    }

    protected byte[] c() {
        return dpI.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, C7766dEo c7766dEo, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) c7766dEo, "");
        c7766dEo.a(dpF.a(interfaceC7717dCt.f(e(), i).a()));
    }

    protected void a(InterfaceC7719dCv interfaceC7719dCv, byte[] bArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) bArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.d(e(), i2).b(dpI.e(bArr, i2));
        }
    }
}
