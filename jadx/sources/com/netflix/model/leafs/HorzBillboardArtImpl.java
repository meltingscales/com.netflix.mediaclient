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
public final class HorzBillboardArtImpl extends AbstractC0941Im implements InterfaceC0952Ix, VideoInfo.HorzBillboardArt {
    public static final Companion Companion = new Companion(null);
    private static final String HEIGHT = "height";
    private static final String KEY = "key";
    private static final String URL = "url";
    private static final String WIDTH = "width";
    private String artworkKey;
    private Integer height;
    private String url;
    private Integer width;

    @Override // com.netflix.model.leafs.VideoInfo.HorzBillboardArt
    public Integer getHeight() {
        return this.height;
    }

    @Override // com.netflix.model.leafs.VideoInfo.HorzBillboardArt
    public String getKey() {
        return this.artworkKey;
    }

    @Override // com.netflix.model.leafs.VideoInfo.HorzBillboardArt
    public String getUrl() {
        return this.url;
    }

    @Override // com.netflix.model.leafs.VideoInfo.HorzBillboardArt
    public Integer getWidth() {
        return this.width;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("HorzBillboardArtImpl");
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (key != null) {
                switch (key.hashCode()) {
                    case -1221029593:
                        if (key.equals("height")) {
                            this.height = Integer.valueOf(value.getAsInt());
                            break;
                        } else {
                            continue;
                        }
                    case 106079:
                        if (key.equals("key")) {
                            C8632dsu.d(value);
                            this.artworkKey = C9688vC.c(value);
                            break;
                        } else {
                            continue;
                        }
                    case 116079:
                        if (key.equals("url")) {
                            C8632dsu.d(value);
                            this.url = C9688vC.c(value);
                            break;
                        } else {
                            continue;
                        }
                    case 113126854:
                        if (key.equals("width")) {
                            this.width = Integer.valueOf(value.getAsInt());
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }
}
