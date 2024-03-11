package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes5.dex */
public final class zzcj {
    private static volatile zzcy<Boolean> zza = zzcy.zzc();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(android.content.Context r3, android.net.Uri r4) {
        /*
            java.lang.String r4 = r4.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r4)
            r1 = 0
            if (r0 != 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            int r0 = r0 + 91
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r4 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r3.append(r4)
            java.lang.String r4 = "PhenotypeClientHelper"
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r4, r3)
            return r1
        L2e:
            com.google.android.gms.internal.measurement.zzcy<java.lang.Boolean> r4 = com.google.android.gms.internal.measurement.zzcj.zza
            boolean r4 = r4.zza()
            if (r4 == 0) goto L43
            com.google.android.gms.internal.measurement.zzcy<java.lang.Boolean> r3 = com.google.android.gms.internal.measurement.zzcj.zza
            java.lang.Object r3 = r3.zzb()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L43:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzcj.zzb
            monitor-enter(r4)
            com.google.android.gms.internal.measurement.zzcy<java.lang.Boolean> r0 = com.google.android.gms.internal.measurement.zzcj.zza     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r0.zza()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L5c
            com.google.android.gms.internal.measurement.zzcy<java.lang.Boolean> r3 = com.google.android.gms.internal.measurement.zzcj.zza     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r3 = r3.zzb()     // Catch: java.lang.Throwable -> L9e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L9e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9e
            return r3
        L5c:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L69
            goto L7f
        L69:
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "com.google.android.gms.phenotype"
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r1)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L86
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "com.google.android.gms"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L86
        L7f:
            boolean r3 = zza(r3)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L86
            r1 = 1
        L86:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.internal.measurement.zzcy r3 = com.google.android.gms.internal.measurement.zzcy.zza(r3)     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.internal.measurement.zzcj.zza = r3     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.internal.measurement.zzcy<java.lang.Boolean> r3 = com.google.android.gms.internal.measurement.zzcj.zza
            java.lang.Object r3 = r3.zzb()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L9e:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcj.zza(android.content.Context, android.net.Uri):boolean");
    }
}
