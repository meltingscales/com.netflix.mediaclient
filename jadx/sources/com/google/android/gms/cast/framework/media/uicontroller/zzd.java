package com.google.android.gms.cast.framework.media.uicontroller;

import android.view.View;

/* loaded from: classes5.dex */
final class zzd implements View.OnClickListener {
    final /* synthetic */ UIMediaController zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(UIMediaController uIMediaController) {
        this.zza = uIMediaController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.onSkipNextClicked(view);
    }
}