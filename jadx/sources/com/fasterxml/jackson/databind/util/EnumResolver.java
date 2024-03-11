package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class EnumResolver implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Enum<?> a;
    protected final Enum<?>[] b;
    protected final HashMap<String, Enum<?>> c;
    protected final Class<Enum<?>> d;

    public Enum<?>[] a() {
        return this.b;
    }

    public Enum<?> d() {
        return this.a;
    }

    public Class<Enum<?>> e() {
        return this.d;
    }

    protected EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap, Enum<?> r4) {
        this.d = cls;
        this.b = enumArr;
        this.c = hashMap;
        this.a = r4;
    }

    public static EnumResolver a(Class<Enum<?>> cls, AnnotationIntrospector annotationIntrospector) {
        Enum<?>[] enumConstants = cls.getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("No enum constants for class " + cls.getName());
        }
        String[] b = annotationIntrospector.b(cls, enumConstants, new String[enumConstants.length]);
        HashMap hashMap = new HashMap();
        int length = enumConstants.length;
        for (int i = 0; i < length; i++) {
            String str = b[i];
            if (str == null) {
                str = enumConstants[i].name();
            }
            hashMap.put(str, enumConstants[i]);
        }
        return new EnumResolver(cls, enumConstants, hashMap, annotationIntrospector.a(cls));
    }

    public static EnumResolver b(Class<Enum<?>> cls, AnnotationIntrospector annotationIntrospector) {
        Enum<?>[] enumConstants = cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        int length = enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r3 = enumConstants[length];
            hashMap.put(r3.toString(), r3);
        }
        return new EnumResolver(cls, enumConstants, hashMap, annotationIntrospector == null ? null : annotationIntrospector.a(cls));
    }

    public static EnumResolver b(Class<Enum<?>> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector) {
        Enum<?>[] enumConstants = cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        int length = enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r3 = enumConstants[length];
            try {
                Object d = annotatedMember.d(r3);
                if (d != null) {
                    hashMap.put(d.toString(), r3);
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + r3 + ": " + e.getMessage());
            }
        }
        return new EnumResolver(cls, enumConstants, hashMap, annotationIntrospector != null ? annotationIntrospector.a(cls) : null);
    }

    public static EnumResolver d(Class<?> cls, AnnotationIntrospector annotationIntrospector) {
        return a(cls, annotationIntrospector);
    }

    public static EnumResolver c(Class<?> cls, AnnotationIntrospector annotationIntrospector) {
        return b(cls, annotationIntrospector);
    }

    public static EnumResolver c(Class<?> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector) {
        return b(cls, annotatedMember, annotationIntrospector);
    }

    public CompactStringObjectMap b() {
        return CompactStringObjectMap.a(this.c);
    }

    public Enum<?> d(String str) {
        return this.c.get(str);
    }

    public Collection<String> c() {
        return this.c.keySet();
    }
}
