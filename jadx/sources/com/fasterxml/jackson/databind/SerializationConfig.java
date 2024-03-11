package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;
import o.AbstractC9445pi;
import o.AbstractC9464qA;
import o.AbstractC9519rC;
import o.AbstractC9546rd;
import o.InterfaceC9326nV;
import o.InterfaceC9437pa;

/* loaded from: classes5.dex */
public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    protected static final InterfaceC9326nV c = new DefaultPrettyPrinter();
    private static final int f = MapperConfig.e(SerializationFeature.class);
    private static final long serialVersionUID = 1;
    protected final AbstractC9519rC a;
    protected final InterfaceC9326nV b;
    protected final int d;
    protected final int e;
    protected final int g;
    protected final int i;
    protected final int j;

    public InterfaceC9326nV c() {
        return this.b;
    }

    public AbstractC9519rC d() {
        return this.a;
    }

    public SerializationConfig(BaseSettings baseSettings, AbstractC9546rd abstractC9546rd, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, abstractC9546rd, simpleMixInResolver, rootNameLookup, configOverrides);
        this.g = f;
        this.a = null;
        this.b = c;
        this.j = 0;
        this.i = 0;
        this.e = 0;
        this.d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(serializationConfig, simpleMixInResolver, rootNameLookup, configOverrides);
        this.g = serializationConfig.g;
        this.a = serializationConfig.a;
        this.b = serializationConfig.b;
        this.j = serializationConfig.j;
        this.i = serializationConfig.i;
        this.e = serializationConfig.e;
        this.d = serializationConfig.d;
    }

    private SerializationConfig(SerializationConfig serializationConfig, AbstractC9546rd abstractC9546rd) {
        super(serializationConfig, abstractC9546rd);
        this.g = serializationConfig.g;
        this.a = serializationConfig.a;
        this.b = serializationConfig.b;
        this.j = serializationConfig.j;
        this.i = serializationConfig.i;
        this.e = serializationConfig.e;
        this.d = serializationConfig.d;
    }

    private SerializationConfig(SerializationConfig serializationConfig, int i, int i2, int i3, int i4, int i5, int i6) {
        super(serializationConfig, i);
        this.g = i2;
        this.a = serializationConfig.a;
        this.b = serializationConfig.b;
        this.j = i3;
        this.i = i4;
        this.e = i5;
        this.d = i6;
    }

    private SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super(serializationConfig, baseSettings);
        this.g = serializationConfig.g;
        this.a = serializationConfig.a;
        this.b = serializationConfig.b;
        this.j = serializationConfig.j;
        this.i = serializationConfig.i;
        this.e = serializationConfig.e;
        this.d = serializationConfig.d;
    }

    private SerializationConfig(SerializationConfig serializationConfig, AbstractC9519rC abstractC9519rC) {
        super(serializationConfig);
        this.g = serializationConfig.g;
        this.a = abstractC9519rC;
        this.b = serializationConfig.b;
        this.j = serializationConfig.j;
        this.i = serializationConfig.i;
        this.e = serializationConfig.e;
        this.d = serializationConfig.d;
    }

    private SerializationConfig(SerializationConfig serializationConfig, Class<?> cls) {
        super(serializationConfig, cls);
        this.g = serializationConfig.g;
        this.a = serializationConfig.a;
        this.b = serializationConfig.b;
        this.j = serializationConfig.j;
        this.i = serializationConfig.i;
        this.e = serializationConfig.e;
        this.d = serializationConfig.d;
    }

    protected SerializationConfig(SerializationConfig serializationConfig, ContextAttributes contextAttributes) {
        super(serializationConfig, contextAttributes);
        this.g = serializationConfig.g;
        this.a = serializationConfig.a;
        this.b = serializationConfig.b;
        this.j = serializationConfig.j;
        this.i = serializationConfig.i;
        this.e = serializationConfig.e;
        this.d = serializationConfig.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(serializationConfig, simpleMixInResolver);
        this.g = serializationConfig.g;
        this.a = serializationConfig.a;
        this.b = serializationConfig.b;
        this.j = serializationConfig.j;
        this.i = serializationConfig.i;
        this.e = serializationConfig.e;
        this.d = serializationConfig.d;
    }

    protected SerializationConfig(SerializationConfig serializationConfig, InterfaceC9326nV interfaceC9326nV) {
        super(serializationConfig);
        this.g = serializationConfig.g;
        this.a = serializationConfig.a;
        this.b = interfaceC9326nV;
        this.j = serializationConfig.j;
        this.i = serializationConfig.i;
        this.e = serializationConfig.e;
        this.d = serializationConfig.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* renamed from: c */
    public final SerializationConfig e(BaseSettings baseSettings) {
        return this.m == baseSettings ? this : new SerializationConfig(this, baseSettings);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* renamed from: a */
    public final SerializationConfig e(int i) {
        return new SerializationConfig(this, i, this.g, this.j, this.i, this.e, this.d);
    }

    public SerializationConfig a(AbstractC9546rd abstractC9546rd) {
        return abstractC9546rd == this.q ? this : new SerializationConfig(this, abstractC9546rd);
    }

    public SerializationConfig c(Class<?> cls) {
        return this.v == cls ? this : new SerializationConfig(this, cls);
    }

    public SerializationConfig e(ContextAttributes contextAttributes) {
        return contextAttributes == this.n ? this : new SerializationConfig(this, contextAttributes);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* renamed from: a */
    public SerializationConfig e(DateFormat dateFormat) {
        SerializationConfig serializationConfig = (SerializationConfig) super.e(dateFormat);
        if (dateFormat == null) {
            return serializationConfig.a(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.b(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig a(SerializationFeature serializationFeature) {
        int d = this.g | serializationFeature.d();
        return d == this.g ? this : new SerializationConfig(this, this.l, d, this.j, this.i, this.e, this.d);
    }

    public SerializationConfig d(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int i = this.g;
        int d = serializationFeature.d() | i;
        int i2 = d;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            i2 |= serializationFeature2.d();
        }
        return i2 == this.g ? this : new SerializationConfig(this, this.l, i2, this.j, this.i, this.e, this.d);
    }

    public SerializationConfig b(SerializationFeature serializationFeature) {
        int i = this.g & (~serializationFeature.d());
        return i == this.g ? this : new SerializationConfig(this, this.l, i, this.j, this.i, this.e, this.d);
    }

    public SerializationConfig b(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int i = (~serializationFeature.d()) & this.g;
        int i2 = i;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            i2 &= ~serializationFeature2.d();
        }
        return i2 == this.g ? this : new SerializationConfig(this, this.l, i2, this.j, this.i, this.e, this.d);
    }

    public SerializationConfig a(AbstractC9519rC abstractC9519rC) {
        return abstractC9519rC == this.a ? this : new SerializationConfig(this, abstractC9519rC);
    }

    public SerializationConfig a(InterfaceC9326nV interfaceC9326nV) {
        return this.b == interfaceC9326nV ? this : new SerializationConfig(this, interfaceC9326nV);
    }

    public InterfaceC9326nV a() {
        InterfaceC9326nV interfaceC9326nV = this.b;
        return interfaceC9326nV instanceof InterfaceC9437pa ? (InterfaceC9326nV) ((InterfaceC9437pa) interfaceC9326nV).e() : interfaceC9326nV;
    }

    public void b(JsonGenerator jsonGenerator) {
        InterfaceC9326nV a;
        if (SerializationFeature.INDENT_OUTPUT.d(this.g) && jsonGenerator.f() == null && (a = a()) != null) {
            jsonGenerator.a(a);
        }
        boolean d = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.d(this.g);
        int i = this.i;
        if (i != 0 || d) {
            int i2 = this.j;
            if (d) {
                int c2 = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.c();
                i2 |= c2;
                i |= c2;
            }
            jsonGenerator.d(i2, i);
        }
        int i3 = this.d;
        if (i3 != 0) {
            jsonGenerator.b(this.e, i3);
        }
    }

    public final boolean c(SerializationFeature serializationFeature) {
        return (serializationFeature.d() & this.g) != 0;
    }

    public final boolean a(JsonGenerator.Feature feature, JsonFactory jsonFactory) {
        if ((feature.c() & this.i) != 0) {
            return (feature.c() & this.j) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    public <T extends AbstractC9445pi> T b(JavaType javaType) {
        return (T) g().d(this, javaType, (AbstractC9464qA.c) this);
    }
}
