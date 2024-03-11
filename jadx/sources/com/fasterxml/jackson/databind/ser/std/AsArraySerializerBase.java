package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.lang.reflect.Type;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9523rG;
import o.AbstractC9544rb;
import o.C9488qY;
import o.InterfaceC9478qO;
import o.InterfaceC9487qX;
import o.InterfaceC9562rt;

/* loaded from: classes5.dex */
public abstract class AsArraySerializerBase<T> extends ContainerSerializer<T> implements InterfaceC9562rt {
    public final AbstractC9453pq<Object> a;
    public final BeanProperty b;
    public final JavaType c;
    protected final boolean d;
    public AbstractC9523rG e;
    public final AbstractC9544rb f;
    public final Boolean h;

    protected abstract void c(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw);

    public abstract AsArraySerializerBase<T> d(BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq) {
        super(cls, false);
        boolean z2 = false;
        this.c = javaType;
        if (z || (javaType != null && javaType.v())) {
            z2 = true;
        }
        this.d = z2;
        this.f = abstractC9544rb;
        this.b = null;
        this.a = abstractC9453pq;
        this.e = AbstractC9523rG.c();
        this.h = null;
    }

    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        super(asArraySerializerBase);
        this.c = asArraySerializerBase.c;
        this.d = asArraySerializerBase.d;
        this.f = abstractC9544rb;
        this.b = beanProperty;
        this.a = abstractC9453pq;
        this.e = AbstractC9523rG.c();
        this.h = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // o.InterfaceC9562rt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.AbstractC9453pq<?> e(o.AbstractC9459pw r6, com.fasterxml.jackson.databind.BeanProperty r7) {
        /*
            r5 = this;
            o.rb r0 = r5.f
            if (r0 == 0) goto L8
            o.rb r0 = r0.b(r7)
        L8:
            r1 = 0
            if (r7 == 0) goto L20
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r6.g()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r3 = r7.e()
            if (r3 == 0) goto L20
            java.lang.Object r2 = r2.a(r3)
            if (r2 == 0) goto L20
            o.pq r2 = r6.a(r3, r2)
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
            o.pq<java.lang.Object> r2 = r5.a
        L35:
            o.pq r2 = r5.e(r6, r7, r2)
            if (r2 != 0) goto L4f
            com.fasterxml.jackson.databind.JavaType r3 = r5.c
            if (r3 == 0) goto L4f
            boolean r4 = r5.d
            if (r4 == 0) goto L4f
            boolean r3 = r3.D()
            if (r3 != 0) goto L4f
            com.fasterxml.jackson.databind.JavaType r2 = r5.c
            o.pq r2 = r6.d(r2, r7)
        L4f:
            o.pq<java.lang.Object> r6 = r5.a
            if (r2 != r6) goto L61
            com.fasterxml.jackson.databind.BeanProperty r6 = r5.b
            if (r7 != r6) goto L61
            o.rb r6 = r5.f
            if (r6 != r0) goto L61
            java.lang.Boolean r6 = r5.h
            if (r6 == r1) goto L60
            goto L61
        L60:
            return r5
        L61:
            com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase r6 = r5.d(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase.e(o.pw, com.fasterxml.jackson.databind.BeanProperty):o.pq");
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void e(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && d((AsArraySerializerBase<T>) t)) {
            c((AsArraySerializerBase<T>) t, jsonGenerator, abstractC9459pw);
            return;
        }
        jsonGenerator.g(t);
        c((AsArraySerializerBase<T>) t, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    @Override // o.AbstractC9453pq
    public void c(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(t, JsonToken.START_ARRAY));
        jsonGenerator.e(t);
        c((AsArraySerializerBase<T>) t, jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, b);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        ObjectNode d = d("array", true);
        AbstractC9453pq<Object> abstractC9453pq = this.a;
        if (abstractC9453pq != null) {
            AbstractC9454pr b = abstractC9453pq instanceof InterfaceC9487qX ? ((InterfaceC9487qX) abstractC9453pq).b(abstractC9459pw, null) : null;
            if (b == null) {
                b = C9488qY.e();
            }
            d.c("items", b);
        }
        return d;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        AbstractC9453pq<Object> abstractC9453pq = this.a;
        if (abstractC9453pq == null && this.c != null) {
            abstractC9453pq = interfaceC9478qO.c().d(this.c, this.b);
        }
        d(interfaceC9478qO, javaType, abstractC9453pq, this.c);
    }

    public final AbstractC9453pq<Object> b(AbstractC9523rG abstractC9523rG, Class<?> cls, AbstractC9459pw abstractC9459pw) {
        AbstractC9523rG.d a = abstractC9523rG.a(cls, abstractC9459pw, this.b);
        AbstractC9523rG abstractC9523rG2 = a.d;
        if (abstractC9523rG != abstractC9523rG2) {
            this.e = abstractC9523rG2;
        }
        return a.c;
    }

    public final AbstractC9453pq<Object> c(AbstractC9523rG abstractC9523rG, JavaType javaType, AbstractC9459pw abstractC9459pw) {
        AbstractC9523rG.d e = abstractC9523rG.e(javaType, abstractC9459pw, this.b);
        AbstractC9523rG abstractC9523rG2 = e.d;
        if (abstractC9523rG != abstractC9523rG2) {
            this.e = abstractC9523rG2;
        }
        return e.c;
    }
}
