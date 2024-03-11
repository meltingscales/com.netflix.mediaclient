package com.netflix.model.leafs.originals;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8123deT;
import o.InterfaceC0952Ix;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public class TallPanelAsset extends AbstractC0941Im implements InterfaceC8319diD, InterfaceC0952Ix {
    private static final String TAG = "TallPanelAsset";
    private String url;

    public String getUrl() {
        return this.url;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                if (key.equals(SignupConstants.Field.URL)) {
                    this.url = C8123deT.b(value);
                }
            }
        }
    }
}
