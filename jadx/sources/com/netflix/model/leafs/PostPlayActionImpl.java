package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC0941Im;
import o.IE;
import o.InterfaceC0943Io;
import o.InterfaceC0952Ix;
import o.InterfaceC1240Ub;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC5191buB;
import o.InterfaceC8319diD;
import org.chromium.net.NetError;

/* loaded from: classes5.dex */
public class PostPlayActionImpl extends AbstractC0941Im implements InterfaceC0952Ix, PostPlayAction {
    private static final String TAG = "PostPlayAction";
    private String ancestorTitle;
    private int autoPlaySeconds;
    private int bookmarkPosition;
    private String displayText;
    private int episode;
    private boolean forceInterrupt;
    private String interruptDisplayText;
    private int interruptThreshold;
    private int itemIndex;
    private long logicalStart;
    private long minutesRemaining;
    protected String name;
    private InterfaceC1240Ub<? extends InterfaceC0943Io> proxy;
    private String requestId;
    private int runtimeSeconds;
    private int season;
    private String seasonSequenceAbbr;
    private String seasonSequenceLong;
    protected String type;
    private int videoId;
    private String listId = null;
    private int trackId = NetError.ERR_PROXY_CONNECTION_FAILED;
    private VideoType videoType = VideoType.UNKNOWN;
    private final Map<String, Integer> additionalTrackIds = new HashMap();
    private boolean inMyList = false;
    private boolean doNotIncrementInterrupter = false;
    private boolean autoPlay = false;
    private int seamlessStart = -1;
    private long seamlessStartMillis = 0;

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
        return this.autoPlay;
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

    public void setEpisode(int i) {
        this.episode = i;
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

    public void setSeasonSequenceAbbr(String str) {
        this.seasonSequenceAbbr = str;
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

    public void setVideoId(int i) {
        this.videoId = i;
    }

    public static PostPlayActionImpl create(JsonElement jsonElement, InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        PostPlayActionImpl postPlayActionImpl = new PostPlayActionImpl(jsonElement, interfaceC1240Ub);
        if (postPlayActionImpl.getVideoType() == VideoType.UNKNOWN) {
            InterfaceC1597aHe.e("Error creating PostPlayAction. VideoType is missing.");
            InterfaceC1593aHa.b("PostPlayAction jsonElement: " + jsonElement.toString());
            return null;
        }
        return postPlayActionImpl;
    }

    private PostPlayActionImpl(JsonElement jsonElement, InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        this.proxy = interfaceC1240Ub;
        if (jsonElement != null) {
            populate(jsonElement);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            if (!(value instanceof JsonNull)) {
                String key = entry.getKey();
                key.hashCode();
                switch (key.hashCode()) {
                    case -1829827457:
                        if (key.equals("bookmarkPosition")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1775808852:
                        if (key.equals("interruptDisplayText")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1739932713:
                        if (key.equals("minutesRemaining")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1681835499:
                        if (key.equals("seasonSequenceAbbr")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1681494944:
                        if (key.equals("seasonSequenceLong")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1544438277:
                        if (key.equals(PostPlayItem.POST_PLAY_ITEM_EPISODE)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1324983797:
                        if (key.equals("seamlessStart")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1067396154:
                        if (key.equals("trackId")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -906335517:
                        if (key.equals("season")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -602057255:
                        if (key.equals("logicalStart")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -563483980:
                        if (key.equals("additionalTrackIds")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -528792081:
                        if (key.equals("inMyList")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (key.equals("name")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3575610:
                        if (key.equals("type")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 345959473:
                        if (key.equals("seamlessStartMillis")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 452782838:
                        if (key.equals(SignupConstants.Field.VIDEO_ID)) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 771110345:
                        if (key.equals("doNotIncrementInterrupter")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 846419272:
                        if (key.equals("interruptThreshold")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1332961877:
                        if (key.equals("videoType")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1438608771:
                        if (key.equals(PostPlayAction.AUTO_ACTION_POST_PLAY_TRACK_ID_KEY)) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1550962648:
                        if (key.equals("runtime")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1629608888:
                        if (key.equals("forceInterrupt")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1714331919:
                        if (key.equals("displayText")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1717291900:
                        if (key.equals("autoPlaySeconds")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        this.bookmarkPosition = value.getAsInt();
                        continue;
                    case 1:
                        this.interruptDisplayText = value.getAsString();
                        continue;
                    case 2:
                        this.minutesRemaining = value.getAsInt();
                        continue;
                    case 3:
                        this.seasonSequenceAbbr = value.getAsString();
                        continue;
                    case 4:
                        this.seasonSequenceLong = value.getAsString();
                        continue;
                    case 5:
                        this.episode = value.getAsInt();
                        continue;
                    case 6:
                        this.seamlessStart = value.getAsInt();
                        continue;
                    case 7:
                        this.trackId = value.getAsInt();
                        continue;
                    case '\b':
                        this.season = value.getAsInt();
                        continue;
                    case '\t':
                        this.logicalStart = value.getAsInt();
                        continue;
                    case '\n':
                        if (!value.isJsonNull()) {
                            for (Map.Entry<String, JsonElement> entry2 : value.getAsJsonObject().entrySet()) {
                                this.additionalTrackIds.put(entry2.getKey(), Integer.valueOf(entry2.getValue().getAsInt()));
                            }
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        this.inMyList = value.getAsBoolean();
                        continue;
                    case '\f':
                        setName(value.getAsString());
                        continue;
                    case '\r':
                        setType(value.getAsString());
                        continue;
                    case 14:
                        this.seamlessStartMillis = value.getAsLong();
                        continue;
                    case 15:
                        this.videoId = value.getAsInt();
                        continue;
                    case 16:
                        this.doNotIncrementInterrupter = value.getAsBoolean();
                        continue;
                    case 17:
                        this.interruptThreshold = value.getAsInt();
                        continue;
                    case 18:
                        this.videoType = VideoType.create(value.getAsString());
                        continue;
                    case 19:
                        this.autoPlay = value.getAsBoolean();
                        continue;
                    case 20:
                        this.runtimeSeconds = value.getAsInt();
                        continue;
                    case 21:
                        this.forceInterrupt = value.getAsBoolean();
                        continue;
                    case 22:
                        this.displayText = value.getAsString();
                        continue;
                    case 23:
                        this.autoPlaySeconds = value.getAsInt();
                        continue;
                }
            }
        }
    }

    @Override // com.netflix.model.leafs.PostPlayAction
    public InterfaceC5191buB getPlayBackVideo() {
        InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub = this.proxy;
        if (interfaceC1240Ub == null) {
            return null;
        }
        List<I> c = interfaceC1240Ub.c(IE.b(SignupConstants.Field.VIDEOS, Integer.valueOf(this.videoId), "summary"));
        if (c.size() > 0) {
            InterfaceC8319diD interfaceC8319diD = (InterfaceC8319diD) c.get(0);
            if (interfaceC8319diD instanceof InterfaceC5191buB) {
                return (InterfaceC5191buB) interfaceC8319diD;
            }
        }
        return null;
    }
}
