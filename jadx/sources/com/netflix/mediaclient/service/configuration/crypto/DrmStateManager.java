package com.netflix.mediaclient.service.configuration.crypto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Crypto;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C1076Nu;
import o.C1852aQq;
import o.NC;
import o.aPB;
import o.aPC;

/* loaded from: classes3.dex */
public class DrmStateManager extends C1076Nu {
    private NC h;
    private Runnable j;
    private List<aPC.a> e = new ArrayList();
    private State i = State.notSuspended;
    private final Handler c = new Handler(Looper.getMainLooper());
    private AtomicBoolean d = new AtomicBoolean(false);
    private AtomicBoolean a = new AtomicBoolean(false);
    private AtomicBoolean f = new AtomicBoolean(false);
    private final BroadcastReceiver b = new BroadcastReceiver() { // from class: com.netflix.mediaclient.service.configuration.crypto.DrmStateManager.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C1044Mm.b("nf_msl_DrmStateManager", "Received intent ", intent);
            String action = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.LOG_PAUSE_EVENTS_DELIVERY".equals(action)) {
                C1044Mm.e("nf_msl_DrmStateManager", "Playback started!");
                DrmStateManager.this.a.set(true);
            } else if ("com.netflix.mediaclient.intent.action.LOG_RESUME_EVENTS_DELIVERY".equals(action)) {
                C1044Mm.e("nf_msl_DrmStateManager", "Playback stopped!");
                DrmStateManager.this.a.set(false);
                if (DrmStateManager.this.f.getAndSet(false)) {
                    DrmStateManager.this.a();
                }
            }
        }
    };

    /* loaded from: classes3.dex */
    public enum State {
        notSuspended,
        suspended,
        inRestoration
    }

    public State b() {
        return this.i;
    }

    public void c(State state) {
        this.i = state;
    }

    public List<aPC.a> e() {
        return this.e;
    }

    public DrmStateManager() {
        NC o2 = AbstractApplicationC1040Mh.getInstance().o();
        this.h = o2;
        o2.c(this);
        j();
        i();
    }

    private void j() {
        if (this.h.i()) {
            return;
        }
        if (!c()) {
            C1044Mm.e("nf_msl_DrmStateManager", "Do NOT release DRM resources when started in background");
            return;
        }
        int suspendTimeoutForBackgroundLaunchInMs = Config_FastProperty_Crypto.getSuspendTimeoutForBackgroundLaunchInMs();
        e eVar = new e();
        this.j = eVar;
        this.c.postDelayed(eVar, suspendTimeoutForBackgroundLaunchInMs);
    }

    private void f() {
        this.d.set(false);
        this.f.set(false);
        Runnable runnable = this.j;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }

    @Override // o.C1076Nu, o.InterfaceC1072Nq
    public void c(NC nc, Intent intent) {
        if (!d()) {
            C1044Mm.e("nf_msl_DrmStateManager", "Do NOT release DRM resources on user interaction. No need for restore.");
            return;
        }
        C1044Mm.e("nf_msl_DrmStateManager", "Application in foreground, cancel timer if exist. DRM suspend enabled.");
        f();
        aPB.e().i();
    }

    @Override // o.C1076Nu, o.InterfaceC1072Nq
    public void a(NC nc, boolean z) {
        C1044Mm.e("nf_msl_DrmStateManager", "Application in background...");
        if (!d()) {
            C1044Mm.e("nf_msl_DrmStateManager", "Do NOT release DRM resources on user interaction, no need to restore DRM resources.");
            return;
        }
        synchronized (this.d) {
            if (this.j == null) {
                this.j = new e();
            }
            if (this.d.get()) {
                C1044Mm.j("nf_msl_DrmStateManager", "Suspend timeout is already pending, this should NOT happen!");
                this.c.removeCallbacks(this.j);
            } else {
                this.d.set(true);
            }
            this.c.postDelayed(this.j, Config_FastProperty_Crypto.getSuspendTimeoutForUserInteractionInMs());
        }
    }

    public static boolean c() {
        return Config_FastProperty_Crypto.shouldReleaseDrmResourcesOnSuspend() && Config_FastProperty_Crypto.shouldReleaseDrmResourcesOnSuspendForBackgroundLaunch() && C1852aQq.c();
    }

    public static boolean d() {
        return Config_FastProperty_Crypto.shouldReleaseDrmResourcesOnSuspend() && Config_FastProperty_Crypto.shouldReleaseDrmResourcesOnSuspendForUserInteraction() && C1852aQq.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        private e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DrmStateManager.this.a.get()) {
                C1044Mm.e("nf_msl_DrmStateManager", "Playback is still in progress, postpone DRM suspend...");
                DrmStateManager.this.f.set(true);
                return;
            }
            DrmStateManager.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.h.i()) {
            C1044Mm.e("nf_msl_DrmStateManager", "Application is in foreground, do NOT attempt DRM suspend!");
            f();
            return;
        }
        C1044Mm.e("nf_msl_DrmStateManager", "Application is in background, do DRM suspend!");
        aPB.e().g();
    }

    private void i() {
        C1044Mm.e("nf_msl_DrmStateManager", "Register receiver");
        IntentFilter intentFilter = new IntentFilter();
        a(intentFilter, new String[]{"com.netflix.mediaclient.intent.action.LOG_PAUSE_EVENTS_DELIVERY", "com.netflix.mediaclient.intent.action.LOG_RESUME_EVENTS_DELIVERY"});
        intentFilter.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intentFilter.setPriority(999);
        try {
            LocalBroadcastManager.getInstance(AbstractApplicationC1040Mh.d()).registerReceiver(this.b, intentFilter);
        } catch (Throwable th) {
            C1044Mm.b("nf_msl_DrmStateManager", th, "Failed to register ", new Object[0]);
        }
    }

    private void a(IntentFilter intentFilter, String[] strArr) {
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
    }
}
