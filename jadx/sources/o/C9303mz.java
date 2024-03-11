package o;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.mz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9303mz implements Application.ActivityLifecycleCallbacks, Handler.Callback {
    private static int a;
    private static boolean b;
    public static final C9303mz c;
    private static volatile long d;
    private static boolean e;
    private static Application f;
    private static int g;
    private static final Handler h;
    private static final ArrayList<WeakReference<b>> i;
    private static volatile long j;
    private static boolean l;

    /* renamed from: o.mz$b */
    /* loaded from: classes2.dex */
    public interface b {
        void c(Activity activity);

        void d(boolean z, long j);

        void e(Activity activity);
    }

    public static final long a() {
        return j;
    }

    public static final long b() {
        return d;
    }

    public static final boolean d() {
        return b;
    }

    public static final void e(b bVar) {
        c(bVar, false, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private C9303mz() {
    }

    static {
        C9303mz c9303mz = new C9303mz();
        c = c9303mz;
        i = new ArrayList<>();
        h = new Handler(Looper.getMainLooper(), c9303mz);
        e = true;
    }

    public static final void d(Application application) {
        Application application2 = f;
        if (application == application2) {
            return;
        }
        if (application2 != null) {
            application2.unregisterActivityLifecycleCallbacks(c);
        }
        f = application;
        application.registerActivityLifecycleCallbacks(c);
    }

    public static /* synthetic */ void c(b bVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        c(bVar, z);
    }

    public static final void c(b bVar, boolean z) {
        ArrayList<WeakReference<b>> arrayList = i;
        synchronized (arrayList) {
            arrayList.add(new WeakReference<>(bVar));
        }
        if (z) {
            boolean z2 = b;
            bVar.d(z2, z2 ? d : j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (g == 0 && !l) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (i) {
                if (!i.isEmpty()) {
                    try {
                        Iterator it = i.iterator();
                        while (it.hasNext()) {
                            b bVar = (b) ((WeakReference) it.next()).get();
                            if (bVar != null) {
                                bVar.d(true, elapsedRealtime);
                            } else {
                                it.remove();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    dpR dpr = dpR.c;
                }
            }
            d = elapsedRealtime;
        }
        g++;
        h.removeMessages(1);
        b = true;
        l = false;
        if (Build.VERSION.SDK_INT < 29) {
            synchronized (i) {
                if (i.isEmpty()) {
                    return;
                }
                try {
                    Iterator it2 = i.iterator();
                    while (it2.hasNext()) {
                        b bVar2 = (b) ((WeakReference) it2.next()).get();
                        if (bVar2 != null) {
                            bVar2.e(activity);
                        } else {
                            it2.remove();
                        }
                    }
                } catch (Exception unused2) {
                }
                dpR dpr2 = dpR.c;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int max = Math.max(0, g - 1);
        g = max;
        if (max == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (activity.isChangingConfigurations()) {
                l = true;
                Handler handler = h;
                Message obtainMessage = handler.obtainMessage(1);
                a(obtainMessage, elapsedRealtime);
                handler.sendMessageDelayed(obtainMessage, 700L);
            } else {
                synchronized (i) {
                    if (!i.isEmpty()) {
                        try {
                            Iterator it = i.iterator();
                            while (it.hasNext()) {
                                b bVar = (b) ((WeakReference) it.next()).get();
                                if (bVar != null) {
                                    bVar.d(false, elapsedRealtime);
                                } else {
                                    it.remove();
                                }
                            }
                        } catch (Exception unused) {
                        }
                        dpR dpr = dpR.c;
                    }
                }
                b = false;
                j = elapsedRealtime;
            }
        }
        if (Build.VERSION.SDK_INT < 29) {
            synchronized (i) {
                if (i.isEmpty()) {
                    return;
                }
                try {
                    Iterator it2 = i.iterator();
                    while (it2.hasNext()) {
                        b bVar2 = (b) ((WeakReference) it2.next()).get();
                        if (bVar2 != null) {
                            bVar2.c(activity);
                        } else {
                            it2.remove();
                        }
                    }
                } catch (Exception unused2) {
                }
                dpR dpr2 = dpR.c;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a = Math.max(0, a - 1);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        l = false;
        if (!e) {
            b = false;
            e = true;
            long c2 = c(message);
            synchronized (i) {
                if (!i.isEmpty()) {
                    try {
                        Iterator it = i.iterator();
                        while (it.hasNext()) {
                            b bVar = (b) ((WeakReference) it.next()).get();
                            if (bVar != null) {
                                bVar.d(false, c2);
                            } else {
                                it.remove();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    dpR dpr = dpR.c;
                }
            }
            j = c2;
        }
        return true;
    }

    private final long c(Message message) {
        return (message.arg1 << 32) | message.arg2;
    }

    private final void a(Message message, long j2) {
        message.arg1 = (int) ((j2 >>> 32) & 4294967295L);
        message.arg2 = (int) (j2 & 4294967295L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        synchronized (i) {
            if (i.isEmpty()) {
                return;
            }
            try {
                Iterator it = i.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.e(activity);
                    } else {
                        it.remove();
                    }
                }
            } catch (Exception unused) {
            }
            dpR dpr = dpR.c;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(Activity activity) {
        synchronized (i) {
            if (i.isEmpty()) {
                return;
            }
            try {
                Iterator it = i.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.c(activity);
                    } else {
                        it.remove();
                    }
                }
            } catch (Exception unused) {
            }
            dpR dpr = dpR.c;
        }
    }
}
