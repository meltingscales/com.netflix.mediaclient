package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.util.Collection;
import o.AbstractC9425pO;
import o.AbstractC9445pi;
import o.AbstractC9543ra;
import o.AbstractC9546rd;
import o.C9508qs;
import o.C9536rT;
import o.InterfaceC9489qZ;

/* loaded from: classes5.dex */
public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> implements Serializable {
    private static final int j = MapperConfig.e(DeserializationFeature.class);
    private static final long serialVersionUID = 2;
    protected final int a;
    protected final JsonNodeFactory b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected final int f;
    protected final C9536rT<AbstractC9425pO> g;

    public final JsonNodeFactory b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseSettings d() {
        return this.m;
    }

    public C9536rT<AbstractC9425pO> e() {
        return this.g;
    }

    public DeserializationConfig(BaseSettings baseSettings, AbstractC9546rd abstractC9546rd, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, abstractC9546rd, simpleMixInResolver, rootNameLookup, configOverrides);
        this.c = j;
        this.b = JsonNodeFactory.a;
        this.g = null;
        this.d = 0;
        this.f = 0;
        this.a = 0;
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(deserializationConfig, simpleMixInResolver, rootNameLookup, configOverrides);
        this.c = deserializationConfig.c;
        this.g = deserializationConfig.g;
        this.b = deserializationConfig.b;
        this.d = deserializationConfig.d;
        this.f = deserializationConfig.f;
        this.a = deserializationConfig.a;
        this.e = deserializationConfig.e;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, int i, int i2, int i3, int i4, int i5, int i6) {
        super(deserializationConfig, i);
        this.c = i2;
        this.b = deserializationConfig.b;
        this.g = deserializationConfig.g;
        this.d = i3;
        this.f = i4;
        this.a = i5;
        this.e = i6;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, AbstractC9546rd abstractC9546rd) {
        super(deserializationConfig, abstractC9546rd);
        this.c = deserializationConfig.c;
        this.b = deserializationConfig.b;
        this.g = deserializationConfig.g;
        this.d = deserializationConfig.d;
        this.f = deserializationConfig.f;
        this.a = deserializationConfig.a;
        this.e = deserializationConfig.e;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, BaseSettings baseSettings) {
        super(deserializationConfig, baseSettings);
        this.c = deserializationConfig.c;
        this.b = deserializationConfig.b;
        this.g = deserializationConfig.g;
        this.d = deserializationConfig.d;
        this.f = deserializationConfig.f;
        this.a = deserializationConfig.a;
        this.e = deserializationConfig.e;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, JsonNodeFactory jsonNodeFactory) {
        super(deserializationConfig);
        this.c = deserializationConfig.c;
        this.g = deserializationConfig.g;
        this.b = jsonNodeFactory;
        this.d = deserializationConfig.d;
        this.f = deserializationConfig.f;
        this.a = deserializationConfig.a;
        this.e = deserializationConfig.e;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, C9536rT<AbstractC9425pO> c9536rT) {
        super(deserializationConfig);
        this.c = deserializationConfig.c;
        this.g = c9536rT;
        this.b = deserializationConfig.b;
        this.d = deserializationConfig.d;
        this.f = deserializationConfig.f;
        this.a = deserializationConfig.a;
        this.e = deserializationConfig.e;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, Class<?> cls) {
        super(deserializationConfig, cls);
        this.c = deserializationConfig.c;
        this.g = deserializationConfig.g;
        this.b = deserializationConfig.b;
        this.d = deserializationConfig.d;
        this.f = deserializationConfig.f;
        this.a = deserializationConfig.a;
        this.e = deserializationConfig.e;
    }

    protected DeserializationConfig(DeserializationConfig deserializationConfig, ContextAttributes contextAttributes) {
        super(deserializationConfig, contextAttributes);
        this.c = deserializationConfig.c;
        this.g = deserializationConfig.g;
        this.b = deserializationConfig.b;
        this.d = deserializationConfig.d;
        this.f = deserializationConfig.f;
        this.a = deserializationConfig.a;
        this.e = deserializationConfig.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(deserializationConfig, simpleMixInResolver);
        this.c = deserializationConfig.c;
        this.g = deserializationConfig.g;
        this.b = deserializationConfig.b;
        this.d = deserializationConfig.d;
        this.f = deserializationConfig.f;
        this.a = deserializationConfig.a;
        this.e = deserializationConfig.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* renamed from: b */
    public final DeserializationConfig e(BaseSettings baseSettings) {
        return this.m == baseSettings ? this : new DeserializationConfig(this, baseSettings);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* renamed from: c */
    public final DeserializationConfig e(int i) {
        return new DeserializationConfig(this, i, this.c, this.d, this.f, this.a, this.e);
    }

    public DeserializationConfig e(AbstractC9546rd abstractC9546rd) {
        return this.q == abstractC9546rd ? this : new DeserializationConfig(this, abstractC9546rd);
    }

    public DeserializationConfig d(Class<?> cls) {
        return this.v == cls ? this : new DeserializationConfig(this, cls);
    }

    public DeserializationConfig d(ContextAttributes contextAttributes) {
        return contextAttributes == this.n ? this : new DeserializationConfig(this, contextAttributes);
    }

    public DeserializationConfig c(DeserializationFeature deserializationFeature) {
        int d = this.c | deserializationFeature.d();
        return d == this.c ? this : new DeserializationConfig(this, this.l, d, this.d, this.f, this.a, this.e);
    }

    public DeserializationConfig a(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int i = this.c;
        int d = deserializationFeature.d() | i;
        int i2 = d;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            i2 |= deserializationFeature2.d();
        }
        return i2 == this.c ? this : new DeserializationConfig(this, this.l, i2, this.d, this.f, this.a, this.e);
    }

    public DeserializationConfig a(DeserializationFeature deserializationFeature) {
        int i = this.c & (~deserializationFeature.d());
        return i == this.c ? this : new DeserializationConfig(this, this.l, i, this.d, this.f, this.a, this.e);
    }

    public DeserializationConfig c(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int i = (~deserializationFeature.d()) & this.c;
        int i2 = i;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            i2 &= ~deserializationFeature2.d();
        }
        return i2 == this.c ? this : new DeserializationConfig(this, this.l, i2, this.d, this.f, this.a, this.e);
    }

    public DeserializationConfig c(JsonNodeFactory jsonNodeFactory) {
        return this.b == jsonNodeFactory ? this : new DeserializationConfig(this, jsonNodeFactory);
    }

    public DeserializationConfig c(AbstractC9425pO abstractC9425pO) {
        return C9536rT.c(this.g, abstractC9425pO) ? this : new DeserializationConfig(this, new C9536rT(abstractC9425pO, this.g));
    }

    public DeserializationConfig j() {
        return this.g == null ? this : new DeserializationConfig(this, (C9536rT<AbstractC9425pO>) null);
    }

    public void d(JsonParser jsonParser) {
        int i = this.f;
        if (i != 0) {
            jsonParser.d(this.d, i);
        }
        int i2 = this.e;
        if (i2 != 0) {
            jsonParser.c(this.a, i2);
        }
    }

    public boolean a() {
        PropertyName propertyName = this.s;
        if (propertyName != null) {
            return !propertyName.e();
        }
        return e(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    public final boolean e(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.d() & this.c) != 0;
    }

    public final boolean a(JsonParser.Feature feature, JsonFactory jsonFactory) {
        if ((feature.b() & this.f) != 0) {
            return (feature.b() & this.d) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    public <T extends AbstractC9445pi> T a(JavaType javaType) {
        return (T) g().c(this, javaType, this);
    }

    public <T extends AbstractC9445pi> T e(JavaType javaType) {
        return (T) g().e(this, javaType, this);
    }

    public <T extends AbstractC9445pi> T b(JavaType javaType) {
        return (T) g().b(this, javaType, this);
    }

    public AbstractC9543ra c(JavaType javaType) {
        Collection<NamedType> e;
        C9508qs k = j(javaType.h()).k();
        InterfaceC9489qZ<?> d = h().d(this, k, javaType);
        if (d == null) {
            d = d(javaType);
            e = null;
            if (d == null) {
                return null;
            }
        } else {
            e = z().e(this, k);
        }
        return d.b(this, javaType, e);
    }
}
