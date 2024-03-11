package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC9415pE;
import o.AbstractC9419pI;
import o.AbstractC9424pN;
import o.AbstractC9436pZ;
import o.AbstractC9445pi;
import o.AbstractC9449pm;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9454pr;
import o.AbstractC9465qB;
import o.AbstractC9509qt;
import o.AbstractC9543ra;
import o.C9432pV;
import o.C9433pW;
import o.C9468qE;
import o.C9473qJ;
import o.C9495qf;
import o.C9508qs;
import o.C9537rU;
import o.C9541rY;
import o.C9542rZ;
import o.InterfaceC9426pP;
import o.InterfaceC9427pQ;
import o.InterfaceC9431pU;
import o.InterfaceC9489qZ;

/* loaded from: classes5.dex */
public abstract class BasicDeserializerFactory extends AbstractC9424pN implements Serializable {
    protected final DeserializerFactoryConfig d;
    private static final Class<?> g = Object.class;
    private static final Class<?> i = String.class;
    private static final Class<?> b = CharSequence.class;
    private static final Class<?> e = Iterable.class;
    private static final Class<?> f = Map.Entry.class;
    private static final Class<?> h = Serializable.class;
    protected static final PropertyName c = new PropertyName("@JsonUnwrapped");

    /* JADX INFO: Access modifiers changed from: protected */
    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this.d = deserializerFactoryConfig;
    }

    @Override // o.AbstractC9424pN
    public JavaType c(DeserializationConfig deserializationConfig, JavaType javaType) {
        JavaType e2;
        while (true) {
            e2 = e(deserializationConfig, javaType);
            if (e2 == null) {
                return javaType;
            }
            Class<?> h2 = javaType.h();
            Class<?> h3 = e2.h();
            if (h2 == h3 || !h2.isAssignableFrom(h3)) {
                break;
            }
            javaType = e2;
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + e2 + ": latter is not a subtype of former");
    }

    private JavaType e(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> h2 = javaType.h();
        if (this.d.c()) {
            for (AbstractC9449pm abstractC9449pm : this.d.d()) {
                JavaType c2 = abstractC9449pm.c(deserializationConfig, javaType);
                if (c2 != null && !c2.d(h2)) {
                    return c2;
                }
            }
            return null;
        }
        return null;
    }

    public ValueInstantiator d(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi) {
        DeserializationConfig c2 = deserializationContext.c();
        C9508qs k = abstractC9445pi.k();
        Object j = deserializationContext.f().j(k);
        ValueInstantiator d = j != null ? d(c2, k, j) : null;
        if (d == null && (d = JDKValueInstantiators.d(c2, abstractC9445pi.o())) == null) {
            d = a(deserializationContext, abstractC9445pi);
        }
        if (this.d.j()) {
            for (InterfaceC9431pU interfaceC9431pU : this.d.f()) {
                d = interfaceC9431pU.b(c2, abstractC9445pi, d);
                if (d == null) {
                    deserializationContext.b(abstractC9445pi, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", interfaceC9431pU.getClass().getName());
                }
            }
        }
        if (d.o() == null) {
            return d;
        }
        AnnotatedParameter o2 = d.o();
        AnnotatedWithParams f2 = o2.f();
        throw new IllegalArgumentException("Argument #" + o2.c() + " of constructor " + f2 + " has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
    }

    protected ValueInstantiator a(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi) {
        C9433pW c9433pW = new C9433pW(abstractC9445pi, deserializationContext.c());
        AnnotationIntrospector f2 = deserializationContext.f();
        VisibilityChecker<?> d = deserializationContext.c().d(abstractC9445pi.o(), abstractC9445pi.k());
        Map<AnnotatedWithParams, AbstractC9465qB[]> e2 = e(deserializationContext, abstractC9445pi);
        d(deserializationContext, abstractC9445pi, d, f2, c9433pW, e2);
        if (abstractC9445pi.t().w()) {
            a(deserializationContext, abstractC9445pi, d, f2, c9433pW, e2);
        }
        return c9433pW.b(deserializationContext);
    }

    protected Map<AnnotatedWithParams, AbstractC9465qB[]> e(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi) {
        Map<AnnotatedWithParams, AbstractC9465qB[]> emptyMap = Collections.emptyMap();
        for (AbstractC9465qB abstractC9465qB : abstractC9445pi.l()) {
            Iterator<AnnotatedParameter> k = abstractC9465qB.k();
            while (k.hasNext()) {
                AnnotatedParameter next = k.next();
                AnnotatedWithParams f2 = next.f();
                AbstractC9465qB[] abstractC9465qBArr = emptyMap.get(f2);
                int c2 = next.c();
                if (abstractC9465qBArr == null) {
                    if (emptyMap.isEmpty()) {
                        emptyMap = new LinkedHashMap<>();
                    }
                    abstractC9465qBArr = new AbstractC9465qB[f2.f()];
                    emptyMap.put(f2, abstractC9465qBArr);
                } else {
                    AbstractC9465qB abstractC9465qB2 = abstractC9465qBArr[c2];
                    if (abstractC9465qB2 != null) {
                        deserializationContext.b(abstractC9445pi, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(c2), f2, abstractC9465qB2, abstractC9465qB);
                    }
                }
                abstractC9465qBArr[c2] = abstractC9465qB;
            }
        }
        return emptyMap;
    }

    public ValueInstantiator d(DeserializationConfig deserializationConfig, AbstractC9509qt abstractC9509qt, Object obj) {
        ValueInstantiator g2;
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        Class<?> cls = (Class) obj;
        if (C9537rU.l(cls)) {
            return null;
        }
        if (!ValueInstantiator.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
        }
        AbstractC9415pE n = deserializationConfig.n();
        return (n == null || (g2 = n.g(deserializationConfig, abstractC9509qt, cls)) == null) ? (ValueInstantiator) C9537rU.b(cls, deserializationConfig.f()) : g2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    protected void a(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, C9433pW c9433pW, Map<AnnotatedWithParams, AbstractC9465qB[]> map) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        C9432pV c9432pV;
        VisibilityChecker<?> visibilityChecker2 = visibilityChecker;
        if (abstractC9445pi.v()) {
            return;
        }
        AnnotatedConstructor b2 = abstractC9445pi.b();
        if (b2 != null && (!c9433pW.a() || e(deserializationContext, b2))) {
            c9433pW.a(b2);
        }
        LinkedList<C9432pV> linkedList = new LinkedList();
        Iterator<AnnotatedConstructor> it = abstractC9445pi.q().iterator();
        ?? r13 = 0;
        int i6 = 0;
        while (true) {
            i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            AnnotatedConstructor next = it.next();
            JsonCreator.Mode d = annotationIntrospector.d(deserializationContext.c(), next);
            if (JsonCreator.Mode.DISABLED != d) {
                if (d == null) {
                    if (visibilityChecker2.d(next)) {
                        linkedList.add(C9432pV.c(annotationIntrospector, next, map.get(next)));
                    }
                } else {
                    int i7 = AnonymousClass1.d[d.ordinal()];
                    if (i7 == 1) {
                        c(deserializationContext, abstractC9445pi, c9433pW, C9432pV.c(annotationIntrospector, next, null));
                    } else if (i7 == 2) {
                        a(deserializationContext, abstractC9445pi, c9433pW, C9432pV.c(annotationIntrospector, next, map.get(next)));
                    } else {
                        d(deserializationContext, abstractC9445pi, c9433pW, C9432pV.c(annotationIntrospector, next, map.get(next)));
                    }
                    i6++;
                }
            }
        }
        if (i6 > 0) {
            return;
        }
        LinkedList linkedList2 = null;
        for (C9432pV c9432pV2 : linkedList) {
            int d2 = c9432pV2.d();
            AnnotatedWithParams b3 = c9432pV2.b();
            if (d2 == i2) {
                AbstractC9465qB f2 = c9432pV2.f(r13);
                if (b(annotationIntrospector, b3, f2)) {
                    SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[i2];
                    settableBeanPropertyArr[r13] = c(deserializationContext, abstractC9445pi, c9432pV2.d(r13), 0, c9432pV2.e(r13), c9432pV2.a(r13));
                    c9433pW.e(b3, r13, settableBeanPropertyArr);
                } else {
                    d(c9433pW, b3, (boolean) r13, visibilityChecker2.d(b3));
                    if (f2 != null) {
                        ((C9473qJ) f2).N();
                    }
                }
                z = r13;
            } else {
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[d2];
                int i8 = -1;
                int i9 = r13;
                int i10 = i9;
                int i11 = i10;
                while (i9 < d2) {
                    AnnotatedParameter d3 = b3.d(i9);
                    AbstractC9465qB f3 = c9432pV2.f(i9);
                    JacksonInject.Value d4 = annotationIntrospector.d((AnnotatedMember) d3);
                    PropertyName o2 = f3 == null ? null : f3.o();
                    if (f3 == null || !f3.C()) {
                        i3 = i9;
                        i4 = i8;
                        i5 = d2;
                        c9432pV = c9432pV2;
                        if (d4 != null) {
                            i11++;
                            settableBeanPropertyArr2[i3] = c(deserializationContext, abstractC9445pi, o2, i3, d3, d4);
                        } else if (annotationIntrospector.f((AnnotatedMember) d3) != null) {
                            a(deserializationContext, abstractC9445pi, d3);
                        } else if (i4 < 0) {
                            i8 = i3;
                            i9 = i3 + 1;
                            d2 = i5;
                            c9432pV2 = c9432pV;
                        }
                    } else {
                        i10++;
                        i3 = i9;
                        i4 = i8;
                        i5 = d2;
                        c9432pV = c9432pV2;
                        settableBeanPropertyArr2[i3] = c(deserializationContext, abstractC9445pi, o2, i3, d3, d4);
                    }
                    i8 = i4;
                    i9 = i3 + 1;
                    d2 = i5;
                    c9432pV2 = c9432pV;
                }
                int i12 = i8;
                int i13 = d2;
                C9432pV c9432pV3 = c9432pV2;
                if (i10 <= 0 && i11 <= 0) {
                    z = false;
                } else if (i10 + i11 == i13) {
                    z = false;
                    c9433pW.e(b3, false, settableBeanPropertyArr2);
                } else {
                    z = false;
                    if (i10 == 0 && i11 + 1 == i13) {
                        c9433pW.d(b3, false, settableBeanPropertyArr2, 0);
                    } else {
                        PropertyName c2 = c9432pV3.c(i12);
                        if (c2 == null || c2.e()) {
                            deserializationContext.b(abstractC9445pi, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i12), b3);
                        }
                    }
                }
                if (!c9433pW.a()) {
                    LinkedList linkedList3 = linkedList2 == null ? new LinkedList() : linkedList2;
                    linkedList3.add(b3);
                    linkedList2 = linkedList3;
                }
            }
            visibilityChecker2 = visibilityChecker;
            r13 = z;
            i2 = 1;
        }
        if (linkedList2 == null || c9433pW.b() || c9433pW.e()) {
            return;
        }
        b(deserializationContext, abstractC9445pi, visibilityChecker, annotationIntrospector, c9433pW, linkedList2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[JsonCreator.Mode.values().length];
            d = iArr;
            try {
                iArr[JsonCreator.Mode.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[JsonCreator.Mode.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[JsonCreator.Mode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected void c(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, C9433pW c9433pW, C9432pV c9432pV) {
        int d = c9432pV.d();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[d];
        int i2 = -1;
        for (int i3 = 0; i3 < d; i3++) {
            AnnotatedParameter e2 = c9432pV.e(i3);
            JacksonInject.Value a = c9432pV.a(i3);
            if (a != null) {
                settableBeanPropertyArr[i3] = c(deserializationContext, abstractC9445pi, (PropertyName) null, i3, e2, a);
            } else if (i2 < 0) {
                i2 = i3;
            } else {
                deserializationContext.b(abstractC9445pi, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i2), Integer.valueOf(i3), c9432pV);
            }
        }
        if (i2 < 0) {
            deserializationContext.b(abstractC9445pi, "No argument left as delegating for Creator %s: exactly one required", c9432pV);
        }
        if (d == 1) {
            d(c9433pW, c9432pV.b(), true, true);
            AbstractC9465qB f2 = c9432pV.f(0);
            if (f2 != null) {
                ((C9473qJ) f2).N();
                return;
            }
            return;
        }
        c9433pW.d(c9432pV.b(), true, settableBeanPropertyArr, i2);
    }

    protected void a(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, C9433pW c9433pW, C9432pV c9432pV) {
        int d = c9432pV.d();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[d];
        for (int i2 = 0; i2 < d; i2++) {
            JacksonInject.Value a = c9432pV.a(i2);
            AnnotatedParameter e2 = c9432pV.e(i2);
            PropertyName d2 = c9432pV.d(i2);
            if (d2 == null) {
                if (deserializationContext.f().f((AnnotatedMember) e2) != null) {
                    a(deserializationContext, abstractC9445pi, e2);
                }
                d2 = c9432pV.c(i2);
                if (d2 == null && a == null) {
                    deserializationContext.b(abstractC9445pi, "Argument #%d has no property name, is not Injectable: can not use as Creator %s", Integer.valueOf(i2), c9432pV);
                }
            }
            settableBeanPropertyArr[i2] = c(deserializationContext, abstractC9445pi, d2, i2, e2, a);
        }
        c9433pW.e(c9432pV.b(), true, settableBeanPropertyArr);
    }

    protected void d(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, C9433pW c9433pW, C9432pV c9432pV) {
        PropertyName propertyName;
        if (1 != c9432pV.d()) {
            int e2 = c9432pV.e();
            if (e2 >= 0 && c9432pV.d(e2) == null) {
                c(deserializationContext, abstractC9445pi, c9433pW, c9432pV);
                return;
            } else {
                a(deserializationContext, abstractC9445pi, c9433pW, c9432pV);
                return;
            }
        }
        boolean z = false;
        AnnotatedParameter e3 = c9432pV.e(0);
        JacksonInject.Value a = c9432pV.a(0);
        PropertyName b2 = c9432pV.b(0);
        AbstractC9465qB f2 = c9432pV.f(0);
        boolean z2 = (b2 == null && a == null) ? false : true;
        if (z2 || f2 == null) {
            propertyName = b2;
            z = z2;
        } else {
            PropertyName d = c9432pV.d(0);
            if (d != null && f2.b()) {
                z = true;
            }
            propertyName = d;
        }
        if (z) {
            c9433pW.e(c9432pV.b(), true, new SettableBeanProperty[]{c(deserializationContext, abstractC9445pi, propertyName, 0, e3, a)});
            return;
        }
        d(c9433pW, c9432pV.b(), true, true);
        if (f2 != null) {
            ((C9473qJ) f2).N();
        }
    }

    private boolean b(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, AbstractC9465qB abstractC9465qB) {
        String a;
        if ((abstractC9465qB == null || !abstractC9465qB.C()) && annotationIntrospector.d((AnnotatedMember) annotatedWithParams.d(0)) == null) {
            return (abstractC9465qB == null || (a = abstractC9465qB.a()) == null || a.isEmpty() || !abstractC9465qB.b()) ? false : true;
        }
        return true;
    }

    private void b(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, C9433pW c9433pW, List<AnnotatedWithParams> list) {
        int i2;
        Iterator<AnnotatedWithParams> it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams next = it.next();
            if (visibilityChecker.d(next)) {
                int f2 = next.f();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[f2];
                int i3 = 0;
                while (true) {
                    if (i3 < f2) {
                        AnnotatedParameter d = next.d(i3);
                        PropertyName a = a(d, annotationIntrospector);
                        if (a != null && !a.e()) {
                            settableBeanPropertyArr2[i3] = c(deserializationContext, abstractC9445pi, a, d.c(), d, (JacksonInject.Value) null);
                            i3++;
                        }
                    } else if (annotatedWithParams2 != null) {
                        break;
                    } else {
                        annotatedWithParams2 = next;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedWithParams != null) {
            c9433pW.e(annotatedWithParams, false, settableBeanPropertyArr);
            C9468qE c9468qE = (C9468qE) abstractC9445pi;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName b2 = settableBeanProperty.b();
                if (!c9468qE.b(b2)) {
                    c9468qE.a(C9541rY.d(deserializationContext.c(), settableBeanProperty.e(), b2));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [o.qB] */
    /* JADX WARN: Type inference failed for: r0v18 */
    protected void d(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, C9433pW c9433pW, Map<AnnotatedWithParams, AbstractC9465qB[]> map) {
        AnnotatedParameter annotatedParameter;
        int i2;
        int i3;
        SettableBeanProperty[] settableBeanPropertyArr;
        AnnotatedWithParams annotatedWithParams;
        int i4;
        int i5;
        VisibilityChecker<?> visibilityChecker2 = visibilityChecker;
        Map<AnnotatedWithParams, AbstractC9465qB[]> map2 = map;
        LinkedList<C9432pV> linkedList = new LinkedList();
        Iterator<AnnotatedMethod> it = abstractC9445pi.s().iterator();
        int i6 = 0;
        while (true) {
            annotatedParameter = null;
            i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            AnnotatedMethod next = it.next();
            JsonCreator.Mode d = annotationIntrospector.d(deserializationContext.c(), next);
            int f2 = next.f();
            if (d == null) {
                if (f2 == 1 && visibilityChecker2.d((AnnotatedMember) next)) {
                    linkedList.add(C9432pV.c(annotationIntrospector, next, null));
                }
            } else if (d != JsonCreator.Mode.DISABLED) {
                if (f2 == 0) {
                    c9433pW.a(next);
                } else {
                    int i7 = AnonymousClass1.d[d.ordinal()];
                    if (i7 == 1) {
                        c(deserializationContext, abstractC9445pi, c9433pW, C9432pV.c(annotationIntrospector, next, null));
                    } else if (i7 == 2) {
                        a(deserializationContext, abstractC9445pi, c9433pW, C9432pV.c(annotationIntrospector, next, map2.get(next)));
                    } else {
                        d(deserializationContext, abstractC9445pi, c9433pW, C9432pV.c(annotationIntrospector, next, map2.get(next)));
                    }
                    i6++;
                }
            }
        }
        if (i6 > 0) {
            return;
        }
        for (C9432pV c9432pV : linkedList) {
            int d2 = c9432pV.d();
            AnnotatedWithParams b2 = c9432pV.b();
            AbstractC9465qB[] abstractC9465qBArr = map2.get(b2);
            if (d2 == i2) {
                AbstractC9465qB f3 = c9432pV.f(0);
                if (!b(annotationIntrospector, b2, f3)) {
                    d(c9433pW, b2, false, visibilityChecker2.d(b2));
                    if (f3 != null) {
                        ((C9473qJ) f3).N();
                    }
                } else {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[d2];
                    AnnotatedParameter annotatedParameter2 = annotatedParameter;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    while (i8 < d2) {
                        AnnotatedParameter d3 = b2.d(i8);
                        AbstractC9465qB abstractC9465qB = abstractC9465qBArr == null ? annotatedParameter : abstractC9465qBArr[i8];
                        JacksonInject.Value d4 = annotationIntrospector.d((AnnotatedMember) d3);
                        PropertyName o2 = abstractC9465qB == 0 ? annotatedParameter : abstractC9465qB.o();
                        if (abstractC9465qB == 0 || !abstractC9465qB.C()) {
                            i3 = i8;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            annotatedWithParams = b2;
                            i4 = d2;
                            i5 = i2;
                            if (d4 != null) {
                                i10++;
                                settableBeanPropertyArr[i3] = c(deserializationContext, abstractC9445pi, o2, i3, d3, d4);
                            } else if (annotationIntrospector.f((AnnotatedMember) d3) != null) {
                                a(deserializationContext, abstractC9445pi, d3);
                            } else if (annotatedParameter2 == null) {
                                annotatedParameter2 = d3;
                            }
                        } else {
                            i9++;
                            i3 = i8;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            annotatedWithParams = b2;
                            i4 = d2;
                            i5 = i2;
                            settableBeanPropertyArr[i3] = c(deserializationContext, abstractC9445pi, o2, i3, d3, d4);
                        }
                        i8 = i3 + 1;
                        b2 = annotatedWithParams;
                        d2 = i4;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                        i2 = i5;
                        annotatedParameter = null;
                    }
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    AnnotatedWithParams annotatedWithParams2 = b2;
                    int i11 = d2;
                    int i12 = i2;
                    if (i9 > 0 || i10 > 0) {
                        if (i9 + i10 == i11) {
                            c9433pW.e(annotatedWithParams2, false, settableBeanPropertyArr3);
                        } else if (i9 == 0 && i10 + 1 == i11) {
                            c9433pW.d(annotatedWithParams2, false, settableBeanPropertyArr3, 0);
                        } else {
                            deserializationContext.b(abstractC9445pi, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(annotatedParameter2.c()), annotatedWithParams2);
                        }
                    }
                    visibilityChecker2 = visibilityChecker;
                    map2 = map;
                    i2 = i12;
                    annotatedParameter = null;
                }
            }
        }
    }

    protected boolean d(C9433pW c9433pW, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<?> e2 = annotatedWithParams.e(0);
        if (e2 == String.class || e2 == b) {
            if (z || z2) {
                c9433pW.e(annotatedWithParams, z);
            }
            return true;
        } else if (e2 == Integer.TYPE || e2 == Integer.class) {
            if (z || z2) {
                c9433pW.a(annotatedWithParams, z);
            }
            return true;
        } else if (e2 == Long.TYPE || e2 == Long.class) {
            if (z || z2) {
                c9433pW.d(annotatedWithParams, z);
            }
            return true;
        } else if (e2 == Double.TYPE || e2 == Double.class) {
            if (z || z2) {
                c9433pW.b(annotatedWithParams, z);
            }
            return true;
        } else if (e2 == Boolean.TYPE || e2 == Boolean.class) {
            if (z || z2) {
                c9433pW.c(annotatedWithParams, z);
            }
            return true;
        } else if (z) {
            c9433pW.d(annotatedWithParams, z, null, 0);
            return true;
        } else {
            return false;
        }
    }

    protected void a(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, AnnotatedParameter annotatedParameter) {
        deserializationContext.c(abstractC9445pi.t(), String.format("Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.c())));
    }

    protected SettableBeanProperty c(DeserializationContext deserializationContext, AbstractC9445pi abstractC9445pi, PropertyName propertyName, int i2, AnnotatedParameter annotatedParameter, JacksonInject.Value value) {
        PropertyMetadata b2;
        DeserializationConfig c2 = deserializationContext.c();
        AnnotationIntrospector f2 = deserializationContext.f();
        if (f2 == null) {
            b2 = PropertyMetadata.c;
        } else {
            b2 = PropertyMetadata.b(f2.i((AnnotatedMember) annotatedParameter), f2.s(annotatedParameter), f2.w(annotatedParameter), f2.q(annotatedParameter));
        }
        PropertyMetadata propertyMetadata = b2;
        JavaType e2 = e(deserializationContext, annotatedParameter, annotatedParameter.a());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, e2, f2.D(annotatedParameter), annotatedParameter, propertyMetadata);
        AbstractC9543ra abstractC9543ra = (AbstractC9543ra) e2.m();
        if (abstractC9543ra == null) {
            abstractC9543ra = b(c2, e2);
        }
        AbstractC9543ra abstractC9543ra2 = abstractC9543ra;
        PropertyMetadata a = a(deserializationContext, std, propertyMetadata);
        CreatorProperty creatorProperty = new CreatorProperty(propertyName, e2, std.h(), abstractC9543ra2, abstractC9445pi.n(), annotatedParameter, i2, value == null ? null : value.a(), a);
        AbstractC9452pp<?> c3 = c(deserializationContext, annotatedParameter);
        if (c3 == null) {
            c3 = (AbstractC9452pp) e2.l();
        }
        return c3 != null ? creatorProperty.d(deserializationContext.c(c3, (BeanProperty) creatorProperty, e2)) : creatorProperty;
    }

    private PropertyName a(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotatedParameter == null || annotationIntrospector == null) {
            return null;
        }
        PropertyName k = annotationIntrospector.k(annotatedParameter);
        if (k != null) {
            return k;
        }
        String b2 = annotationIntrospector.b((AnnotatedMember) annotatedParameter);
        if (b2 == null || b2.isEmpty()) {
            return null;
        }
        return PropertyName.b(b2);
    }

    protected PropertyMetadata a(DeserializationContext deserializationContext, BeanProperty beanProperty, PropertyMetadata propertyMetadata) {
        Nulls nulls;
        Nulls nulls2;
        JsonSetter.Value C;
        AnnotationIntrospector f2 = deserializationContext.f();
        DeserializationConfig c2 = deserializationContext.c();
        AnnotatedMember e2 = beanProperty.e();
        Nulls nulls3 = null;
        if (e2 != null) {
            if (f2 == null || (C = f2.C(e2)) == null) {
                nulls2 = null;
            } else {
                nulls2 = C.a();
                nulls3 = C.c();
            }
            JsonSetter.Value h2 = c2.a(beanProperty.d().h()).h();
            if (h2 != null) {
                Nulls a = nulls2 == null ? h2.a() : nulls2;
                if (nulls3 == null) {
                    nulls3 = h2.c();
                }
                nulls = nulls3;
                nulls3 = a;
            } else {
                nulls = nulls3;
                nulls3 = nulls2;
            }
        } else {
            nulls = null;
        }
        JsonSetter.Value l = c2.l();
        if (nulls3 == null) {
            nulls3 = l.a();
        }
        if (nulls == null) {
            nulls = l.c();
        }
        return (nulls3 == null && nulls == null) ? propertyMetadata : propertyMetadata.a(nulls3, nulls);
    }

    @Override // o.AbstractC9424pN
    public AbstractC9452pp<?> e(DeserializationContext deserializationContext, ArrayType arrayType, AbstractC9445pi abstractC9445pi) {
        DeserializationConfig c2 = deserializationContext.c();
        JavaType j = arrayType.j();
        AbstractC9452pp<?> abstractC9452pp = (AbstractC9452pp) j.l();
        AbstractC9543ra abstractC9543ra = (AbstractC9543ra) j.m();
        if (abstractC9543ra == null) {
            abstractC9543ra = b(c2, j);
        }
        AbstractC9543ra abstractC9543ra2 = abstractC9543ra;
        AbstractC9452pp<?> e2 = e(arrayType, c2, abstractC9445pi, abstractC9543ra2, abstractC9452pp);
        if (e2 == null) {
            if (abstractC9452pp == null) {
                Class<?> h2 = j.h();
                if (j.C()) {
                    return PrimitiveArrayDeserializers.d(h2);
                }
                if (h2 == String.class) {
                    return StringArrayDeserializer.e;
                }
            }
            e2 = new ObjectArrayDeserializer(arrayType, abstractC9452pp, abstractC9543ra2);
        }
        if (this.d.e()) {
            for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                e2 = abstractC9419pI.e(c2, arrayType, abstractC9445pi, e2);
            }
        }
        return e2;
    }

    @Override // o.AbstractC9424pN
    public AbstractC9452pp<?> d(DeserializationContext deserializationContext, CollectionType collectionType, AbstractC9445pi abstractC9445pi) {
        AbstractC9452pp<?> collectionDeserializer;
        JavaType j = collectionType.j();
        AbstractC9452pp<?> abstractC9452pp = (AbstractC9452pp) j.l();
        DeserializationConfig c2 = deserializationContext.c();
        AbstractC9543ra abstractC9543ra = (AbstractC9543ra) j.m();
        if (abstractC9543ra == null) {
            abstractC9543ra = b(c2, j);
        }
        AbstractC9543ra abstractC9543ra2 = abstractC9543ra;
        AbstractC9452pp<?> e2 = e(collectionType, c2, abstractC9445pi, abstractC9543ra2, abstractC9452pp);
        if (e2 == null) {
            Class<?> h2 = collectionType.h();
            if (abstractC9452pp == null && EnumSet.class.isAssignableFrom(h2)) {
                e2 = new EnumSetDeserializer(j, null);
            }
        }
        if (e2 == null) {
            if (collectionType.y() || collectionType.s()) {
                CollectionType b2 = b(collectionType, c2);
                if (b2 == null) {
                    if (collectionType.m() == null) {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + collectionType);
                    }
                    e2 = AbstractDeserializer.d(abstractC9445pi);
                } else {
                    abstractC9445pi = c2.e(b2);
                    collectionType = b2;
                }
            }
            if (e2 == null) {
                ValueInstantiator d = d(deserializationContext, abstractC9445pi);
                if (!d.g()) {
                    if (collectionType.d(ArrayBlockingQueue.class)) {
                        return new ArrayBlockingQueueDeserializer(collectionType, abstractC9452pp, abstractC9543ra2, d);
                    }
                    AbstractC9452pp<?> d2 = AbstractC9436pZ.d(deserializationContext, collectionType);
                    if (d2 != null) {
                        return d2;
                    }
                }
                if (j.d(String.class)) {
                    collectionDeserializer = new StringCollectionDeserializer(collectionType, abstractC9452pp, d);
                } else {
                    collectionDeserializer = new CollectionDeserializer(collectionType, abstractC9452pp, abstractC9543ra2, d);
                }
                e2 = collectionDeserializer;
            }
        }
        if (this.d.e()) {
            for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                e2 = abstractC9419pI.a(c2, collectionType, abstractC9445pi, e2);
            }
        }
        return e2;
    }

    protected CollectionType b(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> b2 = c.b(javaType);
        if (b2 != null) {
            return (CollectionType) deserializationConfig.d(javaType, b2);
        }
        return null;
    }

    @Override // o.AbstractC9424pN
    public AbstractC9452pp<?> e(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, AbstractC9445pi abstractC9445pi) {
        JavaType j = collectionLikeType.j();
        AbstractC9452pp<?> abstractC9452pp = (AbstractC9452pp) j.l();
        DeserializationConfig c2 = deserializationContext.c();
        AbstractC9543ra abstractC9543ra = (AbstractC9543ra) j.m();
        AbstractC9452pp<?> e2 = e(collectionLikeType, c2, abstractC9445pi, abstractC9543ra == null ? b(c2, j) : abstractC9543ra, abstractC9452pp);
        if (e2 != null && this.d.e()) {
            for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                e2 = abstractC9419pI.a(c2, collectionLikeType, abstractC9445pi, e2);
            }
        }
        return e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    @Override // o.AbstractC9424pN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.AbstractC9452pp<?> d(com.fasterxml.jackson.databind.DeserializationContext r20, com.fasterxml.jackson.databind.type.MapType r21, o.AbstractC9445pi r22) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.d(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.MapType, o.pi):o.pp");
    }

    protected MapType d(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> a = c.a(javaType);
        if (a != null) {
            return (MapType) deserializationConfig.d(javaType, a);
        }
        return null;
    }

    @Override // o.AbstractC9424pN
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, MapLikeType mapLikeType, AbstractC9445pi abstractC9445pi) {
        JavaType f2 = mapLikeType.f();
        JavaType j = mapLikeType.j();
        DeserializationConfig c2 = deserializationContext.c();
        AbstractC9452pp<?> abstractC9452pp = (AbstractC9452pp) j.l();
        AbstractC9450pn abstractC9450pn = (AbstractC9450pn) f2.l();
        AbstractC9543ra abstractC9543ra = (AbstractC9543ra) j.m();
        if (abstractC9543ra == null) {
            abstractC9543ra = b(c2, j);
        }
        AbstractC9452pp<?> d = d(mapLikeType, c2, abstractC9445pi, abstractC9450pn, abstractC9543ra, abstractC9452pp);
        if (d != null && this.d.e()) {
            for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                d = abstractC9419pI.d(c2, mapLikeType, abstractC9445pi, d);
            }
        }
        return d;
    }

    @Override // o.AbstractC9424pN
    public AbstractC9452pp<?> b(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        AbstractC9452pp<?> b2;
        DeserializationConfig c2 = deserializationContext.c();
        Class<?> h2 = javaType.h();
        AbstractC9452pp<?> b3 = b(h2, c2, abstractC9445pi);
        if (b3 == null) {
            ValueInstantiator a = a(deserializationContext, abstractC9445pi);
            SettableBeanProperty[] d = a == null ? null : a.d(deserializationContext.c());
            for (AnnotatedMethod annotatedMethod : abstractC9445pi.s()) {
                if (e(deserializationContext, annotatedMethod)) {
                    if (annotatedMethod.f() == 0) {
                        b2 = EnumDeserializer.b(c2, h2, annotatedMethod);
                    } else if (annotatedMethod.n().isAssignableFrom(h2)) {
                        b2 = EnumDeserializer.b(c2, h2, annotatedMethod, a, d);
                    }
                    b3 = b2;
                    break;
                }
            }
            if (b3 == null) {
                b3 = new EnumDeserializer(c(h2, c2, abstractC9445pi.j()), Boolean.valueOf(c2.a(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this.d.e()) {
            for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                b3 = abstractC9419pI.a(c2, javaType, abstractC9445pi, b3);
            }
        }
        return b3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC9424pN
    public AbstractC9452pp<?> b(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        Class<?> h2 = javaType.h();
        AbstractC9452pp<?> c2 = c((Class<? extends AbstractC9454pr>) h2, deserializationConfig, abstractC9445pi);
        return c2 != null ? c2 : JsonNodeDeserializer.e(h2);
    }

    @Override // o.AbstractC9424pN
    public AbstractC9452pp<?> d(DeserializationContext deserializationContext, ReferenceType referenceType, AbstractC9445pi abstractC9445pi) {
        JavaType j = referenceType.j();
        AbstractC9452pp<?> abstractC9452pp = (AbstractC9452pp) j.l();
        DeserializationConfig c2 = deserializationContext.c();
        AbstractC9543ra abstractC9543ra = (AbstractC9543ra) j.m();
        if (abstractC9543ra == null) {
            abstractC9543ra = b(c2, j);
        }
        AbstractC9543ra abstractC9543ra2 = abstractC9543ra;
        AbstractC9452pp<?> a = a(referenceType, c2, abstractC9445pi, abstractC9543ra2, abstractC9452pp);
        if (a == null && referenceType.e(AtomicReference.class)) {
            return new AtomicReferenceDeserializer(referenceType, referenceType.h() == AtomicReference.class ? null : d(deserializationContext, abstractC9445pi), abstractC9543ra2, abstractC9452pp);
        }
        if (a != null && this.d.e()) {
            for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                a = abstractC9419pI.e(c2, referenceType, abstractC9445pi, a);
            }
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC9424pN
    public AbstractC9543ra b(DeserializationConfig deserializationConfig, JavaType javaType) {
        Collection<NamedType> e2;
        C9508qs k = deserializationConfig.j(javaType.h()).k();
        InterfaceC9489qZ<?> d = deserializationConfig.h().d(deserializationConfig, k, javaType);
        if (d == null) {
            d = deserializationConfig.d(javaType);
            if (d == null) {
                return null;
            }
            e2 = null;
        } else {
            e2 = deserializationConfig.z().e(deserializationConfig, k);
        }
        Class<?> d2 = d.d();
        InterfaceC9489qZ<?> interfaceC9489qZ = d;
        if (d2 == null) {
            interfaceC9489qZ = d;
            if (javaType.s()) {
                JavaType c2 = c(deserializationConfig, javaType);
                interfaceC9489qZ = d;
                if (c2 != null) {
                    interfaceC9489qZ = d;
                    if (!c2.d(javaType.h())) {
                        interfaceC9489qZ = d.e(c2.h());
                    }
                }
            }
        }
        try {
            return interfaceC9489qZ.b(deserializationConfig, javaType, e2);
        } catch (IllegalArgumentException e3) {
            InvalidDefinitionException b2 = InvalidDefinitionException.b(null, C9537rU.d((Throwable) e3), javaType);
            b2.initCause(e3);
            throw b2;
        }
    }

    protected AbstractC9452pp<?> c(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        return OptionalHandlerFactory.c.d(javaType, deserializationContext.c(), abstractC9445pi);
    }

    @Override // o.AbstractC9424pN
    public AbstractC9450pn d(DeserializationContext deserializationContext, JavaType javaType) {
        DeserializationConfig c2 = deserializationContext.c();
        AbstractC9450pn abstractC9450pn = null;
        if (this.d.g()) {
            AbstractC9445pi j = c2.j(javaType.h());
            Iterator<InterfaceC9426pP> it = this.d.h().iterator();
            while (it.hasNext() && (abstractC9450pn = it.next().d(javaType, c2, j)) == null) {
            }
        }
        if (abstractC9450pn == null) {
            if (javaType.u()) {
                abstractC9450pn = a(deserializationContext, javaType);
            } else {
                abstractC9450pn = StdKeyDeserializers.c(c2, javaType);
            }
        }
        if (abstractC9450pn != null && this.d.e()) {
            for (AbstractC9419pI abstractC9419pI : this.d.b()) {
                abstractC9450pn = abstractC9419pI.e(c2, javaType, abstractC9450pn);
            }
        }
        return abstractC9450pn;
    }

    private AbstractC9450pn a(DeserializationContext deserializationContext, JavaType javaType) {
        DeserializationConfig c2 = deserializationContext.c();
        Class<?> h2 = javaType.h();
        AbstractC9445pi a = c2.a(javaType);
        AbstractC9450pn b2 = b(deserializationContext, a.k());
        if (b2 != null) {
            return b2;
        }
        AbstractC9452pp<?> b3 = b(h2, c2, a);
        if (b3 != null) {
            return StdKeyDeserializers.d(c2, javaType, b3);
        }
        AbstractC9452pp<Object> c3 = c(deserializationContext, a.k());
        if (c3 != null) {
            return StdKeyDeserializers.d(c2, javaType, c3);
        }
        EnumResolver c4 = c(h2, c2, a.j());
        for (AnnotatedMethod annotatedMethod : a.s()) {
            if (e(deserializationContext, annotatedMethod)) {
                if (annotatedMethod.f() == 1 && annotatedMethod.n().isAssignableFrom(h2)) {
                    if (annotatedMethod.e(0) != String.class) {
                        throw new IllegalArgumentException("Parameter #0 type for factory method (" + annotatedMethod + ") not suitable, must be java.lang.String");
                    }
                    if (c2.f()) {
                        C9537rU.b(annotatedMethod.h(), deserializationContext.d(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.e(c4, annotatedMethod);
                }
                throw new IllegalArgumentException("Unsuitable method (" + annotatedMethod + ") decorated with @JsonCreator (for Enum type " + h2.getName() + ")");
            }
        }
        return StdKeyDeserializers.e(c4);
    }

    public AbstractC9543ra c(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) {
        InterfaceC9489qZ<?> c2 = deserializationConfig.h().c(deserializationConfig, annotatedMember, javaType);
        if (c2 == null) {
            return b(deserializationConfig, javaType);
        }
        try {
            return c2.b(deserializationConfig, javaType, deserializationConfig.z().e(deserializationConfig, annotatedMember, javaType));
        } catch (IllegalArgumentException e2) {
            InvalidDefinitionException b2 = InvalidDefinitionException.b(null, C9537rU.d((Throwable) e2), javaType);
            b2.initCause(e2);
            throw b2;
        }
    }

    public AbstractC9543ra e(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) {
        InterfaceC9489qZ<?> d = deserializationConfig.h().d(deserializationConfig, annotatedMember, javaType);
        JavaType j = javaType.j();
        if (d == null) {
            return b(deserializationConfig, j);
        }
        return d.b(deserializationConfig, j, deserializationConfig.z().e(deserializationConfig, annotatedMember, j));
    }

    public AbstractC9452pp<?> d(DeserializationContext deserializationContext, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        JavaType javaType2;
        JavaType javaType3;
        Class<?> h2 = javaType.h();
        if (h2 == g || h2 == h) {
            DeserializationConfig c2 = deserializationContext.c();
            if (this.d.c()) {
                javaType2 = e(c2, List.class);
                javaType3 = e(c2, Map.class);
            } else {
                javaType2 = null;
                javaType3 = null;
            }
            return new UntypedObjectDeserializer(javaType2, javaType3);
        } else if (h2 == i || h2 == b) {
            return StringDeserializer.e;
        } else {
            Class<?> cls = e;
            if (h2 == cls) {
                TypeFactory e2 = deserializationContext.e();
                JavaType[] b2 = e2.b(javaType, cls);
                return d(deserializationContext, e2.e(Collection.class, (b2 == null || b2.length != 1) ? TypeFactory.b() : b2[0]), abstractC9445pi);
            } else if (h2 == f) {
                JavaType a = javaType.a(0);
                JavaType a2 = javaType.a(1);
                AbstractC9543ra abstractC9543ra = (AbstractC9543ra) a2.m();
                if (abstractC9543ra == null) {
                    abstractC9543ra = b(deserializationContext.c(), a2);
                }
                return new MapEntryDeserializer(javaType, (AbstractC9450pn) a.l(), (AbstractC9452pp) a2.l(), abstractC9543ra);
            } else {
                String name = h2.getName();
                if (h2.isPrimitive() || name.startsWith("java.")) {
                    AbstractC9452pp<?> c3 = NumberDeserializers.c(h2, name);
                    if (c3 == null) {
                        c3 = DateDeserializers.c(h2, name);
                    }
                    if (c3 != null) {
                        return c3;
                    }
                }
                if (h2 == C9542rZ.class) {
                    return new TokenBufferDeserializer();
                }
                AbstractC9452pp<?> c4 = c(deserializationContext, javaType, abstractC9445pi);
                return c4 != null ? c4 : C9495qf.c(h2, name);
            }
        }
    }

    protected JavaType e(DeserializationConfig deserializationConfig, Class<?> cls) {
        JavaType c2 = c(deserializationConfig, deserializationConfig.b(cls));
        if (c2 == null || c2.d(cls)) {
            return null;
        }
        return c2;
    }

    protected AbstractC9452pp<?> c(Class<? extends AbstractC9454pr> cls, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi) {
        for (InterfaceC9427pQ interfaceC9427pQ : this.d.a()) {
            AbstractC9452pp<?> b2 = interfaceC9427pQ.b(cls, deserializationConfig, abstractC9445pi);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    protected AbstractC9452pp<?> a(ReferenceType referenceType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        for (InterfaceC9427pQ interfaceC9427pQ : this.d.a()) {
            AbstractC9452pp<?> b2 = interfaceC9427pQ.b(referenceType, deserializationConfig, abstractC9445pi, abstractC9543ra, abstractC9452pp);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9452pp<Object> d(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi) {
        for (InterfaceC9427pQ interfaceC9427pQ : this.d.a()) {
            AbstractC9452pp<?> e2 = interfaceC9427pQ.e(javaType, deserializationConfig, abstractC9445pi);
            if (e2 != null) {
                return e2;
            }
        }
        return null;
    }

    protected AbstractC9452pp<?> e(ArrayType arrayType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        for (InterfaceC9427pQ interfaceC9427pQ : this.d.a()) {
            AbstractC9452pp<?> d = interfaceC9427pQ.d(arrayType, deserializationConfig, abstractC9445pi, abstractC9543ra, abstractC9452pp);
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    protected AbstractC9452pp<?> e(CollectionType collectionType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        for (InterfaceC9427pQ interfaceC9427pQ : this.d.a()) {
            AbstractC9452pp<?> c2 = interfaceC9427pQ.c(collectionType, deserializationConfig, abstractC9445pi, abstractC9543ra, abstractC9452pp);
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }

    protected AbstractC9452pp<?> e(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        for (InterfaceC9427pQ interfaceC9427pQ : this.d.a()) {
            AbstractC9452pp<?> d = interfaceC9427pQ.d(collectionLikeType, deserializationConfig, abstractC9445pi, abstractC9543ra, abstractC9452pp);
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    protected AbstractC9452pp<?> b(Class<?> cls, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi) {
        for (InterfaceC9427pQ interfaceC9427pQ : this.d.a()) {
            AbstractC9452pp<?> a = interfaceC9427pQ.a(cls, deserializationConfig, abstractC9445pi);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    protected AbstractC9452pp<?> c(MapType mapType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9450pn abstractC9450pn, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        for (InterfaceC9427pQ interfaceC9427pQ : this.d.a()) {
            AbstractC9452pp<?> d = interfaceC9427pQ.d(mapType, deserializationConfig, abstractC9445pi, abstractC9450pn, abstractC9543ra, abstractC9452pp);
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    protected AbstractC9452pp<?> d(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi, AbstractC9450pn abstractC9450pn, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        for (InterfaceC9427pQ interfaceC9427pQ : this.d.a()) {
            AbstractC9452pp<?> c2 = interfaceC9427pQ.c(mapLikeType, deserializationConfig, abstractC9445pi, abstractC9450pn, abstractC9543ra, abstractC9452pp);
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9452pp<Object> c(DeserializationContext deserializationContext, AbstractC9509qt abstractC9509qt) {
        Object b2;
        AnnotationIntrospector f2 = deserializationContext.f();
        if (f2 == null || (b2 = f2.b(abstractC9509qt)) == null) {
            return null;
        }
        return deserializationContext.d(abstractC9509qt, b2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9450pn b(DeserializationContext deserializationContext, AbstractC9509qt abstractC9509qt) {
        Object j;
        AnnotationIntrospector f2 = deserializationContext.f();
        if (f2 == null || (j = f2.j(abstractC9509qt)) == null) {
            return null;
        }
        return deserializationContext.e(abstractC9509qt, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9452pp<Object> d(DeserializationContext deserializationContext, AbstractC9509qt abstractC9509qt) {
        Object d;
        AnnotationIntrospector f2 = deserializationContext.f();
        if (f2 == null || (d = f2.d(abstractC9509qt)) == null) {
            return null;
        }
        return deserializationContext.d(abstractC9509qt, d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JavaType e(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) {
        AbstractC9450pn e2;
        AnnotationIntrospector f2 = deserializationContext.f();
        if (f2 == null) {
            return javaType;
        }
        if (javaType.B() && javaType.f() != null && (e2 = deserializationContext.e(annotatedMember, f2.j((AbstractC9509qt) annotatedMember))) != null) {
            javaType = ((MapLikeType) javaType).g(e2);
            javaType.f();
        }
        if (javaType.k()) {
            AbstractC9452pp<Object> d = deserializationContext.d(annotatedMember, f2.d((AbstractC9509qt) annotatedMember));
            if (d != null) {
                javaType = javaType.c(d);
            }
            AbstractC9543ra e3 = e(deserializationContext.c(), javaType, annotatedMember);
            if (e3 != null) {
                javaType = javaType.d(e3);
            }
        }
        AbstractC9543ra c2 = c(deserializationContext.c(), javaType, annotatedMember);
        if (c2 != null) {
            javaType = javaType.b(c2);
        }
        return f2.e(deserializationContext.c(), annotatedMember, javaType);
    }

    protected EnumResolver c(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember != null) {
            if (deserializationConfig.f()) {
                C9537rU.b(annotatedMember.h(), deserializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return EnumResolver.c(cls, annotatedMember, deserializationConfig.h());
        }
        return EnumResolver.d(cls, deserializationConfig.h());
    }

    protected boolean e(DeserializationContext deserializationContext, AbstractC9509qt abstractC9509qt) {
        JsonCreator.Mode d;
        AnnotationIntrospector f2 = deserializationContext.f();
        return (f2 == null || (d = f2.d(deserializationContext.c(), abstractC9509qt)) == null || d == JsonCreator.Mode.DISABLED) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class c {
        static final HashMap<String, Class<? extends Collection>> b;
        static final HashMap<String, Class<? extends Map>> c;

        protected c() {
        }

        static {
            HashMap<String, Class<? extends Collection>> hashMap = new HashMap<>();
            hashMap.put(Collection.class.getName(), ArrayList.class);
            hashMap.put(List.class.getName(), ArrayList.class);
            hashMap.put(Set.class.getName(), HashSet.class);
            hashMap.put(SortedSet.class.getName(), TreeSet.class);
            hashMap.put(Queue.class.getName(), LinkedList.class);
            hashMap.put(AbstractList.class.getName(), ArrayList.class);
            hashMap.put(AbstractSet.class.getName(), HashSet.class);
            hashMap.put(Deque.class.getName(), LinkedList.class);
            hashMap.put(NavigableSet.class.getName(), TreeSet.class);
            b = hashMap;
            HashMap<String, Class<? extends Map>> hashMap2 = new HashMap<>();
            hashMap2.put(Map.class.getName(), LinkedHashMap.class);
            hashMap2.put(AbstractMap.class.getName(), LinkedHashMap.class);
            hashMap2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            hashMap2.put(SortedMap.class.getName(), TreeMap.class);
            hashMap2.put(NavigableMap.class.getName(), TreeMap.class);
            hashMap2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            c = hashMap2;
        }

        public static Class<?> b(JavaType javaType) {
            return b.get(javaType.h().getName());
        }

        public static Class<?> a(JavaType javaType) {
            return c.get(javaType.h().getName());
        }
    }
}
