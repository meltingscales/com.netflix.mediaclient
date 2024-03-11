package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import o.AbstractC9543ra;
import o.InterfaceC9545rc;

/* loaded from: classes5.dex */
public class AsExternalTypeDeserializer extends AsArrayTypeDeserializer {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer
    protected boolean e() {
        return true;
    }

    public AsExternalTypeDeserializer(JavaType javaType, InterfaceC9545rc interfaceC9545rc, String str, boolean z, JavaType javaType2) {
        super(javaType, interfaceC9545rc, str, z, javaType2);
    }

    public AsExternalTypeDeserializer(AsExternalTypeDeserializer asExternalTypeDeserializer, BeanProperty beanProperty) {
        super(asExternalTypeDeserializer, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, o.AbstractC9543ra
    public AbstractC9543ra d(BeanProperty beanProperty) {
        return beanProperty == this.f ? this : new AsExternalTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, o.AbstractC9543ra
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }
}
