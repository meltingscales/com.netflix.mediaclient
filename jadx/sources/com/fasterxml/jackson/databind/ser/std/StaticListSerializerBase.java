package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;
import java.util.Collection;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9476qM;
import o.InterfaceC9478qO;
import o.InterfaceC9562rt;

/* loaded from: classes5.dex */
public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements InterfaceC9562rt {
    public final Boolean e;

    protected abstract AbstractC9454pr a();

    public abstract void a(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb);

    public abstract AbstractC9453pq<?> b(BeanProperty beanProperty, Boolean bool);

    protected abstract void c(InterfaceC9476qM interfaceC9476qM);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC9453pq
    public /* synthetic */ void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        a((StaticListSerializerBase<T>) ((Collection) obj), jsonGenerator, abstractC9459pw, abstractC9544rb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC9453pq
    public /* bridge */ /* synthetic */ boolean c(AbstractC9459pw abstractC9459pw, Object obj) {
        return c(abstractC9459pw, (AbstractC9459pw) ((Collection) obj));
    }

    public StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this.e = null;
    }

    public StaticListSerializerBase(StaticListSerializerBase<?> staticListSerializerBase, Boolean bool) {
        super(staticListSerializerBase);
        this.e = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    @Override // o.InterfaceC9562rt
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
            java.lang.Class r2 = r4.c()
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r4.c(r5, r6, r2)
            if (r2 == 0) goto L2a
            com.fasterxml.jackson.annotation.JsonFormat$Feature r3 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r2.d(r3)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            o.pq r1 = r4.e(r5, r6, r1)
            if (r1 != 0) goto L37
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            o.pq r1 = r5.d(r1, r6)
        L37:
            boolean r3 = r4.e(r1)
            if (r3 == 0) goto L47
            java.lang.Boolean r5 = r4.e
            if (r2 != r5) goto L42
            return r4
        L42:
            o.pq r5 = r4.b(r6, r2)
            return r5
        L47:
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r6 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            com.fasterxml.jackson.databind.JavaType r5 = r5.c(r2)
            r2 = 1
            r6.<init>(r5, r2, r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.e(o.pw, com.fasterxml.jackson.databind.BeanProperty):o.pq");
    }

    public boolean c(AbstractC9459pw abstractC9459pw, T t) {
        return t == null || t.size() == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return d("array", true).c("items", a());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        InterfaceC9476qM b = interfaceC9478qO.b(javaType);
        if (b != null) {
            c(b);
        }
    }
}
