package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* loaded from: classes2.dex */
public class JsonEOFException extends JsonParseException {
    private static final long serialVersionUID = 1;
    protected final JsonToken b;

    public JsonEOFException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        super(jsonParser, str);
        this.b = jsonToken;
    }
}
