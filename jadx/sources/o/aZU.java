package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.net.probe.ProbeConfigResponse;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.InterfaceC4229baa;
import o.aZY;

/* loaded from: classes.dex */
public class aZU extends aMF implements Handler.Callback {
    private ProbeConfigResponse a;
    private Handler g;
    private aZT h;
    private int i;
    private static final long e = TimeUnit.HOURS.toMillis(8);
    private static final long b = TimeUnit.SECONDS.toMillis(30);
    private static final long c = TimeUnit.MINUTES.toMillis(30);
    private Map<String, C4231bac> j = new HashMap();
    private InterfaceC1072Nq d = new C1076Nu() { // from class: o.aZU.3
        @Override // o.C1076Nu, o.InterfaceC1072Nq
        public void c(NC nc, Intent intent) {
            C1044Mm.d("nf_probe", "onForeground - start probe if needed");
            if (aZU.this.a()) {
                aZU.this.g();
                aZU.this.g.sendEmptyMessageDelayed(4104, aZU.b);
            }
        }
    };

    @Override // o.aMF
    public String agentName() {
        return "probeController";
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.PROBE_CONTROLLER_AGENT_LOADED;
    }

    @Override // o.aMF
    public void doInit() {
        HandlerThread handlerThread = new HandlerThread("ftl_probe");
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper(), this);
        NC o2 = AbstractApplicationC1040Mh.getInstance().o();
        if (o2.i() && a()) {
            this.g.sendEmptyMessageDelayed(4104, b);
        }
        o2.c(this.d);
        this.h = new aZP(getUserAgent(), getConfigurationAgent());
        initCompleted(InterfaceC1078Nw.aJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        long b2 = C8157dfA.b(getContext(), "prefs_last_probe_timestamp", 0L);
        if (currentTimeMillis > e + b2) {
            C8157dfA.e(getContext(), "prefs_last_probe_timestamp", currentTimeMillis);
            return true;
        }
        C1044Mm.a("nf_probe", "probe test disabled for this app session (%d minutes since previous)", Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis - b2)));
        return false;
    }

    @Override // o.aMF
    public void destroy() {
        g();
        super.destroy();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 4096:
                    c((String) message.obj);
                    break;
                case 4097:
                    e((String) message.obj);
                    break;
                case 4098:
                    d((ProbeConfigResponse) message.obj);
                    break;
                case 4099:
                    e((a) message.obj);
                    break;
                case 4100:
                    b();
                    break;
                case 4101:
                    e();
                    break;
                case 4103:
                    b((aHI) message.obj);
                    break;
                case 4104:
                    a((String) message.obj);
                    break;
            }
            return false;
        } catch (Throwable th) {
            InterfaceC1598aHf.e("unable to perform ftl probing", th);
            g();
            return false;
        }
    }

    private void a(String str) {
        this.i = 0;
        c();
        g();
        this.g.obtainMessage(4096, str).sendToTarget();
    }

    private void c(String str) {
        c();
        if (!getUserAgent().v()) {
            C1044Mm.e("nf_probe", "user not logged in - disabling FTL probe");
        } else if (InterfaceC4360bcz.e().i()) {
            C1044Mm.e("nf_probe", "delaying probe for playback");
            Handler handler = this.g;
            handler.sendMessageDelayed(handler.obtainMessage(4096, str), b);
        } else {
            C1044Mm.e("nf_probe", "sending probe config request");
            aZY azy = new aZY(getContext(), this.i, str, new aZY.d() { // from class: o.aZU.4
                @Override // o.aZY.d
                public void d() {
                }

                @Override // o.aZY.d
                public void c(ProbeConfigResponse probeConfigResponse) {
                    aZU.this.g.obtainMessage(4098, probeConfigResponse).sendToTarget();
                }
            });
            azy.c(new b());
            addDataRequest(azy);
        }
    }

    private void b(aHI ahi) {
        int c2 = ahi.m() ? -1 : C5044brN.c(ahi.c());
        if ((c2 == -1 || c2 == 5) && ahi.a() == null) {
            return;
        }
        C1044Mm.e("nf_probe", "received an error fetching probe config");
        aZX azx = new aZX(ahi);
        getLoggingAgent().e().a(azx);
        C1044Mm.b("nf_probe", azx.h());
    }

    private void d(ProbeConfigResponse probeConfigResponse) {
        C1044Mm.a("nf_probe", "iteration %d: received probe config: %s probes, %s iterations", 0, Integer.valueOf(probeConfigResponse.c().size()), Integer.valueOf(probeConfigResponse.e()));
        this.a = probeConfigResponse;
        this.j.clear();
        long d = this.a.d(0);
        if (probeConfigResponse.e() > 0) {
            for (ProbeConfigResponse.b bVar : probeConfigResponse.c()) {
                if (bVar.e()) {
                    this.j.put(bVar.a(), new C4231bac(bVar, probeConfigResponse.o() ? new aZS(this) : new aZO(this)));
                    Handler handler = this.g;
                    handler.sendMessageDelayed(handler.obtainMessage(4097, bVar.a()), d);
                }
            }
        }
        if (this.j.isEmpty()) {
            this.g.sendEmptyMessage(4100);
        } else {
            this.g.sendEmptyMessageDelayed(4101, c);
        }
    }

    private void e(final String str) {
        char c2;
        final C4231bac c4231bac = this.j.get(str);
        if (c4231bac == null) {
            C1044Mm.e("nf_probe", "probe measurement not found for %s", str);
            return;
        }
        C1044Mm.a("nf_probe", "iteration %d: sending probe to %s", Integer.valueOf(c4231bac.d()), str);
        c4231bac.a();
        c4231bac.e();
        InterfaceC4229baa.e eVar = new InterfaceC4229baa.e() { // from class: o.aZW
            @Override // o.InterfaceC4229baa.e
            public final void e(C4235bag c4235bag) {
                aZU.this.d(str, c4231bac, c4235bag);
            }
        };
        Uri parse = Uri.parse(str);
        String scheme = Uri.parse(str).getScheme();
        scheme.hashCode();
        int hashCode = scheme.hashCode();
        if (hashCode == 114657) {
            if (scheme.equals("tcp")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 115649) {
            if (hashCode == 99617003 && scheme.equals("https")) {
                c2 = 2;
            }
            c2 = 65535;
        } else {
            if (scheme.equals("udp")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0 || c2 == 1) {
            new C4237bai(getContext(), parse, this.a.d(), this.a.h()).a(eVar);
        } else if (c2 == 2) {
            c4231bac.c.a(new C4232bad(str, this.a.i(), c4231bac.d()), eVar);
        } else {
            C1044Mm.e("nf_probe", "unknown probe scheme. skipping test: %s", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str, C4231bac c4231bac, C4235bag c4235bag) {
        this.g.obtainMessage(4099, new a(str, c4231bac, c4235bag)).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(o.aZU.a r7) {
        /*
            r6 = this;
            com.netflix.mediaclient.service.net.probe.ProbeConfigResponse r0 = r6.a
            java.lang.String r1 = "nf_probe"
            if (r0 != 0) goto Lc
            java.lang.String r7 = "received network response after test finished"
            o.C1044Mm.d(r1, r7)
            return
        Lc:
            o.bac r0 = o.aZU.a.e(r7)
            o.bag r2 = o.aZU.a.c(r7)
            java.lang.String r3 = o.aZU.a.a(r7)
            if (r3 == 0) goto L2f
            java.lang.String r3 = o.aZU.a.a(r7)     // Catch: java.lang.Exception -> L2f
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = r3.getHost()     // Catch: java.lang.Exception -> L2f
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = r3.getHostAddress()     // Catch: java.lang.Exception -> L2f
            goto L30
        L2f:
            r3 = 0
        L30:
            if (r0 == 0) goto L51
            int r4 = r0.d()
            java.lang.String r5 = o.aZU.a.a(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "iteration %d: received probe response from %s"
            o.C1044Mm.a(r1, r5, r4)
            r0.a(r3, r2)
            java.lang.String r7 = o.aZU.a.a(r7)
            r6.b(r7, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aZU.e(o.aZU$a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r5, o.C4231bac r6) {
        /*
            r4 = this;
            boolean r0 = r6.b()
            if (r0 == 0) goto L3e
            int r0 = r6.d()
            com.netflix.mediaclient.service.net.probe.ProbeConfigResponse r1 = r4.a
            int r1 = r1.e()
            if (r0 >= r1) goto L3e
            com.netflix.mediaclient.service.net.probe.ProbeConfigResponse r0 = r4.a
            int r1 = r6.d()
            long r0 = r0.d(r1)
            int r6 = r6.d()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r2}
            java.lang.String r2 = "nf_probe"
            java.lang.String r3 = "iteration %d: scheduling new probe at %d ms"
            o.C1044Mm.a(r2, r3, r6)
            android.os.Handler r6 = r4.g
            r2 = 4097(0x1001, float:5.741E-42)
            android.os.Message r5 = r6.obtainMessage(r2, r5)
            r6.sendMessageDelayed(r5, r0)
        L3e:
            java.util.Map<java.lang.String, o.bac> r5 = r4.j
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r5.next()
            o.bac r6 = (o.C4231bac) r6
            boolean r0 = r6.b()
            if (r0 == 0) goto L66
            int r6 = r6.d()
            com.netflix.mediaclient.service.net.probe.ProbeConfigResponse r0 = r4.a
            int r0 = r0.e()
            if (r6 >= r0) goto L48
        L66:
            r5 = 0
            goto L69
        L68:
            r5 = 1
        L69:
            com.netflix.mediaclient.service.net.probe.ProbeConfigResponse r6 = r4.a
            if (r6 == 0) goto L76
            if (r5 == 0) goto L76
            android.os.Handler r5 = r4.g
            r6 = 4100(0x1004, float:5.745E-42)
            r5.sendEmptyMessage(r6)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aZU.b(java.lang.String, o.bac):void");
    }

    private void b() {
        C1044Mm.e("nf_probe", "probing test finished");
        this.g.removeMessages(4101);
        if (this.a != null && !this.j.isEmpty()) {
            aZZ azz = new aZZ(this.a.j(), this.a.b(), this.a.a(), this.a.i(), this.j.values());
            getLoggingAgent().e().a(azz);
            C1044Mm.b("nf_probe", azz.h());
        }
        ProbeConfigResponse probeConfigResponse = this.a;
        if (probeConfigResponse != null && probeConfigResponse.f()) {
            C1044Mm.a("nf_probe", "scheduling another probe cycle in %s", Long.valueOf(this.a.g()));
            this.g.sendEmptyMessageDelayed(4096, this.a.g());
        } else {
            C1044Mm.e("nf_probe", "config instructed us to keep away - disabling future probing");
            c();
            g();
        }
        this.i++;
    }

    private void e() {
        C1044Mm.d("nf_probe", "FTL probe timeout");
        g();
        c();
        b();
    }

    private void c() {
        for (C4231bac c4231bac : this.j.values()) {
            c4231bac.c.b();
        }
        this.j.clear();
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Handler handler = this.g;
        if (handler != null) {
            handler.removeMessages(4096);
            this.g.removeMessages(4097);
            this.g.removeMessages(4098);
            this.g.removeMessages(4099);
            this.g.removeMessages(4100);
            this.g.removeMessages(4101);
            this.g.removeMessages(4103);
            this.g.removeMessages(4104);
        }
    }

    @Override // o.aMF
    public void handleConnectivityChange(ConnectivityUtils.NetType netType) {
        C1044Mm.e("nf_probe", "handleConnectivityChange:: start probe.");
        aZT azt = this.h;
        if (azt != null) {
            azt.d();
        }
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.aa;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_PROBE;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_PROBE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements aHT {
        private b() {
        }

        @Override // o.aHT
        public void e(aHI ahi) {
            aZU.this.g.obtainMessage(4103, ahi).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {
        private final C4235bag a;
        private final C4231bac d;
        private final String e;

        public a(String str, C4231bac c4231bac, C4235bag c4235bag) {
            this.e = str;
            this.d = c4231bac;
            this.a = c4235bag;
        }
    }
}
