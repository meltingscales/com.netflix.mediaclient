package com.netflix.model.leafs.originals;

import com.google.gson.JsonElement;

/* loaded from: classes5.dex */
public class HorizontalBillboardBackground extends BillboardBackgroundImpl {
    @Override // com.netflix.model.leafs.originals.BillboardBackgroundImpl, com.netflix.model.leafs.originals.BillboardAsset
    public String getTag() {
        return "HorizontalBackground";
    }

    public HorizontalBillboardBackground(JsonElement jsonElement) {
        super(jsonElement);
    }
}
