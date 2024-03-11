package o;

/* renamed from: o.dEu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7772dEu extends dDW<dpO, dpP, C7774dEw> {
    public static final C7772dEu d = new C7772dEu();

    @Override // o.dDW
    public /* synthetic */ dpP a() {
        return dpP.a(b());
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object b(Object obj) {
        return d(((dpP) obj).a());
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ int d(Object obj) {
        return a(((dpP) obj).a());
    }

    @Override // o.dDW
    public /* synthetic */ void d(InterfaceC7719dCv interfaceC7719dCv, dpP dpp, int i) {
        e(interfaceC7719dCv, dpp.a(), i);
    }

    private C7772dEu() {
        super(C7706dCi.d(dpO.d));
    }

    protected int a(short[] sArr) {
        C8632dsu.c((Object) sArr, "");
        return dpP.c(sArr);
    }

    protected C7774dEw d(short[] sArr) {
        C8632dsu.c((Object) sArr, "");
        return new C7774dEw(sArr, null);
    }

    protected short[] b() {
        return dpP.a(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    /* renamed from: e */
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, C7774dEw c7774dEw, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) c7774dEw, "");
        c7774dEw.c(dpO.c(interfaceC7717dCt.f(e(), i).o()));
    }

    protected void e(InterfaceC7719dCv interfaceC7719dCv, short[] sArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) sArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.d(e(), i2).d(dpP.c(sArr, i2));
        }
    }
}
