package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes5.dex */
final class zzbd implements com.google.android.gms.cast.framework.media.internal.zza {
    final /* synthetic */ zzbf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbd(zzbf zzbfVar) {
        this.zza = zzbfVar;
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zza
    public final void zza(Bitmap bitmap) {
        View view;
        ImageView imageView;
        ImageView imageView2;
        zzbe zzbeVar;
        zzbe zzbeVar2;
        View view2;
        if (bitmap != null) {
            zzbf zzbfVar = this.zza;
            view = zzbfVar.zzd;
            if (view != null) {
                view2 = zzbfVar.zzd;
                view2.setVisibility(4);
            }
            imageView = this.zza.zza;
            imageView.setVisibility(0);
            imageView2 = this.zza.zza;
            imageView2.setImageBitmap(bitmap);
            zzbf zzbfVar2 = this.zza;
            zzbeVar = zzbfVar2.zzf;
            if (zzbeVar != null) {
                zzbeVar2 = zzbfVar2.zzf;
                zzbeVar2.zza();
            }
        }
    }
}
