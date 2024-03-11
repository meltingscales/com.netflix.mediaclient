package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import java.util.Map;
import o.C8123deT;
import o.C8632dsu;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class TaglineMessageImpl implements TaglineMessage, InterfaceC0952Ix {
    private final String TAG = "TaglineMessageImpl";
    private SupplementalMessageType classification = SupplementalMessageType.l;
    private String tagline;

    @Override // com.netflix.model.leafs.TaglineMessage
    public SupplementalMessageType getClassification() {
        return this.classification;
    }

    @Override // com.netflix.model.leafs.TaglineMessage
    public String getTagline() {
        return this.tagline;
    }

    public void setClassification(SupplementalMessageType supplementalMessageType) {
        C8632dsu.c((Object) supplementalMessageType, "");
        this.classification = supplementalMessageType;
    }

    public void setTagline(String str) {
        this.tagline = str;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        if (jsonElement instanceof JsonObject) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                C8632dsu.d(entry);
                String key = entry.getKey();
                JsonElement value = entry.getValue();
                if (C8632dsu.c((Object) key, (Object) "tagline")) {
                    setTagline(C8123deT.b(value));
                } else if (C8632dsu.c((Object) key, (Object) "classification")) {
                    setClassification(SupplementalMessageType.c.b(value.getAsString()));
                }
            }
        }
    }
}
