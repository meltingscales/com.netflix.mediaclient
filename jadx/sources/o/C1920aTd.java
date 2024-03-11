package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.netflix.cl.Logger;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.service.logging.logblob.StartupErrorTracker;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Completable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.C8632dsu;
import o.InterfaceC4005bSs;
import o.InterfaceC7407cvd;
import o.aSY;
import o.dpR;

/* renamed from: o.aTd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1920aTd implements NetflixJobExecutor {
    private final aOV a;
    private final CompositeDisposable d;
    private final InterfaceC1929aTm f;
    private final InterfaceC4208baF g;
    private final C8165dfI h;
    private final PublishSubject<dpR> i;
    private final InterfaceC1912aSw j;
    private final UserAgent l;
    private final a n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13443o;
    public static final b e = new b(null);
    public static final int b = 8;
    private static final long c = TimeUnit.HOURS.toMillis(4);

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.aTd$e */
    /* loaded from: classes3.dex */
    public interface e {
        aSY.c ac();
    }

    public static final C1920aTd e(InterfaceC1929aTm interfaceC1929aTm, InterfaceC1912aSw interfaceC1912aSw, UserAgent userAgent, InterfaceC4208baF interfaceC4208baF, aOV aov) {
        return e.e(interfaceC1929aTm, interfaceC1912aSw, userAgent, interfaceC4208baF, aov);
    }

    public C1920aTd(InterfaceC1929aTm interfaceC1929aTm, InterfaceC1912aSw interfaceC1912aSw, UserAgent userAgent, InterfaceC4208baF interfaceC4208baF, aOV aov) {
        C8632dsu.c((Object) interfaceC1929aTm, "");
        C8632dsu.c((Object) interfaceC1912aSw, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) interfaceC4208baF, "");
        C8632dsu.c((Object) aov, "");
        this.f = interfaceC1929aTm;
        this.j = interfaceC1912aSw;
        this.l = userAgent;
        this.g = interfaceC4208baF;
        this.a = aov;
        this.d = new CompositeDisposable();
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.i = create;
        this.n = new a();
        this.h = new C8165dfI(4, TimeUnit.MINUTES.toMillis(60L));
        AbstractApplicationC1040Mh.getInstance().i().b(new Runnable() { // from class: o.aTf
            @Override // java.lang.Runnable
            public final void run() {
                C1920aTd.e(C1920aTd.this);
            }
        });
    }

    /* renamed from: o.aTd$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("InsomniaJobScheduler");
        }

        public final C1920aTd e(InterfaceC1929aTm interfaceC1929aTm, InterfaceC1912aSw interfaceC1912aSw, UserAgent userAgent, InterfaceC4208baF interfaceC4208baF, aOV aov) {
            C8632dsu.c((Object) interfaceC1929aTm, "");
            C8632dsu.c((Object) interfaceC1912aSw, "");
            C8632dsu.c((Object) userAgent, "");
            C8632dsu.c((Object) interfaceC4208baF, "");
            C8632dsu.c((Object) aov, "");
            return new C1920aTd(interfaceC1929aTm, interfaceC1912aSw, userAgent, interfaceC4208baF, aov);
        }
    }

    /* renamed from: o.aTd$a */
    /* loaded from: classes.dex */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            C1920aTd.this.e(intent);
        }
    }

    private final boolean h() {
        return this.a.D() != 0 && StartupErrorTracker.a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C1920aTd c1920aTd) {
        C8632dsu.c((Object) c1920aTd, "");
        c1920aTd.d();
    }

    private final void d() {
        if (h()) {
            C8116deM.c(AbstractApplicationC1040Mh.d(), this.n, null, "com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE", "com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE");
            g();
            return;
        }
        a();
    }

    private final long b() {
        return this.a.D() > 0 ? TimeUnit.HOURS.toMillis(this.a.D()) : c;
    }

    private final void g() {
        this.f.d(NetflixJob.e(b()));
    }

    private final void a() {
        this.f.b(NetflixJob.NetflixJobId.INSOMNIA);
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStartJob(NetflixJob.NetflixJobId netflixJobId) {
        C8632dsu.c((Object) netflixJobId, "");
        this.f13443o = false;
        f();
        HashMap<String, String> hashMap = new HashMap<>();
        boolean d = this.h.d();
        e.getLogTag();
        if (d) {
            hashMap.put("status", "tooFrequent");
            d(IClientLogging.CompletionReason.canceled, hashMap, false);
            a();
        } else if (!this.l.v()) {
            hashMap.put("status", "userNotLoggedIn");
            d(IClientLogging.CompletionReason.canceled, hashMap, false);
        } else if (AbstractApplicationC1040Mh.getInstance().o().i()) {
            hashMap.put("status", "appInForeground");
            d(IClientLogging.CompletionReason.canceled, hashMap, false);
        } else {
            c(hashMap);
        }
    }

    protected void c(final HashMap<String, String> hashMap) {
        List j;
        InterfaceC4245baq k;
        C8632dsu.c((Object) hashMap, "");
        InterfaceC7407cvd.b bVar = InterfaceC7407cvd.d;
        Context d = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d, "");
        if (bVar.d(d).a() && (k = this.g.k()) != null) {
            k.b();
        }
        CompositeDisposable compositeDisposable = this.d;
        j = C8569dql.j(c(), j());
        Completable mergeDelayError = Completable.mergeDelayError(j);
        C8632dsu.a(mergeDelayError, "");
        DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy(mergeDelayError, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.service.job.InsomniaJobScheduler$runJob$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C8632dsu.c((Object) th, "");
                hashMap.put("status", "runJobError");
                this.d(IClientLogging.CompletionReason.failed, hashMap, true);
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.service.job.InsomniaJobScheduler$runJob$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                hashMap.put("status", "success");
                this.d(IClientLogging.CompletionReason.success, hashMap, false);
            }
        }));
        Logger.INSTANCE.flush();
    }

    private final Completable c() {
        InterfaceC5283bvo j = this.l.j();
        if (j == null) {
            Completable complete = Completable.complete();
            C8632dsu.a(complete, "");
            return complete;
        }
        Context d = AbstractApplicationC1040Mh.d();
        if (!ConnectivityUtils.l(d)) {
            Completable complete2 = Completable.complete();
            C8632dsu.a(complete2, "");
            return complete2;
        }
        InterfaceC4005bSs.e eVar = InterfaceC4005bSs.a;
        C8632dsu.d(d);
        return eVar.a(d, j).e(1, null, true, false, false);
    }

    private final Completable j() {
        Context d = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d, "");
        return ((e) EntryPointAccessors.fromApplication(d, e.class)).ac().c(new cQF(), new cQQ()).c();
    }

    public void d(IClientLogging.CompletionReason completionReason, HashMap<String, String> hashMap, boolean z) {
        C8632dsu.c((Object) completionReason, "");
        C8632dsu.c((Object) hashMap, "");
        Context d = AbstractApplicationC1040Mh.d();
        hashMap.put("isCellular", String.valueOf(ConnectivityUtils.p(d) && ConnectivityUtils.k(d) && !ConnectivityUtils.m(d)));
        long currentTimeMillis = System.currentTimeMillis();
        C1932aTp c1932aTp = C1932aTp.b;
        C8632dsu.d(d);
        SharedPreferences a2 = c1932aTp.a(d);
        hashMap.put("timeSinceLastJobInMins", String.valueOf(TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis - a2.getLong("insomnia_last_job_timestamp", currentTimeMillis))));
        hashMap.put("isColdStart", String.valueOf(aSW.b.d(AbstractApplicationC1040Mh.getInstance().o().i())));
        hashMap.put("reason", completionReason.name());
        this.f.e(NetflixJob.NetflixJobId.INSOMNIA, z);
        e(hashMap);
        a2.edit().putLong("insomnia_last_job_timestamp", currentTimeMillis).commit();
        if (completionReason != IClientLogging.CompletionReason.success || z) {
            return;
        }
        aSC.b(d, null);
    }

    private final void f() {
        C1332Xp c1332Xp = C1332Xp.b;
        ((InterfaceC1985aVp) C1332Xp.b(InterfaceC1985aVp.class)).d(Sessions.INSOMNIA);
    }

    private final void e(HashMap<String, String> hashMap) {
        C1332Xp c1332Xp = C1332Xp.b;
        ((InterfaceC1985aVp) C1332Xp.b(InterfaceC1985aVp.class)).d(Sessions.INSOMNIA, hashMap);
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStopJob(NetflixJob.NetflixJobId netflixJobId) {
        C8632dsu.c((Object) netflixJobId, "");
        this.f13443o = true;
        this.i.onComplete();
        this.d.clear();
    }

    public final void e() {
        C8116deM.a(AbstractApplicationC1040Mh.d(), this.n);
        this.i.onComplete();
        this.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Intent intent) {
        String b2 = C8116deM.b(intent);
        if (b2 == null) {
            return;
        }
        if (C8632dsu.c((Object) b2, (Object) "com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE")) {
            g();
        } else if (C8632dsu.c((Object) b2, (Object) "com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE")) {
            a();
        }
    }
}
