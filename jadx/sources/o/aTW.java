package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RetryPolicyLogblobs;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.NqErrorStatus;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.Logblob;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.AbstractC8152dew;
import o.C1079Nx;
import o.InterfaceC8248dgm;
import o.aTW;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class aTW extends aTA implements InterfaceC1919aTc {
    protected long a;
    private final aUZ b;
    private final Context c;
    private final aOV e;
    private ScheduledExecutorService f;
    private InterfaceC8248dgm g;
    private final IClientLogging h;
    private final UserAgent k;
    private final d j = new d();
    private final List<String> i = new ArrayList();
    private final Runnable d = new AnonymousClass4();

    /* loaded from: classes3.dex */
    public interface a {
        void c(Status status);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTA
    public void d() {
    }

    private void k() {
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            this.a = currentTimeMillis;
            C8157dfA.e(AbstractApplicationC1040Mh.d(), "preference_retry_attempted_for_logblobs_in_ms", currentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTA
    public void c() {
        if (this.j.a()) {
            C1044Mm.e("nf_logblob", "LogBlog events were sent recently. We reached timeout, force send");
        }
    }

    public aTW(IClientLogging iClientLogging, UserAgent userAgent, Context context, aOV aov, InterfaceC5129bst interfaceC5129bst) {
        this.h = iClientLogging;
        this.k = userAgent;
        this.c = context;
        this.e = aov;
        this.b = new aUZ(context, userAgent, interfaceC5129bst);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTA
    public void a(ScheduledExecutorService scheduledExecutorService) {
        this.f = scheduledExecutorService;
        l();
        h();
    }

    private void h() {
        InterfaceC1926aTj h = AbstractApplicationC1040Mh.getInstance().i().h();
        if (!Config_FastProperty_RetryPolicyLogblobs.shouldRetryWhenScheduled()) {
            C1044Mm.j("nf_logblob", "Retry policy is preventing us to use scheduler for retries to deliver saved events");
            return;
        }
        C1044Mm.e("nf_logblob", "Retry policy requires us to use scheduler for retries to deliver saved events");
        Objects.requireNonNull(h, "jobMgr is null, called out side init?");
        h.d(this);
    }

    private void l() {
        C1044Mm.e("nf_logblob", "::init data repository started ");
        File file = new File(this.c.getFilesDir(), "logblobs");
        boolean mkdirs = file.mkdirs();
        this.g = new C8249dgn(file);
        C1044Mm.a("nf_logblob", "::init data repository done, created %b ", Boolean.valueOf(mkdirs));
    }

    private void o() {
        if (!m()) {
            C1044Mm.e("nf_logblob", "Leave re-try to next trigger...");
        } else if (this.f == null) {
            C1044Mm.j("nf_logblob", "Unable to send undelivered events, executor is not set! Leave re-try to next trigger...");
        } else if (this.j.P_()) {
            this.f.schedule(this.d, 15L, TimeUnit.SECONDS);
        } else {
            this.f.execute(this.d);
        }
    }

    private boolean m() {
        long j = this.a;
        long retryTimeoutInHours = Config_FastProperty_RetryPolicyLogblobs.getRetryTimeoutInHours();
        if (this.a <= 0) {
            C1044Mm.e("nf_logblob", "We never tried to re-deliver saved events, do it now.");
            return true;
        } else if (C8175dfS.d(retryTimeoutInHours * 3600000, j)) {
            C1044Mm.e("nf_logblob", "Last time we tried to re-deliver saved events: " + (j / 3600000) + " hours ago. Do it now.");
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aTW$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1044Mm.e("nf_logblob", "Check if we have not delivered events from last time our app was running...");
            aTW.this.g.c(new InterfaceC8248dgm.b() { // from class: o.aTZ
                @Override // o.InterfaceC8248dgm.b
                public final void d(InterfaceC8248dgm.d[] dVarArr) {
                    aTW.AnonymousClass4.this.c(dVarArr);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(InterfaceC8248dgm.d[] dVarArr) {
            if (dVarArr != null && dVarArr.length > 0) {
                aTW.this.b(dVarArr, false);
            } else {
                C1044Mm.e("nf_logblob", "No saved payloads found.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InterfaceC8248dgm.d[] dVarArr, boolean z) {
        if (dVarArr == null || dVarArr.length < 1) {
            C1044Mm.e("nf_logblob", "No saved events found");
            return;
        }
        long undeliveredPayloadExpirationInHours = Config_FastProperty_RetryPolicyLogblobs.getUndeliveredPayloadExpirationInHours();
        boolean isRetryDisabled = Config_FastProperty_RetryPolicyLogblobs.isRetryDisabled();
        for (InterfaceC8248dgm.d dVar : dVarArr) {
            final String e = dVar.e();
            if (isRetryDisabled) {
                C1044Mm.j("nf_logblob", "Retry is disabled, remove saved payload.");
                h(e);
            } else {
                C1044Mm.e("nf_logblob", "Retry is enabled, process saved payload for retry...");
                if (this.i.contains(e)) {
                    C1044Mm.j("nf_logblob", "We are already trying to deliver %s deliveryRequestId, skip", e);
                } else if (C8128deY.c(dVar, 3600000 * undeliveredPayloadExpirationInHours)) {
                    C1044Mm.j("nf_logblob", "Drop too old %s deliveryRequestId", e);
                    h(e);
                } else {
                    this.i.add(e);
                    if (z) {
                        this.f.schedule(new Runnable() { // from class: o.aUa
                            @Override // java.lang.Runnable
                            public final void run() {
                                aTW.this.b(e);
                            }
                        }, this.h.c(), TimeUnit.MILLISECONDS);
                    } else {
                        this.f.execute(new Runnable() { // from class: o.aUc
                            @Override // java.lang.Runnable
                            public final void run() {
                                aTW.this.a(e);
                            }
                        });
                    }
                }
            }
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void b(final String str) {
        this.g.c(str, new InterfaceC8248dgm.e() { // from class: o.aTV
            @Override // o.InterfaceC8248dgm.e
            public final void d(String str2, String str3, byte[] bArr, long j) {
                aTW.this.a(str, str2, str3, bArr, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, byte[] bArr, long j) {
        if (bArr == null || bArr.length < 1) {
            C1044Mm.d("nf_logblob", "We failed to retrieve payload. Trying to delete it");
            h(str);
            return;
        }
        try {
            c(str3, new String(bArr, StandardCharsets.UTF_8), new c(str));
        } catch (Throwable th) {
            C1044Mm.e("nf_logblob", "Failed to send logblobs.", th);
        }
    }

    private void c(String str, String str2, a aVar) {
        C1044Mm.e("nf_logblob", "sendLogblobs starts...");
        List<Logblob> a2 = aUL.a(str2);
        if (a2.size() < 1) {
            C1044Mm.e("nf_logblob", "Nothing to sent, array is null. SendLogblobs done.");
            aVar.c(InterfaceC1078Nw.aJ);
            return;
        }
        try {
            NetflixDataRequest d2 = this.b.d(str, a2, g(), aVar);
            if (d2 != null) {
                this.h.addDataRequest(d2);
                C1044Mm.e("nf_logblob", "sendLogblobs done.");
            } else {
                C1044Mm.j("nf_logblob", "Logblobs where dropped!");
            }
        } catch (JSONException e) {
            C1044Mm.b("nf_logblob", e, "Failed to add common parameters to JSON logbob?!", new Object[0]);
        }
    }

    private String i(String str) {
        try {
            String g = this.k.g();
            InterfaceC8248dgm interfaceC8248dgm = this.g;
            long currentTimeMillis = System.currentTimeMillis();
            return interfaceC8248dgm.b(String.valueOf(currentTimeMillis), str.getBytes(StandardCharsets.UTF_8), g);
        } catch (Throwable th) {
            C1044Mm.e("nf_logblob", "Failed to save payload to repository", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(final String str) {
        if (C8168dfL.g(str)) {
            return;
        }
        this.f.execute(new Runnable() { // from class: o.aUd
            @Override // java.lang.Runnable
            public final void run() {
                aTW.this.c(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void c(String str) {
        try {
            this.i.remove(str);
            this.g.e(str);
        } catch (Throwable th) {
            C1044Mm.e("nf_logblob", "Failed to remove payload from repository", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<Logblob> list, boolean z) {
        c cVar;
        C8166dfJ.c("It can not be executed on main thread!");
        if (list == null || list.size() < 1) {
            C1044Mm.e("nf_logblob", "dropping bad logblob");
            return;
        }
        try {
            String a2 = aUL.a(list);
            if (z) {
                String i = i(a2);
                if (i != null) {
                    this.i.add(i);
                }
                cVar = new c(i);
            } else {
                cVar = null;
            }
            this.h.addDataRequest(this.b.d(null, list, g(), cVar));
        } catch (OutOfMemoryError e) {
            C1044Mm.b("nf_logblob", e, "Failed to allocate memory for logging request, dumping log events...", new Object[0]);
            InterfaceC1599aHg.d(this.c, e);
        } catch (Throwable th) {
            C1044Mm.b("nf_logblob", th, "Failed to create JSON object for logging request", new Object[0]);
        }
    }

    private String i() {
        if (this.e.w() != null) {
            return this.e.w().m();
        }
        String e = C8157dfA.e(AbstractApplicationC1040Mh.d(), "nf_drm_esn", (String) null);
        if (C8168dfL.h(e)) {
            return e;
        }
        return aLS.d() + "PRV-" + AbstractC1838aQc.c() + "-FAILED";
    }

    private String j() {
        if (this.e.w() != null) {
            return this.e.w().p();
        }
        return AbstractC1838aQc.c();
    }

    private Logblob.d g() {
        return new Logblob.d(i(), this.h.a(), this.h.f(), j());
    }

    @Override // o.InterfaceC5090bsG
    public void a(Logblob logblob) {
        if (logblob == null) {
            C1044Mm.d("nf_logblob", "Message is null!");
            return;
        }
        String a2 = this.h.a();
        String f = this.h.f();
        if (this.e.aa().contains(logblob.a())) {
            C1044Mm.j("nf_logblob", "dropping suppressed logblob %s", logblob.a());
            return;
        }
        if (logblob instanceof AbstractC5119bsj) {
            try {
                ((AbstractC5119bsj) logblob).b(this.c, this.e, a2, f);
            } catch (JSONException e) {
                C1044Mm.b("nf_logblob", e, "Failed to populate JSON", new Object[0]);
            }
        } else {
            C1044Mm.j("nf_logblob", "Unable to set common data by framework, logblob does not implement BaseLogblob %s ", logblob);
        }
        if (logblob.e() && !this.j.e()) {
            b(logblob);
        } else if (this.j.a(logblob) || !logblob.e()) {
        } else {
            this.j.d(!Config_FastProperty_RetryPolicyLogblobs.isRetryDisabled());
        }
    }

    private void b(final Logblob logblob) {
        if (C8166dfJ.a()) {
            C1044Mm.e("nf_logblob", "Called on main thread, offloading...");
            new C1071Np().d(new C1079Nx.b() { // from class: o.aTY
                @Override // o.C1079Nx.b
                public final void run() {
                    aTW.this.d(logblob);
                }
            });
            return;
        }
        d(logblob);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void d(Logblob logblob) {
        try {
            i(aUL.a(Collections.singletonList(logblob)));
        } catch (JSONException e) {
            C1044Mm.b("nf_logblob", e, "unable to persist logblob", new Object[0]);
            if (this.j.a(logblob) || !logblob.e()) {
                return;
            }
            this.j.d(!Config_FastProperty_RetryPolicyLogblobs.isRetryDisabled());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTA
    public void f() {
        this.j.h();
        o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements a {
        private final String d;

        public c(String str) {
            this.d = str;
        }

        @Override // o.aTW.a
        public void c(Status status) {
            if (status.j() || status.c() == StatusCode.HTTP_ERR_413 || (status.i() && (status instanceof NqErrorStatus) && status.c() != StatusCode.NODEQUARK_RETRY)) {
                C1044Mm.a("nf_logblob", "Logblobs are successfully sent to backend %s", status);
                aTW.this.h(this.d);
                return;
            }
            C1044Mm.d("nf_logblob", "Logblobs are NOT successfully sent to backend, do NOT remove them");
            aTW.this.i.remove(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends AbstractC8155dez<Logblob> {
        public d() {
            super("nf_logblob_queue");
            c(new AbstractC8152dew.a(30));
            c(new AbstractC8152dew.b(60000L));
        }

        @Override // o.AbstractC8155dez
        public void c(final List<Logblob> list, final boolean z) {
            if (C8166dfJ.a()) {
                C1044Mm.e(this.a, "Called on main thread, offloading...");
                new C1071Np().d(new C1079Nx.b() { // from class: o.aUb
                    @Override // o.C1079Nx.b
                    public final void run() {
                        aTW.d.this.a(list, z);
                    }
                });
                return;
            }
            aTW.this.c(list, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(List list, boolean z) {
            aTW.this.c(list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTA
    public void e() {
        if (ConnectivityUtils.n(this.c)) {
            C1044Mm.e("nf_logblob", "Device is connected, lets see if we need to deliver cached events...");
            InterfaceC8248dgm.d[] b = this.g.b();
            if (b == null || b.length <= 0) {
                return;
            }
            if (Config_FastProperty_RetryPolicyLogblobs.shouldRetryAllFailuresWhenNetworkAvailable()) {
                C1044Mm.a("nf_logblob", "We found %d cached log entries, network is connected, lets try to deliver them", Integer.valueOf(b.length));
                b(b, false);
                return;
            }
            C1044Mm.a("nf_logblob", "We found %d cached log entries, network is connected, but policy forbid attempt to deliver saved payloads. Do nothing.", Integer.valueOf(b.length));
        }
    }

    @Override // o.aTA
    public void b() {
        C1044Mm.a("nf_logblob", "flushLoggingEvents");
        this.a = 0L;
        f();
        d dVar = this.j;
        if (dVar != null) {
            dVar.d(true);
        }
    }

    @Override // o.InterfaceC1919aTc
    public void b(final int i) {
        C1044Mm.c("nf_logblob", "runAction runId=%d", Integer.valueOf(i));
        o();
        C8187dfe.a(new Runnable() { // from class: o.aTW.3
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC1926aTj h = AbstractApplicationC1040Mh.getInstance().i().h();
                Objects.requireNonNull(h, "jobMgr shouldn't be null.");
                h.a(aTW.this, i);
            }
        }, 10000L);
    }

    @Override // o.InterfaceC1919aTc
    public void a() {
        C1044Mm.a("nf_logblob", "stopAction");
    }
}
