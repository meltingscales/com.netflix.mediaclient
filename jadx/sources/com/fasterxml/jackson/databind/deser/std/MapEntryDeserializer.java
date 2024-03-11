package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import java.util.AbstractMap;
import java.util.Map;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.InterfaceC9420pJ;
import o.InterfaceC9421pK;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class MapEntryDeserializer extends ContainerDeserializerBase<Map.Entry<Object, Object>> implements InterfaceC9420pJ {
    private static final long serialVersionUID = 1;
    protected final AbstractC9543ra a;
    protected final AbstractC9452pp<Object> b;
    protected final AbstractC9450pn d;

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC9452pp<Object> h() {
        return this.b;
    }

    public MapEntryDeserializer(JavaType javaType, AbstractC9450pn abstractC9450pn, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra) {
        super(javaType);
        if (javaType.b() == 2) {
            this.d = abstractC9450pn;
            this.b = abstractC9452pp;
            this.a = abstractC9543ra;
            return;
        }
        throw new IllegalArgumentException("Missing generic type information for " + javaType);
    }

    protected MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer, AbstractC9450pn abstractC9450pn, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra) {
        super(mapEntryDeserializer);
        this.d = abstractC9450pn;
        this.b = abstractC9452pp;
        this.a = abstractC9543ra;
    }

    protected MapEntryDeserializer a(AbstractC9450pn abstractC9450pn, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        return (this.d == abstractC9450pn && this.b == abstractC9452pp && this.a == abstractC9543ra) ? this : new MapEntryDeserializer(this, abstractC9450pn, abstractC9452pp, abstractC9543ra);
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AbstractC9452pp<?> e;
        AbstractC9450pn abstractC9450pn = this.d;
        if (abstractC9450pn == null) {
            abstractC9450pn = deserializationContext.e(this.c.e(0), beanProperty);
        } else if (abstractC9450pn instanceof InterfaceC9421pK) {
            abstractC9450pn = ((InterfaceC9421pK) abstractC9450pn).b(deserializationContext, beanProperty);
        }
        AbstractC9452pp<?> d = d(deserializationContext, beanProperty, this.b);
        JavaType e2 = this.c.e(1);
        if (d == null) {
            e = deserializationContext.c(e2, beanProperty);
        } else {
            e = deserializationContext.e(d, beanProperty, e2);
        }
        AbstractC9543ra abstractC9543ra = this.a;
        if (abstractC9543ra != null) {
            abstractC9543ra = abstractC9543ra.d(beanProperty);
        }
        return a(abstractC9450pn, abstractC9543ra, e);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: d */
    public Map.Entry<Object, Object> b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        JsonToken f = jsonParser.f();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (f != jsonToken && f != JsonToken.FIELD_NAME && f != JsonToken.END_OBJECT) {
            return t(jsonParser, deserializationContext);
        }
        if (f == jsonToken) {
            f = jsonParser.Q();
        }
        if (f != JsonToken.FIELD_NAME) {
            if (f == JsonToken.END_OBJECT) {
                return (Map.Entry) deserializationContext.a(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
            }
            return (Map.Entry) deserializationContext.e(c(), jsonParser);
        }
        AbstractC9450pn abstractC9450pn = this.d;
        AbstractC9452pp<Object> abstractC9452pp = this.b;
        AbstractC9543ra abstractC9543ra = this.a;
        String l = jsonParser.l();
        Object c = abstractC9450pn.c(l, deserializationContext);
        try {
            if (jsonParser.Q() == JsonToken.VALUE_NULL) {
                obj = abstractC9452pp.c(deserializationContext);
            } else if (abstractC9543ra == null) {
                obj = abstractC9452pp.b(jsonParser, deserializationContext);
            } else {
                obj = abstractC9452pp.a(jsonParser, deserializationContext, abstractC9543ra);
            }
        } catch (Exception e) {
            e(e, Map.Entry.class, l);
            obj = null;
        }
        JsonToken Q = jsonParser.Q();
        if (Q != JsonToken.END_OBJECT) {
            if (Q == JsonToken.FIELD_NAME) {
                deserializationContext.a(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jsonParser.l());
            } else {
                deserializationContext.a(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + Q, new Object[0]);
            }
            return null;
        }
        return new AbstractMap.SimpleEntry(c, obj);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: d */
    public Map.Entry<Object, Object> e(JsonParser jsonParser, DeserializationContext deserializationContext, Map.Entry<Object, Object> entry) {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.a(jsonParser, deserializationContext);
    }
}
