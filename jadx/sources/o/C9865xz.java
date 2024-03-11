package o;

import com.netflix.android.volley.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.xz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9865xz {
    private C9853xn b;
    private final InterfaceC9863xx d;
    private final InterfaceC9854xo e;
    private final InterfaceC9857xr f;
    private InterfaceC9859xt[] g;
    private final C9860xu h;
    private String j;
    private AtomicInteger m = new AtomicInteger();
    private final Map<String, Queue<Request>> l = new HashMap();
    private final Set<Request> c = new HashSet();
    private final PriorityBlockingQueue<Request> a = new PriorityBlockingQueue<>();
    private final PriorityBlockingQueue<Request> i = new PriorityBlockingQueue<>();

    /* renamed from: o.xz$b */
    /* loaded from: classes2.dex */
    public interface b {
        boolean e(Request<?> request);
    }

    public InterfaceC9854xo a() {
        return this.e;
    }

    public C9865xz(InterfaceC9854xo interfaceC9854xo, InterfaceC9857xr interfaceC9857xr, int i, InterfaceC9863xx interfaceC9863xx, String str, C9860xu c9860xu) {
        this.e = interfaceC9854xo;
        this.f = interfaceC9857xr;
        this.g = new InterfaceC9859xt[i];
        this.d = interfaceC9863xx;
        this.j = str;
        if (c9860xu == null) {
            this.h = new C9860xu();
        } else {
            this.h = c9860xu;
        }
    }

    public void e() {
        b();
        C9853xn c9853xn = new C9853xn(this.a, this.i, this.e, this.d);
        this.b = c9853xn;
        c9853xn.start();
        String str = this.j != null ? this.j + "-" : "";
        for (int i = 0; i < this.g.length; i++) {
            InterfaceC9859xt d = this.h.d(this.i, this.f, this.e, this.d, str + i);
            this.g[i] = d;
            d.start();
        }
    }

    public void b() {
        C9853xn c9853xn = this.b;
        if (c9853xn != null) {
            c9853xn.c();
        }
        int i = 0;
        while (true) {
            InterfaceC9859xt[] interfaceC9859xtArr = this.g;
            if (i >= interfaceC9859xtArr.length) {
                return;
            }
            InterfaceC9859xt interfaceC9859xt = interfaceC9859xtArr[i];
            if (interfaceC9859xt != null) {
                interfaceC9859xt.a();
            }
            i++;
        }
    }

    public int d() {
        return this.m.incrementAndGet();
    }

    public <T> void b(Request request) {
        synchronized (this.c) {
            this.c.remove(request);
        }
        this.i.remove(request);
    }

    public void e(b bVar) {
        synchronized (this.c) {
            Iterator it = new ArrayList(this.c).iterator();
            while (it.hasNext()) {
                Request<?> request = (Request) it.next();
                if (bVar.e(request)) {
                    C9862xw.d("Cancelling req %s", request.u());
                    request.e();
                }
            }
        }
    }

    public void d(final Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        e(new b() { // from class: o.xz.1
            @Override // o.C9865xz.b
            public boolean e(Request<?> request) {
                return request.y() == obj;
            }
        });
    }

    public Request e(Request request) {
        request.b(this);
        synchronized (this.c) {
            this.c.add(request);
        }
        request.d(d());
        request.e("add-to-queue");
        if (!request.G()) {
            this.i.add(request);
            return request;
        }
        synchronized (this.l) {
            String b2 = request.b();
            if (this.l.containsKey(b2)) {
                Queue<Request> queue = this.l.get(b2);
                if (queue == null) {
                    queue = new LinkedList<>();
                }
                queue.add(request);
                this.l.put(b2, queue);
            } else {
                this.l.put(b2, null);
                this.a.add(request);
            }
        }
        return request;
    }

    public void d(Request request) {
        synchronized (this.c) {
            this.c.remove(request);
        }
        if (request.G()) {
            synchronized (this.l) {
                Queue<Request> remove = this.l.remove(request.b());
                if (remove != null) {
                    this.a.addAll(remove);
                }
            }
        }
    }
}
