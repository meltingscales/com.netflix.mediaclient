package o;

import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerScreenLockedAwarePresenter$initializeScreenLockedPresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC5709cFl;
import o.cBA;
import o.dpR;

/* renamed from: o.cFl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5709cFl {
    void f(boolean z);

    void j(Observable<cBA> observable);

    /* renamed from: o.cFl$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static void a(final InterfaceC5709cFl interfaceC5709cFl, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerScreenLockedAwarePresenter$initializeScreenLockedPresenter$1 playerScreenLockedAwarePresenter$initializeScreenLockedPresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerScreenLockedAwarePresenter$initializeScreenLockedPresenter$1
                @Override // o.drM
                /* renamed from: b */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba instanceof cBA.ag);
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cFk
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean d;
                    d = InterfaceC5709cFl.a.d(drM.this, obj);
                    return d;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerScreenLockedAwarePresenter$initializeScreenLockedPresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    b(cba);
                    return dpR.c;
                }

                public final void b(cBA cba) {
                    InterfaceC5709cFl interfaceC5709cFl2 = InterfaceC5709cFl.this;
                    C8632dsu.d(cba);
                    interfaceC5709cFl2.f(((cBA.ag) cba).c());
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
