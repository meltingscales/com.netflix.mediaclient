package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* renamed from: o.pO  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9425pO {
    public static final Object c = new Object();

    public Object a(DeserializationContext deserializationContext, Class<?> cls, Number number, String str) {
        return c;
    }

    public Object a(DeserializationContext deserializationContext, Class<?> cls, String str, String str2) {
        return c;
    }

    public boolean a(DeserializationContext deserializationContext, JsonParser jsonParser, AbstractC9452pp<?> abstractC9452pp, Object obj, String str) {
        return false;
    }

    @Deprecated
    public Object b(DeserializationContext deserializationContext, Class<?> cls, JsonParser jsonParser, String str) {
        return c;
    }

    public JavaType c(DeserializationContext deserializationContext, JavaType javaType, String str, InterfaceC9545rc interfaceC9545rc, String str2) {
        return null;
    }

    public JavaType c(DeserializationContext deserializationContext, JavaType javaType, InterfaceC9545rc interfaceC9545rc, String str) {
        return null;
    }

    public Object c(DeserializationContext deserializationContext, Class<?> cls, Object obj, Throwable th) {
        return c;
    }

    public Object d(DeserializationContext deserializationContext, JavaType javaType, Object obj, JsonParser jsonParser) {
        return c;
    }

    @Deprecated
    public Object d(DeserializationContext deserializationContext, Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str) {
        return c;
    }

    public Object d(DeserializationContext deserializationContext, Class<?> cls, String str, String str2) {
        return c;
    }

    public Object c(DeserializationContext deserializationContext, JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str) {
        return d(deserializationContext, javaType.h(), jsonToken, jsonParser, str);
    }

    public Object b(DeserializationContext deserializationContext, Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str) {
        return b(deserializationContext, cls, jsonParser, str);
    }
}
