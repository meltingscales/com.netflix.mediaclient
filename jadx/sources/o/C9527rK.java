package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

/* renamed from: o.rK  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9527rK implements InterfaceC9566rx, InterfaceC9567ry {
    protected boolean b(BeanPropertyWriter beanPropertyWriter) {
        return true;
    }

    protected boolean d(PropertyWriter propertyWriter) {
        return true;
    }

    protected C9527rK() {
    }

    public static InterfaceC9567ry e(final InterfaceC9566rx interfaceC9566rx) {
        return new InterfaceC9567ry() { // from class: o.rK.2
            @Override // o.InterfaceC9567ry
            public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, PropertyWriter propertyWriter) {
                InterfaceC9566rx.this.d(obj, jsonGenerator, abstractC9459pw, (BeanPropertyWriter) propertyWriter);
            }

            @Override // o.InterfaceC9567ry
            public void c(PropertyWriter propertyWriter, ObjectNode objectNode, AbstractC9459pw abstractC9459pw) {
                InterfaceC9566rx.this.c((BeanPropertyWriter) propertyWriter, objectNode, abstractC9459pw);
            }

            @Override // o.InterfaceC9567ry
            public void a(PropertyWriter propertyWriter, InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
                InterfaceC9566rx.this.e((BeanPropertyWriter) propertyWriter, interfaceC9480qQ, abstractC9459pw);
            }
        };
    }

    @Override // o.InterfaceC9566rx
    @Deprecated
    public void d(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, BeanPropertyWriter beanPropertyWriter) {
        if (b(beanPropertyWriter)) {
            beanPropertyWriter.d(obj, jsonGenerator, abstractC9459pw);
        } else if (jsonGenerator.d()) {
        } else {
            beanPropertyWriter.e(obj, jsonGenerator, abstractC9459pw);
        }
    }

    @Override // o.InterfaceC9566rx
    @Deprecated
    public void c(BeanPropertyWriter beanPropertyWriter, ObjectNode objectNode, AbstractC9459pw abstractC9459pw) {
        if (b(beanPropertyWriter)) {
            beanPropertyWriter.e(objectNode, abstractC9459pw);
        }
    }

    @Override // o.InterfaceC9566rx
    @Deprecated
    public void e(BeanPropertyWriter beanPropertyWriter, InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
        if (b(beanPropertyWriter)) {
            beanPropertyWriter.d(interfaceC9480qQ, abstractC9459pw);
        }
    }

    @Override // o.InterfaceC9567ry
    public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, PropertyWriter propertyWriter) {
        if (d(propertyWriter)) {
            propertyWriter.d(obj, jsonGenerator, abstractC9459pw);
        } else if (jsonGenerator.d()) {
        } else {
            propertyWriter.e(obj, jsonGenerator, abstractC9459pw);
        }
    }

    @Override // o.InterfaceC9567ry
    @Deprecated
    public void c(PropertyWriter propertyWriter, ObjectNode objectNode, AbstractC9459pw abstractC9459pw) {
        if (d(propertyWriter)) {
            propertyWriter.e(objectNode, abstractC9459pw);
        }
    }

    @Override // o.InterfaceC9567ry
    public void a(PropertyWriter propertyWriter, InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
        if (d(propertyWriter)) {
            propertyWriter.d(interfaceC9480qQ, abstractC9459pw);
        }
    }
}
