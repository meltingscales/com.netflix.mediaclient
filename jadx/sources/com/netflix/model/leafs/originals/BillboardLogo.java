package com.netflix.model.leafs.originals;

import com.google.gson.JsonElement;

/* loaded from: classes5.dex */
public class BillboardLogo extends AbstractBillboardAsset {
    @Override // com.netflix.model.leafs.originals.BillboardAsset
    public String getTag() {
        return "Logo";
    }

    public BillboardLogo(JsonElement jsonElement) {
        super(jsonElement);
    }
}
