package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzx;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzaa extends zzx.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzx zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzx zzxVar, String str, String str2, Context context, Bundle bundle) {
        super(zzxVar);
        this.zzg = zzxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:3:0x0002, B:5:0x0018, B:7:0x002a, B:13:0x003f, B:15:0x0052, B:17:0x005e, B:19:0x006c, B:30:0x0080), top: B:35:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:3:0x0002, B:5:0x0018, B:7:0x002a, B:13:0x003f, B:15:0x0052, B:17:0x005e, B:19:0x006c, B:30:0x0080), top: B:35:0x0002 }] */
    @Override // com.google.android.gms.internal.measurement.zzx.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.measurement.zzx r2 = r14.zzg     // Catch: java.lang.Exception -> L9d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L9d
            r3.<init>()     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.internal.measurement.zzx.zza(r2, r3)     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.internal.measurement.zzx r2 = r14.zzg     // Catch: java.lang.Exception -> L9d
            java.lang.String r3 = r14.zzc     // Catch: java.lang.Exception -> L9d
            java.lang.String r4 = r14.zzd     // Catch: java.lang.Exception -> L9d
            boolean r2 = com.google.android.gms.internal.measurement.zzx.zza(r2, r3, r4)     // Catch: java.lang.Exception -> L9d
            if (r2 == 0) goto L26
            java.lang.String r2 = r14.zzd     // Catch: java.lang.Exception -> L9d
            java.lang.String r3 = r14.zzc     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.internal.measurement.zzx r4 = r14.zzg     // Catch: java.lang.Exception -> L9d
            java.lang.String r4 = com.google.android.gms.internal.measurement.zzx.zzb(r4)     // Catch: java.lang.Exception -> L9d
            r11 = r2
            r10 = r3
            r9 = r4
            goto L2a
        L26:
            r2 = 0
            r9 = r2
            r10 = r9
            r11 = r10
        L2a:
            android.content.Context r2 = r14.zze     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.internal.measurement.zzx.zzc(r2)     // Catch: java.lang.Exception -> L9d
            java.lang.Boolean r2 = com.google.android.gms.internal.measurement.zzx.zzj()     // Catch: java.lang.Exception -> L9d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L9d
            if (r2 != 0) goto L3e
            if (r10 == 0) goto L3c
            goto L3e
        L3c:
            r2 = r0
            goto L3f
        L3e:
            r2 = r1
        L3f:
            com.google.android.gms.internal.measurement.zzx r3 = r14.zzg     // Catch: java.lang.Exception -> L9d
            android.content.Context r4 = r14.zze     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.internal.measurement.zzm r4 = r3.zza(r4, r2)     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.internal.measurement.zzx.zza(r3, r4)     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.internal.measurement.zzx r3 = r14.zzg     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.internal.measurement.zzm r3 = com.google.android.gms.internal.measurement.zzx.zzc(r3)     // Catch: java.lang.Exception -> L9d
            if (r3 != 0) goto L5e
            com.google.android.gms.internal.measurement.zzx r2 = r14.zzg     // Catch: java.lang.Exception -> L9d
            java.lang.String r2 = com.google.android.gms.internal.measurement.zzx.zzb(r2)     // Catch: java.lang.Exception -> L9d
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch: java.lang.Exception -> L9d
            return
        L5e:
            android.content.Context r3 = r14.zze     // Catch: java.lang.Exception -> L9d
            int r3 = com.google.android.gms.internal.measurement.zzx.zzd(r3)     // Catch: java.lang.Exception -> L9d
            android.content.Context r4 = r14.zze     // Catch: java.lang.Exception -> L9d
            int r4 = com.google.android.gms.internal.measurement.zzx.zze(r4)     // Catch: java.lang.Exception -> L9d
            if (r2 == 0) goto L77
            int r2 = java.lang.Math.max(r3, r4)     // Catch: java.lang.Exception -> L9d
            if (r4 >= r3) goto L74
            r3 = r1
            goto L75
        L74:
            r3 = r0
        L75:
            r8 = r3
            goto L80
        L77:
            if (r3 <= 0) goto L7a
            r4 = r3
        L7a:
            if (r3 <= 0) goto L7e
            r8 = r1
            goto L7f
        L7e:
            r8 = r0
        L7f:
            r2 = r4
        L80:
            com.google.android.gms.internal.measurement.zzv r13 = new com.google.android.gms.internal.measurement.zzv     // Catch: java.lang.Exception -> L9d
            r4 = 19000(0x4a38, double:9.3872E-320)
            long r6 = (long) r2     // Catch: java.lang.Exception -> L9d
            android.os.Bundle r12 = r14.zzf     // Catch: java.lang.Exception -> L9d
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.internal.measurement.zzx r2 = r14.zzg     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.internal.measurement.zzm r2 = com.google.android.gms.internal.measurement.zzx.zzc(r2)     // Catch: java.lang.Exception -> L9d
            android.content.Context r3 = r14.zze     // Catch: java.lang.Exception -> L9d
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: java.lang.Exception -> L9d
            long r4 = r14.zza     // Catch: java.lang.Exception -> L9d
            r2.initialize(r3, r13, r4)     // Catch: java.lang.Exception -> L9d
            return
        L9d:
            r2 = move-exception
            com.google.android.gms.internal.measurement.zzx r3 = r14.zzg
            com.google.android.gms.internal.measurement.zzx.zza(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaa.zza():void");
    }
}
