package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9537rU;
import o.InterfaceC9545rc;

/* loaded from: classes5.dex */
public abstract class TypeDeserializerBase extends AbstractC9543ra implements Serializable {
    private static final long serialVersionUID = 1;
    protected final JavaType a;
    protected AbstractC9452pp<Object> b;
    protected final JavaType c;
    protected final Map<String, AbstractC9452pp<Object>> e;
    protected final BeanProperty f;
    protected final boolean g;
    protected final InterfaceC9545rc i;
    protected final String j;

    @Override // o.AbstractC9543ra
    public final String b() {
        return this.j;
    }

    @Override // o.AbstractC9543ra
    public InterfaceC9545rc d() {
        return this.i;
    }

    public JavaType j() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TypeDeserializerBase(JavaType javaType, InterfaceC9545rc interfaceC9545rc, String str, boolean z, JavaType javaType2) {
        this.a = javaType;
        this.i = interfaceC9545rc;
        this.j = C9537rU.a(str);
        this.g = z;
        this.e = new ConcurrentHashMap(16, 0.75f, 2);
        this.c = javaType2;
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this.a = typeDeserializerBase.a;
        this.i = typeDeserializerBase.i;
        this.j = typeDeserializerBase.j;
        this.g = typeDeserializerBase.g;
        this.e = typeDeserializerBase.e;
        this.c = typeDeserializerBase.c;
        this.b = typeDeserializerBase.b;
        this.f = beanProperty;
    }

    public String g() {
        return this.a.h().getName();
    }

    @Override // o.AbstractC9543ra
    public Class<?> a() {
        return C9537rU.d(this.c);
    }

    public String toString() {
        return '[' + getClass().getName() + "; base-type:" + this.a + "; id-resolver: " + this.i + ']';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC9452pp<Object> a(DeserializationContext deserializationContext, String str) {
        AbstractC9452pp<Object> c;
        AbstractC9452pp<Object> abstractC9452pp = this.e.get(str);
        if (abstractC9452pp == null) {
            JavaType e = this.i.e(deserializationContext, str);
            if (e == null) {
                abstractC9452pp = c(deserializationContext);
                if (abstractC9452pp == null) {
                    JavaType b = b(deserializationContext, str);
                    if (b == null) {
                        return NullifyingDeserializer.a;
                    }
                    c = deserializationContext.c(b, this.f);
                }
                this.e.put(str, abstractC9452pp);
            } else {
                JavaType javaType = this.a;
                if (javaType != null && javaType.getClass() == e.getClass() && !e.t()) {
                    e = deserializationContext.e().d(this.a, e.h());
                }
                c = deserializationContext.c(e, this.f);
            }
            abstractC9452pp = c;
            this.e.put(str, abstractC9452pp);
        }
        return abstractC9452pp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC9452pp<Object> c(DeserializationContext deserializationContext) {
        AbstractC9452pp<Object> abstractC9452pp;
        JavaType javaType = this.c;
        if (javaType == null) {
            if (deserializationContext.d(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return NullifyingDeserializer.a;
        } else if (C9537rU.l(javaType.h())) {
            return NullifyingDeserializer.a;
        } else {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = deserializationContext.c(this.c, this.f);
                }
                abstractC9452pp = this.b;
            }
            return abstractC9452pp;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        AbstractC9452pp<Object> a;
        if (obj == null) {
            a = c(deserializationContext);
            if (a == null) {
                return deserializationContext.e(j(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
            }
        } else {
            a = a(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return a.b(jsonParser, deserializationContext);
    }

    protected JavaType b(DeserializationContext deserializationContext, String str) {
        String str2;
        String a = this.i.a();
        if (a == null) {
            str2 = "type ids are not statically known";
        } else {
            str2 = "known type ids = " + a;
        }
        BeanProperty beanProperty = this.f;
        if (beanProperty != null) {
            str2 = String.format("%s (for POJO property '%s')", str2, beanProperty.a());
        }
        return deserializationContext.b(this.a, str, this.i, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JavaType d(DeserializationContext deserializationContext, String str) {
        return deserializationContext.e(this.a, this.i, str);
    }
}
