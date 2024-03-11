package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;
import o.AbstractC9452pp;

/* loaded from: classes5.dex */
public class ThrowableDeserializer extends BeanDeserializer {
    private static final long serialVersionUID = 1;

    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this.u = false;
    }

    protected ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super(beanDeserializer, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC9452pp
    public AbstractC9452pp<Object> d(NameTransformer nameTransformer) {
        return getClass() != ThrowableDeserializer.class ? this : new ThrowableDeserializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object e;
        if (this.s != null) {
            return d(jsonParser, deserializationContext);
        }
        AbstractC9452pp<Object> abstractC9452pp = this.i;
        if (abstractC9452pp != null) {
            return this.r.b(deserializationContext, abstractC9452pp.b(jsonParser, deserializationContext));
        }
        if (this.f.s()) {
            return deserializationContext.c(c(), j(), jsonParser, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean h = this.r.h();
        boolean g = this.r.g();
        if (!h && !g) {
            return deserializationContext.c(c(), j(), jsonParser, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
        }
        int i = 0;
        Object obj = null;
        Object[] objArr = null;
        while (!jsonParser.a(JsonToken.END_OBJECT)) {
            String l = jsonParser.l();
            SettableBeanProperty e2 = this.g.e(l);
            jsonParser.Q();
            if (e2 != null) {
                if (obj != null) {
                    e2.d(jsonParser, deserializationContext, obj);
                } else {
                    if (objArr == null) {
                        int e3 = this.g.e();
                        objArr = new Object[e3 + e3];
                    }
                    objArr[i] = e2;
                    objArr[i + 1] = e2.a(jsonParser, deserializationContext);
                    i += 2;
                }
            } else if ("message".equals(l) && h) {
                obj = this.r.a(deserializationContext, jsonParser.L());
                if (objArr != null) {
                    for (int i2 = 0; i2 < i; i2 += 2) {
                        ((SettableBeanProperty) objArr[i2]).e(obj, objArr[i2 + 1]);
                    }
                    objArr = null;
                }
            } else {
                Set<String> set = this.h;
                if (set == null || !set.contains(l)) {
                    SettableAnyProperty settableAnyProperty = this.e;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.c(jsonParser, deserializationContext, obj, l);
                    } else {
                        d(jsonParser, deserializationContext, obj, l);
                    }
                } else {
                    jsonParser.T();
                }
            }
            jsonParser.Q();
        }
        if (obj == null) {
            if (h) {
                e = this.r.a(deserializationContext, (String) null);
            } else {
                e = this.r.e(deserializationContext);
            }
            obj = e;
            if (objArr != null) {
                for (int i3 = 0; i3 < i; i3 += 2) {
                    ((SettableBeanProperty) objArr[i3]).e(obj, objArr[i3 + 1]);
                }
            }
        }
        return obj;
    }
}
