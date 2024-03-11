package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC9445pi;
import o.AbstractC9452pp;
import o.AbstractC9509qt;
import o.AbstractC9543ra;
import o.C9422pL;
import o.C9435pY;
import o.C9471qH;
import o.C9492qc;
import o.C9494qe;
import o.C9537rU;
import o.C9542rZ;
import o.InterfaceC9317nM;
import o.InterfaceC9420pJ;
import o.InterfaceC9428pR;
import o.InterfaceC9429pS;
import o.InterfaceC9535rS;

/* loaded from: classes5.dex */
public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements InterfaceC9420pJ, InterfaceC9429pS, Serializable {
    protected static final PropertyName a = new PropertyName("#temporary-name");
    private static final long serialVersionUID = 1;
    protected final Map<String, SettableBeanProperty> b;
    protected AbstractC9452pp<Object> d;
    public SettableAnyProperty e;
    public final JavaType f;
    public final BeanPropertyMap g;
    public final Set<String> h;
    public AbstractC9452pp<Object> i;
    protected C9435pY j;
    public final ObjectIdReader k;
    public final boolean l;
    public boolean m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final ValueInjector[] f13104o;
    protected C9492qc p;
    protected final JsonFormat.Shape q;
    public final ValueInstantiator r;
    public PropertyBasedCreator s;
    protected transient HashMap<ClassKey, AbstractC9452pp<Object>> t;
    public boolean u;

    private final AbstractC9452pp<Object> h() {
        AbstractC9452pp<Object> abstractC9452pp = this.i;
        return abstractC9452pp == null ? this.d : abstractC9452pp;
    }

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public abstract BeanDeserializerBase b(ObjectIdReader objectIdReader);

    @Override // o.AbstractC9452pp
    public ObjectIdReader b() {
        return this.k;
    }

    public abstract BeanDeserializerBase c(Set<String> set);

    public abstract Object c(JsonParser jsonParser, DeserializationContext deserializationContext);

    protected abstract Object d(JsonParser jsonParser, DeserializationContext deserializationContext);

    @Override // o.AbstractC9452pp
    public abstract AbstractC9452pp<Object> d(NameTransformer nameTransformer);

    protected abstract BeanDeserializerBase f();

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType g() {
        return this.f;
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return true;
    }

    public ValueInstantiator j() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BeanDeserializerBase(C9422pL c9422pL, AbstractC9445pi abstractC9445pi, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        super(abstractC9445pi.t());
        this.f = abstractC9445pi.t();
        ValueInstantiator i = c9422pL.i();
        this.r = i;
        this.g = beanPropertyMap;
        this.b = map;
        this.h = set;
        this.l = z;
        this.e = c9422pL.d();
        List<ValueInjector> e = c9422pL.e();
        ValueInjector[] valueInjectorArr = (e == null || e.isEmpty()) ? null : (ValueInjector[]) e.toArray(new ValueInjector[e.size()]);
        this.f13104o = valueInjectorArr;
        ObjectIdReader g = c9422pL.g();
        this.k = g;
        boolean z3 = true;
        this.m = this.p != null || i.f() || i.j() || i.b() || !i.g();
        JsonFormat.Value e2 = abstractC9445pi.e(null);
        this.q = e2 != null ? e2.a() : null;
        this.n = z2;
        this.u = (this.m || valueInjectorArr != null || z2 || g != null) ? false : z3;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase.l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase.f);
        this.f = beanDeserializerBase.f;
        this.r = beanDeserializerBase.r;
        this.i = beanDeserializerBase.i;
        this.s = beanDeserializerBase.s;
        this.g = beanDeserializerBase.g;
        this.b = beanDeserializerBase.b;
        this.h = beanDeserializerBase.h;
        this.l = z;
        this.e = beanDeserializerBase.e;
        this.f13104o = beanDeserializerBase.f13104o;
        this.k = beanDeserializerBase.k;
        this.m = beanDeserializerBase.m;
        this.p = beanDeserializerBase.p;
        this.n = beanDeserializerBase.n;
        this.q = beanDeserializerBase.q;
        this.u = beanDeserializerBase.u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase.f);
        this.f = beanDeserializerBase.f;
        this.r = beanDeserializerBase.r;
        this.i = beanDeserializerBase.i;
        this.s = beanDeserializerBase.s;
        this.b = beanDeserializerBase.b;
        this.h = beanDeserializerBase.h;
        this.l = nameTransformer != null || beanDeserializerBase.l;
        this.e = beanDeserializerBase.e;
        this.f13104o = beanDeserializerBase.f13104o;
        this.k = beanDeserializerBase.k;
        this.m = beanDeserializerBase.m;
        C9492qc c9492qc = beanDeserializerBase.p;
        if (nameTransformer != null) {
            c9492qc = c9492qc != null ? c9492qc.a(nameTransformer) : c9492qc;
            this.g = beanDeserializerBase.g.c(nameTransformer);
        } else {
            this.g = beanDeserializerBase.g;
        }
        this.p = c9492qc;
        this.n = beanDeserializerBase.n;
        this.q = beanDeserializerBase.q;
        this.u = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase.f);
        this.f = beanDeserializerBase.f;
        this.r = beanDeserializerBase.r;
        this.i = beanDeserializerBase.i;
        this.s = beanDeserializerBase.s;
        this.b = beanDeserializerBase.b;
        this.h = beanDeserializerBase.h;
        this.l = beanDeserializerBase.l;
        this.e = beanDeserializerBase.e;
        this.f13104o = beanDeserializerBase.f13104o;
        this.m = beanDeserializerBase.m;
        this.p = beanDeserializerBase.p;
        this.n = beanDeserializerBase.n;
        this.q = beanDeserializerBase.q;
        this.k = objectIdReader;
        if (objectIdReader == null) {
            this.g = beanDeserializerBase.g;
            this.u = beanDeserializerBase.u;
            return;
        }
        this.g = beanDeserializerBase.g.e(new ObjectIdValueProperty(objectIdReader, PropertyMetadata.a));
        this.u = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase.f);
        this.f = beanDeserializerBase.f;
        this.r = beanDeserializerBase.r;
        this.i = beanDeserializerBase.i;
        this.s = beanDeserializerBase.s;
        this.b = beanDeserializerBase.b;
        this.h = set;
        this.l = beanDeserializerBase.l;
        this.e = beanDeserializerBase.e;
        this.f13104o = beanDeserializerBase.f13104o;
        this.m = beanDeserializerBase.m;
        this.p = beanDeserializerBase.p;
        this.n = beanDeserializerBase.n;
        this.q = beanDeserializerBase.q;
        this.u = beanDeserializerBase.u;
        this.k = beanDeserializerBase.k;
        this.g = beanDeserializerBase.g.d(set);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase.f);
        this.f = beanDeserializerBase.f;
        this.r = beanDeserializerBase.r;
        this.i = beanDeserializerBase.i;
        this.s = beanDeserializerBase.s;
        this.g = beanPropertyMap;
        this.b = beanDeserializerBase.b;
        this.h = beanDeserializerBase.h;
        this.l = beanDeserializerBase.l;
        this.e = beanDeserializerBase.e;
        this.f13104o = beanDeserializerBase.f13104o;
        this.k = beanDeserializerBase.k;
        this.m = beanDeserializerBase.m;
        this.p = beanDeserializerBase.p;
        this.n = beanDeserializerBase.n;
        this.q = beanDeserializerBase.q;
        this.u = beanDeserializerBase.u;
    }

    public BeanDeserializerBase e(BeanPropertyMap beanPropertyMap) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    @Override // o.InterfaceC9429pS
    public void b(DeserializationContext deserializationContext) {
        SettableBeanProperty[] settableBeanPropertyArr;
        AbstractC9452pp<Object> o2;
        AbstractC9452pp<Object> d;
        boolean z = false;
        C9435pY.b bVar = null;
        if (this.r.b()) {
            settableBeanPropertyArr = this.r.d(deserializationContext.c());
            if (this.h != null) {
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    if (this.h.contains(settableBeanPropertyArr[i].a())) {
                        settableBeanPropertyArr[i].h();
                    }
                }
            }
        } else {
            settableBeanPropertyArr = null;
        }
        Iterator<SettableBeanProperty> it = this.g.iterator();
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            if (!next.s()) {
                AbstractC9452pp<Object> e = e(deserializationContext, next);
                if (e == null) {
                    e = deserializationContext.d(next.d());
                }
                a(this.g, settableBeanPropertyArr, next, next.d(e));
            }
        }
        Iterator<SettableBeanProperty> it2 = this.g.iterator();
        C9492qc c9492qc = null;
        while (it2.hasNext()) {
            SettableBeanProperty next2 = it2.next();
            SettableBeanProperty b = b(deserializationContext, next2.d(deserializationContext.c(next2.o(), (BeanProperty) next2, next2.d())));
            if (!(b instanceof ManagedReferenceProperty)) {
                b = d(deserializationContext, b);
            }
            NameTransformer a2 = a(deserializationContext, b);
            if (a2 != null && (d = (o2 = b.o()).d(a2)) != o2 && d != null) {
                SettableBeanProperty d2 = b.d(d);
                if (c9492qc == null) {
                    c9492qc = new C9492qc();
                }
                c9492qc.b(d2);
                this.g.d(d2);
            } else {
                SettableBeanProperty c = c(deserializationContext, c(deserializationContext, b, b.c()));
                if (c != next2) {
                    a(this.g, settableBeanPropertyArr, next2, c);
                }
                if (c.r()) {
                    AbstractC9543ra l = c.l();
                    if (l.c() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                        if (bVar == null) {
                            bVar = C9435pY.d(this.f);
                        }
                        bVar.e(c, l);
                        this.g.d(c);
                    }
                }
            }
        }
        SettableAnyProperty settableAnyProperty = this.e;
        if (settableAnyProperty != null && !settableAnyProperty.a()) {
            SettableAnyProperty settableAnyProperty2 = this.e;
            this.e = settableAnyProperty2.e(a(deserializationContext, settableAnyProperty2.c(), this.e.e()));
        }
        if (this.r.f()) {
            JavaType c2 = this.r.c(deserializationContext.c());
            if (c2 == null) {
                JavaType javaType = this.f;
                deserializationContext.c(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this.r.getClass().getName()));
            }
            this.i = d(deserializationContext, c2, this.r.l());
        }
        if (this.r.j()) {
            JavaType e2 = this.r.e(deserializationContext.c());
            if (e2 == null) {
                JavaType javaType2 = this.f;
                deserializationContext.c(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this.r.getClass().getName()));
            }
            this.d = d(deserializationContext, e2, this.r.m());
        }
        if (settableBeanPropertyArr != null) {
            this.s = PropertyBasedCreator.a(deserializationContext, this.r, settableBeanPropertyArr, this.g);
        }
        if (bVar != null) {
            this.j = bVar.d(this.g);
            this.m = true;
        }
        this.p = c9492qc;
        if (c9492qc != null) {
            this.m = true;
        }
        if (this.u && !this.m) {
            z = true;
        }
        this.u = z;
    }

    protected void a(BeanPropertyMap beanPropertyMap, SettableBeanProperty[] settableBeanPropertyArr, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        beanPropertyMap.a(settableBeanProperty, settableBeanProperty2);
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            for (int i = 0; i < length; i++) {
                if (settableBeanPropertyArr[i] == settableBeanProperty) {
                    settableBeanPropertyArr[i] = settableBeanProperty2;
                    return;
                }
            }
        }
    }

    private AbstractC9452pp<Object> d(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) {
        AbstractC9452pp<?> e;
        BeanProperty.Std std = new BeanProperty.Std(a, javaType, null, annotatedWithParams, PropertyMetadata.b);
        AbstractC9543ra abstractC9543ra = (AbstractC9543ra) javaType.m();
        if (abstractC9543ra == null) {
            abstractC9543ra = deserializationContext.c().c(javaType);
        }
        AbstractC9452pp<?> abstractC9452pp = (AbstractC9452pp) javaType.l();
        if (abstractC9452pp == null) {
            e = a(deserializationContext, javaType, std);
        } else {
            e = deserializationContext.e(abstractC9452pp, std, javaType);
        }
        return abstractC9543ra != null ? new TypeWrappedDeserializer(abstractC9543ra.d(std), e) : e;
    }

    protected AbstractC9452pp<Object> e(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        Object c;
        AnnotationIntrospector f = deserializationContext.f();
        if (f == null || (c = f.c((AbstractC9509qt) settableBeanProperty.e())) == null) {
            return null;
        }
        InterfaceC9535rS<Object, Object> b = deserializationContext.b(settableBeanProperty.e(), c);
        JavaType d = b.d(deserializationContext.e());
        return new StdDelegatingDeserializer(b, d, deserializationContext.d(d));
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        BeanPropertyMap beanPropertyMap;
        BeanPropertyMap d;
        JsonIgnoreProperties.Value p;
        C9471qH n;
        JavaType javaType;
        SettableBeanProperty settableBeanProperty;
        PropertyBasedObjectIdGenerator d2;
        ObjectIdReader objectIdReader = this.k;
        AnnotationIntrospector f = deserializationContext.f();
        AnnotatedMember e = StdDeserializer.b(beanProperty, f) ? beanProperty.e() : null;
        if (e != null && (n = f.n(e)) != null) {
            C9471qH a2 = f.a(e, n);
            Class<? extends ObjectIdGenerator<?>> c = a2.c();
            InterfaceC9317nM a3 = deserializationContext.a(e, a2);
            if (c == ObjectIdGenerators.PropertyGenerator.class) {
                PropertyName e2 = a2.e();
                SettableBeanProperty b = b(e2);
                if (b == null) {
                    deserializationContext.c(this.f, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", c().getName(), e2));
                }
                javaType = b.d();
                settableBeanProperty = b;
                d2 = new PropertyBasedObjectIdGenerator(a2.f());
            } else {
                javaType = deserializationContext.e().b(deserializationContext.a(c), ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                d2 = deserializationContext.d((AbstractC9509qt) e, a2);
            }
            JavaType javaType2 = javaType;
            objectIdReader = ObjectIdReader.e(javaType2, a2.e(), d2, deserializationContext.c(javaType2), settableBeanProperty, a3);
        }
        BeanDeserializerBase b2 = (objectIdReader == null || objectIdReader == this.k) ? this : b(objectIdReader);
        if (e != null && (p = f.p(e)) != null) {
            Set<String> d3 = p.d();
            if (!d3.isEmpty()) {
                Set<String> set = b2.h;
                if (set != null && !set.isEmpty()) {
                    HashSet hashSet = new HashSet(d3);
                    hashSet.addAll(set);
                    d3 = hashSet;
                }
                b2 = b2.c(d3);
            }
        }
        JsonFormat.Value c2 = c(deserializationContext, beanProperty, c());
        if (c2 != null) {
            r3 = c2.g() ? c2.a() : null;
            Boolean d4 = c2.d(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (d4 != null && (d = (beanPropertyMap = this.g).d(d4.booleanValue())) != beanPropertyMap) {
                b2 = b2.e(d);
            }
        }
        if (r3 == null) {
            r3 = this.q;
        }
        return r3 == JsonFormat.Shape.ARRAY ? b2.f() : b2;
    }

    protected SettableBeanProperty b(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        String k = settableBeanProperty.k();
        if (k == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty c = settableBeanProperty.o().c(k);
        if (c == null) {
            deserializationContext.c(this.f, String.format("Cannot handle managed/back reference '%s': no back reference property found from type %s", k, settableBeanProperty.d()));
        }
        JavaType javaType = this.f;
        JavaType d = c.d();
        boolean x = settableBeanProperty.d().x();
        if (!d.h().isAssignableFrom(javaType.h())) {
            deserializationContext.c(this.f, String.format("Cannot handle managed/back reference '%s': back reference type (%s) not compatible with managed type (%s)", k, d.h().getName(), javaType.h().getName()));
        }
        return new ManagedReferenceProperty(settableBeanProperty, k, c, x);
    }

    protected SettableBeanProperty d(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        C9471qH n = settableBeanProperty.n();
        AbstractC9452pp<Object> o2 = settableBeanProperty.o();
        return (n == null && (o2 == null ? null : o2.b()) == null) ? settableBeanProperty : new ObjectIdReferenceProperty(settableBeanProperty, n);
    }

    protected NameTransformer a(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        NameTransformer f;
        AnnotatedMember e = settableBeanProperty.e();
        if (e == null || (f = deserializationContext.f().f(e)) == null) {
            return null;
        }
        if (settableBeanProperty instanceof CreatorProperty) {
            deserializationContext.c(g(), String.format("Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported", settableBeanProperty.a()));
        }
        return f;
    }

    protected SettableBeanProperty c(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        Class<?> h;
        Class<?> n;
        Constructor<?>[] constructors;
        AbstractC9452pp<Object> o2 = settableBeanProperty.o();
        if ((o2 instanceof BeanDeserializerBase) && !((BeanDeserializerBase) o2).j().g() && (n = C9537rU.n((h = settableBeanProperty.d().h()))) != null && n == this.f.h()) {
            for (Constructor<?> constructor : h.getConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && n.equals(parameterTypes[0])) {
                    if (deserializationContext.a()) {
                        C9537rU.b(constructor, deserializationContext.d(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return new InnerClassProperty(settableBeanProperty, constructor);
                }
            }
        }
        return settableBeanProperty;
    }

    protected SettableBeanProperty c(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) {
        PropertyMetadata.b e = propertyMetadata.e();
        if (e != null) {
            AbstractC9452pp<Object> o2 = settableBeanProperty.o();
            Boolean a2 = o2.a(deserializationContext.c());
            if (a2 == null) {
                if (e.b) {
                    return settableBeanProperty;
                }
            } else if (!a2.booleanValue()) {
                if (!e.b) {
                    deserializationContext.b(o2);
                }
                return settableBeanProperty;
            }
            AnnotatedMember annotatedMember = e.a;
            annotatedMember.d(deserializationContext.d(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            if (!(settableBeanProperty instanceof SetterlessProperty)) {
                settableBeanProperty = MergingSettableBeanProperty.a(settableBeanProperty, annotatedMember);
            }
        }
        InterfaceC9428pR d = d(deserializationContext, settableBeanProperty, propertyMetadata);
        return d != null ? settableBeanProperty.b(d) : settableBeanProperty;
    }

    @Override // o.AbstractC9452pp
    public AccessPattern a() {
        return AccessPattern.DYNAMIC;
    }

    @Override // o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        try {
            return this.r.e(deserializationContext);
        } catch (IOException e) {
            return C9537rU.d(deserializationContext, e);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Class<?> c() {
        return this.f.h();
    }

    @Override // o.AbstractC9452pp
    public Collection<Object> d() {
        ArrayList arrayList = new ArrayList();
        Iterator<SettableBeanProperty> it = this.g.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    public SettableBeanProperty b(PropertyName propertyName) {
        return b(propertyName.c());
    }

    public SettableBeanProperty b(String str) {
        PropertyBasedCreator propertyBasedCreator;
        BeanPropertyMap beanPropertyMap = this.g;
        SettableBeanProperty e = beanPropertyMap == null ? null : beanPropertyMap.e(str);
        return (e != null || (propertyBasedCreator = this.s) == null) ? e : propertyBasedCreator.b(str);
    }

    @Override // o.AbstractC9452pp
    public SettableBeanProperty c(String str) {
        Map<String, SettableBeanProperty> map = this.b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        Object x;
        if (this.k != null) {
            if (jsonParser.b() && (x = jsonParser.x()) != null) {
                return e(jsonParser, deserializationContext, abstractC9543ra.a(jsonParser, deserializationContext), x);
            }
            JsonToken o2 = jsonParser.o();
            if (o2 != null) {
                if (o2.b()) {
                    return o(jsonParser, deserializationContext);
                }
                if (o2 == JsonToken.START_OBJECT) {
                    o2 = jsonParser.Q();
                }
                if (o2 == JsonToken.FIELD_NAME && this.k.c() && this.k.a(jsonParser.l(), jsonParser)) {
                    return o(jsonParser, deserializationContext);
                }
            }
        }
        return abstractC9543ra.a(jsonParser, deserializationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) {
        AbstractC9452pp<Object> b = this.k.b();
        if (b.c() != obj2.getClass()) {
            obj2 = b(jsonParser, deserializationContext, obj2, b);
        }
        ObjectIdReader objectIdReader = this.k;
        deserializationContext.d(obj2, objectIdReader.e, objectIdReader.j).d(obj);
        SettableBeanProperty settableBeanProperty = this.k.d;
        return settableBeanProperty != null ? settableBeanProperty.c(obj, obj2) : obj;
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, AbstractC9452pp<Object> abstractC9452pp) {
        C9542rZ c9542rZ = new C9542rZ(jsonParser, deserializationContext);
        if (obj instanceof String) {
            c9542rZ.i((String) obj);
        } else if (obj instanceof Long) {
            c9542rZ.b(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            c9542rZ.c(((Integer) obj).intValue());
        } else {
            c9542rZ.a(obj);
        }
        JsonParser m = c9542rZ.m();
        m.Q();
        return abstractC9452pp.b(m, deserializationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object p(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return c(jsonParser, deserializationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object o(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object c = this.k.c(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this.k;
        C9494qe d = deserializationContext.d(c, objectIdReader.e, objectIdReader.j);
        Object b = d.b();
        if (b != null) {
            return b;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + c + "] (for " + this.f + ").", jsonParser.k(), d);
    }

    public Object l(JsonParser jsonParser, DeserializationContext deserializationContext) {
        AbstractC9452pp<Object> h = h();
        if (h != null) {
            return this.r.b(deserializationContext, h.b(jsonParser, deserializationContext));
        }
        if (this.s != null) {
            return d(jsonParser, deserializationContext);
        }
        Class<?> h2 = this.f.h();
        if (C9537rU.r(h2)) {
            return deserializationContext.c(h2, (ValueInstantiator) null, jsonParser, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]);
        }
        return deserializationContext.c(h2, j(), jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
    }

    public Object n(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this.k != null) {
            return o(jsonParser, deserializationContext);
        }
        AbstractC9452pp<Object> h = h();
        JsonParser.NumberType v = jsonParser.v();
        if (v == JsonParser.NumberType.INT) {
            if (h != null && !this.r.c()) {
                Object b = this.r.b(deserializationContext, h.b(jsonParser, deserializationContext));
                if (this.f13104o != null) {
                    e(deserializationContext, b);
                }
                return b;
            }
            return this.r.d(deserializationContext, jsonParser.u());
        } else if (v != JsonParser.NumberType.LONG) {
            if (h != null) {
                Object b2 = this.r.b(deserializationContext, h.b(jsonParser, deserializationContext));
                if (this.f13104o != null) {
                    e(deserializationContext, b2);
                }
                return b2;
            }
            return deserializationContext.c(c(), j(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.y());
        } else if (h != null && !this.r.c()) {
            Object b3 = this.r.b(deserializationContext, h.b(jsonParser, deserializationContext));
            if (this.f13104o != null) {
                e(deserializationContext, b3);
            }
            return b3;
        } else {
            return this.r.c(deserializationContext, jsonParser.w());
        }
    }

    public Object r(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this.k != null) {
            return o(jsonParser, deserializationContext);
        }
        AbstractC9452pp<Object> h = h();
        if (h != null && !this.r.h()) {
            Object b = this.r.b(deserializationContext, h.b(jsonParser, deserializationContext));
            if (this.f13104o != null) {
                e(deserializationContext, b);
            }
            return b;
        }
        return this.r.a(deserializationContext, jsonParser.A());
    }

    public Object k(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonParser.NumberType v = jsonParser.v();
        if (v == JsonParser.NumberType.DOUBLE || v == JsonParser.NumberType.FLOAT) {
            AbstractC9452pp<Object> h = h();
            if (h != null && !this.r.e()) {
                Object b = this.r.b(deserializationContext, h.b(jsonParser, deserializationContext));
                if (this.f13104o != null) {
                    e(deserializationContext, b);
                }
                return b;
            }
            return this.r.a(deserializationContext, jsonParser.p());
        }
        AbstractC9452pp<Object> h2 = h();
        if (h2 != null) {
            return this.r.b(deserializationContext, h2.b(jsonParser, deserializationContext));
        }
        return deserializationContext.c(c(), j(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.y());
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext) {
        AbstractC9452pp<Object> h = h();
        if (h != null && !this.r.a()) {
            Object b = this.r.b(deserializationContext, h.b(jsonParser, deserializationContext));
            if (this.f13104o != null) {
                e(deserializationContext, b);
            }
            return b;
        }
        return this.r.c(deserializationContext, jsonParser.o() == JsonToken.VALUE_TRUE);
    }

    public Object g(JsonParser jsonParser, DeserializationContext deserializationContext) {
        AbstractC9452pp<Object> abstractC9452pp = this.d;
        if (abstractC9452pp != null || (abstractC9452pp = this.i) != null) {
            Object e = this.r.e(deserializationContext, abstractC9452pp.b(jsonParser, deserializationContext));
            if (this.f13104o != null) {
                e(deserializationContext, e);
            }
            return e;
        } else if (deserializationContext.d(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            JsonToken Q = jsonParser.Q();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (Q == jsonToken && deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return null;
            }
            Object b = b(jsonParser, deserializationContext);
            if (jsonParser.Q() != jsonToken) {
                F(jsonParser, deserializationContext);
            }
            return b;
        } else if (deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            if (jsonParser.Q() == JsonToken.END_ARRAY) {
                return null;
            }
            return deserializationContext.c(h(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
        } else {
            return deserializationContext.d(h(deserializationContext), jsonParser);
        }
    }

    public Object m(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this.k != null) {
            return o(jsonParser, deserializationContext);
        }
        AbstractC9452pp<Object> h = h();
        if (h != null && !this.r.h()) {
            Object b = this.r.b(deserializationContext, h.b(jsonParser, deserializationContext));
            if (this.f13104o != null) {
                e(deserializationContext, b);
            }
            return b;
        }
        Object q = jsonParser.q();
        return (q == null || this.f.b(q.getClass())) ? q : deserializationContext.a(this.f, q, jsonParser);
    }

    public void e(DeserializationContext deserializationContext, Object obj) {
        for (ValueInjector valueInjector : this.f13104o) {
            valueInjector.c(deserializationContext, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c(DeserializationContext deserializationContext, Object obj, C9542rZ c9542rZ) {
        c9542rZ.o();
        JsonParser m = c9542rZ.m();
        while (m.Q() != JsonToken.END_OBJECT) {
            String l = m.l();
            m.Q();
            d(m, deserializationContext, obj, l);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        Set<String> set = this.h;
        if (set != null && set.contains(str)) {
            a(jsonParser, deserializationContext, obj, str);
            return;
        }
        SettableAnyProperty settableAnyProperty = this.e;
        if (settableAnyProperty != null) {
            try {
                settableAnyProperty.c(jsonParser, deserializationContext, obj, str);
                return;
            } catch (Exception e) {
                b(e, obj, str, deserializationContext);
                return;
            }
        }
        d(jsonParser, deserializationContext, obj, str);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        if (this.l) {
            jsonParser.T();
            return;
        }
        Set<String> set = this.h;
        if (set != null && set.contains(str)) {
            a(jsonParser, deserializationContext, obj, str);
        }
        super.d(jsonParser, deserializationContext, obj, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        if (deserializationContext.d(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            throw IgnoredPropertyException.d(jsonParser, obj, str, d());
        }
        jsonParser.T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, C9542rZ c9542rZ) {
        AbstractC9452pp<Object> a2 = a(deserializationContext, obj, c9542rZ);
        if (a2 == null) {
            if (c9542rZ != null) {
                obj = c(deserializationContext, obj, c9542rZ);
            }
            return jsonParser != null ? e(jsonParser, deserializationContext, obj) : obj;
        }
        if (c9542rZ != null) {
            c9542rZ.o();
            JsonParser m = c9542rZ.m();
            m.Q();
            obj = a2.e(m, deserializationContext, obj);
        }
        return jsonParser != null ? a2.e(jsonParser, deserializationContext, obj) : obj;
    }

    protected AbstractC9452pp<Object> a(DeserializationContext deserializationContext, Object obj, C9542rZ c9542rZ) {
        AbstractC9452pp<Object> abstractC9452pp;
        synchronized (this) {
            HashMap<ClassKey, AbstractC9452pp<Object>> hashMap = this.t;
            abstractC9452pp = hashMap == null ? null : hashMap.get(new ClassKey(obj.getClass()));
        }
        if (abstractC9452pp != null) {
            return abstractC9452pp;
        }
        AbstractC9452pp<Object> c = deserializationContext.c(deserializationContext.a(obj.getClass()));
        if (c != null) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = new HashMap<>();
                }
                this.t.put(new ClassKey(obj.getClass()), c);
            }
        }
        return c;
    }

    public void b(Throwable th, Object obj, String str, DeserializationContext deserializationContext) {
        throw JsonMappingException.d(a(th, deserializationContext), obj, str);
    }

    private Throwable a(Throwable th, DeserializationContext deserializationContext) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C9537rU.b(th);
        boolean z = deserializationContext == null || deserializationContext.d(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonProcessingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            C9537rU.h(th);
        }
        return th;
    }

    public Object c(Throwable th, DeserializationContext deserializationContext) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C9537rU.b(th);
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (deserializationContext != null && !deserializationContext.d(DeserializationFeature.WRAP_EXCEPTIONS)) {
            C9537rU.h(th);
        }
        return deserializationContext.d(this.f.h(), (Object) null, th);
    }
}
