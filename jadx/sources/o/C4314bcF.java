package o;

import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.rxkotlin.SubscribersKt;
import java.lang.ref.WeakReference;
import o.AbstractApplicationC1040Mh;
import o.C4358bcx;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.bcF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4314bcF {
    public static final Completable c() {
        Completable ignoreElement = e().ignoreElement();
        C8632dsu.a(ignoreElement, "");
        return ignoreElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single<C4358bcx> e() {
        if (AbstractApplicationC1040Mh.getInstance().i().r()) {
            Object m = AbstractApplicationC1040Mh.getInstance().i().m();
            C8632dsu.d(m);
            C4358bcx c4358bcx = (C4358bcx) m;
            if (c4358bcx.isReady()) {
                Single<C4358bcx> just = Single.just(c4358bcx);
                C8632dsu.a(just, "");
                return just;
            }
        }
        Single create = Single.create(new SingleOnSubscribe() { // from class: o.bcE
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C4314bcF.e(singleEmitter);
            }
        });
        C8632dsu.a(create, "");
        Single<C4358bcx> andThen = AbstractApplicationC1040Mh.getInstance().i().t().andThen(create);
        C8632dsu.a(andThen, "");
        return andThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SingleEmitter singleEmitter) {
        C8632dsu.c((Object) singleEmitter, "");
        final WeakReference weakReference = new WeakReference(singleEmitter);
        Object m = AbstractApplicationC1040Mh.getInstance().i().m();
        C8632dsu.d(m);
        SubscribersKt.subscribeBy(((C4358bcx) m).b(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.service.player.PlayerAgentRepositoryImplKt$requestAgent$playerAgentSingle$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                C8632dsu.c((Object) th, "");
                SingleEmitter<C4358bcx> singleEmitter2 = weakReference.get();
                if (singleEmitter2 != null) {
                    singleEmitter2.tryOnError(th);
                }
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.service.player.PlayerAgentRepositoryImplKt$requestAgent$playerAgentSingle$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                SingleEmitter<C4358bcx> singleEmitter2 = weakReference.get();
                if (singleEmitter2 != null) {
                    Object m2 = AbstractApplicationC1040Mh.getInstance().i().m();
                    C8632dsu.d(m2);
                    singleEmitter2.onSuccess((C4358bcx) m2);
                }
            }
        });
    }
}
