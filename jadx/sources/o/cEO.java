package o;

import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerAccessibilityAwarePresenter$initializeAccessibilityAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.cBA;
import o.cEO;
import o.dpR;

/* loaded from: classes4.dex */
public interface cEO {
    void h(boolean z);

    void i(Observable<cBA> observable);

    /* loaded from: classes4.dex */
    public static final class d {
        public static void b(final cEO ceo, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerAccessibilityAwarePresenter$initializeAccessibilityAwarePresenter$1 playerAccessibilityAwarePresenter$initializeAccessibilityAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerAccessibilityAwarePresenter$initializeAccessibilityAwarePresenter$1
                @Override // o.drM
                /* renamed from: e */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba instanceof cBA.C5540b);
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cEN
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean b;
                    b = cEO.d.b(drM.this, obj);
                    return b;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerAccessibilityAwarePresenter$initializeAccessibilityAwarePresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    c(cba);
                    return dpR.c;
                }

                public final void c(cBA cba) {
                    cEO ceo2 = cEO.this;
                    C8632dsu.d(cba);
                    ceo2.h(((cBA.C5540b) cba).d());
                }
            }, 3, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }
    }
}
