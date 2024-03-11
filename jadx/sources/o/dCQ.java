package o;

/* loaded from: classes5.dex */
public final class dCQ extends dDW<Character, char[], dCI> {
    public static final dCQ d = new dCQ();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: c */
    public char[] a() {
        return new char[0];
    }

    private dCQ() {
        super(C7706dCi.d(C8625dsn.d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: a */
    public int d(char[] cArr) {
        C8632dsu.c((Object) cArr, "");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: d */
    public dCI b(char[] cArr) {
        C8632dsu.c((Object) cArr, "");
        return new dCI(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dCU, o.AbstractC7718dCu
    /* renamed from: e */
    public void b(InterfaceC7717dCt interfaceC7717dCt, int i, dCI dci, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) dci, "");
        dci.a(interfaceC7717dCt.c(e(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dDW
    /* renamed from: b */
    public void d(InterfaceC7719dCv interfaceC7719dCv, char[] cArr, int i) {
        C8632dsu.c((Object) interfaceC7719dCv, "");
        C8632dsu.c((Object) cArr, "");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7719dCv.a(e(), i2, cArr[i2]);
        }
    }
}
