package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.AbstractC9445pi;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.C9537rU;
import o.InterfaceC9426pP;

/* loaded from: classes5.dex */
public class StdKeyDeserializers implements InterfaceC9426pP, Serializable {
    private static final long serialVersionUID = 1;

    public static AbstractC9450pn e(EnumResolver enumResolver) {
        return new StdKeyDeserializer.EnumKD(enumResolver, null);
    }

    public static AbstractC9450pn e(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new StdKeyDeserializer.EnumKD(enumResolver, annotatedMethod);
    }

    public static AbstractC9450pn d(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC9452pp<?> abstractC9452pp) {
        return new StdKeyDeserializer.DelegatingKD(javaType.h(), abstractC9452pp);
    }

    public static AbstractC9450pn c(DeserializationConfig deserializationConfig, JavaType javaType) {
        AbstractC9445pi a = deserializationConfig.a(javaType);
        Constructor<?> a2 = a.a(String.class);
        if (a2 != null) {
            if (deserializationConfig.f()) {
                C9537rU.b(a2, deserializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.StringCtorKeyDeserializer(a2);
        }
        Method b = a.b(String.class);
        if (b != null) {
            if (deserializationConfig.f()) {
                C9537rU.b(b, deserializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.StringFactoryKeyDeserializer(b);
        }
        return null;
    }

    @Override // o.InterfaceC9426pP
    public AbstractC9450pn d(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi) {
        Class<?> h = javaType.h();
        if (h.isPrimitive()) {
            h = C9537rU.w(h);
        }
        return StdKeyDeserializer.b(h);
    }
}
