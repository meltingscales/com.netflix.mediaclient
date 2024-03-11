package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.RequestPayload;

/* loaded from: classes2.dex */
public abstract class StreamReadException extends JsonProcessingException {
    static final long serialVersionUID = 2;
    protected transient JsonParser a;
    public RequestPayload e;

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    /* renamed from: a */
    public JsonParser d() {
        return this.a;
    }

    public StreamReadException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.k());
        this.a = jsonParser;
    }

    public StreamReadException(JsonParser jsonParser, String str, Throwable th) {
        super(str, jsonParser == null ? null : jsonParser.k(), th);
        this.a = jsonParser;
    }

    public StreamReadException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation, null);
        this.a = jsonParser;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.e != null) {
            return message + "\nRequest payload : " + this.e.toString();
        }
        return message;
    }
}
