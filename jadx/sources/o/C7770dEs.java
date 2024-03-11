package o;

/* renamed from: o.dEs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7770dEs extends dDW<dpL, dpK, C7768dEq> {
    public static final C7770dEs d = new C7770dEs();

    @Override // o.dDW
    public /* synthetic */ dpK a() {
        return dpK.c(b());
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object b(Object obj) {
        return e(((dpK) obj).c());
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ int d(Object obj) {
        return d(((dpK) obj).c());
    }

    @Override // o.dDW
    public /* synthetic */ void d(InterfaceC7719dCv interfaceC7719dCv, dpK dpk, int i) {
        c(interfaceC7719dCv, dpk.c(), i);
    }

    private C7770dEs() {
        super(C7706dCi.a(dpL.c));
    }

    protected int d(long[] jArr) {
        C8632dsu.c((Object) jArr, "");
        return dpK.b(jArr);
    }

    protected C7768dEq e(long[] jArr) {
        C8632dsu.c((Object) jArr, "");
        return new C7768dEq(jArr, null);
    }

    protected long[] b() {
        return dpK.c(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    /* renamed from: e */
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, C7768dEq c7768dEq, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) c7768dEq, "");
        c7768dEq.e(dpL.b(interfaceC7717dCt.f(e(), i).j()));
    }

    protected void c(InterfaceC7719dCv interfaceC7719dCv, long[] jArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) jArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.d(e(), i2).e(dpK.e(jArr, i2));
        }
    }
}
