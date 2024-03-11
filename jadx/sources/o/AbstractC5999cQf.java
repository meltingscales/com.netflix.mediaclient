package o;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.rxkotlin.SubscribersKt;
import java.lang.ref.WeakReference;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cQf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5999cQf<T> {
    public abstract T a();

    public final T f() {
        if (AbstractApplicationC1040Mh.getInstance().i().r()) {
            return a();
        }
        return null;
    }

    public final Single<T> h() {
        T a;
        if (AbstractApplicationC1040Mh.getInstance().i().r() && (a = a()) != null) {
            Single<T> just = Single.just(a);
            C8632dsu.a(just, "");
            return just;
        }
        Single<T> create = Single.create(new SingleOnSubscribe() { // from class: o.cQl
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                AbstractC5999cQf.e(AbstractC5999cQf.this, singleEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final AbstractC5999cQf abstractC5999cQf, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) abstractC5999cQf, "");
        C8632dsu.c((Object) singleEmitter, "");
        final WeakReference weakReference = new WeakReference(singleEmitter);
        C1052Mw i = AbstractApplicationC1040Mh.getInstance().i();
        C8632dsu.a(i, "");
        SubscribersKt.subscribeBy(i.t(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.repository.AgentRepository$requestAgentSingle$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
                SingleEmitter singleEmitter2 = (SingleEmitter) weakReference.get();
                if (singleEmitter2 != null) {
                    singleEmitter2.onError(th);
                }
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.repository.AgentRepository$requestAgentSingle$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }

            public final void d() {
                SingleEmitter singleEmitter2 = (SingleEmitter) weakReference.get();
                if (singleEmitter2 != null) {
                    singleEmitter2.onSuccess(abstractC5999cQf.a());
                }
            }
        });
    }
}
