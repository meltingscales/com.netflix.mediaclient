package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.C9513qx;
import o.InterfaceC9532rP;

/* loaded from: classes5.dex */
public abstract class AnnotationCollector {
    protected static final InterfaceC9532rP b = new NoAnnotations();
    protected final Object d;

    public static InterfaceC9532rP e() {
        return b;
    }

    public abstract C9513qx a();

    public abstract InterfaceC9532rP c();

    public abstract AnnotationCollector d(Annotation annotation);

    public abstract boolean e(Annotation annotation);

    protected AnnotationCollector(Object obj) {
        this.d = obj;
    }

    public static AnnotationCollector d() {
        return c.a;
    }

    /* loaded from: classes5.dex */
    static class c extends AnnotationCollector {
        public static final c a = new c(null);

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public InterfaceC9532rP c() {
            return AnnotationCollector.b;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean e(Annotation annotation) {
            return false;
        }

        c(Object obj) {
            super(obj);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public C9513qx a() {
            return new C9513qx();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector d(Annotation annotation) {
            return new e(this.d, annotation.annotationType(), annotation);
        }
    }

    /* loaded from: classes5.dex */
    static class e extends AnnotationCollector {
        private Annotation a;
        private Class<?> e;

        public e(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.e = cls;
            this.a = annotation;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public InterfaceC9532rP c() {
            return new OneAnnotation(this.e, this.a);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public C9513qx a() {
            return C9513qx.c(this.e, this.a);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean e(Annotation annotation) {
            return annotation.annotationType() == this.e;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector d(Annotation annotation) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            Class<?> cls = this.e;
            if (cls == annotationType) {
                this.a = annotation;
                return this;
            }
            return new b(this.d, cls, this.a, annotationType, annotation);
        }
    }

    /* loaded from: classes5.dex */
    static class b extends AnnotationCollector {
        protected final HashMap<Class<?>, Annotation> c;

        public b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> hashMap = new HashMap<>();
            this.c = hashMap;
            hashMap.put(cls, annotation);
            hashMap.put(cls2, annotation2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public InterfaceC9532rP c() {
            if (this.c.size() == 2) {
                Iterator<Map.Entry<Class<?>, Annotation>> it = this.c.entrySet().iterator();
                Map.Entry<Class<?>, Annotation> next = it.next();
                Map.Entry<Class<?>, Annotation> next2 = it.next();
                return new TwoAnnotations(next.getKey(), next.getValue(), next2.getKey(), next2.getValue());
            }
            return new C9513qx(this.c);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public C9513qx a() {
            C9513qx c9513qx = new C9513qx();
            for (Annotation annotation : this.c.values()) {
                c9513qx.e(annotation);
            }
            return c9513qx;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean e(Annotation annotation) {
            return this.c.containsKey(annotation.annotationType());
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector d(Annotation annotation) {
            this.c.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public static class NoAnnotations implements InterfaceC9532rP, Serializable {
        private static final long serialVersionUID = 1;

        @Override // o.InterfaceC9532rP
        public boolean a(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        @Override // o.InterfaceC9532rP
        public boolean b(Class<?> cls) {
            return false;
        }

        @Override // o.InterfaceC9532rP
        public int c() {
            return 0;
        }

        @Override // o.InterfaceC9532rP
        public <A extends Annotation> A e(Class<A> cls) {
            return null;
        }

        NoAnnotations() {
        }
    }

    /* loaded from: classes5.dex */
    public static class OneAnnotation implements InterfaceC9532rP, Serializable {
        private static final long serialVersionUID = 1;
        private final Annotation b;
        private final Class<?> d;

        @Override // o.InterfaceC9532rP
        public boolean b(Class<?> cls) {
            return this.d == cls;
        }

        @Override // o.InterfaceC9532rP
        public int c() {
            return 1;
        }

        @Override // o.InterfaceC9532rP
        public <A extends Annotation> A e(Class<A> cls) {
            if (this.d == cls) {
                return (A) this.b;
            }
            return null;
        }

        public OneAnnotation(Class<?> cls, Annotation annotation) {
            this.d = cls;
            this.b = annotation;
        }

        @Override // o.InterfaceC9532rP
        public boolean a(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this.d) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public static class TwoAnnotations implements InterfaceC9532rP, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> a;
        private final Annotation b;
        private final Class<?> c;
        private final Annotation e;

        @Override // o.InterfaceC9532rP
        public boolean b(Class<?> cls) {
            return this.c == cls || this.a == cls;
        }

        @Override // o.InterfaceC9532rP
        public int c() {
            return 2;
        }

        @Override // o.InterfaceC9532rP
        public <A extends Annotation> A e(Class<A> cls) {
            if (this.c == cls) {
                return (A) this.e;
            }
            if (this.a == cls) {
                return (A) this.b;
            }
            return null;
        }

        public TwoAnnotations(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this.c = cls;
            this.e = annotation;
            this.a = cls2;
            this.b = annotation2;
        }

        @Override // o.InterfaceC9532rP
        public boolean a(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this.c || cls == this.a) {
                    return true;
                }
            }
            return false;
        }
    }
}
