package o;

/* renamed from: o.czK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC7600czK implements InterfaceC1905aSp {
    private int b;
    private C1907aSr c;

    @Override // o.InterfaceC1905aSp
    public C1907aSr a() {
        return this.c;
    }

    @Override // o.InterfaceC1905aSp
    public Runnable c() {
        return null;
    }

    @Override // o.InterfaceC1905aSp
    public int d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7600czK(C1907aSr c1907aSr) {
        this(0, c1907aSr);
    }

    AbstractC7600czK(int i, C1907aSr c1907aSr) {
        this.b = i;
        this.c = c1907aSr;
    }
}
