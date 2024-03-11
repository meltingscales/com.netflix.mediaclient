package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.C9488qY;
import o.C9537rU;
import o.InterfaceC9458pv;
import o.InterfaceC9478qO;
import o.InterfaceC9484qU;
import o.InterfaceC9487qX;
import o.InterfaceC9562rt;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class JsonValueSerializer extends StdSerializer<Object> implements InterfaceC9562rt {
    protected final boolean b;
    protected final AbstractC9453pq<Object> c;
    protected final AnnotatedMember d;
    protected final BeanProperty e;

    private static final Class<Object> d(Class<?> cls) {
        return cls == null ? Object.class : cls;
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, AbstractC9453pq<?> abstractC9453pq) {
        super(annotatedMember.a());
        this.d = annotatedMember;
        this.c = abstractC9453pq;
        this.e = null;
        this.b = true;
    }

    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, AbstractC9453pq<?> abstractC9453pq, boolean z) {
        super(d(jsonValueSerializer.c()));
        this.d = jsonValueSerializer.d;
        this.c = abstractC9453pq;
        this.e = beanProperty;
        this.b = z;
    }

    public JsonValueSerializer b(BeanProperty beanProperty, AbstractC9453pq<?> abstractC9453pq, boolean z) {
        return (this.e == beanProperty && this.c == abstractC9453pq && z == this.b) ? this : new JsonValueSerializer(this, beanProperty, abstractC9453pq, z);
    }

    @Override // o.InterfaceC9562rt
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        AbstractC9453pq<?> abstractC9453pq = this.c;
        if (abstractC9453pq == null) {
            JavaType a = this.d.a();
            if (abstractC9459pw.a(MapperFeature.USE_STATIC_TYPING) || a.v()) {
                AbstractC9453pq<Object> b2 = abstractC9459pw.b(a, beanProperty);
                return b(beanProperty, b2, d(a.h(), b2));
            }
            return this;
        }
        return b(beanProperty, abstractC9459pw.d(abstractC9453pq, beanProperty), this.b);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        try {
            Object d = this.d.d(obj);
            if (d == null) {
                abstractC9459pw.a(jsonGenerator);
                return;
            }
            AbstractC9453pq<Object> abstractC9453pq = this.c;
            if (abstractC9453pq == null) {
                abstractC9453pq = abstractC9459pw.d(d.getClass(), true, this.e);
            }
            abstractC9453pq.e(d, jsonGenerator, abstractC9459pw);
        } catch (Exception e) {
            d(abstractC9459pw, e, obj, this.d.d() + "()");
        }
    }

    @Override // o.AbstractC9453pq
    public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        try {
            Object d = this.d.d(obj);
            if (d == null) {
                abstractC9459pw.a(jsonGenerator);
                return;
            }
            AbstractC9453pq<Object> abstractC9453pq = this.c;
            if (abstractC9453pq == null) {
                abstractC9453pq = abstractC9459pw.d(d.getClass(), this.e);
            } else if (this.b) {
                WritableTypeId b2 = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(obj, JsonToken.VALUE_STRING));
                abstractC9453pq.e(d, jsonGenerator, abstractC9459pw);
                abstractC9544rb.c(jsonGenerator, b2);
                return;
            }
            abstractC9453pq.c(d, jsonGenerator, abstractC9459pw, new b(abstractC9544rb, obj));
        } catch (Exception e) {
            d(abstractC9459pw, e, obj, this.d.d() + "()");
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        AbstractC9453pq<Object> abstractC9453pq = this.c;
        if (abstractC9453pq instanceof InterfaceC9487qX) {
            return ((InterfaceC9487qX) abstractC9453pq).b(abstractC9459pw, null);
        }
        return C9488qY.e();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        JavaType a = this.d.a();
        Class<?> g = this.d.g();
        if (g != null && C9537rU.t(g) && d(interfaceC9478qO, javaType, g)) {
            return;
        }
        AbstractC9453pq<Object> abstractC9453pq = this.c;
        if (abstractC9453pq == null && (abstractC9453pq = interfaceC9478qO.c().b(a, false, this.e)) == null) {
            interfaceC9478qO.a(javaType);
        } else {
            abstractC9453pq.d(interfaceC9478qO, a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected boolean d(InterfaceC9478qO interfaceC9478qO, JavaType javaType, Class<?> cls) {
        Object[] enumConstants;
        InterfaceC9484qU g = interfaceC9478qO.g(javaType);
        if (g != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : cls.getEnumConstants()) {
                try {
                    linkedHashSet.add(String.valueOf(this.d.d(obj)));
                } catch (Exception e) {
                    e = e;
                    while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                        e = e.getCause();
                    }
                    C9537rU.b(e);
                    throw JsonMappingException.d(e, obj, this.d.d() + "()");
                }
            }
            g.e(linkedHashSet);
            return true;
        }
        return true;
    }

    protected boolean d(Class<?> cls, AbstractC9453pq<?> abstractC9453pq) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE && cls != Boolean.TYPE && cls != Double.TYPE) {
                return false;
            }
        } else if (cls != String.class && cls != Integer.class && cls != Boolean.class && cls != Double.class) {
            return false;
        }
        return e(abstractC9453pq);
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this.d.g() + "#" + this.d.d() + ")";
    }

    /* loaded from: classes5.dex */
    static class b extends AbstractC9544rb {
        protected final Object c;
        protected final AbstractC9544rb d;

        public b(AbstractC9544rb abstractC9544rb, Object obj) {
            this.d = abstractC9544rb;
            this.c = obj;
        }

        @Override // o.AbstractC9544rb
        public AbstractC9544rb b(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC9544rb
        public JsonTypeInfo.As a() {
            return this.d.a();
        }

        @Override // o.AbstractC9544rb
        public String d() {
            return this.d.d();
        }

        @Override // o.AbstractC9544rb
        public WritableTypeId b(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
            writableTypeId.b = this.c;
            return this.d.b(jsonGenerator, writableTypeId);
        }

        @Override // o.AbstractC9544rb
        public WritableTypeId c(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
            return this.d.c(jsonGenerator, writableTypeId);
        }
    }
}
