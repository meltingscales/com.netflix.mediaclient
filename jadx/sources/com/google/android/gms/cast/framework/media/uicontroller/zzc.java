package com.google.android.gms.cast.framework.media.uicontroller;

import android.view.View;
import android.widget.ImageView;

/* loaded from: classes5.dex */
final class zzc implements View.OnClickListener {
    final /* synthetic */ UIMediaController zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(UIMediaController uIMediaController) {
        this.zza = uIMediaController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.onPlayPauseToggleClicked((ImageView) view);
    }
}
