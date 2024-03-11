package o;

import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerAdBreaksAwarePresenter$initializeAdBreaksAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.cAY;
import o.cBA;
import o.cES;
import o.dpR;

/* loaded from: classes4.dex */
public interface cES {
    void c(Observable<cBA> observable);

    void c(boolean z);

    /* loaded from: classes4.dex */
    public static final class e {
        public static void e(final cES ces, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerAdBreaksAwarePresenter$initializeAdBreaksAwarePresenter$1 playerAdBreaksAwarePresenter$initializeAdBreaksAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerAdBreaksAwarePresenter$initializeAdBreaksAwarePresenter$1
                @Override // o.drM
                /* renamed from: b */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf((cba instanceof cAY.d) || (cba instanceof cAY.a));
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cEU
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean e;
                    e = cES.e.e(drM.this, obj);
                    return e;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerAdBreaksAwarePresenter$initializeAdBreaksAwarePresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    d(cba);
                    return dpR.c;
                }

                public final void d(cBA cba) {
                    if (cba instanceof cAY.d) {
                        cES.this.c(true);
                    } else if (cba instanceof cAY.a) {
                        cES.this.c(false);
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
