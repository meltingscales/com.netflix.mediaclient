package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;
import o.InterfaceC9478qO;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class StringArraySerializer extends ArraySerializerBase<String[]> {
    private static final JavaType b = TypeFactory.a().c(String.class);
    public static final StringArraySerializer e = new StringArraySerializer();
    protected final AbstractC9453pq<Object> d;

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
        return this;
    }

    protected StringArraySerializer() {
        super(String[].class);
        this.d = null;
    }

    public StringArraySerializer(StringArraySerializer stringArraySerializer, BeanProperty beanProperty, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        super(stringArraySerializer, beanProperty, bool);
        this.d = abstractC9453pq;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public AbstractC9453pq<?> d(BeanProperty beanProperty, Boolean bool) {
        return new StringArraySerializer(this, beanProperty, this.d, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, o.InterfaceC9562rt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.AbstractC9453pq<?> e(o.AbstractC9459pw r5, com.fasterxml.jackson.databind.BeanProperty r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L18
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r5.g()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r6.e()
            if (r2 == 0) goto L18
            java.lang.Object r1 = r1.a(r2)
            if (r1 == 0) goto L18
            o.pq r1 = r5.a(r2, r1)
            goto L19
        L18:
            r1 = r0
        L19:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r3 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r4.d(r5, r6, r2, r3)
            if (r1 != 0) goto L25
            o.pq<java.lang.Object> r1 = r4.d
        L25:
            o.pq r1 = r4.e(r5, r6, r1)
            if (r1 != 0) goto L31
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            o.pq r1 = r5.d(r1, r6)
        L31:
            boolean r5 = r4.e(r1)
            if (r5 == 0) goto L38
            goto L39
        L38:
            r0 = r1
        L39:
            o.pq<java.lang.Object> r5 = r4.d
            if (r0 != r5) goto L42
            java.lang.Boolean r5 = r4.a
            if (r2 != r5) goto L42
            return r4
        L42:
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r5 = new com.fasterxml.jackson.databind.ser.impl.StringArraySerializer
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.e(o.pw, com.fasterxml.jackson.databind.BeanProperty):o.pq");
    }

    @Override // o.AbstractC9453pq
    /* renamed from: a */
    public boolean c(AbstractC9459pw abstractC9459pw, String[] strArr) {
        return strArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* renamed from: e */
    public boolean d(String[] strArr) {
        return strArr.length == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: c */
    public final void e(String[] strArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        int length = strArr.length;
        if (length == 1 && ((this.a == null && abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.a == Boolean.TRUE)) {
            d(strArr, jsonGenerator, abstractC9459pw);
            return;
        }
        jsonGenerator.e(strArr, length);
        d(strArr, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    /* renamed from: e */
    public void d(String[] strArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (strArr.length == 0) {
            return;
        }
        AbstractC9453pq<Object> abstractC9453pq = this.d;
        if (abstractC9453pq != null) {
            d(strArr, jsonGenerator, abstractC9459pw, abstractC9453pq);
            return;
        }
        for (String str : strArr) {
            if (str == null) {
                jsonGenerator.k();
            } else {
                jsonGenerator.i(str);
            }
        }
    }

    private void d(String[] strArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9453pq<Object> abstractC9453pq) {
        for (String str : strArr) {
            if (str == null) {
                abstractC9459pw.a(jsonGenerator);
            } else {
                abstractC9453pq.e(str, jsonGenerator, abstractC9459pw);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return d("array", true).c("items", e("string"));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        e(interfaceC9478qO, javaType, JsonFormatTypes.STRING);
    }
}
