package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zzfh {
    private final String zza;
    private final boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final /* synthetic */ zzff zze;

    public zzfh(zzff zzffVar, String str, boolean z) {
        this.zze = zzffVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = z;
    }

    public final boolean zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getBoolean(this.zza, this.zzb);
        }
        return this.zzd;
    }

    public final void zza(boolean z) {
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        edit.putBoolean(this.zza, z);
        edit.apply();
        this.zzd = z;
    }
}
