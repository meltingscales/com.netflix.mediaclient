package o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AllocationMode;
import com.netflix.cl.model.ComputationMode;
import com.netflix.cl.model.InteractionMode;
import com.netflix.cl.model.context.ProcessState;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.ProcessStateTransition;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.netflix.mediaclient.ui.launch.UIWebViewActivity;
import com.netflix.mediaclient.ui.launch.UIWebViewTabletActivity;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import o.InterfaceC5844cKl;

/* renamed from: o.dhI  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8271dhI extends C1045Mp {
    private static boolean a;
    private static boolean e;
    private static ProcessStateTransition h;
    private static long i;
    private static ProcessState j;
    public static final C8271dhI c = new C8271dhI();
    private static final ArrayList<Long> k = new ArrayList<>();
    private static boolean g = true;
    private static final d b = new d();
    private static final C1076Nu f = new a();
    public static final int d = 8;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.dhI$e */
    /* loaded from: classes.dex */
    public interface e {
        C8312dhx t();
    }

    private C8271dhI() {
        super("ProcessStateLoggingManager");
    }

    /* renamed from: o.dhI$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC8058ddH {
        d() {
        }

        @Override // o.AbstractC8058ddH, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C8632dsu.c((Object) activity, "");
            super.onActivityCreated(activity, bundle);
            C8271dhI c8271dhI = C8271dhI.c;
            c8271dhI.getLogTag();
            if (activity instanceof LaunchActivity) {
                c8271dhI.d();
            }
            NetflixApplication.getInstance().unregisterActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        if (a) {
            return;
        }
        c.a(true);
    }

    public final void e(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        if (e || !((netflixActivity instanceof LaunchActivity) || (netflixActivity instanceof UIWebViewActivity) || (netflixActivity instanceof UIWebViewTabletActivity) || (netflixActivity instanceof HomeActivity) || c(netflixActivity))) {
            b();
            e = false;
        }
    }

    private final void b(ProcessState processState) {
        synchronized (this) {
            long j2 = i;
            if (j2 > 0) {
                k.add(Long.valueOf(j2));
            }
            j = processState;
            i = Logger.INSTANCE.addContext(processState);
            getLogTag();
        }
    }

    /* renamed from: o.dhI$a */
    /* loaded from: classes.dex */
    public static final class a extends C1076Nu {
        a() {
        }

        @Override // o.C1076Nu, o.InterfaceC1072Nq
        public void a(NC nc, boolean z) {
            C8632dsu.c((Object) nc, "");
            C8271dhI.c.a(z);
        }
    }

    private final boolean c(Activity activity) {
        InterfaceC5844cKl.a aVar = InterfaceC5844cKl.b;
        C1332Xp c1332Xp = C1332Xp.b;
        return aVar.b((Context) C1332Xp.b(Context.class)).b(activity);
    }

    public static final void c() {
        synchronized (C8271dhI.class) {
            c.getLogTag();
            i = 0L;
            j = null;
            k.clear();
            h = null;
            a = false;
            e = false;
        }
    }

    public static final void e() {
        C8271dhI c8271dhI = c;
        c8271dhI.getLogTag();
        NetflixApplication.getInstance().D().c(f);
        c8271dhI.b(new ProcessState(AllocationMode.none, InteractionMode.none, ComputationMode.none));
        new Handler().postDelayed(new Runnable() { // from class: o.dhH
            @Override // java.lang.Runnable
            public final void run() {
                C8271dhI.f();
            }
        }, 5000L);
        NetflixApplication.getInstance().registerActivityLifecycleCallbacks(b);
    }

    private final void h() {
        Long l;
        if (h == null) {
            Context d2 = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d2, "");
            ((e) EntryPointAccessors.fromApplication(d2, e.class)).t().b();
            NetflixApplication.getInstance().registerActivityLifecycleCallbacks(b);
            if (g) {
                g = false;
                l = Long.valueOf(System.currentTimeMillis());
            } else {
                l = null;
            }
            ProcessStateTransition processStateTransition = new ProcessStateTransition(l, null, null, null, null);
            h = processStateTransition;
            Logger.INSTANCE.startSession(processStateTransition);
            getLogTag();
            return;
        }
        getLogTag();
    }

    public static final void b() {
        ProcessStateTransition processStateTransition = h;
        if (processStateTransition == null) {
            c.getLogTag();
            return;
        }
        if (Session.doesSessionExist(processStateTransition != null ? Long.valueOf(processStateTransition.getSessionId()) : null)) {
            Logger logger = Logger.INSTANCE;
            ProcessStateTransition processStateTransition2 = h;
            logger.endSession(Session.createSessionEndedEvent(processStateTransition2 != null ? Long.valueOf(processStateTransition2.getSessionId()) : null));
            C8271dhI c8271dhI = c;
            c8271dhI.getLogTag();
            c8271dhI.i();
        }
        h = null;
    }

    private final void i() {
        synchronized (this) {
            for (Number number : k) {
                Logger.INSTANCE.removeContext(Long.valueOf(number.longValue()));
                c.getLogTag();
            }
            k.clear();
        }
    }

    public final void d() {
        getLogTag();
        if (!a || e) {
            b(new ProcessState(AllocationMode.normal, InteractionMode.direct, ComputationMode.normal));
            h();
            a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(boolean z) {
        getLogTag();
        e = true;
        if (z) {
            b(new ProcessState(AllocationMode.reduced, InteractionMode.none, ComputationMode.normal));
            Logger logger = Logger.INSTANCE;
            logger.removeExclusiveContext("DeepLinkInput");
            logger.removeExclusiveContext("DeepLinkSharedContext");
        } else {
            b(new ProcessState(AllocationMode.normal, InteractionMode.indirect, ComputationMode.normal));
        }
        h();
        b();
        Logger.INSTANCE.flush();
    }
}
