package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* loaded from: classes5.dex */
public class ValueInstantiationException extends JsonMappingException {
    protected final JavaType c;

    protected ValueInstantiationException(JsonParser jsonParser, String str, JavaType javaType, Throwable th) {
        super(jsonParser, str, th);
        this.c = javaType;
    }

    public static ValueInstantiationException c(JsonParser jsonParser, String str, JavaType javaType, Throwable th) {
        return new ValueInstantiationException(jsonParser, str, javaType, th);
    }
}
