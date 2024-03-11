package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzih implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzif zzb;
    private final /* synthetic */ zzif zzc;
    private final /* synthetic */ zzii zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzih(zzii zziiVar, boolean z, zzif zzifVar, zzif zzifVar2) {
        this.zzd = zziiVar;
        this.zza = z;
        this.zzb = zzifVar;
        this.zzc = zzifVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (com.google.android.gms.measurement.internal.zzkm.zzc(r8.zzb.zza, r8.zzc.zza) != false) goto L18;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzii r0 = r8.zzd
            com.google.android.gms.measurement.internal.zzx r0 = r0.zzt()
            com.google.android.gms.measurement.internal.zzel<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzap.zzay
            boolean r0 = r0.zza(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            boolean r0 = r8.zza
            if (r0 == 0) goto L1b
            com.google.android.gms.measurement.internal.zzii r0 = r8.zzd
            com.google.android.gms.measurement.internal.zzif r0 = r0.zza
            if (r0 == 0) goto L1b
            r2 = r1
        L1b:
            if (r2 == 0) goto L32
            com.google.android.gms.measurement.internal.zzii r0 = r8.zzd
            com.google.android.gms.measurement.internal.zzif r3 = r0.zza
            com.google.android.gms.measurement.internal.zzii.zza(r0, r3, r1)
            goto L32
        L25:
            boolean r0 = r8.zza
            if (r0 == 0) goto L32
            com.google.android.gms.measurement.internal.zzii r0 = r8.zzd
            com.google.android.gms.measurement.internal.zzif r3 = r0.zza
            if (r3 == 0) goto L32
            com.google.android.gms.measurement.internal.zzii.zza(r0, r3, r1)
        L32:
            com.google.android.gms.measurement.internal.zzif r0 = r8.zzb
            if (r0 == 0) goto L58
            long r3 = r0.zzc
            com.google.android.gms.measurement.internal.zzif r5 = r8.zzc
            long r6 = r5.zzc
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L58
            java.lang.String r0 = r0.zzb
            java.lang.String r3 = r5.zzb
            boolean r0 = com.google.android.gms.measurement.internal.zzkm.zzc(r0, r3)
            if (r0 == 0) goto L58
            com.google.android.gms.measurement.internal.zzif r0 = r8.zzb
            java.lang.String r0 = r0.zza
            com.google.android.gms.measurement.internal.zzif r3 = r8.zzc
            java.lang.String r3 = r3.zza
            boolean r0 = com.google.android.gms.measurement.internal.zzkm.zzc(r0, r3)
            if (r0 != 0) goto Lb9
        L58:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.zzif r3 = r8.zzc
            com.google.android.gms.measurement.internal.zzii.zza(r3, r0, r1)
            com.google.android.gms.measurement.internal.zzif r1 = r8.zzb
            if (r1 == 0) goto L81
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto L6f
            java.lang.String r3 = "_pn"
            r0.putString(r3, r1)
        L6f:
            com.google.android.gms.measurement.internal.zzif r1 = r8.zzb
            java.lang.String r3 = "_pc"
            java.lang.String r1 = r1.zzb
            r0.putString(r3, r1)
            com.google.android.gms.measurement.internal.zzif r1 = r8.zzb
            java.lang.String r3 = "_pi"
            long r4 = r1.zzc
            r0.putLong(r3, r4)
        L81:
            com.google.android.gms.measurement.internal.zzii r1 = r8.zzd
            com.google.android.gms.measurement.internal.zzx r1 = r1.zzt()
            com.google.android.gms.measurement.internal.zzel<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzap.zzay
            boolean r1 = r1.zza(r3)
            if (r1 == 0) goto Lac
            if (r2 == 0) goto Lac
            com.google.android.gms.measurement.internal.zzii r1 = r8.zzd
            com.google.android.gms.measurement.internal.zzjo r1 = r1.zzk()
            com.google.android.gms.measurement.internal.zzjw r1 = r1.zzb
            long r1 = r1.zzb()
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto Lac
            com.google.android.gms.measurement.internal.zzii r3 = r8.zzd
            com.google.android.gms.measurement.internal.zzkm r3 = r3.zzp()
            r3.zza(r0, r1)
        Lac:
            com.google.android.gms.measurement.internal.zzii r1 = r8.zzd
            com.google.android.gms.measurement.internal.zzhb r1 = r1.zzf()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_vs"
            r1.zzb(r2, r3, r0)
        Lb9:
            com.google.android.gms.measurement.internal.zzii r0 = r8.zzd
            com.google.android.gms.measurement.internal.zzif r1 = r8.zzc
            r0.zza = r1
            com.google.android.gms.measurement.internal.zzij r0 = r0.zzh()
            com.google.android.gms.measurement.internal.zzif r1 = r8.zzc
            r0.zza(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzih.run():void");
    }
}
