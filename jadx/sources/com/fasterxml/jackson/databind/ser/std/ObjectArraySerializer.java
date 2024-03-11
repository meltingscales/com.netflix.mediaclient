package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9523rG;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;
import o.InterfaceC9476qM;
import o.InterfaceC9478qO;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> {
    protected final JavaType b;
    protected AbstractC9453pq<Object> d;
    protected AbstractC9523rG e;
    protected final AbstractC9544rb h;
    protected final boolean j;

    public ObjectArraySerializer(JavaType javaType, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq) {
        super(Object[].class);
        this.b = javaType;
        this.j = z;
        this.h = abstractC9544rb;
        this.e = AbstractC9523rG.c();
        this.d = abstractC9453pq;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        super(objectArraySerializer, beanProperty, bool);
        this.b = objectArraySerializer.b;
        this.h = abstractC9544rb;
        this.j = objectArraySerializer.j;
        this.e = AbstractC9523rG.c();
        this.d = abstractC9453pq;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public AbstractC9453pq<?> d(BeanProperty beanProperty, Boolean bool) {
        return new ObjectArraySerializer(this, beanProperty, this.h, this.d, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
        return new ObjectArraySerializer(this.b, this.j, abstractC9544rb, this.d);
    }

    public ObjectArraySerializer a(BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        return (this.c == beanProperty && abstractC9453pq == this.d && this.h == abstractC9544rb && this.a == bool) ? this : new ObjectArraySerializer(this, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, o.InterfaceC9562rt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.AbstractC9453pq<?> e(o.AbstractC9459pw r6, com.fasterxml.jackson.databind.BeanProperty r7) {
        /*
            r5 = this;
            o.rb r0 = r5.h
            if (r0 == 0) goto L8
            o.rb r0 = r0.b(r7)
        L8:
            r1 = 0
            if (r7 == 0) goto L20
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r7.e()
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r6.g()
            if (r2 == 0) goto L20
            java.lang.Object r3 = r3.a(r2)
            if (r3 == 0) goto L20
            o.pq r2 = r6.a(r2, r3)
            goto L21
        L20:
            r2 = r1
        L21:
            java.lang.Class r3 = r5.c()
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r5.c(r6, r7, r3)
            if (r3 == 0) goto L31
            com.fasterxml.jackson.annotation.JsonFormat$Feature r1 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.d(r1)
        L31:
            if (r2 != 0) goto L35
            o.pq<java.lang.Object> r2 = r5.d
        L35:
            o.pq r2 = r5.e(r6, r7, r2)
            if (r2 != 0) goto L4f
            com.fasterxml.jackson.databind.JavaType r3 = r5.b
            if (r3 == 0) goto L4f
            boolean r4 = r5.j
            if (r4 == 0) goto L4f
            boolean r3 = r3.D()
            if (r3 != 0) goto L4f
            com.fasterxml.jackson.databind.JavaType r2 = r5.b
            o.pq r2 = r6.d(r2, r7)
        L4f:
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r6 = r5.a(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.e(o.pw, com.fasterxml.jackson.databind.BeanProperty):o.pq");
    }

    @Override // o.AbstractC9453pq
    /* renamed from: b */
    public boolean c(AbstractC9459pw abstractC9459pw, Object[] objArr) {
        return objArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* renamed from: a */
    public boolean d(Object[] objArr) {
        return objArr.length == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: b */
    public final void e(Object[] objArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        int length = objArr.length;
        if (length == 1 && ((this.a == null && abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.a == Boolean.TRUE)) {
            d(objArr, jsonGenerator, abstractC9459pw);
            return;
        }
        jsonGenerator.e(objArr, length);
        d(objArr, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    /* renamed from: e */
    public void d(Object[] objArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        AbstractC9453pq<Object> abstractC9453pq = this.d;
        if (abstractC9453pq != null) {
            b(objArr, jsonGenerator, abstractC9459pw, abstractC9453pq);
        } else if (this.h != null) {
            a(objArr, jsonGenerator, abstractC9459pw);
        } else {
            Object obj = null;
            int i = 0;
            try {
                AbstractC9523rG abstractC9523rG = this.e;
                while (i < length) {
                    obj = objArr[i];
                    if (obj == null) {
                        abstractC9459pw.a(jsonGenerator);
                    } else {
                        Class<?> cls = obj.getClass();
                        AbstractC9453pq<Object> c = abstractC9523rG.c(cls);
                        if (c == null) {
                            if (this.b.t()) {
                                c = b(abstractC9523rG, abstractC9459pw.b(this.b, cls), abstractC9459pw);
                            } else {
                                c = b(abstractC9523rG, cls, abstractC9459pw);
                            }
                        }
                        c.e(obj, jsonGenerator, abstractC9459pw);
                    }
                    i++;
                }
            } catch (Exception e) {
                d(abstractC9459pw, e, obj, i);
            }
        }
    }

    public void b(Object[] objArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9453pq<Object> abstractC9453pq) {
        int length = objArr.length;
        AbstractC9544rb abstractC9544rb = this.h;
        Object obj = null;
        for (int i = 0; i < length; i++) {
            try {
                obj = objArr[i];
                if (obj == null) {
                    abstractC9459pw.a(jsonGenerator);
                } else if (abstractC9544rb == null) {
                    abstractC9453pq.e(obj, jsonGenerator, abstractC9459pw);
                } else {
                    abstractC9453pq.c(obj, jsonGenerator, abstractC9459pw, abstractC9544rb);
                }
            } catch (Exception e) {
                d(abstractC9459pw, e, obj, i);
                return;
            }
        }
    }

    public void a(Object[] objArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        int length = objArr.length;
        AbstractC9544rb abstractC9544rb = this.h;
        int i = 0;
        Object obj = null;
        try {
            AbstractC9523rG abstractC9523rG = this.e;
            while (i < length) {
                obj = objArr[i];
                if (obj == null) {
                    abstractC9459pw.a(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    AbstractC9453pq<Object> c = abstractC9523rG.c(cls);
                    if (c == null) {
                        c = b(abstractC9523rG, cls, abstractC9459pw);
                    }
                    c.c(obj, jsonGenerator, abstractC9459pw, abstractC9544rb);
                }
                i++;
            }
        } catch (Exception e) {
            d(abstractC9459pw, e, obj, i);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        InterfaceC9476qM b = interfaceC9478qO.b(javaType);
        if (b != null) {
            JavaType javaType2 = this.b;
            AbstractC9453pq<Object> abstractC9453pq = this.d;
            if (abstractC9453pq == null) {
                abstractC9453pq = interfaceC9478qO.c().d(javaType2, this.c);
            }
            b.d(abstractC9453pq, javaType2);
        }
    }

    protected final AbstractC9453pq<Object> b(AbstractC9523rG abstractC9523rG, Class<?> cls, AbstractC9459pw abstractC9459pw) {
        AbstractC9523rG.d a = abstractC9523rG.a(cls, abstractC9459pw, this.c);
        AbstractC9523rG abstractC9523rG2 = a.d;
        if (abstractC9523rG != abstractC9523rG2) {
            this.e = abstractC9523rG2;
        }
        return a.c;
    }

    protected final AbstractC9453pq<Object> b(AbstractC9523rG abstractC9523rG, JavaType javaType, AbstractC9459pw abstractC9459pw) {
        AbstractC9523rG.d e = abstractC9523rG.e(javaType, abstractC9459pw, this.c);
        AbstractC9523rG abstractC9523rG2 = e.d;
        if (abstractC9523rG != abstractC9523rG2) {
            this.e = abstractC9523rG2;
        }
        return e.c;
    }
}
