package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import o.InterfaceC9383oZ;

/* loaded from: classes2.dex */
public enum StreamReadFeature implements InterfaceC9383oZ {
    AUTO_CLOSE_SOURCE(JsonParser.Feature.AUTO_CLOSE_SOURCE),
    STRICT_DUPLICATE_DETECTION(JsonParser.Feature.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNDEFINED(JsonParser.Feature.IGNORE_UNDEFINED),
    INCLUDE_SOURCE_IN_LOCATION(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION),
    USE_FAST_DOUBLE_PARSER(JsonParser.Feature.USE_FAST_DOUBLE_PARSER);
    
    private final boolean g;
    private final int h;
    private final JsonParser.Feature i;

    @Override // o.InterfaceC9383oZ
    public int a() {
        return this.h;
    }

    @Override // o.InterfaceC9383oZ
    public boolean b() {
        return this.g;
    }

    public JsonParser.Feature c() {
        return this.i;
    }

    StreamReadFeature(JsonParser.Feature feature) {
        this.i = feature;
        this.h = feature.b();
        this.g = feature.e();
    }
}
