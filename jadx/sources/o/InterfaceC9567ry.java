package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

/* renamed from: o.ry  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC9567ry {
    void a(PropertyWriter propertyWriter, InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw);

    @Deprecated
    void c(PropertyWriter propertyWriter, ObjectNode objectNode, AbstractC9459pw abstractC9459pw);

    void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, PropertyWriter propertyWriter);
}
