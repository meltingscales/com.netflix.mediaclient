package o;

import com.apollographql.apollo3.exception.ApolloException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.InterfaceC8991hE;
import o.InterfaceC8991hE.b;

/* renamed from: o.gU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8954gU<D extends InterfaceC8991hE.b> {
    public final ApolloException a;
    public final Map<String, Object> b;
    public final InterfaceC9032ht c;
    public final D d;
    public final List<C9035hw> e;
    public final InterfaceC8991hE<D> g;
    public final UUID h;
    public final boolean j;

    public /* synthetic */ C8954gU(UUID uuid, InterfaceC8991hE interfaceC8991hE, InterfaceC8991hE.b bVar, List list, ApolloException apolloException, Map map, InterfaceC9032ht interfaceC9032ht, boolean z, C8627dsp c8627dsp) {
        this(uuid, interfaceC8991hE, bVar, list, apolloException, map, interfaceC9032ht, z);
    }

    private C8954gU(UUID uuid, InterfaceC8991hE<D> interfaceC8991hE, D d, List<C9035hw> list, ApolloException apolloException, Map<String, ? extends Object> map, InterfaceC9032ht interfaceC9032ht, boolean z) {
        this.h = uuid;
        this.g = interfaceC8991hE;
        this.d = d;
        this.e = list;
        this.a = apolloException;
        this.b = map;
        this.c = interfaceC9032ht;
        this.j = z;
    }

    public final boolean a() {
        List<C9035hw> list = this.e;
        return !(list == null || list.isEmpty());
    }

    public final c<D> d() {
        return new c(this.g, this.h, this.d, this.e, this.b, this.a).a(this.c).a(this.j);
    }

    /* renamed from: o.gU$c */
    /* loaded from: classes2.dex */
    public static final class c<D extends InterfaceC8991hE.b> {
        private ApolloException a;
        private InterfaceC9032ht b;
        private List<C9035hw> c;
        private Map<String, ? extends Object> d;
        private D e;
        private final InterfaceC8991hE<D> f;
        private boolean g;
        private UUID h;

        public final c<D> a(Map<String, ? extends Object> map) {
            this.d = map;
            return this;
        }

        public final c<D> a(boolean z) {
            this.g = z;
            return this;
        }

        public final c<D> b(UUID uuid) {
            C8632dsu.c((Object) uuid, "");
            this.h = uuid;
            return this;
        }

        public final c<D> c(ApolloException apolloException) {
            this.a = apolloException;
            return this;
        }

        public final c<D> e(List<C9035hw> list) {
            this.c = list;
            return this;
        }

        public final c<D> e(D d) {
            this.e = d;
            return this;
        }

        public c(InterfaceC8991hE<D> interfaceC8991hE, UUID uuid, D d, List<C9035hw> list, Map<String, ? extends Object> map, ApolloException apolloException) {
            C8632dsu.c((Object) interfaceC8991hE, "");
            C8632dsu.c((Object) uuid, "");
            this.f = interfaceC8991hE;
            this.h = uuid;
            this.e = d;
            this.c = list;
            this.d = map;
            this.a = apolloException;
            this.b = InterfaceC9032ht.h;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC8991hE<D> interfaceC8991hE, UUID uuid) {
            this(interfaceC8991hE, uuid, null, null, null, null);
            C8632dsu.c((Object) interfaceC8991hE, "");
            C8632dsu.c((Object) uuid, "");
        }

        public final c<D> a(InterfaceC9032ht interfaceC9032ht) {
            C8632dsu.c((Object) interfaceC9032ht, "");
            this.b = this.b.d(interfaceC9032ht);
            return this;
        }

        public final C8954gU<D> e() {
            InterfaceC8991hE<D> interfaceC8991hE = this.f;
            UUID uuid = this.h;
            D d = this.e;
            InterfaceC9032ht interfaceC9032ht = this.b;
            Map<String, ? extends Object> map = this.d;
            if (map == null) {
                map = dqE.d();
            }
            return new C8954gU<>(uuid, interfaceC8991hE, d, this.c, this.a, map, interfaceC9032ht, this.g, null);
        }
    }
}
