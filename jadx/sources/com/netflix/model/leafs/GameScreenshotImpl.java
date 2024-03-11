package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.GameInfo;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8632dsu;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class GameScreenshotImpl extends AbstractC0941Im implements InterfaceC0952Ix, GameInfo.GameScreenshot {
    private String imageKey;
    private String url;

    public final String getImageKey() {
        return this.imageKey;
    }

    @Override // com.netflix.model.leafs.GameInfo.GameScreenshot
    public String getScreenshotKey() {
        return this.imageKey;
    }

    @Override // com.netflix.model.leafs.GameInfo.GameScreenshot
    public String getScreenshotUrl() {
        return this.url;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setImageKey(String str) {
        this.imageKey = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (C8632dsu.c((Object) key, (Object) SignupConstants.Field.URL)) {
                this.url = value.getAsString();
            } else if (C8632dsu.c((Object) key, (Object) SignupConstants.Error.DEBUG_FIELD_KEY)) {
                this.imageKey = value.getAsString();
            }
        }
    }
}
