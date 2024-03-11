package com.netflix.cl.model.android;

import com.netflix.cl.model.DataTracked;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MinusOneVideoInfo extends DataTracked {
    private String videoId;

    public MinusOneVideoInfo(String str, TrackingInfo trackingInfo) {
        super(trackingInfo);
        this.videoId = str;
    }

    @Override // com.netflix.cl.model.DataTracked, com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, SignupConstants.Field.VIDEO_ID, this.videoId);
        return jSONObject;
    }
}
