package o;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.pw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9459pw extends AbstractC9446pj {
    public static final AbstractC9453pq<Object> c = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final AbstractC9453pq<Object> e = new UnknownSerializer();
    protected transient ContextAttributes a;
    public final SerializationConfig b;
    protected DateFormat d;
    protected final C9524rH f;
    protected AbstractC9453pq<Object> g;
    protected final Class<?> h;
    protected AbstractC9453pq<Object> i;
    protected AbstractC9453pq<Object> j;
    protected final C9568rz k;
    protected final AbstractC9521rE l;
    protected AbstractC9453pq<Object> n;

    /* renamed from: o  reason: collision with root package name */
    protected final boolean f13896o;

    public final Class<?> a() {
        return this.h;
    }

    public abstract AbstractC9453pq<Object> a(AbstractC9509qt abstractC9509qt, Object obj);

    public abstract boolean a(Object obj);

    public AbstractC9453pq<Object> c(BeanProperty beanProperty) {
        return this.i;
    }

    public AbstractC9453pq<Object> c(JavaType javaType, BeanProperty beanProperty) {
        return this.j;
    }

    public abstract C9529rM c(Object obj, ObjectIdGenerator<?> objectIdGenerator);

    public abstract Object e(AbstractC9465qB abstractC9465qB, Class<?> cls);

    @Override // o.AbstractC9446pj
    /* renamed from: h */
    public final SerializationConfig c() {
        return this.b;
    }

    public AbstractC9453pq<Object> i() {
        return this.i;
    }

    public JsonGenerator j() {
        return null;
    }

    public AbstractC9459pw() {
        this.n = e;
        this.i = NullSerializer.b;
        this.j = c;
        this.b = null;
        this.l = null;
        this.k = new C9568rz();
        this.f = null;
        this.h = null;
        this.a = null;
        this.f13896o = true;
    }

    public AbstractC9459pw(AbstractC9459pw abstractC9459pw, SerializationConfig serializationConfig, AbstractC9521rE abstractC9521rE) {
        this.n = e;
        this.i = NullSerializer.b;
        AbstractC9453pq<Object> abstractC9453pq = c;
        this.j = abstractC9453pq;
        this.l = abstractC9521rE;
        this.b = serializationConfig;
        C9568rz c9568rz = abstractC9459pw.k;
        this.k = c9568rz;
        this.n = abstractC9459pw.n;
        this.g = abstractC9459pw.g;
        AbstractC9453pq<Object> abstractC9453pq2 = abstractC9459pw.i;
        this.i = abstractC9453pq2;
        this.j = abstractC9459pw.j;
        this.f13896o = abstractC9453pq2 == abstractC9453pq;
        this.h = serializationConfig.y();
        this.a = serializationConfig.v();
        this.f = c9568rz.a();
    }

    public AbstractC9459pw(AbstractC9459pw abstractC9459pw) {
        this.n = e;
        this.i = NullSerializer.b;
        this.j = c;
        this.b = null;
        this.h = null;
        this.l = null;
        this.f = null;
        this.k = new C9568rz();
        this.n = abstractC9459pw.n;
        this.g = abstractC9459pw.g;
        this.i = abstractC9459pw.i;
        this.j = abstractC9459pw.j;
        this.f13896o = abstractC9459pw.f13896o;
    }

    public final AnnotationIntrospector g() {
        return this.b.h();
    }

    @Override // o.AbstractC9446pj
    public final TypeFactory e() {
        return this.b.t();
    }

    public final boolean b() {
        return this.b.f();
    }

    public final boolean a(MapperFeature mapperFeature) {
        return this.b.a(mapperFeature);
    }

    public final JsonFormat.Value b(Class<?> cls) {
        return this.b.h(cls);
    }

    public Locale n() {
        return this.b.o();
    }

    public TimeZone l() {
        return this.b.s();
    }

    public Object e(Object obj) {
        return this.a.c(obj);
    }

    public AbstractC9459pw e(Object obj, Object obj2) {
        this.a = this.a.a(obj, obj2);
        return this;
    }

    public final boolean d(SerializationFeature serializationFeature) {
        return this.b.c(serializationFeature);
    }

    public final AbstractC9519rC f() {
        return this.b.d();
    }

    public AbstractC9453pq<Object> d(Class<?> cls, BeanProperty beanProperty) {
        AbstractC9453pq<Object> e2 = this.f.e(cls);
        if (e2 == null && (e2 = this.k.a(cls)) == null && (e2 = this.k.c(this.b.b(cls))) == null && (e2 = e(cls)) == null) {
            return a(cls);
        }
        return a(e2, beanProperty);
    }

    public AbstractC9453pq<Object> d(JavaType javaType, BeanProperty beanProperty) {
        if (javaType == null) {
            b("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        AbstractC9453pq<Object> e2 = this.f.e(javaType);
        if (e2 == null && (e2 = this.k.c(javaType)) == null && (e2 = d(javaType)) == null) {
            return a(javaType.h());
        }
        return a(e2, beanProperty);
    }

    public AbstractC9453pq<Object> d(Class<?> cls) {
        AbstractC9453pq<Object> e2 = this.f.e(cls);
        if (e2 == null) {
            AbstractC9453pq<Object> a = this.k.a(cls);
            if (a == null) {
                AbstractC9453pq<Object> c2 = this.k.c(this.b.b(cls));
                if (c2 == null) {
                    AbstractC9453pq<Object> e3 = e(cls);
                    return e3 == null ? a(cls) : e3;
                }
                return c2;
            }
            return a;
        }
        return e2;
    }

    public AbstractC9453pq<Object> e(JavaType javaType) {
        AbstractC9453pq<Object> e2 = this.f.e(javaType);
        if (e2 == null) {
            AbstractC9453pq<Object> c2 = this.k.c(javaType);
            if (c2 == null) {
                AbstractC9453pq<Object> d = d(javaType);
                return d == null ? a(javaType.h()) : d;
            }
            return c2;
        }
        return e2;
    }

    public AbstractC9453pq<Object> b(JavaType javaType, BeanProperty beanProperty) {
        AbstractC9453pq<Object> e2 = this.f.e(javaType);
        if (e2 == null && (e2 = this.k.c(javaType)) == null && (e2 = d(javaType)) == null) {
            return a(javaType.h());
        }
        return d(e2, beanProperty);
    }

    public AbstractC9453pq<Object> a(Class<?> cls, BeanProperty beanProperty) {
        AbstractC9453pq<Object> e2 = this.f.e(cls);
        if (e2 == null && (e2 = this.k.a(cls)) == null && (e2 = this.k.c(this.b.b(cls))) == null && (e2 = e(cls)) == null) {
            return a(cls);
        }
        return d(e2, beanProperty);
    }

    public AbstractC9453pq<Object> d(Class<?> cls, boolean z, BeanProperty beanProperty) {
        AbstractC9453pq<Object> d = this.f.d(cls);
        if (d != null) {
            return d;
        }
        AbstractC9453pq<Object> b = this.k.b(cls);
        if (b != null) {
            return b;
        }
        AbstractC9453pq<Object> d2 = d(cls, beanProperty);
        AbstractC9521rE abstractC9521rE = this.l;
        SerializationConfig serializationConfig = this.b;
        AbstractC9544rb b2 = abstractC9521rE.b(serializationConfig, serializationConfig.b(cls));
        if (b2 != null) {
            d2 = new C9528rL(b2.b(beanProperty), d2);
        }
        if (z) {
            this.k.e(cls, d2);
        }
        return d2;
    }

    public AbstractC9453pq<Object> b(JavaType javaType, boolean z, BeanProperty beanProperty) {
        AbstractC9453pq<Object> d = this.f.d(javaType);
        if (d != null) {
            return d;
        }
        AbstractC9453pq<Object> e2 = this.k.e(javaType);
        if (e2 != null) {
            return e2;
        }
        AbstractC9453pq<Object> d2 = d(javaType, beanProperty);
        AbstractC9544rb b = this.l.b(this.b, javaType);
        if (b != null) {
            d2 = new C9528rL(b.b(beanProperty), d2);
        }
        if (z) {
            this.k.d(javaType, d2);
        }
        return d2;
    }

    public AbstractC9544rb c(JavaType javaType) {
        return this.l.b(this.b, javaType);
    }

    public AbstractC9453pq<Object> a(JavaType javaType, BeanProperty beanProperty) {
        return b(this.l.a(this.b, javaType, this.g), beanProperty);
    }

    public AbstractC9453pq<Object> e(Class<?> cls, BeanProperty beanProperty) {
        return a(this.b.b(cls), beanProperty);
    }

    public AbstractC9453pq<Object> a(Class<?> cls) {
        return cls == Object.class ? this.n : new UnknownSerializer(cls);
    }

    public boolean d(AbstractC9453pq<?> abstractC9453pq) {
        if (abstractC9453pq == this.n || abstractC9453pq == null) {
            return true;
        }
        return d(SerializationFeature.FAIL_ON_EMPTY_BEANS) && abstractC9453pq.getClass() == UnknownSerializer.class;
    }

    public AbstractC9453pq<?> d(AbstractC9453pq<?> abstractC9453pq, BeanProperty beanProperty) {
        return (abstractC9453pq == null || !(abstractC9453pq instanceof InterfaceC9562rt)) ? abstractC9453pq : ((InterfaceC9562rt) abstractC9453pq).e(this, beanProperty);
    }

    public AbstractC9453pq<?> a(AbstractC9453pq<?> abstractC9453pq, BeanProperty beanProperty) {
        return (abstractC9453pq == null || !(abstractC9453pq instanceof InterfaceC9562rt)) ? abstractC9453pq : ((InterfaceC9562rt) abstractC9453pq).e(this, beanProperty);
    }

    public final void b(Object obj, JsonGenerator jsonGenerator) {
        if (obj != null) {
            d(obj.getClass(), true, (BeanProperty) null).e(obj, jsonGenerator, this);
        } else if (this.f13896o) {
            jsonGenerator.k();
        } else {
            this.i.e(null, jsonGenerator, this);
        }
    }

    public final void a(Date date, JsonGenerator jsonGenerator) {
        if (d(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.b(date.getTime());
        } else {
            jsonGenerator.i(d().format(date));
        }
    }

    public void b(long j, JsonGenerator jsonGenerator) {
        if (d(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.a(String.valueOf(j));
        } else {
            jsonGenerator.a(d().format(new Date(j)));
        }
    }

    public void d(Date date, JsonGenerator jsonGenerator) {
        if (d(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.a(String.valueOf(date.getTime()));
        } else {
            jsonGenerator.a(d().format(date));
        }
    }

    public final void a(JsonGenerator jsonGenerator) {
        if (this.f13896o) {
            jsonGenerator.k();
        } else {
            this.i.e(null, jsonGenerator, this);
        }
    }

    public void b(String str, Object... objArr) {
        throw e(str, objArr);
    }

    public <T> T a(AbstractC9445pi abstractC9445pi, String str, Object... objArr) {
        throw InvalidDefinitionException.e(j(), String.format("Invalid type definition for type %s: %s", abstractC9445pi != null ? C9537rU.u(abstractC9445pi.o()) : "N/A", c(str, objArr)), abstractC9445pi, null);
    }

    public <T> T d(AbstractC9445pi abstractC9445pi, AbstractC9465qB abstractC9465qB, String str, Object... objArr) {
        throw InvalidDefinitionException.e(j(), String.format("Invalid definition for property %s (of type %s): %s", abstractC9465qB != null ? b(abstractC9465qB.a()) : "N/A", abstractC9445pi != null ? C9537rU.u(abstractC9445pi.o()) : "N/A", c(str, objArr)), abstractC9445pi, abstractC9465qB);
    }

    @Override // o.AbstractC9446pj
    public <T> T c(JavaType javaType, String str) {
        throw InvalidDefinitionException.c(j(), str, javaType);
    }

    public <T> T e(Class<?> cls, String str, Throwable th) {
        InvalidDefinitionException c2 = InvalidDefinitionException.c(j(), str, c((Type) cls));
        c2.initCause(th);
        throw c2;
    }

    public void d(Throwable th, String str, Object... objArr) {
        throw JsonMappingException.a(j(), c(str, objArr), th);
    }

    @Override // o.AbstractC9446pj
    public JsonMappingException c(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.e(null, b(String.format("Could not resolve type id '%s' as a subtype of %s", str, C9537rU.e(javaType)), str2), javaType, str);
    }

    @Deprecated
    public JsonMappingException e(String str, Object... objArr) {
        return JsonMappingException.a(j(), c(str, objArr));
    }

    public void c(Object obj, JavaType javaType) {
        if (javaType.C() && C9537rU.w(javaType.h()).isAssignableFrom(obj.getClass())) {
            return;
        }
        c(javaType, String.format("Incompatible types: declared root type (%s) vs %s", javaType, C9537rU.d(obj)));
    }

    public AbstractC9453pq<Object> c(Class<?> cls) {
        AbstractC9453pq<Object> e2 = this.f.e(cls);
        if (e2 == null && (e2 = this.k.a(cls)) == null) {
            e2 = e(cls);
        }
        if (d(e2)) {
            return null;
        }
        return e2;
    }

    protected AbstractC9453pq<Object> e(Class<?> cls) {
        AbstractC9453pq<Object> abstractC9453pq;
        JavaType b = this.b.b(cls);
        try {
            abstractC9453pq = a(b);
        } catch (IllegalArgumentException e2) {
            d(e2, C9537rU.d((Throwable) e2), new Object[0]);
            abstractC9453pq = null;
        }
        if (abstractC9453pq != null) {
            this.k.a(cls, b, abstractC9453pq, this);
        }
        return abstractC9453pq;
    }

    protected AbstractC9453pq<Object> d(JavaType javaType) {
        AbstractC9453pq<Object> abstractC9453pq;
        try {
            abstractC9453pq = a(javaType);
        } catch (IllegalArgumentException e2) {
            d(e2, C9537rU.d((Throwable) e2), new Object[0]);
            abstractC9453pq = null;
        }
        if (abstractC9453pq != null) {
            this.k.a(javaType, abstractC9453pq, this);
        }
        return abstractC9453pq;
    }

    protected AbstractC9453pq<Object> a(JavaType javaType) {
        AbstractC9453pq<Object> e2;
        synchronized (this.k) {
            e2 = this.l.e(this, javaType);
        }
        return e2;
    }

    protected AbstractC9453pq<Object> b(AbstractC9453pq<?> abstractC9453pq, BeanProperty beanProperty) {
        if (abstractC9453pq instanceof InterfaceC9517rA) {
            ((InterfaceC9517rA) abstractC9453pq).a(this);
        }
        return a(abstractC9453pq, beanProperty);
    }

    public AbstractC9453pq<Object> e(AbstractC9453pq<?> abstractC9453pq) {
        if (abstractC9453pq instanceof InterfaceC9517rA) {
            ((InterfaceC9517rA) abstractC9453pq).a(this);
        }
        return abstractC9453pq;
    }

    protected final DateFormat d() {
        DateFormat dateFormat = this.d;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.b.m().clone();
        this.d = dateFormat2;
        return dateFormat2;
    }
}
