package com.netflix.mediaclient.service.player.drm;

/* loaded from: classes3.dex */
public class NfDrmException extends Exception {
    public NfDrmException(int i, int i2, Throwable th) {
        super("unable to open session (" + i + "/" + i2 + ")", th);
    }

    public NfDrmException(Throwable th) {
        super(th);
    }
}
