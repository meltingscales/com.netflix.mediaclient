package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaImagePosition;

/* loaded from: classes.dex */
public abstract class UmaImagePosition {

    /* loaded from: classes.dex */
    public enum HorizontalPositions {
        START,
        END,
        LEFT,
        CENTER,
        RIGHT
    }

    /* loaded from: classes.dex */
    public enum VerticalPositions {
        TOP,
        CENTER,
        BOTTOM
    }

    @SerializedName("horizontal")
    public abstract HorizontalPositions horizontal();

    @SerializedName("vertical")
    public abstract VerticalPositions vertical();

    public static TypeAdapter<UmaImagePosition> typeAdapter(Gson gson) {
        return new AutoValue_UmaImagePosition.GsonTypeAdapter(gson);
    }
}
