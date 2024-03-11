package com.netflix.mediaclient.drm;

import java.util.UUID;
import o.C8054ddD;

/* loaded from: classes3.dex */
public final class NetflixMediaDrmFactory {
    private static final String TAG = "NetflixMediaDrmFactory";

    private NetflixMediaDrmFactory() {
    }

    public static PlatformMediaDrm createPlatformMediaDrm(UUID uuid) {
        if (C8054ddD.c() < 28) {
            return new PlatformMediaDrmApi23(uuid);
        }
        if (C8054ddD.c() < 29) {
            return new PlatformMediaDrmApi28(uuid);
        }
        return new PlatformMediaDrmApi29(uuid);
    }
}
