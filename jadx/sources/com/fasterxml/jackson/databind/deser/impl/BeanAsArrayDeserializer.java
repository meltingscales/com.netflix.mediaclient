package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;
import o.AbstractC9452pp;
import o.C9491qb;

/* loaded from: classes5.dex */
public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanDeserializerBase c;
    protected final SettableBeanProperty[] x;

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase f() {
        return this;
    }

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, SettableBeanProperty[] settableBeanPropertyArr) {
        super(beanDeserializerBase);
        this.c = beanDeserializerBase;
        this.x = settableBeanPropertyArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC9452pp
    public AbstractC9452pp<Object> d(NameTransformer nameTransformer) {
        return this.c.d(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase b(ObjectIdReader objectIdReader) {
        return new BeanAsArrayDeserializer(this.c.b(objectIdReader), this.x);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase c(Set<String> set) {
        return new BeanAsArrayDeserializer(this.c.c(set), this.x);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase e(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayDeserializer(this.c.e(beanPropertyMap), this.x);
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.J()) {
            return e(jsonParser, deserializationContext);
        }
        if (!this.u) {
            return a(jsonParser, deserializationContext);
        }
        Object e = this.r.e(deserializationContext);
        jsonParser.e(e);
        SettableBeanProperty[] settableBeanPropertyArr = this.x;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (true) {
            JsonToken Q = jsonParser.Q();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (Q == jsonToken) {
                return e;
            }
            if (i != length) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.d(jsonParser, deserializationContext, e);
                    } catch (Exception e2) {
                        b(e2, e, settableBeanProperty.a(), deserializationContext);
                    }
                } else {
                    jsonParser.T();
                }
                i++;
            } else {
                if (!this.l && deserializationContext.d(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.e(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.T();
                } while (jsonParser.Q() != JsonToken.END_ARRAY);
                return e;
            }
        }
    }

    @Override // o.AbstractC9452pp
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        jsonParser.e(obj);
        if (!jsonParser.J()) {
            return e(jsonParser, deserializationContext);
        }
        if (this.f13104o != null) {
            e(deserializationContext, obj);
        }
        SettableBeanProperty[] settableBeanPropertyArr = this.x;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (true) {
            JsonToken Q = jsonParser.Q();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (Q == jsonToken) {
                return obj;
            }
            if (i != length) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.d(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        b(e, obj, settableBeanProperty.a(), deserializationContext);
                    }
                } else {
                    jsonParser.T();
                }
                i++;
            } else {
                if (!this.l && deserializationContext.d(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.e(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.T();
                } while (jsonParser.Q() != JsonToken.END_ARRAY);
                return obj;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return e(jsonParser, deserializationContext);
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this.m) {
            return l(jsonParser, deserializationContext);
        }
        Object e = this.r.e(deserializationContext);
        jsonParser.e(e);
        if (this.f13104o != null) {
            e(deserializationContext, e);
        }
        Class<?> b = this.n ? deserializationContext.b() : null;
        SettableBeanProperty[] settableBeanPropertyArr = this.x;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (true) {
            JsonToken Q = jsonParser.Q();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (Q == jsonToken) {
                return e;
            }
            if (i != length) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                i++;
                if (settableBeanProperty != null && (b == null || settableBeanProperty.a(b))) {
                    try {
                        settableBeanProperty.d(jsonParser, deserializationContext, e);
                    } catch (Exception e2) {
                        b(e2, e, settableBeanProperty.a(), deserializationContext);
                    }
                } else {
                    jsonParser.T();
                }
            } else {
                if (!this.l) {
                    deserializationContext.e(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.T();
                } while (jsonParser.Q() != JsonToken.END_ARRAY);
                return e;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        PropertyBasedCreator propertyBasedCreator = this.s;
        C9491qb d = propertyBasedCreator.d(jsonParser, deserializationContext, this.k);
        SettableBeanProperty[] settableBeanPropertyArr = this.x;
        int length = settableBeanPropertyArr.length;
        Class<?> b = this.n ? deserializationContext.b() : null;
        int i = 0;
        Object obj = null;
        while (jsonParser.Q() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i < length ? settableBeanPropertyArr[i] : null;
            if (settableBeanProperty == null) {
                jsonParser.T();
            } else if (b != null && !settableBeanProperty.a(b)) {
                jsonParser.T();
            } else if (obj != null) {
                try {
                    settableBeanProperty.d(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    b(e, obj, settableBeanProperty.a(), deserializationContext);
                }
            } else {
                String a = settableBeanProperty.a();
                SettableBeanProperty b2 = propertyBasedCreator.b(a);
                if (b2 != null) {
                    if (d.a(b2, b2.a(jsonParser, deserializationContext))) {
                        try {
                            obj = propertyBasedCreator.e(deserializationContext, d);
                            jsonParser.e(obj);
                            if (obj.getClass() != this.f.h()) {
                                JavaType javaType = this.f;
                                deserializationContext.c(javaType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", javaType.h().getName(), obj.getClass().getName()));
                            }
                        } catch (Exception e2) {
                            b(e2, this.f.h(), a, deserializationContext);
                        }
                    }
                } else if (!d.a(a)) {
                    d.b(settableBeanProperty, settableBeanProperty.a(jsonParser, deserializationContext));
                }
            }
            i++;
        }
        if (obj == null) {
            try {
                return propertyBasedCreator.e(deserializationContext, d);
            } catch (Exception e3) {
                return c(e3, deserializationContext);
            }
        }
        return obj;
    }

    protected Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return deserializationContext.c(h(deserializationContext), jsonParser.o(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.f.h().getName(), jsonParser.o());
    }
}
