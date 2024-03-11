package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9589sa;
import o.InterfaceC9420pJ;
import o.InterfaceC9428pR;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements InterfaceC9420pJ {
    private static final long serialVersionUID = 2;
    protected final InterfaceC9428pR a;
    protected final boolean b;
    protected AbstractC9452pp<String> c;
    protected final Boolean d;
    private static final String[] i = new String[0];
    public static final StringArrayDeserializer e = new StringArrayDeserializer();

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        return i;
    }

    public StringArrayDeserializer() {
        this(null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected StringArrayDeserializer(AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        super(String[].class);
        this.c = abstractC9452pp;
        this.a = interfaceC9428pR;
        this.d = bool;
        this.b = NullsConstantProvider.c(interfaceC9428pR);
    }

    @Override // o.AbstractC9452pp
    public AccessPattern a() {
        return AccessPattern.CONSTANT;
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AbstractC9452pp<?> e2;
        AbstractC9452pp<?> d = d(deserializationContext, beanProperty, this.c);
        JavaType a = deserializationContext.a(String.class);
        if (d == null) {
            e2 = deserializationContext.c(a, beanProperty);
        } else {
            e2 = deserializationContext.e(d, beanProperty, a);
        }
        Boolean d2 = d(deserializationContext, beanProperty, String[].class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        InterfaceC9428pR b = b(deserializationContext, beanProperty, e2);
        if (e2 != null && a(e2)) {
            e2 = null;
        }
        return (this.c == e2 && this.d == d2 && this.a == b) ? this : new StringArrayDeserializer(e2, b, d2);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: c */
    public String[] b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int i2;
        if (!jsonParser.J()) {
            return d(jsonParser, deserializationContext);
        }
        if (this.c != null) {
            return e(jsonParser, deserializationContext, (String[]) null);
        }
        C9589sa q = deserializationContext.q();
        Object[] a = q.a();
        int i3 = 0;
        while (true) {
            try {
                String S = jsonParser.S();
                try {
                    if (S == null) {
                        JsonToken o2 = jsonParser.o();
                        if (o2 != JsonToken.END_ARRAY) {
                            if (o2 != JsonToken.VALUE_NULL) {
                                S = B(jsonParser, deserializationContext);
                            } else if (!this.b) {
                                S = (String) this.a.c(deserializationContext);
                            }
                        } else {
                            String[] strArr = (String[]) q.a(a, i3, String.class);
                            deserializationContext.b(q);
                            return strArr;
                        }
                    }
                    a[i3] = S;
                    i3 = i2;
                } catch (Exception e2) {
                    e = e2;
                    i3 = i2;
                    throw JsonMappingException.d(e, a, q.e() + i3);
                }
                if (i3 >= a.length) {
                    a = q.c(a);
                    i3 = 0;
                }
                i2 = i3 + 1;
            } catch (Exception e3) {
                e = e3;
            }
        }
    }

    protected final String[] e(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) {
        int length;
        Object[] c;
        String b;
        int i2;
        C9589sa q = deserializationContext.q();
        if (strArr == null) {
            c = q.a();
            length = 0;
        } else {
            length = strArr.length;
            c = q.c(strArr, length);
        }
        AbstractC9452pp<String> abstractC9452pp = this.c;
        while (true) {
            try {
                try {
                    if (jsonParser.S() == null) {
                        JsonToken o2 = jsonParser.o();
                        if (o2 != JsonToken.END_ARRAY) {
                            if (o2 != JsonToken.VALUE_NULL) {
                                b = abstractC9452pp.b(jsonParser, deserializationContext);
                            } else if (!this.b) {
                                b = (String) this.a.c(deserializationContext);
                            }
                        } else {
                            String[] strArr2 = (String[]) q.a(c, length, String.class);
                            deserializationContext.b(q);
                            return strArr2;
                        }
                    } else {
                        b = abstractC9452pp.b(jsonParser, deserializationContext);
                    }
                    c[length] = b;
                    length = i2;
                } catch (Exception e2) {
                    e = e2;
                    length = i2;
                    throw JsonMappingException.d(e, String.class, length);
                }
                if (length >= c.length) {
                    c = q.c(c);
                    length = 0;
                }
                i2 = length + 1;
            } catch (Exception e3) {
                e = e3;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.d(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: d */
    public String[] e(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) {
        if (!jsonParser.J()) {
            String[] d = d(jsonParser, deserializationContext);
            if (d == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[d.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(d, 0, strArr2, length, d.length);
            return strArr2;
        } else if (this.c != null) {
            return e(jsonParser, deserializationContext, strArr);
        } else {
            C9589sa q = deserializationContext.q();
            int length2 = strArr.length;
            Object[] c = q.c(strArr, length2);
            while (true) {
                try {
                    String S = jsonParser.S();
                    if (S == null) {
                        JsonToken o2 = jsonParser.o();
                        if (o2 != JsonToken.END_ARRAY) {
                            if (o2 != JsonToken.VALUE_NULL) {
                                S = B(jsonParser, deserializationContext);
                            } else if (this.b) {
                                return i;
                            } else {
                                S = (String) this.a.c(deserializationContext);
                            }
                        } else {
                            String[] strArr3 = (String[]) q.a(c, length2, String.class);
                            deserializationContext.b(q);
                            return strArr3;
                        }
                    }
                    if (length2 >= c.length) {
                        c = q.c(c);
                        length2 = 0;
                    }
                    int i2 = length2 + 1;
                    try {
                        c[length2] = S;
                        length2 = i2;
                    } catch (Exception e2) {
                        e = e2;
                        length2 = i2;
                        throw JsonMappingException.d(e, c, q.e() + length2);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
        }
    }

    private final String[] d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String B;
        Boolean bool = this.d;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.d(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.a(JsonToken.VALUE_NULL)) {
                B = (String) this.a.c(deserializationContext);
            } else {
                B = B(jsonParser, deserializationContext);
            }
            return new String[]{B};
        } else if (jsonParser.a(JsonToken.VALUE_STRING) && deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.A().length() == 0) {
            return null;
        } else {
            return (String[]) deserializationContext.e(this.B, jsonParser);
        }
    }
}
