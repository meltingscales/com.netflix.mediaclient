package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzii extends zze {
    @VisibleForTesting
    protected zzif zza;
    private volatile zzif zzb;
    private zzif zzc;
    private final Map<Activity, zzif> zzd;
    private zzif zze;
    private String zzf;

    public zzii(zzga zzgaVar) {
        super(zzgaVar);
        this.zzd = new ArrayMap();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    public final zzif zzab() {
        zzw();
        zzd();
        return this.zza;
    }

    public final void zza(Activity activity, String str, String str2) {
        if (this.zzb == null) {
            zzr().zzk().zza("setCurrentScreen cannot be called while no activity active");
        } else if (this.zzd.get(activity) == null) {
            zzr().zzk().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = zza(activity.getClass().getCanonicalName());
            }
            boolean equals = this.zzb.zzb.equals(str2);
            boolean zzc = zzkm.zzc(this.zzb.zza, str);
            if (equals && zzc) {
                zzr().zzk().zza("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                zzr().zzk().zza("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
                zzr().zzk().zza("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            } else {
                zzr().zzx().zza("Setting current screen to name, class", str == null ? "null" : str, str2);
                zzif zzifVar = new zzif(str, str2, zzp().zzg());
                this.zzd.put(activity, zzifVar);
                zza(activity, zzifVar, true);
            }
        }
    }

    public final zzif zzac() {
        zzb();
        return this.zzb;
    }

    private final void zza(Activity activity, zzif zzifVar, boolean z) {
        zzif zzifVar2 = this.zzb == null ? this.zzc : this.zzb;
        if (zzifVar.zzb == null) {
            zzifVar = new zzif(zzifVar.zza, zza(activity.getClass().getCanonicalName()), zzifVar.zzc);
        }
        this.zzc = this.zzb;
        this.zzb = zzifVar;
        zzq().zza(new zzih(this, z, zzifVar2, zzifVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzif zzifVar, boolean z) {
        zze().zza(zzm().elapsedRealtime());
        if (zzk().zza(zzifVar.zzd, z)) {
            zzifVar.zzd = false;
        }
    }

    public static void zza(zzif zzifVar, Bundle bundle, boolean z) {
        if (bundle != null && zzifVar != null && (!bundle.containsKey("_sc") || z)) {
            String str = zzifVar.zza;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", zzifVar.zzb);
            bundle.putLong("_si", zzifVar.zzc);
        } else if (bundle != null && zzifVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void zza(String str, zzif zzifVar) {
        zzd();
        synchronized (this) {
            String str2 = this.zzf;
            if (str2 == null || str2.equals(str) || zzifVar != null) {
                this.zzf = str;
                this.zze = zzifVar;
            }
        }
    }

    @VisibleForTesting
    private static String zza(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final zzif zzd(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzif zzifVar = this.zzd.get(activity);
        if (zzifVar == null) {
            zzif zzifVar2 = new zzif(null, zza(activity.getClass().getCanonicalName()), zzp().zzg());
            this.zzd.put(activity, zzifVar2);
            return zzifVar2;
        }
        return zzifVar;
    }

    public final void zza(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzif(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(SignupConstants.Field.LANG_ID)));
    }

    public final void zza(Activity activity) {
        zza(activity, zzd(activity), false);
        zzb zze = zze();
        zze.zzq().zza(new zzc(zze, zze.zzm().elapsedRealtime()));
    }

    public final void zzb(Activity activity) {
        zzif zzd = zzd(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        zzq().zza(new zzik(this, zzd));
    }

    public final void zzb(Activity activity, Bundle bundle) {
        zzif zzifVar;
        if (bundle == null || (zzifVar = this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(SignupConstants.Field.LANG_ID, zzifVar.zzc);
        bundle2.putString("name", zzifVar.zza);
        bundle2.putString("referrer_name", zzifVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void zzc(Activity activity) {
        this.zzd.remove(activity);
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
