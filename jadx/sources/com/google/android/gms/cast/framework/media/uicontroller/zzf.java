package com.google.android.gms.cast.framework.media.uicontroller;

import android.view.View;

/* loaded from: classes5.dex */
final class zzf implements View.OnClickListener {
    final /* synthetic */ long zza;
    final /* synthetic */ UIMediaController zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(UIMediaController uIMediaController, long j) {
        this.zzb = uIMediaController;
        this.zza = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzb.onForwardClicked(view, this.zza);
    }
}
