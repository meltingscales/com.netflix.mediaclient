package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzx;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzan extends zzx.zza {
    private final /* synthetic */ zzk zzc;
    private final /* synthetic */ zzx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzx zzxVar, zzk zzkVar) {
        super(zzxVar);
        this.zzd = zzxVar;
        this.zzc = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() {
        zzm zzmVar;
        zzmVar = this.zzd.zzr;
        zzmVar.getCurrentScreenName(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    protected final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
