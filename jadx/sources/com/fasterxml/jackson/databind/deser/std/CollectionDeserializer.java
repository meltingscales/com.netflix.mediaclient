package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9494qe;
import o.C9537rU;
import o.InterfaceC9420pJ;
import o.InterfaceC9428pR;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>> implements InterfaceC9420pJ {
    private static final long serialVersionUID = -1;
    protected final ValueInstantiator a;
    protected final AbstractC9452pp<Object> b;
    protected final AbstractC9543ra d;
    protected final AbstractC9452pp<Object> e;

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC9452pp<Object> h() {
        return this.b;
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return this.b == null && this.d == null && this.e == null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public ValueInstantiator j() {
        return this.a;
    }

    public CollectionDeserializer(JavaType javaType, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra, ValueInstantiator valueInstantiator) {
        this(javaType, abstractC9452pp, abstractC9543ra, valueInstantiator, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CollectionDeserializer(JavaType javaType, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra, ValueInstantiator valueInstantiator, AbstractC9452pp<Object> abstractC9452pp2, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        super(javaType, interfaceC9428pR, bool);
        this.b = abstractC9452pp;
        this.d = abstractC9543ra;
        this.a = valueInstantiator;
        this.e = abstractC9452pp2;
    }

    protected CollectionDeserializer b(AbstractC9452pp<?> abstractC9452pp, AbstractC9452pp<?> abstractC9452pp2, AbstractC9543ra abstractC9543ra, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        return new CollectionDeserializer(this.c, abstractC9452pp2, abstractC9543ra, this.a, abstractC9452pp, interfaceC9428pR, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    @Override // o.InterfaceC9420pJ
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.deser.std.CollectionDeserializer c(com.fasterxml.jackson.databind.DeserializationContext r8, com.fasterxml.jackson.databind.BeanProperty r9) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7.a
            if (r0 == 0) goto L66
            boolean r0 = r0.f()
            if (r0 == 0) goto L34
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7.a
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r8.c()
            com.fasterxml.jackson.databind.JavaType r0 = r0.c(r1)
            if (r0 != 0) goto L2f
            com.fasterxml.jackson.databind.JavaType r1 = r7.c
            com.fasterxml.jackson.databind.deser.ValueInstantiator r2 = r7.a
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r3 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r8.c(r1, r2)
        L2f:
            o.pp r0 = r7.a(r8, r0, r9)
            goto L67
        L34:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7.a
            boolean r0 = r0.j()
            if (r0 == 0) goto L66
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7.a
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r8.c()
            com.fasterxml.jackson.databind.JavaType r0 = r0.e(r1)
            if (r0 != 0) goto L61
            com.fasterxml.jackson.databind.JavaType r1 = r7.c
            com.fasterxml.jackson.databind.deser.ValueInstantiator r2 = r7.a
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r3 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r8.c(r1, r2)
        L61:
            o.pp r0 = r7.a(r8, r0, r9)
            goto L67
        L66:
            r0 = 0
        L67:
            r2 = r0
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r1 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r6 = r7.d(r8, r9, r0, r1)
            o.pp<java.lang.Object> r0 = r7.b
            o.pp r0 = r7.d(r8, r9, r0)
            com.fasterxml.jackson.databind.JavaType r1 = r7.c
            com.fasterxml.jackson.databind.JavaType r1 = r1.j()
            if (r0 != 0) goto L83
            o.pp r0 = r8.c(r1, r9)
            goto L87
        L83:
            o.pp r0 = r8.e(r0, r9, r1)
        L87:
            r3 = r0
            o.ra r0 = r7.d
            if (r0 == 0) goto L90
            o.ra r0 = r0.d(r9)
        L90:
            r4 = r0
            o.pR r5 = r7.b(r8, r9, r3)
            java.lang.Boolean r8 = r7.h
            if (r6 != r8) goto Lab
            o.pR r8 = r7.g
            if (r5 != r8) goto Lab
            o.pp<java.lang.Object> r8 = r7.e
            if (r2 != r8) goto Lab
            o.pp<java.lang.Object> r8 = r7.b
            if (r3 != r8) goto Lab
            o.ra r8 = r7.d
            if (r4 == r8) goto Laa
            goto Lab
        Laa:
            return r7
        Lab:
            r1 = r7
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r8 = r1.b(r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.c(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
    }

    @Override // o.AbstractC9452pp
    /* renamed from: d */
    public Collection<Object> b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        AbstractC9452pp<Object> abstractC9452pp = this.e;
        if (abstractC9452pp != null) {
            return (Collection) this.a.b(deserializationContext, abstractC9452pp.b(jsonParser, deserializationContext));
        }
        if (jsonParser.a(JsonToken.VALUE_STRING)) {
            String A = jsonParser.A();
            if (A.length() == 0) {
                return (Collection) this.a.a(deserializationContext, A);
            }
        }
        return e(jsonParser, deserializationContext, b(deserializationContext));
    }

    protected Collection<Object> b(DeserializationContext deserializationContext) {
        return (Collection) this.a.e(deserializationContext);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: b */
    public Collection<Object> e(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) {
        Object a2;
        if (!jsonParser.J()) {
            return c(jsonParser, deserializationContext, collection);
        }
        jsonParser.e(collection);
        AbstractC9452pp<Object> abstractC9452pp = this.b;
        if (abstractC9452pp.b() != null) {
            return a(jsonParser, deserializationContext, collection);
        }
        AbstractC9543ra abstractC9543ra = this.d;
        while (true) {
            JsonToken Q = jsonParser.Q();
            if (Q == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
                if (Q == JsonToken.VALUE_NULL) {
                    if (!this.i) {
                        a2 = this.g.c(deserializationContext);
                    }
                } else if (abstractC9543ra == null) {
                    a2 = abstractC9452pp.b(jsonParser, deserializationContext);
                } else {
                    a2 = abstractC9452pp.a(jsonParser, deserializationContext, abstractC9543ra);
                }
                collection.add(a2);
            } catch (Exception e) {
                if (deserializationContext != null && !deserializationContext.d(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    C9537rU.h(e);
                }
                throw JsonMappingException.d(e, collection, collection.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.d(jsonParser, deserializationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Collection<Object> c(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) {
        Object a2;
        Boolean bool = this.h;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.d(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) deserializationContext.d(this.c, jsonParser);
        }
        AbstractC9452pp<Object> abstractC9452pp = this.b;
        AbstractC9543ra abstractC9543ra = this.d;
        try {
            if (jsonParser.a(JsonToken.VALUE_NULL)) {
                if (this.i) {
                    return collection;
                }
                a2 = this.g.c(deserializationContext);
            } else if (abstractC9543ra == null) {
                a2 = abstractC9452pp.b(jsonParser, deserializationContext);
            } else {
                a2 = abstractC9452pp.a(jsonParser, deserializationContext, abstractC9543ra);
            }
            collection.add(a2);
            return collection;
        } catch (Exception e) {
            throw JsonMappingException.d(e, Object.class, collection.size());
        }
    }

    protected Collection<Object> a(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) {
        Object a2;
        if (!jsonParser.J()) {
            return c(jsonParser, deserializationContext, collection);
        }
        jsonParser.e(collection);
        AbstractC9452pp<Object> abstractC9452pp = this.b;
        AbstractC9543ra abstractC9543ra = this.d;
        c cVar = new c(this.c.j().h(), collection);
        while (true) {
            JsonToken Q = jsonParser.Q();
            if (Q == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
            } catch (UnresolvedForwardReference e) {
                e.a().e(cVar.b(e));
            } catch (Exception e2) {
                if (deserializationContext != null && !deserializationContext.d(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    C9537rU.h(e2);
                }
                throw JsonMappingException.d(e2, collection, collection.size());
            }
            if (Q == JsonToken.VALUE_NULL) {
                if (!this.i) {
                    a2 = this.g.c(deserializationContext);
                }
            } else if (abstractC9543ra == null) {
                a2 = abstractC9452pp.b(jsonParser, deserializationContext);
            } else {
                a2 = abstractC9452pp.a(jsonParser, deserializationContext, abstractC9543ra);
            }
            cVar.e(a2);
        }
    }

    /* loaded from: classes5.dex */
    public static class c {
        private List<a> a = new ArrayList();
        private final Class<?> c;
        private final Collection<Object> e;

        public c(Class<?> cls, Collection<Object> collection) {
            this.c = cls;
            this.e = collection;
        }

        public void e(Object obj) {
            if (this.a.isEmpty()) {
                this.e.add(obj);
                return;
            }
            List<a> list = this.a;
            list.get(list.size() - 1).a.add(obj);
        }

        public C9494qe.d b(UnresolvedForwardReference unresolvedForwardReference) {
            a aVar = new a(this, unresolvedForwardReference, this.c);
            this.a.add(aVar);
            return aVar;
        }

        public void e(Object obj, Object obj2) {
            Iterator<a> it = this.a.iterator();
            Collection collection = this.e;
            while (it.hasNext()) {
                a next = it.next();
                if (next.d(obj)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(next.a);
                    return;
                }
                collection = next.a;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends C9494qe.d {
        public final List<Object> a;
        private final c d;

        a(c cVar, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            super(unresolvedForwardReference, cls);
            this.a = new ArrayList();
            this.d = cVar;
        }

        @Override // o.C9494qe.d
        public void c(Object obj, Object obj2) {
            this.d.e(obj, obj2);
        }
    }
}
