package o;

import java.util.Set;
import o.C8632dsu;
import o.dkQ;

/* renamed from: o.aZc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2080aZc extends C1045Mp {
    public static final C2080aZc d = new C2080aZc();

    private C2080aZc() {
        super("nf_msl_store_utils");
    }

    public static final boolean e(final String str, Set<dkQ> set) {
        boolean e;
        synchronized (C2080aZc.class) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) set, "");
            e = C8571dqn.e(set, new drM<dkQ, Boolean>() { // from class: com.netflix.mediaclient.service.msl.client.MslStoreUtils$removeServiceTokensFromSet$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final Boolean invoke(dkQ dkq) {
                    C8632dsu.c((Object) dkq, "");
                    return Boolean.valueOf(C8632dsu.c((Object) dkq.d(), (Object) str));
                }
            });
        }
        return e;
    }
}
