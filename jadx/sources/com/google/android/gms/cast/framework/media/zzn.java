package com.google.android.gms.cast.framework.media;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.images.WebImage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzn {
    public final Uri zza;
    public Bitmap zzb;

    public zzn(WebImage webImage) {
        this.zza = webImage == null ? null : webImage.getUrl();
    }
}
