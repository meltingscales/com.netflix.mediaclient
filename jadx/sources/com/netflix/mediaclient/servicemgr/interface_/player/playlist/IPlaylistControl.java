package com.netflix.mediaclient.servicemgr.interface_.player.playlist;

import o.C1044Mm;
import o.C5212buW;
import o.InterfaceC5210buU;
import o.InterfaceC5274bvf;

/* loaded from: classes4.dex */
public interface IPlaylistControl {

    /* loaded from: classes4.dex */
    public enum SegmentTransitionType {
        SEAMLESS,
        SHORT,
        LONG
    }

    PlaylistMap H();

    void d(PlaylistTimestamp playlistTimestamp);

    boolean d(PlaylistMap playlistMap);

    boolean d(String str, String str2);

    PlaylistTimestamp l();

    void setSegmentTransitionEndListener(InterfaceC5274bvf interfaceC5274bvf);

    default void setAdsListener(InterfaceC5210buU interfaceC5210buU) {
        C1044Mm.j("IPlaylistControl", "setAdsListener is NOT implemented %s", getClass().getSimpleName());
    }

    default C5212buW E_() {
        C1044Mm.j("IPlaylistControl", "getAdPosition is NOT implemented %s", getClass().getSimpleName());
        return null;
    }
}
