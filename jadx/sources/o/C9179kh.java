package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;

/* renamed from: o.kh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9179kh {
    public static final a a = new a(null);
    private final HandlerThread d;

    public C9179kh() {
        HandlerThread handlerThread = new HandlerThread("bugsnag-anr-collector");
        this.d = handlerThread;
        handlerThread.start();
    }

    /* renamed from: o.kh$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    public final ActivityManager.ProcessErrorStateInfo d(Context context) {
        Object obj;
        try {
            Result.c cVar = Result.e;
            Object systemService = context.getSystemService("activity");
            obj = Result.e(systemService instanceof ActivityManager ? (ActivityManager) systemService : null);
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            obj = Result.e(C8556dpz.a(th));
        }
        return c((ActivityManager) (Result.a(obj) ? null : obj), Process.myPid());
    }

    public final ActivityManager.ProcessErrorStateInfo c(ActivityManager activityManager, int i) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        Object obj;
        if (activityManager == null) {
            processesInErrorState = null;
        } else {
            try {
                processesInErrorState = activityManager.getProcessesInErrorState();
            } catch (RuntimeException unused) {
                return null;
            }
        }
        if (processesInErrorState == null) {
            processesInErrorState = C8569dql.i();
        }
        Iterator<T> it = processesInErrorState.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.ProcessErrorStateInfo) obj).pid == i) {
                break;
            }
        }
        return (ActivityManager.ProcessErrorStateInfo) obj;
    }

    public final void e(C9229le c9229le, ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        boolean i;
        String str = processErrorStateInfo.shortMsg;
        if (!c9229le.c().isEmpty()) {
            C9170kY c9170kY = c9229le.c().get(0);
            i = C8691duz.i(str, "ANR", false, 2, null);
            if (i) {
                str = C8691duz.c(str, "ANR", "", false, 4, null);
            }
            c9170kY.d(str);
        }
    }

    public final void e(C9191kt c9191kt, C9229le c9229le) {
        Handler handler = new Handler(this.d.getLooper());
        handler.post(new e(c9191kt, new AtomicInteger(), handler, c9229le));
    }

    /* renamed from: o.kh$e */
    /* loaded from: classes5.dex */
    public static final class e implements Runnable {
        final /* synthetic */ Handler a;
        final /* synthetic */ C9229le b;
        final /* synthetic */ AtomicInteger c;
        final /* synthetic */ C9191kt e;

        e(C9191kt c9191kt, AtomicInteger atomicInteger, Handler handler, C9229le c9229le) {
            this.e = c9191kt;
            this.c = atomicInteger;
            this.a = handler;
            this.b = c9229le;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityManager.ProcessErrorStateInfo d = C9179kh.this.d(this.e.b);
            if (d == null) {
                if (this.c.getAndIncrement() < 300) {
                    this.a.postDelayed(this, 100L);
                    return;
                }
                return;
            }
            C9179kh.this.e(this.b, d);
            this.e.c(this.b, (InterfaceC9218lT) null);
        }
    }
}
