package o;

import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPipAwarePresenter$initializePipAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC5706cFi;
import o.cBA;
import o.dpR;

/* renamed from: o.cFi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5706cFi {
    void a(Observable<cBA> observable);

    void d(boolean z);

    /* renamed from: o.cFi$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static void b(final InterfaceC5706cFi interfaceC5706cFi, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerPipAwarePresenter$initializePipAwarePresenter$1 playerPipAwarePresenter$initializePipAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPipAwarePresenter$initializePipAwarePresenter$1
                @Override // o.drM
                /* renamed from: e */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba == cBA.K.a || cba == cBA.C5564z.e);
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cFj
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean e;
                    e = InterfaceC5706cFi.a.e(drM.this, obj);
                    return e;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPipAwarePresenter$initializePipAwarePresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    e(cba);
                    return dpR.c;
                }

                public final void e(cBA cba) {
                    if (cba instanceof cBA.K) {
                        InterfaceC5706cFi.this.d(true);
                    } else if (cba instanceof cBA.C5564z) {
                        InterfaceC5706cFi.this.d(false);
                    }
                }
            }, 3, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean e(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }
    }
}
