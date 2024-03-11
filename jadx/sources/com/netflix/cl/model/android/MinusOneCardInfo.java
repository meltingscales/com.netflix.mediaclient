package com.netflix.cl.model.android;

import com.netflix.cl.model.Data;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MinusOneCardInfo extends Data {
    private MinusOneCardType cardType;
    private String listName;
    private MinusOneVideoInfo[] videoImpressions;

    public MinusOneCardInfo(MinusOneCardType minusOneCardType, String str, MinusOneVideoInfo[] minusOneVideoInfoArr) {
        this.cardType = minusOneCardType;
        this.listName = str;
        this.videoImpressions = minusOneVideoInfoArr;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, SignupConstants.Field.CARD_TYPE, this.cardType);
        ExtCLUtils.addStringToJson(jSONObject, "listName", this.listName);
        ExtCLUtils.addObjectToJson(jSONObject, "videoImpressions", this.videoImpressions);
        return jSONObject;
    }
}
