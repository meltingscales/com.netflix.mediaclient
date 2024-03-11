package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;
import o.AbstractC9464qA;

/* renamed from: o.qz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9515qz extends C9466qC {
    private final AbstractC9464qA.c d;

    C9515qz(AnnotationIntrospector annotationIntrospector, AbstractC9464qA.c cVar) {
        super(annotationIntrospector);
        this.d = annotationIntrospector == null ? null : cVar;
    }

    public static C9512qw a(AnnotationIntrospector annotationIntrospector, InterfaceC9470qG interfaceC9470qG, AbstractC9464qA.c cVar, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls) {
        return new C9515qz(annotationIntrospector, cVar).b(typeFactory, interfaceC9470qG, javaType, list, cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    o.C9512qw b(com.fasterxml.jackson.databind.type.TypeFactory r5, o.InterfaceC9470qG r6, com.fasterxml.jackson.databind.JavaType r7, java.util.List<com.fasterxml.jackson.databind.JavaType> r8, java.lang.Class<?> r9) {
        /*
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class r1 = r7.h()
            r4.b(r6, r1, r0, r9)
            java.util.Iterator r8 = r8.iterator()
        L10:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L3b
            java.lang.Object r9 = r8.next()
            com.fasterxml.jackson.databind.JavaType r9 = (com.fasterxml.jackson.databind.JavaType) r9
            o.qA$c r1 = r4.d
            if (r1 != 0) goto L22
            r1 = 0
            goto L2a
        L22:
            java.lang.Class r2 = r9.h()
            java.lang.Class r1 = r1.i(r2)
        L2a:
            o.qG$e r2 = new o.qG$e
            com.fasterxml.jackson.databind.type.TypeBindings r3 = r9.a()
            r2.<init>(r5, r3)
            java.lang.Class r9 = r9.h()
            r4.b(r2, r9, r0, r1)
            goto L10
        L3b:
            o.qA$c r5 = r4.d
            if (r5 == 0) goto La9
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.Class r5 = r5.i(r8)
            if (r5 == 0) goto La9
            java.lang.Class r7 = r7.h()
            r4.c(r6, r7, r0, r5)
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r4.c
            if (r5 == 0) goto La9
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto La9
            java.util.Set r5 = r0.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L60:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La9
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            o.qD r7 = (o.C9467qD) r7
            java.lang.String r8 = "hashCode"
            java.lang.String r9 = r7.d()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L60
            int r8 = r7.b()
            if (r8 == 0) goto L85
            goto L60
        L85:
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.String r7 = r7.d()     // Catch: java.lang.Exception -> L60
            r9 = 0
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L60
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r7, r9)     // Catch: java.lang.Exception -> L60
            if (r7 == 0) goto L60
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L60
            o.qz$e r6 = (o.C9515qz.e) r6     // Catch: java.lang.Exception -> L60
            com.fasterxml.jackson.databind.introspect.AnnotationCollector r8 = r6.e     // Catch: java.lang.Exception -> L60
            java.lang.annotation.Annotation[] r9 = r7.getDeclaredAnnotations()     // Catch: java.lang.Exception -> L60
            com.fasterxml.jackson.databind.introspect.AnnotationCollector r8 = r4.a(r8, r9)     // Catch: java.lang.Exception -> L60
            r6.e = r8     // Catch: java.lang.Exception -> L60
            r6.b = r7     // Catch: java.lang.Exception -> L60
            goto L60
        La9:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto Lb5
            o.qw r5 = new o.qw
            r5.<init>()
            return r5
        Lb5:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r6 = r0.size()
            r5.<init>(r6)
            java.util.Set r6 = r0.entrySet()
            java.util.Iterator r6 = r6.iterator()
        Lc6:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Le6
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getValue()
            o.qz$e r8 = (o.C9515qz.e) r8
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r8 = r8.c()
            if (r8 == 0) goto Lc6
            java.lang.Object r7 = r7.getKey()
            r5.put(r7, r8)
            goto Lc6
        Le6:
            o.qw r6 = new o.qw
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9515qz.b(com.fasterxml.jackson.databind.type.TypeFactory, o.qG, com.fasterxml.jackson.databind.JavaType, java.util.List, java.lang.Class):o.qw");
    }

    private void b(InterfaceC9470qG interfaceC9470qG, Class<?> cls, Map<C9467qD, e> map, Class<?> cls2) {
        Method[] e2;
        AnnotationCollector a;
        if (cls2 != null) {
            c(interfaceC9470qG, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : C9537rU.e(cls)) {
            if (b(method)) {
                C9467qD c9467qD = new C9467qD(method);
                e eVar = map.get(c9467qD);
                if (eVar == null) {
                    if (this.c == null) {
                        a = AnnotationCollector.d();
                    } else {
                        a = a(method.getDeclaredAnnotations());
                    }
                    map.put(c9467qD, new e(interfaceC9470qG, method, a));
                } else {
                    if (this.c != null) {
                        eVar.e = a(eVar.e, method.getDeclaredAnnotations());
                    }
                    Method method2 = eVar.b;
                    if (method2 == null) {
                        eVar.b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        eVar.b = method;
                        eVar.a = interfaceC9470qG;
                    }
                }
            }
        }
    }

    protected void c(InterfaceC9470qG interfaceC9470qG, Class<?> cls, Map<C9467qD, e> map, Class<?> cls2) {
        Method[] j;
        if (this.c == null) {
            return;
        }
        for (Class<?> cls3 : C9537rU.c(cls2, cls, true)) {
            for (Method method : C9537rU.j(cls3)) {
                if (b(method)) {
                    C9467qD c9467qD = new C9467qD(method);
                    e eVar = map.get(c9467qD);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (eVar == null) {
                        map.put(c9467qD, new e(interfaceC9470qG, null, a(declaredAnnotations)));
                    } else {
                        eVar.e = a(eVar.e, declaredAnnotations);
                    }
                }
            }
        }
    }

    private boolean b(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.qz$e */
    /* loaded from: classes5.dex */
    public static final class e {
        public InterfaceC9470qG a;
        public Method b;
        public AnnotationCollector e;

        public e(InterfaceC9470qG interfaceC9470qG, Method method, AnnotationCollector annotationCollector) {
            this.a = interfaceC9470qG;
            this.b = method;
            this.e = annotationCollector;
        }

        public AnnotatedMethod c() {
            Method method = this.b;
            if (method == null) {
                return null;
            }
            return new AnnotatedMethod(this.a, method, this.e.a(), null);
        }
    }
}
