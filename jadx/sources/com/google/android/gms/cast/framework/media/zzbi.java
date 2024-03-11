package com.google.android.gms.cast.framework.media;

import android.util.Log;
import com.google.android.gms.cast.internal.zzao;
import com.google.android.gms.cast.internal.zzar;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class zzbi implements zzar {
    final /* synthetic */ zzbk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbi(zzbk zzbkVar) {
        this.zza = zzbkVar;
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zza(long j, int i, Object obj) {
        if (true != (obj instanceof zzao)) {
            obj = null;
        }
        try {
            this.zza.setResult(new zzbl(new Status(i), obj != null ? ((zzao) obj).zza : null, obj != null ? ((zzao) obj).zzb : null));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zzb(long j) {
        try {
            zzbk zzbkVar = this.zza;
            zzbkVar.setResult(new zzbj(zzbkVar, new Status(2103)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }
}
