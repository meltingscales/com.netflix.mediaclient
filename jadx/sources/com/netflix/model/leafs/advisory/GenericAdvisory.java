package com.netflix.model.leafs.advisory;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.model.leafs.advisory.Advisory;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class GenericAdvisory extends AdvisoryImpl {
    private String text;

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getMessage() {
        return this.text;
    }

    /* renamed from: getSecondaryMessage  reason: collision with other method in class */
    public Void m3082getSecondaryMessage() {
        return null;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public /* bridge */ /* synthetic */ String getSecondaryMessage() {
        return (String) m3082getSecondaryMessage();
    }

    @Override // com.netflix.model.leafs.advisory.AdvisoryImpl, com.netflix.model.leafs.advisory.Advisory
    public Advisory.Type getType() {
        return Advisory.Type.UNKNOWN;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public JsonObject getData(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            C8632dsu.d(entry);
            JsonElement value = entry.getValue();
            if (C8632dsu.c((Object) entry.getKey(), (Object) "text")) {
                this.text = value.getAsString();
            }
        }
        C8632dsu.d(asJsonObject);
        return asJsonObject;
    }
}
