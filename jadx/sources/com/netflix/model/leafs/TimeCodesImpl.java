package com.netflix.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.netflix.model.leafs.VideoInfo;
import o.AbstractC0941Im;
import o.C1332Xp;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class TimeCodesImpl extends AbstractC0941Im implements InterfaceC0952Ix, VideoInfo.TimeCodes {
    private static final String TAG = "timeCodes";
    public TimeCodesData timeCodesData;

    @Override // com.netflix.model.leafs.VideoInfo.TimeCodes
    public TimeCodesData getTimeCodesData() {
        return this.timeCodesData;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        this.timeCodesData = (TimeCodesData) ((Gson) C1332Xp.b(Gson.class)).fromJson((JsonElement) jsonElement.getAsJsonObject(), (Class<Object>) TimeCodesData.class);
    }
}
