package o;

/* renamed from: o.dDf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7730dDf extends dDW<Float, float[], C7729dDe> {
    public static final C7730dDf e = new C7730dDf();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: c */
    public float[] a() {
        return new float[0];
    }

    private C7730dDf() {
        super(C7706dCi.a(C8626dso.e));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: c */
    public int d(float[] fArr) {
        C8632dsu.c((Object) fArr, "");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: e */
    public C7729dDe b(float[] fArr) {
        C8632dsu.c((Object) fArr, "");
        return new C7729dDe(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    /* renamed from: c */
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, C7729dDe c7729dDe, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) c7729dDe, "");
        c7729dDe.c(interfaceC7717dCt.e(e(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: b */
    public void d(InterfaceC7719dCv interfaceC7719dCv, float[] fArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) fArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.d(e(), i2, fArr[i2]);
        }
    }
}
