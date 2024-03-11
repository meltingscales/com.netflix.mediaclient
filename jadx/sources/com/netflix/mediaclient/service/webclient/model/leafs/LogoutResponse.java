package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C8118deO;

/* loaded from: classes4.dex */
public class LogoutResponse {
    private static final String TAG = "LogoutResponse";
    public RootResponse response;

    /* loaded from: classes4.dex */
    public static class Data {
        @SerializedName("streamingAppLogout")
        public StreamingAppLogout streamingAppLogout;
    }

    /* loaded from: classes4.dex */
    public static class Error {
        @SerializedName("message")
        public String message;
    }

    /* loaded from: classes4.dex */
    public static class RootResponse {
        @SerializedName(NotificationFactory.DATA)
        public Data data;
        @SerializedName("errors")
        public List<Error> errors;
    }

    /* loaded from: classes4.dex */
    public static class StreamingAppLogout {
        @SerializedName("message")
        public String message;
        @SerializedName("reason")
        public String reason;
    }

    public LogoutResponse(String str) {
        this.response = (RootResponse) C8118deO.a().fromJson(str, (Class<Object>) RootResponse.class);
    }
}
