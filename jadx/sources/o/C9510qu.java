package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import o.AbstractC9464qA;

/* renamed from: o.qu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9510qu {
    private static final InterfaceC9532rP b = AnnotationCollector.e();
    private final TypeBindings a;
    private final MapperConfig<?> c;
    private final AnnotationIntrospector d;
    private final Class<?> e;
    private final JavaType f;
    private final AbstractC9464qA.c h;
    private final Class<?> j;

    C9510qu(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC9464qA.c cVar) {
        this.c = mapperConfig;
        this.f = javaType;
        Class<?> h = javaType.h();
        this.e = h;
        this.h = cVar;
        this.a = javaType.a();
        this.d = mapperConfig.p() ? mapperConfig.h() : null;
        this.j = mapperConfig.i(h);
    }

    C9510qu(MapperConfig<?> mapperConfig, Class<?> cls, AbstractC9464qA.c cVar) {
        this.c = mapperConfig;
        this.f = null;
        this.e = cls;
        this.h = cVar;
        this.a = TypeBindings.a();
        if (mapperConfig == null) {
            this.d = null;
            this.j = null;
            return;
        }
        this.d = mapperConfig.p() ? mapperConfig.h() : null;
        this.j = mapperConfig.i(cls);
    }

    public static C9508qs d(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC9464qA.c cVar) {
        if (javaType.p() && d(mapperConfig, javaType.h())) {
            return b(mapperConfig, javaType.h());
        }
        return new C9510qu(mapperConfig, javaType, cVar).b();
    }

    public static C9508qs e(MapperConfig<?> mapperConfig, Class<?> cls) {
        return c(mapperConfig, cls, mapperConfig);
    }

    public static C9508qs c(MapperConfig<?> mapperConfig, Class<?> cls, AbstractC9464qA.c cVar) {
        if (cls.isArray() && d(mapperConfig, cls)) {
            return b(mapperConfig, cls);
        }
        return new C9510qu(mapperConfig, cls, cVar).d();
    }

    private static boolean d(MapperConfig<?> mapperConfig, Class<?> cls) {
        return mapperConfig == null || mapperConfig.i(cls) == null;
    }

    public static C9508qs e(Class<?> cls) {
        return new C9508qs(cls);
    }

    static C9508qs b(MapperConfig<?> mapperConfig, Class<?> cls) {
        return new C9508qs(cls);
    }

    C9508qs b() {
        List<JavaType> e = C9537rU.e(this.f, (Class<?>) null, false);
        return new C9508qs(this.f, this.e, e, this.j, d(e), this.a, this.d, this.h, this.c.t());
    }

    C9508qs d() {
        List<JavaType> emptyList = Collections.emptyList();
        Class<?> cls = this.e;
        Class<?> cls2 = this.j;
        InterfaceC9532rP d = d(emptyList);
        TypeBindings typeBindings = this.a;
        AnnotationIntrospector annotationIntrospector = this.d;
        MapperConfig<?> mapperConfig = this.c;
        return new C9508qs(null, cls, emptyList, cls2, d, typeBindings, annotationIntrospector, mapperConfig, mapperConfig.t());
    }

    private InterfaceC9532rP d(List<JavaType> list) {
        if (this.d == null) {
            return b;
        }
        AnnotationCollector d = AnnotationCollector.d();
        Class<?> cls = this.j;
        if (cls != null) {
            d = c(d, this.e, cls);
        }
        AnnotationCollector b2 = b(d, C9537rU.a(this.e));
        for (JavaType javaType : list) {
            if (this.h != null) {
                Class<?> h = javaType.h();
                b2 = c(b2, h, this.h.i(h));
            }
            b2 = b(b2, C9537rU.a(javaType.h()));
        }
        AbstractC9464qA.c cVar = this.h;
        if (cVar != null) {
            b2 = c(b2, Object.class, cVar.i(Object.class));
        }
        return b2.c();
    }

    private AnnotationCollector c(AnnotationCollector annotationCollector, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = b(annotationCollector, C9537rU.a(cls2));
            for (Class<?> cls3 : C9537rU.e(cls2, cls, false)) {
                annotationCollector = b(annotationCollector, C9537rU.a(cls3));
            }
        }
        return annotationCollector;
    }

    private AnnotationCollector b(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.e(annotation)) {
                    annotationCollector = annotationCollector.d(annotation);
                    if (this.d.c(annotation)) {
                        annotationCollector = a(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    private AnnotationCollector a(AnnotationCollector annotationCollector, Annotation annotation) {
        Annotation[] a;
        for (Annotation annotation2 : C9537rU.a((Class<?>) annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.e(annotation2)) {
                annotationCollector = annotationCollector.d(annotation2);
                if (this.d.c(annotation2)) {
                    annotationCollector = a(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }
}
