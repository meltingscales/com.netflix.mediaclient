package o;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.SingleSubject;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import o.AbstractC9927zH;
import o.C7296ctY;
import o.C8168dfL;
import o.C8632dsu;
import o.C9936zQ;
import o.InterfaceC7303ctf;
import o.InterfaceC9934zO;
import o.dpR;

/* renamed from: o.ctY  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7296ctY implements InterfaceC9934zO {
    private final Class<? extends NetflixActivity> a;
    private final InterfaceC7249cse b;
    private final Application c;
    private final CommandValue d;
    private final AppView e;
    private final InterfaceC8554dpx f;
    private final InterfaceC7303ctf g;
    private final InterfaceC7261csq i;
    private final InterfaceC9934zO.b.C0127b j;

    @Override // o.InterfaceC9934zO
    public CommandValue a() {
        return this.d;
    }

    @Override // o.InterfaceC9934zO
    public Class<? extends NetflixActivity> c() {
        return this.a;
    }

    @Override // o.InterfaceC9934zO
    public AppView d() {
        return this.e;
    }

    @Override // o.InterfaceC9934zO
    /* renamed from: h */
    public InterfaceC9934zO.b.C0127b e() {
        return this.j;
    }

    @Inject
    public C7296ctY(InterfaceC7303ctf interfaceC7303ctf, InterfaceC7249cse interfaceC7249cse, Application application, InterfaceC7261csq interfaceC7261csq) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) interfaceC7303ctf, "");
        C8632dsu.c((Object) interfaceC7249cse, "");
        C8632dsu.c((Object) application, "");
        C8632dsu.c((Object) interfaceC7261csq, "");
        this.g = interfaceC7303ctf;
        this.b = interfaceC7249cse;
        this.c = application;
        this.i = interfaceC7261csq;
        this.a = OfflineActivityV2.b.c();
        this.e = AppView.downloadsTab;
        this.d = CommandValue.ViewCachedVideosCommand;
        this.j = InterfaceC9934zO.b.C0127b.b;
        b = dpB.b(LazyThreadSafetyMode.e, new drO<C9936zQ>() { // from class: com.netflix.mediaclient.ui.offline.OfflineTab$tab$2
            @Override // o.drO
            /* renamed from: b */
            public final C9936zQ invoke() {
                int i = InterfaceC7303ctf.b;
                String d = C8168dfL.d(R.o.lG);
                C8632dsu.a(d, "");
                C9936zQ c9936zQ = new C9936zQ(i, d, R.e.af, null, 8, null);
                c9936zQ.e(false);
                return c9936zQ;
            }
        });
        this.f = b;
    }

    @Override // o.InterfaceC9934zO
    public Observable<String> f() {
        return InterfaceC9934zO.a.c(this);
    }

    @Override // o.InterfaceC9934zO
    public Observable<Boolean> g() {
        return InterfaceC9934zO.a.d(this);
    }

    @Override // o.InterfaceC9934zO
    public C9936zQ b() {
        return (C9936zQ) this.f.getValue();
    }

    @Override // o.InterfaceC9934zO
    public Observable<AbstractC9927zH> b(final Activity activity) {
        C8632dsu.c((Object) activity, "");
        PublishSubject create = PublishSubject.create();
        C8632dsu.a(create, "");
        final a aVar = new a(create);
        Single<Boolean> a2 = a(activity);
        final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineTab$observeShowBadge$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                b(bool.booleanValue());
                return dpR.c;
            }

            public final void b(boolean z) {
                if (z) {
                    return;
                }
                IntentFilter intentFilter = new IntentFilter("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED");
                intentFilter.addCategory("com.netflix.mediaclient.intent.category.PLAYER");
                LocalBroadcastManager.getInstance(activity).registerReceiver(aVar, intentFilter);
            }
        };
        Observable<AbstractC9927zH> doFinally = a2.doOnSuccess(new Consumer() { // from class: o.cua
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7296ctY.c(drM.this, obj);
            }
        }).toObservable().flatMap(new e(create, this, activity)).doFinally(new Action() { // from class: o.ctZ
            @Override // io.reactivex.functions.Action
            public final void run() {
                C7296ctY.e(activity, aVar);
            }
        });
        C8632dsu.a(doFinally, "");
        return doFinally;
    }

    /* renamed from: o.ctY$a */
    /* loaded from: classes6.dex */
    public static final class a extends BroadcastReceiver {
        final /* synthetic */ PublishSubject<dpR> b;

        a(PublishSubject<dpR> publishSubject) {
            this.b = publishSubject;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            this.b.onNext(dpR.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* renamed from: o.ctY$e */
    /* loaded from: classes6.dex */
    public static final class e implements Function<Boolean, ObservableSource<AbstractC9927zH>> {
        final /* synthetic */ C7296ctY a;
        final /* synthetic */ PublishSubject<dpR> b;
        final /* synthetic */ Activity e;

        e(PublishSubject<dpR> publishSubject, C7296ctY c7296ctY, Activity activity) {
            this.b = publishSubject;
            this.a = c7296ctY;
            this.e = activity;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ ObservableSource<AbstractC9927zH> apply(Boolean bool) {
            return e(bool.booleanValue());
        }

        public Observable<AbstractC9927zH> e(boolean z) {
            if (z) {
                Observable<AbstractC9927zH> just = Observable.just(AbstractC9927zH.a.d);
                C8632dsu.a(just, "");
                return just;
            }
            Observable<dpR> startWith = this.b.startWith(dpR.c);
            Observable<AbstractC7233csO> j = AbstractC7233csO.j();
            final C7296ctY c7296ctY = this.a;
            final Activity activity = this.e;
            Observable<AbstractC9927zH> combineLatest = Observable.combineLatest(startWith, j, new BiFunction() { // from class: o.cue
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    AbstractC9927zH a;
                    a = C7296ctY.e.a(C7296ctY.this, activity, (dpR) obj, (AbstractC7233csO) obj2);
                    return a;
                }
            });
            C8632dsu.a(combineLatest, "");
            return combineLatest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC9927zH a(C7296ctY c7296ctY, Activity activity, dpR dpr, AbstractC7233csO abstractC7233csO) {
            C8632dsu.c((Object) c7296ctY, "");
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) dpr, "");
            C8632dsu.c((Object) abstractC7233csO, "");
            return c7296ctY.i.e(abstractC7233csO, activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Activity activity, a aVar) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) aVar, "");
        LocalBroadcastManager.getInstance(activity).unregisterReceiver(aVar);
    }

    @Override // o.InterfaceC9934zO
    public Single<Boolean> a(final Activity activity) {
        C8632dsu.c((Object) activity, "");
        final SingleSubject create = SingleSubject.create();
        C8632dsu.a(create, "");
        C1645aIz.a(activity, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineTab$observeTabRemoved$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                e(serviceManager);
                return dpR.c;
            }

            public final void e(ServiceManager serviceManager) {
                InterfaceC7303ctf interfaceC7303ctf;
                C8632dsu.c((Object) serviceManager, "");
                interfaceC7303ctf = C7296ctY.this.g;
                create.onSuccess(Boolean.valueOf(!interfaceC7303ctf.c(activity)));
            }
        });
        return create;
    }

    @Override // o.InterfaceC9934zO
    public Intent b(AppView appView) {
        return OfflineActivityV2.b.d(this.c);
    }

    @Override // o.InterfaceC9934zO
    public boolean e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return !C8153dex.B() && XH.c.d(this.c).c().a();
    }

    @Override // o.InterfaceC9934zO
    public boolean d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.b.d();
        if (C4337bcc.a(activity)) {
            this.g.a(activity);
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC9934zO
    public boolean c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        if (C8153dex.B()) {
            return false;
        }
        return InterfaceC9934zO.a.a(this, activity);
    }
}
