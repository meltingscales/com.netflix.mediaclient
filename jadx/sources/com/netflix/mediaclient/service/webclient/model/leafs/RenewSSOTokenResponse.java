package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C8118deO;

/* loaded from: classes6.dex */
public class RenewSSOTokenResponse {
    public RootResponse response;

    /* loaded from: classes6.dex */
    public static class Data {
        @SerializedName("renewSSOToken")
        public RenewSSOToken renewSSOToken;
    }

    /* loaded from: classes6.dex */
    public enum Reason {
        TOKEN_INVALID,
        TOKEN_ACTIVE
    }

    /* loaded from: classes6.dex */
    public static class RenewSSOToken {
        @SerializedName("reason")
        public Reason reason;
        @SerializedName("ssoToken")
        public String ssoToken;
    }

    /* loaded from: classes6.dex */
    public static class RootResponse {
        @SerializedName(NotificationFactory.DATA)
        public Data data;
    }

    public RenewSSOTokenResponse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("response is null!");
        }
        this.response = (RootResponse) C8118deO.a().fromJson(str, (Class<Object>) RootResponse.class);
    }
}
