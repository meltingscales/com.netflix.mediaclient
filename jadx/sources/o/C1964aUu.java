package o;

import android.content.Context;
import android.os.Handler;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.NqErrorStatus;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.C1079Nx;
import o.C1964aUu;
import o.InterfaceC8248dgm;
import org.json.JSONObject;

/* renamed from: o.aUu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1964aUu extends aTC {
    private final Context b;
    private Handler d;
    private InterfaceC8248dgm e;
    private ScheduledExecutorService f;
    private IClientLogging g;
    private UserAgent j;
    private a c = new a();
    private final List<String> h = new ArrayList();
    private Runnable a = new Runnable() { // from class: o.aUu.2
        @Override // java.lang.Runnable
        public void run() {
            if (C1964aUu.this.c.P_() || !C1964aUu.this.e() || !C1964aUu.this.j.v()) {
                C1964aUu.this.f.schedule(C1964aUu.this.a, 10L, TimeUnit.SECONDS);
                return;
            }
            C1044Mm.e("nf_releaseLicense", "Check if we have not delivered events from last time our app was running...");
            C1964aUu.this.e.c(new InterfaceC8248dgm.b() { // from class: o.aUu.2.5
                @Override // o.InterfaceC8248dgm.b
                public void d(InterfaceC8248dgm.d[] dVarArr) {
                    if (dVarArr != null && dVarArr.length > 0) {
                        C1964aUu.this.e(dVarArr, false);
                    } else {
                        C1044Mm.e("nf_releaseLicense", "No saved payloads found.");
                    }
                }
            });
        }
    };

    /* renamed from: o.aUu$c */
    /* loaded from: classes3.dex */
    public interface c {
        void e(JSONObject jSONObject, Status status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        return this.d != null;
    }

    @Override // o.aTX
    public void e(Handler handler) {
        this.d = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTC
    public void c() {
        if (this.c.a()) {
            C1044Mm.e("nf_releaseLicense", "releaseLicense events were sent recently. We reached timeout, force send");
        }
    }

    public C1964aUu(IClientLogging iClientLogging, UserAgent userAgent, Context context) {
        if (iClientLogging == null) {
            throw new IllegalStateException("Owner is null?");
        }
        if (userAgent == null) {
            throw new IllegalStateException("UserAgent is null?");
        }
        this.g = iClientLogging;
        this.j = userAgent;
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTC
    public void a(ScheduledExecutorService scheduledExecutorService) {
        this.f = scheduledExecutorService;
        d();
    }

    private void d() {
        File file = new File(this.b.getFilesDir(), "streamingReleaseLicense");
        file.mkdirs();
        this.e = new C8249dgn(file);
    }

    private void i() {
        if (this.c.P_() || !e() || !this.j.v()) {
            this.f.schedule(this.a, 10L, TimeUnit.SECONDS);
        } else {
            this.f.execute(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(InterfaceC8248dgm.d[] dVarArr, boolean z) {
        if (dVarArr == null || dVarArr.length < 1) {
            C1044Mm.e("nf_releaseLicense", "No saved events found");
            return;
        }
        for (InterfaceC8248dgm.d dVar : dVarArr) {
            final String e2 = dVar.e();
            if (!this.h.contains(e2)) {
                this.h.add(e2);
                if (z) {
                    this.f.schedule(new Runnable() { // from class: o.aUu.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C1964aUu.this.d(e2);
                        }
                    }, this.g.c(), TimeUnit.MILLISECONDS);
                } else {
                    this.f.execute(new Runnable() { // from class: o.aUu.3
                        @Override // java.lang.Runnable
                        public void run() {
                            C1964aUu.this.d(e2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final String str) {
        this.e.c(str, new InterfaceC8248dgm.e() { // from class: o.aUu.5
            @Override // o.InterfaceC8248dgm.e
            public void d(String str2, String str3, byte[] bArr, long j) {
                if (bArr == null || bArr.length < 1) {
                    C1044Mm.d("nf_releaseLicense", "We failed to retrieve payload. Trying to delete it");
                    C1964aUu.this.b(str);
                    return;
                }
                try {
                    String str4 = new String(bArr, "utf-8");
                    C1964aUu c1964aUu = C1964aUu.this;
                    c1964aUu.d(str3, str4, new e(str));
                } catch (Throwable th) {
                    C1044Mm.e("nf_releaseLicense", "Failed to send releaseLicense.", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2, c cVar) {
        if (str2 == null) {
            C1044Mm.e("nf_releaseLicense", "Nothing to send, payload is null. sendSavedReleaseLicenseEvents done.");
            cVar.e(null, InterfaceC1078Nw.aJ);
            return;
        }
        this.g.addDataRequest(C8185dfc.d(this.j, str, new aVG(this.b, str2, cVar), true));
    }

    private String j(String str) {
        try {
            return this.e.b(String.valueOf(System.currentTimeMillis()), str.getBytes("utf-8"), this.j.g());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str) {
        this.f.execute(new Runnable() { // from class: o.aUt
            @Override // java.lang.Runnable
            public final void run() {
                C1964aUu.this.e(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void e(String str) {
        try {
            this.h.remove(str);
            this.e.e(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<String> list) {
        if (list == null || list.size() < 1) {
            C1044Mm.e("nf_releaseLicense", "no events to send");
            return;
        }
        for (String str : list) {
            try {
                String j = j(str);
                if (e()) {
                    this.h.add(j);
                    this.g.addDataRequest(new aVG(this.b, str, new e(j)));
                }
            } catch (OutOfMemoryError e2) {
                C1044Mm.b("nf_releaseLicense", e2, "Failed to allocate memory for logging request, dumping log events...", new Object[0]);
                InterfaceC1599aHg.d(this.b, e2);
            } catch (Throwable th) {
                C1044Mm.e("nf_releaseLicense", "Failed to create JSON object for logging request", th);
            }
        }
    }

    @Override // o.aTX
    public void a(String str) {
        this.c.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aUu$e */
    /* loaded from: classes3.dex */
    public class e implements c {
        private String c;

        public e(String str) {
            this.c = str;
        }

        @Override // o.C1964aUu.c
        public void e(JSONObject jSONObject, Status status) {
            if (status.j() || (status.i() && (status instanceof NqErrorStatus) && status.c() != StatusCode.NODEQUARK_RETRY)) {
                C1044Mm.a("nf_releaseLicense", "releaseLicense events are successfully sent to backend %s", status);
                C1964aUu.this.b(this.c);
                C1964aUu.this.a(jSONObject, status);
                return;
            }
            C1044Mm.d("nf_releaseLicense", "releaseLicense events are NOT successfully sent to backend, do NOT remove them");
            C1964aUu.this.h.remove(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, Status status) {
        if (e()) {
            int value = status.c().getValue();
            this.d.obtainMessage(6, value, value, jSONObject).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aUu$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC8155dez<String> {
        public a() {
            super("nf_releaseLicense_queue");
        }

        @Override // o.AbstractC8155dez
        public void c(final List<String> list, boolean z) {
            if (C8166dfJ.a()) {
                C1044Mm.e(this.a, "Called on main thread, offloading...");
                new C1071Np().d(new C1079Nx.b() { // from class: o.aUC
                    @Override // o.C1079Nx.b
                    public final void run() {
                        C1964aUu.a.this.c(list);
                    }
                });
                return;
            }
            C1964aUu.this.a(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(List list) {
            C1964aUu.this.a(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTC
    public void a() {
        this.c.h();
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.aTC
    public void b() {
        if (ConnectivityUtils.n(this.b) && e() && this.j.v()) {
            C1044Mm.e("nf_releaseLicense", "Device is connected, lets see if we need to deliver cached events...");
            InterfaceC8248dgm.d[] b = this.e.b();
            if (b != null || b.length > 0) {
                C1044Mm.a("nf_releaseLicense", "We found %d cached log entries, network is connected, lets try to deliver them", Integer.valueOf(b.length));
                e(b, false);
            }
        }
    }
}
