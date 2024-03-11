package o;

import android.os.SystemClock;
import com.bugsnag.android.ErrorType;
import com.bugsnag.android.Thread;
import com.bugsnag.android.ThreadSendPolicy;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.C8632dsu;
import o.C9246lv;

/* renamed from: o.ml  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9289ml implements C9246lv.a {
    public static final e a = new e(null);
    private final List<Thread> c;

    public final List<Thread> c() {
        return this.c;
    }

    public C9289ml(Throwable th, boolean z, int i, long j, ThreadSendPolicy threadSendPolicy, Collection<String> collection, InterfaceC9200lB interfaceC9200lB, Thread thread, List<? extends Thread> list) {
        List<Thread> a2;
        if (threadSendPolicy == ThreadSendPolicy.ALWAYS || (threadSendPolicy == ThreadSendPolicy.UNHANDLED_ONLY && z)) {
            a2 = a(list, thread, th, z, i, j, collection, interfaceC9200lB);
        } else {
            a2 = new ArrayList<>();
        }
        this.c = a2;
    }

    public /* synthetic */ C9289ml(Throwable th, boolean z, int i, long j, ThreadSendPolicy threadSendPolicy, Collection collection, InterfaceC9200lB interfaceC9200lB, Thread thread, List list, int i2, C8627dsp c8627dsp) {
        this(th, z, i, j, threadSendPolicy, collection, interfaceC9200lB, (i2 & 128) != 0 ? Thread.currentThread() : thread, (i2 & JSONzip.end) != 0 ? a.b() : list);
    }

    public C9289ml(Throwable th, boolean z, C9258mG c9258mG) {
        this(th, z, c9258mG.q(), c9258mG.D(), c9258mG.z(), c9258mG.u(), c9258mG.m(), null, null, 384, null);
    }

    /* renamed from: o.ml$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        private final ThreadGroup a() {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            C8632dsu.d(threadGroup);
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            return threadGroup;
        }

        public final List<Thread> b() {
            List<Thread> u;
            ThreadGroup a = a();
            Thread[] threadArr = new Thread[a.activeCount()];
            a.enumerate(threadArr);
            u = C8563dqf.u(threadArr);
            return u;
        }
    }

    private static final Thread e(Thread thread, Throwable th, boolean z, Collection<String> collection, InterfaceC9200lB interfaceC9200lB, Thread thread2) {
        StackTraceElement[] stackTrace;
        boolean z2 = thread2.getId() == thread.getId();
        if (!z2) {
            stackTrace = thread2.getStackTrace();
        } else if (th != null && z) {
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = thread.getStackTrace();
        }
        return new Thread(String.valueOf(thread2.getId()), thread2.getName(), ErrorType.ANDROID, z2, Thread.State.b(thread2), new C9278ma(stackTrace, collection, interfaceC9200lB), interfaceC9200lB);
    }

    /* renamed from: o.ml$b */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Thread) t).getId()), Long.valueOf(((Thread) t2).getId()));
            return compareValues;
        }
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.c();
        for (Thread thread : this.c) {
            c9246lv.c(thread);
        }
        c9246lv.b();
    }

    private final List<Thread> a(List<? extends Thread> list, final Thread thread, Throwable th, boolean z, int i, long j, Collection<String> collection, InterfaceC9200lB interfaceC9200lB) {
        List c;
        int e2;
        List<Thread> j2;
        c = C8576dqs.c((Iterable) list, (Comparator) new b());
        e2 = C8569dql.e(c, 0, Math.min(i, c.size()), new drM<Thread, Integer>() { // from class: com.bugsnag.android.ThreadState$captureThreadTrace$currentThreadIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Integer invoke(java.lang.Thread thread2) {
                return Integer.valueOf(c(thread2));
            }

            public final int c(java.lang.Thread thread2) {
                return C8632dsu.a(thread2.getId(), thread.getId());
            }
        });
        j2 = C8576dqs.j((Iterable) c, e2 >= 0 ? i : Math.max(i - 1, 0));
        ArrayList arrayList = new ArrayList(i);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (Thread thread2 : j2) {
            if (SystemClock.elapsedRealtime() >= elapsedRealtime + j) {
                break;
            }
            arrayList.add(e(thread, th, z, collection, interfaceC9200lB, thread2));
        }
        if (e2 < 0) {
            int i2 = (-e2) - 1;
            if (i2 >= arrayList.size()) {
                arrayList.add(e(thread, th, z, collection, interfaceC9200lB, thread));
            } else {
                arrayList.add(i2, e(thread, th, z, collection, interfaceC9200lB, thread));
            }
        } else if (e2 >= arrayList.size()) {
            arrayList.add(e(thread, th, z, collection, interfaceC9200lB, thread));
        }
        if (list.size() > i) {
            arrayList.add(new Thread("", '[' + (list.size() - i) + " threads omitted as the maxReportedThreads limit (" + i + ") was exceeded]", ErrorType.UNKNOWN, false, Thread.State.UNKNOWN, new C9278ma(new StackTraceElement[]{new StackTraceElement("", "", "-", 0)}, collection, interfaceC9200lB), interfaceC9200lB));
        }
        return arrayList;
    }
}
