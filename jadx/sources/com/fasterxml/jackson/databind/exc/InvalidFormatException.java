package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;

/* loaded from: classes5.dex */
public class InvalidFormatException extends MismatchedInputException {
    private static final long serialVersionUID = 1;
    protected final Object e;

    public InvalidFormatException(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        super(jsonParser, str, cls);
        this.e = obj;
    }

    public static InvalidFormatException c(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        return new InvalidFormatException(jsonParser, str, obj, cls);
    }
}
