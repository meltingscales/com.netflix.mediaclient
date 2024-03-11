package o;

import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerOfflineAwarePresenter$initializePlayerOfflineAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C7535cxz;
import o.C8632dsu;
import o.InterfaceC5698cFa;
import o.cBA;
import o.dpR;

/* renamed from: o.cFa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5698cFa {
    void c(boolean z);

    void h(Observable<cBA> observable);

    /* renamed from: o.cFa$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static void a(final InterfaceC5698cFa interfaceC5698cFa, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerOfflineAwarePresenter$initializePlayerOfflineAwarePresenter$1 playerOfflineAwarePresenter$initializePlayerOfflineAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerOfflineAwarePresenter$initializePlayerOfflineAwarePresenter$1
                @Override // o.drM
                /* renamed from: b */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba instanceof cBA.J);
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cFe
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean a;
                    a = InterfaceC5698cFa.a.a(drM.this, obj);
                    return a;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerOfflineAwarePresenter$initializePlayerOfflineAwarePresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    b(cba);
                    return dpR.c;
                }

                public final void b(cBA cba) {
                    InterfaceC5698cFa interfaceC5698cFa2 = InterfaceC5698cFa.this;
                    C8632dsu.d(cba);
                    C7535cxz e = ((cBA.J) cba).e();
                    interfaceC5698cFa2.c((e != null ? e.f() : null) == IPlayer.PlaybackType.OfflinePlayback);
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
