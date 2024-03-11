package com.google.android.gms.internal.cast;

import android.content.Context;
import androidx.mediarouter.media.MediaRouter;

/* loaded from: classes2.dex */
public final class zzaj {
    public MediaRouter zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(Context context) {
        this.zzb = context;
    }

    public final MediaRouter zza() {
        if (this.zza == null) {
            this.zza = MediaRouter.getInstance(this.zzb);
        }
        return this.zza;
    }

    public final void zzb(MediaRouter.Callback callback) {
        MediaRouter zza = zza();
        if (zza != null) {
            zza.removeCallback(callback);
        }
    }
}
