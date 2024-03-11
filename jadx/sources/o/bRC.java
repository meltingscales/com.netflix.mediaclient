package o;

import androidx.lifecycle.Lifecycle;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Lazy;
import io.reactivex.Completable;
import io.reactivex.functions.Action;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.PublishSubject;
import o.C8632dsu;
import o.InterfaceC4208baF;
import o.InterfaceC4245baq;
import o.dpR;

/* loaded from: classes4.dex */
public final class bRC {
    public static final e a = new e(null);
    public static final int d = 8;
    private final NetflixActivity b;
    private final Lazy<InterfaceC6083cTf> c;
    private final b e;

    /* loaded from: classes4.dex */
    public interface b {
    }

    public bRC(NetflixActivity netflixActivity, b bVar, Lazy<InterfaceC6083cTf> lazy) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) lazy, "");
        this.b = netflixActivity;
        this.e = bVar;
        this.c = lazy;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("DataPrefetchingAfterTTR");
        }
    }

    private final void a(CompletableSubject completableSubject, final Lazy<InterfaceC6083cTf> lazy) {
        if (C8153dex.i()) {
            return;
        }
        AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(this.b, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a2, "");
        Object as = completableSubject.as(AutoDispose.b(a2));
        C8632dsu.b(as, "");
        ((CompletableSubscribeProxy) as).e(new Action() { // from class: o.bRH
            @Override // io.reactivex.functions.Action
            public final void run() {
                bRC.a(Lazy.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Lazy lazy, bRC brc) {
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) brc, "");
        PublishSubject<dpR> activityDestroy = brc.b.getActivityDestroy();
        C8632dsu.a(activityDestroy, "");
        Completable e2 = ((InterfaceC6083cTf) lazy.get()).d(activityDestroy).e();
        AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(brc.b, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a2, "");
        Object as = e2.as(AutoDispose.b(a2));
        C8632dsu.b(as, "");
        ((CompletableSubscribeProxy) as).e(new Action() { // from class: o.bRF
            @Override // io.reactivex.functions.Action
            public final void run() {
                bRC.b();
            }
        });
    }

    private final void d(CompletableSubject completableSubject) {
        if (aRL.e.a().e()) {
            AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(this.b, Lifecycle.Event.ON_DESTROY);
            C8632dsu.a(a2, "");
            Object as = completableSubject.as(AutoDispose.b(a2));
            C8632dsu.b(as, "");
            ((CompletableSubscribeProxy) as).e(new Action() { // from class: o.bRG
                @Override // io.reactivex.functions.Action
                public final void run() {
                    bRC.e(bRC.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(bRC brc) {
        C8632dsu.c((Object) brc, "");
        C1645aIz.a(brc.b, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.home.DataPrefetchingAfterTTR$prefetchDownloadsForYouMerchBoxArts$1$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                d(serviceManager);
                return dpR.c;
            }

            public final void d(ServiceManager serviceManager) {
                InterfaceC4245baq k;
                C8632dsu.c((Object) serviceManager, "");
                InterfaceC4208baF t = serviceManager.t();
                if (t == null || (k = t.k()) == null) {
                    return;
                }
                k.e();
            }
        });
    }

    public final void c() {
        a.getLogTag();
        CompletableSubject j = NetflixApplication.getInstance().j();
        C8632dsu.a(j, "");
        a(j, this.c);
        d(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        a.getLogTag();
    }
}
