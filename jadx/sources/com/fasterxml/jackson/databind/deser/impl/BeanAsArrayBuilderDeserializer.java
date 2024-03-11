package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;
import o.AbstractC9452pp;
import o.C9491qb;

/* loaded from: classes5.dex */
public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod c;
    protected final SettableBeanProperty[] w;
    protected final BeanDeserializerBase x;
    protected final JavaType y;

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase f() {
        return this;
    }

    public BeanAsArrayBuilderDeserializer(BeanDeserializerBase beanDeserializerBase, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, AnnotatedMethod annotatedMethod) {
        super(beanDeserializerBase);
        this.x = beanDeserializerBase;
        this.y = javaType;
        this.w = settableBeanPropertyArr;
        this.c = annotatedMethod;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC9452pp
    public AbstractC9452pp<Object> d(NameTransformer nameTransformer) {
        return this.x.d(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase b(ObjectIdReader objectIdReader) {
        return new BeanAsArrayBuilderDeserializer(this.x.b(objectIdReader), this.y, this.w, this.c);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase c(Set<String> set) {
        return new BeanAsArrayBuilderDeserializer(this.x.c(set), this.y, this.w, this.c);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase e(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayBuilderDeserializer(this.x.e(beanPropertyMap), this.y, this.w, this.c);
    }

    protected final Object b(DeserializationContext deserializationContext, Object obj) {
        try {
            return this.c.h().invoke(obj, null);
        } catch (Exception e) {
            return c(e, deserializationContext);
        }
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.J()) {
            if (!this.u) {
                return b(deserializationContext, e(jsonParser, deserializationContext));
            }
            Object e = this.r.e(deserializationContext);
            SettableBeanProperty[] settableBeanPropertyArr = this.w;
            int length = settableBeanPropertyArr.length;
            int i = 0;
            while (jsonParser.Q() != JsonToken.END_ARRAY) {
                if (i != length) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                    if (settableBeanProperty != null) {
                        try {
                            e = settableBeanProperty.e(jsonParser, deserializationContext, e);
                        } catch (Exception e2) {
                            b(e2, e, settableBeanProperty.a(), deserializationContext);
                        }
                    } else {
                        jsonParser.T();
                    }
                    i++;
                } else {
                    if (!this.l && deserializationContext.d(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        deserializationContext.b(c(), "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                    }
                    while (jsonParser.Q() != JsonToken.END_ARRAY) {
                        jsonParser.T();
                    }
                    return b(deserializationContext, e);
                }
            }
            return b(deserializationContext, e);
        }
        return b(deserializationContext, a(jsonParser, deserializationContext));
    }

    @Override // o.AbstractC9452pp
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return this.x.e(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return a(jsonParser, deserializationContext);
    }

    protected Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this.m) {
            return l(jsonParser, deserializationContext);
        }
        Object e = this.r.e(deserializationContext);
        if (this.f13104o != null) {
            e(deserializationContext, e);
        }
        Class<?> b = this.n ? deserializationContext.b() : null;
        SettableBeanProperty[] settableBeanPropertyArr = this.w;
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
                        settableBeanProperty.e(jsonParser, deserializationContext, e);
                    } catch (Exception e2) {
                        b(e2, e, settableBeanProperty.a(), deserializationContext);
                    }
                } else {
                    jsonParser.T();
                }
            } else {
                if (!this.l && deserializationContext.d(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.e(this, jsonToken, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                while (jsonParser.Q() != JsonToken.END_ARRAY) {
                    jsonParser.T();
                }
                return e;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        PropertyBasedCreator propertyBasedCreator = this.s;
        C9491qb d = propertyBasedCreator.d(jsonParser, deserializationContext, this.k);
        SettableBeanProperty[] settableBeanPropertyArr = this.w;
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
                    obj = settableBeanProperty.e(jsonParser, deserializationContext, obj);
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
                            if (obj.getClass() != this.f.h()) {
                                JavaType javaType = this.f;
                                return deserializationContext.c(javaType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", javaType.h().getName(), obj.getClass().getName()));
                            }
                        } catch (Exception e2) {
                            b(e2, this.f.h(), a, deserializationContext);
                        }
                    } else {
                        continue;
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

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return deserializationContext.c(h(deserializationContext), jsonParser.o(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.f.h().getName(), jsonParser.o());
    }
}
