package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;

/* loaded from: classes5.dex */
public class IgnoredPropertyException extends PropertyBindingException {
    private static final long serialVersionUID = 1;

    public IgnoredPropertyException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, jsonLocation, cls, str2, collection);
    }

    public static IgnoredPropertyException d(JsonParser jsonParser, Object obj, String str, Collection<Object> collection) {
        Class<?> cls;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        Class<?> cls2 = cls;
        IgnoredPropertyException ignoredPropertyException = new IgnoredPropertyException(jsonParser, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", str, cls2.getName()), jsonParser.k(), cls2, str, collection);
        ignoredPropertyException.e(obj, str);
        return ignoredPropertyException;
    }
}
