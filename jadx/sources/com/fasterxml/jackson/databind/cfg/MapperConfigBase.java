package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import o.AbstractC9413pC;
import o.AbstractC9415pE;
import o.AbstractC9464qA;
import o.AbstractC9546rd;
import o.C9508qs;
import o.InterfaceC9416pF;
import o.InterfaceC9489qZ;

/* loaded from: classes5.dex */
public abstract class MapperConfigBase<CFG extends InterfaceC9416pF, T extends MapperConfigBase<CFG, T>> extends MapperConfig<T> implements Serializable {
    private static final int e;
    public final ContextAttributes n;
    protected final ConfigOverrides p;
    public final AbstractC9546rd q;
    protected final RootNameLookup r;
    public final PropertyName s;
    protected final SimpleMixInResolver t;
    public final Class<?> v;

    /* renamed from: o  reason: collision with root package name */
    protected static final AbstractC9413pC f13103o = AbstractC9413pC.b();
    private static final int c = MapperConfig.e(MapperFeature.class);

    public final PropertyName A() {
        return this.s;
    }

    protected abstract T e(int i);

    protected abstract T e(BaseSettings baseSettings);

    public final ContextAttributes v() {
        return this.n;
    }

    public final Class<?> y() {
        return this.v;
    }

    public final AbstractC9546rd z() {
        return this.q;
    }

    static {
        int d = MapperFeature.AUTO_DETECT_FIELDS.d();
        int d2 = MapperFeature.AUTO_DETECT_GETTERS.d();
        e = d | d2 | MapperFeature.AUTO_DETECT_IS_GETTERS.d() | MapperFeature.AUTO_DETECT_SETTERS.d() | MapperFeature.AUTO_DETECT_CREATORS.d();
    }

    public MapperConfigBase(BaseSettings baseSettings, AbstractC9546rd abstractC9546rd, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, c);
        this.t = simpleMixInResolver;
        this.q = abstractC9546rd;
        this.r = rootNameLookup;
        this.s = null;
        this.v = null;
        this.n = ContextAttributes.a();
        this.p = configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(mapperConfigBase, mapperConfigBase.m.d());
        this.t = simpleMixInResolver;
        this.q = mapperConfigBase.q;
        this.r = rootNameLookup;
        this.s = mapperConfigBase.s;
        this.v = mapperConfigBase.v;
        this.n = mapperConfigBase.n;
        this.p = configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase) {
        super(mapperConfigBase);
        this.t = mapperConfigBase.t;
        this.q = mapperConfigBase.q;
        this.r = mapperConfigBase.r;
        this.s = mapperConfigBase.s;
        this.v = mapperConfigBase.v;
        this.n = mapperConfigBase.n;
        this.p = mapperConfigBase.p;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, BaseSettings baseSettings) {
        super(mapperConfigBase, baseSettings);
        this.t = mapperConfigBase.t;
        this.q = mapperConfigBase.q;
        this.r = mapperConfigBase.r;
        this.s = mapperConfigBase.s;
        this.v = mapperConfigBase.v;
        this.n = mapperConfigBase.n;
        this.p = mapperConfigBase.p;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, int i) {
        super(mapperConfigBase, i);
        this.t = mapperConfigBase.t;
        this.q = mapperConfigBase.q;
        this.r = mapperConfigBase.r;
        this.s = mapperConfigBase.s;
        this.v = mapperConfigBase.v;
        this.n = mapperConfigBase.n;
        this.p = mapperConfigBase.p;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, AbstractC9546rd abstractC9546rd) {
        super(mapperConfigBase);
        this.t = mapperConfigBase.t;
        this.q = abstractC9546rd;
        this.r = mapperConfigBase.r;
        this.s = mapperConfigBase.s;
        this.v = mapperConfigBase.v;
        this.n = mapperConfigBase.n;
        this.p = mapperConfigBase.p;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, Class<?> cls) {
        super(mapperConfigBase);
        this.t = mapperConfigBase.t;
        this.q = mapperConfigBase.q;
        this.r = mapperConfigBase.r;
        this.s = mapperConfigBase.s;
        this.v = cls;
        this.n = mapperConfigBase.n;
        this.p = mapperConfigBase.p;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, SimpleMixInResolver simpleMixInResolver) {
        super(mapperConfigBase);
        this.t = simpleMixInResolver;
        this.q = mapperConfigBase.q;
        this.r = mapperConfigBase.r;
        this.s = mapperConfigBase.s;
        this.v = mapperConfigBase.v;
        this.n = mapperConfigBase.n;
        this.p = mapperConfigBase.p;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, ContextAttributes contextAttributes) {
        super(mapperConfigBase);
        this.t = mapperConfigBase.t;
        this.q = mapperConfigBase.q;
        this.r = mapperConfigBase.r;
        this.s = mapperConfigBase.s;
        this.v = mapperConfigBase.v;
        this.n = contextAttributes;
        this.p = mapperConfigBase.p;
    }

    public final T a(MapperFeature... mapperFeatureArr) {
        int i = this.l;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            i |= mapperFeature.d();
        }
        return i == this.l ? this : e(i);
    }

    public final T b(MapperFeature... mapperFeatureArr) {
        int i = this.l;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            i &= ~mapperFeature.d();
        }
        return i == this.l ? this : e(i);
    }

    public final T d(AnnotationIntrospector annotationIntrospector) {
        return e(this.m.c(annotationIntrospector));
    }

    public final T c(TypeFactory typeFactory) {
        return e(this.m.c(typeFactory));
    }

    public final T c(InterfaceC9489qZ<?> interfaceC9489qZ) {
        return e(this.m.a(interfaceC9489qZ));
    }

    public final T d(PropertyNamingStrategy propertyNamingStrategy) {
        return e(this.m.e(propertyNamingStrategy));
    }

    public final T a(AbstractC9415pE abstractC9415pE) {
        return e(this.m.d(abstractC9415pE));
    }

    public final T c(Base64Variant base64Variant) {
        return e(this.m.d(base64Variant));
    }

    public T e(DateFormat dateFormat) {
        return e(this.m.c(dateFormat));
    }

    public final T b(Locale locale) {
        return e(this.m.d(locale));
    }

    public final T b(TimeZone timeZone) {
        return e(this.m.b(timeZone));
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final AbstractC9413pC a(Class<?> cls) {
        AbstractC9413pC c2 = this.p.c(cls);
        return c2 == null ? f13103o : c2;
    }

    public final JsonInclude.Value u() {
        return this.p.d();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value g(Class<?> cls) {
        JsonInclude.Value a = a(cls).a();
        JsonInclude.Value u = u();
        return u == null ? a : u.b(a);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value e(Class<?> cls, Class<?> cls2) {
        JsonInclude.Value c2 = a(cls2).c();
        JsonInclude.Value g = g(cls);
        return g == null ? c2 : g.b(c2);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonFormat.Value h(Class<?> cls) {
        return this.p.b(cls);
    }

    public final JsonIgnoreProperties.Value k(Class<?> cls) {
        JsonIgnoreProperties.Value e2;
        AbstractC9413pC c2 = this.p.c(cls);
        if (c2 == null || (e2 = c2.e()) == null) {
            return null;
        }
        return e2;
    }

    public final JsonIgnoreProperties.Value a(Class<?> cls, C9508qs c9508qs) {
        AnnotationIntrospector h = h();
        return JsonIgnoreProperties.Value.b(h == null ? null : h.p(c9508qs), k(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?>] */
    public final VisibilityChecker<?> D() {
        VisibilityChecker<?> i = this.p.i();
        int i2 = this.l;
        int i3 = e;
        if ((i2 & i3) != i3) {
            VisibilityChecker<?> visibilityChecker = i;
            if (!a(MapperFeature.AUTO_DETECT_FIELDS)) {
                visibilityChecker = i.c(JsonAutoDetect.Visibility.NONE);
            }
            VisibilityChecker<?> visibilityChecker2 = visibilityChecker;
            if (!a(MapperFeature.AUTO_DETECT_GETTERS)) {
                visibilityChecker2 = visibilityChecker.e(JsonAutoDetect.Visibility.NONE);
            }
            VisibilityChecker<?> visibilityChecker3 = visibilityChecker2;
            if (!a(MapperFeature.AUTO_DETECT_IS_GETTERS)) {
                visibilityChecker3 = visibilityChecker2.b(JsonAutoDetect.Visibility.NONE);
            }
            VisibilityChecker<?> visibilityChecker4 = visibilityChecker3;
            if (!a(MapperFeature.AUTO_DETECT_SETTERS)) {
                visibilityChecker4 = visibilityChecker3.a(JsonAutoDetect.Visibility.NONE);
            }
            return !a(MapperFeature.AUTO_DETECT_CREATORS) ? visibilityChecker4.d(JsonAutoDetect.Visibility.NONE) : visibilityChecker4;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?>] */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final VisibilityChecker<?> d(Class<?> cls, C9508qs c9508qs) {
        VisibilityChecker<?> D = D();
        AnnotationIntrospector h = h();
        if (h != null) {
            D = h.b(c9508qs, D);
        }
        AbstractC9413pC c2 = this.p.c(cls);
        return c2 != null ? D.e(c2.f()) : D;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonSetter.Value l() {
        return this.p.a();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public Boolean k() {
        return this.p.b();
    }

    public Boolean l(Class<?> cls) {
        Boolean g;
        AbstractC9413pC c2 = this.p.c(cls);
        return (c2 == null || (g = c2.g()) == null) ? this.p.b() : g;
    }

    public PropertyName i(JavaType javaType) {
        PropertyName propertyName = this.s;
        return propertyName != null ? propertyName : this.r.e(javaType, this);
    }

    public PropertyName f(Class<?> cls) {
        PropertyName propertyName = this.s;
        return propertyName != null ? propertyName : this.r.a(cls, this);
    }

    @Override // o.AbstractC9464qA.c
    public final Class<?> i(Class<?> cls) {
        return this.t.i(cls);
    }

    @Override // o.AbstractC9464qA.c
    public AbstractC9464qA.c w() {
        throw new UnsupportedOperationException();
    }
}
