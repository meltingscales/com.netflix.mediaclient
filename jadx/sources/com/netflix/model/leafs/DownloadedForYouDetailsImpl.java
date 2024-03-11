package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC0952Ix;
import o.InterfaceC5184btv;

/* loaded from: classes5.dex */
public final class DownloadedForYouDetailsImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC5184btv {
    public static final Companion Companion = new Companion(null);
    private static final String IS_OFFLINE_AVAILABLE = "isOfflineAvailable";
    private static final String PARENT_VIDEO_ID = "parentVideoId";
    private static final String VIDEO_ID = "videoId";
    @SerializedName(IS_OFFLINE_AVAILABLE)
    private Boolean offlineAvailable;
    @SerializedName(PARENT_VIDEO_ID)
    private String parentVideo;
    @SerializedName("videoId")
    private String video;

    public final Boolean getOfflineAvailable() {
        return this.offlineAvailable;
    }

    public final String getParentVideo() {
        return this.parentVideo;
    }

    @Override // o.InterfaceC5184btv
    public String getParentVideoId() {
        return this.parentVideo;
    }

    public final String getVideo() {
        return this.video;
    }

    @Override // o.InterfaceC5184btv
    public String getVideoId() {
        return this.video;
    }

    public final void setOfflineAvailable(Boolean bool) {
        this.offlineAvailable = bool;
    }

    public final void setParentVideo(String str) {
        this.parentVideo = str;
    }

    public final void setVideo(String str) {
        this.video = str;
    }

    @Override // o.InterfaceC5184btv
    public VideoType getVideoType() {
        return C8632dsu.c((Object) getVideoId(), (Object) getParentVideoId()) ? VideoType.MOVIE : VideoType.EPISODE;
    }

    @Override // o.InterfaceC5184btv
    public boolean isOfflineAvailable() {
        Boolean bool = this.offlineAvailable;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("DownloadedForYouDetails");
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (key != null) {
                int hashCode = key.hashCode();
                if (hashCode != -1308079760) {
                    if (hashCode != 452782838) {
                        if (hashCode == 941180652 && key.equals(PARENT_VIDEO_ID)) {
                            this.parentVideo = value.getAsString();
                        }
                    } else if (key.equals("videoId")) {
                        this.video = value.getAsString();
                    }
                } else if (key.equals(IS_OFFLINE_AVAILABLE)) {
                    this.offlineAvailable = Boolean.valueOf(value.getAsBoolean());
                }
            }
        }
    }
}
