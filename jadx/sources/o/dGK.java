package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class dGK {
    private boolean a;
    private final String b;
    private final List<dGH> c;
    private dGH d;
    private boolean e;
    private final dGL j;

    public final dGH a() {
        return this.d;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void c(dGH dgh) {
        this.d = dgh;
    }

    public final List<dGH> d() {
        return this.c;
    }

    public final boolean e() {
        return this.e;
    }

    public final dGL f() {
        return this.j;
    }

    public final boolean g() {
        return this.a;
    }

    public final String i() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }

    public dGK(dGL dgl, String str) {
        C8632dsu.d(dgl, "");
        C8632dsu.d((Object) str, "");
        this.j = dgl;
        this.b = str;
        this.c = new ArrayList();
    }

    public static /* synthetic */ void b(dGK dgk, dGH dgh, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        dgk.d(dgh, j);
    }

    public final void d(dGH dgh, long j) {
        C8632dsu.d(dgh, "");
        synchronized (this.j) {
            if (this.a) {
                if (dgh.e()) {
                    if (dGL.c.a().isLoggable(Level.FINE)) {
                        dGG.a(dgh, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (dGL.c.a().isLoggable(Level.FINE)) {
                    dGG.a(dgh, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (e(dgh, j, false)) {
                this.j.a(this);
            }
            dpR dpr = dpR.c;
        }
    }

    /* loaded from: classes5.dex */
    public static final class a extends dGH {
        final /* synthetic */ drO b;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(drO dro, String str, boolean z, String str2, boolean z2) {
            super(str2, z2);
            this.b = dro;
            this.c = str;
            this.d = z;
        }

        @Override // o.dGH
        public long d() {
            this.b.invoke();
            return -1L;
        }
    }

    public final boolean e(dGH dgh, long j, boolean z) {
        String str;
        C8632dsu.d(dgh, "");
        dgh.b(this);
        long e = this.j.a().e();
        long j2 = e + j;
        int indexOf = this.c.indexOf(dgh);
        if (indexOf != -1) {
            if (dgh.a() > j2) {
                this.c.remove(indexOf);
            } else {
                if (dGL.c.a().isLoggable(Level.FINE)) {
                    dGG.a(dgh, this, "already scheduled");
                }
                return false;
            }
        }
        dgh.e(j2);
        if (dGL.c.a().isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + dGG.e(j2 - e);
            } else {
                str = "scheduled after " + dGG.e(j2 - e);
            }
            dGG.a(dgh, this, str);
        }
        Iterator<dGH> it = this.c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().a() - e > j) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            i = this.c.size();
        }
        this.c.add(i, dgh);
        return i == 0;
    }

    public final boolean b() {
        dGH dgh = this.d;
        if (dgh != null) {
            if (dgh == null) {
                C8632dsu.e();
            }
            if (dgh.e()) {
                this.e = true;
            }
        }
        boolean z = false;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (this.c.get(size).e()) {
                dGH dgh2 = this.c.get(size);
                if (dGL.c.a().isLoggable(Level.FINE)) {
                    dGG.a(dgh2, this, "canceled");
                }
                this.c.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c() {
        if (!dGB.h || !Thread.holdsLock(this)) {
            synchronized (this.j) {
                if (b()) {
                    this.j.a(this);
                }
                dpR dpr = dpR.c;
            }
            return;
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

    public final void h() {
        if (!dGB.h || !Thread.holdsLock(this)) {
            synchronized (this.j) {
                this.a = true;
                if (b()) {
                    this.j.a(this);
                }
                dpR dpr = dpR.c;
            }
            return;
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
