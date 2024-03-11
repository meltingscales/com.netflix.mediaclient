package o;

/* renamed from: o.dDa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7725dDa extends dDW<Double, double[], dCY> {
    public static final C7725dDa a = new C7725dDa();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: b */
    public double[] a() {
        return new double[0];
    }

    private C7725dDa() {
        super(C7706dCi.e(C8629dsr.e));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: a */
    public int d(double[] dArr) {
        C8632dsu.c((Object) dArr, "");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    public dCY b(double[] dArr) {
        C8632dsu.c((Object) dArr, "");
        return new dCY(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    /* renamed from: d */
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, dCY dcy, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) dcy, "");
        dcy.b(interfaceC7717dCt.b(e(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: a */
    public void d(InterfaceC7719dCv interfaceC7719dCv, double[] dArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) dArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.e(e(), i2, dArr[i2]);
        }
    }
}
