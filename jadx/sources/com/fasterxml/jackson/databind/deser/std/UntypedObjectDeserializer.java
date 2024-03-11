package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9537rU;
import o.C9589sa;
import o.InterfaceC9420pJ;
import o.InterfaceC9429pS;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class UntypedObjectDeserializer extends StdDeserializer<Object> implements InterfaceC9429pS, InterfaceC9420pJ {
    protected static final Object[] d = new Object[0];
    private static final long serialVersionUID = 1;
    protected AbstractC9452pp<Object> a;
    protected AbstractC9452pp<Object> b;
    protected JavaType c;
    protected JavaType e;
    protected AbstractC9452pp<Object> f;
    protected final boolean g;
    protected AbstractC9452pp<Object> h;

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return null;
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return true;
    }

    @Deprecated
    public UntypedObjectDeserializer() {
        this((JavaType) null, (JavaType) null);
    }

    public UntypedObjectDeserializer(JavaType javaType, JavaType javaType2) {
        super(Object.class);
        this.c = javaType;
        this.e = javaType2;
        this.g = false;
    }

    protected UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super(Object.class);
        this.a = untypedObjectDeserializer.a;
        this.b = untypedObjectDeserializer.b;
        this.h = untypedObjectDeserializer.h;
        this.f = untypedObjectDeserializer.f;
        this.c = untypedObjectDeserializer.c;
        this.e = untypedObjectDeserializer.e;
        this.g = z;
    }

    @Override // o.InterfaceC9429pS
    public void b(DeserializationContext deserializationContext) {
        JavaType a = deserializationContext.a(Object.class);
        JavaType a2 = deserializationContext.a(String.class);
        TypeFactory e = deserializationContext.e();
        JavaType javaType = this.c;
        if (javaType == null) {
            this.b = d(c(deserializationContext, e.e(List.class, a)));
        } else {
            this.b = c(deserializationContext, javaType);
        }
        JavaType javaType2 = this.e;
        if (javaType2 == null) {
            this.a = d(c(deserializationContext, e.e(Map.class, a2, a)));
        } else {
            this.a = c(deserializationContext, javaType2);
        }
        this.h = d(c(deserializationContext, a2));
        this.f = d(c(deserializationContext, e.d(Number.class)));
        JavaType b = TypeFactory.b();
        this.a = deserializationContext.e(this.a, (BeanProperty) null, b);
        this.b = deserializationContext.e(this.b, (BeanProperty) null, b);
        this.h = deserializationContext.e(this.h, (BeanProperty) null, b);
        this.f = deserializationContext.e(this.f, (BeanProperty) null, b);
    }

    protected AbstractC9452pp<Object> c(DeserializationContext deserializationContext, JavaType javaType) {
        return deserializationContext.d(javaType);
    }

    protected AbstractC9452pp<Object> d(AbstractC9452pp<Object> abstractC9452pp) {
        if (C9537rU.b(abstractC9452pp)) {
            return null;
        }
        return abstractC9452pp;
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        boolean z = beanProperty == null && Boolean.FALSE.equals(deserializationContext.c().l(Object.class));
        if (this.h == null && this.f == null && this.a == null && this.b == null && getClass() == UntypedObjectDeserializer.class) {
            return Vanilla.d(z);
        }
        return z != this.g ? new UntypedObjectDeserializer(this, z) : this;
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        switch (jsonParser.t()) {
            case 1:
            case 2:
            case 5:
                AbstractC9452pp<Object> abstractC9452pp = this.a;
                if (abstractC9452pp != null) {
                    return abstractC9452pp.b(jsonParser, deserializationContext);
                }
                return a(jsonParser, deserializationContext);
            case 3:
                if (deserializationContext.d(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return c(jsonParser, deserializationContext);
                }
                AbstractC9452pp<Object> abstractC9452pp2 = this.b;
                if (abstractC9452pp2 != null) {
                    return abstractC9452pp2.b(jsonParser, deserializationContext);
                }
                return d(jsonParser, deserializationContext);
            case 4:
            default:
                return deserializationContext.e(Object.class, jsonParser);
            case 6:
                AbstractC9452pp<Object> abstractC9452pp3 = this.h;
                if (abstractC9452pp3 != null) {
                    return abstractC9452pp3.b(jsonParser, deserializationContext);
                }
                return jsonParser.A();
            case 7:
                AbstractC9452pp<Object> abstractC9452pp4 = this.f;
                if (abstractC9452pp4 != null) {
                    return abstractC9452pp4.b(jsonParser, deserializationContext);
                }
                if (deserializationContext.b(StdDeserializer.D)) {
                    return s(jsonParser, deserializationContext);
                }
                return jsonParser.y();
            case 8:
                AbstractC9452pp<Object> abstractC9452pp5 = this.f;
                if (abstractC9452pp5 != null) {
                    return abstractC9452pp5.b(jsonParser, deserializationContext);
                }
                if (deserializationContext.d(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.r();
                }
                return jsonParser.y();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.q();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        int t = jsonParser.t();
        if (t != 1 && t != 3) {
            switch (t) {
                case 5:
                    break;
                case 6:
                    AbstractC9452pp<Object> abstractC9452pp = this.h;
                    if (abstractC9452pp != null) {
                        return abstractC9452pp.b(jsonParser, deserializationContext);
                    }
                    return jsonParser.A();
                case 7:
                    AbstractC9452pp<Object> abstractC9452pp2 = this.f;
                    if (abstractC9452pp2 != null) {
                        return abstractC9452pp2.b(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.b(StdDeserializer.D)) {
                        return s(jsonParser, deserializationContext);
                    }
                    return jsonParser.y();
                case 8:
                    AbstractC9452pp<Object> abstractC9452pp3 = this.f;
                    if (abstractC9452pp3 != null) {
                        return abstractC9452pp3.b(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.d(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.r();
                    }
                    return jsonParser.y();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.q();
                default:
                    return deserializationContext.e(Object.class, jsonParser);
            }
        }
        return abstractC9543ra.b(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9452pp
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (this.g) {
            return b(jsonParser, deserializationContext);
        }
        switch (jsonParser.t()) {
            case 1:
            case 2:
            case 5:
                AbstractC9452pp<Object> abstractC9452pp = this.a;
                if (abstractC9452pp != null) {
                    return abstractC9452pp.e(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Map) {
                    return b(jsonParser, deserializationContext, (Map) obj);
                }
                return a(jsonParser, deserializationContext);
            case 3:
                AbstractC9452pp<Object> abstractC9452pp2 = this.b;
                if (abstractC9452pp2 != null) {
                    return abstractC9452pp2.e(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Collection) {
                    return a(jsonParser, deserializationContext, (Collection) obj);
                }
                if (deserializationContext.d(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return c(jsonParser, deserializationContext);
                }
                return d(jsonParser, deserializationContext);
            case 4:
            default:
                return b(jsonParser, deserializationContext);
            case 6:
                AbstractC9452pp<Object> abstractC9452pp3 = this.h;
                if (abstractC9452pp3 != null) {
                    return abstractC9452pp3.e(jsonParser, deserializationContext, obj);
                }
                return jsonParser.A();
            case 7:
                AbstractC9452pp<Object> abstractC9452pp4 = this.f;
                if (abstractC9452pp4 != null) {
                    return abstractC9452pp4.e(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.b(StdDeserializer.D)) {
                    return s(jsonParser, deserializationContext);
                }
                return jsonParser.y();
            case 8:
                AbstractC9452pp<Object> abstractC9452pp5 = this.f;
                if (abstractC9452pp5 != null) {
                    return abstractC9452pp5.e(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.d(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.r();
                }
                return jsonParser.y();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.q();
        }
    }

    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken Q = jsonParser.Q();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        int i = 2;
        if (Q == jsonToken) {
            return new ArrayList(2);
        }
        Object b = b(jsonParser, deserializationContext);
        if (jsonParser.Q() == jsonToken) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(b);
            return arrayList;
        }
        Object b2 = b(jsonParser, deserializationContext);
        if (jsonParser.Q() == jsonToken) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(b);
            arrayList2.add(b2);
            return arrayList2;
        }
        C9589sa q = deserializationContext.q();
        Object[] a = q.a();
        a[0] = b;
        a[1] = b2;
        int i2 = 2;
        while (true) {
            Object b3 = b(jsonParser, deserializationContext);
            i++;
            if (i2 >= a.length) {
                a = q.c(a);
                i2 = 0;
            }
            int i3 = i2 + 1;
            a[i2] = b3;
            if (jsonParser.Q() == JsonToken.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i);
                q.a(a, i3, arrayList3);
                return arrayList3;
            }
            i2 = i3;
        }
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) {
        while (jsonParser.Q() != JsonToken.END_ARRAY) {
            collection.add(b(jsonParser, deserializationContext));
        }
        return collection;
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str;
        JsonToken o2 = jsonParser.o();
        if (o2 == JsonToken.START_OBJECT) {
            str = jsonParser.R();
        } else if (o2 == JsonToken.FIELD_NAME) {
            str = jsonParser.l();
        } else if (o2 != JsonToken.END_OBJECT) {
            return deserializationContext.e(c(), jsonParser);
        } else {
            str = null;
        }
        if (str == null) {
            return new LinkedHashMap(2);
        }
        jsonParser.Q();
        Object b = b(jsonParser, deserializationContext);
        String R = jsonParser.R();
        if (R == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str, b);
            return linkedHashMap;
        }
        jsonParser.Q();
        Object b2 = b(jsonParser, deserializationContext);
        String R2 = jsonParser.R();
        if (R2 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str, b);
            linkedHashMap2.put(R, b2);
            return linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str, b);
        linkedHashMap3.put(R, b2);
        do {
            jsonParser.Q();
            linkedHashMap3.put(R2, b(jsonParser, deserializationContext));
            R2 = jsonParser.R();
        } while (R2 != null);
        return linkedHashMap3;
    }

    protected Object[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.Q() == JsonToken.END_ARRAY) {
            return d;
        }
        C9589sa q = deserializationContext.q();
        Object[] a = q.a();
        int i = 0;
        while (true) {
            Object b = b(jsonParser, deserializationContext);
            if (i >= a.length) {
                a = q.c(a);
                i = 0;
            }
            int i2 = i + 1;
            a[i] = b;
            if (jsonParser.Q() == JsonToken.END_ARRAY) {
                return q.b(a, i2);
            }
            i = i2;
        }
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        Object b;
        JsonToken o2 = jsonParser.o();
        if (o2 == JsonToken.START_OBJECT) {
            o2 = jsonParser.Q();
        }
        if (o2 == JsonToken.END_OBJECT) {
            return map;
        }
        String l = jsonParser.l();
        do {
            jsonParser.Q();
            Object obj = map.get(l);
            if (obj != null) {
                b = e(jsonParser, deserializationContext, obj);
            } else {
                b = b(jsonParser, deserializationContext);
            }
            if (b != obj) {
                map.put(l, b);
            }
            l = jsonParser.R();
        } while (l != null);
        return map;
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class Vanilla extends StdDeserializer<Object> {
        public static final Vanilla a = new Vanilla();
        private static final long serialVersionUID = 1;
        protected final boolean c;

        @Override // o.AbstractC9452pp
        public Boolean a(DeserializationConfig deserializationConfig) {
            if (this.c) {
                return Boolean.FALSE;
            }
            return null;
        }

        public Vanilla() {
            this(false);
        }

        protected Vanilla(boolean z) {
            super(Object.class);
            this.c = z;
        }

        public static Vanilla d(boolean z) {
            return z ? new Vanilla(true) : a;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // o.AbstractC9452pp
        public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            switch (jsonParser.t()) {
                case 1:
                    if (jsonParser.Q() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    if (jsonParser.Q() == JsonToken.END_ARRAY) {
                        if (deserializationContext.d(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            return UntypedObjectDeserializer.d;
                        }
                        return new ArrayList(2);
                    } else if (deserializationContext.d(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        return d(jsonParser, deserializationContext);
                    } else {
                        return c(jsonParser, deserializationContext);
                    }
                case 4:
                default:
                    return deserializationContext.e(Object.class, jsonParser);
                case 5:
                    break;
                case 6:
                    return jsonParser.A();
                case 7:
                    if (deserializationContext.b(StdDeserializer.D)) {
                        return s(jsonParser, deserializationContext);
                    }
                    return jsonParser.y();
                case 8:
                    if (deserializationContext.d(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.r();
                    }
                    return jsonParser.y();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.q();
            }
            return a(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
        public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
            int t = jsonParser.t();
            if (t != 1 && t != 3) {
                switch (t) {
                    case 5:
                        break;
                    case 6:
                        return jsonParser.A();
                    case 7:
                        if (deserializationContext.d(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                            return jsonParser.h();
                        }
                        return jsonParser.y();
                    case 8:
                        if (deserializationContext.d(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            return jsonParser.r();
                        }
                        return jsonParser.y();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return jsonParser.q();
                    default:
                        return deserializationContext.e(Object.class, jsonParser);
                }
            }
            return abstractC9543ra.b(jsonParser, deserializationContext);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x001a, code lost:
            if (r0 != 5) goto L29;
         */
        @Override // o.AbstractC9452pp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object e(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.Object r7) {
            /*
                r4 = this;
                boolean r0 = r4.c
                if (r0 == 0) goto L9
                java.lang.Object r5 = r4.b(r5, r6)
                return r5
            L9:
                int r0 = r5.t()
                r1 = 1
                if (r0 == r1) goto L3d
                r1 = 2
                if (r0 == r1) goto L3c
                r1 = 3
                if (r0 == r1) goto L1d
                r1 = 4
                if (r0 == r1) goto L3c
                r1 = 5
                if (r0 == r1) goto L46
                goto L6f
            L1d:
                com.fasterxml.jackson.core.JsonToken r0 = r5.Q()
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
                if (r0 != r1) goto L26
                return r7
            L26:
                boolean r0 = r7 instanceof java.util.Collection
                if (r0 == 0) goto L6f
                r0 = r7
                java.util.Collection r0 = (java.util.Collection) r0
            L2d:
                java.lang.Object r1 = r4.b(r5, r6)
                r0.add(r1)
                com.fasterxml.jackson.core.JsonToken r1 = r5.Q()
                com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
                if (r1 != r2) goto L2d
            L3c:
                return r7
            L3d:
                com.fasterxml.jackson.core.JsonToken r0 = r5.Q()
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
                if (r0 != r1) goto L46
                return r7
            L46:
                boolean r0 = r7 instanceof java.util.Map
                if (r0 == 0) goto L6f
                r0 = r7
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = r5.l()
            L51:
                r5.Q()
                java.lang.Object r2 = r0.get(r1)
                if (r2 == 0) goto L5f
                java.lang.Object r3 = r4.e(r5, r6, r2)
                goto L63
            L5f:
                java.lang.Object r3 = r4.b(r5, r6)
            L63:
                if (r3 == r2) goto L68
                r0.put(r1, r3)
            L68:
                java.lang.String r1 = r5.R()
                if (r1 != 0) goto L51
                return r7
            L6f:
                java.lang.Object r5 = r4.b(r5, r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
        }

        protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Object b = b(jsonParser, deserializationContext);
            JsonToken Q = jsonParser.Q();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            int i = 2;
            if (Q == jsonToken) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(b);
                return arrayList;
            }
            Object b2 = b(jsonParser, deserializationContext);
            if (jsonParser.Q() == jsonToken) {
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(b);
                arrayList2.add(b2);
                return arrayList2;
            }
            C9589sa q = deserializationContext.q();
            Object[] a2 = q.a();
            a2[0] = b;
            a2[1] = b2;
            int i2 = 2;
            while (true) {
                Object b3 = b(jsonParser, deserializationContext);
                i++;
                if (i2 >= a2.length) {
                    a2 = q.c(a2);
                    i2 = 0;
                }
                int i3 = i2 + 1;
                a2[i2] = b3;
                if (jsonParser.Q() == JsonToken.END_ARRAY) {
                    ArrayList arrayList3 = new ArrayList(i);
                    q.a(a2, i3, arrayList3);
                    return arrayList3;
                }
                i2 = i3;
            }
        }

        protected Object[] d(JsonParser jsonParser, DeserializationContext deserializationContext) {
            C9589sa q = deserializationContext.q();
            Object[] a2 = q.a();
            int i = 0;
            while (true) {
                Object b = b(jsonParser, deserializationContext);
                if (i >= a2.length) {
                    a2 = q.c(a2);
                    i = 0;
                }
                int i2 = i + 1;
                a2[i] = b;
                if (jsonParser.Q() == JsonToken.END_ARRAY) {
                    return q.b(a2, i2);
                }
                i = i2;
            }
        }

        protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
            String A = jsonParser.A();
            jsonParser.Q();
            Object b = b(jsonParser, deserializationContext);
            String R = jsonParser.R();
            if (R == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(A, b);
                return linkedHashMap;
            }
            jsonParser.Q();
            Object b2 = b(jsonParser, deserializationContext);
            String R2 = jsonParser.R();
            if (R2 == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
                linkedHashMap2.put(A, b);
                linkedHashMap2.put(R, b2);
                return linkedHashMap2;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put(A, b);
            linkedHashMap3.put(R, b2);
            do {
                jsonParser.Q();
                linkedHashMap3.put(R2, b(jsonParser, deserializationContext));
                R2 = jsonParser.R();
            } while (R2 != null);
            return linkedHashMap3;
        }
    }
}
