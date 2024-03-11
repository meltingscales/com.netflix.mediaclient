package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.lang.reflect.Array;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9589sa;
import o.InterfaceC9420pJ;
import o.InterfaceC9428pR;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]> implements InterfaceC9420pJ {
    protected static final Object[] b = new Object[0];
    private static final long serialVersionUID = 1;
    protected final Class<?> a;
    protected AbstractC9452pp<Object> d;
    protected final AbstractC9543ra e;
    protected final boolean f;

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        return b;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC9452pp<Object> h() {
        return this.d;
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return this.d == null && this.e == null;
    }

    public ObjectArrayDeserializer(JavaType javaType, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra) {
        super(javaType, (InterfaceC9428pR) null, (Boolean) null);
        Class<?> h = javaType.j().h();
        this.a = h;
        this.f = h == Object.class;
        this.d = abstractC9452pp;
        this.e = abstractC9543ra;
    }

    protected ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        super(objectArrayDeserializer, interfaceC9428pR, bool);
        this.a = objectArrayDeserializer.a;
        this.f = objectArrayDeserializer.f;
        this.d = abstractC9452pp;
        this.e = abstractC9543ra;
    }

    public ObjectArrayDeserializer c(AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        return (bool == this.h && interfaceC9428pR == this.g && abstractC9452pp == this.d && abstractC9543ra == this.e) ? this : new ObjectArrayDeserializer(this, abstractC9452pp, abstractC9543ra, interfaceC9428pR, bool);
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AbstractC9452pp<?> e;
        AbstractC9452pp<?> abstractC9452pp = this.d;
        Boolean d = d(deserializationContext, beanProperty, this.c.h(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        AbstractC9452pp<?> d2 = d(deserializationContext, beanProperty, abstractC9452pp);
        JavaType j = this.c.j();
        if (d2 == null) {
            e = deserializationContext.c(j, beanProperty);
        } else {
            e = deserializationContext.e(d2, beanProperty, j);
        }
        AbstractC9543ra abstractC9543ra = this.e;
        if (abstractC9543ra != null) {
            abstractC9543ra = abstractC9543ra.d(beanProperty);
        }
        return c(abstractC9543ra, e, b(deserializationContext, beanProperty, e), d);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, o.AbstractC9452pp
    public AccessPattern a() {
        return AccessPattern.CONSTANT;
    }

    @Override // o.AbstractC9452pp
    /* renamed from: a */
    public Object[] b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object[] a;
        Object a2;
        int i;
        if (!jsonParser.J()) {
            return d(jsonParser, deserializationContext);
        }
        C9589sa q = deserializationContext.q();
        Object[] a3 = q.a();
        AbstractC9543ra abstractC9543ra = this.e;
        int i2 = 0;
        while (true) {
            try {
                JsonToken Q = jsonParser.Q();
                if (Q == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (Q == JsonToken.VALUE_NULL) {
                        if (!this.i) {
                            a2 = this.g.c(deserializationContext);
                        }
                    } else if (abstractC9543ra == null) {
                        a2 = this.d.b(jsonParser, deserializationContext);
                    } else {
                        a2 = this.d.a(jsonParser, deserializationContext, abstractC9543ra);
                    }
                    a3[i2] = a2;
                    i2 = i;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    throw JsonMappingException.d(e, a3, q.e() + i2);
                }
                if (i2 >= a3.length) {
                    a3 = q.c(a3);
                    i2 = 0;
                }
                i = i2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this.f) {
            a = q.b(a3, i2);
        } else {
            a = q.a(a3, i2, this.a);
        }
        deserializationContext.b(q);
        return a;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    /* renamed from: b */
    public Object[] a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return (Object[]) abstractC9543ra.d(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9452pp
    public Object[] e(JsonParser jsonParser, DeserializationContext deserializationContext, Object[] objArr) {
        Object[] a;
        Object a2;
        int i;
        if (!jsonParser.J()) {
            Object[] d = d(jsonParser, deserializationContext);
            if (d == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[d.length + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(d, 0, objArr2, length, d.length);
            return objArr2;
        }
        C9589sa q = deserializationContext.q();
        int length2 = objArr.length;
        Object[] c = q.c(objArr, length2);
        AbstractC9543ra abstractC9543ra = this.e;
        while (true) {
            try {
                JsonToken Q = jsonParser.Q();
                if (Q == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (Q == JsonToken.VALUE_NULL) {
                        if (!this.i) {
                            a2 = this.g.c(deserializationContext);
                        }
                    } else if (abstractC9543ra == null) {
                        a2 = this.d.b(jsonParser, deserializationContext);
                    } else {
                        a2 = this.d.a(jsonParser, deserializationContext, abstractC9543ra);
                    }
                    c[length2] = a2;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                    throw JsonMappingException.d(e, c, q.e() + length2);
                }
                if (length2 >= c.length) {
                    c = q.c(c);
                    length2 = 0;
                }
                i = length2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this.f) {
            a = q.b(c, length2);
        } else {
            a = q.a(c, length2, this.a);
        }
        deserializationContext.b(q);
        return a;
    }

    protected Byte[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        byte[] e = jsonParser.e(deserializationContext.h());
        Byte[] bArr = new Byte[e.length];
        int length = e.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = Byte.valueOf(e[i]);
        }
        return bArr;
    }

    protected Object[] d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object a;
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonParser.a(jsonToken) && deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.A().length() == 0) {
            return null;
        }
        Boolean bool = this.h;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.d(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.a(jsonToken) && this.a == Byte.class) {
                return c(jsonParser, deserializationContext);
            }
            return (Object[]) deserializationContext.e(this.c.h(), jsonParser);
        }
        if (!jsonParser.a(JsonToken.VALUE_NULL)) {
            AbstractC9543ra abstractC9543ra = this.e;
            if (abstractC9543ra == null) {
                a = this.d.b(jsonParser, deserializationContext);
            } else {
                a = this.d.a(jsonParser, deserializationContext, abstractC9543ra);
            }
        } else if (this.i) {
            return b;
        } else {
            a = this.g.c(deserializationContext);
        }
        Object[] objArr = this.f ? new Object[1] : (Object[]) Array.newInstance(this.a, 1);
        objArr[0] = a;
        return objArr;
    }
}
