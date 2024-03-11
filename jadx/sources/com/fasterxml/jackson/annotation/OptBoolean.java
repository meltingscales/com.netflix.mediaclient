package com.fasterxml.jackson.annotation;

/* loaded from: classes5.dex */
public enum OptBoolean {
    TRUE,
    FALSE,
    DEFAULT;

    public Boolean e() {
        if (this == DEFAULT) {
            return null;
        }
        return this == TRUE ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean e(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2 == null;
        }
        return bool.equals(bool2);
    }
}
