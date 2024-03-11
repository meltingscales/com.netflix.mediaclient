package com.netflix.mediaclient.service.player;

/* loaded from: classes6.dex */
public interface PlayerTestInterface {

    /* loaded from: classes6.dex */
    public enum StreamSelectorType {
        DEFAULT,
        RAMP_DOWN_BITRATE,
        RAMP_UP_BITRATE,
        RAMP_UP_DOWN_BITRATE,
        RANDOM,
        QUALITY,
        HIGHEST_BITRATE,
        LOWEST_BITRATE,
        LIVE
    }
}
