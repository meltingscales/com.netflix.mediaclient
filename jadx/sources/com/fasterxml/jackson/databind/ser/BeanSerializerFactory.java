package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.AbstractC9445pi;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9465qB;
import o.AbstractC9544rb;
import o.AbstractC9564rv;
import o.C9471qH;
import o.C9518rB;
import o.C9520rD;
import o.C9537rU;
import o.C9563ru;
import o.C9565rw;
import o.InterfaceC9489qZ;
import o.InterfaceC9517rA;
import o.InterfaceC9522rF;
import o.InterfaceC9535rS;

/* loaded from: classes5.dex */
public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory c = new BeanSerializerFactory(null);
    private static final long serialVersionUID = 1;

    protected BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    protected Iterable<InterfaceC9522rF> c() {
        return this.b.b();
    }

    @Override // o.AbstractC9521rE
    public AbstractC9453pq<Object> e(AbstractC9459pw abstractC9459pw, JavaType javaType) {
        JavaType a;
        SerializationConfig c2 = abstractC9459pw.c();
        AbstractC9445pi b = c2.b(javaType);
        AbstractC9453pq<?> e = e(abstractC9459pw, b.k());
        if (e != null) {
            return e;
        }
        AnnotationIntrospector h = c2.h();
        boolean z = false;
        if (h == null) {
            a = javaType;
        } else {
            try {
                a = h.a(c2, b.k(), javaType);
            } catch (JsonMappingException e2) {
                return (AbstractC9453pq) abstractC9459pw.a(b, e2.getMessage(), new Object[0]);
            }
        }
        if (a != javaType) {
            if (!a.d(javaType.h())) {
                b = c2.b(a);
            }
            z = true;
        }
        InterfaceC9535rS<Object, Object> m = b.m();
        if (m == null) {
            return d(abstractC9459pw, a, b, z);
        }
        JavaType a2 = m.a(abstractC9459pw.e());
        if (!a2.d(a.h())) {
            b = c2.b(a2);
            e = e(abstractC9459pw, b.k());
        }
        if (e == null && !a2.D()) {
            e = d(abstractC9459pw, a2, b, true);
        }
        return new StdDelegatingSerializer(m, a2, e);
    }

    protected AbstractC9453pq<?> d(AbstractC9459pw abstractC9459pw, JavaType javaType, AbstractC9445pi abstractC9445pi, boolean z) {
        AbstractC9453pq<?> abstractC9453pq;
        SerializationConfig c2 = abstractC9459pw.c();
        AbstractC9453pq<?> abstractC9453pq2 = null;
        if (javaType.x()) {
            if (!z) {
                z = b(c2, abstractC9445pi, (AbstractC9544rb) null);
            }
            abstractC9453pq = e(abstractC9459pw, javaType, abstractC9445pi, z);
            if (abstractC9453pq != null) {
                return abstractC9453pq;
            }
        } else {
            if (javaType.d()) {
                abstractC9453pq = a(abstractC9459pw, (ReferenceType) javaType, abstractC9445pi, z);
            } else {
                Iterator<InterfaceC9522rF> it = c().iterator();
                while (it.hasNext() && (abstractC9453pq2 = it.next().b(c2, javaType, abstractC9445pi)) == null) {
                }
                abstractC9453pq = abstractC9453pq2;
            }
            if (abstractC9453pq == null) {
                abstractC9453pq = b(abstractC9459pw, javaType, abstractC9445pi);
            }
        }
        if (abstractC9453pq == null && (abstractC9453pq = a(javaType, c2, abstractC9445pi, z)) == null && (abstractC9453pq = a(abstractC9459pw, javaType, abstractC9445pi, z)) == null && (abstractC9453pq = h(abstractC9459pw, javaType, abstractC9445pi, z)) == null) {
            abstractC9453pq = abstractC9459pw.a(abstractC9445pi.o());
        }
        if (abstractC9453pq != null && this.b.a()) {
            for (AbstractC9564rv abstractC9564rv : this.b.c()) {
                abstractC9453pq = abstractC9564rv.b(c2, abstractC9445pi, abstractC9453pq);
            }
        }
        return abstractC9453pq;
    }

    public AbstractC9453pq<Object> h(AbstractC9459pw abstractC9459pw, JavaType javaType, AbstractC9445pi abstractC9445pi, boolean z) {
        if (d(javaType.h()) || javaType.u()) {
            return c(abstractC9459pw, javaType, abstractC9445pi, z);
        }
        return null;
    }

    public AbstractC9544rb e(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) {
        InterfaceC9489qZ<?> c2 = serializationConfig.h().c(serializationConfig, annotatedMember, javaType);
        if (c2 == null) {
            return b(serializationConfig, javaType);
        }
        return c2.d(serializationConfig, javaType, serializationConfig.z().d(serializationConfig, annotatedMember, javaType));
    }

    public AbstractC9544rb a(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) {
        JavaType j = javaType.j();
        InterfaceC9489qZ<?> d = serializationConfig.h().d(serializationConfig, annotatedMember, javaType);
        if (d == null) {
            return b(serializationConfig, j);
        }
        return d.d(serializationConfig, j, serializationConfig.z().d(serializationConfig, annotatedMember, j));
    }

    protected AbstractC9453pq<Object> c(AbstractC9459pw abstractC9459pw, JavaType javaType, AbstractC9445pi abstractC9445pi, boolean z) {
        List<BeanPropertyWriter> d;
        if (abstractC9445pi.o() == Object.class) {
            return abstractC9459pw.a(Object.class);
        }
        SerializationConfig c2 = abstractC9459pw.c();
        C9565rw d2 = d(abstractC9445pi);
        d2.e(c2);
        List<BeanPropertyWriter> e = e(abstractC9459pw, abstractC9445pi, d2);
        if (e == null) {
            d = new ArrayList<>();
        } else {
            d = d(abstractC9459pw, abstractC9445pi, d2, e);
        }
        abstractC9459pw.g().e(c2, abstractC9445pi.k(), d);
        if (this.b.a()) {
            for (AbstractC9564rv abstractC9564rv : this.b.c()) {
                d = abstractC9564rv.d(c2, abstractC9445pi, d);
            }
        }
        List<BeanPropertyWriter> a = a(c2, abstractC9445pi, d);
        if (this.b.a()) {
            for (AbstractC9564rv abstractC9564rv2 : this.b.c()) {
                a = abstractC9564rv2.e(c2, abstractC9445pi, a);
            }
        }
        d2.e(c(abstractC9459pw, abstractC9445pi, a));
        d2.b(a);
        d2.a(e(c2, abstractC9445pi));
        AnnotatedMember c3 = abstractC9445pi.c();
        if (c3 != null) {
            JavaType a2 = c3.a();
            JavaType j = a2.j();
            AbstractC9544rb b = b(c2, j);
            AbstractC9453pq<Object> e2 = e(abstractC9459pw, c3);
            if (e2 == null) {
                e2 = MapSerializer.d(null, a2, c2.a(MapperFeature.USE_STATIC_TYPING), b, null, null, null);
            }
            d2.d(new C9563ru(new BeanProperty.Std(PropertyName.b(c3.d()), j, null, c3, PropertyMetadata.b), c3, e2));
        }
        e(c2, d2);
        if (this.b.a()) {
            for (AbstractC9564rv abstractC9564rv3 : this.b.c()) {
                d2 = abstractC9564rv3.c(c2, abstractC9445pi, d2);
            }
        }
        try {
            AbstractC9453pq<?> e3 = d2.e();
            return (e3 == null && (e3 = a(c2, javaType, abstractC9445pi, z)) == null && abstractC9445pi.u()) ? d2.d() : e3;
        } catch (RuntimeException e4) {
            return (AbstractC9453pq) abstractC9459pw.a(abstractC9445pi, "Failed to construct BeanSerializer for %s: (%s) %s", abstractC9445pi.t(), e4.getClass().getName(), e4.getMessage());
        }
    }

    protected C9520rD c(AbstractC9459pw abstractC9459pw, AbstractC9445pi abstractC9445pi, List<BeanPropertyWriter> list) {
        C9471qH p = abstractC9445pi.p();
        if (p == null) {
            return null;
        }
        Class<? extends ObjectIdGenerator<?>> c2 = p.c();
        if (c2 == ObjectIdGenerators.PropertyGenerator.class) {
            String c3 = p.e().c();
            int size = list.size();
            for (int i = 0; i != size; i++) {
                BeanPropertyWriter beanPropertyWriter = list.get(i);
                if (c3.equals(beanPropertyWriter.a())) {
                    if (i > 0) {
                        list.remove(i);
                        list.add(0, beanPropertyWriter);
                    }
                    return C9520rD.a(beanPropertyWriter.d(), null, new PropertyBasedObjectIdGenerator(p, beanPropertyWriter), p.d());
                }
            }
            throw new IllegalArgumentException("Invalid Object Id definition for " + abstractC9445pi.o().getName() + ": cannot find property with name '" + c3 + "'");
        }
        return C9520rD.a(abstractC9459pw.e().b(abstractC9459pw.c((Type) c2), ObjectIdGenerator.class)[0], p.e(), abstractC9459pw.d(abstractC9445pi.k(), p), p.d());
    }

    protected BeanPropertyWriter a(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return FilteredBeanPropertyWriter.c(beanPropertyWriter, clsArr);
    }

    protected C9518rB d(SerializationConfig serializationConfig, AbstractC9445pi abstractC9445pi) {
        return new C9518rB(serializationConfig, abstractC9445pi);
    }

    protected C9565rw d(AbstractC9445pi abstractC9445pi) {
        return new C9565rw(abstractC9445pi);
    }

    protected boolean d(Class<?> cls) {
        return C9537rU.c(cls) == null && !C9537rU.y(cls);
    }

    protected List<BeanPropertyWriter> e(AbstractC9459pw abstractC9459pw, AbstractC9445pi abstractC9445pi, C9565rw c9565rw) {
        List<AbstractC9465qB> l = abstractC9445pi.l();
        SerializationConfig c2 = abstractC9459pw.c();
        c(c2, abstractC9445pi, l);
        if (c2.a(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            d(c2, abstractC9445pi, l);
        }
        if (l.isEmpty()) {
            return null;
        }
        boolean b = b(c2, abstractC9445pi, (AbstractC9544rb) null);
        C9518rB d = d(c2, abstractC9445pi);
        ArrayList arrayList = new ArrayList(l.size());
        for (AbstractC9465qB abstractC9465qB : l) {
            AnnotatedMember h = abstractC9465qB.h();
            if (!abstractC9465qB.A()) {
                AnnotationIntrospector.ReferenceProperty f = abstractC9465qB.f();
                if (f == null || !f.c()) {
                    if (h instanceof AnnotatedMethod) {
                        arrayList.add(b(abstractC9459pw, abstractC9465qB, d, b, (AnnotatedMethod) h));
                    } else {
                        arrayList.add(b(abstractC9459pw, abstractC9465qB, d, b, (AnnotatedField) h));
                    }
                }
            } else if (h != null) {
                c9565rw.b(h);
            }
        }
        return arrayList;
    }

    protected List<BeanPropertyWriter> a(SerializationConfig serializationConfig, AbstractC9445pi abstractC9445pi, List<BeanPropertyWriter> list) {
        JsonIgnoreProperties.Value a = serializationConfig.a(abstractC9445pi.o(), abstractC9445pi.k());
        if (a != null) {
            Set<String> b = a.b();
            if (!b.isEmpty()) {
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (it.hasNext()) {
                    if (b.contains(it.next().a())) {
                        it.remove();
                    }
                }
            }
        }
        return list;
    }

    protected void e(SerializationConfig serializationConfig, C9565rw c9565rw) {
        List<BeanPropertyWriter> i = c9565rw.i();
        boolean a = serializationConfig.a(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = i.size();
        BeanPropertyWriter[] beanPropertyWriterArr = new BeanPropertyWriter[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            BeanPropertyWriter beanPropertyWriter = i.get(i3);
            Class<?>[] g = beanPropertyWriter.g();
            if (g != null && g.length != 0) {
                i2++;
                beanPropertyWriterArr[i3] = a(beanPropertyWriter, g);
            } else if (a) {
                beanPropertyWriterArr[i3] = beanPropertyWriter;
            }
        }
        if (a && i2 == 0) {
            return;
        }
        c9565rw.b(beanPropertyWriterArr);
    }

    protected void c(SerializationConfig serializationConfig, AbstractC9445pi abstractC9445pi, List<AbstractC9465qB> list) {
        AnnotationIntrospector h = serializationConfig.h();
        HashMap hashMap = new HashMap();
        Iterator<AbstractC9465qB> it = list.iterator();
        while (it.hasNext()) {
            AbstractC9465qB next = it.next();
            if (next.h() == null) {
                it.remove();
            } else {
                Class<?> p = next.p();
                Boolean bool = (Boolean) hashMap.get(p);
                if (bool == null) {
                    bool = serializationConfig.a(p).j();
                    if (bool == null && (bool = h.i(serializationConfig.j(p).k())) == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(p, bool);
                }
                if (bool.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    protected void d(SerializationConfig serializationConfig, AbstractC9445pi abstractC9445pi, List<AbstractC9465qB> list) {
        Iterator<AbstractC9465qB> it = list.iterator();
        while (it.hasNext()) {
            AbstractC9465qB next = it.next();
            if (!next.e() && !next.D()) {
                it.remove();
            }
        }
    }

    protected List<BeanPropertyWriter> d(AbstractC9459pw abstractC9459pw, AbstractC9445pi abstractC9445pi, C9565rw c9565rw, List<BeanPropertyWriter> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i);
            AbstractC9544rb j = beanPropertyWriter.j();
            if (j != null && j.a() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                PropertyName b = PropertyName.b(j.d());
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BeanPropertyWriter next = it.next();
                    if (next != beanPropertyWriter && next.b(b)) {
                        beanPropertyWriter.a((AbstractC9544rb) null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    protected BeanPropertyWriter b(AbstractC9459pw abstractC9459pw, AbstractC9465qB abstractC9465qB, C9518rB c9518rB, boolean z, AnnotatedMember annotatedMember) {
        PropertyName o2 = abstractC9465qB.o();
        JavaType a = annotatedMember.a();
        BeanProperty.Std std = new BeanProperty.Std(o2, a, abstractC9465qB.w(), annotatedMember, abstractC9465qB.n());
        AbstractC9453pq<?> e = e(abstractC9459pw, annotatedMember);
        if (e instanceof InterfaceC9517rA) {
            ((InterfaceC9517rA) e).a(abstractC9459pw);
        }
        return c9518rB.d(abstractC9459pw, abstractC9465qB, a, abstractC9459pw.d(e, std), e(a, abstractC9459pw.c(), annotatedMember), (a.x() || a.d()) ? a(a, abstractC9459pw.c(), annotatedMember) : null, annotatedMember, z);
    }
}
