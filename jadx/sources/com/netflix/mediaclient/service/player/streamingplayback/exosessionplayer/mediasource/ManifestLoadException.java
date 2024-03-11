package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource;

import com.netflix.mediaclient.android.app.Status;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ManifestLoadException extends IOException {
    private final Status b;

    public Status a() {
        return this.b;
    }

    public ManifestLoadException(Status status) {
        this.b = status;
    }
}
