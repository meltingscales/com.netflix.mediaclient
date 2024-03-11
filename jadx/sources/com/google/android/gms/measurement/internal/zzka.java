package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* loaded from: classes5.dex */
public final class zzka extends zzkb {
    private final AlarmManager zzb;
    private final zzaf zzc;
    private Integer zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzka(zzke zzkeVar) {
        super(zzkeVar);
        this.zzb = (AlarmManager) zzn().getSystemService("alarm");
        this.zzc = new zzjz(this, zzkeVar.zzs(), zzkeVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkb
    protected final boolean zze() {
        this.zzb.cancel(zzw());
        zzk();
        return false;
    }

    @TargetApi(24)
    private final void zzk() {
        int zzv = zzv();
        zzr().zzx().zza("Cancelling job. JobID", Integer.valueOf(zzv));
        ((JobScheduler) zzn().getSystemService("jobscheduler")).cancel(zzv);
    }

    public final void zza(long j) {
        zzak();
        zzu();
        Context zzn = zzn();
        if (!zzfq.zza(zzn)) {
            zzr().zzw().zza("Receiver not registered/enabled");
        }
        if (!zzkm.zza(zzn, false)) {
            zzr().zzw().zza("Service not registered/enabled");
        }
        zzf();
        zzm().elapsedRealtime();
        if (j < Math.max(0L, zzap.zzx.zza(null).longValue()) && !this.zzc.zzb()) {
            zzr().zzx().zza("Scheduling upload with DelayedRunnable");
            this.zzc.zza(j);
        }
        zzu();
        zzr().zzx().zza("Scheduling upload with JobScheduler");
        Context zzn2 = zzn();
        ComponentName componentName = new ComponentName(zzn2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int zzv = zzv();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(SignupConstants.Error.DEBUG_INFO_ACTION, "com.google.android.gms.measurement.UPLOAD");
        JobInfo build = new JobInfo.Builder(zzv, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
        zzr().zzx().zza("Scheduling job. JobID", Integer.valueOf(zzv));
        com.google.android.gms.internal.measurement.zzh.zza(zzn2, build, "com.google.android.gms", "UploadAlarm");
    }

    private final int zzv() {
        if (this.zzd == null) {
            String valueOf = String.valueOf(zzn().getPackageName());
            this.zzd = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.zzd.intValue();
    }

    public final void zzf() {
        zzak();
        this.zzb.cancel(zzw());
        this.zzc.zzc();
        zzk();
    }

    private final PendingIntent zzw() {
        Context zzn = zzn();
        return PendingIntent.getBroadcast(zzn, 0, new Intent().setClassName(zzn, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final /* bridge */ /* synthetic */ zzki zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final /* bridge */ /* synthetic */ zzn e_() {
        return super.e_();
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final /* bridge */ /* synthetic */ zzac zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final /* bridge */ /* synthetic */ zzfu zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
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
