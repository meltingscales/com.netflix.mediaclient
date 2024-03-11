package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dFB extends AbstractC7781dFc {
    private final dEB b;
    private final int d;
    private int e;

    @Override // o.InterfaceC7717dCt
    public int h(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        int i = this.e;
        if (i < this.d - 1) {
            int i2 = i + 1;
            this.e = i2;
            return i2;
        }
        return -1;
    }

    @Override // o.AbstractC7781dFc
    /* renamed from: s */
    public dEB r() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dFB(AbstractC7773dEv abstractC7773dEv, dEB deb) {
        super(abstractC7773dEv, deb, null);
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) deb, "");
        this.b = deb;
        this.d = r().size();
        this.e = -1;
    }

    @Override // o.dDG
    public String o(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return String.valueOf(i);
    }

    @Override // o.AbstractC7781dFc
    protected dEI c(String str) {
        C8632dsu.c((Object) str, "");
        return r().get(Integer.parseInt(str));
    }
}
