package o;

import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerInteractiveAwarePresenter$initializeIsInteractiveAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.cBA;
import o.cEW;
import o.dpR;

/* loaded from: classes4.dex */
public interface cEW {
    void a(Interactivity interactivity);

    void e(Observable<cBA> observable);

    /* loaded from: classes4.dex */
    public static final class d {
        public static void a(final cEW cew, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerInteractiveAwarePresenter$initializeIsInteractiveAwarePresenter$1 playerInteractiveAwarePresenter$initializeIsInteractiveAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerInteractiveAwarePresenter$initializeIsInteractiveAwarePresenter$1
                @Override // o.drM
                /* renamed from: c */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba instanceof cBA.C5542d);
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cEV
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean a;
                    a = cEW.d.a(drM.this, obj);
                    return a;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerInteractiveAwarePresenter$initializeIsInteractiveAwarePresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    c(cba);
                    return dpR.c;
                }

                public final void c(cBA cba) {
                    if (cba instanceof cBA.C5542d) {
                        cEW.this.a(((cBA.C5542d) cba).c());
                    }
                }
            }, 3, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean a(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }
    }
}
