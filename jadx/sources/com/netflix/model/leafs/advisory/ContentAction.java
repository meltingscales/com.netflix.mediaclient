package com.netflix.model.leafs.advisory;

import java.util.Locale;

/* loaded from: classes5.dex */
public enum ContentAction {
    NEVER_SHOW_AGAIN,
    LOG_WHEN_SHOWN,
    UNKNOWN;

    public static ContentAction fromString(String str) {
        try {
            return valueOf(str.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException unused) {
            return UNKNOWN;
        }
    }
}
