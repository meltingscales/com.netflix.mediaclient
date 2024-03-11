package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8168dfL;
import o.InterfaceC0952Ix;
import o.InterfaceC5279bvk;

/* loaded from: classes6.dex */
public class SearchSuggestion extends AbstractC0941Im implements InterfaceC5279bvk, InterfaceC0952Ix {
    private static final String TAG = "SearchSuggestion";
    private boolean enableTitleGroupTreatment;
    private String entityId;
    private String title;
    private String unifiedEntityId;

    public boolean getEnableTitleGroupTreatment() {
        return this.enableTitleGroupTreatment;
    }

    @Override // o.InterfaceC5279bvk
    public String getEntityId() {
        return this.entityId;
    }

    public String getUnifiedEntityId() {
        return this.unifiedEntityId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -2102099874:
                    if (key.equals("entityId")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1776440658:
                    if (key.equals("enableTitleGroupTreatment")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -416615408:
                    if (key.equals("unifiedEntityId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 110371416:
                    if (key.equals(SignupConstants.Field.VIDEO_TITLE)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.entityId = value.getAsString();
            } else if (c == 1) {
                this.enableTitleGroupTreatment = value.getAsBoolean();
            } else if (c == 2) {
                this.unifiedEntityId = value.getAsString();
            } else if (c == 3) {
                this.title = value.getAsString();
            }
        }
    }

    public String getTitle() {
        return C8168dfL.e(this.title);
    }

    public String toString() {
        return "SearchSuggestion [title=" + this.title + ", unifiedEntityId=" + this.unifiedEntityId + ", entityId=" + this.entityId + "enableTitleGroupTreatment=" + this.enableTitleGroupTreatment + "]";
    }
}
