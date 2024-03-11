package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import o.AbstractC9445pi;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.InterfaceC9327nW;
import o.InterfaceC9458pv;
import o.InterfaceC9478qO;
import o.InterfaceC9484qU;
import o.InterfaceC9562rt;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements InterfaceC9562rt {
    private static final long serialVersionUID = 1;
    protected final EnumValues b;
    protected final Boolean d;

    public EnumSerializer(EnumValues enumValues, Boolean bool) {
        super(enumValues.d(), false);
        this.b = enumValues;
        this.d = bool;
    }

    public static EnumSerializer a(Class<?> cls, SerializationConfig serializationConfig, AbstractC9445pi abstractC9445pi, JsonFormat.Value value) {
        return new EnumSerializer(EnumValues.c(serializationConfig, cls), e(cls, value, true, null));
    }

    @Override // o.InterfaceC9562rt
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        Boolean e;
        JsonFormat.Value c = c(abstractC9459pw, beanProperty, (Class<?>) c());
        return (c == null || (e = e(c(), c, false, this.d)) == this.d) ? this : new EnumSerializer(this.b, e);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: a */
    public final void e(Enum<?> r2, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (b(abstractC9459pw)) {
            jsonGenerator.c(r2.ordinal());
        } else if (abstractC9459pw.d(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.i(r2.toString());
        } else {
            jsonGenerator.e(this.b.b(r2));
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        if (b(abstractC9459pw)) {
            return d("integer", true);
        }
        ObjectNode d = d("string", true);
        if (type != null && abstractC9459pw.c(type).u()) {
            ArrayNode e = d.e("enum");
            for (InterfaceC9327nW interfaceC9327nW : this.b.b()) {
                e.c(interfaceC9327nW.b());
            }
        }
        return d;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        AbstractC9459pw c = interfaceC9478qO.c();
        if (b(c)) {
            c(interfaceC9478qO, javaType, JsonParser.NumberType.INT);
            return;
        }
        InterfaceC9484qU g = interfaceC9478qO.g(javaType);
        if (g != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (c != null && c.d(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                for (Enum<?> r1 : this.b.a()) {
                    linkedHashSet.add(r1.toString());
                }
            } else {
                for (InterfaceC9327nW interfaceC9327nW : this.b.b()) {
                    linkedHashSet.add(interfaceC9327nW.b());
                }
            }
            g.e(linkedHashSet);
        }
    }

    protected final boolean b(AbstractC9459pw abstractC9459pw) {
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return abstractC9459pw.d(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }

    protected static Boolean e(Class<?> cls, JsonFormat.Value value, boolean z, Boolean bool) {
        JsonFormat.Shape a = value == null ? null : value.a();
        if (a == null || a == JsonFormat.Shape.ANY || a == JsonFormat.Shape.SCALAR) {
            return bool;
        }
        if (a == JsonFormat.Shape.STRING || a == JsonFormat.Shape.NATURAL) {
            return Boolean.FALSE;
        }
        if (a.a() || a == JsonFormat.Shape.ARRAY) {
            return Boolean.TRUE;
        }
        Object[] objArr = new Object[3];
        objArr[0] = a;
        objArr[1] = cls.getName();
        objArr[2] = z ? "class" : "property";
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", objArr));
    }
}
