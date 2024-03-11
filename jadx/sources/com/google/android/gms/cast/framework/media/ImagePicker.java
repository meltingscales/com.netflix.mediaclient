package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;

/* loaded from: classes2.dex */
public class ImagePicker {
    private final zzd zza = new zzj(this, null);

    @Deprecated
    public WebImage onPickImage(MediaMetadata mediaMetadata, int i) {
        if (mediaMetadata == null || !mediaMetadata.hasImages()) {
            return null;
        }
        return mediaMetadata.getImages().get(0);
    }

    public final zzd zza() {
        return this.zza;
    }

    public WebImage onPickImage(MediaMetadata mediaMetadata, ImageHints imageHints) {
        return onPickImage(mediaMetadata, imageHints.getType());
    }
}
