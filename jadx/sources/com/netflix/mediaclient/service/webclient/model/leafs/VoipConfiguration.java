package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_VoipConfiguration;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class VoipConfiguration {
    public static final int DEFAULT_SAMPLERATE = 8000;
    public static final int MAX_SAMPLERATE_48K = 48000;
    public static final int MIN_SAMPLERATE_8K = 8000;
    private static String TAG = "nf_log";

    @SerializedName("jitterThresholdInMs")
    public abstract Threshold getJitterThresholdInMs();

    @SerializedName("packetLosThresholdInPercent")
    public abstract Threshold getPacketLosThresholdInPercent();

    @SerializedName("rttThresholdInMs")
    public abstract Threshold getRttThresholdInMs();

    @SerializedName("sampleRateInHz")
    public abstract int getSampleRateInHz();

    @SerializedName("sipThresholdInMs")
    public abstract Threshold getSipThresholdInMs();

    @SerializedName("disableChatButton")
    public abstract boolean isDisableChatButton();

    @SerializedName("enableVoip")
    public abstract boolean isEnableVoip();

    @SerializedName("enableVoipOverData")
    public abstract boolean isEnableVoipOverData();

    @SerializedName("enableVoipOverWiFi")
    public abstract boolean isEnableVoipOverWiFi();

    @SerializedName("openDialpadByDefault")
    public abstract boolean isOpenDialpadByDefault();

    @SerializedName("showConfirmationDialog")
    public abstract boolean isShowConfirmationDialog();

    @SerializedName("showHelpForNonMember")
    public abstract boolean isShowHelpForNonMember();

    public static VoipConfiguration getDefault() {
        return (VoipConfiguration) C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) VoipConfiguration.class);
    }

    public static TypeAdapter<VoipConfiguration> typeAdapter(Gson gson) {
        return new AutoValue_VoipConfiguration.GsonTypeAdapter(gson).setDefaultEnableVoip(true).setDefaultEnableVoipOverData(true).setDefaultEnableVoipOverWiFi(true).setDefaultDisableChatButton(false).setDefaultSampleRateInHz(8000).setDefaultShowConfirmationDialog(true).setDefaultOpenDialpadByDefault(false);
    }
}
