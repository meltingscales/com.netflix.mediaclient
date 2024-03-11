package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaModalAttributes;

/* loaded from: classes.dex */
public abstract class UmaModalAttributes {
    @SerializedName("background")
    public abstract UmaBackgroundStyle background();

    @SerializedName("size")
    public abstract UmaDimensions dialogDimensions();

    @SerializedName("padding")
    public abstract UmaPadding dialogPadding();

    @SerializedName("foreground")
    public abstract UmaImageDetails foreground();

    @SerializedName("scrim")
    public abstract UmaStyle scrim();

    public static TypeAdapter<UmaModalAttributes> typeAdapter(Gson gson) {
        return new AutoValue_UmaModalAttributes.GsonTypeAdapter(gson);
    }
}
