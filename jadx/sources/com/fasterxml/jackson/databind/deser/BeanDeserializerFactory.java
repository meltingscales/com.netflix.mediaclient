package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC9419pI;
import o.AbstractC9445pi;
import o.AbstractC9449pm;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9465qB;
import o.AbstractC9509qt;
import o.AbstractC9543ra;
import o.C9422pL;
import o.C9471qH;
import o.C9490qa;
import o.C9537rU;
import o.C9541rY;
import o.C9556rn;
import o.InterfaceC9317nM;
import o.InterfaceC9411pA;
import o.InterfaceC9421pK;

/* loaded from: classes5.dex */
public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    private static final Class<?>[] b = {Throwable.class};
    public static final BeanDeserializerFactory e = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    private static final long serialVersionUID = 1;

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    @Override // o.AbstractC9424pN
    public AbstractC9452pp<Object> f(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        JavaType h;
        DeserializationConfig c = deserializationContext.c();
        AbstractC9452pp<?> d = d(javaType, c, abstractC9445pi);
        if (d != null) {
            if (this.d.e()) {
                for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                    d = abstractC9419pI.a(deserializationContext.c(), abstractC9445pi, d);
                }
            }
            return d;
        } else if (javaType.A()) {
            return j(deserializationContext, javaType, abstractC9445pi);
        } else {
            if (javaType.s() && !javaType.C() && !javaType.u() && (h = h(deserializationContext, javaType, abstractC9445pi)) != null) {
                return e(deserializationContext, h, c.a(h));
            }
            AbstractC9452pp<?> i = i(deserializationContext, javaType, abstractC9445pi);
            if (i != null) {
                return i;
            }
            if (b(javaType.h())) {
                a(deserializationContext, javaType, abstractC9445pi);
                return e(deserializationContext, javaType, abstractC9445pi);
            }
            return null;
        }
    }

    @Override // o.AbstractC9424pN
    public AbstractC9452pp<Object> c(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi, Class<?> cls) {
        return g(deserializationContext, javaType, deserializationContext.c().b(deserializationContext.a(cls)));
    }

    protected AbstractC9452pp<?> i(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        AbstractC9452pp<?> d = d(deserializationContext, javaType, abstractC9445pi);
        if (d != null && this.d.e()) {
            for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                d = abstractC9419pI.a(deserializationContext.c(), abstractC9445pi, d);
            }
        }
        return d;
    }

    protected JavaType h(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        for (AbstractC9449pm abstractC9449pm : this.d.d()) {
            JavaType c = abstractC9449pm.c(deserializationContext.c(), abstractC9445pi);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    public AbstractC9452pp<Object> e(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        AbstractC9452pp<?> b2;
        try {
            ValueInstantiator d = d(deserializationContext, abstractC9445pi);
            C9422pL b3 = b(deserializationContext, abstractC9445pi);
            b3.b(d);
            e(deserializationContext, abstractC9445pi, b3);
            c(deserializationContext, abstractC9445pi, b3);
            d(deserializationContext, abstractC9445pi, b3);
            a(deserializationContext, abstractC9445pi, b3);
            DeserializationConfig c = deserializationContext.c();
            if (this.d.e()) {
                for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                    b3 = abstractC9419pI.d(c, abstractC9445pi, b3);
                }
            }
            if (javaType.s() && !d.i()) {
                b2 = b3.a();
            } else {
                b2 = b3.b();
            }
            if (this.d.e()) {
                for (AbstractC9419pI abstractC9419pI2 : this.d.b()) {
                    b2 = abstractC9419pI2.a(c, abstractC9445pi, b2);
                }
            }
            return b2;
        } catch (IllegalArgumentException e2) {
            throw InvalidDefinitionException.d(deserializationContext.m(), C9537rU.d((Throwable) e2), abstractC9445pi, null);
        } catch (NoClassDefFoundError e3) {
            return new C9490qa(e3);
        }
    }

    protected AbstractC9452pp<Object> g(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        try {
            ValueInstantiator d = d(deserializationContext, abstractC9445pi);
            DeserializationConfig c = deserializationContext.c();
            C9422pL b2 = b(deserializationContext, abstractC9445pi);
            b2.b(d);
            e(deserializationContext, abstractC9445pi, b2);
            c(deserializationContext, abstractC9445pi, b2);
            d(deserializationContext, abstractC9445pi, b2);
            a(deserializationContext, abstractC9445pi, b2);
            InterfaceC9411pA.d i = abstractC9445pi.i();
            String str = i == null ? "build" : i.a;
            AnnotatedMethod b3 = abstractC9445pi.b(str, null);
            if (b3 != null && c.f()) {
                C9537rU.b(b3.h(), c.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            b2.c(b3, i);
            if (this.d.e()) {
                for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                    b2 = abstractC9419pI.d(c, abstractC9445pi, b2);
                }
            }
            AbstractC9452pp<?> d2 = b2.d(javaType, str);
            if (this.d.e()) {
                for (AbstractC9419pI abstractC9419pI2 : this.d.b()) {
                    d2 = abstractC9419pI2.a(c, abstractC9445pi, d2);
                }
            }
            return d2;
        } catch (IllegalArgumentException e2) {
            throw InvalidDefinitionException.d(deserializationContext.m(), C9537rU.d((Throwable) e2), abstractC9445pi, null);
        } catch (NoClassDefFoundError e3) {
            return new C9490qa(e3);
        }
    }

    protected void c(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, C9422pL c9422pL) {
        SettableBeanProperty settableBeanProperty;
        PropertyBasedObjectIdGenerator d;
        JavaType javaType;
        C9471qH p = abstractC9445pi.p();
        if (p == null) {
            return;
        }
        Class<? extends ObjectIdGenerator<?>> c = p.c();
        InterfaceC9317nM a = deserializationContext.a(abstractC9445pi.k(), p);
        if (c == ObjectIdGenerators.PropertyGenerator.class) {
            PropertyName e2 = p.e();
            settableBeanProperty = c9422pL.e(e2);
            if (settableBeanProperty == null) {
                throw new IllegalArgumentException("Invalid Object Id definition for " + abstractC9445pi.o().getName() + ": cannot find property with name '" + e2 + "'");
            }
            JavaType d2 = settableBeanProperty.d();
            javaType = d2;
            d = new PropertyBasedObjectIdGenerator(p.f());
        } else {
            JavaType javaType2 = deserializationContext.e().b(deserializationContext.a(c), ObjectIdGenerator.class)[0];
            settableBeanProperty = null;
            d = deserializationContext.d((AbstractC9509qt) abstractC9445pi.k(), p);
            javaType = javaType2;
        }
        AbstractC9452pp<Object> c2 = deserializationContext.c(javaType);
        c9422pL.b(ObjectIdReader.e(javaType, p.e(), d, c2, settableBeanProperty, a));
    }

    public AbstractC9452pp<Object> j(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        SettableBeanProperty a;
        DeserializationConfig c = deserializationContext.c();
        C9422pL b2 = b(deserializationContext, abstractC9445pi);
        b2.b(d(deserializationContext, abstractC9445pi));
        e(deserializationContext, abstractC9445pi, b2);
        AnnotatedMethod b3 = abstractC9445pi.b("initCause", b);
        if (b3 != null && (a = a(deserializationContext, abstractC9445pi, C9541rY.d(deserializationContext.c(), b3, new PropertyName(Payload.PARAM_RENO_CAUSE)), b3.c(0))) != null) {
            b2.d(a, true);
        }
        b2.e("localizedMessage");
        b2.e("suppressed");
        if (this.d.e()) {
            for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                b2 = abstractC9419pI.d(c, abstractC9445pi, b2);
            }
        }
        AbstractC9452pp<?> b4 = b2.b();
        if (b4 instanceof BeanDeserializer) {
            b4 = new ThrowableDeserializer((BeanDeserializer) b4);
        }
        if (this.d.e()) {
            for (AbstractC9419pI abstractC9419pI2 : this.d.b()) {
                b4 = abstractC9419pI2.a(c, abstractC9445pi, b4);
            }
        }
        return b4;
    }

    protected C9422pL b(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi) {
        return new C9422pL(abstractC9445pi, deserializationContext);
    }

    protected void e(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, C9422pL c9422pL) {
        Set<String> emptySet;
        SettableBeanProperty settableBeanProperty;
        CreatorProperty creatorProperty;
        SettableBeanProperty[] d = abstractC9445pi.t().s() ^ true ? c9422pL.i().d(deserializationContext.c()) : null;
        boolean z = d != null;
        JsonIgnoreProperties.Value a = deserializationContext.c().a(abstractC9445pi.o(), abstractC9445pi.k());
        if (a != null) {
            c9422pL.b(a.e());
            emptySet = a.d();
            for (String str : emptySet) {
                c9422pL.e(str);
            }
        } else {
            emptySet = Collections.emptySet();
        }
        Set<String> set = emptySet;
        AnnotatedMember e2 = abstractC9445pi.e();
        if (e2 != null) {
            c9422pL.a(e(deserializationContext, abstractC9445pi, e2));
        } else {
            Set<String> r = abstractC9445pi.r();
            if (r != null) {
                for (String str2 : r) {
                    c9422pL.e(str2);
                }
            }
        }
        boolean z2 = deserializationContext.d(MapperFeature.USE_GETTERS_AS_SETTERS) && deserializationContext.d(MapperFeature.AUTO_DETECT_GETTERS);
        List<AbstractC9465qB> a2 = a(deserializationContext, abstractC9445pi, c9422pL, abstractC9445pi.l(), set);
        if (this.d.e()) {
            for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                a2 = abstractC9419pI.e(deserializationContext.c(), abstractC9445pi, a2);
            }
        }
        for (AbstractC9465qB abstractC9465qB : a2) {
            if (abstractC9465qB.v()) {
                settableBeanProperty = a(deserializationContext, abstractC9445pi, abstractC9465qB, abstractC9465qB.u().c(0));
            } else if (abstractC9465qB.x()) {
                settableBeanProperty = a(deserializationContext, abstractC9445pi, abstractC9465qB, abstractC9465qB.l().a());
            } else {
                AnnotatedMethod m = abstractC9465qB.m();
                if (m != null) {
                    if (z2 && e(m.e())) {
                        if (!c9422pL.d(abstractC9465qB.a())) {
                            settableBeanProperty = a(deserializationContext, abstractC9445pi, abstractC9465qB);
                        }
                    } else if (!abstractC9465qB.y() && abstractC9465qB.n().e() != null) {
                        settableBeanProperty = a(deserializationContext, abstractC9445pi, abstractC9465qB);
                    }
                }
                settableBeanProperty = null;
            }
            if (z && abstractC9465qB.y()) {
                String a3 = abstractC9465qB.a();
                if (d != null) {
                    for (SettableBeanProperty settableBeanProperty2 : d) {
                        if (a3.equals(settableBeanProperty2.a()) && (settableBeanProperty2 instanceof CreatorProperty)) {
                            creatorProperty = (CreatorProperty) settableBeanProperty2;
                            break;
                        }
                    }
                }
                creatorProperty = null;
                if (creatorProperty == null) {
                    ArrayList arrayList = new ArrayList();
                    for (SettableBeanProperty settableBeanProperty3 : d) {
                        arrayList.add(settableBeanProperty3.a());
                    }
                    deserializationContext.d(abstractC9445pi, abstractC9465qB, "Could not find creator property with name '%s' (known Creator properties: %s)", a3, arrayList);
                } else {
                    if (settableBeanProperty != null) {
                        creatorProperty.b(settableBeanProperty);
                    }
                    Class<?>[] i = abstractC9465qB.i();
                    if (i == null) {
                        i = abstractC9445pi.a();
                    }
                    creatorProperty.e(i);
                    c9422pL.c(creatorProperty);
                }
            } else if (settableBeanProperty != null) {
                Class<?>[] i2 = abstractC9465qB.i();
                if (i2 == null) {
                    i2 = abstractC9445pi.a();
                }
                settableBeanProperty.e(i2);
                c9422pL.b(settableBeanProperty);
            }
        }
    }

    private boolean e(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    protected List<AbstractC9465qB> a(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, C9422pL c9422pL, List<AbstractC9465qB> list, Set<String> set) {
        Class<?> p;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap hashMap = new HashMap();
        for (AbstractC9465qB abstractC9465qB : list) {
            String a = abstractC9465qB.a();
            if (!set.contains(a)) {
                if (!abstractC9465qB.y() && (p = abstractC9465qB.p()) != null && e(deserializationContext.c(), abstractC9465qB, p, hashMap)) {
                    c9422pL.e(a);
                } else {
                    arrayList.add(abstractC9465qB);
                }
            }
        }
        return arrayList;
    }

    protected void d(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, C9422pL c9422pL) {
        List<AbstractC9465qB> d = abstractC9445pi.d();
        if (d != null) {
            for (AbstractC9465qB abstractC9465qB : d) {
                c9422pL.a(abstractC9465qB.g(), a(deserializationContext, abstractC9445pi, abstractC9465qB, abstractC9465qB.q()));
            }
        }
    }

    protected void a(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, C9422pL c9422pL) {
        Map<Object, AnnotatedMember> f = abstractC9445pi.f();
        if (f != null) {
            for (Map.Entry<Object, AnnotatedMember> entry : f.entrySet()) {
                AnnotatedMember value = entry.getValue();
                c9422pL.d(PropertyName.b(value.d()), value.a(), abstractC9445pi.n(), value, entry.getKey());
            }
        }
    }

    protected SettableAnyProperty e(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, AnnotatedMember annotatedMember) {
        JavaType f;
        BeanProperty.Std std;
        JavaType javaType;
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            f = annotatedMethod.c(0);
            javaType = e(deserializationContext, annotatedMember, annotatedMethod.c(1));
            std = new BeanProperty.Std(PropertyName.b(annotatedMember.d()), javaType, null, annotatedMember, PropertyMetadata.b);
        } else if (annotatedMember instanceof AnnotatedField) {
            JavaType e2 = e(deserializationContext, annotatedMember, ((AnnotatedField) annotatedMember).a());
            f = e2.f();
            JavaType j = e2.j();
            std = new BeanProperty.Std(PropertyName.b(annotatedMember.d()), e2, null, annotatedMember, PropertyMetadata.b);
            javaType = j;
        } else {
            return (SettableAnyProperty) deserializationContext.c(abstractC9445pi.t(), String.format("Unrecognized mutator type for any setter: %s", annotatedMember.getClass()));
        }
        AbstractC9450pn b2 = b(deserializationContext, annotatedMember);
        if (b2 == null) {
            b2 = (AbstractC9450pn) f.l();
        }
        if (b2 == null) {
            b2 = deserializationContext.e(f, std);
        } else if (b2 instanceof InterfaceC9421pK) {
            b2 = ((InterfaceC9421pK) b2).b(deserializationContext, std);
        }
        AbstractC9450pn abstractC9450pn = b2;
        AbstractC9452pp<?> d = d(deserializationContext, annotatedMember);
        if (d == null) {
            d = (AbstractC9452pp) javaType.l();
        }
        return new SettableAnyProperty(std, annotatedMember, javaType, abstractC9450pn, d != null ? deserializationContext.c(d, (BeanProperty) std, javaType) : d, (AbstractC9543ra) javaType.m());
    }

    protected SettableBeanProperty a(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, AbstractC9465qB abstractC9465qB, JavaType javaType) {
        SettableBeanProperty fieldProperty;
        AnnotatedMember t = abstractC9465qB.t();
        if (t == null) {
            deserializationContext.d(abstractC9445pi, abstractC9465qB, "No non-constructor mutator available", new Object[0]);
        }
        JavaType e2 = e(deserializationContext, t, javaType);
        AbstractC9543ra abstractC9543ra = (AbstractC9543ra) e2.m();
        if (t instanceof AnnotatedMethod) {
            fieldProperty = new MethodProperty(abstractC9465qB, e2, abstractC9543ra, abstractC9445pi.n(), (AnnotatedMethod) t);
        } else {
            fieldProperty = new FieldProperty(abstractC9465qB, e2, abstractC9543ra, abstractC9445pi.n(), (AnnotatedField) t);
        }
        AbstractC9452pp<?> c = c(deserializationContext, t);
        if (c == null) {
            c = (AbstractC9452pp) e2.l();
        }
        if (c != null) {
            fieldProperty = fieldProperty.d(deserializationContext.c(c, (BeanProperty) fieldProperty, e2));
        }
        AnnotationIntrospector.ReferenceProperty f = abstractC9465qB.f();
        if (f != null && f.d()) {
            fieldProperty.d(f.b());
        }
        C9471qH c2 = abstractC9465qB.c();
        if (c2 != null) {
            fieldProperty.e(c2);
        }
        return fieldProperty;
    }

    protected SettableBeanProperty a(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, AbstractC9465qB abstractC9465qB) {
        AnnotatedMethod m = abstractC9465qB.m();
        JavaType e2 = e(deserializationContext, m, m.a());
        SetterlessProperty setterlessProperty = new SetterlessProperty(abstractC9465qB, e2, (AbstractC9543ra) e2.m(), abstractC9445pi.n(), m);
        AbstractC9452pp<?> c = c(deserializationContext, m);
        if (c == null) {
            c = (AbstractC9452pp) e2.l();
        }
        return c != null ? setterlessProperty.d(deserializationContext.c(c, (BeanProperty) setterlessProperty, e2)) : setterlessProperty;
    }

    protected boolean b(Class<?> cls) {
        String c = C9537rU.c(cls);
        if (c != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + c + ") as a Bean");
        } else if (C9537rU.y(cls)) {
            throw new IllegalArgumentException("Cannot deserialize Proxy class " + cls.getName() + " as a Bean");
        } else {
            String c2 = C9537rU.c(cls, true);
            if (c2 == null) {
                return true;
            }
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + c2 + ") as a Bean");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r2 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean e(com.fasterxml.jackson.databind.DeserializationConfig r1, o.AbstractC9465qB r2, java.lang.Class<?> r3, java.util.Map<java.lang.Class<?>, java.lang.Boolean> r4) {
        /*
            r0 = this;
            java.lang.Object r2 = r4.get(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto Ld
            boolean r1 = r2.booleanValue()
            return r1
        Ld:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r3 == r2) goto L34
            boolean r2 = r3.isPrimitive()
            if (r2 == 0) goto L18
            goto L34
        L18:
            o.pC r2 = r1.a(r3)
            java.lang.Boolean r2 = r2.j()
            if (r2 != 0) goto L36
            o.pi r2 = r1.j(r3)
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r1.h()
            o.qs r2 = r2.k()
            java.lang.Boolean r2 = r1.i(r2)
            if (r2 != 0) goto L36
        L34:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L36:
            r4.put(r3, r2)
            boolean r1 = r2.booleanValue()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.e(com.fasterxml.jackson.databind.DeserializationConfig, o.qB, java.lang.Class, java.util.Map):boolean");
    }

    protected void a(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        C9556rn.b().b(deserializationContext, javaType, abstractC9445pi);
    }
}
