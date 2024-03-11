package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import o.InterfaceC9383oZ;

/* loaded from: classes5.dex */
public enum StreamWriteFeature implements InterfaceC9383oZ {
    AUTO_CLOSE_TARGET(JsonGenerator.Feature.AUTO_CLOSE_TARGET),
    AUTO_CLOSE_CONTENT(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT),
    FLUSH_PASSED_TO_STREAM(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM),
    WRITE_BIGDECIMAL_AS_PLAIN(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN),
    STRICT_DUPLICATE_DETECTION(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNKNOWN(JsonGenerator.Feature.IGNORE_UNKNOWN),
    USE_FAST_DOUBLE_WRITER(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER);
    
    private final boolean g;
    private final JsonGenerator.Feature j;
    private final int k;

    @Override // o.InterfaceC9383oZ
    public int a() {
        return this.k;
    }

    @Override // o.InterfaceC9383oZ
    public boolean b() {
        return this.g;
    }

    public JsonGenerator.Feature c() {
        return this.j;
    }

    StreamWriteFeature(JsonGenerator.Feature feature) {
        this.j = feature;
        this.k = feature.c();
        this.g = feature.d();
    }
}
