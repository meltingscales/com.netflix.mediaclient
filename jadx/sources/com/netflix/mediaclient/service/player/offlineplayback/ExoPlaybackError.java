package com.netflix.mediaclient.service.player.offlineplayback;

/* loaded from: classes3.dex */
public class ExoPlaybackError {

    /* loaded from: classes3.dex */
    public enum ExoPlaybackErrorCode {
        NO_ERROR(0),
        CRYPTO_ERROR(6);
        
        private final int e;

        public int e() {
            return this.e;
        }

        ExoPlaybackErrorCode(int i) {
            this.e = i;
        }
    }
}
