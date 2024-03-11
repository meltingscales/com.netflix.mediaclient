package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import java.util.Map;
import o.AbstractC0941Im;
import o.InterfaceC0952Ix;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public class PostPlayImpression extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC8319diD {
    private String TAG = "PostPlayImpression";
    boolean success;

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            if (!(value instanceof JsonNull)) {
                String key = entry.getKey();
                key.hashCode();
                if (key.equals("success")) {
                    this.success = value.getAsBoolean();
                }
            }
        }
    }
}
