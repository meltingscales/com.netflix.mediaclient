package o;

import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerBufferingAwarePresenter$initializeBufferingPresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.cBA;
import o.cET;
import o.dpR;

/* loaded from: classes4.dex */
public interface cET {
    void a(boolean z);

    void a_(Observable<cBA> observable);

    /* loaded from: classes4.dex */
    public static final class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean d(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }

        public static void e(final cET cet, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerBufferingAwarePresenter$initializeBufferingPresenter$1 playerBufferingAwarePresenter$initializeBufferingPresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerBufferingAwarePresenter$initializeBufferingPresenter$1
                @Override // o.drM
                /* renamed from: a */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf((cba instanceof cBA.ai) || C8632dsu.c(cba, cBA.C5558t.d));
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cEY
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean d;
                    d = cET.c.d(drM.this, obj);
                    return d;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerBufferingAwarePresenter$initializeBufferingPresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    c(cba);
                    return dpR.c;
                }

                public final void c(cBA cba) {
                    if (cba instanceof cBA.ai) {
                        cET.this.a(false);
                    } else if (cba instanceof cBA.C5558t) {
                        cET.this.a(true);
                    }
                }
            }, 3, (Object) null);
        }
    }
}
