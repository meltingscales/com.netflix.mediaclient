package o;

import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerAudioModeAwarePresenter$initializeAudioModeAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.cBA;
import o.cER;
import o.dpR;

/* loaded from: classes4.dex */
public interface cER {
    void d(Observable<cBA> observable);

    void e(boolean z);

    /* loaded from: classes4.dex */
    public static final class a {
        public static void c(final cER cer, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerAudioModeAwarePresenter$initializeAudioModeAwarePresenter$1 playerAudioModeAwarePresenter$initializeAudioModeAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerAudioModeAwarePresenter$initializeAudioModeAwarePresenter$1
                @Override // o.drM
                /* renamed from: a */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba == cBA.C5561w.a || cba == cBA.B.b);
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cEQ
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean c;
                    c = cER.a.c(drM.this, obj);
                    return c;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerAudioModeAwarePresenter$initializeAudioModeAwarePresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    c(cba);
                    return dpR.c;
                }

                public final void c(cBA cba) {
                    cER.this.e(cba instanceof cBA.C5561w);
                }
            }, 3, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean c(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }
    }
}
