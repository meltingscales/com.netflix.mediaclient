package com.netflix.mediaclient.clutils;

import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class CLTrackingInfoWithSourceVideoId extends ListSummaryCLTrackingInfo {
    private final int a;

    public final int g() {
        return this.a;
    }

    @Override // com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo, com.netflix.mediaclient.clutils.CLTrackingInfoBase
    public void c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        super.c(jSONObject);
        jSONObject.put("sourceVideoId", this.a);
    }
}
