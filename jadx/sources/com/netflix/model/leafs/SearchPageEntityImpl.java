package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC0952Ix;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public final class SearchPageEntityImpl extends AbstractC0941Im implements SearchPageEntity, InterfaceC0952Ix, InterfaceC8319diD {
    public static final Companion Companion = new Companion(null);
    private String boxartId;
    private String displayHeader;
    private String displayString;
    private boolean enableTitleGroupTreatment;
    private String entityId = "";
    private String entityType;
    private String imgUrl;
    private String preQueryBoxartId;
    private String preQueryImgUrl;
    private String unifiedEntityId;
    private String videoId;

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        return this.boxartId;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getDisplayHeader() {
        return this.displayHeader;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public boolean getEnableTitleGroupTreatment() {
        return this.enableTitleGroupTreatment;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityId() {
        return this.entityId;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityType() {
        return this.entityType;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        return this.imgUrl;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryBoxartId() {
        return this.preQueryBoxartId;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryImgUrl() {
        return this.preQueryImgUrl;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getTitle() {
        return this.displayString;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getUnifiedEntityId() {
        return this.unifiedEntityId;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getVideoId() {
        return this.videoId;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("SearchPageEntityImpl");
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
                    case -2138714641:
                        if (key.equals("displayHeader")) {
                            this.displayHeader = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case -2102099874:
                        if (key.equals("entityId")) {
                            String asString = value.getAsString();
                            C8632dsu.a(asString, "");
                            this.entityId = asString;
                            break;
                        } else {
                            continue;
                        }
                    case -2040995853:
                        if (key.equals("boxartId")) {
                            this.boxartId = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case -1809429645:
                        if (key.equals("displayString")) {
                            this.displayString = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case -1776440658:
                        if (key.equals("enableTitleGroupTreatment")) {
                            this.enableTitleGroupTreatment = value.getAsBoolean();
                            break;
                        } else {
                            continue;
                        }
                    case -1482998339:
                        if (key.equals("entityType")) {
                            this.entityType = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case -1185088852:
                        if (key.equals("imgUrl")) {
                            this.imgUrl = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case -416615408:
                        if (key.equals("unifiedEntityId")) {
                            this.unifiedEntityId = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case -249089288:
                        if (key.equals("preQueryBoxartId")) {
                            this.preQueryBoxartId = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case 389958385:
                        if (key.equals("preQueryImgUrl")) {
                            this.preQueryImgUrl = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                    case 452782838:
                        if (key.equals(SignupConstants.Field.VIDEO_ID)) {
                            this.videoId = value.getAsString();
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }
}
