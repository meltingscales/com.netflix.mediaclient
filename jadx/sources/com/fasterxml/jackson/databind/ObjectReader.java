package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import o.AbstractC9378oU;
import o.AbstractC9380oW;
import o.AbstractC9447pk;
import o.AbstractC9452pp;
import o.AbstractC9454pr;
import o.C9385ob;
import o.C9418pH;
import o.C9423pM;
import o.C9456pt;
import o.C9537rU;
import o.C9558rp;
import o.InterfaceC9324nT;
import o.InterfaceC9330nZ;

/* loaded from: classes5.dex */
public class ObjectReader extends ObjectCodec implements Serializable {
    private static final long serialVersionUID = 2;
    protected final C9423pM a;
    protected final DefaultDeserializationContext b;
    protected transient JavaType c;
    protected final DeserializationConfig d;
    protected final AbstractC9447pk e;
    protected final AbstractC9452pp<Object> f;
    protected final ConcurrentHashMap<JavaType, AbstractC9452pp<Object>> g;
    protected final InterfaceC9324nT h;
    protected final JsonFactory i;
    protected final boolean j;
    protected final Object k;
    private final TokenFilter m;

    /* renamed from: o  reason: collision with root package name */
    protected final JavaType f13101o;

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, InterfaceC9324nT interfaceC9324nT, AbstractC9447pk abstractC9447pk) {
        this.d = deserializationConfig;
        this.b = objectMapper._deserializationContext;
        this.g = objectMapper._rootDeserializers;
        this.i = objectMapper._jsonFactory;
        this.f13101o = javaType;
        this.k = obj;
        this.h = interfaceC9324nT;
        this.e = abstractC9447pk;
        this.j = deserializationConfig.a();
        this.f = c(javaType);
        this.a = null;
        this.m = null;
    }

    protected ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, AbstractC9452pp<Object> abstractC9452pp, Object obj, InterfaceC9324nT interfaceC9324nT, AbstractC9447pk abstractC9447pk, C9423pM c9423pM) {
        this.d = deserializationConfig;
        this.b = objectReader.b;
        this.g = objectReader.g;
        this.i = objectReader.i;
        this.f13101o = javaType;
        this.f = abstractC9452pp;
        this.k = obj;
        this.h = interfaceC9324nT;
        this.e = abstractC9447pk;
        this.j = deserializationConfig.a();
        this.a = c9423pM;
        this.m = objectReader.m;
    }

    protected ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this.d = deserializationConfig;
        this.b = objectReader.b;
        this.g = objectReader.g;
        this.i = objectReader.i;
        this.f13101o = objectReader.f13101o;
        this.f = objectReader.f;
        this.k = objectReader.k;
        this.h = objectReader.h;
        this.e = objectReader.e;
        this.j = deserializationConfig.a();
        this.a = objectReader.a;
        this.m = objectReader.m;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public Version version() {
        return C9418pH.c;
    }

    protected ObjectReader a(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        return new ObjectReader(objectReader, deserializationConfig);
    }

    protected ObjectReader a(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, AbstractC9452pp<Object> abstractC9452pp, Object obj, InterfaceC9324nT interfaceC9324nT, AbstractC9447pk abstractC9447pk, C9423pM c9423pM) {
        return new ObjectReader(objectReader, deserializationConfig, javaType, abstractC9452pp, obj, interfaceC9324nT, abstractC9447pk, c9423pM);
    }

    protected <T> C9456pt<T> a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9452pp<?> abstractC9452pp, boolean z) {
        return new C9456pt<>(this.f13101o, jsonParser, deserializationContext, abstractC9452pp, z, this.k);
    }

    protected JsonToken e(DeserializationContext deserializationContext, JsonParser jsonParser) {
        InterfaceC9324nT interfaceC9324nT = this.h;
        if (interfaceC9324nT != null) {
            jsonParser.d(interfaceC9324nT);
        }
        this.d.d(jsonParser);
        JsonToken o2 = jsonParser.o();
        if (o2 == null && (o2 = jsonParser.Q()) == null) {
            deserializationContext.e(this.f13101o, "No content to map due to end-of-input", new Object[0]);
        }
        return o2;
    }

    public ObjectReader d(DeserializationConfig deserializationConfig) {
        return e(deserializationConfig);
    }

    public ObjectReader d(AbstractC9447pk abstractC9447pk) {
        return this.e == abstractC9447pk ? this : a(this, this.d, this.f13101o, this.f, this.k, this.h, abstractC9447pk, this.a);
    }

    public ObjectReader a(JsonNodeFactory jsonNodeFactory) {
        return e(this.d.c(jsonNodeFactory));
    }

    public ObjectReader b(JavaType javaType) {
        if (javaType == null || !javaType.equals(this.f13101o)) {
            AbstractC9452pp<Object> c = c(javaType);
            C9423pM c9423pM = this.a;
            if (c9423pM != null) {
                c9423pM = c9423pM.c(javaType);
            }
            return a(this, this.d, javaType, c, this.k, this.h, this.e, c9423pM);
        }
        return this;
    }

    public ObjectReader c(Class<?> cls) {
        return b(this.d.b(cls));
    }

    public ObjectReader e(AbstractC9378oU<?> abstractC9378oU) {
        return b(this.d.t().d(abstractC9378oU.b()));
    }

    public ObjectReader e(Object obj) {
        if (obj == this.k) {
            return this;
        }
        if (obj == null) {
            return a(this, this.d, this.f13101o, this.f, null, this.h, this.e, this.a);
        }
        JavaType javaType = this.f13101o;
        if (javaType == null) {
            javaType = this.d.b(obj.getClass());
        }
        return a(this, this.d, javaType, this.f, obj, this.h, this.e, this.a);
    }

    public ObjectReader d(C9423pM c9423pM) {
        return a(this, this.d, this.f13101o, this.f, this.k, this.h, this.e, c9423pM);
    }

    protected ObjectReader e(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this.d) {
            return this;
        }
        ObjectReader a = a(this, deserializationConfig);
        C9423pM c9423pM = this.a;
        return c9423pM != null ? a.d(c9423pM.d(deserializationConfig)) : a;
    }

    public TypeFactory b() {
        return this.d.t();
    }

    public <T> T a(JsonParser jsonParser) {
        a("p", jsonParser);
        return (T) e(jsonParser, this.k);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) {
        a("p", jsonParser);
        return (T) c((Class<?>) cls).a(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, AbstractC9378oU<T> abstractC9378oU) {
        a("p", jsonParser);
        return (T) e((AbstractC9378oU<?>) abstractC9378oU).a(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, AbstractC9380oW abstractC9380oW) {
        a("p", jsonParser);
        return (T) b((JavaType) abstractC9380oW).a(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) {
        a("p", jsonParser);
        return c((Class<?>) cls).b(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, AbstractC9378oU<T> abstractC9378oU) {
        a("p", jsonParser);
        return e((AbstractC9378oU<?>) abstractC9378oU).b(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, AbstractC9380oW abstractC9380oW) {
        a("p", jsonParser);
        return b(jsonParser, (JavaType) abstractC9380oW);
    }

    public <T> Iterator<T> b(JsonParser jsonParser, JavaType javaType) {
        a("p", jsonParser);
        return b(javaType).b(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    /* renamed from: e */
    public AbstractC9454pr createArrayNode() {
        return this.d.b().c();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    /* renamed from: c */
    public AbstractC9454pr createObjectNode() {
        return this.d.b().a();
    }

    @Override // o.AbstractC9328nX
    /* renamed from: d */
    public AbstractC9454pr missingNode() {
        return this.d.b().b();
    }

    @Override // o.AbstractC9328nX
    /* renamed from: j */
    public AbstractC9454pr nullNode() {
        return this.d.b().e();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonParser treeAsTokens(InterfaceC9330nZ interfaceC9330nZ) {
        a("n", interfaceC9330nZ);
        return new C9558rp((AbstractC9454pr) interfaceC9330nZ, e((Object) null));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T extends InterfaceC9330nZ> T readTree(JsonParser jsonParser) {
        a("p", jsonParser);
        return c(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeTree(JsonGenerator jsonGenerator, InterfaceC9330nZ interfaceC9330nZ) {
        throw new UnsupportedOperationException();
    }

    public <T> T c(byte[] bArr) {
        a("src", bArr);
        if (this.a != null) {
            return (T) c(bArr, 0, bArr.length);
        }
        return (T) e(c(this.i.createParser(bArr), false));
    }

    public <T> C9456pt<T> b(JsonParser jsonParser) {
        a("p", jsonParser);
        DefaultDeserializationContext d = d(jsonParser);
        return a(jsonParser, d, b(d), false);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T treeToValue(InterfaceC9330nZ interfaceC9330nZ, Class<T> cls) {
        a("n", interfaceC9330nZ);
        try {
            return (T) readValue(treeAsTokens(interfaceC9330nZ), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.b(e2);
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    protected Object e(JsonParser jsonParser, Object obj) {
        DefaultDeserializationContext d = d(jsonParser);
        JsonToken e = e(d, jsonParser);
        if (e == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = b(d).c(d);
            }
        } else if (e != JsonToken.END_ARRAY && e != JsonToken.END_OBJECT) {
            AbstractC9452pp<Object> b = b(d);
            if (this.j) {
                obj = e(jsonParser, d, this.f13101o, b);
            } else if (obj == null) {
                obj = b.b(jsonParser, d);
            } else {
                obj = b.e(jsonParser, d, obj);
            }
        }
        jsonParser.e();
        if (this.d.e(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            a(jsonParser, d, this.f13101o);
        }
        return obj;
    }

    protected Object e(JsonParser jsonParser) {
        Object obj;
        try {
            DefaultDeserializationContext d = d(jsonParser);
            JsonToken e = e(d, jsonParser);
            if (e == JsonToken.VALUE_NULL) {
                obj = this.k;
                if (obj == null) {
                    obj = b(d).c(d);
                }
            } else {
                if (e != JsonToken.END_ARRAY && e != JsonToken.END_OBJECT) {
                    AbstractC9452pp<Object> b = b(d);
                    if (this.j) {
                        obj = e(jsonParser, d, this.f13101o, b);
                    } else {
                        Object obj2 = this.k;
                        if (obj2 == null) {
                            obj = b.b(jsonParser, d);
                        } else {
                            b.e(jsonParser, d, obj2);
                        }
                    }
                }
                obj = this.k;
            }
            if (this.d.e(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                a(jsonParser, d, this.f13101o);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return obj;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    protected final AbstractC9454pr c(JsonParser jsonParser) {
        DefaultDeserializationContext d;
        AbstractC9454pr abstractC9454pr;
        this.d.d(jsonParser);
        InterfaceC9324nT interfaceC9324nT = this.h;
        if (interfaceC9324nT != null) {
            jsonParser.d(interfaceC9324nT);
        }
        JsonToken o2 = jsonParser.o();
        if (o2 == null && (o2 = jsonParser.Q()) == null) {
            return null;
        }
        boolean e = this.d.e(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
        if (o2 == JsonToken.VALUE_NULL) {
            abstractC9454pr = this.d.b().e();
            if (!e) {
                return abstractC9454pr;
            }
            d = d(jsonParser);
        } else {
            d = d(jsonParser);
            AbstractC9452pp<Object> e2 = e((DeserializationContext) d);
            if (this.j) {
                abstractC9454pr = (AbstractC9454pr) e(jsonParser, d, a(), e2);
            } else {
                abstractC9454pr = (AbstractC9454pr) e2.b(jsonParser, d);
            }
        }
        if (e) {
            a(jsonParser, d, a());
        }
        return abstractC9454pr;
    }

    protected Object e(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType, AbstractC9452pp<Object> abstractC9452pp) {
        Object obj;
        String c = this.d.i(javaType).c();
        JsonToken o2 = jsonParser.o();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (o2 != jsonToken) {
            deserializationContext.d(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", c, jsonParser.o());
        }
        JsonToken Q = jsonParser.Q();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (Q != jsonToken2) {
            deserializationContext.d(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", c, jsonParser.o());
        }
        String l = jsonParser.l();
        if (!c.equals(l)) {
            deserializationContext.c(javaType, l, "Root name '%s' does not match expected ('%s') for type %s", l, c, javaType);
        }
        jsonParser.Q();
        Object obj2 = this.k;
        if (obj2 == null) {
            obj = abstractC9452pp.b(jsonParser, deserializationContext);
        } else {
            abstractC9452pp.e(jsonParser, deserializationContext, obj2);
            obj = this.k;
        }
        JsonToken Q2 = jsonParser.Q();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (Q2 != jsonToken3) {
            deserializationContext.d(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", c, jsonParser.o());
        }
        if (this.d.e(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            a(jsonParser, deserializationContext, this.f13101o);
        }
        return obj;
    }

    protected JsonParser c(JsonParser jsonParser, boolean z) {
        return (this.m == null || C9385ob.class.isInstance(jsonParser)) ? jsonParser : new C9385ob(jsonParser, this.m, false, z);
    }

    protected final void a(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) {
        Object obj;
        JsonToken Q = jsonParser.Q();
        if (Q != null) {
            Class<?> d = C9537rU.d(javaType);
            if (d == null && (obj = this.k) != null) {
                d = obj.getClass();
            }
            deserializationContext.c(d, jsonParser, Q);
        }
    }

    protected Object c(byte[] bArr, int i, int i2) {
        C9423pM.a a = this.a.a(bArr, i, i2);
        if (!a.e()) {
            c(this.a, a);
        }
        return a.d().e(a.a());
    }

    protected void c(C9423pM c9423pM, C9423pM.a aVar) {
        throw new JsonParseException(null, "Cannot detect format from input, does not look like any of detectable formats " + c9423pM.toString());
    }

    protected DefaultDeserializationContext d(JsonParser jsonParser) {
        return this.b.b(this.d, jsonParser, this.e);
    }

    protected AbstractC9452pp<Object> b(DeserializationContext deserializationContext) {
        AbstractC9452pp<Object> abstractC9452pp = this.f;
        if (abstractC9452pp != null) {
            return abstractC9452pp;
        }
        JavaType javaType = this.f13101o;
        if (javaType == null) {
            deserializationContext.c((JavaType) null, "No value type configured for ObjectReader");
        }
        AbstractC9452pp<Object> abstractC9452pp2 = this.g.get(javaType);
        if (abstractC9452pp2 != null) {
            return abstractC9452pp2;
        }
        AbstractC9452pp<Object> c = deserializationContext.c(javaType);
        if (c == null) {
            deserializationContext.c(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this.g.put(javaType, c);
        return c;
    }

    protected AbstractC9452pp<Object> e(DeserializationContext deserializationContext) {
        JavaType a = a();
        AbstractC9452pp<Object> abstractC9452pp = this.g.get(a);
        if (abstractC9452pp == null) {
            abstractC9452pp = deserializationContext.c(a);
            if (abstractC9452pp == null) {
                deserializationContext.c(a, "Cannot find a deserializer for type " + a);
            }
            this.g.put(a, abstractC9452pp);
        }
        return abstractC9452pp;
    }

    protected AbstractC9452pp<Object> c(JavaType javaType) {
        if (javaType == null || !this.d.e(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        AbstractC9452pp<Object> abstractC9452pp = this.g.get(javaType);
        if (abstractC9452pp == null) {
            try {
                abstractC9452pp = d((JsonParser) null).c(javaType);
                if (abstractC9452pp != null) {
                    this.g.put(javaType, abstractC9452pp);
                }
            } catch (JsonProcessingException unused) {
            }
        }
        return abstractC9452pp;
    }

    protected final JavaType a() {
        JavaType javaType = this.c;
        if (javaType == null) {
            JavaType d = b().d(AbstractC9454pr.class);
            this.c = d;
            return d;
        }
        return javaType;
    }

    protected final void a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}
