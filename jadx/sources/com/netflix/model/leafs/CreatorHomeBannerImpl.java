package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;
import o.C9688vC;
import o.InterfaceC0952Ix;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class CreatorHomeBannerImpl implements InterfaceC0952Ix, CreatorHomeBanner {
    private static final String BANNER_IMAGE_URL = "url";
    private static final String BANNER_TRACKING_INFO = "trackingInfo";
    private static final String CREATOR_HOME_ID = "creatorHomeId";
    private static final String CREATOR_HOME_TITLE = "title";
    public static final Companion Companion = new Companion(null);
    private static final String UNIFIED_ENTITY_ID = "unifiedEntityId";
    @SerializedName(CREATOR_HOME_ID)
    private String creatorHomeId;
    @SerializedName("title")
    private String creatorHomeTitle;
    @SerializedName(BANNER_TRACKING_INFO)
    private JSONObject trackingInfo;
    @SerializedName(UNIFIED_ENTITY_ID)
    private String unifiedEntityId;
    @SerializedName("url")
    private String url;

    @Override // com.netflix.model.leafs.CreatorHomeBanner
    public String getCreatorHomeId() {
        return this.creatorHomeId;
    }

    @Override // com.netflix.model.leafs.CreatorHomeBanner
    public String getCreatorHomeTitle() {
        String str = this.creatorHomeTitle;
        return str == null ? "" : str;
    }

    @Override // com.netflix.model.leafs.CreatorHomeBanner
    public JSONObject getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // com.netflix.model.leafs.CreatorHomeBanner
    public String getUnifiedEntityId() {
        String str = this.unifiedEntityId;
        return str == null ? "" : str;
    }

    @Override // com.netflix.model.leafs.CreatorHomeBanner
    public String getUrl() {
        return this.url;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
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
                    case -1884240891:
                        if (key.equals(BANNER_TRACKING_INFO)) {
                            this.trackingInfo = new JSONObject(value.toString());
                            break;
                        } else {
                            continue;
                        }
                    case -416615408:
                        if (key.equals(UNIFIED_ENTITY_ID)) {
                            C8632dsu.d(value);
                            this.unifiedEntityId = C9688vC.c(value);
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
                    case 110371416:
                        if (key.equals("title")) {
                            C8632dsu.d(value);
                            this.creatorHomeTitle = C9688vC.c(value);
                            break;
                        } else {
                            continue;
                        }
                    case 1093459366:
                        if (key.equals(CREATOR_HOME_ID)) {
                            C8632dsu.d(value);
                            this.creatorHomeId = C9688vC.c(value);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }
}
