package com.google.android.gms.internal.cast;

import android.os.Bundle;
import com.google.android.gms.cast.internal.Logger;
import java.math.BigInteger;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzj {
    private static final Logger zza = new Logger("ApplicationAnalyticsUtils");
    private static final String zzb = "21.1.0";
    private final String zzc;
    private final Map zzd;
    private final Map zze;

    public zzj(Bundle bundle, String str) {
        this.zzc = str;
        this.zzd = zzn.zza(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.zze = zzn.zza(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    private final zzlj zzf(zzi zziVar) {
        long j;
        zzlj zzc = zzlk.zzc();
        zzc.zzj(zziVar.zzd);
        int i = zziVar.zze;
        zziVar.zze = i + 1;
        zzc.zzg(i);
        String str = zziVar.zzc;
        if (str != null) {
            zzc.zzh(str);
        }
        String str2 = zziVar.zzh;
        if (str2 != null) {
            zzc.zzf(str2);
        }
        zzkz zza2 = zzla.zza();
        zza2.zzb(zzb);
        zza2.zza(this.zzc);
        zzc.zzb((zzla) zza2.zzp());
        zzlb zza3 = zzlc.zza();
        if (zziVar.zzb != null) {
            zzlr zza4 = zzls.zza();
            zza4.zza(zziVar.zzb);
            zza3.zza((zzls) zza4.zzp());
        }
        zza3.zzd(false);
        String str3 = zziVar.zzf;
        if (str3 != null) {
            try {
                String replace = str3.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                zza.w(e, "receiverSessionId %s is not valid for hash", str3);
                j = 0;
            }
            zza3.zzf(j);
        }
        zza3.zzb(zziVar.zzg);
        zzc.zzd(zza3);
        return zzc;
    }

    private static void zzg(zzlj zzljVar, boolean z) {
        zzlb zzc = zzlc.zzc(zzljVar.zza());
        zzc.zzd(z);
        zzljVar.zzd(zzc);
    }

    public final zzlk zza(zzi zziVar) {
        return (zzlk) zzf(zziVar).zzp();
    }

    public final zzlk zzb(zzi zziVar, boolean z) {
        zzlj zzf = zzf(zziVar);
        zzg(zzf, z);
        return (zzlk) zzf.zzp();
    }

    public final zzlk zzc(zzi zziVar) {
        zzlj zzf = zzf(zziVar);
        zzlb zzc = zzlc.zzc(zzf.zza());
        zzc.zze(10);
        zzf.zze((zzlc) zzc.zzp());
        zzg(zzf, true);
        return (zzlk) zzf.zzp();
    }

    public final zzlk zzd(zzi zziVar) {
        zzlj zzf = zzf(zziVar);
        if (zziVar.zzi == 1) {
            zzlb zzc = zzlc.zzc(zzf.zza());
            zzc.zze(17);
            zzf.zze((zzlc) zzc.zzp());
        }
        return (zzlk) zzf.zzp();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    @org.checkerframework.dataflow.qual.Pure
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.cast.zzlk zze(com.google.android.gms.internal.cast.zzi r4, int r5) {
        /*
            r3 = this;
            com.google.android.gms.internal.cast.zzlj r4 = r3.zzf(r4)
            com.google.android.gms.internal.cast.zzlc r0 = r4.zza()
            com.google.android.gms.internal.cast.zzlb r0 = com.google.android.gms.internal.cast.zzlc.zzc(r0)
            java.util.Map r1 = r3.zze
            if (r1 == 0) goto L2e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L1b
            goto L2e
        L1b:
            java.util.Map r1 = r3.zze
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L30
        L2e:
            int r1 = r5 + 10000
        L30:
            r0.zze(r1)
            java.util.Map r1 = r3.zzd
            if (r1 == 0) goto L55
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L42
            goto L55
        L42:
            java.util.Map r5 = r3.zzd
            java.lang.Object r5 = r5.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L57
        L55:
            int r5 = r5 + 10000
        L57:
            r0.zzc(r5)
            com.google.android.gms.internal.cast.zzpt r5 = r0.zzp()
            com.google.android.gms.internal.cast.zzlc r5 = (com.google.android.gms.internal.cast.zzlc) r5
            r4.zze(r5)
            com.google.android.gms.internal.cast.zzpt r4 = r4.zzp()
            com.google.android.gms.internal.cast.zzlk r4 = (com.google.android.gms.internal.cast.zzlk) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzj.zze(com.google.android.gms.internal.cast.zzi, int):com.google.android.gms.internal.cast.zzlk");
    }
}
