package o;

import com.apollographql.apollo3.api.http.HttpMethod;
import com.apollographql.apollo3.interceptor.AutoPersistedQueryInterceptor$intercept$1;
import java.util.List;
import o.InterfaceC8991hE;

/* renamed from: o.jp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9134jp implements InterfaceC9136jr {
    public static final d c = new d(null);
    private final HttpMethod a;
    private final HttpMethod d;

    @Override // o.InterfaceC9136jr
    public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
        C8632dsu.c((Object) c8951gR, "");
        C8632dsu.c((Object) interfaceC9135jq, "");
        Boolean e = c8951gR.e();
        if (e != null && !e.booleanValue()) {
            return interfaceC9135jq.a(c8951gR);
        }
        boolean z = c8951gR.h() instanceof InterfaceC8990hD;
        return dyR.d(new AutoPersistedQueryInterceptor$intercept$1(interfaceC9135jq, c8951gR.i().e(z ? HttpMethod.a : this.a).c(Boolean.FALSE).d(Boolean.TRUE).c(), this, z, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC8991hE.b> C8954gU<D> b(C8954gU<D> c8954gU, boolean z) {
        return c8954gU.d().a(new C8946gM(z)).e();
    }

    /* renamed from: o.jp$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(List<C9035hw> list) {
        boolean a;
        if (list != null && !list.isEmpty()) {
            for (C9035hw c9035hw : list) {
                a = C8691duz.a(c9035hw.c(), "PersistedQueryNotFound", true);
                if (a) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(List<C9035hw> list) {
        boolean a;
        if (list != null && !list.isEmpty()) {
            for (C9035hw c9035hw : list) {
                a = C8691duz.a(c9035hw.c(), "PersistedQueryNotSupported", true);
                if (a) {
                    return true;
                }
            }
        }
        return false;
    }
}
