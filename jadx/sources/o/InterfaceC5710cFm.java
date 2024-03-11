package o;

import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPreplayAwarePresenter$initializeisInPreplayAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC5710cFm;
import o.cBA;
import o.dpR;

/* renamed from: o.cFm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5710cFm {
    void b(String str);

    String c();

    void c(Observable<cBA> observable);

    /* renamed from: o.cFm$e */
    /* loaded from: classes4.dex */
    public static final class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean a(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }

        public static void c(final InterfaceC5710cFm interfaceC5710cFm, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerPreplayAwarePresenter$initializeisInPreplayAwarePresenter$1 playerPreplayAwarePresenter$initializeisInPreplayAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPreplayAwarePresenter$initializeisInPreplayAwarePresenter$1
                @Override // o.drM
                /* renamed from: c */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba instanceof cBA.C5542d);
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cFn
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean a;
                    a = InterfaceC5710cFm.e.a(drM.this, obj);
                    return a;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerPreplayAwarePresenter$initializeisInPreplayAwarePresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    e(cba);
                    return dpR.c;
                }

                public final void e(cBA cba) {
                    if (cba instanceof cBA.C5542d) {
                        InterfaceC5710cFm.this.b(((cBA.C5542d) cba).b());
                    }
                }
            }, 3, (Object) null);
        }

        public static boolean e(InterfaceC5710cFm interfaceC5710cFm) {
            return interfaceC5710cFm.c() != null;
        }
    }
}
