package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC9453pq;
import o.AbstractC9544rb;

/* loaded from: classes5.dex */
public class AtomicReferenceSerializer extends ReferenceTypeSerializer<AtomicReference<?>> {
    private static final long serialVersionUID = 1;

    public AtomicReferenceSerializer(ReferenceType referenceType, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq) {
        super(referenceType, z, abstractC9544rb, abstractC9453pq);
    }

    protected AtomicReferenceSerializer(AtomicReferenceSerializer atomicReferenceSerializer, BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, NameTransformer nameTransformer, Object obj, boolean z) {
        super(atomicReferenceSerializer, beanProperty, abstractC9544rb, abstractC9453pq, nameTransformer, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    protected ReferenceTypeSerializer<AtomicReference<?>> a(BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, NameTransformer nameTransformer) {
        return new AtomicReferenceSerializer(this, beanProperty, abstractC9544rb, abstractC9453pq, nameTransformer, this.g, this.c);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<AtomicReference<?>> a(Object obj, boolean z) {
        return new AtomicReferenceSerializer(this, this.a, this.f, this.i, this.j, obj, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    /* renamed from: a */
    public boolean b(AtomicReference<?> atomicReference) {
        return atomicReference.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public Object d(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public Object c(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }
}
