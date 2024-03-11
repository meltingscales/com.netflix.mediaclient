package com.netflix.model.leafs.originals;

import com.google.gson.JsonElement;

/* loaded from: classes5.dex */
public class BillboardBackgroundImpl extends AbstractBillboardAsset {
    @Override // com.netflix.model.leafs.originals.BillboardAsset
    public String getTag() {
        return "Background";
    }

    public BillboardBackgroundImpl(JsonElement jsonElement) {
        super(jsonElement);
    }
}
