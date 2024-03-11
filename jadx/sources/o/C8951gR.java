package o;

import com.apollographql.apollo3.api.http.HttpMethod;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import o.InterfaceC8991hE;
import o.InterfaceC8991hE.b;

/* renamed from: o.gR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8951gR<D extends InterfaceC8991hE.b> implements InterfaceC8988hB {
    private final Boolean a;
    private final List<C9006hT> c;
    private final InterfaceC9032ht d;
    private final Boolean e;
    private final Boolean f;
    private final Boolean g;
    private final InterfaceC8991hE<D> h;
    private final HttpMethod i;
    private final UUID j;

    public /* synthetic */ C8951gR(InterfaceC8991hE interfaceC8991hE, UUID uuid, InterfaceC9032ht interfaceC9032ht, HttpMethod httpMethod, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C8627dsp c8627dsp) {
        this(interfaceC8991hE, uuid, interfaceC9032ht, httpMethod, list, bool, bool2, bool3, bool4);
    }

    public Boolean a() {
        return this.a;
    }

    @Override // o.InterfaceC8988hB
    public InterfaceC9032ht b() {
        return this.d;
    }

    public List<C9006hT> c() {
        return this.c;
    }

    public HttpMethod d() {
        return this.i;
    }

    public Boolean e() {
        return this.e;
    }

    public Boolean f() {
        return this.f;
    }

    public Boolean g() {
        return this.g;
    }

    public final InterfaceC8991hE<D> h() {
        return this.h;
    }

    public final UUID j() {
        return this.j;
    }

    private C8951gR(InterfaceC8991hE<D> interfaceC8991hE, UUID uuid, InterfaceC9032ht interfaceC9032ht, HttpMethod httpMethod, List<C9006hT> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.h = interfaceC8991hE;
        this.j = uuid;
        this.d = interfaceC9032ht;
        this.i = httpMethod;
        this.c = list;
        this.f = bool;
        this.g = bool2;
        this.e = bool3;
        this.a = bool4;
    }

    public final d<D> i() {
        return (d<D>) b((InterfaceC8991hE<D>) this.h);
    }

    public final <E extends InterfaceC8991hE.b> d<E> b(InterfaceC8991hE<E> interfaceC8991hE) {
        C8632dsu.c((Object) interfaceC8991hE, "");
        return (d<D>) new d(interfaceC8991hE).a(this.j).d(b()).e(d()).e(c()).d(f()).c(g()).e(e()).a(a());
    }

    /* renamed from: o.gR$d */
    /* loaded from: classes2.dex */
    public static final class d<D extends InterfaceC8991hE.b> implements InterfaceC9038hz<d<D>> {
        private InterfaceC9032ht a;
        private Boolean c;
        private List<C9006hT> d;
        private Boolean e;
        private InterfaceC8991hE<D> f;
        private UUID g;
        private Boolean h;
        private Boolean i;
        private HttpMethod j;

        public List<C9006hT> a() {
            return this.d;
        }

        public d<D> a(Boolean bool) {
            this.c = bool;
            return this;
        }

        public final d<D> a(UUID uuid) {
            C8632dsu.c((Object) uuid, "");
            this.g = uuid;
            return this;
        }

        @Override // o.InterfaceC8988hB
        public InterfaceC9032ht b() {
            return this.a;
        }

        public d<D> c(Boolean bool) {
            this.i = bool;
            return this;
        }

        public Boolean d() {
            return this.c;
        }

        public d<D> d(Boolean bool) {
            this.h = bool;
            return this;
        }

        public final d<D> d(InterfaceC9032ht interfaceC9032ht) {
            C8632dsu.c((Object) interfaceC9032ht, "");
            this.a = interfaceC9032ht;
            return this;
        }

        public Boolean e() {
            return this.e;
        }

        public d<D> e(HttpMethod httpMethod) {
            this.j = httpMethod;
            return this;
        }

        public d<D> e(Boolean bool) {
            this.e = bool;
            return this;
        }

        public d<D> e(List<C9006hT> list) {
            this.d = list;
            return this;
        }

        public Boolean g() {
            return this.i;
        }

        public HttpMethod h() {
            return this.j;
        }

        public Boolean i() {
            return this.h;
        }

        public d(InterfaceC8991hE<D> interfaceC8991hE) {
            C8632dsu.c((Object) interfaceC8991hE, "");
            this.f = interfaceC8991hE;
            UUID randomUUID = UUID.randomUUID();
            C8632dsu.a(randomUUID, "");
            this.g = randomUUID;
            this.a = InterfaceC9032ht.h;
        }

        public d<D> d(String str, String str2) {
            List<C9006hT> b;
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            List<C9006hT> a = a();
            if (a == null) {
                a = C8569dql.i();
            }
            b = C8576dqs.b((Collection<? extends C9006hT>) ((Collection<? extends Object>) a), new C9006hT(str, str2));
            this.d = b;
            return this;
        }

        @Override // o.InterfaceC9038hz
        /* renamed from: a */
        public d<D> e(InterfaceC9032ht interfaceC9032ht) {
            C8632dsu.c((Object) interfaceC9032ht, "");
            this.a = b().d(interfaceC9032ht);
            return this;
        }

        public final C8951gR<D> c() {
            return new C8951gR<>(this.f, this.g, b(), h(), a(), i(), g(), e(), d(), null);
        }
    }
}
