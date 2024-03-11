package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.drm;

import androidx.media3.exoplayer.drm.DrmSession;
import com.netflix.mediaclient.android.app.Status;

/* loaded from: classes3.dex */
public class NetflixDrmException extends DrmSession.DrmSessionException {
    private final Status e;

    public Status a() {
        return this.e;
    }

    public NetflixDrmException(Status status) {
        super(status.e(), 6000);
        this.e = status;
    }
}
