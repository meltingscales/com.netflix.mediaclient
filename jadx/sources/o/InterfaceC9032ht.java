package o;

import o.C8632dsu;
import o.C8959gZ;
import o.C9030hr;
import o.InterfaceC9032ht;

/* renamed from: o.ht  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9032ht {
    public static final c j = c.b;
    public static final InterfaceC9032ht h = C9030hr.a;

    /* renamed from: o.ht$b */
    /* loaded from: classes2.dex */
    public interface b<E extends e> {
    }

    <R> R a(R r, drX<? super R, ? super e, ? extends R> drx);

    InterfaceC9032ht c(b<?> bVar);

    <E extends e> E d(b<E> bVar);

    default InterfaceC9032ht d(InterfaceC9032ht interfaceC9032ht) {
        C8632dsu.c((Object) interfaceC9032ht, "");
        return interfaceC9032ht == C9030hr.a ? this : (InterfaceC9032ht) interfaceC9032ht.a(this, new drX<InterfaceC9032ht, e, InterfaceC9032ht>() { // from class: com.apollographql.apollo3.api.ExecutionContext$plus$1
            @Override // o.drX
            /* renamed from: e */
            public final InterfaceC9032ht invoke(InterfaceC9032ht interfaceC9032ht2, InterfaceC9032ht.e eVar) {
                C8632dsu.c((Object) interfaceC9032ht2, "");
                C8632dsu.c((Object) eVar, "");
                InterfaceC9032ht c2 = interfaceC9032ht2.c(eVar.a());
                return c2 == C9030hr.a ? eVar : new C8959gZ(c2, eVar);
            }
        });
    }

    /* renamed from: o.ht$e */
    /* loaded from: classes2.dex */
    public interface e extends InterfaceC9032ht {
        b<?> a();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC9032ht
        default <E extends e> E d(b<E> bVar) {
            C8632dsu.c((Object) bVar, "");
            if (C8632dsu.c(a(), bVar)) {
                C8632dsu.d(this);
                return this;
            }
            return null;
        }

        @Override // o.InterfaceC9032ht
        default <R> R a(R r, drX<? super R, ? super e, ? extends R> drx) {
            C8632dsu.c((Object) drx, "");
            return drx.invoke(r, this);
        }

        @Override // o.InterfaceC9032ht
        default InterfaceC9032ht c(b<?> bVar) {
            C8632dsu.c((Object) bVar, "");
            return C8632dsu.c(a(), bVar) ? C9030hr.a : this;
        }
    }

    /* renamed from: o.ht$c */
    /* loaded from: classes2.dex */
    public static final class c {
        static final /* synthetic */ c b = new c();

        private c() {
        }
    }
}
