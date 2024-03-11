package o;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.dGS;

/* renamed from: o.dGj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7815dGj {
    private Runnable d;
    private ExecutorService e;
    private int c = 64;
    private int a = 5;
    private final ArrayDeque<dGS.c> b = new ArrayDeque<>();
    private final ArrayDeque<dGS.c> j = new ArrayDeque<>();
    private final ArrayDeque<dGS> g = new ArrayDeque<>();

    public final ExecutorService a() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.e == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, dGB.d(dGB.f + " Dispatcher", false));
            }
            executorService = this.e;
            if (executorService == null) {
                C8632dsu.e();
            }
        }
        return executorService;
    }

    public final void a(dGS.c cVar) {
        dGS.c d;
        C8632dsu.d(cVar, "");
        synchronized (this) {
            this.b.add(cVar);
            if (!cVar.d().i() && (d = d(cVar.e())) != null) {
                cVar.c(d);
            }
            dpR dpr = dpR.c;
        }
        d();
    }

    private final dGS.c d(String str) {
        Iterator<dGS.c> it = this.j.iterator();
        while (it.hasNext()) {
            dGS.c next = it.next();
            if (C8632dsu.c((Object) next.e(), (Object) str)) {
                return next;
            }
        }
        Iterator<dGS.c> it2 = this.b.iterator();
        while (it2.hasNext()) {
            dGS.c next2 = it2.next();
            if (C8632dsu.c((Object) next2.e(), (Object) str)) {
                return next2;
            }
        }
        return null;
    }

    public final void b(dGS dgs) {
        synchronized (this) {
            C8632dsu.d(dgs, "");
            this.g.add(dgs);
        }
    }

    public final void c(dGS.c cVar) {
        C8632dsu.d(cVar, "");
        cVar.a().decrementAndGet();
        d(this.j, cVar);
    }

    public final void d(dGS dgs) {
        C8632dsu.d(dgs, "");
        d(this.g, dgs);
    }

    private final <T> void d(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.d;
            dpR dpr = dpR.c;
        }
        if (d() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final int c() {
        int size;
        int size2;
        synchronized (this) {
            size = this.j.size();
            size2 = this.g.size();
        }
        return size + size2;
    }

    private final boolean d() {
        int i;
        boolean z;
        if (!dGB.h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<dGS.c> it = this.b.iterator();
                C8632dsu.b(it, "");
                while (it.hasNext()) {
                    dGS.c next = it.next();
                    if (this.j.size() >= this.c) {
                        break;
                    } else if (next.a().get() < this.a) {
                        it.remove();
                        next.a().incrementAndGet();
                        C8632dsu.b(next, "");
                        arrayList.add(next);
                        this.j.add(next);
                    }
                }
                z = c() > 0;
                dpR dpr = dpR.c;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((dGS.c) arrayList.get(i)).d(a());
            }
            return z;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8632dsu.b(currentThread, "");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }
}
