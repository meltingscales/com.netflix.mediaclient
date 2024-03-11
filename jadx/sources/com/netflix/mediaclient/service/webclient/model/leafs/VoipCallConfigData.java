package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes4.dex */
public class VoipCallConfigData {
    private static String TAG = "nf_log";
    @SerializedName("attributes")
    private VoipCallAttributes attributes;
    @SerializedName("tokenExpirationTS")
    private long tokenExpirationTS = Long.MAX_VALUE;
    @SerializedName("userToken")
    private String userToken;

    public VoipCallAttributes getCallAttributes() {
        return this.attributes;
    }

    public long getTokenExpirationTS() {
        return this.tokenExpirationTS;
    }

    public String getUserToken() {
        return this.userToken;
    }
}
