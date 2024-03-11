package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC9415pE;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9465qB;
import o.AbstractC9509qt;
import o.AbstractC9521rE;
import o.AbstractC9544rb;
import o.C9488qY;
import o.C9529rM;
import o.C9537rU;
import o.InterfaceC9478qO;
import o.InterfaceC9487qX;

/* loaded from: classes5.dex */
public abstract class DefaultSerializerProvider extends AbstractC9459pw implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient JsonGenerator m;
    protected transient ArrayList<ObjectIdGenerator<?>> q;
    protected transient Map<Object, C9529rM> t;

    public abstract DefaultSerializerProvider c(SerializationConfig serializationConfig, AbstractC9521rE abstractC9521rE);

    @Override // o.AbstractC9459pw
    public JsonGenerator j() {
        return this.m;
    }

    protected DefaultSerializerProvider() {
    }

    protected DefaultSerializerProvider(AbstractC9459pw abstractC9459pw, SerializationConfig serializationConfig, AbstractC9521rE abstractC9521rE) {
        super(abstractC9459pw, serializationConfig, abstractC9521rE);
    }

    protected DefaultSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        super(defaultSerializerProvider);
    }

    public DefaultSerializerProvider k() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    @Override // o.AbstractC9459pw
    public AbstractC9453pq<Object> a(AbstractC9509qt abstractC9509qt, Object obj) {
        AbstractC9453pq<?> abstractC9453pq;
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC9453pq) {
            abstractC9453pq = (AbstractC9453pq) obj;
        } else {
            if (!(obj instanceof Class)) {
                JavaType a = abstractC9509qt.a();
                c(a, "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == AbstractC9453pq.d.class || C9537rU.l(cls)) {
                return null;
            }
            if (!AbstractC9453pq.class.isAssignableFrom(cls)) {
                JavaType a2 = abstractC9509qt.a();
                c(a2, "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
            }
            AbstractC9415pE n = this.b.n();
            AbstractC9453pq<?> c = n != null ? n.c(this.b, abstractC9509qt, cls) : null;
            abstractC9453pq = c == null ? (AbstractC9453pq) C9537rU.b(cls, this.b.f()) : c;
        }
        return e(abstractC9453pq);
    }

    @Override // o.AbstractC9459pw
    public Object e(AbstractC9465qB abstractC9465qB, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        AbstractC9415pE n = this.b.n();
        Object d = n != null ? n.d(this.b, abstractC9465qB, cls) : null;
        return d == null ? C9537rU.b(cls, this.b.f()) : d;
    }

    @Override // o.AbstractC9459pw
    public boolean a(Object obj) {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Throwable th) {
            e(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), th.getClass().getName(), C9537rU.d(th)), th);
            return false;
        }
    }

    @Override // o.AbstractC9459pw
    public C9529rM c(Object obj, ObjectIdGenerator<?> objectIdGenerator) {
        ObjectIdGenerator<?> objectIdGenerator2;
        Map<Object, C9529rM> map = this.t;
        if (map == null) {
            this.t = o();
        } else {
            C9529rM c9529rM = map.get(obj);
            if (c9529rM != null) {
                return c9529rM;
            }
        }
        ArrayList<ObjectIdGenerator<?>> arrayList = this.q;
        if (arrayList == null) {
            this.q = new ArrayList<>(8);
        } else {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                objectIdGenerator2 = this.q.get(i);
                if (objectIdGenerator2.e(objectIdGenerator)) {
                    break;
                }
            }
        }
        objectIdGenerator2 = null;
        if (objectIdGenerator2 == null) {
            objectIdGenerator2 = objectIdGenerator.d(this);
            this.q.add(objectIdGenerator2);
        }
        C9529rM c9529rM2 = new C9529rM(objectIdGenerator2);
        this.t.put(obj, c9529rM2);
        return c9529rM2;
    }

    protected Map<Object, C9529rM> o() {
        if (d(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID)) {
            return new HashMap();
        }
        return new IdentityHashMap();
    }

    public boolean c(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        if (cls != Object.class || this.b.c(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            try {
                return c(cls) != null;
            } catch (JsonMappingException e) {
                if (atomicReference != null) {
                    atomicReference.set(e);
                }
                return false;
            } catch (RuntimeException e2) {
                if (atomicReference == null) {
                    throw e2;
                }
                atomicReference.set(e2);
                return false;
            }
        }
        return true;
    }

    public void d(JsonGenerator jsonGenerator, Object obj) {
        this.m = jsonGenerator;
        if (obj == null) {
            b(jsonGenerator);
            return;
        }
        Class<?> cls = obj.getClass();
        AbstractC9453pq<Object> d = d(cls, true, (BeanProperty) null);
        PropertyName A = this.b.A();
        if (A == null) {
            if (this.b.c(SerializationFeature.WRAP_ROOT_VALUE)) {
                e(jsonGenerator, obj, d, this.b.f(cls));
                return;
            }
        } else if (!A.e()) {
            e(jsonGenerator, obj, d, A);
            return;
        }
        b(jsonGenerator, obj, d);
    }

    public void b(JsonGenerator jsonGenerator, Object obj, JavaType javaType) {
        this.m = jsonGenerator;
        if (obj == null) {
            b(jsonGenerator);
            return;
        }
        if (!javaType.h().isAssignableFrom(obj.getClass())) {
            c(obj, javaType);
        }
        AbstractC9453pq<Object> b = b(javaType, true, (BeanProperty) null);
        PropertyName A = this.b.A();
        if (A == null) {
            if (this.b.c(SerializationFeature.WRAP_ROOT_VALUE)) {
                e(jsonGenerator, obj, b, this.b.i(javaType));
                return;
            }
        } else if (!A.e()) {
            e(jsonGenerator, obj, b, A);
            return;
        }
        b(jsonGenerator, obj, b);
    }

    public void e(JsonGenerator jsonGenerator, Object obj, JavaType javaType, AbstractC9453pq<Object> abstractC9453pq) {
        PropertyName i;
        this.m = jsonGenerator;
        if (obj == null) {
            b(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.h().isAssignableFrom(obj.getClass())) {
            c(obj, javaType);
        }
        if (abstractC9453pq == null) {
            abstractC9453pq = b(javaType, true, (BeanProperty) null);
        }
        PropertyName A = this.b.A();
        if (A == null) {
            if (this.b.c(SerializationFeature.WRAP_ROOT_VALUE)) {
                if (javaType == null) {
                    i = this.b.f(obj.getClass());
                } else {
                    i = this.b.i(javaType);
                }
                e(jsonGenerator, obj, abstractC9453pq, i);
                return;
            }
        } else if (!A.e()) {
            e(jsonGenerator, obj, abstractC9453pq, A);
            return;
        }
        b(jsonGenerator, obj, abstractC9453pq);
    }

    public void d(JsonGenerator jsonGenerator, Object obj, JavaType javaType, AbstractC9453pq<Object> abstractC9453pq, AbstractC9544rb abstractC9544rb) {
        boolean z;
        this.m = jsonGenerator;
        if (obj == null) {
            b(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.h().isAssignableFrom(obj.getClass())) {
            c(obj, javaType);
        }
        if (abstractC9453pq == null) {
            if (javaType != null && javaType.x()) {
                abstractC9453pq = d(javaType, (BeanProperty) null);
            } else {
                abstractC9453pq = d(obj.getClass(), (BeanProperty) null);
            }
        }
        PropertyName A = this.b.A();
        if (A == null) {
            z = this.b.c(SerializationFeature.WRAP_ROOT_VALUE);
            if (z) {
                jsonGenerator.l();
                jsonGenerator.d(this.b.f(obj.getClass()).a(this.b));
            }
        } else if (A.e()) {
            z = false;
        } else {
            jsonGenerator.l();
            jsonGenerator.a(A.c());
            z = true;
        }
        try {
            abstractC9453pq.c(obj, jsonGenerator, this, abstractC9544rb);
            if (z) {
                jsonGenerator.o();
            }
        } catch (Exception e) {
            throw d(jsonGenerator, e);
        }
    }

    private final void e(JsonGenerator jsonGenerator, Object obj, AbstractC9453pq<Object> abstractC9453pq, PropertyName propertyName) {
        try {
            jsonGenerator.l();
            jsonGenerator.d(propertyName.a(this.b));
            abstractC9453pq.e(obj, jsonGenerator, this);
            jsonGenerator.o();
        } catch (Exception e) {
            throw d(jsonGenerator, e);
        }
    }

    private final void b(JsonGenerator jsonGenerator, Object obj, AbstractC9453pq<Object> abstractC9453pq) {
        try {
            abstractC9453pq.e(obj, jsonGenerator, this);
        } catch (Exception e) {
            throw d(jsonGenerator, e);
        }
    }

    protected void b(JsonGenerator jsonGenerator) {
        try {
            i().e(null, jsonGenerator, this);
        } catch (Exception e) {
            throw d(jsonGenerator, e);
        }
    }

    private IOException d(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String d = C9537rU.d((Throwable) exc);
        if (d == null) {
            d = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException(jsonGenerator, d, exc);
    }

    public void b(JavaType javaType, InterfaceC9478qO interfaceC9478qO) {
        if (javaType == null) {
            throw new IllegalArgumentException("A class must be provided");
        }
        interfaceC9478qO.c(this);
        d(javaType, (BeanProperty) null).d(interfaceC9478qO, javaType);
    }

    @Deprecated
    public C9488qY i(Class<?> cls) {
        AbstractC9453pq<Object> d = d(cls, (BeanProperty) null);
        AbstractC9454pr b = d instanceof InterfaceC9487qX ? ((InterfaceC9487qX) d).b(this, null) : C9488qY.e();
        if (!(b instanceof ObjectNode)) {
            throw new IllegalArgumentException("Class " + cls.getName() + " would not be serialized as a JSON object and therefore has no schema");
        }
        return new C9488qY((ObjectNode) b);
    }

    /* loaded from: classes5.dex */
    public static final class Impl extends DefaultSerializerProvider {
        private static final long serialVersionUID = 1;

        public Impl() {
        }

        public Impl(Impl impl) {
            super(impl);
        }

        protected Impl(AbstractC9459pw abstractC9459pw, SerializationConfig serializationConfig, AbstractC9521rE abstractC9521rE) {
            super(abstractC9459pw, serializationConfig, abstractC9521rE);
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public DefaultSerializerProvider k() {
            return new Impl(this);
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        /* renamed from: b */
        public Impl c(SerializationConfig serializationConfig, AbstractC9521rE abstractC9521rE) {
            return new Impl(this, serializationConfig, abstractC9521rE);
        }
    }
}
