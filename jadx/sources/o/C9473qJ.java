package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.qJ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9473qJ extends AbstractC9465qB implements Comparable<C9473qJ> {
    private static final AnnotationIntrospector.ReferenceProperty m = AnnotationIntrospector.ReferenceProperty.d("");
    protected final MapperConfig<?> b;
    protected final AnnotationIntrospector c;
    protected c<AnnotatedField> d;
    protected c<AnnotatedParameter> e;
    protected transient PropertyMetadata f;
    protected final boolean g;
    protected c<AnnotatedMethod> h;
    protected final PropertyName i;
    protected final PropertyName j;
    protected c<AnnotatedMethod> k;

    /* renamed from: o  reason: collision with root package name */
    protected transient AnnotationIntrospector.ReferenceProperty f13898o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.qJ$e */
    /* loaded from: classes5.dex */
    public interface e<T> {
        T b(AnnotatedMember annotatedMember);
    }

    public boolean K() {
        return this.h != null;
    }

    public void N() {
        this.e = null;
    }

    @Override // o.AbstractC9465qB
    public boolean b() {
        return (this.h == null && this.d == null) ? false : true;
    }

    @Override // o.AbstractC9465qB
    public boolean e() {
        return (this.e == null && this.k == null && this.d == null) ? false : true;
    }

    @Override // o.AbstractC9465qB
    public PropertyName o() {
        return this.i;
    }

    @Override // o.AbstractC9465qB
    public boolean v() {
        return this.k != null;
    }

    @Override // o.AbstractC9465qB
    public boolean x() {
        return this.d != null;
    }

    @Override // o.AbstractC9465qB
    public boolean y() {
        return this.e != null;
    }

    public C9473qJ(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z, propertyName, propertyName);
    }

    protected C9473qJ(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this.b = mapperConfig;
        this.c = annotationIntrospector;
        this.j = propertyName;
        this.i = propertyName2;
        this.g = z;
    }

    protected C9473qJ(C9473qJ c9473qJ, PropertyName propertyName) {
        this.b = c9473qJ.b;
        this.c = c9473qJ.c;
        this.j = c9473qJ.j;
        this.i = propertyName;
        this.d = c9473qJ.d;
        this.e = c9473qJ.e;
        this.h = c9473qJ.h;
        this.k = c9473qJ.k;
        this.g = c9473qJ.g;
    }

    public C9473qJ b(PropertyName propertyName) {
        return new C9473qJ(this, propertyName);
    }

    public C9473qJ d(String str) {
        PropertyName c2 = this.i.c(str);
        return c2 == this.i ? this : new C9473qJ(this, c2);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C9473qJ c9473qJ) {
        if (this.e != null) {
            if (c9473qJ.e == null) {
                return -1;
            }
        } else if (c9473qJ.e != null) {
            return 1;
        }
        return a().compareTo(c9473qJ.a());
    }

    @Override // o.AbstractC9465qB, o.InterfaceC9539rW
    public String a() {
        PropertyName propertyName = this.i;
        if (propertyName == null) {
            return null;
        }
        return propertyName.c();
    }

    @Override // o.AbstractC9465qB
    public boolean e(PropertyName propertyName) {
        return this.i.equals(propertyName);
    }

    public String J() {
        return this.j.c();
    }

    @Override // o.AbstractC9465qB
    public PropertyName w() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember s = s();
        if (s == null || (annotationIntrospector = this.c) == null) {
            return null;
        }
        return annotationIntrospector.D(s);
    }

    @Override // o.AbstractC9465qB
    public boolean D() {
        return e(this.d) || e(this.h) || e(this.k) || a(this.e);
    }

    @Override // o.AbstractC9465qB
    public boolean C() {
        return a(this.d) || a(this.h) || a(this.k) || a(this.e);
    }

    @Override // o.AbstractC9465qB
    public PropertyMetadata n() {
        if (this.f == null) {
            Boolean H = H();
            String B = B();
            Integer I = I();
            String z = z();
            if (H == null && I == null && z == null) {
                PropertyMetadata propertyMetadata = PropertyMetadata.c;
                if (B != null) {
                    propertyMetadata = propertyMetadata.c(B);
                }
                this.f = propertyMetadata;
            } else {
                this.f = PropertyMetadata.b(H, B, I, z);
            }
            if (!this.g) {
                this.f = b(this.f);
            }
        }
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.databind.PropertyMetadata b(com.fasterxml.jackson.databind.PropertyMetadata r9) {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r8.s()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r1 = r8.h()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L7c
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r8.c
            r5 = 0
            if (r4 == 0) goto L39
            if (r1 == 0) goto L28
            java.lang.Boolean r4 = r4.i(r0)
            if (r4 == 0) goto L28
            boolean r2 = r4.booleanValue()
            if (r2 == 0) goto L27
            com.fasterxml.jackson.databind.PropertyMetadata$b r2 = com.fasterxml.jackson.databind.PropertyMetadata.b.a(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r9 = r9.b(r2)
        L27:
            r2 = r5
        L28:
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r8.c
            com.fasterxml.jackson.annotation.JsonSetter$Value r0 = r4.C(r0)
            if (r0 == 0) goto L39
            com.fasterxml.jackson.annotation.Nulls r3 = r0.a()
            com.fasterxml.jackson.annotation.Nulls r0 = r0.c()
            goto L3a
        L39:
            r0 = r3
        L3a:
            if (r2 != 0) goto L40
            if (r3 == 0) goto L40
            if (r0 != 0) goto L7d
        L40:
            java.lang.Class r4 = r8.p()
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r6 = r8.b
            o.pC r4 = r6.a(r4)
            com.fasterxml.jackson.annotation.JsonSetter$Value r6 = r4.h()
            if (r6 == 0) goto L5c
            if (r3 != 0) goto L56
            com.fasterxml.jackson.annotation.Nulls r3 = r6.a()
        L56:
            if (r0 != 0) goto L5c
            com.fasterxml.jackson.annotation.Nulls r0 = r6.c()
        L5c:
            r7 = r3
            r3 = r0
            r0 = r7
            if (r2 == 0) goto L78
            if (r1 == 0) goto L78
            java.lang.Boolean r4 = r4.g()
            if (r4 == 0) goto L78
            boolean r2 = r4.booleanValue()
            if (r2 == 0) goto L77
            com.fasterxml.jackson.databind.PropertyMetadata$b r2 = com.fasterxml.jackson.databind.PropertyMetadata.b.e(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r9 = r9.b(r2)
        L77:
            r2 = r5
        L78:
            r7 = r3
            r3 = r0
            r0 = r7
            goto L7d
        L7c:
            r0 = r3
        L7d:
            if (r2 != 0) goto L83
            if (r3 == 0) goto L83
            if (r0 != 0) goto Laf
        L83:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r4 = r8.b
            com.fasterxml.jackson.annotation.JsonSetter$Value r4 = r4.l()
            if (r3 != 0) goto L8f
            com.fasterxml.jackson.annotation.Nulls r3 = r4.a()
        L8f:
            if (r0 != 0) goto L95
            com.fasterxml.jackson.annotation.Nulls r0 = r4.c()
        L95:
            if (r2 == 0) goto Laf
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2 = r8.b
            java.lang.Boolean r2 = r2.k()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Laf
            if (r1 == 0) goto Laf
            com.fasterxml.jackson.databind.PropertyMetadata$b r1 = com.fasterxml.jackson.databind.PropertyMetadata.b.d(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r9 = r9.b(r1)
        Laf:
            if (r3 != 0) goto Lb3
            if (r0 == 0) goto Lb7
        Lb3:
            com.fasterxml.jackson.databind.PropertyMetadata r9 = r9.a(r3, r0)
        Lb7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9473qJ.b(com.fasterxml.jackson.databind.PropertyMetadata):com.fasterxml.jackson.databind.PropertyMetadata");
    }

    @Override // o.AbstractC9465qB
    public JavaType q() {
        if (this.g) {
            AnnotatedMethod m2 = m();
            if (m2 == null) {
                AnnotatedField l = l();
                if (l == null) {
                    return TypeFactory.b();
                }
                return l.a();
            }
            return m2.a();
        }
        AbstractC9509qt j = j();
        if (j == null) {
            AnnotatedMethod u = u();
            if (u != null) {
                return u.c(0);
            }
            j = l();
        }
        if (j == null && (j = m()) == null) {
            return TypeFactory.b();
        }
        return j.a();
    }

    @Override // o.AbstractC9465qB
    public Class<?> p() {
        return q().h();
    }

    @Override // o.AbstractC9465qB
    public AnnotatedMethod m() {
        c<AnnotatedMethod> cVar = this.h;
        if (cVar == null) {
            return null;
        }
        c<AnnotatedMethod> cVar2 = cVar.a;
        if (cVar2 == null) {
            return cVar.i;
        }
        for (c<AnnotatedMethod> cVar3 = cVar2; cVar3 != null; cVar3 = cVar3.a) {
            Class<?> g = cVar.i.g();
            Class<?> g2 = cVar3.i.g();
            if (g != g2) {
                if (!g.isAssignableFrom(g2)) {
                    if (g2.isAssignableFrom(g)) {
                        continue;
                    }
                }
                cVar = cVar3;
            }
            int a = a(cVar3.i);
            int a2 = a(cVar.i);
            if (a == a2) {
                throw new IllegalArgumentException("Conflicting getter definitions for property \"" + a() + "\": " + cVar.i.l() + " vs " + cVar3.i.l());
            }
            if (a >= a2) {
            }
            cVar = cVar3;
        }
        this.h = cVar.b();
        return cVar.i;
    }

    @Override // o.AbstractC9465qB
    public AnnotatedMethod u() {
        c<AnnotatedMethod> cVar = this.k;
        if (cVar == null) {
            return null;
        }
        c<AnnotatedMethod> cVar2 = cVar.a;
        if (cVar2 == null) {
            return cVar.i;
        }
        for (c<AnnotatedMethod> cVar3 = cVar2; cVar3 != null; cVar3 = cVar3.a) {
            Class<?> g = cVar.i.g();
            Class<?> g2 = cVar3.i.g();
            if (g != g2) {
                if (!g.isAssignableFrom(g2)) {
                    if (g2.isAssignableFrom(g)) {
                        continue;
                    }
                }
                cVar = cVar3;
            }
            AnnotatedMethod annotatedMethod = cVar3.i;
            AnnotatedMethod annotatedMethod2 = cVar.i;
            int b = b(annotatedMethod);
            int b2 = b(annotatedMethod2);
            if (b == b2) {
                AnnotationIntrospector annotationIntrospector = this.c;
                if (annotationIntrospector != null) {
                    AnnotatedMethod a = annotationIntrospector.a(this.b, annotatedMethod2, annotatedMethod);
                    if (a != annotatedMethod2) {
                        if (a != annotatedMethod) {
                        }
                        cVar = cVar3;
                    } else {
                        continue;
                    }
                }
                throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", a(), cVar.i.l(), cVar3.i.l()));
            }
            if (b >= b2) {
            }
            cVar = cVar3;
        }
        this.k = cVar.b();
        return cVar.i;
    }

    @Override // o.AbstractC9465qB
    public AnnotatedField l() {
        c<AnnotatedField> cVar = this.d;
        if (cVar == null) {
            return null;
        }
        AnnotatedField annotatedField = cVar.i;
        for (c cVar2 = cVar.a; cVar2 != null; cVar2 = cVar2.a) {
            AnnotatedField annotatedField2 = (AnnotatedField) cVar2.i;
            Class<?> g = annotatedField.g();
            Class<?> g2 = annotatedField2.g();
            if (g != g2) {
                if (g.isAssignableFrom(g2)) {
                    annotatedField = annotatedField2;
                } else if (g2.isAssignableFrom(g)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + a() + "\": " + annotatedField.l() + " vs " + annotatedField2.l());
        }
        return annotatedField;
    }

    @Override // o.AbstractC9465qB
    public AnnotatedParameter j() {
        c cVar = this.e;
        if (cVar == null) {
            return null;
        }
        while (!(((AnnotatedParameter) cVar.i).f() instanceof AnnotatedConstructor)) {
            cVar = cVar.a;
            if (cVar == null) {
                return this.e.i;
            }
        }
        return (AnnotatedParameter) cVar.i;
    }

    @Override // o.AbstractC9465qB
    public Iterator<AnnotatedParameter> k() {
        c<AnnotatedParameter> cVar = this.e;
        if (cVar == null) {
            return C9537rU.c();
        }
        return new d(cVar);
    }

    @Override // o.AbstractC9465qB
    public AnnotatedMember s() {
        if (this.g) {
            return h();
        }
        AnnotatedMember r = r();
        return r == null ? h() : r;
    }

    protected int a(AnnotatedMethod annotatedMethod) {
        String d2 = annotatedMethod.d();
        if (!d2.startsWith("get") || d2.length() <= 3) {
            return (!d2.startsWith("is") || d2.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    protected int b(AnnotatedMethod annotatedMethod) {
        String d2 = annotatedMethod.d();
        return (!d2.startsWith("set") || d2.length() <= 3) ? 2 : 1;
    }

    @Override // o.AbstractC9465qB
    public Class<?>[] i() {
        return (Class[]) d(new e<Class<?>[]>() { // from class: o.qJ.5
            @Override // o.C9473qJ.e
            /* renamed from: e */
            public Class<?>[] b(AnnotatedMember annotatedMember) {
                return C9473qJ.this.c.B(annotatedMember);
            }
        });
    }

    @Override // o.AbstractC9465qB
    public AnnotationIntrospector.ReferenceProperty f() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this.f13898o;
        if (referenceProperty != null) {
            if (referenceProperty == m) {
                return null;
            }
            return referenceProperty;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = (AnnotationIntrospector.ReferenceProperty) d(new e<AnnotationIntrospector.ReferenceProperty>() { // from class: o.qJ.1
            @Override // o.C9473qJ.e
            /* renamed from: c */
            public AnnotationIntrospector.ReferenceProperty b(AnnotatedMember annotatedMember) {
                return C9473qJ.this.c.a(annotatedMember);
            }
        });
        this.f13898o = referenceProperty2 == null ? m : referenceProperty2;
        return referenceProperty2;
    }

    @Override // o.AbstractC9465qB
    public boolean A() {
        Boolean bool = (Boolean) d(new e<Boolean>() { // from class: o.qJ.3
            @Override // o.C9473qJ.e
            /* renamed from: c */
            public Boolean b(AnnotatedMember annotatedMember) {
                return C9473qJ.this.c.j(annotatedMember);
            }
        });
        return bool != null && bool.booleanValue();
    }

    protected Boolean H() {
        return (Boolean) d(new e<Boolean>() { // from class: o.qJ.2
            @Override // o.C9473qJ.e
            /* renamed from: a */
            public Boolean b(AnnotatedMember annotatedMember) {
                return C9473qJ.this.c.i(annotatedMember);
            }
        });
    }

    protected String B() {
        return (String) d(new e<String>() { // from class: o.qJ.10
            @Override // o.C9473qJ.e
            /* renamed from: a */
            public String b(AnnotatedMember annotatedMember) {
                return C9473qJ.this.c.s(annotatedMember);
            }
        });
    }

    protected Integer I() {
        return (Integer) d(new e<Integer>() { // from class: o.qJ.8
            @Override // o.C9473qJ.e
            /* renamed from: c */
            public Integer b(AnnotatedMember annotatedMember) {
                return C9473qJ.this.c.w(annotatedMember);
            }
        });
    }

    protected String z() {
        return (String) d(new e<String>() { // from class: o.qJ.6
            @Override // o.C9473qJ.e
            /* renamed from: a */
            public String b(AnnotatedMember annotatedMember) {
                return C9473qJ.this.c.q(annotatedMember);
            }
        });
    }

    @Override // o.AbstractC9465qB
    public C9471qH c() {
        return (C9471qH) d(new e<C9471qH>() { // from class: o.qJ.7
            @Override // o.C9473qJ.e
            /* renamed from: d */
            public C9471qH b(AnnotatedMember annotatedMember) {
                C9471qH n = C9473qJ.this.c.n(annotatedMember);
                return n != null ? C9473qJ.this.c.a(annotatedMember, n) : n;
            }
        });
    }

    @Override // o.AbstractC9465qB
    public JsonInclude.Value d() {
        AnnotatedMember h = h();
        AnnotationIntrospector annotationIntrospector = this.c;
        JsonInclude.Value t = annotationIntrospector == null ? null : annotationIntrospector.t(h);
        return t == null ? JsonInclude.Value.a() : t;
    }

    public JsonProperty.Access F() {
        return (JsonProperty.Access) b(new e<JsonProperty.Access>() { // from class: o.qJ.9
            @Override // o.C9473qJ.e
            /* renamed from: a */
            public JsonProperty.Access b(AnnotatedMember annotatedMember) {
                return C9473qJ.this.c.l(annotatedMember);
            }
        }, JsonProperty.Access.AUTO);
    }

    public void e(AnnotatedField annotatedField, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.d = new c<>(annotatedField, this.d, propertyName, z, z2, z3);
    }

    public void d(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.e = new c<>(annotatedParameter, this.e, propertyName, z, z2, z3);
    }

    public void d(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.h = new c<>(annotatedMethod, this.h, propertyName, z, z2, z3);
    }

    public void e(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.k = new c<>(annotatedMethod, this.k, propertyName, z, z2, z3);
    }

    public void c(C9473qJ c9473qJ) {
        this.d = c(this.d, c9473qJ.d);
        this.e = c(this.e, c9473qJ.e);
        this.h = c(this.h, c9473qJ.h);
        this.k = c(this.k, c9473qJ.k);
    }

    private static <T> c<T> c(c<T> cVar, c<T> cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : cVar.e(cVar2);
    }

    public void L() {
        this.d = j(this.d);
        this.h = j(this.h);
        this.k = j(this.k);
        this.e = j(this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r4.g != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r4.g == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        r4.d = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.annotation.JsonProperty.Access e(boolean r5) {
        /*
            r4 = this;
            com.fasterxml.jackson.annotation.JsonProperty$Access r0 = r4.F()
            if (r0 != 0) goto L8
            com.fasterxml.jackson.annotation.JsonProperty$Access r0 = com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO
        L8:
            int[] r1 = o.C9473qJ.AnonymousClass4.b
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L48
            r2 = 2
            if (r1 == r2) goto L52
            r2 = 3
            if (r1 == r2) goto L41
            o.qJ$c<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r1 = r4.h
            o.qJ$c r1 = r4.f(r1)
            r4.h = r1
            o.qJ$c<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r1 = r4.e
            o.qJ$c r1 = r4.f(r1)
            r4.e = r1
            if (r5 == 0) goto L30
            o.qJ$c<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r4.h
            if (r5 != 0) goto L52
        L30:
            o.qJ$c<com.fasterxml.jackson.databind.introspect.AnnotatedField> r5 = r4.d
            o.qJ$c r5 = r4.f(r5)
            r4.d = r5
            o.qJ$c<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r4.k
            o.qJ$c r5 = r4.f(r5)
            r4.k = r5
            goto L52
        L41:
            r4.h = r3
            boolean r5 = r4.g
            if (r5 == 0) goto L52
            goto L50
        L48:
            r4.k = r3
            r4.e = r3
            boolean r5 = r4.g
            if (r5 != 0) goto L52
        L50:
            r4.d = r3
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9473qJ.e(boolean):com.fasterxml.jackson.annotation.JsonProperty$Access");
    }

    /* renamed from: o.qJ$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonProperty.Access.values().length];
            b = iArr;
            try {
                iArr[JsonProperty.Access.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[JsonProperty.Access.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[JsonProperty.Access.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[JsonProperty.Access.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void P() {
        this.d = h(this.d);
        this.h = h(this.h);
        this.k = h(this.k);
        this.e = h(this.e);
    }

    public void a(boolean z) {
        if (z) {
            c<AnnotatedMethod> cVar = this.h;
            if (cVar != null) {
                this.h = a(this.h, c(0, cVar, this.d, this.e, this.k));
                return;
            }
            c<AnnotatedField> cVar2 = this.d;
            if (cVar2 != null) {
                this.d = a(this.d, c(0, cVar2, this.e, this.k));
                return;
            }
            return;
        }
        c<AnnotatedParameter> cVar3 = this.e;
        if (cVar3 != null) {
            this.e = a(this.e, c(0, cVar3, this.k, this.d, this.h));
            return;
        }
        c<AnnotatedMethod> cVar4 = this.k;
        if (cVar4 != null) {
            this.k = a(this.k, c(0, cVar4, this.d, this.h));
            return;
        }
        c<AnnotatedField> cVar5 = this.d;
        if (cVar5 != null) {
            this.d = a(this.d, c(0, cVar5, this.h));
        }
    }

    private C9513qx c(int i, c<? extends AnnotatedMember>... cVarArr) {
        C9513qx b = b(cVarArr[i]);
        do {
            i++;
            if (i >= cVarArr.length) {
                return b;
            }
        } while (cVarArr[i] == null);
        return C9513qx.a(b, c(i, cVarArr));
    }

    private <T extends AnnotatedMember> C9513qx b(c<T> cVar) {
        C9513qx j = cVar.i.j();
        c<T> cVar2 = cVar.a;
        return cVar2 != null ? C9513qx.a(j, b(cVar2)) : j;
    }

    private <T extends AnnotatedMember> c<T> a(c<T> cVar, C9513qx c9513qx) {
        AnnotatedMember annotatedMember = (AnnotatedMember) cVar.i.e(c9513qx);
        c<T> cVar2 = cVar.a;
        c cVar3 = cVar;
        if (cVar2 != null) {
            cVar3 = (c<T>) cVar.d(a(cVar2, c9513qx));
        }
        return cVar3.d((c) annotatedMember);
    }

    private <T> c<T> j(c<T> cVar) {
        return cVar == null ? cVar : cVar.d();
    }

    private <T> c<T> f(c<T> cVar) {
        return cVar == null ? cVar : cVar.c();
    }

    private <T> c<T> h(c<T> cVar) {
        return cVar == null ? cVar : cVar.e();
    }

    private <T> boolean e(c<T> cVar) {
        while (cVar != null) {
            PropertyName propertyName = cVar.d;
            if (propertyName != null && propertyName.b()) {
                return true;
            }
            cVar = cVar.a;
        }
        return false;
    }

    private <T> boolean a(c<T> cVar) {
        while (cVar != null) {
            if (cVar.d != null && cVar.c) {
                return true;
            }
            cVar = cVar.a;
        }
        return false;
    }

    public boolean E() {
        return c(this.d) || c(this.h) || c(this.k) || c(this.e);
    }

    private <T> boolean c(c<T> cVar) {
        while (cVar != null) {
            if (cVar.e) {
                return true;
            }
            cVar = cVar.a;
        }
        return false;
    }

    public boolean G() {
        return d(this.d) || d(this.h) || d(this.k) || d(this.e);
    }

    private <T> boolean d(c<T> cVar) {
        while (cVar != null) {
            if (cVar.b) {
                return true;
            }
            cVar = cVar.a;
        }
        return false;
    }

    public Set<PropertyName> M() {
        Set<PropertyName> d2 = d(this.e, d(this.k, d(this.h, d(this.d, null))));
        return d2 == null ? Collections.emptySet() : d2;
    }

    public Collection<C9473qJ> c(Collection<PropertyName> collection) {
        HashMap hashMap = new HashMap();
        e(collection, hashMap, this.d);
        e(collection, hashMap, this.h);
        e(collection, hashMap, this.k);
        e(collection, hashMap, this.e);
        return hashMap.values();
    }

    private void e(Collection<PropertyName> collection, Map<PropertyName, C9473qJ> map, c<?> cVar) {
        for (c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.a) {
            PropertyName propertyName = cVar2.d;
            if (!cVar2.c || propertyName == null) {
                if (cVar2.e) {
                    throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name '" + this.i + "'): found multiple explicit names: " + collection + ", but also implicit accessor: " + cVar2);
                }
            } else {
                C9473qJ c9473qJ = map.get(propertyName);
                if (c9473qJ == null) {
                    c9473qJ = new C9473qJ(this.b, this.c, this.g, this.j, propertyName);
                    map.put(propertyName, c9473qJ);
                }
                if (cVar == this.d) {
                    c9473qJ.d = cVar2.d((c) c9473qJ.d);
                } else if (cVar == this.h) {
                    c9473qJ.h = cVar2.d((c) c9473qJ.h);
                } else if (cVar == this.k) {
                    c9473qJ.k = cVar2.d((c) c9473qJ.k);
                } else if (cVar != this.e) {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                } else {
                    c9473qJ.e = cVar2.d((c) c9473qJ.e);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Set<com.fasterxml.jackson.databind.PropertyName> d(o.C9473qJ.c<? extends com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2, java.util.Set<com.fasterxml.jackson.databind.PropertyName> r3) {
        /*
            r1 = this;
        L0:
            if (r2 == 0) goto L1a
            boolean r0 = r2.c
            if (r0 == 0) goto L17
            com.fasterxml.jackson.databind.PropertyName r0 = r2.d
            if (r0 != 0) goto Lb
            goto L17
        Lb:
            if (r3 != 0) goto L12
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
        L12:
            com.fasterxml.jackson.databind.PropertyName r0 = r2.d
            r3.add(r0)
        L17:
            o.qJ$c<T> r2 = r2.a
            goto L0
        L1a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9473qJ.d(o.qJ$c, java.util.Set):java.util.Set");
    }

    public String toString() {
        return "[Property '" + this.i + "'; ctors: " + this.e + ", field(s): " + this.d + ", getter(s): " + this.h + ", setter(s): " + this.k + "]";
    }

    protected <T> T d(e<T> eVar) {
        c<AnnotatedMethod> cVar;
        c<AnnotatedField> cVar2;
        if (this.c != null) {
            if (this.g) {
                c<AnnotatedMethod> cVar3 = this.h;
                if (cVar3 != null) {
                    r1 = eVar.b(cVar3.i);
                }
            } else {
                c<AnnotatedParameter> cVar4 = this.e;
                r1 = cVar4 != null ? eVar.b(cVar4.i) : null;
                if (r1 == null && (cVar = this.k) != null) {
                    r1 = eVar.b(cVar.i);
                }
            }
            return (r1 != null || (cVar2 = this.d) == null) ? r1 : eVar.b(cVar2.i);
        }
        return null;
    }

    protected <T> T b(e<T> eVar, T t) {
        T b;
        T b2;
        T b3;
        T b4;
        T b5;
        T b6;
        T b7;
        T b8;
        if (this.c == null) {
            return null;
        }
        if (this.g) {
            c<AnnotatedMethod> cVar = this.h;
            if (cVar == null || (b8 = eVar.b(cVar.i)) == null || b8 == t) {
                c<AnnotatedField> cVar2 = this.d;
                if (cVar2 == null || (b7 = eVar.b(cVar2.i)) == null || b7 == t) {
                    c<AnnotatedParameter> cVar3 = this.e;
                    if (cVar3 == null || (b6 = eVar.b(cVar3.i)) == null || b6 == t) {
                        c<AnnotatedMethod> cVar4 = this.k;
                        if (cVar4 == null || (b5 = eVar.b(cVar4.i)) == null || b5 == t) {
                            return null;
                        }
                        return b5;
                    }
                    return b6;
                }
                return b7;
            }
            return b8;
        }
        c<AnnotatedParameter> cVar5 = this.e;
        if (cVar5 == null || (b4 = eVar.b(cVar5.i)) == null || b4 == t) {
            c<AnnotatedMethod> cVar6 = this.k;
            if (cVar6 == null || (b3 = eVar.b(cVar6.i)) == null || b3 == t) {
                c<AnnotatedField> cVar7 = this.d;
                if (cVar7 == null || (b2 = eVar.b(cVar7.i)) == null || b2 == t) {
                    c<AnnotatedMethod> cVar8 = this.h;
                    if (cVar8 == null || (b = eVar.b(cVar8.i)) == null || b == t) {
                        return null;
                    }
                    return b;
                }
                return b2;
            }
            return b3;
        }
        return b4;
    }

    /* renamed from: o.qJ$d */
    /* loaded from: classes5.dex */
    protected static class d<T extends AnnotatedMember> implements Iterator<T> {
        private c<T> b;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }

        public d(c<T> cVar) {
            this.b = cVar;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public T next() {
            c<T> cVar = this.b;
            if (cVar == null) {
                throw new NoSuchElementException();
            }
            T t = cVar.i;
            this.b = cVar.a;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.qJ$c */
    /* loaded from: classes5.dex */
    public static final class c<T> {
        public final c<T> a;
        public final boolean b;
        public final boolean c;
        public final PropertyName d;
        public final boolean e;
        public final T i;

        public c(T t, c<T> cVar, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.i = t;
            this.a = cVar;
            PropertyName propertyName2 = (propertyName == null || propertyName.e()) ? null : propertyName;
            this.d = propertyName2;
            if (z) {
                if (propertyName2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!propertyName.b()) {
                    z = false;
                }
            }
            this.c = z;
            this.e = z2;
            this.b = z3;
        }

        public c<T> b() {
            return this.a == null ? this : new c<>(this.i, null, this.d, this.c, this.e, this.b);
        }

        public c<T> d(T t) {
            return t == this.i ? this : new c<>(t, this.a, this.d, this.c, this.e, this.b);
        }

        public c<T> d(c<T> cVar) {
            return cVar == this.a ? this : new c<>(this.i, cVar, this.d, this.c, this.e, this.b);
        }

        public c<T> d() {
            c<T> d;
            if (!this.b) {
                c<T> cVar = this.a;
                return (cVar == null || (d = cVar.d()) == this.a) ? this : d((c) d);
            }
            c<T> cVar2 = this.a;
            if (cVar2 == null) {
                return null;
            }
            return cVar2.d();
        }

        public c<T> c() {
            c<T> cVar = this.a;
            c<T> c = cVar == null ? null : cVar.c();
            return this.e ? d((c) c) : c;
        }

        protected c<T> e(c<T> cVar) {
            c<T> cVar2 = this.a;
            if (cVar2 == null) {
                return d((c) cVar);
            }
            return d((c) cVar2.e(cVar));
        }

        public c<T> e() {
            c<T> cVar = this.a;
            if (cVar == null) {
                return this;
            }
            c<T> e = cVar.e();
            if (this.d != null) {
                if (e.d == null) {
                    return d((c) null);
                }
                return d((c) e);
            } else if (e.d != null) {
                return e;
            } else {
                boolean z = this.e;
                if (z == e.e) {
                    return d((c) e);
                }
                return z ? d((c) null) : e;
            }
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.i.toString(), Boolean.valueOf(this.e), Boolean.valueOf(this.b), Boolean.valueOf(this.c));
            if (this.a != null) {
                return format + ", " + this.a.toString();
            }
            return format;
        }
    }
}
