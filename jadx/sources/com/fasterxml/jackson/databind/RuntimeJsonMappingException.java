package com.fasterxml.jackson.databind;

/* loaded from: classes5.dex */
public class RuntimeJsonMappingException extends RuntimeException {
    public RuntimeJsonMappingException(JsonMappingException jsonMappingException) {
        super(jsonMappingException);
    }

    public RuntimeJsonMappingException(String str, JsonMappingException jsonMappingException) {
        super(str, jsonMappingException);
    }
}
