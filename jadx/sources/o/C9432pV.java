package o;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

/* renamed from: o.pV  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9432pV {
    protected final AnnotationIntrospector b;
    protected final c[] c;
    protected final AnnotatedWithParams d;
    protected final int e;

    public AnnotatedWithParams b() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    protected C9432pV(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, c[] cVarArr, int i) {
        this.b = annotationIntrospector;
        this.d = annotatedWithParams;
        this.c = cVarArr;
        this.e = i;
    }

    public static C9432pV c(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, AbstractC9465qB[] abstractC9465qBArr) {
        int f = annotatedWithParams.f();
        c[] cVarArr = new c[f];
        for (int i = 0; i < f; i++) {
            AnnotatedParameter d = annotatedWithParams.d(i);
            cVarArr[i] = new c(d, abstractC9465qBArr == null ? null : abstractC9465qBArr[i], annotationIntrospector.d((AnnotatedMember) d));
        }
        return new C9432pV(annotationIntrospector, annotatedWithParams, cVarArr, f);
    }

    public JacksonInject.Value a(int i) {
        return this.c[i].c;
    }

    public AnnotatedParameter e(int i) {
        return this.c[i].a;
    }

    public AbstractC9465qB f(int i) {
        return this.c[i].e;
    }

    public PropertyName d(int i) {
        AbstractC9465qB abstractC9465qB = this.c[i].e;
        if (abstractC9465qB != null) {
            return abstractC9465qB.o();
        }
        return null;
    }

    public PropertyName b(int i) {
        AbstractC9465qB abstractC9465qB = this.c[i].e;
        if (abstractC9465qB == null || !abstractC9465qB.C()) {
            return null;
        }
        return abstractC9465qB.o();
    }

    public PropertyName c(int i) {
        String b = this.b.b((AnnotatedMember) this.c[i].a);
        if (b == null || b.isEmpty()) {
            return null;
        }
        return PropertyName.b(b);
    }

    public int e() {
        int i = -1;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (this.c[i2].c == null) {
                if (i >= 0) {
                    return -1;
                }
                i = i2;
            }
        }
        return i;
    }

    public String toString() {
        return this.d.toString();
    }

    /* renamed from: o.pV$c */
    /* loaded from: classes5.dex */
    public static final class c {
        public final AnnotatedParameter a;
        public final JacksonInject.Value c;
        public final AbstractC9465qB e;

        public c(AnnotatedParameter annotatedParameter, AbstractC9465qB abstractC9465qB, JacksonInject.Value value) {
            this.a = annotatedParameter;
            this.e = abstractC9465qB;
            this.c = value;
        }
    }
}
