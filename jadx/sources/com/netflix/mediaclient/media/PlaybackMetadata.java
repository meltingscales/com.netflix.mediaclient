package com.netflix.mediaclient.media;

import java.util.Map;
import o.InterfaceC5085bsB;

/* loaded from: classes3.dex */
public interface PlaybackMetadata {
    String getAudioProfile();

    PlaybackPreCacheData getPlaybackPreCacheData();

    String getPlayerName();

    String getSubtitleProfile();

    int getVideoBitrate();

    Map<String, String> getVideoDecoderStats();

    String getVideoFlavor();

    float getVideoFramerate();

    String getVideoProfile();

    String toDisplayableString(InterfaceC5085bsB interfaceC5085bsB, String str);
}
