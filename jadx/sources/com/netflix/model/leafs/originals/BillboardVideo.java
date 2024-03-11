package com.netflix.model.leafs.originals;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.originals.AutoValue_BillboardVideo;

/* loaded from: classes.dex */
public abstract class BillboardVideo {
    @SerializedName(PostPlayAction.AUTO_ACTION_POST_PLAY_TRACK_ID_KEY)
    public abstract boolean autoPlay();

    @SerializedName("isTrailer")
    public abstract boolean isTrailer();

    @SerializedName("motionId")
    public abstract String motionId();

    @SerializedName("motionShouldLoop")
    public abstract boolean motionShouldLoop();

    @SerializedName("motionUrl")
    public abstract String motionUrl();

    public static TypeAdapter<BillboardVideo> typeAdapter(Gson gson) {
        return new AutoValue_BillboardVideo.GsonTypeAdapter(gson);
    }
}
