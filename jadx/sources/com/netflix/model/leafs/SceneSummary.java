package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import java.util.Map;
import o.AbstractC0941Im;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public class SceneSummary extends AbstractC0941Im implements InterfaceC0952Ix {
    private static final String TAG = "nf_scene";
    public int position;

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            if (key.equals("position")) {
                this.position = value.getAsInt();
            }
        }
    }

    public String toString() {
        return "SceneSummary{position=" + this.position + '}';
    }
}
