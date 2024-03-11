package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Map;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9465qB;
import o.AbstractC9509qt;
import o.AbstractC9523rG;
import o.AbstractC9544rb;
import o.C9530rN;
import o.C9531rO;
import o.InterfaceC9458pv;
import o.InterfaceC9562rt;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements InterfaceC9562rt {
    public static final Object b = JsonInclude.Include.NON_EMPTY;
    protected AbstractC9453pq<Object> a;
    protected final JavaType c;
    protected final JavaType d;
    protected AbstractC9523rG e;
    protected final boolean f;
    protected final JavaType g;
    protected AbstractC9453pq<Object> h;
    protected final Object i;
    protected final BeanProperty j;
    protected final boolean l;
    protected final AbstractC9544rb n;

    public JavaType a() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* renamed from: e */
    public boolean d(Map.Entry<?, ?> entry) {
        return true;
    }

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, AbstractC9544rb abstractC9544rb, BeanProperty beanProperty) {
        super(javaType);
        this.d = javaType;
        this.c = javaType2;
        this.g = javaType3;
        this.l = z;
        this.n = abstractC9544rb;
        this.j = beanProperty;
        this.e = AbstractC9523rG.c();
        this.i = null;
        this.f = false;
    }

    protected MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, AbstractC9453pq<?> abstractC9453pq2, Object obj, boolean z) {
        super(Map.class, false);
        this.d = mapEntrySerializer.d;
        this.c = mapEntrySerializer.c;
        this.g = mapEntrySerializer.g;
        this.l = mapEntrySerializer.l;
        this.n = mapEntrySerializer.n;
        this.a = abstractC9453pq;
        this.h = abstractC9453pq2;
        this.e = AbstractC9523rG.c();
        this.j = mapEntrySerializer.j;
        this.i = obj;
        this.f = z;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
        return new MapEntrySerializer(this, this.j, abstractC9544rb, this.a, this.h, this.i, this.f);
    }

    public MapEntrySerializer e(BeanProperty beanProperty, AbstractC9453pq<?> abstractC9453pq, AbstractC9453pq<?> abstractC9453pq2, Object obj, boolean z) {
        return new MapEntrySerializer(this, beanProperty, this.n, abstractC9453pq, abstractC9453pq2, obj, z);
    }

    public MapEntrySerializer c(Object obj, boolean z) {
        return (this.i == obj && this.f == z) ? this : new MapEntrySerializer(this, this.j, this.n, this.a, this.h, obj, z);
    }

    @Override // o.InterfaceC9562rt
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        AbstractC9453pq<Object> abstractC9453pq;
        AbstractC9453pq<?> abstractC9453pq2;
        AbstractC9453pq<?> a;
        Object obj;
        boolean z;
        JsonInclude.Value a2;
        JsonInclude.Include c;
        boolean a3;
        AnnotationIntrospector g = abstractC9459pw.g();
        Object obj2 = null;
        AnnotatedMember e = beanProperty == null ? null : beanProperty.e();
        if (e == null || g == null) {
            abstractC9453pq = null;
            abstractC9453pq2 = null;
        } else {
            Object f = g.f((AbstractC9509qt) e);
            abstractC9453pq2 = f != null ? abstractC9459pw.a(e, f) : null;
            Object a4 = g.a((AbstractC9509qt) e);
            abstractC9453pq = a4 != null ? abstractC9459pw.a(e, a4) : null;
        }
        if (abstractC9453pq == null) {
            abstractC9453pq = this.h;
        }
        AbstractC9453pq<?> e2 = e(abstractC9459pw, beanProperty, abstractC9453pq);
        if (e2 == null && this.l && !this.g.D()) {
            e2 = abstractC9459pw.d(this.g, beanProperty);
        }
        AbstractC9453pq<?> abstractC9453pq3 = e2;
        if (abstractC9453pq2 == null) {
            abstractC9453pq2 = this.a;
        }
        if (abstractC9453pq2 == null) {
            a = abstractC9459pw.a(this.c, beanProperty);
        } else {
            a = abstractC9459pw.a(abstractC9453pq2, beanProperty);
        }
        AbstractC9453pq<?> abstractC9453pq4 = a;
        Object obj3 = this.i;
        boolean z2 = this.f;
        if (beanProperty == null || (a2 = beanProperty.a(abstractC9459pw.c(), null)) == null || (c = a2.c()) == JsonInclude.Include.USE_DEFAULTS) {
            obj2 = obj3;
        } else {
            int i = AnonymousClass4.d[c.ordinal()];
            z2 = true;
            if (i == 1) {
                obj2 = C9531rO.a(this.g);
                if (obj2 != null && obj2.getClass().isArray()) {
                    obj2 = C9530rN.e(obj2);
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        obj2 = abstractC9459pw.e((AbstractC9465qB) null, a2.e());
                        if (obj2 != null) {
                            a3 = abstractC9459pw.a(obj2);
                            z = a3;
                            obj = obj2;
                        }
                    } else if (i != 5) {
                        a3 = false;
                        z = a3;
                        obj = obj2;
                    }
                    return e(beanProperty, abstractC9453pq4, abstractC9453pq3, obj, z);
                }
                obj2 = b;
            } else if (this.g.d()) {
                obj2 = b;
            }
        }
        obj = obj2;
        z = z2;
        return e(beanProperty, abstractC9453pq4, abstractC9453pq3, obj, z);
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            d = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // o.AbstractC9453pq
    public boolean c(AbstractC9459pw abstractC9459pw, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this.f;
        }
        if (this.i == null) {
            return false;
        }
        AbstractC9453pq<Object> abstractC9453pq = this.h;
        if (abstractC9453pq == null) {
            Class<?> cls = value.getClass();
            AbstractC9453pq<Object> c = this.e.c(cls);
            if (c == null) {
                try {
                    abstractC9453pq = b(this.e, cls, abstractC9459pw);
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                abstractC9453pq = c;
            }
        }
        Object obj = this.i;
        if (obj == b) {
            return abstractC9453pq.c(abstractC9459pw, value);
        }
        return obj.equals(value);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: d */
    public void e(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.i(entry);
        e(entry, jsonGenerator, abstractC9459pw);
        jsonGenerator.o();
    }

    @Override // o.AbstractC9453pq
    public void c(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        jsonGenerator.e(entry);
        WritableTypeId b2 = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(entry, JsonToken.START_OBJECT));
        e(entry, jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, b2);
    }

    protected void e(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<Object> abstractC9453pq;
        AbstractC9544rb abstractC9544rb = this.n;
        Object key = entry.getKey();
        AbstractC9453pq<Object> c = key == null ? abstractC9459pw.c(this.c, this.j) : this.a;
        Object value = entry.getValue();
        if (value != null) {
            abstractC9453pq = this.h;
            if (abstractC9453pq == null) {
                Class<?> cls = value.getClass();
                AbstractC9453pq<Object> c2 = this.e.c(cls);
                if (c2 != null) {
                    abstractC9453pq = c2;
                } else if (this.g.t()) {
                    abstractC9453pq = e(this.e, abstractC9459pw.b(this.g, cls), abstractC9459pw);
                } else {
                    abstractC9453pq = b(this.e, cls, abstractC9459pw);
                }
            }
            Object obj = this.i;
            if (obj != null && ((obj == b && abstractC9453pq.c(abstractC9459pw, value)) || this.i.equals(value))) {
                return;
            }
        } else if (this.f) {
            return;
        } else {
            abstractC9453pq = abstractC9459pw.i();
        }
        c.e(key, jsonGenerator, abstractC9459pw);
        try {
            if (abstractC9544rb == null) {
                abstractC9453pq.e(value, jsonGenerator, abstractC9459pw);
            } else {
                abstractC9453pq.c(value, jsonGenerator, abstractC9459pw, abstractC9544rb);
            }
        } catch (Exception e) {
            d(abstractC9459pw, e, entry, "" + key);
        }
    }

    protected final AbstractC9453pq<Object> b(AbstractC9523rG abstractC9523rG, Class<?> cls, AbstractC9459pw abstractC9459pw) {
        AbstractC9523rG.d a = abstractC9523rG.a(cls, abstractC9459pw, this.j);
        AbstractC9523rG abstractC9523rG2 = a.d;
        if (abstractC9523rG != abstractC9523rG2) {
            this.e = abstractC9523rG2;
        }
        return a.c;
    }

    protected final AbstractC9453pq<Object> e(AbstractC9523rG abstractC9523rG, JavaType javaType, AbstractC9459pw abstractC9459pw) {
        AbstractC9523rG.d e = abstractC9523rG.e(javaType, abstractC9459pw, this.j);
        AbstractC9523rG abstractC9523rG2 = e.d;
        if (abstractC9523rG != abstractC9523rG2) {
            this.e = abstractC9523rG2;
        }
        return e.c;
    }
}
