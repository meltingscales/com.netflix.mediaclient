package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_ConsolidatedLoggingSessionSpecification;

/* loaded from: classes.dex */
public abstract class ConsolidatedLoggingSessionSpecification {
    @SerializedName("disableChancePercentagePerUserSession")
    public abstract int getDisableChancePercentagePerUserSession();

    @SerializedName("session")
    public abstract String getSession();

    @SerializedName("suppressPercentagePerEvent")
    public abstract int getSuppressPercentagePerEvent();

    public static TypeAdapter<ConsolidatedLoggingSessionSpecification> typeAdapter(Gson gson) {
        return new AutoValue_ConsolidatedLoggingSessionSpecification.GsonTypeAdapter(gson);
    }
}
