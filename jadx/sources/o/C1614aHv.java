package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.ServerError;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.net.RequestMetricsMarker;
import com.netflix.mediaclient.service.webclient.ftl.FtlController;
import com.netflix.mediaclient.service.webclient.ftl.FtlSession;
import java.net.HttpRetryException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C9861xv;
import o.aHA;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;

/* renamed from: o.aHv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1614aHv extends C9861xv {
    private static final ThreadPoolExecutor b;
    private static final ThreadPoolExecutor c;
    private final Context a;
    private boolean d;
    private final ExperimentalCronetEngine e;
    private final Handler f;
    private int g;
    private final C8165dfI i;
    private aHV j;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c = new ThreadPoolExecutor(2, 2, 0L, timeUnit, new LinkedBlockingQueue());
        b = new ThreadPoolExecutor(4, 4, 0L, timeUnit, new LinkedBlockingQueue());
    }

    public C1614aHv(Context context, ExperimentalCronetEngine experimentalCronetEngine, BlockingQueue<Request> blockingQueue, InterfaceC9857xr interfaceC9857xr, InterfaceC9854xo interfaceC9854xo, InterfaceC9863xx interfaceC9863xx, String str) {
        super(blockingQueue, interfaceC9857xr, interfaceC9854xo, interfaceC9863xx, str);
        this.j = aHV.c();
        this.f = new Handler(Looper.getMainLooper());
        this.a = context;
        this.e = experimentalCronetEngine;
        this.i = new C8165dfI(1000, 60000L);
    }

    @Override // o.C9861xv
    public void b(Request request, C9861xv.e eVar) {
        FtlSession d = FtlController.INSTANCE.d();
        if (d != null) {
            if (request.C() && d.e(request.u())) {
                request.a(d);
            } else {
                String a = d.a(request.u());
                if (a != null) {
                    request.b(a);
                }
            }
        }
        if (!this.d && this.i.d()) {
            this.d = true;
            InterfaceC1598aHf.a("network requests too fast");
        }
        e(request, new c(request, eVar));
    }

    private void d(final aZE aze, final Map<String, String> map, final c cVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aze.s() == Request.Priority.LOW) {
            threadPoolExecutor = c;
        } else {
            threadPoolExecutor = b;
            long taskCount = threadPoolExecutor.getTaskCount();
            long completedTaskCount = threadPoolExecutor.getCompletedTaskCount();
            ThreadPoolExecutor threadPoolExecutor2 = c;
            long taskCount2 = threadPoolExecutor2.getTaskCount();
            long completedTaskCount2 = threadPoolExecutor2.getCompletedTaskCount();
            if (taskCount - completedTaskCount >= threadPoolExecutor.getMaximumPoolSize() && taskCount2 - completedTaskCount2 < threadPoolExecutor2.getMaximumPoolSize()) {
                threadPoolExecutor = threadPoolExecutor2;
            }
        }
        threadPoolExecutor.execute(new Runnable() { // from class: o.aHy
            @Override // java.lang.Runnable
            public final void run() {
                C1614aHv.this.a(aze, map, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(aZE aze, Map map, final c cVar) {
        boolean z;
        boolean z2;
        if (aze.d(aHT.class)) {
            aze.c(new RequestMetricsMarker(RequestMetricsMarker.Type.MSL_START));
        }
        int i = 0;
        do {
            try {
                final C8386djr d = aze.d((Map<String, String>) map);
                aHJ.e.execute(new Runnable() { // from class: o.aHv.4
                    @Override // java.lang.Runnable
                    public void run() {
                        c cVar2 = cVar;
                        C8386djr c8386djr = d;
                        cVar2.b(new C9858xs(200, c8386djr.b, C8185dfc.b(c8386djr.a), false));
                    }
                });
                z2 = false;
                continue;
            } catch (Exception e) {
                Throwable th = e;
                for (int i2 = 0; i2 < 10 && th != null; i2++) {
                    z2 = true;
                    if (th instanceof CronetException) {
                        if (th.getCause() instanceof HttpRetryException) {
                            int i3 = i + 1;
                            if (i < 6) {
                                i = i3;
                                z = true;
                            } else {
                                i = i3;
                            }
                        }
                        cVar.d(new VolleyError(th));
                    } else if (th instanceof VolleyError) {
                        cVar.d((VolleyError) th);
                    } else {
                        th = th.getCause();
                    }
                    z = true;
                    z2 = false;
                }
                z = false;
                z2 = false;
                if (z) {
                    continue;
                } else {
                    cVar.d(new VolleyError(e));
                    continue;
                }
            }
        } while (z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Request request, c cVar) {
        if (request.g() != null) {
            request.b(request.g().b());
        }
        request.E();
        HashMap hashMap = new HashMap();
        try {
            Map<String, String> e = aHO.e(request.d());
            if (e != null) {
                hashMap.putAll(e);
            }
            if (request instanceof aZE) {
                d((aZE) request, hashMap, cVar);
                return;
            }
            byte[] Q_ = request.Q_();
            aHA aha = new aHA(request.u(), cVar);
            ExperimentalCronetEngine experimentalCronetEngine = this.e;
            String u = request.u();
            Executor executor = aHJ.e;
            ExperimentalUrlRequest.Builder newUrlRequestBuilder = experimentalCronetEngine.newUrlRequestBuilder(u, (UrlRequest.Callback) aha, executor);
            if (!request.G()) {
                newUrlRequestBuilder.disableCache();
            }
            String d = aHD.d(request, Q_);
            newUrlRequestBuilder.setHttpMethod(d);
            if ("POST".equals(d)) {
                if (Q_ != null) {
                    newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(Q_), executor);
                }
                newUrlRequestBuilder.addHeader("Content-Type", request.a());
            }
            Map<String, String> j = request.j();
            if (j != null) {
                hashMap.putAll(j);
            }
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                newUrlRequestBuilder.addHeader(entry.getKey(), entry.getValue());
            }
            newUrlRequestBuilder.setPriority(aHD.e(request.s()));
            for (Object obj : request.p()) {
                newUrlRequestBuilder.addRequestAnnotation(obj);
            }
            if (request.y() instanceof NetworkRequestType) {
                newUrlRequestBuilder.addRequestAnnotation(request.y());
            }
            ExperimentalUrlRequest build = newUrlRequestBuilder.build();
            aha.d(this.f, build, request.s() == Request.Priority.LOW);
            build.start();
        } catch (Exception e2) {
            cVar.a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aHv$c */
    /* loaded from: classes3.dex */
    public class c implements aHA.a {
        private final Request b;
        private final C9861xv.e d;

        public c(Request request, C9861xv.e eVar) {
            this.b = request;
            this.d = eVar;
            if (request.g() != null) {
                request.g().e(request);
            }
        }

        @Override // o.aHA.a
        public void b(C9858xs c9858xs) {
            if (this.b.g() != null) {
                this.b.g().b(this.b, c9858xs, null);
            }
            c(c9858xs);
            int i = c9858xs.e;
            if (i == 410) {
                String a = aHO.a(c9858xs.c);
                C1044Mm.a("nf_network", "GONE: redirecting to %s", a);
                if (a != null) {
                    this.b.b(a);
                    C1614aHv.this.e(this.b, this);
                    return;
                }
                a((VolleyError) new ServerError(c9858xs));
            } else if (i == 301 || i == 302 || i == 307) {
                String str = c9858xs.d.get("Location");
                C1044Mm.a("nf_network", "REDIRECT: redirecting to %s", str);
                if (str != null) {
                    this.b.d(str);
                    C1614aHv.this.e(this.b, this);
                    return;
                }
                a((VolleyError) new ServerError(c9858xs));
            } else if (i >= 400 || i < 200) {
                a((VolleyError) new ServerError(c9858xs));
            } else if (i == 304) {
                C9861xv.e eVar = this.d;
                Request request = this.b;
                eVar.c(request, new C9858xs(i, request.d().c, c9858xs.d, true), null);
            } else {
                this.d.c(this.b, c9858xs, null);
            }
        }

        @Override // o.aHA.a
        public void d(VolleyError volleyError) {
            if (this.b.g() != null) {
                this.b.g().b(this.b, volleyError.b, volleyError);
            }
            c(volleyError.b);
            a(volleyError);
        }

        @Override // o.aHA.a
        public void a(Exception exc) {
            if (!(exc instanceof VolleyError)) {
                exc = new VolleyError(exc);
            }
            this.d.c(this.b, null, (VolleyError) exc);
        }

        private void a(VolleyError volleyError) {
            long c = c(this.b);
            if (c(this.b, volleyError)) {
                C1614aHv.this.f.postDelayed(new Runnable() { // from class: o.aHv.c.1
                    @Override // java.lang.Runnable
                    public void run() {
                        c cVar = c.this;
                        C1614aHv.this.e(cVar.b, c.this);
                    }
                }, c);
            } else {
                this.d.c(this.b, null, volleyError);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean c(com.netflix.android.volley.Request r5, com.netflix.android.volley.VolleyError r6) {
            /*
                r4 = this;
                o.xA r5 = r5.t()
                r0 = 0
                r1 = 1
                if (r5 == 0) goto Ld
                r5.c(r6)     // Catch: com.netflix.android.volley.VolleyError -> Ld
                r6 = r1
                goto Le
            Ld:
                r6 = r0
            Le:
                o.aHv r2 = o.C1614aHv.this
                o.aHV r2 = o.C1614aHv.a(r2)
                int r2 = r2.d()
                r3 = -1
                if (r2 != r3) goto L1c
                goto L2e
            L1c:
                if (r5 == 0) goto L30
                int r5 = r5.b()
                o.aHv r2 = o.C1614aHv.this
                o.aHV r2 = o.C1614aHv.a(r2)
                int r2 = r2.d()
                if (r5 >= r2) goto L30
            L2e:
                r5 = r1
                goto L31
            L30:
                r5 = r0
            L31:
                if (r6 == 0) goto L36
                if (r5 == 0) goto L36
                r0 = r1
            L36:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1614aHv.c.c(com.netflix.android.volley.Request, com.netflix.android.volley.VolleyError):boolean");
        }

        private long c(Request request) {
            InterfaceC9814xA t = request.t();
            long pow = t != null ? (long) (Math.pow(2.0d, t.b()) * 100.0d) : 100L;
            return C1614aHv.this.j.b() != -1 ? Math.max(pow, C1614aHv.this.j.b() * 1000) : pow;
        }

        private void c(C9858xs c9858xs) {
            Map<String, String> map;
            if (c9858xs == null || (map = c9858xs.d) == null) {
                return;
            }
            String str = map.get("X-Netflix.Retry.Server.Policy");
            if (TextUtils.isEmpty(str) || str.hashCode() == C1614aHv.this.g) {
                return;
            }
            C1614aHv.this.g = str.hashCode();
            C1614aHv c1614aHv = C1614aHv.this;
            c1614aHv.j = aHV.a(c1614aHv.j, (aHV) ((Gson) C1332Xp.b(Gson.class)).fromJson(str, (Class<Object>) aHV.class));
            C1044Mm.c("nf_network", "updated server retry policy to %s", C1614aHv.this.j);
        }
    }
}
