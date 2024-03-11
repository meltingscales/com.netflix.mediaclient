package com.netflix.model.leafs.advisory;

import android.annotation.SuppressLint;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.model.leafs.advisory.Advisory;
import java.util.Locale;
import java.util.Map;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public class ExpiringContentAdvisory extends AdvisoryImpl {
    private static final String TAG = "ExpiryAdvisory";
    public ContentType contentType = ContentType.SEASON;
    String expirationText = "";
    public String localizedDate;

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getMessage() {
        return this.expirationText;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getSecondaryMessage() {
        return null;
    }

    /* loaded from: classes5.dex */
    public enum ContentType {
        MOVIE,
        SERIES,
        SHOW,
        SEASON,
        UNKNOWN;

        public static ContentType fromString(String str) {
            try {
                return valueOf(str.toUpperCase(Locale.ENGLISH));
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }

    @Override // com.netflix.model.leafs.advisory.AdvisoryImpl, com.netflix.model.leafs.advisory.Advisory
    public Advisory.Type getType() {
        return Advisory.Type.EXPIRY_NOTICE;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public JsonObject getData(JsonElement jsonElement) {
        char c;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            int hashCode = key.hashCode();
            if (hashCode == 3556653) {
                if (key.equals("text")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 3575610) {
                if (hashCode == 696250825 && key.equals("localizedDate")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (key.equals("type")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                this.expirationText = value.getAsString();
            } else if (c == 1) {
                this.contentType = ContentType.valueOf(value.getAsString().toUpperCase());
            } else if (c == 2) {
                this.localizedDate = value.getAsString();
            }
        }
        return asJsonObject;
    }
}
