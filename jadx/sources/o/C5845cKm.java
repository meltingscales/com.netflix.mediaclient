package o;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.profile.impl.MyNetflixTab$observeShowBottomBadge$1$1;
import com.netflix.mediaclient.ui.profiles.MyNetflixActivity;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import o.C5845cKm;
import o.C8126deW;
import o.C8168dfL;
import o.C8632dsu;
import o.C9936zQ;
import o.InterfaceC5283bvo;
import o.InterfaceC5844cKl;
import o.InterfaceC9934zO;
import o.dpR;

/* renamed from: o.cKm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5845cKm implements InterfaceC9934zO {
    private final InterfaceC7261csq a;
    private final CommandValue b;
    private final InterfaceC9934zO.b.e c;
    private final AppView d;
    private final Class<MyNetflixActivity> e;
    private final InterfaceC8554dpx f;
    private final C1567aGb g;
    private final InterfaceC5844cKl h;
    private final InterfaceC7303ctf i;

    @Override // o.InterfaceC9934zO
    public CommandValue a() {
        return this.b;
    }

    @Override // o.InterfaceC9934zO
    public Class<MyNetflixActivity> c() {
        return this.e;
    }

    @Override // o.InterfaceC9934zO
    public AppView d() {
        return this.d;
    }

    @Override // o.InterfaceC9934zO
    /* renamed from: j */
    public InterfaceC9934zO.b.e e() {
        return this.c;
    }

    @Inject
    public C5845cKm(InterfaceC5844cKl interfaceC5844cKl, InterfaceC7303ctf interfaceC7303ctf, InterfaceC7261csq interfaceC7261csq, C1567aGb c1567aGb) {
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) interfaceC5844cKl, "");
        C8632dsu.c((Object) interfaceC7303ctf, "");
        C8632dsu.c((Object) interfaceC7261csq, "");
        C8632dsu.c((Object) c1567aGb, "");
        this.h = interfaceC5844cKl;
        this.i = interfaceC7303ctf;
        this.a = interfaceC7261csq;
        this.g = c1567aGb;
        this.e = MyNetflixActivity.class;
        this.d = AppView.myProfileTab;
        this.b = CommandValue.ViewAccountMenuCommand;
        this.c = InterfaceC9934zO.b.e.b;
        b2 = dpB.b(LazyThreadSafetyMode.e, new drO<C9936zQ>() { // from class: com.netflix.mediaclient.ui.profile.impl.MyNetflixTab$tab$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final C9936zQ invoke() {
                InterfaceC5844cKl interfaceC5844cKl2;
                interfaceC5844cKl2 = C5845cKm.this.h;
                int j = interfaceC5844cKl2.j();
                String d = C8168dfL.d(R.o.lJ);
                C8632dsu.a(d, "");
                InterfaceC5283bvo b3 = C8126deW.b();
                return new C9936zQ(j, d, 0, b3 != null ? b3.getAvatarUrl() : null, 4, null);
            }
        });
        this.f = b2;
    }

    @Override // o.InterfaceC9934zO
    public Single<Boolean> a(Activity activity) {
        return InterfaceC9934zO.a.c(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public boolean d(Activity activity) {
        return InterfaceC9934zO.a.b(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public C9936zQ b() {
        return (C9936zQ) this.f.getValue();
    }

    @Override // o.InterfaceC9934zO
    public Observable<String> f() {
        Observable observable = AbstractApplicationC1040Mh.getInstance().i().t().andThen(Single.fromCallable(new Callable() { // from class: o.cKs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String c;
                c = C5845cKm.c(C5845cKm.this);
                return c;
            }
        })).toObservable();
        PublishSubject<dpR> a = C4987bqJ.a();
        final drM<dpR, ObservableSource<? extends String>> drm = new drM<dpR, ObservableSource<? extends String>>() { // from class: com.netflix.mediaclient.ui.profile.impl.MyNetflixTab$observeImageUrlChanged$2
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final ObservableSource<? extends String> invoke(dpR dpr) {
                String i;
                C8632dsu.c((Object) dpr, "");
                i = C5845cKm.this.i();
                return Observable.just(i);
            }
        };
        Observable<String> distinctUntilChanged = observable.mergeWith(a.switchMap(new Function() { // from class: o.cKy
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource b2;
                b2 = C5845cKm.b(drM.this, obj);
                return b2;
            }
        })).distinctUntilChanged();
        C8632dsu.a(distinctUntilChanged, "");
        return distinctUntilChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(C5845cKm c5845cKm) {
        C8632dsu.c((Object) c5845cKm, "");
        return c5845cKm.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    @Override // o.InterfaceC9934zO
    public Intent b(AppView appView) {
        return this.h.e();
    }

    @Override // o.InterfaceC9934zO
    public boolean e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return C8153dex.B();
    }

    @Override // o.InterfaceC9934zO
    public Observable<AbstractC9927zH> b(final Activity activity) {
        C8632dsu.c((Object) activity, "");
        PublishSubject create = PublishSubject.create();
        C8632dsu.a(create, "");
        final b bVar = new b(create);
        Observable<AbstractC9927zH> doFinally = Observable.combineLatest(create.startWith(dpR.c), AbstractC7233csO.j(), new BiFunction() { // from class: o.cKq
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                AbstractC9927zH d;
                d = C5845cKm.d(C5845cKm.this, activity, (dpR) obj, (AbstractC7233csO) obj2);
                return d;
            }
        }).doFinally(new Action() { // from class: o.cKr
            @Override // io.reactivex.functions.Action
            public final void run() {
                C5845cKm.a(activity, bVar);
            }
        });
        C8632dsu.a(doFinally, "");
        return doFinally;
    }

    /* renamed from: o.cKm$b */
    /* loaded from: classes4.dex */
    public static final class b extends BroadcastReceiver {
        final /* synthetic */ PublishSubject<dpR> b;

        b(PublishSubject<dpR> publishSubject) {
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
    public static final AbstractC9927zH d(C5845cKm c5845cKm, Activity activity, dpR dpr, AbstractC7233csO abstractC7233csO) {
        C8632dsu.c((Object) c5845cKm, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) dpr, "");
        C8632dsu.c((Object) abstractC7233csO, "");
        return c5845cKm.a.e(abstractC7233csO, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, b bVar) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) bVar, "");
        LocalBroadcastManager.getInstance(activity).unregisterReceiver(bVar);
    }

    @Override // o.InterfaceC9934zO
    public Observable<Boolean> g() {
        Observable<Boolean> defer = Observable.defer(new Callable() { // from class: o.cKt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ObservableSource j;
                j = C5845cKm.j(C5845cKm.this);
                return j;
            }
        });
        C8632dsu.a(defer, "");
        return defer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource j(C5845cKm c5845cKm) {
        C8632dsu.c((Object) c5845cKm, "");
        String a = c5845cKm.g.a();
        Observable<Integer> startWith = C8119deP.a(a).startWith(Integer.valueOf(C8119deP.d(a)));
        final MyNetflixTab$observeShowBottomBadge$1$1 myNetflixTab$observeShowBottomBadge$1$1 = new drM<Integer, Boolean>() { // from class: com.netflix.mediaclient.ui.profile.impl.MyNetflixTab$observeShowBottomBadge$1$1
            @Override // o.drM
            public /* synthetic */ Boolean invoke(Integer num) {
                return a(num.intValue());
            }

            public final Boolean a(int i) {
                return Boolean.valueOf(i > 0);
            }
        };
        return startWith.map(new Function() { // from class: o.cKp
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean c;
                c = C5845cKm.c(drM.this, obj);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Boolean) drm.invoke(obj);
    }

    @Override // o.InterfaceC9934zO
    public boolean c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        if (C8153dex.B()) {
            return C8632dsu.c(this.i.d(), activity.getClass()) || InterfaceC9934zO.a.a(this, activity);
        }
        return InterfaceC9934zO.a.a(this, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i() {
        String avatarUrl;
        InterfaceC5283bvo b2 = C8126deW.b();
        return (b2 == null || (avatarUrl = b2.getAvatarUrl()) == null) ? "" : avatarUrl;
    }
}
