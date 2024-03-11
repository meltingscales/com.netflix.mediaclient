package com.google.android.gms.cast.framework.media;

import android.net.Uri;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;

/* loaded from: classes5.dex */
public class MediaUtils {
    public static Uri getImageUri(MediaInfo mediaInfo, int i) {
        MediaMetadata metadata;
        if (mediaInfo == null || (metadata = mediaInfo.getMetadata()) == null || metadata.getImages() == null || metadata.getImages().size() <= i) {
            return null;
        }
        return metadata.getImages().get(i).getUrl();
    }
}
