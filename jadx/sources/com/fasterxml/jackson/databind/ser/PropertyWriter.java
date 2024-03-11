package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.Serializable;
import o.AbstractC9459pw;
import o.AbstractC9465qB;
import o.InterfaceC9480qQ;

/* loaded from: classes5.dex */
public abstract class PropertyWriter extends ConcreteBeanPropertyBase implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract void d(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw);

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract void d(InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw);

    @Deprecated
    public abstract void e(ObjectNode objectNode, AbstractC9459pw abstractC9459pw);

    public abstract void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw);

    public PropertyWriter(PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PropertyWriter(AbstractC9465qB abstractC9465qB) {
        super(abstractC9465qB.n());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PropertyWriter(PropertyWriter propertyWriter) {
        super(propertyWriter);
    }
}
