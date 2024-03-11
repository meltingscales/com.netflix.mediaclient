package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import o.AbstractC9452pp;
import o.C9537rU;
import o.InterfaceC9428pR;

/* loaded from: classes5.dex */
public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T> {
    protected final JavaType c;
    protected final InterfaceC9428pR g;
    protected final Boolean h;
    protected final boolean i;

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType g() {
        return this.c;
    }

    public abstract AbstractC9452pp<Object> h();

    public ValueInstantiator j() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ContainerDeserializerBase(JavaType javaType, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        super(javaType);
        this.c = javaType;
        this.h = bool;
        this.g = interfaceC9428pR;
        this.i = NullsConstantProvider.c(interfaceC9428pR);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ContainerDeserializerBase(JavaType javaType) {
        this(javaType, (InterfaceC9428pR) null, (Boolean) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase) {
        this(containerDeserializerBase, containerDeserializerBase.g, containerDeserializerBase.h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        super(containerDeserializerBase.c);
        this.c = containerDeserializerBase.c;
        this.g = interfaceC9428pR;
        this.h = bool;
        this.i = NullsConstantProvider.c(interfaceC9428pR);
    }

    @Override // o.AbstractC9452pp
    public SettableBeanProperty c(String str) {
        AbstractC9452pp<Object> h = h();
        if (h == null) {
            throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", str, getClass().getName()));
        }
        return h.c(str);
    }

    @Override // o.AbstractC9452pp
    public AccessPattern a() {
        return AccessPattern.DYNAMIC;
    }

    @Override // o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        ValueInstantiator j = j();
        if (j == null || !j.g()) {
            JavaType g = g();
            deserializationContext.c(g, String.format("Cannot create empty instance of %s, no default Creator", g));
        }
        try {
            return j.e(deserializationContext);
        } catch (IOException e) {
            return C9537rU.d(deserializationContext, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <BOGUS> BOGUS e(Throwable th, Object obj, String str) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C9537rU.b(th);
        if ((th instanceof IOException) && !(th instanceof JsonMappingException)) {
            throw ((IOException) th);
        }
        throw JsonMappingException.d(th, obj, (String) C9537rU.a(str, "N/A"));
    }
}
