package o;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.webkit.ValueCallback;
import androidx.core.os.EnvironmentCompat;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.dfn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8196dfn {
    private static AtomicInteger a;
    public static final int c = (int) (((float) Runtime.getRuntime().maxMemory()) * 0.5f);

    public static Map<String, String> b(int i) {
        HashMap hashMap = new HashMap();
        AbstractApplicationC1040Mh abstractApplicationC1040Mh = AbstractApplicationC1040Mh.getInstance();
        if (abstractApplicationC1040Mh == null) {
            return hashMap;
        }
        ActivityManager activityManager = (ActivityManager) abstractApplicationC1040Mh.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        Runtime runtime = Runtime.getRuntime();
        long d = C8054ddD.d(runtime.totalMemory() - runtime.freeMemory());
        long d2 = C8054ddD.d(runtime.maxMemory());
        hashMap.put("trimLevel", String.valueOf(i));
        hashMap.put("availRam", String.valueOf(C8054ddD.d(memoryInfo.availMem)));
        hashMap.put("lowThreshold", String.valueOf(C8054ddD.d(memoryInfo.threshold)));
        hashMap.put("totalRam", String.valueOf(C8054ddD.d(memoryInfo.totalMem)));
        hashMap.put("isLowMem", String.valueOf(memoryInfo.lowMemory));
        hashMap.put("impGroup", String.valueOf(runningAppProcessInfo.importance));
        hashMap.put("lastTrimLevel", String.valueOf(runningAppProcessInfo.lastTrimLevel));
        hashMap.put("lruPos", String.valueOf(runningAppProcessInfo.lru));
        hashMap.put("memClass", String.valueOf(activityManager.getLargeMemoryClass()));
        hashMap.put("maxHeap", String.valueOf(d2));
        hashMap.put("usedHeap", String.valueOf(d));
        hashMap.put("activityCount", String.valueOf(AbstractApplicationC1040Mh.getInstance().o().e()));
        hashMap.put("bmpCacheSize", String.valueOf(C8054ddD.d(c)));
        return hashMap;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        return AbstractApplicationC1040Mh.getInstance().o().i();
    }

    public static boolean b() {
        return AbstractApplicationC1040Mh.getInstance().o().f();
    }

    public static void c(Context context, String str) {
        d(context);
        AbstractApplicationC1040Mh.getInstance().d(context, str);
    }

    public static void d(Context context) {
        d(context, true);
    }

    public static void d(Context context, boolean z) {
        C8284dhV.b(context, (ValueCallback<Boolean>) null);
        if (z) {
            C8054ddD.d(context);
        }
        C8157dfA.e(context);
    }

    public static StatFs a(File file) {
        try {
            if (file.exists() && "mounted".equals(EnvironmentCompat.getStorageState(file))) {
                return new StatFs(file.getPath());
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        } catch (Exception e) {
            InterfaceC1598aHf.a("getStatFsForExternalStorageDir " + file.getAbsolutePath() + " exception " + e);
            return null;
        }
    }

    public static int c(Context context) {
        synchronized (C8196dfn.class) {
            AtomicInteger atomicInteger = a;
            if (atomicInteger != null) {
                return atomicInteger.get();
            }
            int d = C8157dfA.d(context, "disk_cache_size", 0);
            if (d == 0) {
                long b = C8054ddD.b();
                d = Math.max((int) Math.min(((float) b) * 0.25f, 2.62144E7f), 5242880);
                C8157dfA.a(context, "disk_cache_size", d);
                C1044Mm.a("nf_utils", "Available disk space in bytes = %d Saving disk Cache Size = %d", Long.valueOf(b), Integer.valueOf(d));
            }
            a = new AtomicInteger(d);
            return d;
        }
    }

    public static Map<String, String> b(Uri uri) {
        HashMap hashMap = new HashMap();
        if (uri == null) {
            return hashMap;
        }
        for (String str : uri.getQueryParameterNames()) {
            if (C8168dfL.h(str)) {
                String queryParameter = uri.getQueryParameter(str);
                if (C8168dfL.h(queryParameter)) {
                    hashMap.put(str, queryParameter);
                }
            }
        }
        return hashMap;
    }
}
