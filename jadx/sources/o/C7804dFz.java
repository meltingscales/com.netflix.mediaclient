package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dFz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7804dFz extends AbstractC7781dFc {
    private final dEI b;

    @Override // o.InterfaceC7717dCt
    public int h(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return 0;
    }

    @Override // o.AbstractC7781dFc
    public dEI r() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7804dFz(AbstractC7773dEv abstractC7773dEv, dEI dei) {
        super(abstractC7773dEv, dei, null);
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) dei, "");
        this.b = dei;
        n((C7804dFz) "primitive");
    }

    @Override // o.AbstractC7781dFc
    protected dEI c(String str) {
        C8632dsu.c((Object) str, "");
        if (str != "primitive") {
            throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
        }
        return r();
    }
}
