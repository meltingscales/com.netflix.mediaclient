package o;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: o.qI  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9472qI {
    protected LinkedList<AnnotatedMember> a;
    protected LinkedList<AnnotatedMethod> b;
    protected final AnnotationIntrospector c;
    protected LinkedList<AnnotatedMember> d;
    protected final C9508qs e;
    protected LinkedList<C9473qJ> f;
    protected boolean g;
    protected final boolean h;
    protected HashSet<String> i;
    protected final MapperConfig<?> j;
    protected LinkedList<AnnotatedMember> k;
    protected final boolean l;
    protected final String m;
    protected LinkedHashMap<Object, AnnotatedMember> n;

    /* renamed from: o  reason: collision with root package name */
    protected LinkedHashMap<String, C9473qJ> f13897o;
    protected final boolean q;
    protected final JavaType s;
    protected final VisibilityChecker<?> t;

    public C9508qs c() {
        return this.e;
    }

    public Set<String> g() {
        return this.i;
    }

    public MapperConfig<?> i() {
        return this.j;
    }

    public JavaType n() {
        return this.s;
    }

    public C9472qI(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, C9508qs c9508qs, String str) {
        this.j = mapperConfig;
        this.l = mapperConfig.a(MapperFeature.USE_STD_BEAN_NAMING);
        this.h = z;
        this.s = javaType;
        this.e = c9508qs;
        this.m = str == null ? "set" : str;
        if (mapperConfig.p()) {
            this.q = true;
            this.c = mapperConfig.h();
        } else {
            this.q = false;
            this.c = AnnotationIntrospector.c();
        }
        this.t = mapperConfig.d(javaType.h(), c9508qs);
    }

    public List<AbstractC9465qB> l() {
        return new ArrayList(m().values());
    }

    public Map<Object, AnnotatedMember> j() {
        if (!this.g) {
            a();
        }
        return this.n;
    }

    public AnnotatedMember f() {
        if (!this.g) {
            a();
        }
        LinkedList<AnnotatedMember> linkedList = this.k;
        if (linkedList != null) {
            if (linkedList.size() > 1) {
                c("Multiple 'as-value' properties defined (%s vs %s)", this.k.get(0), this.k.get(1));
            }
            return this.k.get(0);
        }
        return null;
    }

    public AnnotatedMember d() {
        if (!this.g) {
            a();
        }
        LinkedList<AnnotatedMember> linkedList = this.d;
        if (linkedList != null) {
            if (linkedList.size() > 1) {
                c("Multiple 'any-getters' defined (%s vs %s)", this.d.get(0), this.d.get(1));
            }
            return this.d.getFirst();
        }
        return null;
    }

    public AnnotatedMember e() {
        if (!this.g) {
            a();
        }
        LinkedList<AnnotatedMember> linkedList = this.a;
        if (linkedList != null) {
            if (linkedList.size() > 1) {
                c("Multiple 'any-setter' fields defined (%s vs %s)", this.a.get(0), this.a.get(1));
            }
            return this.a.getFirst();
        }
        return null;
    }

    public AnnotatedMethod b() {
        if (!this.g) {
            a();
        }
        LinkedList<AnnotatedMethod> linkedList = this.b;
        if (linkedList != null) {
            if (linkedList.size() > 1) {
                c("Multiple 'any-setter' methods defined (%s vs %s)", this.b.get(0), this.b.get(1));
            }
            return this.b.getFirst();
        }
        return null;
    }

    public C9471qH h() {
        C9471qH n = this.c.n(this.e);
        return n != null ? this.c.a(this.e, n) : n;
    }

    protected Map<String, C9473qJ> m() {
        if (!this.g) {
            a();
        }
        return this.f13897o;
    }

    protected void a() {
        LinkedHashMap<String, C9473qJ> linkedHashMap = new LinkedHashMap<>();
        a(linkedHashMap);
        b(linkedHashMap);
        if (!this.e.k()) {
            d(linkedHashMap);
        }
        e(linkedHashMap);
        i(linkedHashMap);
        c(linkedHashMap);
        j(linkedHashMap);
        for (C9473qJ c9473qJ : linkedHashMap.values()) {
            c9473qJ.a(this.h);
        }
        PropertyNamingStrategy k = k();
        if (k != null) {
            d(linkedHashMap, k);
        }
        for (C9473qJ c9473qJ2 : linkedHashMap.values()) {
            c9473qJ2.P();
        }
        if (this.j.a(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            g(linkedHashMap);
        }
        h(linkedHashMap);
        this.f13897o = linkedHashMap;
        this.g = true;
    }

    protected void a(Map<String, C9473qJ> map) {
        PropertyName k;
        PropertyName propertyName;
        boolean z;
        boolean z2;
        boolean z3;
        AnnotationIntrospector annotationIntrospector = this.c;
        boolean z4 = (this.h || this.j.a(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean a = this.j.a(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField annotatedField : this.e.c()) {
            String b = annotationIntrospector.b((AnnotatedMember) annotatedField);
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.H(annotatedField))) {
                if (this.k == null) {
                    this.k = new LinkedList<>();
                }
                this.k.add(annotatedField);
            } else if (bool.equals(annotationIntrospector.I(annotatedField))) {
                if (this.a == null) {
                    this.a = new LinkedList<>();
                }
                this.a.add(annotatedField);
            } else {
                if (b == null) {
                    b = annotatedField.d();
                }
                if (this.h) {
                    k = annotationIntrospector.o(annotatedField);
                } else {
                    k = annotationIntrospector.k(annotatedField);
                }
                boolean z5 = k != null;
                if (z5 && k.e()) {
                    z = false;
                    propertyName = a(b);
                } else {
                    propertyName = k;
                    z = z5;
                }
                boolean z6 = propertyName != null;
                if (!z6) {
                    z6 = this.t.d(annotatedField);
                }
                boolean g = annotationIntrospector.g((AnnotatedMember) annotatedField);
                if (!annotatedField.f() || z5) {
                    z2 = g;
                    z3 = z6;
                } else {
                    if (a) {
                        g = true;
                    }
                    z2 = g;
                    z3 = false;
                }
                if (!z4 || propertyName != null || z2 || !Modifier.isFinal(annotatedField.i())) {
                    c(map, b).e(annotatedField, propertyName, z, z3, z2);
                }
            }
        }
    }

    protected void d(Map<String, C9473qJ> map) {
        if (this.q) {
            Iterator<AnnotatedConstructor> it = this.e.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedConstructor next = it.next();
                if (this.f == null) {
                    this.f = new LinkedList<>();
                }
                int f = next.f();
                for (int i = 0; i < f; i++) {
                    b(map, next.d(i));
                }
            }
            for (AnnotatedMethod annotatedMethod : this.e.g()) {
                if (this.f == null) {
                    this.f = new LinkedList<>();
                }
                int f2 = annotatedMethod.f();
                for (int i2 = 0; i2 < f2; i2++) {
                    b(map, annotatedMethod.d(i2));
                }
            }
        }
    }

    protected void b(Map<String, C9473qJ> map, AnnotatedParameter annotatedParameter) {
        JsonCreator.Mode d;
        String b = this.c.b((AnnotatedMember) annotatedParameter);
        if (b == null) {
            b = "";
        }
        PropertyName k = this.c.k(annotatedParameter);
        boolean z = (k == null || k.e()) ? false : true;
        if (!z) {
            if (b.isEmpty() || (d = this.c.d(this.j, annotatedParameter.f())) == null || d == JsonCreator.Mode.DISABLED) {
                return;
            }
            k = PropertyName.b(b);
        }
        PropertyName propertyName = k;
        C9473qJ e = (z && b.isEmpty()) ? e(map, propertyName) : c(map, b);
        e.d(annotatedParameter, propertyName, z, true, false);
        this.f.add(e);
    }

    protected void b(Map<String, C9473qJ> map) {
        AnnotationIntrospector annotationIntrospector = this.c;
        for (AnnotatedMethod annotatedMethod : this.e.o()) {
            int f = annotatedMethod.f();
            if (f == 0) {
                c(map, annotatedMethod, annotationIntrospector);
            } else if (f == 1) {
                b(map, annotatedMethod, annotationIntrospector);
            } else if (f == 2 && annotationIntrospector != null && Boolean.TRUE.equals(annotationIntrospector.I(annotatedMethod))) {
                if (this.b == null) {
                    this.b = new LinkedList<>();
                }
                this.b.add(annotatedMethod);
            }
        }
    }

    protected void c(Map<String, C9473qJ> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        boolean z;
        boolean z2;
        String str;
        boolean c;
        if (annotatedMethod.o()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.A(annotatedMethod))) {
                if (this.d == null) {
                    this.d = new LinkedList<>();
                }
                this.d.add(annotatedMethod);
            } else if (bool.equals(annotationIntrospector.H(annotatedMethod))) {
                if (this.k == null) {
                    this.k = new LinkedList<>();
                }
                this.k.add(annotatedMethod);
            } else {
                PropertyName o2 = annotationIntrospector.o(annotatedMethod);
                boolean z3 = false;
                boolean z4 = o2 != null;
                if (!z4) {
                    str = annotationIntrospector.b((AnnotatedMember) annotatedMethod);
                    if (str == null) {
                        str = C9531rO.e(annotatedMethod, annotatedMethod.d(), this.l);
                    }
                    if (str == null) {
                        str = C9531rO.b(annotatedMethod, annotatedMethod.d(), this.l);
                        if (str == null) {
                            return;
                        }
                        c = this.t.a(annotatedMethod);
                    } else {
                        c = this.t.c(annotatedMethod);
                    }
                    propertyName = o2;
                    z = c;
                    z2 = z4;
                } else {
                    String b = annotationIntrospector.b((AnnotatedMember) annotatedMethod);
                    if (b == null) {
                        b = C9531rO.e(annotatedMethod, this.l);
                    }
                    if (b == null) {
                        b = annotatedMethod.d();
                    }
                    if (o2.e()) {
                        o2 = a(b);
                    } else {
                        z3 = z4;
                    }
                    propertyName = o2;
                    z = true;
                    z2 = z3;
                    str = b;
                }
                c(map, str).d(annotatedMethod, propertyName, z2, z, annotationIntrospector.g((AnnotatedMember) annotatedMethod));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void b(java.util.Map<java.lang.String, o.C9473qJ> r11, com.fasterxml.jackson.databind.introspect.AnnotatedMethod r12, com.fasterxml.jackson.databind.AnnotationIntrospector r13) {
        /*
            r10 = this;
            r0 = 0
            if (r13 != 0) goto L5
            r1 = r0
            goto L9
        L5:
            com.fasterxml.jackson.databind.PropertyName r1 = r13.k(r12)
        L9:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            if (r4 != 0) goto L2d
            if (r13 != 0) goto L15
            goto L19
        L15:
            java.lang.String r0 = r13.b(r12)
        L19:
            if (r0 != 0) goto L23
            java.lang.String r0 = r10.m
            boolean r2 = r10.l
            java.lang.String r0 = o.C9531rO.a(r12, r0, r2)
        L23:
            if (r0 != 0) goto L26
            return
        L26:
            com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r2 = r10.t
            boolean r2 = r2.d(r12)
            goto L52
        L2d:
            if (r13 != 0) goto L30
            goto L34
        L30:
            java.lang.String r0 = r13.b(r12)
        L34:
            if (r0 != 0) goto L3e
            java.lang.String r0 = r10.m
            boolean r5 = r10.l
            java.lang.String r0 = o.C9531rO.a(r12, r0, r5)
        L3e:
            if (r0 != 0) goto L44
            java.lang.String r0 = r12.d()
        L44:
            boolean r5 = r1.e()
            if (r5 == 0) goto L52
            com.fasterxml.jackson.databind.PropertyName r1 = r10.a(r0)
            r6 = r1
            r8 = r2
            r7 = r3
            goto L55
        L52:
            r6 = r1
            r8 = r2
            r7 = r4
        L55:
            if (r13 != 0) goto L59
        L57:
            r9 = r3
            goto L5e
        L59:
            boolean r3 = r13.g(r12)
            goto L57
        L5e:
            o.qJ r4 = r10.c(r11, r0)
            r5 = r12
            r4.e(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9472qI.b(java.util.Map, com.fasterxml.jackson.databind.introspect.AnnotatedMethod, com.fasterxml.jackson.databind.AnnotationIntrospector):void");
    }

    protected void e(Map<String, C9473qJ> map) {
        AnnotationIntrospector annotationIntrospector = this.c;
        for (AnnotatedMember annotatedMember : this.e.c()) {
            c(annotationIntrospector.d(annotatedMember), annotatedMember);
        }
        for (AnnotatedMethod annotatedMethod : this.e.o()) {
            if (annotatedMethod.f() == 1) {
                c(annotationIntrospector.d((AnnotatedMember) annotatedMethod), annotatedMethod);
            }
        }
    }

    protected void c(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value == null) {
            return;
        }
        Object a = value.a();
        if (this.n == null) {
            this.n = new LinkedHashMap<>();
        }
        AnnotatedMember put = this.n.put(a, annotatedMember);
        if (put == null || put.getClass() != annotatedMember.getClass()) {
            return;
        }
        String name = a.getClass().getName();
        throw new IllegalArgumentException("Duplicate injectable value with id '" + String.valueOf(a) + "' (of type " + name + ")");
    }

    private PropertyName a(String str) {
        return PropertyName.a(str, null);
    }

    protected void i(Map<String, C9473qJ> map) {
        Iterator<C9473qJ> it = map.values().iterator();
        while (it.hasNext()) {
            C9473qJ next = it.next();
            if (!next.E()) {
                it.remove();
            } else if (next.G()) {
                if (!next.D()) {
                    it.remove();
                    e(next.a());
                } else {
                    next.L();
                    if (!next.e()) {
                        e(next.a());
                    }
                }
            }
        }
    }

    protected void c(Map<String, C9473qJ> map) {
        boolean a = this.j.a(MapperFeature.INFER_PROPERTY_MUTATORS);
        for (C9473qJ c9473qJ : map.values()) {
            if (c9473qJ.e(a) == JsonProperty.Access.READ_ONLY) {
                e(c9473qJ.a());
            }
        }
    }

    private void e(String str) {
        if (this.h) {
            return;
        }
        if (this.i == null) {
            this.i = new HashSet<>();
        }
        this.i.add(str);
    }

    protected void j(Map<String, C9473qJ> map) {
        Iterator<Map.Entry<String, C9473qJ>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            C9473qJ value = it.next().getValue();
            Set<PropertyName> M = value.M();
            if (!M.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (M.size() == 1) {
                    linkedList.add(value.b(M.iterator().next()));
                } else {
                    linkedList.addAll(value.c(M));
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                C9473qJ c9473qJ = (C9473qJ) it2.next();
                String a = c9473qJ.a();
                C9473qJ c9473qJ2 = map.get(a);
                if (c9473qJ2 == null) {
                    map.put(a, c9473qJ);
                } else {
                    c9473qJ2.c(c9473qJ);
                }
                c(c9473qJ, this.f);
                HashSet<String> hashSet = this.i;
                if (hashSet != null) {
                    hashSet.remove(a);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void d(java.util.Map<java.lang.String, o.C9473qJ> r9, com.fasterxml.jackson.databind.PropertyNamingStrategy r10) {
        /*
            r8 = this;
            java.util.Collection r0 = r9.values()
            int r1 = r9.size()
            o.qJ[] r1 = new o.C9473qJ[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            o.qJ[] r0 = (o.C9473qJ[]) r0
            r9.clear()
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto Ld9
            r3 = r0[r2]
            com.fasterxml.jackson.databind.PropertyName r4 = r3.o()
            boolean r5 = r3.C()
            if (r5 == 0) goto L2d
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5 = r8.j
            com.fasterxml.jackson.databind.MapperFeature r6 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Laf
        L2d:
            boolean r5 = r8.h
            if (r5 == 0) goto L5b
            boolean r5 = r3.K()
            if (r5 == 0) goto L46
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5 = r8.j
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r6 = r3.m()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.d(r5, r6, r7)
            goto Lb0
        L46:
            boolean r5 = r3.x()
            if (r5 == 0) goto Laf
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5 = r8.j
            com.fasterxml.jackson.databind.introspect.AnnotatedField r6 = r3.l()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.b(r5, r6, r7)
            goto Lb0
        L5b:
            boolean r5 = r3.v()
            if (r5 == 0) goto L70
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5 = r8.j
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r6 = r3.u()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.c(r5, r6, r7)
            goto Lb0
        L70:
            boolean r5 = r3.y()
            if (r5 == 0) goto L85
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5 = r8.j
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r6 = r3.j()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.e(r5, r6, r7)
            goto Lb0
        L85:
            boolean r5 = r3.x()
            if (r5 == 0) goto L9a
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5 = r8.j
            com.fasterxml.jackson.databind.introspect.AnnotatedField r6 = r3.l()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.b(r5, r6, r7)
            goto Lb0
        L9a:
            boolean r5 = r3.K()
            if (r5 == 0) goto Laf
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5 = r8.j
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r6 = r3.m()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.d(r5, r6, r7)
            goto Lb0
        Laf:
            r5 = 0
        Lb0:
            if (r5 == 0) goto Lbd
            boolean r6 = r4.e(r5)
            if (r6 != 0) goto Lbd
            o.qJ r3 = r3.d(r5)
            goto Lc1
        Lbd:
            java.lang.String r5 = r4.c()
        Lc1:
            java.lang.Object r4 = r9.get(r5)
            o.qJ r4 = (o.C9473qJ) r4
            if (r4 != 0) goto Lcd
            r9.put(r5, r3)
            goto Ld0
        Lcd:
            r4.c(r3)
        Ld0:
            java.util.LinkedList<o.qJ> r4 = r8.f
            r8.c(r3, r4)
            int r2 = r2 + 1
            goto L15
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9472qI.d(java.util.Map, com.fasterxml.jackson.databind.PropertyNamingStrategy):void");
    }

    protected void g(Map<String, C9473qJ> map) {
        PropertyName D;
        Iterator<Map.Entry<String, C9473qJ>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            C9473qJ value = it.next().getValue();
            AnnotatedMember s = value.s();
            if (s != null && (D = this.c.D(s)) != null && D.b() && !D.equals(value.o())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.b(D));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                C9473qJ c9473qJ = (C9473qJ) it2.next();
                String a = c9473qJ.a();
                C9473qJ c9473qJ2 = map.get(a);
                if (c9473qJ2 == null) {
                    map.put(a, c9473qJ);
                } else {
                    c9473qJ2.c(c9473qJ);
                }
            }
        }
    }

    protected void h(Map<String, C9473qJ> map) {
        boolean booleanValue;
        Map<? extends Object, ? extends Object> linkedHashMap;
        AnnotationIntrospector annotationIntrospector = this.c;
        Boolean u = annotationIntrospector.u(this.e);
        if (u == null) {
            booleanValue = this.j.x();
        } else {
            booleanValue = u.booleanValue();
        }
        String[] b = annotationIntrospector.b(this.e);
        if (!booleanValue && this.f == null && b == null) {
            return;
        }
        int size = map.size();
        if (booleanValue) {
            linkedHashMap = new TreeMap<>();
        } else {
            linkedHashMap = new LinkedHashMap<>(size + size);
        }
        for (C9473qJ c9473qJ : map.values()) {
            linkedHashMap.put(c9473qJ.a(), c9473qJ);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(size + size);
        if (b != null) {
            for (String str : b) {
                C9473qJ c9473qJ2 = (C9473qJ) linkedHashMap.get(str);
                if (c9473qJ2 == null) {
                    Iterator<C9473qJ> it = map.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C9473qJ next = it.next();
                        if (str.equals(next.J())) {
                            str = next.a();
                            c9473qJ2 = next;
                            break;
                        }
                    }
                }
                if (c9473qJ2 != null) {
                    linkedHashMap2.put(str, c9473qJ2);
                }
            }
        }
        Collection<C9473qJ> collection = this.f;
        if (collection != null) {
            if (booleanValue) {
                TreeMap treeMap = new TreeMap();
                Iterator<C9473qJ> it2 = this.f.iterator();
                while (it2.hasNext()) {
                    C9473qJ next2 = it2.next();
                    treeMap.put(next2.a(), next2);
                }
                collection = treeMap.values();
            }
            for (C9473qJ c9473qJ3 : collection) {
                String a = c9473qJ3.a();
                if (linkedHashMap.containsKey(a)) {
                    linkedHashMap2.put(a, c9473qJ3);
                }
            }
        }
        linkedHashMap2.putAll(linkedHashMap);
        map.clear();
        map.putAll(linkedHashMap2);
    }

    protected void c(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.e + ": " + str);
    }

    protected C9473qJ e(Map<String, C9473qJ> map, PropertyName propertyName) {
        String c = propertyName.c();
        C9473qJ c9473qJ = map.get(c);
        if (c9473qJ == null) {
            C9473qJ c9473qJ2 = new C9473qJ(this.j, this.c, this.h, propertyName);
            map.put(c, c9473qJ2);
            return c9473qJ2;
        }
        return c9473qJ;
    }

    protected C9473qJ c(Map<String, C9473qJ> map, String str) {
        C9473qJ c9473qJ = map.get(str);
        if (c9473qJ == null) {
            C9473qJ c9473qJ2 = new C9473qJ(this.j, this.c, this.h, PropertyName.b(str));
            map.put(str, c9473qJ2);
            return c9473qJ2;
        }
        return c9473qJ;
    }

    private PropertyNamingStrategy k() {
        PropertyNamingStrategy d;
        Object a = this.c.a(this.e);
        if (a == null) {
            return this.j.r();
        }
        if (a instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) a;
        }
        if (!(a instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + a.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
        }
        Class<?> cls = (Class) a;
        if (cls == PropertyNamingStrategy.class) {
            return null;
        }
        if (!PropertyNamingStrategy.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<PropertyNamingStrategy>");
        }
        AbstractC9415pE n = this.j.n();
        return (n == null || (d = n.d(this.j, this.e, cls)) == null) ? (PropertyNamingStrategy) C9537rU.b(cls, this.j.f()) : d;
    }

    protected void c(C9473qJ c9473qJ, List<C9473qJ> list) {
        if (list != null) {
            String J2 = c9473qJ.J();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).J().equals(J2)) {
                    list.set(i, c9473qJ);
                    return;
                }
            }
        }
    }
}
