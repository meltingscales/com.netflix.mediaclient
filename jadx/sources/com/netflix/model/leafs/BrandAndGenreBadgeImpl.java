package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.model.leafs.Video;
import java.util.Map;
import o.C8123deT;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class BrandAndGenreBadgeImpl extends Video.VideoArtwork {
    public BrandAndGenreBadgeImpl() {
        super("imageUrl");
    }

    @Override // com.netflix.model.leafs.Video.VideoArtwork, o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            for (Map.Entry<String, JsonElement> entry : ((JsonObject) jsonElement).getAsJsonObject().entrySet()) {
                JsonElement value = entry.getValue();
                if (C8632dsu.c((Object) entry.getKey(), (Object) "imageUrl")) {
                    this.url = C8123deT.b(value);
                }
            }
        }
    }
}
