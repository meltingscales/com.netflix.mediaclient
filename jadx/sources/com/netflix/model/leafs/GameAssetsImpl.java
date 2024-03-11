package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.netflix.model.leafs.VideoInfo;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9688vC;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class GameAssetsImpl extends AbstractC0941Im implements InterfaceC0952Ix, VideoInfo.GameAssets {
    public static final Companion Companion = new Companion(null);
    private static final String GAME_TAG = "gameTag";
    private static final String URL = "url";
    private String gameTag;
    private String url;

    @Override // com.netflix.model.leafs.VideoInfo.GameAssets
    public String getAppIconUrl() {
        return this.url;
    }

    @Override // com.netflix.model.leafs.VideoInfo.GameAssets
    public String getGameTag() {
        return this.gameTag;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("GameAssetsImpl");
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (C8632dsu.c((Object) key, (Object) "url")) {
                C8632dsu.d(value);
                this.url = C9688vC.c(value);
            } else if (C8632dsu.c((Object) key, (Object) GAME_TAG)) {
                C8632dsu.d(value);
                this.gameTag = C9688vC.c(value);
            }
        }
    }
}
