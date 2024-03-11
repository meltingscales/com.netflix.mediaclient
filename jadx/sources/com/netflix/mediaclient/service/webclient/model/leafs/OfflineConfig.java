package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_OfflineConfig;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class OfflineConfig {
    private static final int DEFAULT_MAINTENANCE_JOB_PERIOD_IN_HRS = 24;
    private static final String TAG = "nf_log";

    @SerializedName("maintenanceJobPeriodInHrs")
    public abstract int getMaintenanceJobPeriodInHrs();

    @SerializedName("disableOfflineFeature")
    public abstract boolean isOfflineFeatureDisabled();

    public static OfflineConfig getDefault() {
        return (OfflineConfig) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) OfflineConfig.class);
    }

    public static TypeAdapter<OfflineConfig> typeAdapter(Gson gson) {
        return new AutoValue_OfflineConfig.GsonTypeAdapter(gson).setDefaultOfflineFeatureDisabled(false).setDefaultMaintenanceJobPeriodInHrs(24);
    }
}
