package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import o.AbstractC9413pC;
import o.AbstractC9415pE;
import o.AbstractC9445pi;
import o.AbstractC9464qA;
import o.AbstractC9509qt;
import o.C9508qs;
import o.C9537rU;
import o.InterfaceC9327nW;
import o.InterfaceC9416pF;
import o.InterfaceC9489qZ;
import o.InterfaceC9545rc;

/* loaded from: classes5.dex */
public abstract class MapperConfig<T extends MapperConfig<T>> implements AbstractC9464qA.c, Serializable {
    private static final long serialVersionUID = 2;
    public final int l;
    public final BaseSettings m;
    protected static final JsonInclude.Value k = JsonInclude.Value.a();
    protected static final JsonFormat.Value h = JsonFormat.Value.d();

    public abstract AbstractC9413pC a(Class<?> cls);

    public abstract VisibilityChecker<?> d(Class<?> cls, C9508qs c9508qs);

    public abstract JsonInclude.Value e(Class<?> cls, Class<?> cls2);

    public abstract JsonInclude.Value g(Class<?> cls);

    public abstract JsonFormat.Value h(Class<?> cls);

    public abstract Boolean k();

    public abstract JsonSetter.Value l();

    /* JADX INFO: Access modifiers changed from: protected */
    public MapperConfig(BaseSettings baseSettings, int i) {
        this.m = baseSettings;
        this.l = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MapperConfig(MapperConfig<T> mapperConfig, int i) {
        this.m = mapperConfig.m;
        this.l = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MapperConfig(MapperConfig<T> mapperConfig, BaseSettings baseSettings) {
        this.m = baseSettings;
        this.l = mapperConfig.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MapperConfig(MapperConfig<T> mapperConfig) {
        this.m = mapperConfig.m;
        this.l = mapperConfig.l;
    }

    public static <F extends Enum<F> & InterfaceC9416pF> int e(Class<F> cls) {
        int i = 0;
        for (Enum r3 : (Enum[]) cls.getEnumConstants()) {
            InterfaceC9416pF interfaceC9416pF = (InterfaceC9416pF) r3;
            if (interfaceC9416pF.b()) {
                i |= interfaceC9416pF.d();
            }
        }
        return i;
    }

    public final boolean a(MapperFeature mapperFeature) {
        return (mapperFeature.d() & this.l) != 0;
    }

    public final boolean p() {
        return a(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean f() {
        return a(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public final boolean x() {
        return a(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public InterfaceC9327nW a(String str) {
        return new SerializedString(str);
    }

    public AbstractC9464qA g() {
        return this.m.c();
    }

    public AnnotationIntrospector h() {
        if (a(MapperFeature.USE_ANNOTATIONS)) {
            return this.m.b();
        }
        return NopAnnotationIntrospector.c;
    }

    public final PropertyNamingStrategy r() {
        return this.m.f();
    }

    public final AbstractC9415pE n() {
        return this.m.j();
    }

    public final InterfaceC9489qZ<?> d(JavaType javaType) {
        return this.m.o();
    }

    public PolymorphicTypeValidator q() {
        return this.m.g();
    }

    public final TypeFactory t() {
        return this.m.m();
    }

    public final JavaType b(Class<?> cls) {
        return t().d((Type) cls);
    }

    public JavaType d(JavaType javaType, Class<?> cls) {
        return t().d(javaType, cls);
    }

    public AbstractC9445pi j(Class<?> cls) {
        return j(b(cls));
    }

    public AbstractC9445pi j(JavaType javaType) {
        return g().d((MapperConfig<?>) this, javaType, (AbstractC9464qA.c) this);
    }

    public JsonInclude.Value a(Class<?> cls, JsonInclude.Value value) {
        JsonInclude.Value a = a(cls).a();
        return a != null ? a : value;
    }

    public JsonInclude.Value b(Class<?> cls, Class<?> cls2, JsonInclude.Value value) {
        return JsonInclude.Value.c(value, a(cls).a(), a(cls2).c());
    }

    public final DateFormat m() {
        return this.m.a();
    }

    public final Locale o() {
        return this.m.h();
    }

    public final TimeZone s() {
        return this.m.i();
    }

    public Base64Variant i() {
        return this.m.e();
    }

    public InterfaceC9489qZ<?> b(AbstractC9509qt abstractC9509qt, Class<? extends InterfaceC9489qZ<?>> cls) {
        InterfaceC9489qZ<?> i;
        AbstractC9415pE n = n();
        return (n == null || (i = n.i(this, abstractC9509qt, cls)) == null) ? (InterfaceC9489qZ) C9537rU.b(cls, f()) : i;
    }

    public InterfaceC9545rc a(AbstractC9509qt abstractC9509qt, Class<? extends InterfaceC9545rc> cls) {
        InterfaceC9545rc a;
        AbstractC9415pE n = n();
        return (n == null || (a = n.a((MapperConfig<?>) this, abstractC9509qt, (Class<?>) cls)) == null) ? (InterfaceC9545rc) C9537rU.b(cls, f()) : a;
    }
}
