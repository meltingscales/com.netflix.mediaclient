package o;

/* renamed from: o.bMi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C3833bMi implements InterfaceC1905aSp {
    private C1907aSr d;
    private int e;

    @Override // o.InterfaceC1905aSp
    public C1907aSr a() {
        return this.d;
    }

    @Override // o.InterfaceC1905aSp
    public Runnable c() {
        return null;
    }

    @Override // o.InterfaceC1905aSp
    public int d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3833bMi(C1907aSr c1907aSr) {
        this(0, c1907aSr);
    }

    C3833bMi(int i, C1907aSr c1907aSr) {
        this.e = i;
        this.d = c1907aSr;
    }
}
