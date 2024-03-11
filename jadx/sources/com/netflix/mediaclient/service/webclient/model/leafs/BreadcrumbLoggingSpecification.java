package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_BreadcrumbLoggingSpecification;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class BreadcrumbLoggingSpecification {
    private static final boolean DEFAULT_DISABLE = false;
    private static final int DEFAULT_DISABLE_CHANCE_PERCENTAGE = 0;
    private static String TAG = "nf_log";

    @SerializedName("disableChancePercentage")
    public abstract int getDisableChancePercentage();

    @SerializedName("implementation")
    public abstract String getImplementation();

    @SerializedName("disable")
    public abstract boolean isDisabled();

    public static BreadcrumbLoggingSpecification getDefault() {
        return (BreadcrumbLoggingSpecification) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) BreadcrumbLoggingSpecification.class);
    }

    public static TypeAdapter<BreadcrumbLoggingSpecification> typeAdapter(Gson gson) {
        return new AutoValue_BreadcrumbLoggingSpecification.GsonTypeAdapter(gson).setDefaultDisabled(false).setDefaultDisableChancePercentage(0);
    }
}
