package o;

/* renamed from: o.dDp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7740dDp extends dDW<Integer, int[], C7739dDo> {
    public static final C7740dDp b = new C7740dDp();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: b */
    public int[] a() {
        return new int[0];
    }

    private C7740dDp() {
        super(C7706dCi.e(C8634dsw.d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: c */
    public int d(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: e */
    public C7739dDo b(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        return new C7739dDo(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    /* renamed from: c */
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, C7739dDo c7739dDo, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) c7739dDo, "");
        c7739dDo.b(interfaceC7717dCt.j(e(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: b */
    public void d(InterfaceC7719dCv interfaceC7719dCv, int[] iArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) iArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.c(e(), i2, iArr[i2]);
        }
    }
}
