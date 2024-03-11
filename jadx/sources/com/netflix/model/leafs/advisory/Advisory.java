package com.netflix.model.leafs.advisory;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Locale;

/* loaded from: classes.dex */
public interface Advisory {
    JsonObject getData(JsonElement jsonElement);

    float getDelay();

    float getDuration();

    String getMessage();

    String getSecondaryMessage();

    Type getType();

    /* loaded from: classes5.dex */
    public enum Type {
        EXPIRY_NOTICE,
        CONTENT_ADVISORY,
        PRODUCT_PLACEMENT_ADVISORY,
        UNKNOWN;

        public static Type fromString(String str) {
            try {
                return valueOf(str.toUpperCase(Locale.ENGLISH));
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum DisplayLocation {
        START,
        END,
        UNKNOWN;

        public static DisplayLocation fromString(String str) {
            try {
                return valueOf(str.toUpperCase());
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }
}
