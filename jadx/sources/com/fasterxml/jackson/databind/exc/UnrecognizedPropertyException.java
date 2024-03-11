package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;

/* loaded from: classes5.dex */
public class UnrecognizedPropertyException extends PropertyBindingException {
    private static final long serialVersionUID = 1;

    public UnrecognizedPropertyException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, jsonLocation, cls, str2, collection);
    }

    public static UnrecognizedPropertyException b(JsonParser jsonParser, Object obj, String str, Collection<Object> collection) {
        Class<?> cls;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        Class<?> cls2 = cls;
        UnrecognizedPropertyException unrecognizedPropertyException = new UnrecognizedPropertyException(jsonParser, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", str, cls2.getName()), jsonParser.k(), cls2, str, collection);
        unrecognizedPropertyException.e(obj, str);
        return unrecognizedPropertyException;
    }
}
