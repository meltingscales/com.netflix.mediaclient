package kotlinx.coroutines.scheduling;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import o.AbstractC8727dwh;
import o.AbstractRunnableC7685dBo;
import o.C7686dBp;
import o.C7687dBq;
import o.C7689dBs;
import o.C7694dBx;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.C8735dwp;
import o.InterfaceC7688dBr;
import o.dAF;
import o.dAH;
import o.dpR;
import o.dwW;

/* loaded from: classes5.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    private volatile int _isTerminated;
    public final C7686dBp a;
    public final int c;
    private volatile long controlState;
    public final C7686dBp d;
    public final int f;
    public final dAF<e> h;
    public final String i;
    public final long j;
    private volatile long parkedWorkersStack;
    public static final c b = new c(null);
    private static final AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    private static final AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
    private static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    public static final dAH e = new dAH("NOT_IN_STACK");

    /* loaded from: classes5.dex */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* loaded from: classes5.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr;
        }
    }

    public CoroutineScheduler(int i, int i2, long j, String str) {
        this.c = i;
        this.f = i2;
        this.j = j;
        this.i = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        } else if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        } else {
            this.d = new C7686dBp();
            this.a = new C7686dBp();
            this.h = new dAF<>((i + 1) * 2);
            this.controlState = i << 42;
            this._isTerminated = 0;
        }
    }

    public final void a(e eVar, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            if (i3 == i) {
                i3 = i2 == 0 ? d(eVar) : i2;
            }
            if (i3 >= 0 && l.compareAndSet(this, j, i3 | ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152)))) {
                return;
            }
        }
    }

    public final boolean e(e eVar) {
        long j;
        int e2;
        if (eVar.c() != e) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        do {
            j = atomicLongFieldUpdater.get(this);
            e2 = eVar.e();
            eVar.d((Object) this.h.a((int) (2097151 & j)));
        } while (!l.compareAndSet(this, j, e2 | ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152))));
        return true;
    }

    private final e f() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            e a = this.h.a((int) (2097151 & j));
            if (a == null) {
                return null;
            }
            int d2 = d(a);
            if (d2 >= 0 && l.compareAndSet(this, j, d2 | ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152)))) {
                a.d(e);
                return a;
            }
        }
    }

    private final int d(e eVar) {
        Object c2 = eVar.c();
        while (c2 != e) {
            if (c2 == null) {
                return 0;
            }
            e eVar2 = (e) c2;
            int e2 = eVar2.e();
            if (e2 != 0) {
                return e2;
            }
            c2 = eVar2.c();
        }
        return -1;
    }

    public final boolean e() {
        return g.get(this) != 0;
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        e(this, runnable, null, false, 6, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c(10000L);
    }

    public final void c(long j) {
        int i;
        AbstractRunnableC7685dBo d2;
        if (g.compareAndSet(this, 0, 1)) {
            e c2 = c();
            synchronized (this.h) {
                i = (int) (n.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    e a = this.h.a(i2);
                    C8632dsu.d(a);
                    e eVar = a;
                    if (eVar != c2) {
                        while (eVar.isAlive()) {
                            LockSupport.unpark(eVar);
                            eVar.join(j);
                        }
                        eVar.b.e(this.a);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.a.e();
            this.d.e();
            while (true) {
                if (c2 != null) {
                    d2 = c2.c(true);
                    if (d2 != null) {
                        continue;
                        d(d2);
                    }
                }
                d2 = this.d.d();
                if (d2 == null && (d2 = this.a.d()) == null) {
                    break;
                }
                d(d2);
            }
            if (c2 != null) {
                c2.b(WorkerState.TERMINATED);
            }
            l.set(this, 0L);
            n.set(this, 0L);
        }
    }

    public static /* synthetic */ void e(CoroutineScheduler coroutineScheduler, Runnable runnable, InterfaceC7688dBr interfaceC7688dBr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC7688dBr = C7687dBq.j;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.a(runnable, interfaceC7688dBr, z);
    }

    public final void a(Runnable runnable, InterfaceC7688dBr interfaceC7688dBr, boolean z) {
        AbstractC8727dwh b2 = C8735dwp.b();
        if (b2 != null) {
            b2.a();
        }
        AbstractRunnableC7685dBo b3 = b(runnable, interfaceC7688dBr);
        boolean z2 = false;
        boolean z3 = b3.f.c() == 1;
        long addAndGet = z3 ? n.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        e c2 = c();
        AbstractRunnableC7685dBo b4 = b(c2, b3, z);
        if (b4 != null && !b(b4)) {
            throw new RejectedExecutionException(this.i + " was terminated");
        }
        if (z && c2 != null) {
            z2 = true;
        }
        if (z3) {
            a(addAndGet, z2);
        } else if (z2) {
        } else {
            b();
        }
    }

    public final AbstractRunnableC7685dBo b(Runnable runnable, InterfaceC7688dBr interfaceC7688dBr) {
        long c2 = C7687dBq.i.c();
        if (runnable instanceof AbstractRunnableC7685dBo) {
            AbstractRunnableC7685dBo abstractRunnableC7685dBo = (AbstractRunnableC7685dBo) runnable;
            abstractRunnableC7685dBo.g = c2;
            abstractRunnableC7685dBo.f = interfaceC7688dBr;
            return abstractRunnableC7685dBo;
        }
        return new C7689dBs(runnable, c2, interfaceC7688dBr);
    }

    private final void a(long j, boolean z) {
        if (z || g() || b(j)) {
            return;
        }
        g();
    }

    public final void b() {
        if (g() || a(this, 0L, 1, null)) {
            return;
        }
        g();
    }

    static /* synthetic */ boolean a(CoroutineScheduler coroutineScheduler, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = n.get(coroutineScheduler);
        }
        return coroutineScheduler.b(j);
    }

    private final boolean b(long j) {
        int b2;
        b2 = C8657dts.b(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0);
        if (b2 < this.c) {
            int a = a();
            if (a == 1 && this.c > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean g() {
        e f;
        do {
            f = f();
            if (f == null) {
                return false;
            }
        } while (!e.a().compareAndSet(f, -1, 0));
        LockSupport.unpark(f);
        return true;
    }

    private final AbstractRunnableC7685dBo b(e eVar, AbstractRunnableC7685dBo abstractRunnableC7685dBo, boolean z) {
        if (eVar == null || eVar.a == WorkerState.TERMINATED) {
            return abstractRunnableC7685dBo;
        }
        if (abstractRunnableC7685dBo.f.c() == 0 && eVar.a == WorkerState.BLOCKING) {
            return abstractRunnableC7685dBo;
        }
        eVar.e = true;
        return eVar.b.b(abstractRunnableC7685dBo, z);
    }

    private final e c() {
        Thread currentThread = Thread.currentThread();
        e eVar = currentThread instanceof e ? (e) currentThread : null;
        if (eVar == null || !C8632dsu.c(CoroutineScheduler.this, this)) {
            return null;
        }
        return eVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int d2 = this.h.d();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < d2; i6++) {
            e a = this.h.a(i6);
            if (a != null) {
                int a2 = a.b.a();
                int i7 = d.b[a.a.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(a2);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a2);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (a2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(a2);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = n.get(this);
        return this.i + '@' + dwW.a(this) + "[Pool Size {core = " + this.c + ", max = " + this.f + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.d.a() + ", global blocking queue size = " + this.a.a() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.c - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public final void d(AbstractRunnableC7685dBo abstractRunnableC7685dBo) {
        try {
            abstractRunnableC7685dBo.run();
            AbstractC8727dwh b2 = C8735dwp.b();
            if (b2 == null) {
            }
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            } finally {
                AbstractC8727dwh b3 = C8735dwp.b();
                if (b3 != null) {
                    b3.c();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class e extends Thread {
        private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(e.class, "workerCtl");
        public WorkerState a;
        public final C7694dBx b;
        public boolean e;
        private long f;
        private int g;
        private final Ref.ObjectRef<AbstractRunnableC7685dBo> h;
        private volatile int indexInArray;
        private long j;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        public static final AtomicIntegerFieldUpdater a() {
            return d;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final void d(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final int e() {
            return this.indexInArray;
        }

        private e() {
            setDaemon(true);
            this.b = new C7694dBx();
            this.h = new Ref.ObjectRef<>();
            this.a = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.e;
            this.g = Random.a.b();
        }

        public final void d(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.i);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public e(CoroutineScheduler coroutineScheduler, int i) {
            this();
            d(i);
        }

        private final boolean g() {
            long j;
            if (this.a != WorkerState.CPU_ACQUIRED) {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.n;
                do {
                    j = atomicLongFieldUpdater.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        return false;
                    }
                } while (!CoroutineScheduler.n.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
                this.a = WorkerState.CPU_ACQUIRED;
            }
            return true;
        }

        public final boolean b(WorkerState workerState) {
            WorkerState workerState2 = this.a;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.n.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.a = workerState;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            i();
        }

        private final void i() {
            loop0: while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.e() && this.a != WorkerState.TERMINATED) {
                    AbstractRunnableC7685dBo c = c(this.e);
                    if (c != null) {
                        this.j = 0L;
                        e(c);
                    } else {
                        this.e = false;
                        if (this.j == 0) {
                            j();
                        } else if (z) {
                            b(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.j);
                            this.j = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            b(WorkerState.TERMINATED);
        }

        private final void j() {
            if (!b()) {
                CoroutineScheduler.this.e(this);
                return;
            }
            d.set(this, -1);
            while (b() && d.get(this) == -1 && !CoroutineScheduler.this.e() && this.a != WorkerState.TERMINATED) {
                b(WorkerState.PARKING);
                Thread.interrupted();
                f();
            }
        }

        private final boolean b() {
            return this.nextParkedWorker != CoroutineScheduler.e;
        }

        private final void c(int i) {
            if (i != 0 && b(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.b();
            }
        }

        private final void a(int i) {
            if (i == 0) {
                return;
            }
            CoroutineScheduler.n.addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.a != WorkerState.TERMINATED) {
                this.a = WorkerState.DORMANT;
            }
        }

        public final int b(int i) {
            int i2 = this.g;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.g = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        private final void f() {
            if (this.f == 0) {
                this.f = System.nanoTime() + CoroutineScheduler.this.j;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.j);
            if (System.nanoTime() - this.f >= 0) {
                this.f = 0L;
                l();
            }
        }

        private final void l() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.h) {
                if (coroutineScheduler.e()) {
                    return;
                }
                if (((int) (CoroutineScheduler.n.get(coroutineScheduler) & 2097151)) <= coroutineScheduler.c) {
                    return;
                }
                if (d.compareAndSet(this, -1, 1)) {
                    int i = this.indexInArray;
                    d(0);
                    coroutineScheduler.a(this, i, 0);
                    int andDecrement = (int) (CoroutineScheduler.n.getAndDecrement(coroutineScheduler) & 2097151);
                    if (andDecrement != i) {
                        e a = coroutineScheduler.h.a(andDecrement);
                        C8632dsu.d(a);
                        e eVar = a;
                        coroutineScheduler.h.c(i, eVar);
                        eVar.d(i);
                        coroutineScheduler.a(eVar, andDecrement, i);
                    }
                    coroutineScheduler.h.c(andDecrement, null);
                    dpR dpr = dpR.c;
                    this.a = WorkerState.TERMINATED;
                }
            }
        }

        private final void e(int i) {
            this.f = 0L;
            if (this.a == WorkerState.PARKING) {
                this.a = WorkerState.BLOCKING;
            }
        }

        public final AbstractRunnableC7685dBo c(boolean z) {
            return g() ? e(z) : d();
        }

        private final AbstractRunnableC7685dBo d() {
            AbstractRunnableC7685dBo b = this.b.b();
            if (b == null) {
                AbstractRunnableC7685dBo d2 = CoroutineScheduler.this.a.d();
                return d2 == null ? j(1) : d2;
            }
            return b;
        }

        private final AbstractRunnableC7685dBo e(boolean z) {
            AbstractRunnableC7685dBo h;
            AbstractRunnableC7685dBo h2;
            if (z) {
                boolean z2 = b(CoroutineScheduler.this.c * 2) == 0;
                if (z2 && (h2 = h()) != null) {
                    return h2;
                }
                AbstractRunnableC7685dBo e = this.b.e();
                if (e != null) {
                    return e;
                }
                if (!z2 && (h = h()) != null) {
                    return h;
                }
            } else {
                AbstractRunnableC7685dBo h3 = h();
                if (h3 != null) {
                    return h3;
                }
            }
            return j(3);
        }

        private final AbstractRunnableC7685dBo h() {
            if (b(2) == 0) {
                AbstractRunnableC7685dBo d2 = CoroutineScheduler.this.d.d();
                return d2 != null ? d2 : CoroutineScheduler.this.a.d();
            }
            AbstractRunnableC7685dBo d3 = CoroutineScheduler.this.a.d();
            return d3 != null ? d3 : CoroutineScheduler.this.d.d();
        }

        private final AbstractRunnableC7685dBo j(int i) {
            int i2 = (int) (CoroutineScheduler.n.get(CoroutineScheduler.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int b = b(i2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                b++;
                if (b > i2) {
                    b = 1;
                }
                e a = coroutineScheduler.h.a(b);
                if (a != null && a != this) {
                    long d2 = a.b.d(i, this.h);
                    if (d2 == -1) {
                        Ref.ObjectRef<AbstractRunnableC7685dBo> objectRef = this.h;
                        AbstractRunnableC7685dBo abstractRunnableC7685dBo = objectRef.d;
                        objectRef.d = null;
                        return abstractRunnableC7685dBo;
                    } else if (d2 > 0) {
                        j = Math.min(j, d2);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.j = j;
            return null;
        }

        private final void e(AbstractRunnableC7685dBo abstractRunnableC7685dBo) {
            int c = abstractRunnableC7685dBo.f.c();
            e(c);
            c(c);
            CoroutineScheduler.this.d(abstractRunnableC7685dBo);
            a(c);
        }
    }

    private final boolean b(AbstractRunnableC7685dBo abstractRunnableC7685dBo) {
        if (abstractRunnableC7685dBo.f.c() == 1) {
            return this.a.e(abstractRunnableC7685dBo);
        }
        return this.d.e(abstractRunnableC7685dBo);
    }

    private final int a() {
        int b2;
        synchronized (this.h) {
            if (e()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            b2 = C8657dts.b(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (b2 >= this.c) {
                return 0;
            }
            if (i >= this.f) {
                return 0;
            }
            int i2 = ((int) (n.get(this) & 2097151)) + 1;
            if (i2 <= 0 || this.h.a(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            e eVar = new e(this, i2);
            this.h.c(i2, eVar);
            if (i2 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            eVar.start();
            return b2 + 1;
        }
    }
}
