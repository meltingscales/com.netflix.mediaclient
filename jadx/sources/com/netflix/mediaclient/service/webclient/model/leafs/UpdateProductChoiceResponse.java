package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UpdateProductChoiceResponse;

/* loaded from: classes.dex */
public abstract class UpdateProductChoiceResponse {
    public abstract boolean fallback();

    public abstract boolean success();

    public abstract String trackingInfo();

    public static TypeAdapter<UpdateProductChoiceResponse> typeAdapter(Gson gson) {
        return new AutoValue_UpdateProductChoiceResponse.GsonTypeAdapter(gson);
    }
}
