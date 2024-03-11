package com.netflix.model.leafs.offline;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.PostPlayAction;
import java.util.HashMap;
import java.util.Map;
import o.C8336diU;
import o.InterfaceC5160btX;
import o.InterfaceC5191buB;
import org.chromium.net.NetError;

/* loaded from: classes5.dex */
public class OfflinePostPlayAction implements PostPlayAction {
    private String ancestorTitle;
    private int autoPlaySeconds;
    private int bookmarkPosition;
    private String displayText;
    private int episode;
    private boolean forceInterrupt;
    private String interruptDisplayText;
    private int interruptThreshold;
    private int itemIndex;
    private String listId;
    private long logicalStart;
    private long minutesRemaining;
    protected String name;
    private final C8336diU offlinePostPlayVideo;
    private String requestId;
    private int runtimeSeconds;
    private long seamlessStartMillis;
    private int season;
    private String seasonSequenceAbbr;
    private String seasonSequenceLong;
    protected String type;
    private int videoId;
    private final VideoType videoType;
    private int trackId = NetError.ERR_PROXY_CONNECTION_FAILED;
    private final Map<String, Integer> additionalTrackIds = new HashMap();
    private boolean inMyList = false;
    private boolean doNotIncrementInterrupter = false;
    private final boolean autoPlay = false;
    private int seamlessStart = -1;

    private void setEpisode(int i) {
        this.episode = i;
    }

    private void setSeasonSequenceAbbr(String str) {
        this.seasonSequenceAbbr = str;
    }

    private void setVideoId(int i) {
        this.videoId = i;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public Map<String, Integer> getAdditionalTrackIds() {
        return this.additionalTrackIds;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public String getAncestorTitle() {
        return this.ancestorTitle;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public int getAutoplaySeconds() {
        return this.autoPlaySeconds;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public int getBookmarkPosition() {
        return this.bookmarkPosition;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public String getDisplayText() {
        return this.displayText;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public int getEpisode() {
        return this.episode;
    }

    @Override // o.InterfaceC5281bvm
    public String getImpressionToken() {
        return null;
    }

    public String getInterruptDisplayText() {
        return this.interruptDisplayText;
    }

    public int getInterruptThreshold() {
        return this.interruptThreshold;
    }

    public int getItemIndex() {
        return this.itemIndex;
    }

    @Override // o.InterfaceC5281bvm
    public String getListContext() {
        return null;
    }

    @Override // o.InterfaceC5281bvm
    public String getListId() {
        return this.listId;
    }

    @Override // o.InterfaceC5281bvm
    public int getListPos() {
        return this.itemIndex;
    }

    public long getLogicalStart() {
        return this.logicalStart;
    }

    public long getMinutesRemaining() {
        return this.minutesRemaining;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public String getName() {
        return this.name;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public InterfaceC5191buB getPlayBackVideo() {
        return this.offlinePostPlayVideo;
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        return this.requestId;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public int getRuntimeSeconds() {
        return this.runtimeSeconds;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public long getSeamlessStart() {
        return this.seamlessStartMillis;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public int getSeason() {
        return this.season;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public String getSeasonSequenceAbbr() {
        return this.seasonSequenceAbbr;
    }

    public String getSeasonSequenceLong() {
        return this.seasonSequenceLong;
    }

    @Override // o.InterfaceC5281bvm
    public String getSectionUid() {
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayAction, o.InterfaceC5281bvm
    public int getTrackId() {
        return this.trackId;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public String getType() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public int getVideoId() {
        return this.videoId;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public VideoType getVideoType() {
        return this.videoType;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public boolean isAutoPlay() {
        return false;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public boolean isDoNotIncrementInterrupter() {
        return this.doNotIncrementInterrupter;
    }

    public boolean isForceInterrupt() {
        return this.forceInterrupt;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public boolean isInMyList() {
        return this.inMyList;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public void setAncestorTitle(String str) {
        this.ancestorTitle = str;
    }

    public void setBookmarkPosition(int i) {
        this.bookmarkPosition = i;
    }

    public void setDisplayText(String str) {
        this.displayText = str;
    }

    public void setDoNotIncrementInterrupter(boolean z) {
        this.doNotIncrementInterrupter = z;
    }

    public void setForceInterrupt(boolean z) {
        this.forceInterrupt = z;
    }

    public void setInMyList(boolean z) {
        this.inMyList = z;
    }

    public void setInterruptDisplayText(String str) {
        this.interruptDisplayText = str;
    }

    public void setInterruptThreshold(int i) {
        this.interruptThreshold = i;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public void setItemIndex(int i) {
        this.itemIndex = i;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public void setListId(String str) {
        this.listId = str;
    }

    public void setLogicalStart(long j) {
        this.logicalStart = j;
    }

    public void setMinutesRemaining(long j) {
        this.minutesRemaining = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSeamlessStart(long j) {
        this.seamlessStartMillis = j;
    }

    public void setSeason(int i) {
        this.season = i;
    }

    public void setSeasonSequenceLong(String str) {
        this.seasonSequenceLong = str;
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public void setTrackId(int i) {
        this.trackId = i;
    }

    public void setType(String str) {
        this.type = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OfflinePostPlayAction(InterfaceC5160btX interfaceC5160btX, int i, int i2, int i3, VideoType videoType) {
        if (videoType == VideoType.MOVIE) {
            this.name = "play";
        } else {
            this.name = "playEpisode";
        }
        this.type = "play";
        this.videoType = videoType;
        setVideoId(Integer.parseInt(interfaceC5160btX.aH_() == null ? "-1" : interfaceC5160btX.aH_()));
        setSeasonSequenceAbbr(interfaceC5160btX.aK_());
        setEpisode(interfaceC5160btX.aw_());
        setTrackId(i3);
        getAdditionalTrackIds().put(PostPlayAction.USER_ACTION_POST_PLAY_TRACK_ID_KEY, Integer.valueOf(i));
        getAdditionalTrackIds().put(PostPlayAction.AUTO_ACTION_POST_PLAY_TRACK_ID_KEY, Integer.valueOf(i2));
        this.offlinePostPlayVideo = new C8336diU(interfaceC5160btX);
    }
}
