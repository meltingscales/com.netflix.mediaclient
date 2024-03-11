package o;

import o.AbstractC6729cim;

/* loaded from: classes5.dex */
public final class cYJ implements InterfaceC4732bk<C6736cit, AbstractC6729cim.b> {
    private final InterfaceC4732bk<C6736cit, AbstractC6729cim.b> b;
    private final InterfaceC4732bk<C6736cit, AbstractC6729cim.b> c;
    private final boolean d;

    public cYJ(boolean z, InterfaceC4732bk<C6736cit, AbstractC6729cim.b> interfaceC4732bk, InterfaceC4732bk<C6736cit, AbstractC6729cim.b> interfaceC4732bk2) {
        C8632dsu.c((Object) interfaceC4732bk, "");
        C8632dsu.c((Object) interfaceC4732bk2, "");
        this.d = z;
        this.c = interfaceC4732bk;
        this.b = interfaceC4732bk2;
    }

    @Override // o.InterfaceC4732bk
    /* renamed from: e */
    public void b(C6736cit c6736cit, AbstractC6729cim.b bVar, int i) {
        if (this.d) {
            this.c.b(c6736cit, bVar, i);
        }
        this.b.b(c6736cit, bVar, i);
    }
}
