package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes5.dex */
public class InvalidTypeIdException extends MismatchedInputException {
    private static final long serialVersionUID = 1;
    protected final String c;
    protected final JavaType e;

    public InvalidTypeIdException(JsonParser jsonParser, String str, JavaType javaType, String str2) {
        super(jsonParser, str);
        this.e = javaType;
        this.c = str2;
    }

    public static InvalidTypeIdException e(JsonParser jsonParser, String str, JavaType javaType, String str2) {
        return new InvalidTypeIdException(jsonParser, str, javaType, str2);
    }
}
