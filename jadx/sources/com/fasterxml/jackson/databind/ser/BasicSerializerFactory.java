package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC9445pi;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9465qB;
import o.AbstractC9509qt;
import o.AbstractC9521rE;
import o.AbstractC9544rb;
import o.AbstractC9564rv;
import o.C9468qE;
import o.C9508qs;
import o.C9530rN;
import o.C9531rO;
import o.C9537rU;
import o.C9542rZ;
import o.InterfaceC9451po;
import o.InterfaceC9489qZ;
import o.InterfaceC9522rF;
import o.InterfaceC9535rS;

/* loaded from: classes5.dex */
public abstract class BasicSerializerFactory extends AbstractC9521rE implements Serializable {
    protected static final HashMap<String, AbstractC9453pq<?>> a;
    protected static final HashMap<String, Class<? extends AbstractC9453pq<?>>> d;
    protected final SerializerFactoryConfig b;

    protected abstract Iterable<InterfaceC9522rF> c();

    static {
        HashMap<String, Class<? extends AbstractC9453pq<?>>> hashMap = new HashMap<>();
        HashMap<String, AbstractC9453pq<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.b;
        hashMap2.put(StringBuffer.class.getName(), toStringSerializer);
        hashMap2.put(StringBuilder.class.getName(), toStringSerializer);
        hashMap2.put(Character.class.getName(), toStringSerializer);
        hashMap2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.d(hashMap2);
        hashMap2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap2.put(Boolean.class.getName(), new BooleanSerializer(false));
        hashMap2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), CalendarSerializer.b);
        hashMap2.put(Date.class.getName(), DateSerializer.b);
        for (Map.Entry<Class<?>, Object> entry : StdJdkSerializers.c()) {
            Object value = entry.getValue();
            if (value instanceof AbstractC9453pq) {
                hashMap2.put(entry.getKey().getName(), (AbstractC9453pq) value);
            } else {
                hashMap.put(entry.getKey().getName(), (Class) value);
            }
        }
        hashMap.put(C9542rZ.class.getName(), TokenBufferSerializer.class);
        a = hashMap2;
        d = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this.b = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    @Override // o.AbstractC9521rE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.AbstractC9453pq<java.lang.Object> a(com.fasterxml.jackson.databind.SerializationConfig r5, com.fasterxml.jackson.databind.JavaType r6, o.AbstractC9453pq<java.lang.Object> r7) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.h()
            o.pi r0 = r5.j(r0)
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4.b
            boolean r1 = r1.d()
            r2 = 0
            if (r1 == 0) goto L2d
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4.b
            java.lang.Iterable r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            o.rF r2 = (o.InterfaceC9522rF) r2
            o.pq r2 = r2.b(r5, r6, r0)
            if (r2 == 0) goto L1b
        L2d:
            if (r2 != 0) goto L71
            if (r7 != 0) goto L72
            java.lang.Class r7 = r6.h()
            r1 = 0
            o.pq r7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.b(r5, r7, r1)
            if (r7 != 0) goto L72
            o.pi r0 = r5.b(r6)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r7 = r0.j()
            if (r7 == 0) goto L68
            java.lang.Class r1 = r7.e()
            r2 = 1
            o.pq r1 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.b(r5, r1, r2)
            boolean r2 = r5.f()
            if (r2 == 0) goto L62
            java.lang.reflect.Member r2 = r7.h()
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r3 = r5.a(r3)
            o.C9537rU.b(r2, r3)
        L62:
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r2 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r2.<init>(r7, r1)
            goto L71
        L68:
            java.lang.Class r7 = r6.h()
            o.pq r7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.d(r5, r7)
            goto L72
        L71:
            r7 = r2
        L72:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L95
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4.b
            java.lang.Iterable r1 = r1.c()
            java.util.Iterator r1 = r1.iterator()
        L84:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r1.next()
            o.rv r2 = (o.AbstractC9564rv) r2
            o.pq r7 = r2.c(r5, r6, r0, r7)
            goto L84
        L95:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.a(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, o.pq):o.pq");
    }

    @Override // o.AbstractC9521rE
    public AbstractC9544rb b(SerializationConfig serializationConfig, JavaType javaType) {
        Collection<NamedType> d2;
        C9508qs k = serializationConfig.j(javaType.h()).k();
        InterfaceC9489qZ<?> d3 = serializationConfig.h().d(serializationConfig, k, javaType);
        if (d3 == null) {
            d3 = serializationConfig.d(javaType);
            d2 = null;
        } else {
            d2 = serializationConfig.z().d(serializationConfig, k);
        }
        if (d3 == null) {
            return null;
        }
        return d3.d(serializationConfig, javaType, d2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC9453pq<?> a(JavaType javaType, SerializationConfig serializationConfig, AbstractC9445pi abstractC9445pi, boolean z) {
        Class<? extends AbstractC9453pq<?>> cls;
        String name = javaType.h().getName();
        AbstractC9453pq<?> abstractC9453pq = a.get(name);
        return (abstractC9453pq != null || (cls = d.get(name)) == null) ? abstractC9453pq : (AbstractC9453pq) C9537rU.b((Class<Object>) cls, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC9453pq<?> b(AbstractC9459pw abstractC9459pw, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        if (InterfaceC9451po.class.isAssignableFrom(javaType.h())) {
            return SerializableSerializer.b;
        }
        AnnotatedMember j = abstractC9445pi.j();
        if (j != null) {
            if (abstractC9459pw.b()) {
                C9537rU.b(j.h(), abstractC9459pw.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new JsonValueSerializer(j, e(abstractC9459pw, j));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC9453pq<?> a(AbstractC9459pw abstractC9459pw, JavaType javaType, AbstractC9445pi abstractC9445pi, boolean z) {
        Class<?> h = javaType.h();
        AbstractC9453pq<?> b = b(abstractC9459pw, javaType, abstractC9445pi, z);
        if (b != null) {
            return b;
        }
        if (Calendar.class.isAssignableFrom(h)) {
            return CalendarSerializer.b;
        }
        if (Date.class.isAssignableFrom(h)) {
            return DateSerializer.b;
        }
        if (Map.Entry.class.isAssignableFrom(h)) {
            JavaType c = javaType.c(Map.Entry.class);
            return a(abstractC9459pw, javaType, abstractC9445pi, z, c.a(0), c.a(1));
        } else if (ByteBuffer.class.isAssignableFrom(h)) {
            return new ByteBufferSerializer();
        } else {
            if (InetAddress.class.isAssignableFrom(h)) {
                return new InetAddressSerializer();
            }
            if (InetSocketAddress.class.isAssignableFrom(h)) {
                return new InetSocketAddressSerializer();
            }
            if (TimeZone.class.isAssignableFrom(h)) {
                return new TimeZoneSerializer();
            }
            if (Charset.class.isAssignableFrom(h)) {
                return ToStringSerializer.b;
            }
            if (Number.class.isAssignableFrom(h)) {
                JsonFormat.Value e = abstractC9445pi.e(null);
                if (e != null) {
                    int i = AnonymousClass1.c[e.a().ordinal()];
                    if (i == 1) {
                        return ToStringSerializer.b;
                    }
                    if (i == 2 || i == 3) {
                        return null;
                    }
                }
                return NumberSerializer.a;
            } else if (!C9537rU.t(h) || h == Enum.class) {
                return null;
            } else {
                return e(abstractC9459pw.c(), javaType, abstractC9445pi);
            }
        }
    }

    protected AbstractC9453pq<?> b(AbstractC9459pw abstractC9459pw, JavaType javaType, AbstractC9445pi abstractC9445pi, boolean z) {
        return OptionalHandlerFactory.c.b(abstractC9459pw.c(), javaType, abstractC9445pi);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC9453pq<?> a(SerializationConfig serializationConfig, JavaType javaType, AbstractC9445pi abstractC9445pi, boolean z) {
        Class<?> h = javaType.h();
        if (Iterator.class.isAssignableFrom(h)) {
            JavaType[] b = serializationConfig.t().b(javaType, Iterator.class);
            return d(serializationConfig, javaType, abstractC9445pi, z, (b == null || b.length != 1) ? TypeFactory.b() : b[0]);
        } else if (Iterable.class.isAssignableFrom(h)) {
            JavaType[] b2 = serializationConfig.t().b(javaType, Iterable.class);
            return a(serializationConfig, javaType, abstractC9445pi, z, (b2 == null || b2.length != 1) ? TypeFactory.b() : b2[0]);
        } else if (CharSequence.class.isAssignableFrom(h)) {
            return ToStringSerializer.b;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9453pq<Object> e(AbstractC9459pw abstractC9459pw, AbstractC9509qt abstractC9509qt) {
        Object x = abstractC9459pw.g().x(abstractC9509qt);
        if (x == null) {
            return null;
        }
        return b(abstractC9459pw, abstractC9509qt, abstractC9459pw.a(abstractC9509qt, x));
    }

    protected AbstractC9453pq<?> b(AbstractC9459pw abstractC9459pw, AbstractC9509qt abstractC9509qt, AbstractC9453pq<?> abstractC9453pq) {
        InterfaceC9535rS<Object, Object> b = b(abstractC9459pw, abstractC9509qt);
        return b == null ? abstractC9453pq : new StdDelegatingSerializer(b, b.a(abstractC9459pw.e()), abstractC9453pq);
    }

    protected InterfaceC9535rS<Object, Object> b(AbstractC9459pw abstractC9459pw, AbstractC9509qt abstractC9509qt) {
        Object y = abstractC9459pw.g().y(abstractC9509qt);
        if (y == null) {
            return null;
        }
        return abstractC9459pw.b(abstractC9509qt, y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, JavaType javaType, AbstractC9445pi abstractC9445pi, boolean z) {
        AbstractC9445pi abstractC9445pi2;
        AbstractC9445pi abstractC9445pi3 = abstractC9445pi;
        SerializationConfig c = abstractC9459pw.c();
        boolean z2 = (z || !javaType.z() || (javaType.x() && javaType.j().D())) ? z : true;
        AbstractC9544rb b = b(c, javaType.j());
        if (b != null) {
            z2 = false;
        }
        boolean z3 = z2;
        AbstractC9453pq<Object> c2 = c(abstractC9459pw, abstractC9445pi.k());
        AbstractC9453pq<?> abstractC9453pq = null;
        if (javaType.B()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            AbstractC9453pq<Object> a2 = a(abstractC9459pw, abstractC9445pi.k());
            if (mapLikeType.F()) {
                return e(abstractC9459pw, (MapType) mapLikeType, abstractC9445pi, z3, a2, b, c2);
            }
            Iterator<InterfaceC9522rF> it = c().iterator();
            while (it.hasNext() && (abstractC9453pq = it.next().a(c, mapLikeType, abstractC9445pi, a2, b, c2)) == null) {
            }
            if (abstractC9453pq == null) {
                abstractC9453pq = b(abstractC9459pw, javaType, abstractC9445pi);
            }
            if (abstractC9453pq != null && this.b.a()) {
                for (AbstractC9564rv abstractC9564rv : this.b.c()) {
                    abstractC9453pq = abstractC9564rv.b(c, mapLikeType, abstractC9445pi3, abstractC9453pq);
                }
            }
            return abstractC9453pq;
        } else if (javaType.r()) {
            CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
            if (collectionLikeType.F()) {
                return c(abstractC9459pw, (CollectionType) collectionLikeType, abstractC9445pi, z3, b, c2);
            }
            Iterator<InterfaceC9522rF> it2 = c().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    abstractC9445pi2 = abstractC9445pi3;
                    break;
                }
                abstractC9445pi2 = abstractC9445pi3;
                abstractC9453pq = it2.next().b(c, collectionLikeType, abstractC9445pi, b, c2);
                if (abstractC9453pq != null) {
                    break;
                }
                abstractC9445pi3 = abstractC9445pi2;
            }
            if (abstractC9453pq == null) {
                abstractC9453pq = b(abstractC9459pw, javaType, abstractC9445pi);
            }
            if (abstractC9453pq != null && this.b.a()) {
                for (AbstractC9564rv abstractC9564rv2 : this.b.c()) {
                    abstractC9453pq = abstractC9564rv2.b(c, collectionLikeType, abstractC9445pi2, abstractC9453pq);
                }
            }
            return abstractC9453pq;
        } else if (javaType.p()) {
            return c(abstractC9459pw, (ArrayType) javaType, abstractC9445pi, z3, b, c2);
        } else {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected o.AbstractC9453pq<?> c(o.AbstractC9459pw r10, com.fasterxml.jackson.databind.type.CollectionType r11, o.AbstractC9445pi r12, boolean r13, o.AbstractC9544rb r14, o.AbstractC9453pq<java.lang.Object> r15) {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.SerializationConfig r6 = r10.c()
            java.lang.Iterable r0 = r9.c()
            java.util.Iterator r7 = r0.iterator()
            r8 = 0
            r0 = r8
        Le:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r0 = r7.next()
            o.rF r0 = (o.InterfaceC9522rF) r0
            r1 = r6
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r15
            o.pq r0 = r0.e(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Le
        L25:
            if (r0 != 0) goto L94
            o.pq r0 = r9.b(r10, r11, r12)
            if (r0 != 0) goto L94
            com.fasterxml.jackson.annotation.JsonFormat$Value r10 = r12.e(r8)
            if (r10 == 0) goto L3c
            com.fasterxml.jackson.annotation.JsonFormat$Shape r10 = r10.a()
            com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r10 != r1) goto L3c
            return r8
        L3c:
            java.lang.Class r10 = r11.h()
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r10)
            if (r1 == 0) goto L59
            com.fasterxml.jackson.databind.JavaType r10 = r11.j()
            boolean r13 = r10.u()
            if (r13 != 0) goto L53
            goto L54
        L53:
            r8 = r10
        L54:
            o.pq r0 = r9.e(r8)
            goto L94
        L59:
            com.fasterxml.jackson.databind.JavaType r1 = r11.j()
            java.lang.Class r1 = r1.h()
            boolean r10 = r9.a(r10)
            if (r10 == 0) goto L7d
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            if (r1 != r10) goto L74
            boolean r10 = o.C9537rU.b(r15)
            if (r10 == 0) goto L8a
            com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer r10 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.d
            goto L89
        L74:
            com.fasterxml.jackson.databind.JavaType r10 = r11.j()
            com.fasterxml.jackson.databind.ser.ContainerSerializer r10 = r9.b(r10, r13, r14, r15)
            goto L89
        L7d:
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            if (r1 != r10) goto L8a
            boolean r10 = o.C9537rU.b(r15)
            if (r10 == 0) goto L8a
            com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer r10 = com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer.d
        L89:
            r0 = r10
        L8a:
            if (r0 != 0) goto L94
            com.fasterxml.jackson.databind.JavaType r10 = r11.j()
            com.fasterxml.jackson.databind.ser.ContainerSerializer r0 = r9.e(r10, r13, r14, r15)
        L94:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r10 = r9.b
            boolean r10 = r10.a()
            if (r10 == 0) goto Lb7
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r10 = r9.b
            java.lang.Iterable r10 = r10.c()
            java.util.Iterator r10 = r10.iterator()
        La6:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto Lb7
            java.lang.Object r13 = r10.next()
            o.rv r13 = (o.AbstractC9564rv) r13
            o.pq r0 = r13.b(r6, r11, r12, r0)
            goto La6
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.c(o.pw, com.fasterxml.jackson.databind.type.CollectionType, o.pi, boolean, o.rb, o.pq):o.pq");
    }

    protected boolean a(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public ContainerSerializer<?> b(JavaType javaType, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq) {
        return new IndexedListSerializer(javaType, z, abstractC9544rb, abstractC9453pq);
    }

    public ContainerSerializer<?> e(JavaType javaType, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq) {
        return new CollectionSerializer(javaType, z, abstractC9544rb, abstractC9453pq);
    }

    public AbstractC9453pq<?> e(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    protected AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, MapType mapType, AbstractC9445pi abstractC9445pi, boolean z, AbstractC9453pq<Object> abstractC9453pq, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq2) {
        JsonFormat.Value e = abstractC9445pi.e(null);
        if (e == null || e.a() != JsonFormat.Shape.OBJECT) {
            SerializationConfig c = abstractC9459pw.c();
            Iterator<InterfaceC9522rF> it = c().iterator();
            AbstractC9453pq<?> abstractC9453pq3 = null;
            while (it.hasNext() && (abstractC9453pq3 = it.next().b(c, mapType, abstractC9445pi, abstractC9453pq, abstractC9544rb, abstractC9453pq2)) == null) {
            }
            if (abstractC9453pq3 == null && (abstractC9453pq3 = b(abstractC9459pw, mapType, abstractC9445pi)) == null) {
                Object e2 = e(c, abstractC9445pi);
                JsonIgnoreProperties.Value a2 = c.a(Map.class, abstractC9445pi.k());
                abstractC9453pq3 = e(abstractC9459pw, abstractC9445pi, MapSerializer.d(a2 != null ? a2.b() : null, mapType, z, abstractC9544rb, abstractC9453pq, abstractC9453pq2, e2));
            }
            if (this.b.a()) {
                for (AbstractC9564rv abstractC9564rv : this.b.c()) {
                    abstractC9453pq3 = abstractC9564rv.c(c, mapType, abstractC9445pi, abstractC9453pq3);
                }
            }
            return abstractC9453pq3;
        }
        return null;
    }

    protected MapSerializer e(AbstractC9459pw abstractC9459pw, AbstractC9445pi abstractC9445pi, MapSerializer mapSerializer) {
        JavaType a2 = mapSerializer.a();
        JsonInclude.Value e = e(abstractC9459pw, abstractC9445pi, a2, Map.class);
        JsonInclude.Include c = e == null ? JsonInclude.Include.USE_DEFAULTS : e.c();
        boolean z = true;
        Object obj = null;
        if (c == JsonInclude.Include.USE_DEFAULTS || c == JsonInclude.Include.ALWAYS) {
            return !abstractC9459pw.d(SerializationFeature.WRITE_NULL_MAP_VALUES) ? mapSerializer.d((Object) null, true) : mapSerializer;
        }
        int i = AnonymousClass1.d[c.ordinal()];
        if (i == 1) {
            obj = C9531rO.a(a2);
            if (obj != null && obj.getClass().isArray()) {
                obj = C9530rN.e(obj);
            }
        } else if (i != 2) {
            if (i == 3) {
                obj = MapSerializer.c;
            } else if (i == 4 && (obj = abstractC9459pw.e((AbstractC9465qB) null, e.e())) != null) {
                z = abstractC9459pw.a(obj);
            }
        } else if (a2.d()) {
            obj = MapSerializer.c;
        }
        return mapSerializer.d(obj, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            d = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[JsonInclude.Include.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonFormat.Shape.values().length];
            c = iArr2;
            try {
                iArr2[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[JsonFormat.Shape.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[JsonFormat.Shape.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    protected AbstractC9453pq<?> a(AbstractC9459pw abstractC9459pw, JavaType javaType, AbstractC9445pi abstractC9445pi, boolean z, JavaType javaType2, JavaType javaType3) {
        Object obj = null;
        if (JsonFormat.Value.c(abstractC9445pi.e(null), abstractC9459pw.b(Map.Entry.class)).a() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(javaType3, javaType2, javaType3, z, b(abstractC9459pw.c(), javaType3), null);
        JavaType a2 = mapEntrySerializer.a();
        JsonInclude.Value e = e(abstractC9459pw, abstractC9445pi, a2, Map.Entry.class);
        JsonInclude.Include c = e == null ? JsonInclude.Include.USE_DEFAULTS : e.c();
        if (c == JsonInclude.Include.USE_DEFAULTS || c == JsonInclude.Include.ALWAYS) {
            return mapEntrySerializer;
        }
        int i = AnonymousClass1.d[c.ordinal()];
        boolean z2 = true;
        if (i == 1) {
            obj = C9531rO.a(a2);
            if (obj != null && obj.getClass().isArray()) {
                obj = C9530rN.e(obj);
            }
        } else if (i != 2) {
            if (i == 3) {
                obj = MapSerializer.c;
            } else if (i == 4 && (obj = abstractC9459pw.e((AbstractC9465qB) null, e.e())) != null) {
                z2 = abstractC9459pw.a(obj);
            }
        } else if (a2.d()) {
            obj = MapSerializer.c;
        }
        return mapEntrySerializer.c(obj, z2);
    }

    protected JsonInclude.Value e(AbstractC9459pw abstractC9459pw, AbstractC9445pi abstractC9445pi, JavaType javaType, Class<?> cls) {
        SerializationConfig c = abstractC9459pw.c();
        JsonInclude.Value a2 = c.a(cls, abstractC9445pi.b(c.u()));
        JsonInclude.Value a3 = c.a(javaType.h(), (JsonInclude.Value) null);
        if (a3 != null) {
            int i = AnonymousClass1.d[a3.d().ordinal()];
            if (i != 4) {
                return i != 6 ? a2.b(a3.d()) : a2;
            }
            return a2.a(a3.e());
        }
        return a2;
    }

    protected AbstractC9453pq<?> c(AbstractC9459pw abstractC9459pw, ArrayType arrayType, AbstractC9445pi abstractC9445pi, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq) {
        SerializationConfig c = abstractC9459pw.c();
        Iterator<InterfaceC9522rF> it = c().iterator();
        AbstractC9453pq<?> abstractC9453pq2 = null;
        while (it.hasNext() && (abstractC9453pq2 = it.next().c(c, arrayType, abstractC9445pi, abstractC9544rb, abstractC9453pq)) == null) {
        }
        if (abstractC9453pq2 == null) {
            Class<?> h = arrayType.h();
            if (abstractC9453pq == null || C9537rU.b(abstractC9453pq)) {
                if (String[].class == h) {
                    abstractC9453pq2 = StringArraySerializer.e;
                } else {
                    abstractC9453pq2 = StdArraySerializers.d(h);
                }
            }
            if (abstractC9453pq2 == null) {
                abstractC9453pq2 = new ObjectArraySerializer(arrayType.j(), z, abstractC9544rb, abstractC9453pq);
            }
        }
        if (this.b.a()) {
            for (AbstractC9564rv abstractC9564rv : this.b.c()) {
                abstractC9453pq2 = abstractC9564rv.d(c, arrayType, abstractC9445pi, abstractC9453pq2);
            }
        }
        return abstractC9453pq2;
    }

    public AbstractC9453pq<?> a(AbstractC9459pw abstractC9459pw, ReferenceType referenceType, AbstractC9445pi abstractC9445pi, boolean z) {
        JavaType j = referenceType.j();
        AbstractC9544rb abstractC9544rb = (AbstractC9544rb) j.m();
        SerializationConfig c = abstractC9459pw.c();
        if (abstractC9544rb == null) {
            abstractC9544rb = b(c, j);
        }
        AbstractC9544rb abstractC9544rb2 = abstractC9544rb;
        AbstractC9453pq<Object> abstractC9453pq = (AbstractC9453pq) j.l();
        for (InterfaceC9522rF interfaceC9522rF : c()) {
            AbstractC9453pq<?> d2 = interfaceC9522rF.d(c, referenceType, abstractC9445pi, abstractC9544rb2, abstractC9453pq);
            if (d2 != null) {
                return d2;
            }
        }
        if (referenceType.e(AtomicReference.class)) {
            return e(abstractC9459pw, referenceType, abstractC9445pi, z, abstractC9544rb2, abstractC9453pq);
        }
        return null;
    }

    protected AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, ReferenceType referenceType, AbstractC9445pi abstractC9445pi, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq) {
        boolean z2;
        JavaType c = referenceType.c();
        JsonInclude.Value e = e(abstractC9459pw, abstractC9445pi, c, AtomicReference.class);
        JsonInclude.Include c2 = e == null ? JsonInclude.Include.USE_DEFAULTS : e.c();
        Object obj = null;
        if (c2 == JsonInclude.Include.USE_DEFAULTS || c2 == JsonInclude.Include.ALWAYS) {
            z2 = false;
        } else {
            int i = AnonymousClass1.d[c2.ordinal()];
            z2 = true;
            if (i == 1) {
                obj = C9531rO.a(c);
                if (obj != null && obj.getClass().isArray()) {
                    obj = C9530rN.e(obj);
                }
            } else if (i != 2) {
                if (i == 3) {
                    obj = MapSerializer.c;
                } else if (i == 4 && (obj = abstractC9459pw.e((AbstractC9465qB) null, e.e())) != null) {
                    z2 = abstractC9459pw.a(obj);
                }
            } else if (c.d()) {
                obj = MapSerializer.c;
            }
        }
        return new AtomicReferenceSerializer(referenceType, z, abstractC9544rb, abstractC9453pq).a(obj, z2);
    }

    protected AbstractC9453pq<?> d(SerializationConfig serializationConfig, JavaType javaType, AbstractC9445pi abstractC9445pi, boolean z, JavaType javaType2) {
        return new IteratorSerializer(javaType2, z, b(serializationConfig, javaType2));
    }

    protected AbstractC9453pq<?> a(SerializationConfig serializationConfig, JavaType javaType, AbstractC9445pi abstractC9445pi, boolean z, JavaType javaType2) {
        return new IterableSerializer(javaType2, z, b(serializationConfig, javaType2));
    }

    protected AbstractC9453pq<?> e(SerializationConfig serializationConfig, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        JsonFormat.Value e = abstractC9445pi.e(null);
        if (e != null && e.a() == JsonFormat.Shape.OBJECT) {
            ((C9468qE) abstractC9445pi).b("declaringClass");
            return null;
        }
        AbstractC9453pq<?> a2 = EnumSerializer.a(javaType.h(), serializationConfig, abstractC9445pi, e);
        if (this.b.a()) {
            for (AbstractC9564rv abstractC9564rv : this.b.c()) {
                a2 = abstractC9564rv.d(serializationConfig, javaType, abstractC9445pi, a2);
            }
        }
        return a2;
    }

    protected AbstractC9453pq<Object> a(AbstractC9459pw abstractC9459pw, AbstractC9509qt abstractC9509qt) {
        Object f = abstractC9459pw.g().f(abstractC9509qt);
        if (f != null) {
            return abstractC9459pw.a(abstractC9509qt, f);
        }
        return null;
    }

    protected AbstractC9453pq<Object> c(AbstractC9459pw abstractC9459pw, AbstractC9509qt abstractC9509qt) {
        Object a2 = abstractC9459pw.g().a(abstractC9509qt);
        if (a2 != null) {
            return abstractC9459pw.a(abstractC9509qt, a2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object e(SerializationConfig serializationConfig, AbstractC9445pi abstractC9445pi) {
        return serializationConfig.h().h(abstractC9445pi.k());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(SerializationConfig serializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9544rb abstractC9544rb) {
        if (abstractC9544rb != null) {
            return false;
        }
        JsonSerialize.Typing v = serializationConfig.h().v(abstractC9445pi.k());
        if (v == null || v == JsonSerialize.Typing.DEFAULT_TYPING) {
            return serializationConfig.a(MapperFeature.USE_STATIC_TYPING);
        }
        return v == JsonSerialize.Typing.STATIC;
    }
}
