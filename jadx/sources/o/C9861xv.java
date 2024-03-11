package o;

import android.net.TrafficStats;
import android.os.Process;
import android.util.Log;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;

/* renamed from: o.xv  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9861xv extends Thread implements InterfaceC9859xt {
    private static final WeakHashMap<b, b> d = new WeakHashMap<>();
    private final InterfaceC9854xo a;
    private final InterfaceC9863xx b;
    private final InterfaceC9857xr c;
    private String e;
    private final BlockingQueue<Request> g;
    private volatile boolean j;

    /* renamed from: o.xv$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(Request request);

        void a(Request request, Throwable th);
    }

    /* renamed from: o.xv$e */
    /* loaded from: classes2.dex */
    public interface e {
        void c(Request request, C9858xs c9858xs, VolleyError volleyError);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9861xv(java.util.concurrent.BlockingQueue<com.netflix.android.volley.Request> r3, o.InterfaceC9857xr r4, o.InterfaceC9854xo r5, o.InterfaceC9863xx r6, java.lang.String r7) {
        /*
            r2 = this;
            if (r7 != 0) goto L5
            java.lang.String r0 = "NetworkDispatcher"
            goto L16
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NetworkDispatcher-"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
        L16:
            r2.<init>(r0)
            r0 = 0
            r2.j = r0
            r2.g = r3
            r2.c = r4
            r2.a = r5
            r2.b = r6
            r2.e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9861xv.<init>(java.util.concurrent.BlockingQueue, o.xr, o.xo, o.xx, java.lang.String):void");
    }

    @Override // o.InterfaceC9859xt
    public void a() {
        this.j = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                Request take = this.g.take();
                if (this.g.size() > 0) {
                    Log.i("RequestQueue_Blocked", this.e + " Http request is blocked ?- queue size: " + this.g.size());
                }
                try {
                    synchronized (take) {
                        take.e("network-queue-take");
                        if (take.D()) {
                            take.c("network-discard-cancelled");
                        } else {
                            b(take);
                            TrafficStats.setThreadStatsTag(take.v());
                            if (take.u().startsWith("file://")) {
                                c(take, new C9858xs(200, C9831xR.c(take.u()), Collections.emptyMap(), false));
                            } else {
                                b(take, new e() { // from class: o.xv.3
                                    @Override // o.C9861xv.e
                                    public void c(Request request, C9858xs c9858xs, VolleyError volleyError) {
                                        try {
                                            if (volleyError != null) {
                                                throw volleyError;
                                            }
                                            C9861xv.this.c(request, c9858xs);
                                        } catch (VolleyError e2) {
                                            C9861xv.this.c(request, e2);
                                        } catch (Exception e3) {
                                            C9862xw.d(e3, "unhandled error on request finish", new Object[0]);
                                            C9861xv.this.c(request, e3);
                                        }
                                    }
                                });
                            }
                        }
                    }
                } catch (VolleyError e2) {
                    c(take, e2);
                } catch (Exception e3) {
                    c(take, e3);
                }
            } catch (InterruptedException unused) {
                if (this.j) {
                    return;
                }
            }
        }
    }

    protected void b(Request request, e eVar) {
        eVar.c(request, this.c.e(request), null);
    }

    protected void c(Request request, C9858xs c9858xs) {
        request.e("network-http-complete");
        if (c9858xs.a && request.w()) {
            request.c("not-modified");
            return;
        }
        C9864xy<?> b2 = request.b(c9858xs);
        request.e("network-parse-complete");
        if (request.G() && b2.a != null) {
            this.a.e(request.b(), b2.a);
            request.e("network-cache-written");
        }
        request.I();
        this.b.b(request, b2);
        a(request);
    }

    protected void c(Request request, VolleyError volleyError) {
        d(request, volleyError);
        c(request, (Throwable) volleyError);
    }

    protected void c(Request request, Exception exc) {
        C9862xw.d(exc, "Unhandled exception %s", exc.toString());
        this.b.e(request, new VolleyError(exc));
        c(request, (Throwable) exc);
    }

    private void b(Request request) {
        Set<b> keySet;
        request.c(true);
        request.c(Request.ResourceLocationType.NETWORK);
        WeakHashMap<b, b> weakHashMap = d;
        synchronized (weakHashMap) {
            keySet = weakHashMap.keySet();
        }
        for (b bVar : keySet) {
            if (bVar != null) {
                bVar.a(request);
            }
        }
    }

    private void a(Request request) {
        e(request, null);
    }

    private void c(Request request, Throwable th) {
        e(request, th);
    }

    private void e(Request request, Throwable th) {
        Set<b> keySet;
        request.c(false);
        WeakHashMap<b, b> weakHashMap = d;
        synchronized (weakHashMap) {
            keySet = weakHashMap.keySet();
        }
        for (b bVar : keySet) {
            if (bVar != null) {
                bVar.a(request, th);
            }
        }
    }

    private void d(Request<?> request, VolleyError volleyError) {
        this.b.e(request, request.e(volleyError));
    }

    public static void e(b bVar) {
        WeakHashMap<b, b> weakHashMap = d;
        synchronized (weakHashMap) {
            weakHashMap.remove(bVar);
        }
    }
}
