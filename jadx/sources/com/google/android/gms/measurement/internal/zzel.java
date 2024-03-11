package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzel<V> {
    private static final Object zzf = new Object();
    private final String zza;
    private final zzej<V> zzb;
    private final V zzc;
    private final V zzd;
    private final Object zze;
    private volatile V zzg;
    private volatile V zzh;

    private zzel(String str, V v, V v2, zzej<V> zzejVar) {
        this.zze = new Object();
        this.zzg = null;
        this.zzh = null;
        this.zza = str;
        this.zzc = v;
        this.zzd = v2;
        this.zzb = zzejVar;
    }

    public final String zza() {
        return this.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004a A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #3 {SecurityException -> 0x0059, blocks: (B:22:0x0023, B:23:0x002b, B:25:0x0031, B:27:0x003d, B:29:0x0041, B:32:0x0047, B:33:0x0049, B:40:0x0051, B:41:0x0058, B:34:0x004a, B:35:0x004c), top: B:60:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V zza(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zze
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L7
            return r4
        L7:
            com.google.android.gms.measurement.internal.zzw r4 = com.google.android.gms.measurement.internal.zzem.zza
            if (r4 != 0) goto Le
            V r4 = r3.zzc
            return r4
        Le:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzel.zzf
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.zzw.zza()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L22
            V r0 = r3.zzh     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L1e
            V r0 = r3.zzc     // Catch: java.lang.Throwable -> L6b
            goto L20
        L1e:
            V r0 = r3.zzh     // Catch: java.lang.Throwable -> L6b
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            return r0
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            java.util.List r4 = com.google.android.gms.measurement.internal.zzap.zzcs()     // Catch: java.lang.SecurityException -> L59
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L59
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L59
            if (r0 == 0) goto L59
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L59
            com.google.android.gms.measurement.internal.zzel r0 = (com.google.android.gms.measurement.internal.zzel) r0     // Catch: java.lang.SecurityException -> L59
            boolean r1 = com.google.android.gms.measurement.internal.zzw.zza()     // Catch: java.lang.SecurityException -> L59
            if (r1 != 0) goto L51
            com.google.android.gms.measurement.internal.zzej<V> r1 = r0.zzb     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L59
            if (r1 == 0) goto L46
            java.lang.Object r1 = r1.zza()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L59
            goto L47
        L46:
            r1 = 0
        L47:
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzel.zzf     // Catch: java.lang.SecurityException -> L59
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L59
            r0.zzh = r1     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            goto L2b
        L4e:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.SecurityException -> L59
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L59
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L59
            throw r4     // Catch: java.lang.SecurityException -> L59
        L59:
            com.google.android.gms.measurement.internal.zzej<V> r4 = r3.zzb
            if (r4 != 0) goto L60
            V r4 = r3.zzc
            return r4
        L60:
            java.lang.Object r4 = r4.zza()     // Catch: java.lang.IllegalStateException -> L65 java.lang.SecurityException -> L68
            return r4
        L65:
            V r4 = r3.zzc
            return r4
        L68:
            V r4 = r3.zzc
            return r4
        L6b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            throw r0
        L6e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzel.zza(java.lang.Object):java.lang.Object");
    }
}
