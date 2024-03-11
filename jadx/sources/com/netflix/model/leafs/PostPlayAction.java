package com.netflix.model.leafs;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.Map;
import o.InterfaceC5191buB;
import o.InterfaceC5281bvm;

/* loaded from: classes5.dex */
public interface PostPlayAction extends InterfaceC5281bvm {
    public static final String AUTO_ACTION_POST_PLAY_TRACK_ID_KEY = "autoPlay";
    public static final String USER_ACTION_POST_PLAY_TRACK_ID_KEY = "userPlay";

    Map<String, Integer> getAdditionalTrackIds();

    String getAncestorTitle();

    int getAutoplaySeconds();

    int getBookmarkPosition();

    String getDisplayText();

    int getEpisode();

    String getName();

    InterfaceC5191buB getPlayBackVideo();

    int getRuntimeSeconds();

    long getSeamlessStart();

    int getSeason();

    String getSeasonSequenceAbbr();

    @Override // o.InterfaceC5281bvm
    int getTrackId();

    String getType();

    int getVideoId();

    VideoType getVideoType();

    boolean isAutoPlay();

    boolean isDoNotIncrementInterrupter();

    boolean isInMyList();

    void setAncestorTitle(String str);

    void setItemIndex(int i);

    void setListId(String str);

    void setRequestId(String str);

    void setTrackId(int i);
}
