package com.bugsnag.android;

import android.os.Handler;
import android.os.Looper;
import com.bugsnag.android.AnrPlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C8563dqf;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.C9170kY;
import o.C9179kh;
import o.C9191kt;
import o.C9199lA;
import o.C9229le;
import o.C9279mb;
import o.C9280mc;
import o.InterfaceC9217lS;
import o.InterfaceC9218lT;

/* loaded from: classes5.dex */
public final class AnrPlugin implements InterfaceC9217lS {
    private static final String ANR_ERROR_CLASS = "ANR";
    private static final String ANR_ERROR_MSG = "Application did not respond to UI input";
    public static final c Companion = new c(null);
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report ANRs. See https://docs.bugsnag.com/platforms/android/anr-link-errors";
    private C9191kt client;
    private final C9199lA libraryLoader = new C9199lA();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);
    private final C9179kh collector = new C9179kh();

    private final native void disableAnrReporting();

    private final native void enableAnrReporting();

    private final native void setUnwindFunction(long j);

    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final boolean a(StackTraceElement[] stackTraceElementArr) {
            Object x;
            if (stackTraceElementArr.length == 0) {
                return false;
            }
            x = C8563dqf.x(stackTraceElementArr);
            return ((StackTraceElement) x).isNativeMethod();
        }
    }

    private final Class<?> loadClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // o.InterfaceC9217lS
    public void load(C9191kt c9191kt) {
        this.client = c9191kt;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(c9191kt);
        }
        if (this.libraryLoader.a()) {
            Looper mainLooper = Looper.getMainLooper();
            if (C8632dsu.c(Looper.myLooper(), mainLooper)) {
                initNativePlugin();
                return;
            } else {
                new Handler(mainLooper).postAtFrontOfQueue(new Runnable() { // from class: o.kd
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrPlugin.this.initNativePlugin();
                    }
                });
                return;
            }
        }
        c9191kt.m.c(LOAD_ERR_MSG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initNativePlugin() {
        enableAnrReporting();
        C9191kt c9191kt = this.client;
        if (c9191kt != null) {
            c9191kt.m.a("Initialised ANR Plugin");
        } else {
            C8632dsu.d("");
            throw null;
        }
    }

    private final void performOneTimeSetup(C9191kt c9191kt) {
        InterfaceC9217lS a;
        this.libraryLoader.d("bugsnag-plugin-android-anr", c9191kt, new InterfaceC9218lT() { // from class: o.kg
            @Override // o.InterfaceC9218lT
            public final boolean c(C9229le c9229le) {
                boolean m2761performOneTimeSetup$lambda1;
                m2761performOneTimeSetup$lambda1 = AnrPlugin.m2761performOneTimeSetup$lambda1(c9229le);
                return m2761performOneTimeSetup$lambda1;
            }
        });
        Class<?> loadClass = loadClass("com.bugsnag.android.NdkPlugin");
        if (loadClass == null || (a = c9191kt.a(loadClass)) == null) {
            return;
        }
        Object invoke = a.getClass().getMethod("getSignalUnwindStackFunction", new Class[0]).invoke(a, new Object[0]);
        if (invoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        setUnwindFunction(((Long) invoke).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performOneTimeSetup$lambda-1  reason: not valid java name */
    public static final boolean m2761performOneTimeSetup$lambda1(C9229le c9229le) {
        C9170kY c9170kY = c9229le.c().get(0);
        c9170kY.e("AnrLinkError");
        c9170kY.d(LOAD_ERR_MSG);
        return true;
    }

    @Override // o.InterfaceC9217lS
    public void unload() {
        if (this.libraryLoader.a()) {
            disableAnrReporting();
        }
    }

    private final void notifyAnrDetected(List<NativeStackframe> list) {
        int d;
        Object obj;
        List<C9279mb> d2;
        try {
            C9191kt c9191kt = this.client;
            if (c9191kt != null) {
                if (c9191kt.l.a(ANR_ERROR_CLASS)) {
                    return;
                }
                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                boolean a = Companion.a(stackTrace);
                RuntimeException runtimeException = new RuntimeException();
                runtimeException.setStackTrace(stackTrace);
                C9191kt c9191kt2 = this.client;
                if (c9191kt2 != null) {
                    C9229le createEvent = NativeInterface.createEvent(runtimeException, c9191kt2, C9280mc.a("anrError"));
                    C9170kY c9170kY = createEvent.c().get(0);
                    c9170kY.e(ANR_ERROR_CLASS);
                    c9170kY.d(ANR_ERROR_MSG);
                    if (a) {
                        d = C8572dqo.d(list, 10);
                        ArrayList arrayList = new ArrayList(d);
                        for (NativeStackframe nativeStackframe : list) {
                            arrayList.add(new C9279mb(nativeStackframe));
                        }
                        c9170kY.a().addAll(0, arrayList);
                        Iterator<T> it = createEvent.f().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((Thread) obj).c()) {
                                break;
                            }
                        }
                        Thread thread = (Thread) obj;
                        if (thread != null && (d2 = thread.d()) != null) {
                            d2.addAll(0, arrayList);
                        }
                    }
                    C9179kh c9179kh = this.collector;
                    C9191kt c9191kt3 = this.client;
                    if (c9191kt3 != null) {
                        c9179kh.e(c9191kt3, createEvent);
                        return;
                    } else {
                        C8632dsu.d("");
                        throw null;
                    }
                }
                C8632dsu.d("");
                throw null;
            }
            C8632dsu.d("");
            throw null;
        } catch (Exception e) {
            C9191kt c9191kt4 = this.client;
            if (c9191kt4 == null) {
                C8632dsu.d("");
                throw null;
            }
            c9191kt4.m.c("Internal error reporting ANR", e);
        }
    }
}
