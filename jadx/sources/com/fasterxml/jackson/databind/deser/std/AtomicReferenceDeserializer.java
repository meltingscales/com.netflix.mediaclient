package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC9452pp;
import o.AbstractC9543ra;

/* loaded from: classes5.dex */
public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer<AtomicReference<Object>> {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public /* synthetic */ ReferenceTypeDeserializer<AtomicReference<Object>> e(AbstractC9543ra abstractC9543ra, AbstractC9452pp abstractC9452pp) {
        return b(abstractC9543ra, (AbstractC9452pp<?>) abstractC9452pp);
    }

    public AtomicReferenceDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        super(javaType, valueInstantiator, abstractC9543ra, abstractC9452pp);
    }

    public AtomicReferenceDeserializer b(AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        return new AtomicReferenceDeserializer(this.d, this.b, abstractC9543ra, abstractC9452pp);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, o.AbstractC9452pp, o.InterfaceC9428pR
    /* renamed from: e */
    public AtomicReference<Object> c(DeserializationContext deserializationContext) {
        return new AtomicReference<>(this.c.c(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        return c(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* renamed from: d */
    public AtomicReference<Object> e(Object obj) {
        return new AtomicReference<>(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* renamed from: a */
    public Object c(AtomicReference<Object> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* renamed from: d */
    public AtomicReference<Object> e(AtomicReference<Object> atomicReference, Object obj) {
        atomicReference.set(obj);
        return atomicReference;
    }
}
