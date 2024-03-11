package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9465qB;
import o.AbstractC9523rG;
import o.AbstractC9544rb;
import o.C9530rN;
import o.C9531rO;
import o.InterfaceC9478qO;
import o.InterfaceC9562rt;

/* loaded from: classes5.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements InterfaceC9562rt {
    public static final Object d = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected final BeanProperty a;
    protected transient AbstractC9523rG b;
    protected final boolean c;
    protected final JavaType e;
    protected final AbstractC9544rb f;
    protected final Object g;
    protected final AbstractC9453pq<Object> i;
    protected final NameTransformer j;

    protected abstract ReferenceTypeSerializer<T> a(BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, NameTransformer nameTransformer);

    public abstract ReferenceTypeSerializer<T> a(Object obj, boolean z);

    protected abstract boolean b(T t);

    protected abstract Object c(T t);

    protected abstract Object d(T t);

    @Override // o.AbstractC9453pq
    public boolean e() {
        return this.j != null;
    }

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq) {
        super(referenceType);
        this.e = referenceType.c();
        this.a = null;
        this.f = abstractC9544rb;
        this.i = abstractC9453pq;
        this.j = null;
        this.g = null;
        this.c = false;
        this.b = AbstractC9523rG.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, NameTransformer nameTransformer, Object obj, boolean z) {
        super(referenceTypeSerializer);
        this.e = referenceTypeSerializer.e;
        this.b = AbstractC9523rG.c();
        this.a = beanProperty;
        this.f = abstractC9544rb;
        this.i = abstractC9453pq;
        this.j = nameTransformer;
        this.g = obj;
        this.c = z;
    }

    @Override // o.AbstractC9453pq
    public AbstractC9453pq<T> a(NameTransformer nameTransformer) {
        AbstractC9453pq<?> abstractC9453pq = this.i;
        if (abstractC9453pq != null) {
            abstractC9453pq = abstractC9453pq.a(nameTransformer);
        }
        NameTransformer nameTransformer2 = this.j;
        if (nameTransformer2 != null) {
            nameTransformer = NameTransformer.b(nameTransformer, nameTransformer2);
        }
        return (this.i == abstractC9453pq && this.j == nameTransformer) ? this : a(this.a, this.f, abstractC9453pq, nameTransformer);
    }

    @Override // o.InterfaceC9562rt
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        JsonInclude.Value a;
        JsonInclude.Include c;
        Object a2;
        AbstractC9544rb abstractC9544rb = this.f;
        if (abstractC9544rb != null) {
            abstractC9544rb = abstractC9544rb.b(beanProperty);
        }
        AbstractC9453pq<?> d2 = d(abstractC9459pw, beanProperty);
        if (d2 == null) {
            d2 = this.i;
            if (d2 == null) {
                if (c(abstractC9459pw, beanProperty, this.e)) {
                    d2 = d(abstractC9459pw, this.e, beanProperty);
                }
            } else {
                d2 = abstractC9459pw.d(d2, beanProperty);
            }
        }
        ReferenceTypeSerializer<T> a3 = (this.a == beanProperty && this.f == abstractC9544rb && this.i == d2) ? this : a(beanProperty, abstractC9544rb, d2, this.j);
        if (beanProperty == null || (a = beanProperty.a(abstractC9459pw.c(), c())) == null || (c = a.c()) == JsonInclude.Include.USE_DEFAULTS) {
            return a3;
        }
        int i = AnonymousClass5.a[c.ordinal()];
        boolean z = true;
        if (i != 1) {
            a2 = null;
            if (i != 2) {
                if (i == 3) {
                    a2 = d;
                } else if (i == 4) {
                    a2 = abstractC9459pw.e((AbstractC9465qB) null, a.e());
                    if (a2 != null) {
                        z = abstractC9459pw.a(a2);
                    }
                } else if (i != 5) {
                    z = false;
                }
            } else if (this.e.d()) {
                a2 = d;
            }
        } else {
            a2 = C9531rO.a(this.e);
            if (a2 != null && a2.getClass().isArray()) {
                a2 = C9530rN.e(a2);
            }
        }
        return (this.g == a2 && this.c == z) ? a3 : a3.a(a2, z);
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected boolean c(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.D()) {
            return false;
        }
        if (javaType.v() || javaType.z()) {
            return true;
        }
        AnnotationIntrospector g = abstractC9459pw.g();
        if (g != null && beanProperty != null && beanProperty.e() != null) {
            JsonSerialize.Typing v = g.v(beanProperty.e());
            if (v == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (v == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return abstractC9459pw.a(MapperFeature.USE_STATIC_TYPING);
    }

    @Override // o.AbstractC9453pq
    public boolean c(AbstractC9459pw abstractC9459pw, T t) {
        if (b(t)) {
            Object d2 = d((ReferenceTypeSerializer<T>) t);
            if (d2 == null) {
                return this.c;
            }
            if (this.g == null) {
                return false;
            }
            AbstractC9453pq<Object> abstractC9453pq = this.i;
            if (abstractC9453pq == null) {
                try {
                    abstractC9453pq = e(abstractC9459pw, d2.getClass());
                } catch (JsonMappingException e) {
                    throw new RuntimeJsonMappingException(e);
                }
            }
            Object obj = this.g;
            if (obj == d) {
                return abstractC9453pq.c(abstractC9459pw, d2);
            }
            return obj.equals(d2);
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void e(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object c = c(t);
        if (c == null) {
            if (this.j == null) {
                abstractC9459pw.a(jsonGenerator);
                return;
            }
            return;
        }
        AbstractC9453pq<Object> abstractC9453pq = this.i;
        if (abstractC9453pq == null) {
            abstractC9453pq = e(abstractC9459pw, c.getClass());
        }
        AbstractC9544rb abstractC9544rb = this.f;
        if (abstractC9544rb != null) {
            abstractC9453pq.c(c, jsonGenerator, abstractC9459pw, abstractC9544rb);
        } else {
            abstractC9453pq.e(c, jsonGenerator, abstractC9459pw);
        }
    }

    @Override // o.AbstractC9453pq
    public void c(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        Object c = c(t);
        if (c == null) {
            if (this.j == null) {
                abstractC9459pw.a(jsonGenerator);
                return;
            }
            return;
        }
        AbstractC9453pq<Object> abstractC9453pq = this.i;
        if (abstractC9453pq == null) {
            abstractC9453pq = e(abstractC9459pw, c.getClass());
        }
        abstractC9453pq.c(c, jsonGenerator, abstractC9459pw, abstractC9544rb);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        AbstractC9453pq<Object> abstractC9453pq = this.i;
        if (abstractC9453pq == null) {
            abstractC9453pq = d(interfaceC9478qO.c(), this.e, this.a);
            NameTransformer nameTransformer = this.j;
            if (nameTransformer != null) {
                abstractC9453pq = abstractC9453pq.a(nameTransformer);
            }
        }
        abstractC9453pq.d(interfaceC9478qO, this.e);
    }

    private final AbstractC9453pq<Object> e(AbstractC9459pw abstractC9459pw, Class<?> cls) {
        AbstractC9453pq<Object> d2;
        AbstractC9453pq<Object> c = this.b.c(cls);
        if (c == null) {
            if (this.e.t()) {
                d2 = abstractC9459pw.d(abstractC9459pw.b(this.e, cls), this.a);
            } else {
                d2 = abstractC9459pw.d(cls, this.a);
            }
            NameTransformer nameTransformer = this.j;
            if (nameTransformer != null) {
                d2 = d2.a(nameTransformer);
            }
            AbstractC9453pq<Object> abstractC9453pq = d2;
            this.b = this.b.d(cls, abstractC9453pq);
            return abstractC9453pq;
        }
        return c;
    }

    private final AbstractC9453pq<Object> d(AbstractC9459pw abstractC9459pw, JavaType javaType, BeanProperty beanProperty) {
        return abstractC9459pw.d(javaType, beanProperty);
    }
}
