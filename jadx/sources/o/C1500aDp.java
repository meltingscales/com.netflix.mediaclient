package o;

import com.apollographql.apollo3.api.http.HttpMethod;
import com.netflix.mediaclient.graphqlrepo.impl.client.network.http.PrePersistedQueryInterceptor$intercept$1;
import java.util.List;
import o.InterfaceC8991hE;
import o.InterfaceC9032ht;

/* renamed from: o.aDp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1500aDp implements InterfaceC9136jr {
    public static final c a = new c(null);
    private final HttpMethod c;
    private final HttpMethod d;

    public C1500aDp(HttpMethod httpMethod, HttpMethod httpMethod2) {
        C8632dsu.c((Object) httpMethod, "");
        C8632dsu.c((Object) httpMethod2, "");
        this.c = httpMethod;
        this.d = httpMethod2;
    }

    @Override // o.InterfaceC9136jr
    public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
        C8632dsu.c((Object) c8951gR, "");
        C8632dsu.c((Object) interfaceC9135jq, "");
        return dyR.d(new PrePersistedQueryInterceptor$intercept$1(interfaceC9135jq, c8951gR.i().e(c8951gR.h() instanceof InterfaceC8990hD ? HttpMethod.a : this.c).c(Boolean.FALSE).e(new e(true)).c(), this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC8991hE.b> C8954gU<D> c(C8954gU<D> c8954gU, boolean z) {
        return c8954gU.d().a(new C1502aDr(z)).e();
    }

    /* renamed from: o.aDp$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: o.aDp$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC9032ht.e {
        public static final b a = new b(null);
        private final boolean c;

        @Override // o.InterfaceC9032ht.e
        public InterfaceC9032ht.b<?> a() {
            return a;
        }

        public final boolean e() {
            return this.c;
        }

        public e(boolean z) {
            this.c = z;
        }

        /* renamed from: o.aDp$e$b */
        /* loaded from: classes3.dex */
        public static final class b implements InterfaceC9032ht.b<e> {
            public /* synthetic */ b(C8627dsp c8627dsp) {
                this();
            }

            private b() {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(List<C9035hw> list) {
        boolean a2;
        if (list != null && !list.isEmpty()) {
            for (C9035hw c9035hw : list) {
                a2 = C8691duz.a(c9035hw.c(), "PersistedQueryNotFound", true);
                if (a2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(List<C9035hw> list) {
        boolean a2;
        if (list != null && !list.isEmpty()) {
            for (C9035hw c9035hw : list) {
                a2 = C8691duz.a(c9035hw.c(), "PersistedQueryNotSupported", true);
                if (a2) {
                    return true;
                }
            }
        }
        return false;
    }
}
