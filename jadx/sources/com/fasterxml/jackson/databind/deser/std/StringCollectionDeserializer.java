package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.util.Collection;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.InterfaceC9420pJ;
import o.InterfaceC9428pR;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements InterfaceC9420pJ {
    private static final long serialVersionUID = 1;
    protected final ValueInstantiator a;
    protected final AbstractC9452pp<Object> d;
    protected final AbstractC9452pp<String> e;

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC9452pp<Object> h() {
        return this.e;
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return this.e == null && this.d == null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public ValueInstantiator j() {
        return this.a;
    }

    public StringCollectionDeserializer(JavaType javaType, AbstractC9452pp<?> abstractC9452pp, ValueInstantiator valueInstantiator) {
        this(javaType, valueInstantiator, null, abstractC9452pp, abstractC9452pp, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC9452pp<?> abstractC9452pp, AbstractC9452pp<?> abstractC9452pp2, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        super(javaType, interfaceC9428pR, bool);
        this.e = abstractC9452pp2;
        this.a = valueInstantiator;
        this.d = abstractC9452pp;
    }

    protected StringCollectionDeserializer a(AbstractC9452pp<?> abstractC9452pp, AbstractC9452pp<?> abstractC9452pp2, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        return (this.h == bool && this.g == interfaceC9428pR && this.e == abstractC9452pp2 && this.d == abstractC9452pp) ? this : new StringCollectionDeserializer(this.c, this.a, abstractC9452pp, abstractC9452pp2, interfaceC9428pR, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    @Override // o.InterfaceC9420pJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.AbstractC9452pp<?> c(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.BeanProperty r7) {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L31
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.m()
            if (r0 == 0) goto L1a
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5.a
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r6.c()
            com.fasterxml.jackson.databind.JavaType r0 = r0.e(r2)
            o.pp r0 = r5.a(r6, r0, r7)
            goto L32
        L1a:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5.a
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.l()
            if (r0 == 0) goto L31
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5.a
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r6.c()
            com.fasterxml.jackson.databind.JavaType r0 = r0.c(r2)
            o.pp r0 = r5.a(r6, r0, r7)
            goto L32
        L31:
            r0 = r1
        L32:
            o.pp<java.lang.String> r2 = r5.e
            com.fasterxml.jackson.databind.JavaType r3 = r5.c
            com.fasterxml.jackson.databind.JavaType r3 = r3.j()
            if (r2 != 0) goto L47
            o.pp r2 = r5.d(r6, r7, r2)
            if (r2 != 0) goto L4b
            o.pp r2 = r6.c(r3, r7)
            goto L4b
        L47:
            o.pp r2 = r6.e(r2, r7, r3)
        L4b:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r4 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r3 = r5.d(r6, r7, r3, r4)
            o.pR r6 = r5.b(r6, r7, r2)
            boolean r7 = r5.a(r2)
            if (r7 == 0) goto L5e
            goto L5f
        L5e:
            r1 = r2
        L5f:
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r6 = r5.a(r0, r1, r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.c(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):o.pp");
    }

    @Override // o.AbstractC9452pp
    /* renamed from: d */
    public Collection<String> b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        AbstractC9452pp<Object> abstractC9452pp = this.d;
        if (abstractC9452pp != null) {
            return (Collection) this.a.b(deserializationContext, abstractC9452pp.b(jsonParser, deserializationContext));
        }
        return e(jsonParser, deserializationContext, (Collection) this.a.e(deserializationContext));
    }

    @Override // o.AbstractC9452pp
    /* renamed from: a */
    public Collection<String> e(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) {
        String B;
        if (!jsonParser.J()) {
            return e(jsonParser, deserializationContext, collection);
        }
        AbstractC9452pp<String> abstractC9452pp = this.e;
        if (abstractC9452pp != null) {
            return d(jsonParser, deserializationContext, collection, abstractC9452pp);
        }
        while (true) {
            try {
                String S = jsonParser.S();
                if (S != null) {
                    collection.add(S);
                } else {
                    JsonToken o2 = jsonParser.o();
                    if (o2 == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (o2 != JsonToken.VALUE_NULL) {
                        B = B(jsonParser, deserializationContext);
                    } else if (!this.i) {
                        B = (String) this.g.c(deserializationContext);
                    }
                    collection.add(B);
                }
            } catch (Exception e) {
                throw JsonMappingException.d(e, collection, collection.size());
            }
        }
    }

    private Collection<String> d(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection, AbstractC9452pp<String> abstractC9452pp) {
        String b;
        while (true) {
            try {
                if (jsonParser.S() == null) {
                    JsonToken o2 = jsonParser.o();
                    if (o2 == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (o2 != JsonToken.VALUE_NULL) {
                        b = abstractC9452pp.b(jsonParser, deserializationContext);
                    } else if (!this.i) {
                        b = (String) this.g.c(deserializationContext);
                    }
                } else {
                    b = abstractC9452pp.b(jsonParser, deserializationContext);
                }
                collection.add(b);
            } catch (Exception e) {
                throw JsonMappingException.d(e, collection, collection.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.d(jsonParser, deserializationContext);
    }

    private final Collection<String> e(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) {
        String B;
        Boolean bool = this.h;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.d(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) deserializationContext.e(this.c.h(), jsonParser);
        }
        AbstractC9452pp<String> abstractC9452pp = this.e;
        if (jsonParser.o() != JsonToken.VALUE_NULL) {
            try {
                B = abstractC9452pp == null ? B(jsonParser, deserializationContext) : abstractC9452pp.b(jsonParser, deserializationContext);
            } catch (Exception e) {
                throw JsonMappingException.d(e, collection, collection.size());
            }
        } else if (this.i) {
            return collection;
        } else {
            B = (String) this.g.c(deserializationContext);
        }
        collection.add(B);
        return collection;
    }
}
