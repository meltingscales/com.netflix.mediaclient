package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* loaded from: classes2.dex */
public class InputCoercionException extends StreamReadException {
    private static final long serialVersionUID = 1;
    protected final Class<?> b;
    protected final JsonToken c;

    public InputCoercionException(JsonParser jsonParser, String str, JsonToken jsonToken, Class<?> cls) {
        super(jsonParser, str);
        this.c = jsonToken;
        this.b = cls;
    }
}
