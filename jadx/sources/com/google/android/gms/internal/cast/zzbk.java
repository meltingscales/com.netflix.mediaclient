package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.Cast;

/* loaded from: classes5.dex */
final class zzbk extends Cast.Listener {
    final /* synthetic */ zzbl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbk(zzbl zzblVar) {
        this.zza = zzblVar;
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onVolumeChanged() {
        this.zza.zza();
    }
}
