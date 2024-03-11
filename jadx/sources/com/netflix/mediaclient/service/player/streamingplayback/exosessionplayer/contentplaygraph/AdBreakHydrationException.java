package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.contentplaygraph;

import com.netflix.mediaclient.android.app.Status;
import java.io.IOException;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class AdBreakHydrationException extends IOException {
    private final Status e;

    public final Status a() {
        return this.e;
    }

    public AdBreakHydrationException(Status status) {
        C8632dsu.c((Object) status, "");
        this.e = status;
    }
}
