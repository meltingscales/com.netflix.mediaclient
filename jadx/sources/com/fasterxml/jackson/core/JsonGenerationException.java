package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamWriteException;

/* loaded from: classes2.dex */
public class JsonGenerationException extends StreamWriteException {
    private static final long serialVersionUID = 123;

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException, com.fasterxml.jackson.core.JsonProcessingException
    /* renamed from: c */
    public JsonGenerator d() {
        return this.e;
    }

    public JsonGenerationException(String str, JsonGenerator jsonGenerator) {
        super(str, jsonGenerator);
        this.e = jsonGenerator;
    }
}
