package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzjl;

@TargetApi(24)
/* loaded from: classes5.dex */
public final class AppMeasurementJobService extends JobService implements zzjl {
    private zzjh<AppMeasurementJobService> zza;

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzjl
    public final void zza(Intent intent) {
    }

    private final zzjh<AppMeasurementJobService> zza() {
        if (this.zza == null) {
            this.zza = new zzjh<>(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zza().zza();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zza().zzb();
        super.onDestroy();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return zza().zza(jobParameters);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return zza().zzb(intent);
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzjl
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzjl
    @TargetApi(24)
    public final void zza(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
