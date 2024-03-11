package com.netflix.model.leafs.advisory;

import android.annotation.SuppressLint;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.model.leafs.advisory.Advisory;
import java.util.Map;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public class ProductPlacementAdvisory extends AdvisoryImpl {
    private static final String TAG = "ProductPlacementAdvisory";
    public String text;

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getMessage() {
        return this.text;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getSecondaryMessage() {
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.AdvisoryImpl, com.netflix.model.leafs.advisory.Advisory
    public Advisory.Type getType() {
        return Advisory.Type.PRODUCT_PLACEMENT_ADVISORY;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public JsonObject getData(JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            if (key.equals("text")) {
                this.text = value.getAsString();
            }
        }
        return asJsonObject;
    }
}
