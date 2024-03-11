package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.util.RequestPayload;

/* loaded from: classes2.dex */
public class JsonParseException extends StreamReadException {
    private static final long serialVersionUID = 2;

    public JsonParseException e(RequestPayload requestPayload) {
        this.e = requestPayload;
        return this;
    }

    public JsonParseException(JsonParser jsonParser, String str) {
        super(jsonParser, str);
    }

    public JsonParseException(JsonParser jsonParser, String str, Throwable th) {
        super(jsonParser, str, th);
    }

    public JsonParseException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super(jsonParser, str, jsonLocation);
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException, com.fasterxml.jackson.core.JsonProcessingException
    /* renamed from: a */
    public JsonParser d() {
        return super.d();
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }
}
