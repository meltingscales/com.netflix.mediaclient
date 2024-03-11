package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* renamed from: o.qC  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C9466qC {
    protected final AnnotationIntrospector c;
    protected static final C9513qx[] e = new C9513qx[0];
    protected static final Annotation[] a = new Annotation[0];

    /* JADX INFO: Access modifiers changed from: protected */
    public C9466qC(AnnotationIntrospector annotationIntrospector) {
        this.c = annotationIntrospector;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AnnotationCollector a(Annotation[] annotationArr) {
        AnnotationCollector d = AnnotationCollector.d();
        for (Annotation annotation : annotationArr) {
            d = d.d(annotation);
            if (this.c.c(annotation)) {
                d = b(d, annotation);
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AnnotationCollector c(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.d(annotation);
            if (this.c.c(annotation)) {
                annotationCollector = b(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    protected final AnnotationCollector b(AnnotationCollector annotationCollector, Annotation annotation) {
        Annotation[] a2;
        for (Annotation annotation2 : C9537rU.a((Class<?>) annotation.annotationType())) {
            if (!b(annotation2)) {
                if (this.c.c(annotation2)) {
                    if (!annotationCollector.e(annotation2)) {
                        annotationCollector = b(annotationCollector.d(annotation2), annotation2);
                    }
                } else {
                    annotationCollector = annotationCollector.d(annotation2);
                }
            }
        }
        return annotationCollector;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AnnotationCollector a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.e(annotation)) {
                annotationCollector = annotationCollector.d(annotation);
                if (this.c.c(annotation)) {
                    annotationCollector = c(annotationCollector, annotation);
                }
            }
        }
        return annotationCollector;
    }

    protected final AnnotationCollector c(AnnotationCollector annotationCollector, Annotation annotation) {
        Annotation[] a2;
        for (Annotation annotation2 : C9537rU.a((Class<?>) annotation.annotationType())) {
            if (!b(annotation2) && !annotationCollector.e(annotation2)) {
                annotationCollector = annotationCollector.d(annotation2);
                if (this.c.c(annotation2)) {
                    annotationCollector = b(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    protected static final boolean b(Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C9513qx d() {
        return new C9513qx();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C9513qx[] e(int i) {
        if (i == 0) {
            return e;
        }
        C9513qx[] c9513qxArr = new C9513qx[i];
        for (int i2 = 0; i2 < i; i2++) {
            c9513qxArr[i2] = d();
        }
        return c9513qxArr;
    }
}
