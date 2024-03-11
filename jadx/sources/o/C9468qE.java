package o;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC9411pA;
import o.InterfaceC9535rS;

/* renamed from: o.qE  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9468qE extends AbstractC9445pi {
    private static final Class<?>[] i = new Class[0];
    protected final AnnotationIntrospector b;
    protected final C9508qs c;
    protected Class<?>[] d;
    protected final MapperConfig<?> e;
    protected final C9472qI f;
    protected List<AbstractC9465qB> g;
    protected boolean h;
    protected C9471qH j;

    @Override // o.AbstractC9445pi
    public C9508qs k() {
        return this.c;
    }

    @Override // o.AbstractC9445pi
    public C9471qH p() {
        return this.j;
    }

    protected C9468qE(C9472qI c9472qI, JavaType javaType, C9508qs c9508qs) {
        super(javaType);
        this.f = c9472qI;
        MapperConfig<?> i2 = c9472qI.i();
        this.e = i2;
        if (i2 == null) {
            this.b = null;
        } else {
            this.b = i2.h();
        }
        this.c = c9508qs;
    }

    protected C9468qE(MapperConfig<?> mapperConfig, JavaType javaType, C9508qs c9508qs, List<AbstractC9465qB> list) {
        super(javaType);
        this.f = null;
        this.e = mapperConfig;
        if (mapperConfig == null) {
            this.b = null;
        } else {
            this.b = mapperConfig.h();
        }
        this.c = c9508qs;
        this.g = list;
    }

    protected C9468qE(C9472qI c9472qI) {
        this(c9472qI, c9472qI.n(), c9472qI.c());
        this.j = c9472qI.h();
    }

    public static C9468qE a(C9472qI c9472qI) {
        return new C9468qE(c9472qI);
    }

    public static C9468qE e(C9472qI c9472qI) {
        return new C9468qE(c9472qI);
    }

    public static C9468qE c(MapperConfig<?> mapperConfig, JavaType javaType, C9508qs c9508qs) {
        return new C9468qE(mapperConfig, javaType, c9508qs, Collections.emptyList());
    }

    protected List<AbstractC9465qB> x() {
        if (this.g == null) {
            this.g = this.f.l();
        }
        return this.g;
    }

    public boolean b(String str) {
        Iterator<AbstractC9465qB> it = x().iterator();
        while (it.hasNext()) {
            if (it.next().a().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean a(AbstractC9465qB abstractC9465qB) {
        if (b(abstractC9465qB.o())) {
            return false;
        }
        x().add(abstractC9465qB);
        return true;
    }

    public boolean b(PropertyName propertyName) {
        return c(propertyName) != null;
    }

    public AbstractC9465qB c(PropertyName propertyName) {
        for (AbstractC9465qB abstractC9465qB : x()) {
            if (abstractC9465qB.e(propertyName)) {
                return abstractC9465qB;
            }
        }
        return null;
    }

    @Override // o.AbstractC9445pi
    public List<AbstractC9465qB> l() {
        return x();
    }

    @Override // o.AbstractC9445pi
    public AnnotatedMember j() {
        C9472qI c9472qI = this.f;
        if (c9472qI == null) {
            return null;
        }
        return c9472qI.f();
    }

    @Override // o.AbstractC9445pi
    public Set<String> r() {
        C9472qI c9472qI = this.f;
        Set<String> g = c9472qI == null ? null : c9472qI.g();
        return g == null ? Collections.emptySet() : g;
    }

    @Override // o.AbstractC9445pi
    public boolean u() {
        return this.c.n();
    }

    @Override // o.AbstractC9445pi
    public InterfaceC9532rP n() {
        return this.c.f();
    }

    @Override // o.AbstractC9445pi
    public AnnotatedConstructor b() {
        return this.c.i();
    }

    @Override // o.AbstractC9445pi
    public AnnotatedMember e() {
        C9472qI c9472qI = this.f;
        if (c9472qI != null) {
            AnnotatedMethod b = c9472qI.b();
            if (b != null) {
                Class<?> e = b.e(0);
                if (e == String.class || e == Object.class) {
                    return b;
                }
                throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", b.d(), e.getName()));
            }
            AnnotatedMember e2 = this.f.e();
            if (e2 != null) {
                if (Map.class.isAssignableFrom(e2.e())) {
                    return e2;
                }
                throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", e2.d()));
            }
            return null;
        }
        return null;
    }

    @Override // o.AbstractC9445pi
    public Map<Object, AnnotatedMember> f() {
        C9472qI c9472qI = this.f;
        if (c9472qI != null) {
            return c9472qI.j();
        }
        return Collections.emptyMap();
    }

    @Override // o.AbstractC9445pi
    public List<AnnotatedConstructor> q() {
        return this.c.h();
    }

    @Override // o.AbstractC9445pi
    public Object b(boolean z) {
        AnnotatedConstructor i2 = this.c.i();
        if (i2 == null) {
            return null;
        }
        if (z) {
            i2.d(this.e.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return i2.b().newInstance(new Object[0]);
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            C9537rU.b(e);
            C9537rU.h(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.c.b().getName() + ": (" + e.getClass().getName() + ") " + C9537rU.d(e), e);
        }
    }

    @Override // o.AbstractC9445pi
    public AnnotatedMethod b(String str, Class<?>[] clsArr) {
        return this.c.e(str, clsArr);
    }

    @Override // o.AbstractC9445pi
    public JsonFormat.Value e(JsonFormat.Value value) {
        JsonFormat.Value g;
        AnnotationIntrospector annotationIntrospector = this.b;
        if (annotationIntrospector != null && (g = annotationIntrospector.g((AbstractC9509qt) this.c)) != null) {
            value = value == null ? g : value.c(g);
        }
        JsonFormat.Value h = this.e.h(this.c.e());
        return h != null ? value == null ? h : value.c(h) : value;
    }

    @Override // o.AbstractC9445pi
    public Class<?>[] a() {
        if (!this.h) {
            this.h = true;
            AnnotationIntrospector annotationIntrospector = this.b;
            Class<?>[] B = annotationIntrospector == null ? null : annotationIntrospector.B(this.c);
            if (B == null && !this.e.a(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                B = i;
            }
            this.d = B;
        }
        return this.d;
    }

    @Override // o.AbstractC9445pi
    public InterfaceC9535rS<Object, Object> m() {
        AnnotationIntrospector annotationIntrospector = this.b;
        if (annotationIntrospector == null) {
            return null;
        }
        return b(annotationIntrospector.y(this.c));
    }

    @Override // o.AbstractC9445pi
    public JsonInclude.Value b(JsonInclude.Value value) {
        JsonInclude.Value t;
        AnnotationIntrospector annotationIntrospector = this.b;
        return (annotationIntrospector == null || (t = annotationIntrospector.t(this.c)) == null) ? value : value == null ? t : value.b(t);
    }

    @Override // o.AbstractC9445pi
    public AnnotatedMember c() {
        C9472qI c9472qI = this.f;
        AnnotatedMember d = c9472qI == null ? null : c9472qI.d();
        if (d == null || Map.class.isAssignableFrom(d.e())) {
            return d;
        }
        throw new IllegalArgumentException("Invalid 'any-getter' annotation on method " + d.d() + "(): return type is not instance of java.util.Map");
    }

    @Override // o.AbstractC9445pi
    public List<AbstractC9465qB> d() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (AbstractC9465qB abstractC9465qB : x()) {
            AnnotationIntrospector.ReferenceProperty f = abstractC9465qB.f();
            if (f != null && f.c()) {
                String b = f.b();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(b);
                } else if (!hashSet.add(b)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name '" + b + "'");
                }
                arrayList.add(abstractC9465qB);
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC9445pi
    public List<AnnotatedMethod> s() {
        List<AnnotatedMethod> g = this.c.g();
        if (g.isEmpty()) {
            return g;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod annotatedMethod : g) {
            if (e(annotatedMethod)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(annotatedMethod);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override // o.AbstractC9445pi
    public Constructor<?> a(Class<?>... clsArr) {
        for (AnnotatedConstructor annotatedConstructor : this.c.h()) {
            if (annotatedConstructor.f() == 1) {
                Class<?> e = annotatedConstructor.e(0);
                for (Class<?> cls : clsArr) {
                    if (cls == e) {
                        return annotatedConstructor.b();
                    }
                }
                continue;
            }
        }
        return null;
    }

    @Override // o.AbstractC9445pi
    public Method b(Class<?>... clsArr) {
        for (AnnotatedMethod annotatedMethod : this.c.g()) {
            if (e(annotatedMethod) && annotatedMethod.f() == 1) {
                Class<?> e = annotatedMethod.e(0);
                for (Class<?> cls : clsArr) {
                    if (e.isAssignableFrom(cls)) {
                        return annotatedMethod.b();
                    }
                }
                continue;
            }
        }
        return null;
    }

    protected boolean e(AnnotatedMethod annotatedMethod) {
        Class<?> e;
        if (o().isAssignableFrom(annotatedMethod.n())) {
            JsonCreator.Mode d = this.b.d(this.e, annotatedMethod);
            if (d == null || d == JsonCreator.Mode.DISABLED) {
                String d2 = annotatedMethod.d();
                if ("valueOf".equals(d2) && annotatedMethod.f() == 1) {
                    return true;
                }
                return "fromString".equals(d2) && annotatedMethod.f() == 1 && ((e = annotatedMethod.e(0)) == String.class || CharSequence.class.isAssignableFrom(e));
            }
            return true;
        }
        return false;
    }

    @Override // o.AbstractC9445pi
    public Class<?> h() {
        AnnotationIntrospector annotationIntrospector = this.b;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.e(this.c);
    }

    @Override // o.AbstractC9445pi
    public InterfaceC9411pA.d i() {
        AnnotationIntrospector annotationIntrospector = this.b;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.c(this.c);
    }

    @Override // o.AbstractC9445pi
    public InterfaceC9535rS<Object, Object> g() {
        AnnotationIntrospector annotationIntrospector = this.b;
        if (annotationIntrospector == null) {
            return null;
        }
        return b(annotationIntrospector.c((AbstractC9509qt) this.c));
    }

    protected InterfaceC9535rS<Object, Object> b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC9535rS) {
            return (InterfaceC9535rS) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class<?> cls = (Class) obj;
        if (cls == InterfaceC9535rS.e.class || C9537rU.l(cls)) {
            return null;
        }
        if (!InterfaceC9535rS.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        AbstractC9415pE n = this.e.n();
        InterfaceC9535rS<?, ?> b = n != null ? n.b(this.e, this.c, cls) : null;
        return b == null ? (InterfaceC9535rS) C9537rU.b(cls, this.e.f()) : b;
    }
}
