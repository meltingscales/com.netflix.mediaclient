package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.io.IOException;
import java.io.Serializable;
import o.AbstractC9452pp;
import o.AbstractC9459pw;
import o.AbstractC9465qB;
import o.AbstractC9543ra;
import o.C9471qH;
import o.C9537rU;
import o.InterfaceC9428pR;
import o.InterfaceC9480qQ;
import o.InterfaceC9532rP;

/* loaded from: classes5.dex */
public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase implements Serializable {
    protected static final AbstractC9452pp<Object> j = new FailingDeserializer("No _valueDeserializer assigned");
    protected String f;
    protected final transient InterfaceC9532rP g;
    public C9471qH k;
    protected int l;
    public final JavaType m;
    protected final PropertyName n;

    /* renamed from: o  reason: collision with root package name */
    public final InterfaceC9428pR f13105o;
    public final AbstractC9452pp<Object> p;
    public final AbstractC9543ra q;
    protected ViewMatcher r;
    protected final PropertyName t;

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyName b() {
        return this.n;
    }

    public abstract SettableBeanProperty b(InterfaceC9428pR interfaceC9428pR);

    public void b(DeserializationConfig deserializationConfig) {
    }

    public abstract SettableBeanProperty c(PropertyName propertyName);

    public abstract Object c(Object obj, Object obj2);

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JavaType d() {
        return this.m;
    }

    public abstract SettableBeanProperty d(AbstractC9452pp<?> abstractC9452pp);

    public abstract void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj);

    public void d(String str) {
        this.f = str;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract AnnotatedMember e();

    public abstract Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj);

    public abstract void e(Object obj, Object obj2);

    public void e(C9471qH c9471qH) {
        this.k = c9471qH;
    }

    public Object g() {
        return null;
    }

    public void h() {
    }

    public boolean j() {
        return false;
    }

    public String k() {
        return this.f;
    }

    public AbstractC9543ra l() {
        return this.q;
    }

    public InterfaceC9428pR m() {
        return this.f13105o;
    }

    public C9471qH n() {
        return this.k;
    }

    public AbstractC9452pp<Object> o() {
        AbstractC9452pp<Object> abstractC9452pp = this.p;
        if (abstractC9452pp == j) {
            return null;
        }
        return abstractC9452pp;
    }

    public boolean p() {
        return this.r != null;
    }

    public boolean r() {
        return this.q != null;
    }

    public boolean s() {
        AbstractC9452pp<Object> abstractC9452pp = this.p;
        return (abstractC9452pp == null || abstractC9452pp == j) ? false : true;
    }

    public SettableBeanProperty(AbstractC9465qB abstractC9465qB, JavaType javaType, AbstractC9543ra abstractC9543ra, InterfaceC9532rP interfaceC9532rP) {
        this(abstractC9465qB.o(), javaType, abstractC9465qB.w(), abstractC9543ra, interfaceC9532rP, abstractC9465qB.n());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AbstractC9543ra abstractC9543ra, InterfaceC9532rP interfaceC9532rP, PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
        this.l = -1;
        if (propertyName == null) {
            this.n = PropertyName.a;
        } else {
            this.n = propertyName.a();
        }
        this.m = javaType;
        this.t = propertyName2;
        this.g = interfaceC9532rP;
        this.r = null;
        this.q = abstractC9543ra != null ? abstractC9543ra.d(this) : abstractC9543ra;
        AbstractC9452pp<Object> abstractC9452pp = j;
        this.p = abstractC9452pp;
        this.f13105o = abstractC9452pp;
    }

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyMetadata propertyMetadata, AbstractC9452pp<Object> abstractC9452pp) {
        super(propertyMetadata);
        this.l = -1;
        if (propertyName == null) {
            this.n = PropertyName.a;
        } else {
            this.n = propertyName.a();
        }
        this.m = javaType;
        this.t = null;
        this.g = null;
        this.r = null;
        this.q = null;
        this.p = abstractC9452pp;
        this.f13105o = abstractC9452pp;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty) {
        super(settableBeanProperty);
        this.l = -1;
        this.n = settableBeanProperty.n;
        this.m = settableBeanProperty.m;
        this.t = settableBeanProperty.t;
        this.g = settableBeanProperty.g;
        this.p = settableBeanProperty.p;
        this.q = settableBeanProperty.q;
        this.f = settableBeanProperty.f;
        this.l = settableBeanProperty.l;
        this.r = settableBeanProperty.r;
        this.f13105o = settableBeanProperty.f13105o;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR) {
        super(settableBeanProperty);
        this.l = -1;
        this.n = settableBeanProperty.n;
        this.m = settableBeanProperty.m;
        this.t = settableBeanProperty.t;
        this.g = settableBeanProperty.g;
        this.q = settableBeanProperty.q;
        this.f = settableBeanProperty.f;
        this.l = settableBeanProperty.l;
        this.p = abstractC9452pp == null ? j : abstractC9452pp;
        this.r = settableBeanProperty.r;
        this.f13105o = interfaceC9428pR == j ? this.p : interfaceC9428pR;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, PropertyName propertyName) {
        super(settableBeanProperty);
        this.l = -1;
        this.n = propertyName;
        this.m = settableBeanProperty.m;
        this.t = settableBeanProperty.t;
        this.g = settableBeanProperty.g;
        this.p = settableBeanProperty.p;
        this.q = settableBeanProperty.q;
        this.f = settableBeanProperty.f;
        this.l = settableBeanProperty.l;
        this.r = settableBeanProperty.r;
        this.f13105o = settableBeanProperty.f13105o;
    }

    public SettableBeanProperty e(String str) {
        PropertyName c;
        PropertyName propertyName = this.n;
        if (propertyName == null) {
            c = new PropertyName(str);
        } else {
            c = propertyName.c(str);
        }
        return c == this.n ? this : c(c);
    }

    public void e(Class<?>[] clsArr) {
        if (clsArr == null) {
            this.r = null;
        } else {
            this.r = ViewMatcher.a(clsArr);
        }
    }

    public void d(int i) {
        if (this.l == -1) {
            this.l = i;
            return;
        }
        throw new IllegalStateException("Property '" + a() + "' already had index (" + this.l + "), trying to assign " + i);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty, o.InterfaceC9539rW
    public final String a() {
        return this.n.c();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public void d(InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
        if (q()) {
            interfaceC9480qQ.b(this);
        } else {
            interfaceC9480qQ.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Class<?> f() {
        return e().g();
    }

    public boolean a(Class<?> cls) {
        ViewMatcher viewMatcher = this.r;
        return viewMatcher == null || viewMatcher.d(cls);
    }

    public int i() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", a(), getClass().getName()));
    }

    public final Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.a(JsonToken.VALUE_NULL)) {
            return this.f13105o.c(deserializationContext);
        }
        AbstractC9543ra abstractC9543ra = this.q;
        if (abstractC9543ra != null) {
            return this.p.a(jsonParser, deserializationContext, abstractC9543ra);
        }
        Object b = this.p.b(jsonParser, deserializationContext);
        return b == null ? this.f13105o.c(deserializationContext) : b;
    }

    public final Object a(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (jsonParser.a(JsonToken.VALUE_NULL)) {
            return NullsConstantProvider.c(this.f13105o) ? obj : this.f13105o.c(deserializationContext);
        }
        if (this.q != null) {
            deserializationContext.c(d(), String.format("Cannot merge polymorphic property '%s'", a()));
        }
        Object e = this.p.e(jsonParser, deserializationContext, obj);
        return e == null ? NullsConstantProvider.c(this.f13105o) ? obj : this.f13105o.c(deserializationContext) : e;
    }

    public void c(JsonParser jsonParser, Exception exc, Object obj) {
        if (exc instanceof IllegalArgumentException) {
            String d = C9537rU.d(obj);
            StringBuilder sb = new StringBuilder("Problem deserializing property '");
            sb.append(a());
            sb.append("' (expected type: ");
            sb.append(d());
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
            throw JsonMappingException.d(jsonParser, sb.toString(), exc);
        }
        e(jsonParser, exc);
    }

    public IOException e(JsonParser jsonParser, Exception exc) {
        C9537rU.e((Throwable) exc);
        C9537rU.h(exc);
        Throwable c = C9537rU.c((Throwable) exc);
        throw JsonMappingException.d(jsonParser, C9537rU.d(c), c);
    }

    public void c(Exception exc, Object obj) {
        c(null, exc, obj);
    }

    public String toString() {
        return "[property '" + a() + "']";
    }

    /* loaded from: classes5.dex */
    public static abstract class Delegating extends SettableBeanProperty {
        public final SettableBeanProperty b;

        protected abstract SettableBeanProperty d(SettableBeanProperty settableBeanProperty);

        public Delegating(SettableBeanProperty settableBeanProperty) {
            super(settableBeanProperty);
            this.b = settableBeanProperty;
        }

        protected SettableBeanProperty a(SettableBeanProperty settableBeanProperty) {
            return settableBeanProperty == this.b ? this : d(settableBeanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty d(AbstractC9452pp<?> abstractC9452pp) {
            return a(this.b.d(abstractC9452pp));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty c(PropertyName propertyName) {
            return a(this.b.c(propertyName));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty b(InterfaceC9428pR interfaceC9428pR) {
            return a(this.b.b(interfaceC9428pR));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void d(int i) {
            this.b.d(i);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void b(DeserializationConfig deserializationConfig) {
            this.b.b(deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        protected Class<?> f() {
            return this.b.f();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public String k() {
            return this.b.k();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public C9471qH n() {
            return this.b.n();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean s() {
            return this.b.s();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean r() {
            return this.b.r();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public AbstractC9452pp<Object> o() {
            return this.b.o();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public AbstractC9543ra l() {
            return this.b.l();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean a(Class<?> cls) {
            return this.b.a(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean p() {
            return this.b.p();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public int i() {
            return this.b.i();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object g() {
            return this.b.g();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember e() {
            return this.b.e();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
            this.b.d(jsonParser, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
            return this.b.e(jsonParser, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void e(Object obj, Object obj2) {
            this.b.e(obj, obj2);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object c(Object obj, Object obj2) {
            return this.b.c(obj, obj2);
        }
    }
}
