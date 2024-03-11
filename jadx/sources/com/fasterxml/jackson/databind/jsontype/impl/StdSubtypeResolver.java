package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC9546rd;
import o.C9508qs;
import o.C9510qu;

/* loaded from: classes5.dex */
public class StdSubtypeResolver extends AbstractC9546rd implements Serializable {
    private static final long serialVersionUID = 1;
    protected LinkedHashSet<NamedType> e;

    @Override // o.AbstractC9546rd
    public void e(NamedType... namedTypeArr) {
        if (this.e == null) {
            this.e = new LinkedHashSet<>();
        }
        for (NamedType namedType : namedTypeArr) {
            this.e.add(namedType);
        }
    }

    @Override // o.AbstractC9546rd
    public void e(Class<?>... clsArr) {
        NamedType[] namedTypeArr = new NamedType[clsArr.length];
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            namedTypeArr[i] = new NamedType(clsArr[i]);
        }
        e(namedTypeArr);
    }

    @Override // o.AbstractC9546rd
    public void c(Collection<Class<?>> collection) {
        NamedType[] namedTypeArr = new NamedType[collection.size()];
        int i = 0;
        for (Class<?> cls : collection) {
            namedTypeArr[i] = new NamedType(cls);
            i++;
        }
        e(namedTypeArr);
    }

    @Override // o.AbstractC9546rd
    public Collection<NamedType> d(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        List<NamedType> z;
        AnnotationIntrospector h = mapperConfig.h();
        Class<?> e = javaType == null ? annotatedMember.e() : javaType.h();
        HashMap<NamedType, NamedType> hashMap = new HashMap<>();
        LinkedHashSet<NamedType> linkedHashSet = this.e;
        if (linkedHashSet != null) {
            Iterator<NamedType> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (e.isAssignableFrom(next.b())) {
                    a(C9510qu.e(mapperConfig, next.b()), next, mapperConfig, h, hashMap);
                }
            }
        }
        if (annotatedMember != null && (z = h.z(annotatedMember)) != null) {
            for (NamedType namedType : z) {
                a(C9510qu.e(mapperConfig, namedType.b()), namedType, mapperConfig, h, hashMap);
            }
        }
        a(C9510qu.e(mapperConfig, e), new NamedType(e, null), mapperConfig, h, hashMap);
        return new ArrayList(hashMap.values());
    }

    @Override // o.AbstractC9546rd
    public Collection<NamedType> d(MapperConfig<?> mapperConfig, C9508qs c9508qs) {
        AnnotationIntrospector h = mapperConfig.h();
        HashMap<NamedType, NamedType> hashMap = new HashMap<>();
        if (this.e != null) {
            Class<?> e = c9508qs.e();
            Iterator<NamedType> it = this.e.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (e.isAssignableFrom(next.b())) {
                    a(C9510qu.e(mapperConfig, next.b()), next, mapperConfig, h, hashMap);
                }
            }
        }
        a(c9508qs, new NamedType(c9508qs.e(), null), mapperConfig, h, hashMap);
        return new ArrayList(hashMap.values());
    }

    @Override // o.AbstractC9546rd
    public Collection<NamedType> e(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        List<NamedType> z;
        AnnotationIntrospector h = mapperConfig.h();
        Class<?> h2 = javaType.h();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(C9510qu.e(mapperConfig, h2), new NamedType(h2, null), mapperConfig, hashSet, linkedHashMap);
        if (annotatedMember != null && (z = h.z(annotatedMember)) != null) {
            for (NamedType namedType : z) {
                e(C9510qu.e(mapperConfig, namedType.b()), namedType, mapperConfig, hashSet, linkedHashMap);
            }
        }
        LinkedHashSet<NamedType> linkedHashSet = this.e;
        if (linkedHashSet != null) {
            Iterator<NamedType> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (h2.isAssignableFrom(next.b())) {
                    e(C9510qu.e(mapperConfig, next.b()), next, mapperConfig, hashSet, linkedHashMap);
                }
            }
        }
        return c(h2, hashSet, linkedHashMap);
    }

    @Override // o.AbstractC9546rd
    public Collection<NamedType> e(MapperConfig<?> mapperConfig, C9508qs c9508qs) {
        Class<?> e = c9508qs.e();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(c9508qs, new NamedType(e, null), mapperConfig, hashSet, linkedHashMap);
        LinkedHashSet<NamedType> linkedHashSet = this.e;
        if (linkedHashSet != null) {
            Iterator<NamedType> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (e.isAssignableFrom(next.b())) {
                    e(C9510qu.e(mapperConfig, next.b()), next, mapperConfig, hashSet, linkedHashMap);
                }
            }
        }
        return c(e, hashSet, linkedHashMap);
    }

    protected void a(C9508qs c9508qs, NamedType namedType, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, HashMap<NamedType, NamedType> hashMap) {
        String g;
        if (!namedType.c() && (g = annotationIntrospector.g(c9508qs)) != null) {
            namedType = new NamedType(namedType.b(), g);
        }
        if (hashMap.containsKey(namedType)) {
            if (!namedType.c() || hashMap.get(namedType).c()) {
                return;
            }
            hashMap.put(namedType, namedType);
            return;
        }
        hashMap.put(namedType, namedType);
        List<NamedType> z = annotationIntrospector.z(c9508qs);
        if (z == null || z.isEmpty()) {
            return;
        }
        for (NamedType namedType2 : z) {
            a(C9510qu.e(mapperConfig, namedType2.b()), namedType2, mapperConfig, annotationIntrospector, hashMap);
        }
    }

    protected void e(C9508qs c9508qs, NamedType namedType, MapperConfig<?> mapperConfig, Set<Class<?>> set, Map<String, NamedType> map) {
        List<NamedType> z;
        String g;
        AnnotationIntrospector h = mapperConfig.h();
        if (!namedType.c() && (g = h.g(c9508qs)) != null) {
            namedType = new NamedType(namedType.b(), g);
        }
        if (namedType.c()) {
            map.put(namedType.d(), namedType);
        }
        if (!set.add(namedType.b()) || (z = h.z(c9508qs)) == null || z.isEmpty()) {
            return;
        }
        for (NamedType namedType2 : z) {
            e(C9510qu.e(mapperConfig, namedType2.b()), namedType2, mapperConfig, set, map);
        }
    }

    protected Collection<NamedType> c(Class<?> cls, Set<Class<?>> set, Map<String, NamedType> map) {
        ArrayList arrayList = new ArrayList(map.values());
        for (NamedType namedType : map.values()) {
            set.remove(namedType.b());
        }
        for (Class<?> cls2 : set) {
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new NamedType(cls2));
            }
        }
        return arrayList;
    }
}
