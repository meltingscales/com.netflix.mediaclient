package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import o.C8632dsu;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class LanguageListItemImpl implements InterfaceC0952Ix {
    @SerializedName("localeName")
    private String localeName = "";
    @SerializedName("localeId")
    private String localeId = "";

    public String getLocaleId() {
        return this.localeId;
    }

    public String getLocaleName() {
        return this.localeName;
    }

    public void setLocaleId(String str) {
        C8632dsu.c((Object) str, "");
        this.localeId = str;
    }

    public void setLocaleName(String str) {
        C8632dsu.c((Object) str, "");
        this.localeName = str;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (C8632dsu.c((Object) key, (Object) "localeName")) {
                String asString = value.getAsString();
                C8632dsu.a(asString, "");
                setLocaleName(asString);
            } else if (C8632dsu.c((Object) key, (Object) "localeId")) {
                String asString2 = value.getAsString();
                C8632dsu.a(asString2, "");
                setLocaleId(asString2);
            }
        }
    }
}
