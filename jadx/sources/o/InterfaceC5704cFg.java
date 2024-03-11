package o;

import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPostPlayAwarePresenter$initializePostplayAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC5704cFg;
import o.cBA;
import o.dpR;

/* renamed from: o.cFg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5704cFg {
    void e(boolean z);

    void i(Observable<cBA> observable);

    /* renamed from: o.cFg$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public static void a(final InterfaceC5704cFg interfaceC5704cFg, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerPostPlayAwarePresenter$initializePostplayAwarePresenter$1 playerPostPlayAwarePresenter$initializePostplayAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPostPlayAwarePresenter$initializePostplayAwarePresenter$1
                @Override // o.drM
                /* renamed from: d */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba == cBA.R.b || cba == cBA.L.c);
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cFh
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean b;
                    b = InterfaceC5704cFg.c.b(drM.this, obj);
                    return b;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPostPlayAwarePresenter$initializePostplayAwarePresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    a(cba);
                    return dpR.c;
                }

                public final void a(cBA cba) {
                    if (cba instanceof cBA.R) {
                        InterfaceC5704cFg.this.e(true);
                    } else if (cba instanceof cBA.L) {
                        InterfaceC5704cFg.this.e(false);
                    }
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
