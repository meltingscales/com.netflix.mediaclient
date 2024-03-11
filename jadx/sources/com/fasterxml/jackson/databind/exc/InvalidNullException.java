package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import o.C9537rU;

/* loaded from: classes5.dex */
public class InvalidNullException extends MismatchedInputException {
    private static final long serialVersionUID = 1;
    protected final PropertyName e;

    protected InvalidNullException(DeserializationContext deserializationContext, String str, PropertyName propertyName) {
        super(deserializationContext.m(), str);
        this.e = propertyName;
    }

    public static InvalidNullException d(DeserializationContext deserializationContext, PropertyName propertyName, JavaType javaType) {
        InvalidNullException invalidNullException = new InvalidNullException(deserializationContext, String.format("Invalid `null` value encountered for property %s", C9537rU.b(propertyName, "<UNKNOWN>")), propertyName);
        if (javaType != null) {
            invalidNullException.d(javaType);
        }
        return invalidNullException;
    }
}
