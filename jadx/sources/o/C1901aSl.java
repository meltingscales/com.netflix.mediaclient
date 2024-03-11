package o;

import android.os.Handler;
import android.os.HandlerThread;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.api.diagnostics.IDiagnosis;
import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.Logblob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: o.aSl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1901aSl extends aMF implements IDiagnosis {
    private HandlerThread a;
    private Handler c;
    private boolean e = false;
    private final ArrayList<aMJ> b = new ArrayList<>();
    private IDiagnosis.a d = null;

    @Override // o.aMF
    public String agentName() {
        return "diagnosis";
    }

    @Override // com.netflix.mediaclient.service.api.diagnostics.IDiagnosis
    public void c(IDiagnosis.a aVar) {
        this.d = aVar;
    }

    @Override // com.netflix.mediaclient.service.api.diagnostics.IDiagnosis
    public void d() {
        this.d = null;
    }

    @Override // com.netflix.mediaclient.service.api.diagnostics.IDiagnosis
    public List<aMJ> e() {
        return this.b;
    }

    private void i() {
        if (this.a == null) {
            HandlerThread handlerThread = new HandlerThread("nf_nw_diag");
            this.a = handlerThread;
            handlerThread.start();
        }
        if (this.c == null) {
            this.c = new Handler(this.a.getLooper());
        }
    }

    private void h() {
        HandlerThread handlerThread = this.a;
        if (handlerThread != null) {
            handlerThread.quit();
            this.a = null;
        }
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.c = null;
        }
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.DIAGNOSIS_AGENT_LOADED;
    }

    @Override // o.aMF
    public void doInit() {
        initCompleted(InterfaceC1078Nw.aJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final aMJ amj) {
        C1044Mm.a("nf_service_diagnosisagent", "runNetworkConnectivityTest");
        if (this.c == null) {
            return;
        }
        amj.a(IDiagnosis.UrlStatus.TEST_ONGOING);
        IDiagnosis.a aVar = this.d;
        if (aVar != null) {
            aVar.c();
        }
        this.c.post(new Runnable() { // from class: o.aSl.4
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
                if (r3 == null) goto L10;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.io.BufferedInputStream, java.io.InputStream] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r7 = this;
                    java.lang.String r0 = "nf_service_diagnosisagent"
                    com.netflix.mediaclient.StatusCode r1 = com.netflix.mediaclient.StatusCode.OK
                    int r1 = r1.getValue()
                    r2 = 0
                    r3 = 0
                    java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d java.net.MalformedURLException -> L4c
                    o.aMJ r5 = r2     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d java.net.MalformedURLException -> L4c
                    java.lang.String r5 = r5.e()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d java.net.MalformedURLException -> L4c
                    r4.<init>(r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d java.net.MalformedURLException -> L4c
                    java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d java.net.MalformedURLException -> L4c
                    java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d java.net.MalformedURLException -> L4c
                    java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.net.MalformedURLException -> L38
                    java.io.InputStream r5 = r4.getInputStream()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.net.MalformedURLException -> L38
                    r3.<init>(r5)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.net.MalformedURLException -> L38
                    r5 = 1024(0x400, float:1.435E-42)
                    byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.net.MalformedURLException -> L38
                L28:
                    int r6 = r3.read(r5)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.net.MalformedURLException -> L38
                    if (r6 >= 0) goto L28
                    r4.disconnect()
                    r2 = 1
                    goto L5d
                L33:
                    r0 = move-exception
                    goto L7a
                L35:
                    r1 = move-exception
                    r3 = r4
                    goto L3e
                L38:
                    r1 = move-exception
                    r3 = r4
                    goto L4d
                L3b:
                    r0 = move-exception
                    goto L79
                L3d:
                    r1 = move-exception
                L3e:
                    java.lang.String r4 = "IOError:"
                    o.C1044Mm.e(r0, r4, r1)     // Catch: java.lang.Throwable -> L3b
                    com.netflix.mediaclient.StatusCode r0 = com.netflix.mediaclient.StatusCode.NET_NETWORK_IO_EXCEPTION     // Catch: java.lang.Throwable -> L3b
                    int r1 = r0.getValue()     // Catch: java.lang.Throwable -> L3b
                    if (r3 == 0) goto L5d
                    goto L5a
                L4c:
                    r1 = move-exception
                L4d:
                    java.lang.String r4 = "invalid URL:"
                    o.C1044Mm.e(r0, r4, r1)     // Catch: java.lang.Throwable -> L3b
                    com.netflix.mediaclient.StatusCode r0 = com.netflix.mediaclient.StatusCode.NET_MALFORMED_URL_ERROR     // Catch: java.lang.Throwable -> L3b
                    int r1 = r0.getValue()     // Catch: java.lang.Throwable -> L3b
                    if (r3 == 0) goto L5d
                L5a:
                    r3.disconnect()
                L5d:
                    o.aMJ r0 = r2
                    r0.c(r1)
                    o.aMJ r0 = r2
                    r0.a(r1)
                    o.aMJ r0 = r2
                    r0.b(r2)
                    o.aMJ r0 = r2
                    com.netflix.mediaclient.service.api.diagnostics.IDiagnosis$UrlStatus r1 = com.netflix.mediaclient.service.api.diagnostics.IDiagnosis.UrlStatus.COMPLETED
                    r0.a(r1)
                    o.aSl r0 = o.C1901aSl.this
                    o.C1901aSl.a(r0)
                    return
                L79:
                    r4 = r3
                L7a:
                    if (r4 == 0) goto L7f
                    r4.disconnect()
                L7f:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C1901aSl.AnonymousClass4.run():void");
            }
        });
    }

    private boolean j() {
        Iterator<aMJ> it = this.b.iterator();
        while (it.hasNext()) {
            if (!it.next().i()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        C1044Mm.a("nf_service_diagnosisagent", "notifyDiagnosisComplete");
        h();
        IDiagnosis.a aVar = this.d;
        if (aVar != null && this.e) {
            aVar.a();
            try {
                g().e().a(new c(this.b, j() ? Logblob.Severity.info : Logblob.Severity.error));
            } catch (JSONException unused) {
                C1044Mm.d("nf_service_diagnosisagent", "JSONException:");
            }
        }
        this.e = false;
    }

    private IClientLogging g() {
        return AbstractApplicationC1040Mh.getInstance().i().f();
    }

    @Override // com.netflix.mediaclient.service.api.diagnostics.IDiagnosis
    public void b() {
        C1044Mm.a("nf_service_diagnosisagent", "startNetworkDiagnosis");
        c();
        i();
        this.e = true;
        String externalForm = a().j().a("").toExternalForm();
        C1044Mm.c("nf_service_diagnosisagent", "apiUrl=%s", externalForm);
        ArrayList<aMJ> arrayList = this.b;
        IDiagnosis.UrlStatus urlStatus = IDiagnosis.UrlStatus.NOT_TESTED;
        arrayList.add(new aMJ(externalForm, urlStatus));
        this.b.add(new aMJ("https://www.google.com/generate_204", urlStatus));
        final aMJ amj = this.b.get(0);
        amj.a(IDiagnosis.UrlStatus.TEST_ONGOING);
        IDiagnosis.a aVar = this.d;
        if (aVar != null) {
            aVar.c();
        }
        a().b(new C1831aPw() { // from class: o.aSl.5
            @Override // o.C1831aPw, o.InterfaceC1813aPe
            public void c(Status status) {
                int value = status.c().getValue();
                amj.c(value);
                amj.a(value);
                amj.b(status.j());
                amj.a(IDiagnosis.UrlStatus.COMPLETED);
                if (C1901aSl.this.b.size() >= 2) {
                    C1901aSl c1901aSl = C1901aSl.this;
                    c1901aSl.e((aMJ) c1901aSl.b.get(1));
                }
            }
        });
    }

    private aOV a() {
        return AbstractApplicationC1040Mh.getInstance().i().d();
    }

    @Override // com.netflix.mediaclient.service.api.diagnostics.IDiagnosis
    public void c() {
        C1044Mm.e("nf_service_diagnosisagent", "abortDiagnosis");
        this.e = false;
        this.b.clear();
        h();
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.I;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_DIAGNOSIS;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_DIAGNOSIS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aSl$c */
    /* loaded from: classes3.dex */
    public class c extends aUI {
        @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
        public boolean e() {
            return true;
        }

        public c(List<aMJ> list, Logblob.Severity severity) {
            JSONArray jSONArray = new JSONArray();
            for (aMJ amj : list) {
                jSONArray.put(amj.f());
            }
            this.f = severity;
            this.i.put("name", "NetworkDiagnostics");
            this.i.put(NetflixActivity.EXTRA_SOURCE, "DiagnosticPage");
            this.i.put("resultArray", jSONArray);
        }

        @Override // com.netflix.mediaclient.servicemgr.Logblob
        public String a() {
            return LogBlobType.NETWORK_DIAGNOSIS.a();
        }
    }
}
