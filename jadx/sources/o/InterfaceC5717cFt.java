package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerUserMarksAwarePresenter$initializeUserMarksAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC5717cFt;
import o.cBA;
import o.dpR;

/* renamed from: o.cFt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5717cFt {
    @SuppressLint({"CheckResult"})
    void f(Observable<cBA> observable);

    void g(boolean z);

    /* renamed from: o.cFt$b */
    /* loaded from: classes4.dex */
    public static final class b {
        @SuppressLint({"CheckResult"})
        public static void b(final InterfaceC5717cFt interfaceC5717cFt, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerUserMarksAwarePresenter$initializeUserMarksAwarePresenter$1 playerUserMarksAwarePresenter$initializeUserMarksAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerUserMarksAwarePresenter$initializeUserMarksAwarePresenter$1
                @Override // o.drM
                /* renamed from: d */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba instanceof cBA.S);
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cFs
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean d;
                    d = InterfaceC5717cFt.b.d(drM.this, obj);
                    return d;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerUserMarksAwarePresenter$initializeUserMarksAwarePresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    a(cba);
                    return dpR.c;
                }

                public final void a(cBA cba) {
                    if (cba instanceof cBA.S) {
                        InterfaceC5717cFt.this.g(((cBA.S) cba).b().c());
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
