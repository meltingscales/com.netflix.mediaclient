package o;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class aGR {
    public static final aGR b = new aGR();

    private aGR() {
    }

    public final String b(Context context) {
        String processName;
        C8632dsu.c((Object) context, "");
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            if (processName != null) {
                return processName;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        try {
            return c();
        } catch (Throwable unused) {
            return a(context);
        }
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    private final String c() {
        Object invoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
        C8632dsu.d(invoke);
        return (String) invoke;
    }

    private final String a(Context context) {
        Object obj;
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        C8632dsu.d(systemService);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        String str = null;
        if (runningAppProcesses != null) {
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                    break;
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
            if (runningAppProcessInfo != null) {
                str = runningAppProcessInfo.processName;
            }
        }
        if (str == null) {
            String packageName = context.getPackageName();
            C8632dsu.a(packageName, "");
            return packageName;
        }
        return str;
    }
}
