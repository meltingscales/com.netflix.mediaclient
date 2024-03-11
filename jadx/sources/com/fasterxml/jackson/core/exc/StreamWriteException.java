package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: classes2.dex */
public abstract class StreamWriteException extends JsonProcessingException {
    private static final long serialVersionUID = 2;
    public transient JsonGenerator e;

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    /* renamed from: c */
    public JsonGenerator d() {
        return this.e;
    }

    public StreamWriteException(String str, JsonGenerator jsonGenerator) {
        super(str, (JsonLocation) null);
        this.e = jsonGenerator;
    }
}
