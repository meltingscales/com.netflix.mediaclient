package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_ErrorLoggingSpecification;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class ErrorLoggingSpecification {
    private static final boolean DEFAULT_DISABLE = false;
    private static final int DEFAULT_DISABLE_CHANCE_PERCENTAGE = 0;

    @SerializedName("disableChancePercentage")
    public abstract int getDisableChancePercentage();

    @SerializedName("implementation")
    public abstract String getImplementation();

    @SerializedName("disable")
    public abstract boolean isDisabled();

    public static ErrorLoggingSpecification getDefault() {
        return (ErrorLoggingSpecification) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) ErrorLoggingSpecification.class);
    }

    public static TypeAdapter<ErrorLoggingSpecification> typeAdapter(Gson gson) {
        return new AutoValue_ErrorLoggingSpecification.GsonTypeAdapter(gson).setDefaultDisabled(false).setDefaultDisableChancePercentage(0);
    }
}
