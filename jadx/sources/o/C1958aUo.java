package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RetryPolicyPds;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.NqErrorStatus;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.AbstractC8152dew;
import o.C1079Nx;
import o.C1958aUo;
import o.InterfaceC8248dgm;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aUo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1958aUo extends aTE implements InterfaceC1919aTc {
    private InterfaceC8248dgm a;
    private final Context b;
    protected long c;
    private final aOV e;
    private ScheduledExecutorService g;
    private final UserAgent i;
    private final IClientLogging j;
    private final c h = new c();
    private final List<String> f = new ArrayList();
    private final Runnable d = new AnonymousClass1();

    /* renamed from: o.aUo$b */
    /* loaded from: classes3.dex */
    public interface b {
        void d(Status status);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTE
    public void b() {
        if (this.h.a()) {
            C1044Mm.e("nf_pds_logs", "flushed Pds events");
        }
    }

    public C1958aUo(IClientLogging iClientLogging, UserAgent userAgent, aOV aov, Context context) {
        this.j = iClientLogging;
        this.i = userAgent;
        this.e = aov;
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTE
    public void c(ScheduledExecutorService scheduledExecutorService) {
        this.g = scheduledExecutorService;
        f();
        j();
    }

    private void j() {
        if (!Config_FastProperty_RetryPolicyPds.shouldRetryWhenScheduled()) {
            C1044Mm.j("nf_pds_logs", "Retry policy is preventing us to use scheduler for retries to deliver saved events");
            return;
        }
        C1044Mm.e("nf_pds_logs", "Retry policy requires us to use scheduler for retries to deliver saved events");
        InterfaceC1926aTj h = AbstractApplicationC1040Mh.getInstance().i().h();
        Objects.requireNonNull(h, "Pds JobMgr shouldn't be null.");
        h.d(this);
    }

    private void f() {
        C1044Mm.e("nf_pds_logs", "::init data repository started ");
        File file = new File(this.b.getFilesDir(), "pdsevents");
        file.mkdirs();
        this.a = new C8249dgn(file);
        C1044Mm.e("nf_pds_logs", "::init data repository done ");
    }

    private void b(boolean z) {
        if (!z && !h()) {
            C1044Mm.e("nf_pds_logs", "Leave re-try to next trigger...");
        } else if (z) {
            this.g.execute(this.d);
        } else {
            this.g.schedule(this.d, 15L, TimeUnit.SECONDS);
        }
    }

    private boolean h() {
        long j = this.c;
        long retryTimeoutInHours = Config_FastProperty_RetryPolicyPds.getRetryTimeoutInHours();
        if (this.c <= 0) {
            C1044Mm.e("nf_pds_logs", "We never tried to re-deliver saved events, do it now.");
            return true;
        } else if (C8175dfS.d(retryTimeoutInHours * 3600000, j)) {
            C1044Mm.e("nf_pds_logs", "Last time we tried to re-deliver saved events: " + (j / 3600000) + " hours ago. Do it now.");
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aUo$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean P_ = C1958aUo.this.h.P_();
            boolean v = C1958aUo.this.i.v();
            if (P_ || !v) {
                C1044Mm.j("nf_pds_logs", "We need to reschedule backup task, event queue is paused: %b, user is signed in: %b", Boolean.valueOf(P_), Boolean.valueOf(v));
                C1958aUo.this.g.schedule(C1958aUo.this.d, 15L, TimeUnit.SECONDS);
                return;
            }
            C1044Mm.e("nf_pds_logs", "Check if we have not delivered events from last time our app was running...");
            C1958aUo.this.a.c(new InterfaceC8248dgm.b() { // from class: o.aUv
                @Override // o.InterfaceC8248dgm.b
                public final void d(InterfaceC8248dgm.d[] dVarArr) {
                    C1958aUo.AnonymousClass1.this.b(dVarArr);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(InterfaceC8248dgm.d[] dVarArr) {
            if (dVarArr != null && dVarArr.length > 0) {
                C1958aUo.this.e(dVarArr);
            } else {
                C1044Mm.e("nf_pds_logs", "No saved payloads found.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(InterfaceC8248dgm.d[] dVarArr) {
        if (dVarArr == null || dVarArr.length < 1) {
            C1044Mm.e("nf_pds_logs", "No saved events found");
            return;
        }
        C1044Mm.a("nf_pds_logs", "Found %d payloads waiting", Integer.valueOf(dVarArr.length));
        long undeliveredPayloadExpirationInHours = Config_FastProperty_RetryPolicyPds.getUndeliveredPayloadExpirationInHours();
        boolean isRetryDisabled = Config_FastProperty_RetryPolicyPds.isRetryDisabled();
        for (InterfaceC8248dgm.d dVar : dVarArr) {
            final String e = dVar.e();
            if (isRetryDisabled) {
                C1044Mm.j("nf_pds_logs", "Retry is disabled, remove saved payload.");
                e(e);
            } else {
                C1044Mm.e("nf_pds_logs", "Retry is enabled, process saved payload for retry...");
                if (this.f.contains(e)) {
                    C1044Mm.j("nf_pds_logs", "We are already trying to deliver %s deliveryRequestId, skip", e);
                } else if (C8128deY.c(dVar, 3600000 * undeliveredPayloadExpirationInHours)) {
                    C1044Mm.j("nf_pds_logs", "Drop too old %s deliveryRequestId", e);
                    e(e);
                } else {
                    this.f.add(e);
                    this.g.execute(new Runnable() { // from class: o.aUs
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1958aUo.this.d(e);
                        }
                    });
                }
            }
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void d(final String str) {
        C1044Mm.a("nf_pds_logs", "Load pdsEvent %s", str);
        this.a.c(str, new InterfaceC8248dgm.e() { // from class: o.aUq
            @Override // o.InterfaceC8248dgm.e
            public final void d(String str2, String str3, byte[] bArr, long j) {
                C1958aUo.this.d(str, str2, str3, bArr, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2, String str3, byte[] bArr, long j) {
        if (bArr == null || bArr.length < 1) {
            C1044Mm.d("nf_pds_logs", "We failed to retrieve payload. Trying to delete it");
            e(str);
            return;
        }
        try {
            e(str3, new String(bArr, StandardCharsets.UTF_8), new a(str, true));
        } catch (Throwable th) {
            C1044Mm.e("nf_pds_logs", "Failed to send pdsEvent.", th);
        }
    }

    private void e(String str, String str2, b bVar) {
        C1044Mm.e("nf_pds_logs", "sendSavedPdsEventBundle start...");
        String[] h = h(str2);
        if (h == null || h.length < 1) {
            C1044Mm.e("nf_pds_logs", "Nothing to sent, array is null. sendSavedPdsEventBundle done.");
            bVar.d(InterfaceC1078Nw.aJ);
            return;
        }
        this.j.addDataRequest(C8185dfc.d(this.i, str, new C1978aVi(this.b, h, this.e, bVar), true));
        C1044Mm.e("nf_pds_logs", "sendSavedPdsEventBundle done.");
    }

    private String f(String str) {
        try {
            InterfaceC8248dgm interfaceC8248dgm = this.a;
            long currentTimeMillis = System.currentTimeMillis();
            return interfaceC8248dgm.b(String.valueOf(currentTimeMillis), str.getBytes(StandardCharsets.UTF_8), this.i.g());
        } catch (Throwable th) {
            C1044Mm.e("nf_pds_logs", "Failed to save payload to repository", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str) {
        if (C8168dfL.g(str)) {
            return;
        }
        this.g.execute(new Runnable() { // from class: o.aUr
            @Override // java.lang.Runnable
            public final void run() {
                C1958aUo.this.b(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void b(String str) {
        try {
            this.f.remove(str);
            this.a.e(str);
        } catch (Throwable th) {
            C1044Mm.e("nf_pds_logs", "Failed to remove payload from repository", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<String> list, boolean z) {
        if (((String[]) list.toArray(new String[0])).length < 1) {
            return;
        }
        C1044Mm.a("nf_pds_logs", "flushing events in queue (%d) saveIfFailed(%b)", Integer.valueOf(list.size()), Boolean.valueOf(z));
        try {
            c(list, z);
        } catch (Exception e) {
            C1044Mm.e("nf_pds_logs", "Failed to create JSON object for logging request", e);
        }
    }

    private void c(List<String> list, boolean z) {
        int size = list.size();
        int i = 0;
        do {
            List<String> c2 = C8124deU.c(list, i, i + 11);
            e(c2, z);
            i += c2.size();
        } while (i < size);
    }

    private void e(List<String> list, boolean z) {
        a aVar;
        if (z) {
            try {
                String f = f(b(list));
                if (f != null) {
                    this.f.add(f);
                }
                aVar = new a(f, false);
            } catch (OutOfMemoryError e) {
                C1044Mm.b("nf_pds_logs", e, "Failed to allocate memory for logging request, dumping log events...", new Object[0]);
                InterfaceC1599aHg.d(this.b, e);
                return;
            }
        } else {
            aVar = null;
        }
        this.j.addDataRequest(new C1978aVi(this.b, (String[]) list.toArray(new String[0]), this.e, aVar));
    }

    @Override // o.aTU
    public void c(String str, boolean z) {
        if (z) {
            C1978aVi c1978aVi = new C1978aVi(this.b, new String[]{str}, this.e, null);
            UserAgent userAgent = this.i;
            aZE d = C8185dfc.d(userAgent, userAgent.g(), c1978aVi, false);
            if (d != null) {
                this.j.addDataRequest(d);
                return;
            }
            return;
        }
        this.h.a(str);
    }

    @Override // o.aTU
    public void e() {
        this.h.d(!Config_FastProperty_RetryPolicyPds.isRetryDisabled());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aUo$a */
    /* loaded from: classes3.dex */
    public class a implements b {
        private final String b;
        private final boolean d;

        public a(String str, boolean z) {
            this.b = str;
            this.d = z;
        }

        @Override // o.C1958aUo.b
        public void d(Status status) {
            if (status.j() || status.c() == StatusCode.HTTP_ERR_413 || (status.i() && (status instanceof NqErrorStatus) && status.c() != StatusCode.NODEQUARK_RETRY)) {
                C1044Mm.a("nf_pds_logs", "Pds events are successfully sent to backend status: %s, %s", status, this.b);
                C1958aUo.this.e(this.b);
                C1958aUo.this.e(this.d);
                return;
            }
            C1044Mm.e("nf_pds_logs", "pds events are NOT successfully sent to backend, do NOT remove them status: %s,  %s", status, this.b);
            C1958aUo.this.f.remove(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        if (z) {
            C1044Mm.j("nf_pds_logs", "Not trying to send cached PDS events since we are just in process of doing it.");
        } else if (Config_FastProperty_RetryPolicyPds.shouldSendSavedEventsOnSuccessfulDelivery()) {
            C1044Mm.e("nf_pds_logs", "Trying to send cached PDS events on first successful delivery");
            b(true);
        } else {
            C1044Mm.j("nf_pds_logs", "Not trying to send cached PDS events on first successful delivery");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aUo$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC8155dez<String> {
        public c() {
            super("nf_queue_pds");
            c(new AbstractC8152dew.a(11));
            c(new AbstractC8152dew.b(120000L));
        }

        @Override // o.AbstractC8155dez
        public void c(final List<String> list, final boolean z) {
            if (C8166dfJ.a()) {
                C1044Mm.e(this.a, "Called on main thread, offloading...");
                new C1071Np().d(new C1079Nx.b() { // from class: o.aUw
                    @Override // o.C1079Nx.b
                    public final void run() {
                        C1958aUo.c.this.d(list, z);
                    }
                });
                return;
            }
            C1958aUo.this.d(list, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(List list, boolean z) {
            C1958aUo.this.d(list, z);
        }
    }

    private String b(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String str : list) {
            jSONArray.put(new JSONObject(str));
        }
        return jSONArray.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTE
    public void c() {
        this.h.h();
        b(false);
    }

    private String[] h(String str) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                if (C8168dfL.h(str)) {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getJSONObject(i).toString());
                    }
                    int length = jSONArray.toString().length();
                    str = str.length() > length ? str.substring(length) : null;
                } else {
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (JSONException e) {
                C1044Mm.e("nf_pds_logs", "Unable to create JSON array from payload " + str, e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTE
    public void d() {
        if (ConnectivityUtils.n(this.b) && this.i.v()) {
            C1044Mm.e("nf_pds_logs", "Device is connected, lets see if we need to deliver cached events...");
            InterfaceC8248dgm.d[] b2 = this.a.b();
            if (b2 == null || b2.length <= 0) {
                return;
            }
            if (Config_FastProperty_RetryPolicyPds.shouldRetryAllFailuresWhenNetworkAvailable()) {
                C1044Mm.a("nf_pds_logs", "We found %d cached log entries, network is connected, lets try to deliver them", Integer.valueOf(b2.length));
                e(b2);
                return;
            }
            C1044Mm.a("nf_pds_logs", "We found %d cached log entries, network is connected, but policy forbid attempt to deliver saved payloads. Do nothing.", Integer.valueOf(b2.length));
        }
    }

    private void g() {
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            this.c = currentTimeMillis;
            C8157dfA.e(AbstractApplicationC1040Mh.d(), "preference_retry_attempted_for_pds_in_ms", currentTimeMillis);
        }
    }

    @Override // o.InterfaceC1919aTc
    public void b(final int i) {
        C1044Mm.c("nf_pds_logs", "runAction runId=%d", Integer.valueOf(i));
        b(false);
        C8187dfe.a(new Runnable() { // from class: o.aUy
            @Override // java.lang.Runnable
            public final void run() {
                C1958aUo.this.a(i);
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        InterfaceC1926aTj h = AbstractApplicationC1040Mh.getInstance().i().h();
        Objects.requireNonNull(h, "Pds jobMgr shouldn't be null.");
        h.a(this, i);
    }

    @Override // o.InterfaceC1919aTc
    public void a() {
        C1044Mm.a("nf_pds_logs", "stopAction");
    }
}
