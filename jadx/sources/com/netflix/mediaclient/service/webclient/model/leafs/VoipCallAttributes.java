package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class VoipCallAttributes {
    @SerializedName("CALLID")
    private String callId;
    @SerializedName("CODECS")
    private String codecs;
    @SerializedName("DEST_NUMBER")
    private String desinationNumber;
    @SerializedName("DEST_SERVER")
    private String destinationAddress;
    @SerializedName("DEST_PORT")
    private String destinationPORT;
    @SerializedName("SDK")
    private SDKTypes sdkType;

    /* loaded from: classes4.dex */
    public enum SDKTypes {
        DIRECT
    }

    public String getCallId() {
        return this.callId;
    }

    public String getDesinationNumber() {
        return this.desinationNumber;
    }

    public String getDestinationAddress() {
        return this.destinationAddress;
    }

    public String getDestinationPORT() {
        return this.destinationPORT;
    }

    public SDKTypes getSdkType() {
        return this.sdkType;
    }

    public List<String> getCodecs() {
        return Arrays.asList(this.codecs.split(","));
    }
}
