package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static Boolean zzj;

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|3)|4|(22:54|55|7|8|9|10|11|12|13|(13:46|47|16|(10:41|42|19|(7:36|37|22|(6:28|29|30|31|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            int r1 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r1
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L18
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r4[r2] = r5     // Catch: java.lang.Exception -> L18
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.reflect.Method r4 = r5.getMethod(r0, r4)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r4 = r3
        L19:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r4
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            r5 = 2
            if (r4 == 0) goto L33
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L33
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L33
            r4[r2] = r6     // Catch: java.lang.Exception -> L33
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r1] = r6     // Catch: java.lang.Exception -> L33
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r0 = r6.getMethod(r0, r4)     // Catch: java.lang.Exception -> L33
            goto L34
        L33:
            r0 = r3
        L34:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L41
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            java.lang.String r6 = "size"
            java.lang.reflect.Method r0 = r4.getMethod(r6, r0)     // Catch: java.lang.Exception -> L41
            goto L42
        L41:
            r0 = r3
        L42:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r0
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L53
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L53
            r0[r2] = r4     // Catch: java.lang.Exception -> L53
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            java.lang.String r6 = "get"
            java.lang.reflect.Method r0 = r4.getMethod(r6, r0)     // Catch: java.lang.Exception -> L53
            goto L54
        L53:
            r0 = r3
        L54:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L6b
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6b
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L6b
            r0[r2] = r4     // Catch: java.lang.Exception -> L6b
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            java.lang.String r6 = "getName"
            java.lang.reflect.Method r0 = r4.getMethod(r6, r0)     // Catch: java.lang.Exception -> L6b
            goto L6c
        L6b:
            r0 = r3
        L6c:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r4 = "WorkSourceUtil"
            if (r0 == 0) goto L87
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L81
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.String r7 = "createWorkChain"
            java.lang.reflect.Method r0 = r6.getMethod(r7, r0)     // Catch: java.lang.Exception -> L81
            goto L88
        L81:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r4, r6, r0)
        L87:
            r0 = r3
        L88:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lad
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> La7
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> La7
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> La7
            r5[r2] = r6     // Catch: java.lang.Exception -> La7
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6     // Catch: java.lang.Exception -> La7
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r5)     // Catch: java.lang.Exception -> La7
            goto Lae
        La7:
            r0 = move-exception
            java.lang.String r5 = "Missing WorkChain class"
            android.util.Log.w(r4, r5, r0)
        Lad:
            r0 = r3
        Lae:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lc4
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lc4
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r4 = "isEmpty"
            java.lang.reflect.Method r0 = r2.getMethod(r4, r0)     // Catch: java.lang.Exception -> Lc4
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lc5
            goto Lc5
        Lc4:
            r0 = r3
        Lc5:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r0
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    public static void add(WorkSource workSource, int i, String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    public static WorkSource fromPackage(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static String getName(WorkSource workSource, int i) {
        Method method = zzf;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return null;
            }
        }
        return null;
    }

    public static List<String> getNames(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                String name = getName(workSource, i);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    public static boolean hasWorkSourcePermission(Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = zzj;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(ContextCompat.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
            zzj = valueOf;
            return valueOf.booleanValue();
        }
    }

    public static int size(WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
