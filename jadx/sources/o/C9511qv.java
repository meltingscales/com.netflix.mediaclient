package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C9508qs;
import o.C9537rU;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.qv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9511qv extends C9466qC {
    private AnnotatedConstructor b;
    private final InterfaceC9470qG d;

    C9511qv(AnnotationIntrospector annotationIntrospector, InterfaceC9470qG interfaceC9470qG) {
        super(annotationIntrospector);
        this.d = interfaceC9470qG;
    }

    public static C9508qs.c d(AnnotationIntrospector annotationIntrospector, InterfaceC9470qG interfaceC9470qG, JavaType javaType, Class<?> cls) {
        return new C9511qv(annotationIntrospector, interfaceC9470qG).e(javaType, cls);
    }

    C9508qs.c e(JavaType javaType, Class<?> cls) {
        List<AnnotatedConstructor> b = b(javaType, cls);
        List<AnnotatedMethod> c = c(javaType, cls);
        AnnotationIntrospector annotationIntrospector = this.c;
        if (annotationIntrospector != null) {
            AnnotatedConstructor annotatedConstructor = this.b;
            if (annotatedConstructor != null && annotationIntrospector.g((AnnotatedMember) annotatedConstructor)) {
                this.b = null;
            }
            int size = b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (this.c.g((AnnotatedMember) b.get(size))) {
                    b.remove(size);
                }
            }
            int size2 = c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (this.c.g((AnnotatedMember) c.get(size2))) {
                    c.remove(size2);
                }
            }
        }
        return new C9508qs.c(this.b, b, c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<AnnotatedConstructor> b(JavaType javaType, Class<?> cls) {
        C9537rU.a aVar;
        ArrayList arrayList;
        int size;
        List arrayList2;
        C9537rU.a[] i;
        C9537rU.a[] i2;
        if (javaType.u()) {
            aVar = null;
            arrayList = null;
        } else {
            aVar = null;
            arrayList = null;
            for (C9537rU.a aVar2 : C9537rU.i(javaType.h())) {
                if (c(aVar2.a())) {
                    if (aVar2.e() == 0) {
                        aVar = aVar2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(aVar2);
                    }
                }
            }
        }
        if (arrayList == null) {
            List emptyList = Collections.emptyList();
            if (aVar == null) {
                return emptyList;
            }
            arrayList2 = emptyList;
            size = 0;
        } else {
            size = arrayList.size();
            arrayList2 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(null);
            }
        }
        if (cls != null) {
            C9467qD[] c9467qDArr = null;
            for (C9537rU.a aVar3 : C9537rU.i(cls)) {
                if (aVar3.e() == 0) {
                    if (aVar != null) {
                        this.b = e(aVar, aVar3);
                        aVar = null;
                    }
                } else if (arrayList != null) {
                    if (c9467qDArr == null) {
                        c9467qDArr = new C9467qD[size];
                        for (int i4 = 0; i4 < size; i4++) {
                            c9467qDArr[i4] = new C9467qD(((C9537rU.a) arrayList.get(i4)).a());
                        }
                    }
                    C9467qD c9467qD = new C9467qD(aVar3.a());
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        } else if (c9467qD.equals(c9467qDArr[i5])) {
                            arrayList2.set(i5, c((C9537rU.a) arrayList.get(i5), aVar3));
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
        }
        if (aVar != null) {
            this.b = e(aVar, (C9537rU.a) null);
        }
        for (int i6 = 0; i6 < size; i6++) {
            if (((AnnotatedConstructor) arrayList2.get(i6)) == null) {
                arrayList2.set(i6, c((C9537rU.a) arrayList.get(i6), (C9537rU.a) null));
            }
        }
        return arrayList2;
    }

    private List<AnnotatedMethod> c(JavaType javaType, Class<?> cls) {
        Method[] e;
        Method[] j;
        ArrayList arrayList = null;
        for (Method method : C9537rU.e(javaType.h())) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        if (cls != null) {
            C9467qD[] c9467qDArr = null;
            for (Method method2 : C9537rU.j(cls)) {
                if (Modifier.isStatic(method2.getModifiers())) {
                    if (c9467qDArr == null) {
                        c9467qDArr = new C9467qD[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            c9467qDArr[i2] = new C9467qD((Method) arrayList.get(i2));
                        }
                    }
                    C9467qD c9467qD = new C9467qD(method2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        } else if (c9467qD.equals(c9467qDArr[i3])) {
                            arrayList2.set(i3, d((Method) arrayList.get(i3), method2));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (((AnnotatedMethod) arrayList2.get(i4)) == null) {
                arrayList2.set(i4, d((Method) arrayList.get(i4), null));
            }
        }
        return arrayList2;
    }

    protected AnnotatedConstructor e(C9537rU.a aVar, C9537rU.a aVar2) {
        if (this.c == null) {
            return new AnnotatedConstructor(this.d, aVar.a(), C9466qC.d(), C9466qC.e);
        }
        return new AnnotatedConstructor(this.d, aVar.a(), b(aVar, aVar2), C9466qC.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.databind.introspect.AnnotatedConstructor c(o.C9537rU.a r8, o.C9537rU.a r9) {
        /*
            r7 = this;
            int r0 = r8.e()
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r7.c
            if (r1 != 0) goto L1c
            o.qG r9 = r7.d
            java.lang.reflect.Constructor r8 = r8.a()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r1 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            o.qx r2 = o.C9466qC.d()
            o.qx[] r0 = o.C9466qC.e(r0)
            r1.<init>(r9, r8, r2, r0)
            return r1
        L1c:
            if (r0 != 0) goto L30
            o.qG r0 = r7.d
            java.lang.reflect.Constructor r1 = r8.a()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r2 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            o.qx r8 = r7.b(r8, r9)
            o.qx[] r9 = o.C9466qC.e
            r2.<init>(r0, r1, r8, r9)
            return r2
        L30:
            java.lang.annotation.Annotation[][] r1 = r8.b()
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L97
            java.lang.Class r2 = r8.d()
            boolean r4 = o.C9537rU.t(r2)
            r5 = 0
            if (r4 == 0) goto L57
            int r4 = r1.length
            r6 = 2
            int r4 = r4 + r6
            if (r0 != r4) goto L57
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r6, r4)
            o.qx[] r1 = r7.c(r2, r3)
        L54:
            r3 = r1
            r1 = r2
            goto L73
        L57:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L73
            int r2 = r1.length
            r4 = 1
            int r2 = r2 + r4
            if (r0 != r2) goto L73
            int r2 = r1.length
            int r2 = r2 + r4
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2]
            int r6 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r4, r6)
            java.lang.annotation.Annotation[] r1 = o.C9466qC.a
            r2[r5] = r1
            o.qx[] r1 = r7.c(r2, r3)
            goto L54
        L73:
            if (r3 == 0) goto L76
            goto La2
        L76:
            java.lang.Class r8 = r8.d()
            java.lang.String r8 = r8.getName()
            int r9 = r1.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0, r9}
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r8 = java.lang.String.format(r0, r8)
            r9.<init>(r8)
            throw r9
        L97:
            if (r9 != 0) goto L9a
            goto L9e
        L9a:
            java.lang.annotation.Annotation[][] r3 = r9.b()
        L9e:
            o.qx[] r3 = r7.c(r1, r3)
        La2:
            o.qG r0 = r7.d
            java.lang.reflect.Constructor r1 = r8.a()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r2 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            o.qx r8 = r7.b(r8, r9)
            r2.<init>(r0, r1, r8, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9511qv.c(o.rU$a, o.rU$a):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }

    protected AnnotatedMethod d(Method method, Method method2) {
        int length = method.getParameterTypes().length;
        if (this.c == null) {
            return new AnnotatedMethod(this.d, method, C9466qC.d(), C9466qC.e(length));
        }
        if (length == 0) {
            return new AnnotatedMethod(this.d, method, b(method, method2), C9466qC.e);
        }
        return new AnnotatedMethod(this.d, method, b(method, method2), c(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    private C9513qx[] c(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        int length = annotationArr.length;
        C9513qx[] c9513qxArr = new C9513qx[length];
        for (int i = 0; i < length; i++) {
            AnnotationCollector c = c(AnnotationCollector.d(), annotationArr[i]);
            if (annotationArr2 != null) {
                c = c(c, annotationArr2[i]);
            }
            c9513qxArr[i] = c.a();
        }
        return c9513qxArr;
    }

    private C9513qx b(C9537rU.a aVar, C9537rU.a aVar2) {
        AnnotationCollector a = a(aVar.a().getDeclaredAnnotations());
        if (aVar2 != null) {
            a = c(a, aVar2.a().getDeclaredAnnotations());
        }
        return a.a();
    }

    private final C9513qx b(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector a = a(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            a = c(a, annotatedElement2.getDeclaredAnnotations());
        }
        return a.a();
    }

    private static boolean c(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }
}
