package o;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.netflix.cl.Logger;
import com.netflix.cl.model.context.UserInputTime;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.netflix.mediaclient.ui.launch.UIWebViewActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class NB implements NC, Application.ActivityLifecycleCallbacks {
    private static final ThreadFactory c = new ThreadFactory() { // from class: o.NB.4
        private final AtomicInteger b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "UserInputManager #" + this.b.getAndIncrement());
        }
    };
    private final AtomicInteger a;
    private final AtomicBoolean b;
    private final AtomicInteger d;
    final List<InterfaceC1072Nq> e;
    private final AtomicLong f;
    private final AtomicBoolean g;
    private final ScheduledExecutorService h;
    private Intent j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static final NB c = new NB();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static NB c() {
        return b.c;
    }

    private NB() {
        this.f = new AtomicLong(SystemClock.elapsedRealtime());
        this.e = Collections.synchronizedList(new ArrayList());
        this.d = new AtomicInteger();
        this.a = new AtomicInteger();
        this.b = new AtomicBoolean();
        this.g = new AtomicBoolean(false);
        this.h = Executors.newSingleThreadScheduledExecutor(c);
    }

    @Override // o.NC
    public boolean c(InterfaceC1072Nq interfaceC1072Nq) {
        synchronized (this) {
            if (!this.e.contains(interfaceC1072Nq)) {
                return this.e.add(interfaceC1072Nq);
            }
            C1044Mm.d("nf_input", "Listener already exist");
            return false;
        }
    }

    @Override // o.NC
    public boolean a(InterfaceC1072Nq interfaceC1072Nq) {
        return this.e.remove(interfaceC1072Nq);
    }

    @Override // o.NC
    public void d(boolean z) {
        if (z) {
            Logger.INSTANCE.addContext(new UserInputTime(Long.valueOf(System.currentTimeMillis())));
        }
        this.f.set(SystemClock.elapsedRealtime());
    }

    private void c(int i) {
        if (i == 1) {
            C1044Mm.e("nf_input", "UI may just started, only one activity");
            final long currentTimeMillis = System.currentTimeMillis();
            this.h.execute(new Runnable() { // from class: o.NB.3
                @Override // java.lang.Runnable
                public void run() {
                    Logger.INSTANCE.addContext(new UserInputTime(Long.valueOf(currentTimeMillis)));
                    for (InterfaceC1072Nq interfaceC1072Nq : NB.this.e) {
                        interfaceC1072Nq.b(NB.this);
                    }
                }
            });
        }
    }

    private void d(int i) {
        if (i == 0) {
            C1044Mm.e("nf_input", "UI is  gone");
            this.h.execute(new Runnable() { // from class: o.NB.2
                @Override // java.lang.Runnable
                public void run() {
                    for (InterfaceC1072Nq interfaceC1072Nq : NB.this.e) {
                        interfaceC1072Nq.d(NB.this);
                    }
                }
            });
        }
    }

    private boolean n() {
        synchronized (this) {
            if (this.e.isEmpty()) {
                return false;
            }
            for (InterfaceC1072Nq interfaceC1072Nq : this.e) {
                C1044Mm.e("nf_input", "isSuspendLoggingReady: listener " + interfaceC1072Nq);
                if (interfaceC1072Nq instanceof aTN) {
                    C1044Mm.e("nf_input", "Logger ready!");
                    return true;
                }
            }
            return false;
        }
    }

    private void c(Activity activity, final Intent intent, boolean z) {
        synchronized (this) {
            if (!z) {
                C1044Mm.e("nf_input", "Our app was in background");
            } else if (intent == null) {
                C1044Mm.e("nf_input", "Our app is in foreground already and we do not have a deep link");
                return;
            } else {
                C1044Mm.e("nf_input", "Our app is in foreground already, deep link most likely");
            }
            if (n()) {
                final long currentTimeMillis = System.currentTimeMillis();
                C1044Mm.e("nf_input", "We are initialized, report...");
                this.h.execute(new Runnable() { // from class: o.NB.5
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.INSTANCE.addContext(new UserInputTime(Long.valueOf(currentTimeMillis)));
                        for (InterfaceC1072Nq interfaceC1072Nq : NB.this.e) {
                            interfaceC1072Nq.c(NB.this, intent);
                        }
                    }
                });
            } else if (intent != null) {
                C1044Mm.b("nf_input", "Logger is not ready, cold start, save intent", intent);
                this.j = intent;
            }
        }
    }

    private void d(final Activity activity) {
        if (i()) {
            C1044Mm.e("nf_input", "Our app is still in foreground!");
            return;
        }
        C1044Mm.e("nf_input", "Our app is in background now");
        this.h.execute(new Runnable() { // from class: o.NB.1
            @Override // java.lang.Runnable
            public void run() {
                for (InterfaceC1072Nq interfaceC1072Nq : NB.this.e) {
                    interfaceC1072Nq.a(NB.this, activity.isFinishing());
                }
                Logger.INSTANCE.removeExclusiveContext(UserInputTime.class);
            }
        });
    }

    private void a(Activity activity) {
        i();
        if (this.a.get() > 0) {
            C1044Mm.e("nf_input", "Our app UI still has focus!");
            return;
        }
        C1044Mm.e("nf_input", "Our app UI lost focus");
        this.h.execute(new Runnable() { // from class: o.NB.9
            @Override // java.lang.Runnable
            public void run() {
                for (InterfaceC1072Nq interfaceC1072Nq : NB.this.e) {
                    interfaceC1072Nq.e(NB.this);
                }
            }
        });
    }

    private void c(Activity activity) {
        i();
        if (this.a.get() <= 0) {
            C1044Mm.e("nf_input", "Our app UI was not in focus!");
            this.h.execute(new Runnable() { // from class: o.NB.7
                @Override // java.lang.Runnable
                public void run() {
                    for (InterfaceC1072Nq interfaceC1072Nq : NB.this.e) {
                        interfaceC1072Nq.c(NB.this);
                    }
                }
            });
            return;
        }
        C1044Mm.e("nf_input", "Our app UI had focus before!");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        c(this.d.incrementAndGet());
        this.g.set(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        d(this.d.decrementAndGet());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (C1588aGw.a(activity.getApplicationContext()).a(activity)) {
            C1044Mm.e("nf_input", "NetflixComLaunchActivity, ignore");
        } else {
            a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (C1588aGw.a(activity.getApplicationContext()).a(activity)) {
            C1044Mm.e("nf_input", "NetflixComLaunchActivity, ignore");
        } else {
            c(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (C1588aGw.a(activity.getApplicationContext()).a(activity)) {
            C1044Mm.e("nf_input", "NetflixComLaunchActivity, ignore");
            return;
        }
        boolean i = i();
        this.a.incrementAndGet();
        if ((activity instanceof UIWebViewActivity) || (activity instanceof LaunchActivity)) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                C1044Mm.b("nf_input", "LaunchActivity: Foreground with intent", intent);
            } else {
                C1044Mm.e("nf_input", "LaunchActivity: Foreground without intent");
            }
            c(activity, intent, i);
            return;
        }
        c(activity, null, i);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (C1588aGw.a(activity.getApplicationContext()).a(activity)) {
            C1044Mm.e("nf_input", "NetflixComLaunchActivity, ignore");
            return;
        }
        this.a.decrementAndGet();
        d(activity);
    }

    @Override // o.NC
    public long a() {
        return SystemClock.elapsedRealtime() - this.f.get();
    }

    @Override // o.NC
    public void d() {
        m();
    }

    private void m() {
        C8082ddf.d(a());
        C1081Nz.d.d(a());
    }

    @Override // o.NC
    public boolean i() {
        return this.a.get() > 0;
    }

    @Override // o.NC
    public boolean h() {
        return !i();
    }

    @Override // o.NC
    public Intent b() {
        Intent intent;
        synchronized (this) {
            intent = this.j;
            this.j = null;
        }
        return intent;
    }

    @Override // o.NC
    public int e() {
        return this.d.get();
    }

    public void c(boolean z) {
        this.b.set(z);
    }

    @Override // o.NC
    public boolean f() {
        return this.b.get();
    }

    public boolean g() {
        int e = e();
        boolean z = this.g.get();
        C1044Mm.a("nf_input", "isForegroundAppLaunch:: Number of activities count = %d, foreground launch %b", Integer.valueOf(e), Boolean.valueOf(z));
        return z;
    }

    @Override // o.NC
    public boolean j() {
        return !g();
    }
}
