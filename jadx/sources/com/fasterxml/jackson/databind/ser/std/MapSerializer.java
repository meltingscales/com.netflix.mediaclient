package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9523rG;
import o.AbstractC9544rb;
import o.C9537rU;
import o.InterfaceC9458pv;
import o.InterfaceC9478qO;
import o.InterfaceC9479qP;
import o.InterfaceC9562rt;
import o.InterfaceC9567ry;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements InterfaceC9562rt {
    private static final long serialVersionUID = 1;
    protected AbstractC9523rG a;
    protected final Set<String> b;
    protected final Object e;
    protected final JavaType f;
    protected final boolean g;
    protected final BeanProperty h;
    protected final boolean i;
    protected AbstractC9453pq<Object> j;
    protected final JavaType k;
    protected final AbstractC9544rb l;
    protected AbstractC9453pq<Object> m;
    protected final Object n;

    /* renamed from: o  reason: collision with root package name */
    protected final boolean f13111o;
    protected static final JavaType d = TypeFactory.b();
    public static final Object c = JsonInclude.Include.NON_EMPTY;

    public JavaType a() {
        return this.k;
    }

    protected MapSerializer(Set<String> set, JavaType javaType, JavaType javaType2, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, AbstractC9453pq<?> abstractC9453pq2) {
        super(Map.class, false);
        this.b = (set == null || set.isEmpty()) ? null : set;
        this.f = javaType;
        this.k = javaType2;
        this.f13111o = z;
        this.l = abstractC9544rb;
        this.j = abstractC9453pq;
        this.m = abstractC9453pq2;
        this.a = AbstractC9523rG.c();
        this.h = null;
        this.e = null;
        this.i = false;
        this.n = null;
        this.g = false;
    }

    protected MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, AbstractC9453pq<?> abstractC9453pq, AbstractC9453pq<?> abstractC9453pq2, Set<String> set) {
        super(Map.class, false);
        this.b = (set == null || set.isEmpty()) ? null : null;
        this.f = mapSerializer.f;
        this.k = mapSerializer.k;
        this.f13111o = mapSerializer.f13111o;
        this.l = mapSerializer.l;
        this.j = abstractC9453pq;
        this.m = abstractC9453pq2;
        this.a = AbstractC9523rG.c();
        this.h = beanProperty;
        this.e = mapSerializer.e;
        this.i = mapSerializer.i;
        this.n = mapSerializer.n;
        this.g = mapSerializer.g;
    }

    protected MapSerializer(MapSerializer mapSerializer, AbstractC9544rb abstractC9544rb, Object obj, boolean z) {
        super(Map.class, false);
        this.b = mapSerializer.b;
        this.f = mapSerializer.f;
        this.k = mapSerializer.k;
        this.f13111o = mapSerializer.f13111o;
        this.l = abstractC9544rb;
        this.j = mapSerializer.j;
        this.m = mapSerializer.m;
        this.a = mapSerializer.a;
        this.h = mapSerializer.h;
        this.e = mapSerializer.e;
        this.i = mapSerializer.i;
        this.n = obj;
        this.g = z;
    }

    protected MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this.b = mapSerializer.b;
        this.f = mapSerializer.f;
        this.k = mapSerializer.k;
        this.f13111o = mapSerializer.f13111o;
        this.l = mapSerializer.l;
        this.j = mapSerializer.j;
        this.m = mapSerializer.m;
        this.a = AbstractC9523rG.c();
        this.h = mapSerializer.h;
        this.e = obj;
        this.i = z;
        this.n = mapSerializer.n;
        this.g = mapSerializer.g;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* renamed from: a */
    public MapSerializer b(AbstractC9544rb abstractC9544rb) {
        if (this.l == abstractC9544rb) {
            return this;
        }
        b("_withValueTypeSerializer");
        return new MapSerializer(this, abstractC9544rb, this.n, this.g);
    }

    public MapSerializer c(BeanProperty beanProperty, AbstractC9453pq<?> abstractC9453pq, AbstractC9453pq<?> abstractC9453pq2, Set<String> set, boolean z) {
        b("withResolved");
        MapSerializer mapSerializer = new MapSerializer(this, beanProperty, abstractC9453pq, abstractC9453pq2, set);
        return z != mapSerializer.i ? new MapSerializer(mapSerializer, this.e, z) : mapSerializer;
    }

    public MapSerializer b(Object obj) {
        if (this.e == obj) {
            return this;
        }
        b("withFilterId");
        return new MapSerializer(this, obj, this.i);
    }

    public MapSerializer d(Object obj, boolean z) {
        if (obj == this.n && z == this.g) {
            return this;
        }
        b("withContentInclusion");
        return new MapSerializer(this, this.l, obj, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.ser.std.MapSerializer d(java.util.Set<java.lang.String> r9, com.fasterxml.jackson.databind.JavaType r10, boolean r11, o.AbstractC9544rb r12, o.AbstractC9453pq<java.lang.Object> r13, o.AbstractC9453pq<java.lang.Object> r14, java.lang.Object r15) {
        /*
            if (r10 != 0) goto L7
            com.fasterxml.jackson.databind.JavaType r10 = com.fasterxml.jackson.databind.ser.std.MapSerializer.d
            r3 = r10
            r4 = r3
            goto L11
        L7:
            com.fasterxml.jackson.databind.JavaType r0 = r10.f()
            com.fasterxml.jackson.databind.JavaType r10 = r10.j()
            r4 = r10
            r3 = r0
        L11:
            r10 = 0
            if (r11 != 0) goto L20
            if (r4 == 0) goto L1e
            boolean r11 = r4.v()
            if (r11 == 0) goto L1e
            r11 = 1
            goto L2a
        L1e:
            r11 = r10
            goto L2a
        L20:
            java.lang.Class r0 = r4.h()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L2a
            r5 = r10
            goto L2b
        L2a:
            r5 = r11
        L2b:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r10 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r1 = r10
            r2 = r9
            r6 = r12
            r7 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            if (r15 == 0) goto L3b
            com.fasterxml.jackson.databind.ser.std.MapSerializer r10 = r10.b(r15)
        L3b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.d(java.util.Set, com.fasterxml.jackson.databind.JavaType, boolean, o.rb, o.pq, o.pq, java.lang.Object):com.fasterxml.jackson.databind.ser.std.MapSerializer");
    }

    protected void b(String str) {
        C9537rU.c(MapSerializer.class, this, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fa, code lost:
        if (r0 != 5) goto L68;
     */
    @Override // o.InterfaceC9562rt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.AbstractC9453pq<?> e(o.AbstractC9459pw r13, com.fasterxml.jackson.databind.BeanProperty r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.e(o.pw, com.fasterxml.jackson.databind.BeanProperty):o.pq");
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.std.MapSerializer$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            e = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // o.AbstractC9453pq
    /* renamed from: b */
    public boolean c(AbstractC9459pw abstractC9459pw, Map<?, ?> map) {
        AbstractC9453pq<Object> b;
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this.n;
        if (obj != null || this.g) {
            AbstractC9453pq<Object> abstractC9453pq = this.m;
            boolean z = c == obj;
            if (abstractC9453pq != null) {
                for (Object obj2 : map.values()) {
                    if (obj2 == null) {
                        if (!this.g) {
                            return false;
                        }
                    } else if (z) {
                        if (!abstractC9453pq.c(abstractC9459pw, obj2)) {
                            return false;
                        }
                    } else if (obj == null || !obj.equals(map)) {
                        return false;
                    }
                }
                return true;
            }
            for (Object obj3 : map.values()) {
                if (obj3 != null) {
                    try {
                        b = b(abstractC9459pw, obj3);
                    } catch (JsonMappingException unused) {
                    }
                    if (z) {
                        if (!b.c(abstractC9459pw, obj3)) {
                            return false;
                        }
                    } else {
                        if (obj != null && obj.equals(map)) {
                        }
                        return false;
                    }
                } else if (!this.g) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean d(Map<?, ?> map) {
        return map.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: d */
    public void e(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        InterfaceC9567ry c2;
        jsonGenerator.i(map);
        if (!map.isEmpty()) {
            if (this.i || abstractC9459pw.d(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = c(map, jsonGenerator, abstractC9459pw);
            }
            Map<?, ?> map2 = map;
            Object obj = this.e;
            if (obj == null || (c2 = c(abstractC9459pw, obj, map2)) == null) {
                Object obj2 = this.n;
                if (obj2 != null || this.g) {
                    a(map2, jsonGenerator, abstractC9459pw, obj2);
                } else {
                    AbstractC9453pq<Object> abstractC9453pq = this.m;
                    if (abstractC9453pq != null) {
                        c(map2, jsonGenerator, abstractC9459pw, abstractC9453pq);
                    } else {
                        b(map2, jsonGenerator, abstractC9459pw);
                    }
                }
            } else {
                c(map2, jsonGenerator, abstractC9459pw, c2, this.n);
            }
        }
        jsonGenerator.o();
    }

    @Override // o.AbstractC9453pq
    /* renamed from: e */
    public void c(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        InterfaceC9567ry c2;
        jsonGenerator.e(map);
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(map, JsonToken.START_OBJECT));
        if (!map.isEmpty()) {
            if (this.i || abstractC9459pw.d(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = c(map, jsonGenerator, abstractC9459pw);
            }
            Map<?, ?> map2 = map;
            Object obj = this.e;
            if (obj == null || (c2 = c(abstractC9459pw, obj, map2)) == null) {
                Object obj2 = this.n;
                if (obj2 != null || this.g) {
                    a(map2, jsonGenerator, abstractC9459pw, obj2);
                } else {
                    AbstractC9453pq<Object> abstractC9453pq = this.m;
                    if (abstractC9453pq != null) {
                        c(map2, jsonGenerator, abstractC9459pw, abstractC9453pq);
                    } else {
                        b(map2, jsonGenerator, abstractC9459pw);
                    }
                }
            } else {
                c(map2, jsonGenerator, abstractC9459pw, c2, this.n);
            }
        }
        abstractC9544rb.c(jsonGenerator, b);
    }

    public void b(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object obj = null;
        if (this.l != null) {
            c(map, jsonGenerator, abstractC9459pw, (Object) null);
            return;
        }
        AbstractC9453pq<Object> abstractC9453pq = this.j;
        Set<String> set = this.b;
        try {
            Object obj2 = null;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    obj2 = entry.getKey();
                    if (obj2 == null) {
                        abstractC9459pw.c(this.f, this.h).e(null, jsonGenerator, abstractC9459pw);
                    } else if (set == null || !set.contains(obj2)) {
                        abstractC9453pq.e(obj2, jsonGenerator, abstractC9459pw);
                    }
                    if (value == null) {
                        abstractC9459pw.a(jsonGenerator);
                    } else {
                        AbstractC9453pq<Object> abstractC9453pq2 = this.m;
                        if (abstractC9453pq2 == null) {
                            abstractC9453pq2 = b(abstractC9459pw, value);
                        }
                        abstractC9453pq2.e(value, jsonGenerator, abstractC9459pw);
                    }
                } catch (Exception e) {
                    e = e;
                    obj = obj2;
                    d(abstractC9459pw, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:12|(2:51|52)(1:(1:18)(2:49|31))|19|(3:43|44|(2:48|31)(2:46|47))(4:21|22|(1:24)|(3:39|40|(2:42|31))(2:26|(2:30|31)))|32|33|35|31|10) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
        d(r11, r3, r9, java.lang.String.valueOf(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.Map<?, ?> r9, com.fasterxml.jackson.core.JsonGenerator r10, o.AbstractC9459pw r11, java.lang.Object r12) {
        /*
            r8 = this;
            o.rb r0 = r8.l
            if (r0 == 0) goto L8
            r8.c(r9, r10, r11, r12)
            return
        L8:
            java.util.Set<java.lang.String> r0 = r8.b
            java.lang.Object r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.c
            if (r1 != r12) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            java.util.Set r2 = r9.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            if (r4 != 0) goto L34
            com.fasterxml.jackson.databind.JavaType r5 = r8.f
            com.fasterxml.jackson.databind.BeanProperty r6 = r8.h
            o.pq r5 = r11.c(r5, r6)
            goto L3f
        L34:
            if (r0 == 0) goto L3d
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L3d
            goto L19
        L3d:
            o.pq<java.lang.Object> r5 = r8.j
        L3f:
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto L4f
            boolean r6 = r8.g
            if (r6 == 0) goto L4a
            goto L19
        L4a:
            o.pq r6 = r11.i()
            goto L69
        L4f:
            o.pq<java.lang.Object> r6 = r8.m
            if (r6 != 0) goto L57
            o.pq r6 = r8.b(r11, r3)
        L57:
            if (r1 == 0) goto L60
            boolean r7 = r6.c(r11, r3)
            if (r7 == 0) goto L69
            goto L19
        L60:
            if (r12 == 0) goto L69
            boolean r7 = r12.equals(r3)
            if (r7 == 0) goto L69
            goto L19
        L69:
            r5.e(r4, r10, r11)     // Catch: java.lang.Exception -> L70
            r6.e(r3, r10, r11)     // Catch: java.lang.Exception -> L70
            goto L19
        L70:
            r3 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r8.d(r11, r3, r9, r4)
            goto L19
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.a(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, o.pw, java.lang.Object):void");
    }

    public void c(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9453pq<Object> abstractC9453pq) {
        AbstractC9453pq<Object> abstractC9453pq2 = this.j;
        Set<String> set = this.b;
        AbstractC9544rb abstractC9544rb = this.l;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    abstractC9459pw.c(this.f, this.h).e(null, jsonGenerator, abstractC9459pw);
                } else {
                    abstractC9453pq2.e(key, jsonGenerator, abstractC9459pw);
                }
                Object value = entry.getValue();
                if (value == null) {
                    abstractC9459pw.a(jsonGenerator);
                } else if (abstractC9544rb == null) {
                    try {
                        abstractC9453pq.e(value, jsonGenerator, abstractC9459pw);
                    } catch (Exception e) {
                        d(abstractC9459pw, e, map, String.valueOf(key));
                    }
                } else {
                    abstractC9453pq.c(value, jsonGenerator, abstractC9459pw, abstractC9544rb);
                }
            }
        }
    }

    public void c(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, InterfaceC9567ry interfaceC9567ry, Object obj) {
        AbstractC9453pq<Object> i;
        Set<String> set = this.b;
        MapProperty mapProperty = new MapProperty(this.l, this.h);
        boolean z = c == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                AbstractC9453pq<Object> c2 = key == null ? abstractC9459pw.c(this.f, this.h) : this.j;
                Object value = entry.getValue();
                if (value != null) {
                    i = this.m;
                    if (i == null) {
                        i = b(abstractC9459pw, value);
                    }
                    if (z) {
                        if (i.c(abstractC9459pw, value)) {
                        }
                    } else if (obj != null && obj.equals(value)) {
                    }
                } else if (!this.g) {
                    i = abstractC9459pw.i();
                }
                mapProperty.b(key, value, c2, i);
                try {
                    interfaceC9567ry.e(map, jsonGenerator, abstractC9459pw, mapProperty);
                } catch (Exception e) {
                    d(abstractC9459pw, e, map, String.valueOf(key));
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:7|(2:50|51)(1:(1:13)(2:48|31))|14|(3:42|43|(2:47|31)(2:45|46))(4:16|17|(1:19)|(3:37|38|(2:41|31)(1:40))(2:21|(2:35|31)))|26|27|28|30|31|5) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
        d(r11, r3, r9, java.lang.String.valueOf(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.util.Map<?, ?> r9, com.fasterxml.jackson.core.JsonGenerator r10, o.AbstractC9459pw r11, java.lang.Object r12) {
        /*
            r8 = this;
            java.util.Set<java.lang.String> r0 = r8.b
            java.lang.Object r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.c
            if (r1 != r12) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.util.Set r2 = r9.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            if (r4 != 0) goto L2c
            com.fasterxml.jackson.databind.JavaType r5 = r8.f
            com.fasterxml.jackson.databind.BeanProperty r6 = r8.h
            o.pq r5 = r11.c(r5, r6)
            goto L37
        L2c:
            if (r0 == 0) goto L35
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L35
            goto L11
        L35:
            o.pq<java.lang.Object> r5 = r8.j
        L37:
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto L47
            boolean r6 = r8.g
            if (r6 == 0) goto L42
            goto L11
        L42:
            o.pq r6 = r11.i()
            goto L61
        L47:
            o.pq<java.lang.Object> r6 = r8.m
            if (r6 != 0) goto L4f
            o.pq r6 = r8.b(r11, r3)
        L4f:
            if (r1 == 0) goto L58
            boolean r7 = r6.c(r11, r3)
            if (r7 == 0) goto L61
            goto L11
        L58:
            if (r12 == 0) goto L61
            boolean r7 = r12.equals(r3)
            if (r7 == 0) goto L61
            goto L11
        L61:
            r5.e(r4, r10, r11)
            o.rb r5 = r8.l     // Catch: java.lang.Exception -> L6a
            r6.c(r3, r10, r11, r5)     // Catch: java.lang.Exception -> L6a
            goto L11
        L6a:
            r3 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r8.d(r11, r3, r9, r4)
            goto L11
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.c(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, o.pw, java.lang.Object):void");
    }

    public void b(AbstractC9459pw abstractC9459pw, JsonGenerator jsonGenerator, Object obj, Map<?, ?> map, InterfaceC9567ry interfaceC9567ry, Object obj2) {
        AbstractC9453pq<Object> i;
        Set<String> set = this.b;
        MapProperty mapProperty = new MapProperty(this.l, this.h);
        boolean z = c == obj2;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                AbstractC9453pq<Object> c2 = key == null ? abstractC9459pw.c(this.f, this.h) : this.j;
                Object value = entry.getValue();
                if (value != null) {
                    i = this.m;
                    if (i == null) {
                        i = b(abstractC9459pw, value);
                    }
                    if (z) {
                        if (i.c(abstractC9459pw, value)) {
                        }
                    } else if (obj2 != null && obj2.equals(value)) {
                    }
                } else if (!this.g) {
                    i = abstractC9459pw.i();
                }
                mapProperty.b(key, value, c2, i);
                try {
                    interfaceC9567ry.e(obj, jsonGenerator, abstractC9459pw, mapProperty);
                } catch (Exception e) {
                    d(abstractC9459pw, e, map, String.valueOf(key));
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return d("object", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        InterfaceC9479qP d2 = interfaceC9478qO.d(javaType);
        if (d2 != null) {
            d2.a(this.j, this.f);
            AbstractC9453pq<Object> abstractC9453pq = this.m;
            if (abstractC9453pq == null) {
                abstractC9453pq = d(this.a, this.k, interfaceC9478qO.c());
            }
            d2.e(abstractC9453pq, this.k);
        }
    }

    protected final AbstractC9453pq<Object> a(AbstractC9523rG abstractC9523rG, Class<?> cls, AbstractC9459pw abstractC9459pw) {
        AbstractC9523rG.d a = abstractC9523rG.a(cls, abstractC9459pw, this.h);
        AbstractC9523rG abstractC9523rG2 = a.d;
        if (abstractC9523rG != abstractC9523rG2) {
            this.a = abstractC9523rG2;
        }
        return a.c;
    }

    protected final AbstractC9453pq<Object> d(AbstractC9523rG abstractC9523rG, JavaType javaType, AbstractC9459pw abstractC9459pw) {
        AbstractC9523rG.d e = abstractC9523rG.e(javaType, abstractC9459pw, this.h);
        AbstractC9523rG abstractC9523rG2 = e.d;
        if (abstractC9523rG != abstractC9523rG2) {
            this.a = abstractC9523rG2;
        }
        return e.c;
    }

    protected Map<?, ?> c(Map<?, ?> map, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (map instanceof SortedMap) {
            return map;
        }
        if (b(map)) {
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                Object key = entry.getKey();
                if (key == null) {
                    a(jsonGenerator, abstractC9459pw, entry.getValue());
                } else {
                    treeMap.put(key, entry.getValue());
                }
            }
            return treeMap;
        }
        return new TreeMap(map);
    }

    protected boolean b(Map<?, ?> map) {
        return (map instanceof HashMap) && map.containsKey(null);
    }

    protected void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, Object obj) {
        AbstractC9453pq<Object> abstractC9453pq;
        AbstractC9453pq<Object> c2 = abstractC9459pw.c(this.f, this.h);
        if (obj != null) {
            abstractC9453pq = this.m;
            if (abstractC9453pq == null) {
                abstractC9453pq = b(abstractC9459pw, obj);
            }
            Object obj2 = this.n;
            if (obj2 == c) {
                if (abstractC9453pq.c(abstractC9459pw, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (this.g) {
            return;
        } else {
            abstractC9453pq = abstractC9459pw.i();
        }
        try {
            c2.e(null, jsonGenerator, abstractC9459pw);
            abstractC9453pq.e(obj, jsonGenerator, abstractC9459pw);
        } catch (Exception e) {
            d(abstractC9459pw, e, obj, "");
        }
    }

    private final AbstractC9453pq<Object> b(AbstractC9459pw abstractC9459pw, Object obj) {
        Class<?> cls = obj.getClass();
        AbstractC9453pq<Object> c2 = this.a.c(cls);
        if (c2 != null) {
            return c2;
        }
        if (this.k.t()) {
            return d(this.a, abstractC9459pw.b(this.k, cls), abstractC9459pw);
        }
        return a(this.a, cls, abstractC9459pw);
    }
}
