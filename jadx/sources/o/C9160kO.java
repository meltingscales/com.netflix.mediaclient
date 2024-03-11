package o;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.bugsnag.android.RootDetector;
import com.bugsnag.android.internal.TaskType;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;

/* renamed from: o.kO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9160kO {
    private final Context a;
    private final InterfaceC9147kB b;
    private final C9159kN c;
    private final C9301mx e;
    private final DisplayMetrics f;
    private final String g;
    private final File j;
    private final String k;
    private final Future<Boolean> l;
    private final InterfaceC9200lB m;

    /* renamed from: o  reason: collision with root package name */
    private AtomicInteger f13874o;
    private Map<String, Object> p;
    private final boolean i = n();
    private final Float s = k();
    private final Integer h = o();
    private final String t = l();
    private final String n = Locale.getDefault().toString();
    private final String[] d = e();
    private final Future<Long> q = p();

    public C9160kO(InterfaceC9147kB interfaceC9147kB, Context context, Resources resources, String str, String str2, C9159kN c9159kN, File file, final RootDetector rootDetector, C9301mx c9301mx, InterfaceC9200lB interfaceC9200lB) {
        Future<Boolean> future;
        this.b = interfaceC9147kB;
        this.a = context;
        this.g = str;
        this.k = str2;
        this.c = c9159kN;
        this.j = file;
        this.e = c9301mx;
        this.m = interfaceC9200lB;
        this.f = resources.getDisplayMetrics();
        this.f13874o = new AtomicInteger(resources.getConfiguration().orientation);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer e = c9159kN.e();
        if (e != null) {
            linkedHashMap.put("androidApiLevel", Integer.valueOf(e.intValue()));
        }
        String i = c9159kN.i();
        if (i != null) {
            linkedHashMap.put("osBuild", i);
        }
        this.p = linkedHashMap;
        try {
            future = c9301mx.c(TaskType.IO, new Callable() { // from class: o.kP
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean e2;
                    e2 = C9160kO.e(RootDetector.this);
                    return e2;
                }
            });
        } catch (RejectedExecutionException e2) {
            this.m.e("Failed to perform root detection checks", e2);
            future = null;
        }
        this.l = future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean e(RootDetector rootDetector) {
        return Boolean.valueOf(rootDetector.d());
    }

    public final C9162kQ d() {
        Object e;
        Map k;
        C9159kN c9159kN = this.c;
        String[] strArr = this.d;
        boolean f = f();
        String str = this.g;
        String str2 = this.n;
        Future<Long> future = this.q;
        try {
            Result.c cVar = Result.e;
            e = Result.e(future == null ? null : future.get());
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        Long l = Result.a(e) ? null : e;
        k = dqE.k(this.p);
        return new C9162kQ(c9159kN, strArr, Boolean.valueOf(f), str, str2, l, k);
    }

    public final C9171kZ a(long j) {
        Object e;
        Map k;
        C9159kN c9159kN = this.c;
        boolean f = f();
        String str = this.g;
        String str2 = this.n;
        Future<Long> future = this.q;
        try {
            Result.c cVar = Result.e;
            e = Result.e(future == null ? null : future.get());
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        Long l = Result.a(e) ? null : e;
        k = dqE.k(this.p);
        long a = a();
        return new C9171kZ(c9159kN, Boolean.valueOf(f), str, str2, l, k, Long.valueOf(a), b(), i(), new Date(j));
    }

    public final Map<String, Object> c() {
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("locationStatus", h());
        hashMap.put("networkAccess", j());
        hashMap.put("brand", this.c.d());
        hashMap.put("screenDensity", this.s);
        hashMap.put("dpi", this.h);
        hashMap.put("emulator", Boolean.valueOf(this.i));
        hashMap.put("screenResolution", this.t);
        return hashMap;
    }

    private final boolean f() {
        try {
            Future<Boolean> future = this.l;
            if (future != null) {
                if (future.get().booleanValue()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private final boolean n() {
        boolean i;
        boolean d;
        boolean d2;
        String a = this.c.a();
        if (a != null) {
            i = C8691duz.i(a, "unknown", false, 2, null);
            if (!i) {
                d = duD.d((CharSequence) a, (CharSequence) "generic", false, 2, (Object) null);
                if (!d) {
                    d2 = duD.d((CharSequence) a, (CharSequence) "vbox", false, 2, (Object) null);
                    if (!d2) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final Integer o() {
        DisplayMetrics displayMetrics = this.f;
        if (displayMetrics == null) {
            return null;
        }
        return Integer.valueOf(displayMetrics.densityDpi);
    }

    private final void a(Map<String, Object> map) {
        boolean z;
        try {
            Intent e = C9148kC.e(this.a, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), this.m);
            if (e != null) {
                int intExtra = e.getIntExtra("level", -1);
                int intExtra2 = e.getIntExtra(InteractiveAnimation.ANIMATION_TYPE.SCALE, -1);
                if (intExtra != -1 || intExtra2 != -1) {
                    map.put("batteryLevel", Float.valueOf(intExtra / intExtra2));
                }
                int intExtra3 = e.getIntExtra("status", -1);
                if (intExtra3 != 2 && intExtra3 != 5) {
                    z = false;
                    map.put("charging", Boolean.valueOf(z));
                }
                z = true;
                map.put("charging", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
            this.m.d("Could not get battery status");
        }
    }

    private final String h() {
        try {
            return m() ? "allowed" : "disallowed";
        } catch (Exception unused) {
            this.m.d("Could not get locationStatus");
            return null;
        }
    }

    private final boolean m() {
        boolean isLocationEnabled;
        Boolean valueOf;
        if (Build.VERSION.SDK_INT >= 31) {
            LocationManager e = C9148kC.e(this.a);
            if (e == null) {
                valueOf = null;
            } else {
                isLocationEnabled = e.isLocationEnabled();
                valueOf = Boolean.valueOf(isLocationEnabled);
            }
            return C8632dsu.c(valueOf, Boolean.TRUE);
        }
        String string = Settings.Secure.getString(this.a.getContentResolver(), "location_providers_allowed");
        return string != null && string.length() > 0;
    }

    private final String j() {
        return this.b.b();
    }

    private final Float k() {
        DisplayMetrics displayMetrics = this.f;
        if (displayMetrics == null) {
            return null;
        }
        return Float.valueOf(displayMetrics.density);
    }

    private final String l() {
        DisplayMetrics displayMetrics = this.f;
        if (displayMetrics != null) {
            int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            DisplayMetrics displayMetrics2 = this.f;
            int min = Math.min(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
            StringBuilder sb = new StringBuilder();
            sb.append(max);
            sb.append('x');
            sb.append(min);
            return sb.toString();
        }
        return null;
    }

    public final String[] e() {
        String[] c = this.c.c();
        return c == null ? new String[0] : c;
    }

    @SuppressLint({"UsableSpace"})
    public final long a() {
        long e;
        try {
            Result.c cVar = Result.e;
            e = Result.e((Long) this.e.c(TaskType.IO, new Callable() { // from class: o.kR
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Long d;
                    d = C9160kO.d(C9160kO.this);
                    return d;
                }
            }).get());
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        if (Result.a(e)) {
            e = 0L;
        }
        return ((Number) e).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long d(C9160kO c9160kO) {
        return Long.valueOf(c9160kO.j.getUsableSpace());
    }

    public final Long b() {
        Long valueOf;
        try {
            ActivityManager d = C9148kC.d(this.a);
            if (d == null) {
                valueOf = null;
            } else {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                d.getMemoryInfo(memoryInfo);
                valueOf = Long.valueOf(memoryInfo.availMem);
            }
            return valueOf != null ? valueOf : (Long) Process.class.getDeclaredMethod("getFreeMemory", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final Future<Long> p() {
        try {
            return this.e.c(TaskType.DEFAULT, new Callable() { // from class: o.kU
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Long a;
                    a = C9160kO.a(C9160kO.this);
                    return a;
                }
            });
        } catch (RejectedExecutionException e) {
            this.m.e("Failed to lookup available device memory", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long a(C9160kO c9160kO) {
        return c9160kO.g();
    }

    private final Long g() {
        Long valueOf;
        Object e;
        ActivityManager d = C9148kC.d(this.a);
        if (d == null) {
            valueOf = null;
        } else {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            d.getMemoryInfo(memoryInfo);
            valueOf = Long.valueOf(memoryInfo.totalMem);
        }
        if (valueOf != null) {
            return valueOf;
        }
        try {
            Result.c cVar = Result.e;
            e = Result.e((Long) Process.class.getDeclaredMethod("getTotalMemory", new Class[0]).invoke(null, new Object[0]));
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        return Result.a(e) ? null : e;
    }

    public final String i() {
        int i = this.f13874o.get();
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return "landscape";
        }
        return "portrait";
    }

    public final boolean e(int i) {
        return this.f13874o.getAndSet(i) != i;
    }
}
