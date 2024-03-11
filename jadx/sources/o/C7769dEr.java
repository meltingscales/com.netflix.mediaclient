package o;

/* renamed from: o.dEr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7769dEr extends dDW<dpJ, dpN, C7765dEn> {
    public static final C7769dEr a = new C7769dEr();

    @Override // o.dDW
    public /* synthetic */ dpN a() {
        return dpN.d(b());
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object b(Object obj) {
        return a(((dpN) obj).a());
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ int d(Object obj) {
        return d(((dpN) obj).a());
    }

    @Override // o.dDW
    public /* synthetic */ void d(InterfaceC7719dCv interfaceC7719dCv, dpN dpn, int i) {
        b(interfaceC7719dCv, dpn.a(), i);
    }

    private C7769dEr() {
        super(C7706dCi.c(dpJ.b));
    }

    protected int d(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        return dpN.a(iArr);
    }

    protected C7765dEn a(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        return new C7765dEn(iArr, null);
    }

    protected int[] b() {
        return dpN.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    /* renamed from: d */
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, C7765dEn c7765dEn, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) c7765dEn, "");
        c7765dEn.a(dpJ.c(interfaceC7717dCt.f(e(), i).f()));
    }

    protected void b(InterfaceC7719dCv interfaceC7719dCv, int[] iArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) iArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.d(e(), i2).b(dpN.e(iArr, i2));
        }
    }
}
