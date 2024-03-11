package com.netflix.model.leafs.originals;

import com.google.gson.JsonElement;

/* loaded from: classes6.dex */
public class BillboardAwardsHeadline extends AbstractBillboardAsset {
    @Override // com.netflix.model.leafs.originals.BillboardAsset
    public String getTag() {
        return "AwardsHeadline";
    }

    public BillboardAwardsHeadline(JsonElement jsonElement) {
        super(jsonElement);
    }
}
