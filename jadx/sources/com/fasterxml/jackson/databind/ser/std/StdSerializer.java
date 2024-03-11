package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9509qt;
import o.AbstractC9519rC;
import o.C9537rU;
import o.InterfaceC9476qM;
import o.InterfaceC9478qO;
import o.InterfaceC9482qS;
import o.InterfaceC9483qT;
import o.InterfaceC9484qU;
import o.InterfaceC9487qX;
import o.InterfaceC9535rS;
import o.InterfaceC9567ry;

/* loaded from: classes5.dex */
public abstract class StdSerializer<T> extends AbstractC9453pq<T> implements InterfaceC9487qX, Serializable {
    private static final Object d = new Object();
    private static final long serialVersionUID = 1;
    public final Class<T> q;

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean b(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    @Override // o.AbstractC9453pq
    public Class<T> c() {
        return this.q;
    }

    @Override // o.AbstractC9453pq
    public abstract void e(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw);

    public StdSerializer(Class<T> cls) {
        this.q = cls;
    }

    public StdSerializer(JavaType javaType) {
        this.q = (Class<T>) javaType.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StdSerializer(Class<?> cls, boolean z) {
        this.q = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public StdSerializer(StdSerializer<?> stdSerializer) {
        this.q = (Class<T>) stdSerializer.q;
    }

    @Override // o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        interfaceC9478qO.a(javaType);
    }

    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return e("string");
    }

    public AbstractC9454pr a(AbstractC9459pw abstractC9459pw, Type type, boolean z) {
        ObjectNode objectNode = (ObjectNode) b(abstractC9459pw, type);
        if (!z) {
            objectNode.c("required", !z);
        }
        return objectNode;
    }

    public ObjectNode e(String str) {
        ObjectNode a = JsonNodeFactory.a.a();
        a.c("type", str);
        return a;
    }

    public ObjectNode d(String str, boolean z) {
        ObjectNode e = e(str);
        if (!z) {
            e.c("required", !z);
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        interfaceC9478qO.g(javaType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(InterfaceC9478qO interfaceC9478qO, JavaType javaType, JsonValueFormat jsonValueFormat) {
        InterfaceC9484qU g = interfaceC9478qO.g(javaType);
        if (g != null) {
            g.b(jsonValueFormat);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(InterfaceC9478qO interfaceC9478qO, JavaType javaType, JsonParser.NumberType numberType) {
        InterfaceC9483qT e = interfaceC9478qO.e(javaType);
        if (b(e, numberType)) {
            e.e(numberType);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(InterfaceC9478qO interfaceC9478qO, JavaType javaType, JsonParser.NumberType numberType, JsonValueFormat jsonValueFormat) {
        InterfaceC9483qT e = interfaceC9478qO.e(javaType);
        if (e != null) {
            if (numberType != null) {
                e.e(numberType);
            }
            if (jsonValueFormat != null) {
                e.b(jsonValueFormat);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType, JsonParser.NumberType numberType) {
        InterfaceC9482qS j = interfaceC9478qO.j(javaType);
        if (j != null) {
            j.b(numberType);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType, AbstractC9453pq<?> abstractC9453pq, JavaType javaType2) {
        InterfaceC9476qM b = interfaceC9478qO.b(javaType);
        if (b(b, abstractC9453pq)) {
            b.d(abstractC9453pq, javaType2);
        }
    }

    public void e(InterfaceC9478qO interfaceC9478qO, JavaType javaType, JsonFormatTypes jsonFormatTypes) {
        InterfaceC9476qM b = interfaceC9478qO.b(javaType);
        if (b != null) {
            b.d(jsonFormatTypes);
        }
    }

    public void d(AbstractC9459pw abstractC9459pw, Throwable th, Object obj, String str) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C9537rU.b(th);
        boolean z = abstractC9459pw == null || abstractC9459pw.d(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonMappingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            C9537rU.h(th);
        }
        throw JsonMappingException.d(th, obj, str);
    }

    public void d(AbstractC9459pw abstractC9459pw, Throwable th, Object obj, int i) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C9537rU.b(th);
        boolean z = abstractC9459pw == null || abstractC9459pw.d(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonMappingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            C9537rU.h(th);
        }
        throw JsonMappingException.d(th, obj, i);
    }

    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty, AbstractC9453pq<?> abstractC9453pq) {
        Object obj = d;
        Map map = (Map) abstractC9459pw.e(obj);
        if (map != null) {
            if (map.get(beanProperty) != null) {
                return abstractC9453pq;
            }
        } else {
            map = new IdentityHashMap();
            abstractC9459pw.e(obj, map);
        }
        map.put(beanProperty, Boolean.TRUE);
        try {
            AbstractC9453pq<?> d2 = d(abstractC9459pw, beanProperty, abstractC9453pq);
            return d2 != null ? abstractC9459pw.a(d2, beanProperty) : abstractC9453pq;
        } finally {
            map.remove(beanProperty);
        }
    }

    @Deprecated
    protected AbstractC9453pq<?> d(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty, AbstractC9453pq<?> abstractC9453pq) {
        AnnotatedMember e;
        Object h;
        AnnotationIntrospector g = abstractC9459pw.g();
        if (!b(g, beanProperty) || (e = beanProperty.e()) == null || (h = g.h(e)) == null) {
            return abstractC9453pq;
        }
        InterfaceC9535rS<Object, Object> b = abstractC9459pw.b(beanProperty.e(), h);
        JavaType a = b.a(abstractC9459pw.e());
        if (abstractC9453pq == null && !a.D()) {
            abstractC9453pq = abstractC9459pw.e(a);
        }
        return new StdDelegatingSerializer(b, a, abstractC9453pq);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC9567ry c(AbstractC9459pw abstractC9459pw, Object obj, Object obj2) {
        AbstractC9519rC f = abstractC9459pw.f();
        if (f == null) {
            Class<T> c = c();
            abstractC9459pw.c((Class<?>) c, "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        }
        return f.e(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JsonFormat.Value c(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.d(abstractC9459pw.c(), cls);
        }
        return abstractC9459pw.b(cls);
    }

    public Boolean d(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value c = c(abstractC9459pw, beanProperty, cls);
        if (c != null) {
            return c.d(feature);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9453pq<?> d(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        Object a;
        if (beanProperty != null) {
            AnnotatedMember e = beanProperty.e();
            AnnotationIntrospector g = abstractC9459pw.g();
            if (e == null || (a = g.a((AbstractC9509qt) e)) == null) {
                return null;
            }
            return abstractC9459pw.a(e, a);
        }
        return null;
    }

    public boolean e(AbstractC9453pq<?> abstractC9453pq) {
        return C9537rU.b(abstractC9453pq);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean d(Collection<?> collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }
}
