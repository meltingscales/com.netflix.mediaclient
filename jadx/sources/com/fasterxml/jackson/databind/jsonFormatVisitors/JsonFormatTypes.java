package com.fasterxml.jackson.databind.jsonFormatVisitors;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum JsonFormatTypes {
    STRING,
    NUMBER,
    INTEGER,
    BOOLEAN,
    OBJECT,
    ARRAY,
    NULL,
    ANY;
    
    private static final Map<String, JsonFormatTypes> f = new HashMap();

    static {
        JsonFormatTypes[] values;
        for (JsonFormatTypes jsonFormatTypes : values()) {
            f.put(jsonFormatTypes.name().toLowerCase(), jsonFormatTypes);
        }
    }
}
