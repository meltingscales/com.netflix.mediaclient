package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9509qt;
import o.AbstractC9544rb;
import o.C9471qH;
import o.C9520rD;
import o.C9529rM;
import o.C9537rU;
import o.C9563ru;
import o.C9565rw;
import o.InterfaceC9478qO;
import o.InterfaceC9480qQ;
import o.InterfaceC9486qW;
import o.InterfaceC9517rA;
import o.InterfaceC9535rS;
import o.InterfaceC9562rt;
import o.InterfaceC9567ry;

/* loaded from: classes5.dex */
public abstract class BeanSerializerBase extends StdSerializer<Object> implements InterfaceC9562rt, InterfaceC9517rA {
    protected static final PropertyName c = new PropertyName("#object-ref");
    public static final BeanPropertyWriter[] d = new BeanPropertyWriter[0];
    public final C9563ru b;
    public final C9520rD f;
    public final BeanPropertyWriter[] g;
    public final Object h;
    public final BeanPropertyWriter[] i;
    protected final JavaType j;
    protected final JsonFormat.Shape l;

    /* renamed from: o  reason: collision with root package name */
    protected final AnnotatedMember f13110o;

    protected abstract BeanSerializerBase a();

    public abstract BeanSerializerBase b(Object obj);

    public abstract BeanSerializerBase b(C9520rD c9520rD);

    @Override // o.AbstractC9453pq
    public boolean b() {
        return this.f != null;
    }

    protected abstract BeanSerializerBase e(Set<String> set);

    public BeanSerializerBase(JavaType javaType, C9565rw c9565rw, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType);
        this.j = javaType;
        this.i = beanPropertyWriterArr;
        this.g = beanPropertyWriterArr2;
        if (c9565rw == null) {
            this.f13110o = null;
            this.b = null;
            this.h = null;
            this.f = null;
            this.l = null;
            return;
        }
        this.f13110o = c9565rw.j();
        this.b = c9565rw.b();
        this.h = c9565rw.c();
        this.f = c9565rw.h();
        JsonFormat.Value e = c9565rw.a().e(null);
        this.l = e != null ? e.a() : null;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase.q);
        this.j = beanSerializerBase.j;
        this.i = beanPropertyWriterArr;
        this.g = beanPropertyWriterArr2;
        this.f13110o = beanSerializerBase.f13110o;
        this.b = beanSerializerBase.b;
        this.f = beanSerializerBase.f;
        this.h = beanSerializerBase.h;
        this.l = beanSerializerBase.l;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, C9520rD c9520rD) {
        this(beanSerializerBase, c9520rD, beanSerializerBase.h);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, C9520rD c9520rD, Object obj) {
        super(beanSerializerBase.q);
        this.j = beanSerializerBase.j;
        this.i = beanSerializerBase.i;
        this.g = beanSerializerBase.g;
        this.f13110o = beanSerializerBase.f13110o;
        this.b = beanSerializerBase.b;
        this.f = c9520rD;
        this.h = obj;
        this.l = beanSerializerBase.l;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set) {
        super(beanSerializerBase.q);
        this.j = beanSerializerBase.j;
        BeanPropertyWriter[] beanPropertyWriterArr = beanSerializerBase.i;
        BeanPropertyWriter[] beanPropertyWriterArr2 = beanSerializerBase.g;
        int length = beanPropertyWriterArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = beanPropertyWriterArr2 == null ? null : new ArrayList(length);
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (set == null || !set.contains(beanPropertyWriter.a())) {
                arrayList.add(beanPropertyWriter);
                if (beanPropertyWriterArr2 != null) {
                    arrayList2.add(beanPropertyWriterArr2[i]);
                }
            }
        }
        this.i = (BeanPropertyWriter[]) arrayList.toArray(new BeanPropertyWriter[arrayList.size()]);
        this.g = arrayList2 != null ? (BeanPropertyWriter[]) arrayList2.toArray(new BeanPropertyWriter[arrayList2.size()]) : null;
        this.f13110o = beanSerializerBase.f13110o;
        this.b = beanSerializerBase.b;
        this.f = beanSerializerBase.f;
        this.h = beanSerializerBase.h;
        this.l = beanSerializerBase.l;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        this(beanSerializerBase, c(beanSerializerBase.i, nameTransformer), c(beanSerializerBase.g, nameTransformer));
    }

    private static final BeanPropertyWriter[] c(BeanPropertyWriter[] beanPropertyWriterArr, NameTransformer nameTransformer) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == 0 || nameTransformer == null || nameTransformer == NameTransformer.e) {
            return beanPropertyWriterArr;
        }
        int length = beanPropertyWriterArr.length;
        BeanPropertyWriter[] beanPropertyWriterArr2 = new BeanPropertyWriter[length];
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (beanPropertyWriter != null) {
                beanPropertyWriterArr2[i] = beanPropertyWriter.a(nameTransformer);
            }
        }
        return beanPropertyWriterArr2;
    }

    @Override // o.InterfaceC9517rA
    public void a(AbstractC9459pw abstractC9459pw) {
        BeanPropertyWriter beanPropertyWriter;
        AbstractC9544rb abstractC9544rb;
        AbstractC9453pq<Object> c2;
        BeanPropertyWriter beanPropertyWriter2;
        BeanPropertyWriter[] beanPropertyWriterArr = this.g;
        int length = beanPropertyWriterArr == null ? 0 : beanPropertyWriterArr.length;
        int length2 = this.i.length;
        for (int i = 0; i < length2; i++) {
            BeanPropertyWriter beanPropertyWriter3 = this.i[i];
            if (!beanPropertyWriter3.o() && !beanPropertyWriter3.f() && (c2 = abstractC9459pw.c(beanPropertyWriter3)) != null) {
                beanPropertyWriter3.c(c2);
                if (i < length && (beanPropertyWriter2 = this.g[i]) != null) {
                    beanPropertyWriter2.c(c2);
                }
            }
            if (!beanPropertyWriter3.m()) {
                AbstractC9453pq<Object> a = a(abstractC9459pw, beanPropertyWriter3);
                if (a == null) {
                    JavaType h = beanPropertyWriter3.h();
                    if (h == null) {
                        h = beanPropertyWriter3.d();
                        if (!h.v()) {
                            if (h.x() || h.b() > 0) {
                                beanPropertyWriter3.a(h);
                            }
                        }
                    }
                    AbstractC9453pq<Object> d2 = abstractC9459pw.d(h, beanPropertyWriter3);
                    a = (h.x() && (abstractC9544rb = (AbstractC9544rb) h.j().m()) != null && (d2 instanceof ContainerSerializer)) ? ((ContainerSerializer) d2).c(abstractC9544rb) : d2;
                }
                if (i < length && (beanPropertyWriter = this.g[i]) != null) {
                    beanPropertyWriter.d(a);
                } else {
                    beanPropertyWriter3.d(a);
                }
            }
        }
        C9563ru c9563ru = this.b;
        if (c9563ru != null) {
            c9563ru.c(abstractC9459pw);
        }
    }

    protected AbstractC9453pq<Object> a(AbstractC9459pw abstractC9459pw, BeanPropertyWriter beanPropertyWriter) {
        AnnotatedMember e;
        Object y;
        AnnotationIntrospector g = abstractC9459pw.g();
        if (g == null || (e = beanPropertyWriter.e()) == null || (y = g.y(e)) == null) {
            return null;
        }
        InterfaceC9535rS<Object, Object> b = abstractC9459pw.b(beanPropertyWriter.e(), y);
        JavaType a = b.a(abstractC9459pw.e());
        return new StdDelegatingSerializer(b, a, a.D() ? null : abstractC9459pw.d(a, beanPropertyWriter));
    }

    @Override // o.InterfaceC9562rt
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        JsonFormat.Shape shape;
        Object obj;
        C9520rD b;
        Object obj2;
        C9520rD a;
        BeanPropertyWriter beanPropertyWriter;
        Object obj3;
        C9471qH a2;
        AnnotationIntrospector g = abstractC9459pw.g();
        Set<String> set = null;
        AnnotatedMember e = (beanProperty == null || g == null) ? null : beanProperty.e();
        SerializationConfig c2 = abstractC9459pw.c();
        JsonFormat.Value c3 = c(abstractC9459pw, beanProperty, c());
        if (c3 == null || !c3.g()) {
            shape = null;
        } else {
            shape = c3.a();
            if (shape != JsonFormat.Shape.ANY && shape != this.l) {
                if (C9537rU.t(this.q)) {
                    int i = AnonymousClass3.a[shape.ordinal()];
                    if (i == 1 || i == 2 || i == 3) {
                        return abstractC9459pw.d(EnumSerializer.a(this.j.h(), abstractC9459pw.c(), c2.j(this.j), c3), beanProperty);
                    }
                } else if (shape == JsonFormat.Shape.NATURAL && ((!this.j.B() || !Map.class.isAssignableFrom(this.q)) && Map.Entry.class.isAssignableFrom(this.q))) {
                    JavaType c4 = this.j.c(Map.Entry.class);
                    return abstractC9459pw.d(new MapEntrySerializer(this.j, c4.a(0), c4.a(1), false, null, beanProperty), beanProperty);
                }
            }
        }
        C9520rD c9520rD = this.f;
        if (e != null) {
            JsonIgnoreProperties.Value p = g.p(e);
            Set<String> b2 = p != null ? p.b() : null;
            C9471qH n = g.n(e);
            if (n == null) {
                if (c9520rD != null && (a2 = g.a(e, null)) != null) {
                    c9520rD = this.f.a(a2.d());
                }
                obj2 = null;
            } else {
                C9471qH a3 = g.a(e, n);
                Class<? extends ObjectIdGenerator<?>> c5 = a3.c();
                JavaType javaType = abstractC9459pw.e().b(abstractC9459pw.c((Type) c5), ObjectIdGenerator.class)[0];
                if (c5 == ObjectIdGenerators.PropertyGenerator.class) {
                    String c6 = a3.e().c();
                    int length = this.i.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 == length) {
                            abstractC9459pw.c(this.j, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", c().getName(), c6));
                        }
                        beanPropertyWriter = this.i[i2];
                        if (c6.equals(beanPropertyWriter.a())) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 > 0) {
                        BeanPropertyWriter[] beanPropertyWriterArr = this.i;
                        System.arraycopy(beanPropertyWriterArr, 0, beanPropertyWriterArr, 1, i2);
                        this.i[0] = beanPropertyWriter;
                        BeanPropertyWriter[] beanPropertyWriterArr2 = this.g;
                        if (beanPropertyWriterArr2 != null) {
                            BeanPropertyWriter beanPropertyWriter2 = beanPropertyWriterArr2[i2];
                            System.arraycopy(beanPropertyWriterArr2, 0, beanPropertyWriterArr2, 1, i2);
                            this.g[0] = beanPropertyWriter2;
                        }
                    }
                    obj2 = null;
                    a = C9520rD.a(beanPropertyWriter.d(), null, new PropertyBasedObjectIdGenerator(a3, beanPropertyWriter), a3.d());
                } else {
                    obj2 = null;
                    a = C9520rD.a(javaType, a3.e(), abstractC9459pw.d(e, a3), a3.d());
                }
                c9520rD = a;
            }
            Object h = g.h((AbstractC9509qt) e);
            obj = (h == null || ((obj3 = this.h) != null && h.equals(obj3))) ? obj2 : h;
            set = b2;
        } else {
            obj = null;
        }
        BeanSerializerBase b3 = (c9520rD == null || (b = c9520rD.b(abstractC9459pw.d(c9520rD.c, beanProperty))) == this.f) ? this : b(b);
        if (set != null && !set.isEmpty()) {
            b3 = b3.e(set);
        }
        if (obj != null) {
            b3 = b3.b(obj);
        }
        if (shape == null) {
            shape = this.l;
        }
        return shape == JsonFormat.Shape.ARRAY ? b3.a() : b3;
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            a = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonFormat.Shape.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonFormat.Shape.NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // o.AbstractC9453pq
    public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        if (this.f != null) {
            jsonGenerator.e(obj);
            a(obj, jsonGenerator, abstractC9459pw, abstractC9544rb);
            return;
        }
        jsonGenerator.e(obj);
        WritableTypeId d2 = d(abstractC9544rb, obj, JsonToken.START_OBJECT);
        abstractC9544rb.b(jsonGenerator, d2);
        if (this.h != null) {
            b(obj, jsonGenerator, abstractC9459pw);
        } else {
            c(obj, jsonGenerator, abstractC9459pw);
        }
        abstractC9544rb.c(jsonGenerator, d2);
    }

    public final void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, boolean z) {
        C9520rD c9520rD = this.f;
        C9529rM c2 = abstractC9459pw.c(obj, c9520rD.e);
        if (c2.a(jsonGenerator, abstractC9459pw, c9520rD)) {
            return;
        }
        Object e = c2.e(obj);
        if (c9520rD.a) {
            c9520rD.d.e(e, jsonGenerator, abstractC9459pw);
            return;
        }
        if (z) {
            jsonGenerator.i(obj);
        }
        c2.b(jsonGenerator, abstractC9459pw, c9520rD);
        if (this.h != null) {
            b(obj, jsonGenerator, abstractC9459pw);
        } else {
            c(obj, jsonGenerator, abstractC9459pw);
        }
        if (z) {
            jsonGenerator.o();
        }
    }

    public final void a(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        C9520rD c9520rD = this.f;
        C9529rM c2 = abstractC9459pw.c(obj, c9520rD.e);
        if (c2.a(jsonGenerator, abstractC9459pw, c9520rD)) {
            return;
        }
        Object e = c2.e(obj);
        if (c9520rD.a) {
            c9520rD.d.e(e, jsonGenerator, abstractC9459pw);
        } else {
            d(obj, jsonGenerator, abstractC9459pw, abstractC9544rb, c2);
        }
    }

    protected void d(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb, C9529rM c9529rM) {
        C9520rD c9520rD = this.f;
        WritableTypeId d2 = d(abstractC9544rb, obj, JsonToken.START_OBJECT);
        abstractC9544rb.b(jsonGenerator, d2);
        c9529rM.b(jsonGenerator, abstractC9459pw, c9520rD);
        if (this.h != null) {
            b(obj, jsonGenerator, abstractC9459pw);
        } else {
            c(obj, jsonGenerator, abstractC9459pw);
        }
        abstractC9544rb.c(jsonGenerator, d2);
    }

    public final WritableTypeId d(AbstractC9544rb abstractC9544rb, Object obj, JsonToken jsonToken) {
        AnnotatedMember annotatedMember = this.f13110o;
        if (annotatedMember == null) {
            return abstractC9544rb.d(obj, jsonToken);
        }
        Object d2 = annotatedMember.d(obj);
        if (d2 == null) {
            d2 = "";
        }
        return abstractC9544rb.e(obj, jsonToken, d2);
    }

    public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        BeanPropertyWriter[] beanPropertyWriterArr = (this.g == null || abstractC9459pw.a() == null) ? this.i : this.g;
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.d(obj, jsonGenerator, abstractC9459pw);
                }
                i++;
            }
            C9563ru c9563ru = this.b;
            if (c9563ru != null) {
                c9563ru.b(obj, jsonGenerator, abstractC9459pw);
            }
        } catch (Exception e) {
            d(abstractC9459pw, e, obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].a() : "[anySetter]");
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.c(new JsonMappingException.Reference(obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].a() : "[anySetter]"));
            throw jsonMappingException;
        }
    }

    public void b(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        BeanPropertyWriter[] beanPropertyWriterArr = (this.g == null || abstractC9459pw.a() == null) ? this.i : this.g;
        InterfaceC9567ry c2 = c(abstractC9459pw, this.h, obj);
        if (c2 == null) {
            c(obj, jsonGenerator, abstractC9459pw);
            return;
        }
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    c2.e(obj, jsonGenerator, abstractC9459pw, beanPropertyWriter);
                }
                i++;
            }
            C9563ru c9563ru = this.b;
            if (c9563ru != null) {
                c9563ru.c(obj, jsonGenerator, abstractC9459pw, c2);
            }
        } catch (Exception e) {
            d(abstractC9459pw, e, obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].a() : "[anySetter]");
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.c(new JsonMappingException.Reference(obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].a() : "[anySetter]"));
            throw jsonMappingException;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    @Deprecated
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        String a;
        ObjectNode d2 = d("object", true);
        InterfaceC9486qW interfaceC9486qW = (InterfaceC9486qW) this.q.getAnnotation(InterfaceC9486qW.class);
        if (interfaceC9486qW != null && (a = interfaceC9486qW.a()) != null && a.length() > 0) {
            d2.c(SignupConstants.Field.LANG_ID, a);
        }
        ObjectNode B = d2.B();
        Object obj = this.h;
        InterfaceC9567ry c2 = obj != null ? c(abstractC9459pw, obj, (Object) null) : null;
        int i = 0;
        while (true) {
            BeanPropertyWriter[] beanPropertyWriterArr = this.i;
            if (i < beanPropertyWriterArr.length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (c2 == null) {
                    beanPropertyWriter.e(B, abstractC9459pw);
                } else {
                    c2.c(beanPropertyWriter, B, abstractC9459pw);
                }
                i++;
            } else {
                d2.c("properties", B);
                return d2;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        InterfaceC9480qQ i;
        if (interfaceC9478qO == null || (i = interfaceC9478qO.i(javaType)) == null) {
            return;
        }
        AbstractC9459pw c2 = interfaceC9478qO.c();
        Class<?> cls = null;
        int i2 = 0;
        if (this.h != null) {
            InterfaceC9567ry c3 = c(interfaceC9478qO.c(), this.h, (Object) null);
            int length = this.i.length;
            while (i2 < length) {
                c3.a(this.i[i2], i, c2);
                i2++;
            }
            return;
        }
        if (this.g != null && c2 != null) {
            cls = c2.a();
        }
        BeanPropertyWriter[] beanPropertyWriterArr = cls != null ? this.g : this.i;
        int length2 = beanPropertyWriterArr.length;
        while (i2 < length2) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i2];
            if (beanPropertyWriter != null) {
                beanPropertyWriter.d(i, c2);
            }
            i2++;
        }
    }
}
