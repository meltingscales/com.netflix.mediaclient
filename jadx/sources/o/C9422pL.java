package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC9411pA;

/* renamed from: o.pL  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9422pL {
    protected AnnotatedMethod a;
    protected InterfaceC9411pA.d b;
    protected HashMap<String, SettableBeanProperty> c;
    protected SettableAnyProperty d;
    protected final AbstractC9445pi e;
    protected List<ValueInjector> f;
    protected final DeserializationContext g;
    protected HashSet<String> h;
    protected final DeserializationConfig i;
    protected boolean j;
    protected final Map<String, SettableBeanProperty> k = new LinkedHashMap();
    protected ObjectIdReader m;

    /* renamed from: o  reason: collision with root package name */
    protected ValueInstantiator f13894o;

    public void b(ValueInstantiator valueInstantiator) {
        this.f13894o = valueInstantiator;
    }

    public void b(ObjectIdReader objectIdReader) {
        this.m = objectIdReader;
    }

    public void b(boolean z) {
        this.j = z;
    }

    public AnnotatedMethod c() {
        return this.a;
    }

    public void c(AnnotatedMethod annotatedMethod, InterfaceC9411pA.d dVar) {
        this.a = annotatedMethod;
        this.b = dVar;
    }

    public SettableAnyProperty d() {
        return this.d;
    }

    public List<ValueInjector> e() {
        return this.f;
    }

    public ObjectIdReader g() {
        return this.m;
    }

    public ValueInstantiator i() {
        return this.f13894o;
    }

    public C9422pL(AbstractC9445pi abstractC9445pi, DeserializationContext deserializationContext) {
        this.e = abstractC9445pi;
        this.g = deserializationContext;
        this.i = deserializationContext.c();
    }

    public void d(SettableBeanProperty settableBeanProperty, boolean z) {
        this.k.put(settableBeanProperty.a(), settableBeanProperty);
    }

    public void b(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty put = this.k.put(settableBeanProperty.a(), settableBeanProperty);
        if (put == null || put == settableBeanProperty) {
            return;
        }
        throw new IllegalArgumentException("Duplicate property '" + settableBeanProperty.a() + "' for " + this.e.t());
    }

    public void a(String str, SettableBeanProperty settableBeanProperty) {
        if (this.c == null) {
            this.c = new HashMap<>(4);
        }
        settableBeanProperty.b(this.i);
        this.c.put(str, settableBeanProperty);
    }

    public void d(PropertyName propertyName, JavaType javaType, InterfaceC9532rP interfaceC9532rP, AnnotatedMember annotatedMember, Object obj) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        boolean f = this.i.f();
        boolean z = f && this.i.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        if (f) {
            annotatedMember.d(z);
        }
        this.f.add(new ValueInjector(propertyName, javaType, annotatedMember, obj));
    }

    public void e(String str) {
        if (this.h == null) {
            this.h = new HashSet<>();
        }
        this.h.add(str);
    }

    public void c(SettableBeanProperty settableBeanProperty) {
        b(settableBeanProperty);
    }

    public void a(SettableAnyProperty settableAnyProperty) {
        if (this.d != null && settableAnyProperty != null) {
            throw new IllegalStateException("_anySetter already set to non-null");
        }
        this.d = settableAnyProperty;
    }

    public SettableBeanProperty e(PropertyName propertyName) {
        return this.k.get(propertyName.c());
    }

    public boolean d(String str) {
        HashSet<String> hashSet = this.h;
        return hashSet != null && hashSet.contains(str);
    }

    public AbstractC9452pp<?> b() {
        boolean z;
        Collection<SettableBeanProperty> values = this.k.values();
        b(values);
        BeanPropertyMap c = BeanPropertyMap.c(values, this.i.a(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES), d(values));
        c.a();
        boolean z2 = !this.i.a(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (!z2) {
            for (SettableBeanProperty settableBeanProperty : values) {
                if (settableBeanProperty.p()) {
                    z = true;
                    break;
                }
            }
        }
        z = z2;
        if (this.m != null) {
            c = c.e(new ObjectIdValueProperty(this.m, PropertyMetadata.a));
        }
        return new BeanDeserializer(this, this.e, c, this.c, this.h, this.j, z);
    }

    public AbstractDeserializer a() {
        return new AbstractDeserializer(this, this.e, this.c, this.k);
    }

    public AbstractC9452pp<?> d(JavaType javaType, String str) {
        AnnotatedMethod annotatedMethod = this.a;
        if (annotatedMethod == null) {
            if (!str.isEmpty()) {
                this.g.c(this.e.t(), String.format("Builder class %s does not have build method (name: '%s')", this.e.o().getName(), str));
            }
        } else {
            Class<?> n = annotatedMethod.n();
            Class<?> h = javaType.h();
            if (n != h && !n.isAssignableFrom(h) && !h.isAssignableFrom(n)) {
                this.g.c(this.e.t(), String.format("Build method '%s' has wrong return type (%s), not compatible with POJO type (%s)", this.a.l(), n.getName(), javaType.h().getName()));
            }
        }
        Collection<SettableBeanProperty> values = this.k.values();
        b(values);
        BeanPropertyMap c = BeanPropertyMap.c(values, this.i.a(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES), d(values));
        c.a();
        boolean z = true;
        boolean z2 = !this.i.a(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (!z2) {
            for (SettableBeanProperty settableBeanProperty : values) {
                if (settableBeanProperty.p()) {
                    break;
                }
            }
        }
        z = z2;
        if (this.m != null) {
            c = c.e(new ObjectIdValueProperty(this.m, PropertyMetadata.a));
        }
        return b(javaType, c, z);
    }

    protected AbstractC9452pp<?> b(JavaType javaType, BeanPropertyMap beanPropertyMap, boolean z) {
        return new BuilderBasedDeserializer(this, this.e, javaType, beanPropertyMap, this.c, this.h, this.j, z);
    }

    protected void b(Collection<SettableBeanProperty> collection) {
        for (SettableBeanProperty settableBeanProperty : collection) {
            settableBeanProperty.b(this.i);
        }
        SettableAnyProperty settableAnyProperty = this.d;
        if (settableAnyProperty != null) {
            settableAnyProperty.a(this.i);
        }
        AnnotatedMethod annotatedMethod = this.a;
        if (annotatedMethod != null) {
            annotatedMethod.d(this.i.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
    }

    protected Map<String, List<PropertyName>> d(Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector h = this.i.h();
        HashMap hashMap = null;
        if (h != null) {
            for (SettableBeanProperty settableBeanProperty : collection) {
                List<PropertyName> r = h.r(settableBeanProperty.e());
                if (r != null && !r.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(settableBeanProperty.a(), r);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }
}
