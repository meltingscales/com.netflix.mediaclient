package o;

/* renamed from: o.dDw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7747dDw extends dDW<Long, long[], C7750dDz> {
    public static final C7747dDw b = new C7747dDw();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: b */
    public long[] a() {
        return new long[0];
    }

    private C7747dDw() {
        super(C7706dCi.b(dsB.d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: e */
    public int d(long[] jArr) {
        C8632dsu.c((Object) jArr, "");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: a */
    public C7750dDz b(long[] jArr) {
        C8632dsu.c((Object) jArr, "");
        return new C7750dDz(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    /* renamed from: d */
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, C7750dDz c7750dDz, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) c7750dDz, "");
        c7750dDz.d(interfaceC7717dCt.i(e(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: b */
    public void d(InterfaceC7719dCv interfaceC7719dCv, long[] jArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) jArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.b(e(), i2, jArr[i2]);
        }
    }
}
