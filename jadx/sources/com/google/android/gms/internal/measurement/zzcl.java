package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class zzcl<T> {
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzb;
    private static zzcz<zzcy<zzch>> zzd;
    private final zzcr zze;
    private final String zzf;
    private final T zzg;
    private volatile int zzi;
    private volatile T zzj;
    private static final Object zza = new Object();
    private static final AtomicInteger zzh = new AtomicInteger();

    public static void zza(Context context) {
        synchronized (zza) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (zzb != context) {
                zzbx.zzc();
                zzcu.zza();
                zzcg.zza();
                zzh.incrementAndGet();
                zzb = context;
                zzd = zzdc.zza(zzco.zza);
            }
        }
    }

    abstract T zza(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza() {
        zzh.incrementAndGet();
    }

    private zzcl(zzcr zzcrVar, String str, T t) {
        this.zzi = -1;
        if (zzcrVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zze = zzcrVar;
        this.zzf = str;
        this.zzg = t;
    }

    private final String zza(String str) {
        if (str == null || !str.isEmpty()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(this.zzf);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return this.zzf;
    }

    public final String zzb() {
        return zza(this.zze.zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: all -> 0x00ea, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0022, B:13:0x0036, B:45:0x00db, B:44:0x00d9, B:14:0x003c, B:16:0x004c, B:18:0x0058, B:20:0x0061, B:22:0x006f, B:24:0x007d, B:23:0x0076, B:39:0x00bd, B:41:0x00d1, B:25:0x0083, B:27:0x0089, B:29:0x0091, B:33:0x00aa, B:35:0x00b4, B:31:0x00a2, B:46:0x00e0, B:47:0x00e7, B:48:0x00e8), top: B:55:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T zzc() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcl.zzc():java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcl<Long> zzb(zzcr zzcrVar, String str, long j) {
        return new zzcn(zzcrVar, str, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcl<Boolean> zzb(zzcr zzcrVar, String str, boolean z) {
        return new zzcq(zzcrVar, str, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcl<Double> zzb(zzcr zzcrVar, String str, double d) {
        return new zzcp(zzcrVar, str, Double.valueOf(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcl<String> zzb(zzcr zzcrVar, String str, String str2) {
        return new zzcs(zzcrVar, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ zzcy zzd() {
        new zzck();
        return zzck.zza(zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcl(zzcr zzcrVar, String str, Object obj, zzcn zzcnVar) {
        this(zzcrVar, str, obj);
    }
}
