package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RetryPolicyCL;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC8248dgm;
import o.aTH;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class aTH extends C1076Nu implements aTN {
    protected final Context a;
    protected aTP b;
    protected ScheduledExecutorService c;
    protected InterfaceC8248dgm d;
    protected final aOV e;
    protected NC f;
    protected final C1948aUe h;
    protected aUF i;
    protected final UserAgent k;
    protected final AtomicBoolean g = new AtomicBoolean(false);
    protected final List<String> m = Collections.synchronizedList(new ArrayList());
    private Runnable l = new Runnable() { // from class: o.aTK
        @Override // java.lang.Runnable
        public final void run() {
            aTH.this.r();
        }
    };
    protected final BroadcastReceiver n = new BroadcastReceiver() { // from class: o.aTH.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED".equals(action)) {
                aTH.this.g.set(true);
            } else if ("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED".equals(action)) {
                aTH.this.g.set(false);
                aTH.this.j();
            }
        }
    };
    protected long j = C8157dfA.b(AbstractApplicationC1040Mh.d(), "preference_retry_attempted_for_cl_in_ms", 0L);

    protected abstract AbstractC8152dew d();

    protected abstract void d(Intent intent);

    protected abstract void e();

    protected abstract void e(String str, String str2, String str3, aUA aua);

    protected abstract String g();

    protected abstract void j();

    private void s() {
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            this.j = currentTimeMillis;
            C8157dfA.e(AbstractApplicationC1040Mh.d(), "preference_retry_attempted_for_cl_in_ms", currentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aTH(Context context, C1948aUe c1948aUe, UserAgent userAgent, aOV aov) {
        this.h = c1948aUe;
        this.k = userAgent;
        this.b = new aTP(aov);
        this.a = context;
        this.e = aov;
        this.i = new aUF(aov, userAgent);
    }

    @Override // o.aTN
    public void e(ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
        this.f = AbstractApplicationC1040Mh.getInstance().o();
        e();
        Intent b = this.f.b();
        C1044Mm.e("nf_log_cl", "Add ICL manager as listener on user input...");
        this.f.c(this);
        C1044Mm.e("nf_log_cl", "Add ICL manager as listener on user input done.");
        a();
        n();
        d(b);
    }

    @Override // o.aTN
    public void b() {
        NC nc = this.f;
        if (nc != null) {
            nc.a(this);
        }
        k();
    }

    private void a() {
        C1044Mm.e("nf_log_cl", "ICLManager::init data repository started ");
        File file = new File(this.a.getFilesDir(), g());
        file.mkdirs();
        this.d = new C8249dgn(file, q());
        C1044Mm.e("nf_log_cl", "ICLManager::init data repository done ");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        if (!t()) {
            C1044Mm.e("nf_log_cl", "Leave re-try to next trigger...");
        } else if (d().P_()) {
            this.c.schedule(this.l, 15L, TimeUnit.SECONDS);
        } else {
            this.c.execute(this.l);
        }
    }

    private boolean t() {
        long j = this.j;
        long retryTimeoutInHours = Config_FastProperty_RetryPolicyCL.getRetryTimeoutInHours() * 3600000;
        if (this.j <= 0) {
            C1044Mm.e("nf_log_cl", "We never tried to re-deliver saved events, do it now.");
            return true;
        } else if (C8175dfS.d(retryTimeoutInHours, j)) {
            C1044Mm.e("nf_log_cl", "Last time we tried to re-deliver saved events: " + (j / 3600000) + " hours ago. Do it now.");
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        C1044Mm.e("nf_log_cl", "Check if we have not delivered events from last time our app was runnung...");
        this.d.c(new InterfaceC8248dgm.b() { // from class: o.aTJ
            @Override // o.InterfaceC8248dgm.b
            public final void d(InterfaceC8248dgm.d[] dVarArr) {
                aTH.this.e(dVarArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(InterfaceC8248dgm.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length > 0) {
            d(dVarArr, false);
        } else {
            C1044Mm.e("nf_log_cl", "No saved payloads found.");
        }
    }

    @Override // o.aTN
    public void h() {
        if (this.d == null || !ConnectivityUtils.n(this.a)) {
            return;
        }
        C1044Mm.e("nf_log_cl", "Device is connected, lets see if we need to deliver cached events...");
        InterfaceC8248dgm.d[] b = this.d.b();
        if (b != null || b.length > 0) {
            if (Config_FastProperty_RetryPolicyCL.shouldRetryAllFailuresWhenNetworkAvailable()) {
                C1044Mm.a("nf_log_cl", "We found %d cached log entries, network is connected, policy requires attempt to delive saved payloads. Lets try to deliver them", Integer.valueOf(b.length));
                d(b, false);
                return;
            }
            C1044Mm.a("nf_log_cl", "We found %d cached log entries, network is connected, but policy forbid attempt to delive saved payloads. Do nothing.", Integer.valueOf(b.length));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void i(final String str) {
        this.d.c(str, new InterfaceC8248dgm.e() { // from class: o.aTH.5
            @Override // o.InterfaceC8248dgm.e
            public void d(String str2, String str3, byte[] bArr, long j) {
                if (bArr == null || bArr.length < 1) {
                    C1044Mm.d("nf_log_cl", "We failed to retrieve payload. Trying to delete it");
                    aTH.this.d(str);
                    return;
                }
                try {
                    String e = aTH.this.e(bArr);
                    aTH ath = aTH.this;
                    ath.e(str, str3, e, new d(e));
                } catch (Throwable th) {
                    C1044Mm.e("nf_log_cl", "Failed to send events. Try to delete it.", th);
                    aTH.this.d(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(byte[] bArr) {
        String str = new String(bArr, "utf-8");
        if (!Config_FastProperty_RetryPolicyCL.shouldUpdateEnvelopeSendTimeOnResend()) {
            C1044Mm.e("nf_log_cl", "We are not updating envelope send time per CL policy");
            return str;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("clientSendTime")) {
            jSONObject.put("clientSendTime", C8150deu.b());
            return jSONObject.toString();
        }
        C1044Mm.d("nf_log_cl", "SendTime can not be updated, property not found, not valid enveloper!");
        throw new IllegalStateException("SendTime can not be updated, property not found, not valid enveloper!");
    }

    @Override // o.aTN
    public void o() {
        d().h();
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(String str) {
        try {
            return this.d.b(String.valueOf(System.currentTimeMillis()), str.getBytes("utf-8"), this.k.g());
        } catch (Throwable th) {
            C1044Mm.e("nf_log_cl", "Failed to save payload to repository", th);
            return null;
        }
    }

    protected void d(final String str) {
        if (C8168dfL.g(str)) {
            return;
        }
        this.c.execute(new Runnable() { // from class: o.aTG
            @Override // java.lang.Runnable
            public final void run() {
                aTH.this.f(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void f(String str) {
        C8166dfJ.c();
        try {
            this.m.remove(str);
            this.d.e(str);
        } catch (Throwable th) {
            C1044Mm.e("nf_log_cl", "Failed to remove payload from repository", th);
        }
    }

    protected void d(InterfaceC8248dgm.d[] dVarArr, boolean z) {
        if (dVarArr == null || dVarArr.length < 1) {
            C1044Mm.e("nf_log_cl", "No saved events found");
            return;
        }
        long undeliveredPayloadExpirationInHours = Config_FastProperty_RetryPolicyCL.getUndeliveredPayloadExpirationInHours();
        boolean isRetryDisabled = Config_FastProperty_RetryPolicyCL.isRetryDisabled();
        for (InterfaceC8248dgm.d dVar : dVarArr) {
            final String e = dVar.e();
            if (isRetryDisabled) {
                C1044Mm.j("nf_log_cl", "Retry is disabled, remove saved payload.");
                d(e);
            } else {
                C1044Mm.e("nf_log_cl", "Retry is enabled, process saved payload for retry...");
                if (this.m.contains(e)) {
                    C1044Mm.j("nf_log_cl", "We are already trying to deliver %s deliveryRequestId, skip", e);
                } else if (C8128deY.c(dVar, 3600000 * undeliveredPayloadExpirationInHours)) {
                    C1044Mm.j("nf_log_cl", "Drop too old %s deliveryRequestId, skip", e);
                    d(e);
                } else {
                    this.m.add(e);
                    if (z) {
                        this.c.schedule(new Runnable() { // from class: o.aTI
                            @Override // java.lang.Runnable
                            public final void run() {
                                aTH.this.e(e);
                            }
                        }, this.h.c(), TimeUnit.MILLISECONDS);
                    } else {
                        this.c.execute(new Runnable() { // from class: o.aTF
                            @Override // java.lang.Runnable
                            public final void run() {
                                aTH.this.i(e);
                            }
                        });
                    }
                }
            }
        }
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long i() {
        aOV aov = this.e;
        if (aov == null) {
            return 1800000L;
        }
        return aov.h() * 1000;
    }

    public boolean canSendEvent(String str) {
        return this.b.e(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        if (d().a()) {
            C1044Mm.e("nf_log_cl", "Events were send recently. We reached timeout, force send");
        }
    }

    protected void n() {
        C8116deM.c(this.a, this.n, "com.netflix.mediaclient.intent.category.PLAYER", "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED", "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED");
    }

    protected void k() {
        C8116deM.a(this.a, this.n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public class d implements aUA {
        public d(String str) {
        }

        @Override // o.aUA
        public void onEventsDeliveryFailed(final String str) {
            if (C8168dfL.g(str)) {
                return;
            }
            if (Config_FastProperty_RetryPolicyCL.isRetryDisabled()) {
                C1044Mm.j("nf_log_cl", "Retry is disabled, remove saved payload.");
                aTH.this.d(str);
            } else {
                C1044Mm.e("nf_log_cl", "Retry is enabled, keep saved payload on failure...");
            }
            aTH.this.m.remove(str);
            if (Config_FastProperty_RetryPolicyCL.shouldRetryOnFailureToDeliver()) {
                C1044Mm.e("nf_log_cl", "On failure to deliver CL payload, policy requres retry on spot.");
                aTH.this.c.schedule(new Runnable() { // from class: o.aTL
                    @Override // java.lang.Runnable
                    public final void run() {
                        aTH.d.this.d(str);
                    }
                }, aTH.this.h.c(), TimeUnit.MILLISECONDS);
                return;
            }
            C1044Mm.e("nf_log_cl", "On failure to deliver CL payload, postponing retry.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str) {
            aTH.this.i(str);
        }

        @Override // o.aUA
        public void onEventsDelivered(String str) {
            aTH.this.h.d();
            aTH.this.d(str);
        }
    }
}
