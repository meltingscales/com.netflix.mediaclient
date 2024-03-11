package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzle;
import com.google.android.gms.internal.measurement.zzmu;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzep extends zze {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private long zzg;
    private List<String> zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(zzga zzgaVar, long j) {
        super(zzgaVar);
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> zzah() {
        return this.zzh;
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:1|(1:3)(6:93|94|(1:96)(2:111|(1:113))|97|98|(26:100|(1:102)(1:109)|103|104|5|(1:92)(1:9)|10|(1:91)(1:14)|15|(1:(1:18)(1:19))|(2:21|(2:23|(1:25))(1:(1:(13:36|37|(1:41)|42|43|(1:45)(1:87)|46|47|(2:84|(1:86))(4:51|(1:53)(1:83)|54|(1:82))|(1:59)|61|(3:63|(2:65|(1:67)(3:68|(3:71|(1:73)|69)|74))|75)(0)|(2:77|78)(2:80|81))(1:35))(2:29|(1:31))))|90|37|(2:39|41)|42|43|(0)(0)|46|47|(1:49)|84|(0)|(0)|61|(0)(0)|(0)(0)))|4|5|(1:7)|92|10|(1:12)|91|15|(0)|(0)|90|37|(0)|42|43|(0)(0)|46|47|(0)|84|(0)|(0)|61|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020b, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020c, code lost:
        zzr().zzf().zza("getGoogleAppId or isMeasurementEnabled failed with exception. appId", com.google.android.gms.measurement.internal.zzew.zza(r0), r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa A[Catch: IllegalStateException -> 0x020b, TRY_ENTER, TryCatch #2 {IllegalStateException -> 0x020b, blocks: (B:66:0x0193, B:70:0x01a0, B:73:0x01aa, B:75:0x01b6, B:79:0x01cd, B:81:0x01d5, B:88:0x01f9, B:83:0x01db, B:84:0x01e2, B:86:0x01e8), top: B:115:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e8 A[Catch: IllegalStateException -> 0x020b, TryCatch #2 {IllegalStateException -> 0x020b, blocks: (B:66:0x0193, B:70:0x01a0, B:73:0x01aa, B:75:0x01b6, B:79:0x01cd, B:81:0x01d5, B:88:0x01f9, B:83:0x01db, B:84:0x01e2, B:86:0x01e8), top: B:115:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f9 A[Catch: IllegalStateException -> 0x020b, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x020b, blocks: (B:66:0x0193, B:70:0x01a0, B:73:0x01aa, B:75:0x01b6, B:79:0x01cd, B:81:0x01d5, B:88:0x01f9, B:83:0x01db, B:84:0x01e2, B:86:0x01e8), top: B:115:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022c  */
    @Override // com.google.android.gms.measurement.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzaa() {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzep.zzaa():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzm zza(String str) {
        boolean z;
        Boolean bool;
        Boolean zzb;
        zzd();
        zzb();
        String zzab = zzab();
        String zzac = zzac();
        zzw();
        String str2 = this.zzb;
        long zzaf = zzaf();
        zzw();
        String str3 = this.zzd;
        long zze = zzt().zze();
        zzw();
        zzd();
        if (this.zzf == 0) {
            this.zzf = this.zzx.zzi().zza(zzn(), zzn().getPackageName());
        }
        long j = this.zzf;
        boolean zzab2 = this.zzx.zzab();
        boolean z2 = !zzs().zzs;
        zzd();
        zzb();
        String zzai = !this.zzx.zzab() ? null : zzai();
        long zzac2 = this.zzx.zzac();
        int zzag = zzag();
        boolean booleanValue = zzt().zzi().booleanValue();
        zzx zzt = zzt();
        zzt.zzb();
        Boolean zzb2 = zzt.zzb("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(zzb2 == null || zzb2.booleanValue()).booleanValue();
        zzff zzs = zzs();
        zzs.zzd();
        boolean z3 = zzs.zzg().getBoolean("deferred_analytics_collection", false);
        String zzad = zzad();
        if (!zzt().zza(zzap.zzba) || (zzb = zzt().zzb("google_analytics_default_allow_ad_personalization_signals")) == null) {
            z = z2;
            bool = null;
        } else {
            bool = Boolean.valueOf(!zzb.booleanValue());
            z = z2;
        }
        return new zzm(zzab, zzac, str2, zzaf, str3, zze, j, str, zzab2, z, zzai, 0L, zzac2, zzag, booleanValue, booleanValue2, z3, zzad, bool, this.zzg, zzt().zza(zzap.zzbk) ? this.zzh : null, (zzle.zzb() && zzt().zza(zzap.zzcc)) ? zzae() : null);
    }

    @VisibleForTesting
    private final String zzai() {
        if (zzmu.zzb() && zzt().zza(zzap.zzcf)) {
            zzr().zzx().zza("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = zzn().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zzn());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    zzr().zzk().zza("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzr().zzj().zza("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzab() {
        zzw();
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzac() {
        zzw();
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzad() {
        zzw();
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzae() {
        zzw();
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzaf() {
        zzw();
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzag() {
        zzw();
        return this.zzi;
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzhb zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzep zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzij zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzii zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzes zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzjo zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzeu zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzkm zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzft zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzew zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzff zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzw zzu() {
        return super.zzu();
    }
}
