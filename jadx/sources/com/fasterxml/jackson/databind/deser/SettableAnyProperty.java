package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.io.Closeable;
import java.io.Serializable;
import java.util.Map;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9494qe;
import o.C9537rU;

/* loaded from: classes5.dex */
public class SettableAnyProperty implements Serializable {
    private static final long serialVersionUID = 1;
    protected final BeanProperty a;
    protected final JavaType b;
    protected final AbstractC9450pn c;
    protected final AnnotatedMember d;
    final boolean e;
    protected final AbstractC9543ra i;
    protected AbstractC9452pp<Object> j;

    public boolean a() {
        return this.j != null;
    }

    public JavaType c() {
        return this.b;
    }

    public BeanProperty e() {
        return this.a;
    }

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, AbstractC9450pn abstractC9450pn, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra) {
        this.a = beanProperty;
        this.d = annotatedMember;
        this.b = javaType;
        this.j = abstractC9452pp;
        this.i = abstractC9543ra;
        this.c = abstractC9450pn;
        this.e = annotatedMember instanceof AnnotatedField;
    }

    public SettableAnyProperty e(AbstractC9452pp<Object> abstractC9452pp) {
        return new SettableAnyProperty(this.a, this.d, this.b, this.c, abstractC9452pp, this.i);
    }

    public void a(DeserializationConfig deserializationConfig) {
        this.d.d(deserializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    Object readResolve() {
        AnnotatedMember annotatedMember = this.d;
        if (annotatedMember == null || annotatedMember.b() == null) {
            throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
        }
        return this;
    }

    public final void c(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        try {
            AbstractC9450pn abstractC9450pn = this.c;
            d(obj, abstractC9450pn == null ? str : abstractC9450pn.c(str, deserializationContext), d(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this.j.b() == null) {
                throw JsonMappingException.d(jsonParser, "Unresolved forward reference but no identity info.", e);
            }
            e.a().e(new c(this, e, this.b.h(), obj, str));
        }
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.a(JsonToken.VALUE_NULL)) {
            return this.j.c(deserializationContext);
        }
        AbstractC9543ra abstractC9543ra = this.i;
        if (abstractC9543ra != null) {
            return this.j.a(jsonParser, deserializationContext, abstractC9543ra);
        }
        return this.j.b(jsonParser, deserializationContext);
    }

    public void d(Object obj, Object obj2, Object obj3) {
        try {
            if (this.e) {
                Map map = (Map) ((AnnotatedField) this.d).d(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                }
            } else {
                ((AnnotatedMethod) this.d).b(obj, obj2, obj3);
            }
        } catch (Exception e) {
            c(e, obj2, obj3);
        }
    }

    protected void c(Exception exc, Object obj, Object obj2) {
        if (exc instanceof IllegalArgumentException) {
            String d = C9537rU.d(obj2);
            StringBuilder sb = new StringBuilder("Problem deserializing \"any\" property '");
            sb.append(obj);
            sb.append("' of class " + d() + " (expected type: ");
            sb.append(this.b);
            sb.append("; actual type: ");
            sb.append(d);
            sb.append(")");
            String d2 = C9537rU.d((Throwable) exc);
            if (d2 != null) {
                sb.append(", problem: ");
                sb.append(d2);
            } else {
                sb.append(" (no error message provided)");
            }
            throw new JsonMappingException((Closeable) null, sb.toString(), exc);
        }
        C9537rU.e((Throwable) exc);
        C9537rU.h(exc);
        Throwable c2 = C9537rU.c((Throwable) exc);
        throw new JsonMappingException((Closeable) null, C9537rU.d(c2), c2);
    }

    private String d() {
        return this.d.g().getName();
    }

    public String toString() {
        return "[any property on class " + d() + "]";
    }

    /* loaded from: classes5.dex */
    static class c extends C9494qe.d {
        private final String a;
        private final Object b;
        private final SettableAnyProperty c;

        public c(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj, String str) {
            super(unresolvedForwardReference, cls);
            this.c = settableAnyProperty;
            this.b = obj;
            this.a = str;
        }

        @Override // o.C9494qe.d
        public void c(Object obj, Object obj2) {
            if (!d(obj)) {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
            }
            this.c.d(this.b, this.a, obj2);
        }
    }
}
