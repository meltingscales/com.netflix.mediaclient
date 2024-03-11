package o;

import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerLivePlaybackAwarePresenter$initializeLivePlaybackPresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC5701cFd;
import o.cBA;
import o.dpR;

/* renamed from: o.cFd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5701cFd {
    void b(Observable<cBA> observable);

    void j(boolean z);

    /* renamed from: o.cFd$d */
    /* loaded from: classes4.dex */
    public static final class d {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean a(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }

        public static void c(final InterfaceC5701cFd interfaceC5701cFd, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerLivePlaybackAwarePresenter$initializeLivePlaybackPresenter$1 playerLivePlaybackAwarePresenter$initializeLivePlaybackPresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerLivePlaybackAwarePresenter$initializeLivePlaybackPresenter$1
                @Override // o.drM
                /* renamed from: b */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba instanceof cBA.ah);
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cFc
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean a;
                    a = InterfaceC5701cFd.d.a(drM.this, obj);
                    return a;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerLivePlaybackAwarePresenter$initializeLivePlaybackPresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    b(cba);
                    return dpR.c;
                }

                public final void b(cBA cba) {
                    InterfaceC5701cFd interfaceC5701cFd2 = InterfaceC5701cFd.this;
                    cBA.ah ahVar = cba instanceof cBA.ah ? (cBA.ah) cba : null;
                    interfaceC5701cFd2.j((ahVar != null ? ahVar.d() : null) == IPlayer.PlaybackType.LivePlayback);
                }
            }, 3, (Object) null);
        }
    }
}
