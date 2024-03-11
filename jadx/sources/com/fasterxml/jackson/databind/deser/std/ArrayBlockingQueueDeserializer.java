package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.InterfaceC9428pR;

/* loaded from: classes5.dex */
public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    protected Collection<Object> b(DeserializationContext deserializationContext) {
        return null;
    }

    public ArrayBlockingQueueDeserializer(JavaType javaType, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra, ValueInstantiator valueInstantiator) {
        super(javaType, abstractC9452pp, abstractC9543ra, valueInstantiator);
    }

    protected ArrayBlockingQueueDeserializer(JavaType javaType, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra, ValueInstantiator valueInstantiator, AbstractC9452pp<Object> abstractC9452pp2, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        super(javaType, abstractC9452pp, abstractC9543ra, valueInstantiator, abstractC9452pp2, interfaceC9428pR, bool);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    /* renamed from: e */
    public ArrayBlockingQueueDeserializer b(AbstractC9452pp<?> abstractC9452pp, AbstractC9452pp<?> abstractC9452pp2, AbstractC9543ra abstractC9543ra, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        return new ArrayBlockingQueueDeserializer(this.c, abstractC9452pp2, abstractC9543ra, this.a, abstractC9452pp, interfaceC9428pR, bool);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer, o.AbstractC9452pp
    /* renamed from: b */
    public Collection<Object> e(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) {
        if (collection != null) {
            return super.e(jsonParser, deserializationContext, collection);
        }
        if (!jsonParser.J()) {
            return c(jsonParser, deserializationContext, new ArrayBlockingQueue(1));
        }
        Collection<Object> e = super.e(jsonParser, deserializationContext, new ArrayList());
        return new ArrayBlockingQueue(e.size(), false, e);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.d(jsonParser, deserializationContext);
    }
}
