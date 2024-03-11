package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPostPlayMoreDensityPreviewsAwarePresenter$initializePlayerPostPlayMoreDensityPreviewsAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC5703cFf;
import o.cBA;
import o.dpR;

/* renamed from: o.cFf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5703cFf {
    void c(boolean z);

    @SuppressLint({"CheckResult"})
    void g(Observable<cBA> observable);

    /* renamed from: o.cFf$b */
    /* loaded from: classes4.dex */
    public static final class b {
        @SuppressLint({"CheckResult"})
        public static void c(final InterfaceC5703cFf interfaceC5703cFf, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerPostPlayMoreDensityPreviewsAwarePresenter$initializePlayerPostPlayMoreDensityPreviewsAwarePresenter$1 playerPostPlayMoreDensityPreviewsAwarePresenter$initializePlayerPostPlayMoreDensityPreviewsAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPostPlayMoreDensityPreviewsAwarePresenter$initializePlayerPostPlayMoreDensityPreviewsAwarePresenter$1
                @Override // o.drM
                /* renamed from: b */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf((cba instanceof cBA.Y) || (cba instanceof cBA.C5537aa));
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cFo
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean d;
                    d = InterfaceC5703cFf.b.d(drM.this, obj);
                    return d;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPostPlayMoreDensityPreviewsAwarePresenter$initializePlayerPostPlayMoreDensityPreviewsAwarePresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    c(cba);
                    return dpR.c;
                }

                public final void c(cBA cba) {
                    if (cba instanceof cBA.Y) {
                        InterfaceC5703cFf.this.c(true);
                    } else if (cba instanceof cBA.C5537aa) {
                        InterfaceC5703cFf.this.c(false);
                    }
                }
            }, 3, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean d(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }
    }
}
