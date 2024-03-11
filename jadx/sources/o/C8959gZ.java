package o;

import o.InterfaceC9032ht;

/* renamed from: o.gZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8959gZ implements InterfaceC9032ht {
    private final InterfaceC9032ht a;
    private final InterfaceC9032ht.e b;

    public C8959gZ(InterfaceC9032ht interfaceC9032ht, InterfaceC9032ht.e eVar) {
        C8632dsu.c((Object) interfaceC9032ht, "");
        C8632dsu.c((Object) eVar, "");
        this.a = interfaceC9032ht;
        this.b = eVar;
    }

    @Override // o.InterfaceC9032ht
    public <E extends InterfaceC9032ht.e> E d(InterfaceC9032ht.b<E> bVar) {
        C8632dsu.c((Object) bVar, "");
        C8959gZ c8959gZ = this;
        while (true) {
            E e = (E) c8959gZ.b.d(bVar);
            if (e != null) {
                return e;
            }
            InterfaceC9032ht interfaceC9032ht = c8959gZ.a;
            if (interfaceC9032ht instanceof C8959gZ) {
                c8959gZ = (C8959gZ) interfaceC9032ht;
            } else {
                return (E) interfaceC9032ht.d(bVar);
            }
        }
    }

    @Override // o.InterfaceC9032ht
    public <R> R a(R r, drX<? super R, ? super InterfaceC9032ht.e, ? extends R> drx) {
        C8632dsu.c((Object) drx, "");
        return drx.invoke((Object) this.a.a(r, drx), this.b);
    }

    @Override // o.InterfaceC9032ht
    public InterfaceC9032ht c(InterfaceC9032ht.b<?> bVar) {
        C8632dsu.c((Object) bVar, "");
        if (this.b.d((InterfaceC9032ht.b<InterfaceC9032ht.e>) bVar) != null) {
            return this.a;
        }
        InterfaceC9032ht c = this.a.c(bVar);
        return c == this.a ? this : c == C9030hr.a ? this.b : new C8959gZ(c, this.b);
    }
}
