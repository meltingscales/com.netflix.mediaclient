package o;

import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.SubscribersKt;
import o.AbstractApplicationC1040Mh;
import o.C8632dsu;
import o.InterfaceC5131bsv;
import o.cVS;
import o.dpR;

/* loaded from: classes6.dex */
public final class cQM {
    public final Maybe<cVS.d> d(final cVS.c cVar) {
        C8632dsu.c((Object) cVar, "");
        Maybe<InterfaceC5131bsv> d = d();
        final drM<InterfaceC5131bsv, MaybeSource<? extends cVS.d>> drm = new drM<InterfaceC5131bsv, MaybeSource<? extends cVS.d>>() { // from class: com.netflix.mediaclient.ui.repository.MdxRepository$onTvDiscoveryReadyToBeShown$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final MaybeSource<? extends cVS.d> invoke(InterfaceC5131bsv interfaceC5131bsv) {
                C8632dsu.c((Object) interfaceC5131bsv, "");
                return Maybe.just(interfaceC5131bsv.c(cVS.c.this));
            }
        };
        Maybe flatMap = d.flatMap(new Function() { // from class: o.cQN
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MaybeSource c;
                c = cQM.c(drM.this, obj);
                return c;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (MaybeSource) drm.invoke(obj);
    }

    private final Maybe<InterfaceC5131bsv> d() {
        Maybe<InterfaceC5131bsv> create = Maybe.create(new MaybeOnSubscribe() { // from class: o.cQK
            @Override // io.reactivex.MaybeOnSubscribe
            public final void subscribe(MaybeEmitter maybeEmitter) {
                cQM.e(maybeEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final MaybeEmitter maybeEmitter) {
        C8632dsu.c((Object) maybeEmitter, "");
        C1052Mw i = AbstractApplicationC1040Mh.getInstance().i();
        C8632dsu.a(i, "");
        SubscribersKt.subscribeBy(i.t(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.repository.MdxRepository$requestAgentSingle$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                C8632dsu.c((Object) th, "");
                maybeEmitter.onError(th);
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.repository.MdxRepository$requestAgentSingle$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }

            public final void a() {
                InterfaceC5131bsv i2 = AbstractApplicationC1040Mh.getInstance().i().i();
                if (i2 == null) {
                    maybeEmitter.onComplete();
                } else {
                    maybeEmitter.onSuccess(i2);
                }
            }
        });
    }
}
