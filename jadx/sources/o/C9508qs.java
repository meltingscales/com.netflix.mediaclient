package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import o.AbstractC9464qA;

/* renamed from: o.qs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9508qs extends AbstractC9509qt implements InterfaceC9470qG {
    private static final c m = new c(null, Collections.emptyList(), Collections.emptyList());
    protected final AnnotationIntrospector a;
    protected final Class<?> b;
    protected c c;
    protected final InterfaceC9532rP d;
    protected final TypeBindings e;
    protected transient Boolean f;
    protected final Class<?> g;
    protected final AbstractC9464qA.c h;
    protected C9512qw i;
    protected List<AnnotatedField> j;
    protected final List<JavaType> k;
    protected final TypeFactory l;

    /* renamed from: o  reason: collision with root package name */
    protected final JavaType f13899o;

    @Override // o.AbstractC9509qt
    public JavaType a() {
        return this.f13899o;
    }

    @Override // o.AbstractC9509qt
    public Class<?> e() {
        return this.b;
    }

    public InterfaceC9532rP f() {
        return this.d;
    }

    @Override // o.AbstractC9509qt
    /* renamed from: j */
    public Class<?> b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9508qs(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, InterfaceC9532rP interfaceC9532rP, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, AbstractC9464qA.c cVar, TypeFactory typeFactory) {
        this.f13899o = javaType;
        this.b = cls;
        this.k = list;
        this.g = cls2;
        this.d = interfaceC9532rP;
        this.e = typeBindings;
        this.a = annotationIntrospector;
        this.h = cVar;
        this.l = typeFactory;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9508qs(Class<?> cls) {
        this.f13899o = null;
        this.b = cls;
        this.k = Collections.emptyList();
        this.g = null;
        this.d = AnnotationCollector.e();
        this.e = TypeBindings.a();
        this.a = null;
        this.h = null;
        this.l = null;
    }

    @Override // o.InterfaceC9470qG
    public JavaType e(Type type) {
        return this.l.e(type, this.e);
    }

    @Override // o.AbstractC9509qt
    public String d() {
        return this.b.getName();
    }

    @Override // o.AbstractC9509qt
    public <A extends Annotation> A d(Class<A> cls) {
        return (A) this.d.e(cls);
    }

    @Override // o.AbstractC9509qt
    public boolean a(Class<?> cls) {
        return this.d.b(cls);
    }

    @Override // o.AbstractC9509qt
    public boolean a(Class<? extends Annotation>[] clsArr) {
        return this.d.a(clsArr);
    }

    public boolean n() {
        return this.d.c() > 0;
    }

    public AnnotatedConstructor i() {
        return l().e;
    }

    public List<AnnotatedConstructor> h() {
        return l().d;
    }

    public List<AnnotatedMethod> g() {
        return l().b;
    }

    public Iterable<AnnotatedMethod> o() {
        return p();
    }

    public AnnotatedMethod e(String str, Class<?>[] clsArr) {
        return p().c(str, clsArr);
    }

    public Iterable<AnnotatedField> c() {
        return m();
    }

    public boolean k() {
        Boolean bool = this.f;
        if (bool == null) {
            bool = Boolean.valueOf(C9537rU.r(this.b));
            this.f = bool;
        }
        return bool.booleanValue();
    }

    private final List<AnnotatedField> m() {
        List<AnnotatedField> list = this.j;
        if (list == null) {
            JavaType javaType = this.f13899o;
            if (javaType == null) {
                list = Collections.emptyList();
            } else {
                list = C9514qy.b(this.a, this, this.h, this.l, javaType);
            }
            this.j = list;
        }
        return list;
    }

    private final C9512qw p() {
        C9512qw c9512qw = this.i;
        if (c9512qw == null) {
            JavaType javaType = this.f13899o;
            if (javaType == null) {
                c9512qw = new C9512qw();
            } else {
                c9512qw = C9515qz.a(this.a, this, this.h, this.l, javaType, this.k, this.g);
            }
            this.i = c9512qw;
        }
        return c9512qw;
    }

    private final c l() {
        c cVar = this.c;
        if (cVar == null) {
            JavaType javaType = this.f13899o;
            cVar = javaType == null ? m : C9511qv.d(this.a, this, javaType, this.g);
            this.c = cVar;
        }
        return cVar;
    }

    @Override // o.AbstractC9509qt
    public String toString() {
        return "[AnnotedClass " + this.b.getName() + "]";
    }

    @Override // o.AbstractC9509qt
    public int hashCode() {
        return this.b.getName().hashCode();
    }

    @Override // o.AbstractC9509qt
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return C9537rU.c(obj, C9508qs.class) && ((C9508qs) obj).b == this.b;
    }

    /* renamed from: o.qs$c */
    /* loaded from: classes5.dex */
    public static final class c {
        public final List<AnnotatedMethod> b;
        public final List<AnnotatedConstructor> d;
        public final AnnotatedConstructor e;

        public c(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.e = annotatedConstructor;
            this.d = list;
            this.b = list2;
        }
    }
}
