package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaTimer;

/* loaded from: classes.dex */
public abstract class UmaTimer {
    public static final String ACTION_DISMISS = "DISMISS";
    public static final String ACTION_TYPE_BACKGROUND_CALL = "BACKGROUND_CALL";

    public abstract String action();

    public abstract String actionType();

    @SerializedName("millisecondValue")
    public abstract int value();

    public static TypeAdapter<UmaTimer> typeAdapter(Gson gson) {
        return new AutoValue_UmaTimer.GsonTypeAdapter(gson);
    }
}
