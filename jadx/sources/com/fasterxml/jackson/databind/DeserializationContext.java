package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC9424pN;
import o.AbstractC9425pO;
import o.AbstractC9445pi;
import o.AbstractC9446pj;
import o.AbstractC9447pk;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9465qB;
import o.AbstractC9509qt;
import o.AbstractC9543ra;
import o.C9494qe;
import o.C9530rN;
import o.C9536rT;
import o.C9537rU;
import o.C9589sa;
import o.InterfaceC9317nM;
import o.InterfaceC9420pJ;
import o.InterfaceC9421pK;
import o.InterfaceC9539rW;
import o.InterfaceC9545rc;

/* loaded from: classes5.dex */
public abstract class DeserializationContext extends AbstractC9446pj implements Serializable {
    private static final long serialVersionUID = 1;
    public final DeserializationConfig a;
    protected transient C9530rN b;
    protected transient ContextAttributes c;
    protected final DeserializerCache d;
    protected C9536rT<JavaType> e;
    protected final int f;
    protected final AbstractC9447pk g;
    protected transient DateFormat h;
    protected final AbstractC9424pN i;
    protected transient C9589sa j;
    protected final Class<?> m;

    /* renamed from: o  reason: collision with root package name */
    protected transient JsonParser f13098o;

    public final Class<?> b() {
        return this.m;
    }

    public final boolean b(int i) {
        return (i & this.f) != 0;
    }

    public abstract AbstractC9452pp<Object> d(AbstractC9509qt abstractC9509qt, Object obj);

    public abstract C9494qe d(Object obj, ObjectIdGenerator<?> objectIdGenerator, InterfaceC9317nM interfaceC9317nM);

    public abstract void d();

    public abstract AbstractC9450pn e(AbstractC9509qt abstractC9509qt, Object obj);

    @Override // o.AbstractC9446pj
    /* renamed from: j */
    public DeserializationConfig c() {
        return this.a;
    }

    public final int k() {
        return this.f;
    }

    public final JsonParser m() {
        return this.f13098o;
    }

    public DeserializationContext(AbstractC9424pN abstractC9424pN, DeserializerCache deserializerCache) {
        Objects.requireNonNull(abstractC9424pN, "Cannot pass null DeserializerFactory");
        this.i = abstractC9424pN;
        this.d = deserializerCache == null ? new DeserializerCache() : deserializerCache;
        this.f = 0;
        this.a = null;
        this.g = null;
        this.m = null;
        this.c = null;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, AbstractC9447pk abstractC9447pk) {
        this.d = deserializationContext.d;
        this.i = deserializationContext.i;
        this.a = deserializationConfig;
        this.f = deserializationConfig.c();
        this.m = deserializationConfig.y();
        this.f13098o = jsonParser;
        this.g = abstractC9447pk;
        this.c = deserializationConfig.v();
    }

    public DeserializationContext(DeserializationContext deserializationContext) {
        this.d = new DeserializerCache();
        this.i = deserializationContext.i;
        this.a = deserializationContext.a;
        this.f = deserializationContext.f;
        this.m = deserializationContext.m;
        this.g = null;
    }

    public final boolean a() {
        return this.a.f();
    }

    public final boolean d(MapperFeature mapperFeature) {
        return this.a.a(mapperFeature);
    }

    public final JsonFormat.Value b(Class<?> cls) {
        return this.a.h(cls);
    }

    public final AnnotationIntrospector f() {
        return this.a.h();
    }

    @Override // o.AbstractC9446pj
    public final TypeFactory e() {
        return this.a.t();
    }

    public Locale n() {
        return this.a.o();
    }

    public TimeZone l() {
        return this.a.s();
    }

    public final boolean d(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.d() & this.f) != 0;
    }

    public final Object c(Object obj, BeanProperty beanProperty, Object obj2) {
        if (this.g == null) {
            c(C9537rU.a(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
        }
        return this.g.b(obj, this, beanProperty, obj2);
    }

    public final Base64Variant h() {
        return this.a.i();
    }

    public final JsonNodeFactory o() {
        return this.a.b();
    }

    public boolean e(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        try {
            return this.d.j(this, this.i, javaType);
        } catch (JsonMappingException e) {
            if (atomicReference != null) {
                atomicReference.set(e);
                return false;
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

    public final AbstractC9452pp<Object> c(JavaType javaType, BeanProperty beanProperty) {
        AbstractC9452pp<Object> b = this.d.b(this, this.i, javaType);
        return b != null ? e(b, beanProperty, javaType) : b;
    }

    public final AbstractC9452pp<Object> d(JavaType javaType) {
        return this.d.b(this, this.i, javaType);
    }

    public final AbstractC9452pp<Object> c(JavaType javaType) {
        AbstractC9452pp<Object> b = this.d.b(this, this.i, javaType);
        if (b == null) {
            return null;
        }
        AbstractC9452pp<?> e = e(b, (BeanProperty) null, javaType);
        AbstractC9543ra b2 = this.i.b(this.a, javaType);
        return b2 != null ? new TypeWrappedDeserializer(b2.d(null), e) : e;
    }

    public final AbstractC9450pn e(JavaType javaType, BeanProperty beanProperty) {
        AbstractC9450pn c = this.d.c(this, this.i, javaType);
        return c instanceof InterfaceC9421pK ? ((InterfaceC9421pK) c).b(this, beanProperty) : c;
    }

    public final JavaType a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this.a.b(cls);
    }

    public Class<?> d(String str) {
        return e().d(str);
    }

    public final C9589sa q() {
        C9589sa c9589sa = this.j;
        if (c9589sa == null) {
            return new C9589sa();
        }
        this.j = null;
        return c9589sa;
    }

    public final void b(C9589sa c9589sa) {
        if (this.j == null || c9589sa.c() >= this.j.c()) {
            this.j = c9589sa;
        }
    }

    public final C9530rN i() {
        if (this.b == null) {
            this.b = new C9530rN();
        }
        return this.b;
    }

    public AbstractC9452pp<?> c(AbstractC9452pp<?> abstractC9452pp, BeanProperty beanProperty, JavaType javaType) {
        if (abstractC9452pp instanceof InterfaceC9420pJ) {
            this.e = new C9536rT<>(javaType, this.e);
            try {
                abstractC9452pp = ((InterfaceC9420pJ) abstractC9452pp).c(this, beanProperty);
            } finally {
                this.e = this.e.d();
            }
        }
        return abstractC9452pp;
    }

    public AbstractC9452pp<?> e(AbstractC9452pp<?> abstractC9452pp, BeanProperty beanProperty, JavaType javaType) {
        if (abstractC9452pp instanceof InterfaceC9420pJ) {
            this.e = new C9536rT<>(javaType, this.e);
            try {
                abstractC9452pp = ((InterfaceC9420pJ) abstractC9452pp).c(this, beanProperty);
            } finally {
                this.e = this.e.d();
            }
        }
        return abstractC9452pp;
    }

    public Date e(String str) {
        try {
            return g().parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, C9537rU.d((Throwable) e)));
        }
    }

    public Calendar c(Date date) {
        Calendar calendar = Calendar.getInstance(l());
        calendar.setTime(date);
        return calendar;
    }

    public boolean e(JsonParser jsonParser, AbstractC9452pp<?> abstractC9452pp, Object obj, String str) {
        for (C9536rT<AbstractC9425pO> e = this.a.e(); e != null; e = e.d()) {
            if (e.b().a(this, jsonParser, abstractC9452pp, obj, str)) {
                return true;
            }
        }
        if (!d(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            jsonParser.T();
            return true;
        }
        throw UnrecognizedPropertyException.b(this.f13098o, obj, str, abstractC9452pp == null ? null : abstractC9452pp.d());
    }

    public Object c(Class<?> cls, String str, String str2, Object... objArr) {
        String c = c(str2, objArr);
        for (C9536rT<AbstractC9425pO> e = this.a.e(); e != null; e = e.d()) {
            Object a = e.b().a(this, cls, str, c);
            if (a != AbstractC9425pO.c) {
                if (a == null || cls.isInstance(a)) {
                    return a;
                }
                throw c(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", C9537rU.e((Object) cls), C9537rU.e(a)));
            }
        }
        throw c(cls, str, c);
    }

    public Object b(Class<?> cls, String str, String str2, Object... objArr) {
        String c = c(str2, objArr);
        for (C9536rT<AbstractC9425pO> e = this.a.e(); e != null; e = e.d()) {
            Object d = e.b().d(this, cls, str, c);
            if (d != AbstractC9425pO.c) {
                if (a(cls, d)) {
                    return d;
                }
                throw c(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", C9537rU.e((Object) cls), C9537rU.e(d)));
            }
        }
        throw c(str, cls, c);
    }

    public Object c(Class<?> cls, Number number, String str, Object... objArr) {
        String c = c(str, objArr);
        for (C9536rT<AbstractC9425pO> e = this.a.e(); e != null; e = e.d()) {
            Object a = e.b().a(this, cls, number, c);
            if (a != AbstractC9425pO.c) {
                if (a(cls, a)) {
                    return a;
                }
                throw d(number, cls, c("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", C9537rU.e((Object) cls), C9537rU.e(a)));
            }
        }
        throw d(number, cls, c);
    }

    public Object a(JavaType javaType, Object obj, JsonParser jsonParser) {
        Class<?> h = javaType.h();
        for (C9536rT<AbstractC9425pO> e = this.a.e(); e != null; e = e.d()) {
            Object d = e.b().d(this, javaType, obj, jsonParser);
            if (d != AbstractC9425pO.c) {
                if (d == null || h.isInstance(d)) {
                    return d;
                } else {
                    throw JsonMappingException.d(jsonParser, c("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", C9537rU.e((Object) javaType), C9537rU.e(d)));
                }
            }
        }
        throw b(obj, h);
    }

    public Object c(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) {
        if (jsonParser == null) {
            jsonParser = m();
        }
        String c = c(str, objArr);
        for (C9536rT<AbstractC9425pO> e = this.a.e(); e != null; e = e.d()) {
            Object b = e.b().b(this, cls, valueInstantiator, jsonParser, c);
            if (b != AbstractC9425pO.c) {
                if (a(cls, b)) {
                    return b;
                }
                c(a(cls), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", C9537rU.e((Object) cls), C9537rU.e(b)));
            }
        }
        if (valueInstantiator != null && !valueInstantiator.i()) {
            return c(a(cls), String.format("Cannot construct instance of %s (no Creators, like default construct, exist): %s", C9537rU.u(cls), c));
        }
        return b(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", C9537rU.u(cls), c), new Object[0]);
    }

    public Object d(Class<?> cls, Object obj, Throwable th) {
        for (C9536rT<AbstractC9425pO> e = this.a.e(); e != null; e = e.d()) {
            Object c = e.b().c(this, cls, obj, th);
            if (c != AbstractC9425pO.c) {
                if (a(cls, c)) {
                    return c;
                }
                c(a(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", C9537rU.e((Object) cls), C9537rU.d(c)));
            }
        }
        C9537rU.e(th);
        if (!d(DeserializationFeature.WRAP_EXCEPTIONS)) {
            C9537rU.h(th);
        }
        throw b(cls, th);
    }

    public Object e(Class<?> cls, JsonParser jsonParser) {
        return c(a(cls), jsonParser.o(), jsonParser, (String) null, new Object[0]);
    }

    public Object e(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) {
        return c(a(cls), jsonToken, jsonParser, str, objArr);
    }

    public Object d(JavaType javaType, JsonParser jsonParser) {
        return c(javaType, jsonParser.o(), jsonParser, (String) null, new Object[0]);
    }

    public Object c(JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) {
        String c = c(str, objArr);
        for (C9536rT<AbstractC9425pO> e = this.a.e(); e != null; e = e.d()) {
            Object c2 = e.b().c(this, javaType, jsonToken, jsonParser, c);
            if (c2 != AbstractC9425pO.c) {
                if (a(javaType.h(), c2)) {
                    return c2;
                }
                c(javaType, String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", C9537rU.e((Object) javaType), C9537rU.d(c2)));
            }
        }
        if (c == null) {
            if (jsonToken == null) {
                c = String.format("Unexpected end-of-input when binding data into %s", C9537rU.e(javaType));
            } else {
                c = String.format("Cannot deserialize instance of %s out of %s token", C9537rU.e(javaType), jsonToken);
            }
        }
        e(javaType, c, new Object[0]);
        return null;
    }

    public JavaType b(JavaType javaType, String str, InterfaceC9545rc interfaceC9545rc, String str2) {
        for (C9536rT<AbstractC9425pO> e = this.a.e(); e != null; e = e.d()) {
            JavaType c = e.b().c(this, javaType, str, interfaceC9545rc, str2);
            if (c != null) {
                if (c.d(Void.class)) {
                    return null;
                }
                if (c.e(javaType.h())) {
                    return c;
                }
                throw c(javaType, str, "problem handler tried to resolve into non-subtype: " + C9537rU.e(c));
            }
        }
        if (d(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            throw c(javaType, str, str2);
        }
        return null;
    }

    public JavaType e(JavaType javaType, InterfaceC9545rc interfaceC9545rc, String str) {
        for (C9536rT<AbstractC9425pO> e = this.a.e(); e != null; e = e.d()) {
            JavaType c = e.b().c(this, javaType, interfaceC9545rc, str);
            if (c != null) {
                if (c.d(Void.class)) {
                    return null;
                }
                if (c.e(javaType.h())) {
                    return c;
                }
                throw c(javaType, (String) null, "problem handler tried to resolve into non-subtype: " + C9537rU.e(c));
            }
        }
        throw b(javaType, str);
    }

    public void b(AbstractC9452pp<?> abstractC9452pp) {
        if (d(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        JavaType a = a(abstractC9452pp.c());
        throw InvalidDefinitionException.b(m(), String.format("Invalid configuration: values of type %s cannot be merged", C9537rU.e(a)), a);
    }

    protected boolean a(Class<?> cls, Object obj) {
        return obj == null || cls.isInstance(obj) || (cls.isPrimitive() && C9537rU.w(cls).isInstance(obj));
    }

    public void e(AbstractC9452pp<?> abstractC9452pp, JsonToken jsonToken, String str, Object... objArr) {
        throw d(m(), abstractC9452pp.c(), jsonToken, c(str, objArr));
    }

    public void d(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) {
        throw c(m(), javaType, jsonToken, c(str, objArr));
    }

    public void a(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) {
        throw d(m(), cls, jsonToken, c(str, objArr));
    }

    public <T> T e(ObjectIdReader objectIdReader, Object obj) {
        return (T) a(objectIdReader.d, String.format("No Object Id found for an instance of %s, to assign to property '%s'", C9537rU.d(obj), objectIdReader.b), new Object[0]);
    }

    public <T> T a(AbstractC9452pp<?> abstractC9452pp, String str, Object... objArr) {
        throw MismatchedInputException.a(m(), abstractC9452pp.c(), c(str, objArr));
    }

    public <T> T b(Class<?> cls, String str, Object... objArr) {
        throw MismatchedInputException.a(m(), cls, c(str, objArr));
    }

    public <T> T e(JavaType javaType, String str, Object... objArr) {
        throw MismatchedInputException.d(m(), javaType, c(str, objArr));
    }

    public <T> T a(BeanProperty beanProperty, String str, Object... objArr) {
        AnnotatedMember e;
        MismatchedInputException d = MismatchedInputException.d(m(), beanProperty == null ? null : beanProperty.d(), c(str, objArr));
        if (beanProperty != null && (e = beanProperty.e()) != null) {
            d.e(e.g(), beanProperty.a());
        }
        throw d;
    }

    public <T> T e(Class<?> cls, String str, String str2, Object... objArr) {
        MismatchedInputException a = MismatchedInputException.a(m(), cls, c(str2, objArr));
        if (str != null) {
            a.e(cls, str);
        }
        throw a;
    }

    public <T> T c(JavaType javaType, String str, String str2, Object... objArr) {
        return (T) e(javaType.h(), str, str2, objArr);
    }

    public <T> T c(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) {
        throw MismatchedInputException.a(jsonParser, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", jsonToken, C9537rU.u(cls)));
    }

    public <T> T b(AbstractC9445pi abstractC9445pi, String str, Object... objArr) {
        throw InvalidDefinitionException.d(this.f13098o, String.format("Invalid type definition for type %s: %s", C9537rU.u(abstractC9445pi.o()), c(str, objArr)), abstractC9445pi, null);
    }

    public <T> T d(AbstractC9445pi abstractC9445pi, AbstractC9465qB abstractC9465qB, String str, Object... objArr) {
        throw InvalidDefinitionException.d(this.f13098o, String.format("Invalid definition for property %s (of type %s): %s", C9537rU.a((InterfaceC9539rW) abstractC9465qB), C9537rU.u(abstractC9445pi.o()), c(str, objArr)), abstractC9445pi, abstractC9465qB);
    }

    @Override // o.AbstractC9446pj
    public <T> T c(JavaType javaType, String str) {
        throw InvalidDefinitionException.b(this.f13098o, str, javaType);
    }

    public JsonMappingException c(JsonParser jsonParser, JavaType javaType, JsonToken jsonToken, String str) {
        return MismatchedInputException.d(jsonParser, javaType, b(String.format("Unexpected token (%s), expected %s", jsonParser.o(), jsonToken), str));
    }

    public JsonMappingException d(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return MismatchedInputException.a(jsonParser, cls, b(String.format("Unexpected token (%s), expected %s", jsonParser.o(), jsonToken), str));
    }

    public JsonMappingException c(Class<?> cls, String str, String str2) {
        return InvalidFormatException.c(this.f13098o, String.format("Cannot deserialize Map key of type %s from String %s: %s", C9537rU.u(cls), b(str), str2), str, cls);
    }

    public JsonMappingException c(String str, Class<?> cls, String str2) {
        return InvalidFormatException.c(this.f13098o, String.format("Cannot deserialize value of type %s from String %s: %s", C9537rU.u(cls), b(str), str2), str, cls);
    }

    public JsonMappingException d(Number number, Class<?> cls, String str) {
        return InvalidFormatException.c(this.f13098o, String.format("Cannot deserialize value of type %s from number %s: %s", C9537rU.u(cls), String.valueOf(number), str), number, cls);
    }

    public JsonMappingException b(Object obj, Class<?> cls) {
        return InvalidFormatException.c(this.f13098o, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", C9537rU.u(cls), C9537rU.d(obj)), obj, cls);
    }

    public JsonMappingException b(Class<?> cls, Throwable th) {
        String d;
        if (th == null) {
            d = "N/A";
        } else {
            d = C9537rU.d(th);
            if (d == null) {
                d = C9537rU.u(th.getClass());
            }
        }
        return ValueInstantiationException.c(this.f13098o, String.format("Cannot construct instance of %s, problem: %s", C9537rU.u(cls), d), a(cls), th);
    }

    @Override // o.AbstractC9446pj
    public JsonMappingException c(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.e(this.f13098o, b(String.format("Could not resolve type id '%s' as a subtype of %s", str, C9537rU.e(javaType)), str2), javaType, str);
    }

    public JsonMappingException b(JavaType javaType, String str) {
        return InvalidTypeIdException.e(this.f13098o, b(String.format("Missing type id when trying to resolve subtype of %s", javaType), str), javaType, null);
    }

    protected DateFormat g() {
        DateFormat dateFormat = this.h;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.a.m().clone();
        this.h = dateFormat2;
        return dateFormat2;
    }
}
