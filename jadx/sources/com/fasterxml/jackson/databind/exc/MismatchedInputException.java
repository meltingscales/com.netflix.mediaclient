package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import o.C9537rU;

/* loaded from: classes5.dex */
public class MismatchedInputException extends JsonMappingException {
    protected Class<?> j;

    /* JADX INFO: Access modifiers changed from: protected */
    public MismatchedInputException(JsonParser jsonParser, String str) {
        this(jsonParser, str, (JavaType) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MismatchedInputException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super(jsonParser, str, jsonLocation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MismatchedInputException(JsonParser jsonParser, String str, Class<?> cls) {
        super(jsonParser, str);
        this.j = cls;
    }

    protected MismatchedInputException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this.j = C9537rU.d(javaType);
    }

    public static MismatchedInputException d(JsonParser jsonParser, JavaType javaType, String str) {
        return new MismatchedInputException(jsonParser, str, javaType);
    }

    public static MismatchedInputException a(JsonParser jsonParser, Class<?> cls, String str) {
        return new MismatchedInputException(jsonParser, str, cls);
    }

    public MismatchedInputException d(JavaType javaType) {
        this.j = javaType.h();
        return this;
    }
}
