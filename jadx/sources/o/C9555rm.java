package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: o.rm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9555rm implements InterfaceC9489qZ<C9555rm> {
    protected Class<?> a;
    protected JsonTypeInfo.Id c;
    protected InterfaceC9545rc d;
    protected JsonTypeInfo.As g;
    protected String i;
    protected boolean j = false;

    @Override // o.InterfaceC9489qZ
    /* renamed from: a */
    public C9555rm d(boolean z) {
        this.j = z;
        return this;
    }

    @Override // o.InterfaceC9489qZ
    public Class<?> d() {
        return this.a;
    }

    @Override // o.InterfaceC9489qZ
    /* renamed from: d */
    public C9555rm e(Class<?> cls) {
        this.a = cls;
        return this;
    }

    public static C9555rm a() {
        return new C9555rm().d(JsonTypeInfo.Id.NONE, null);
    }

    @Override // o.InterfaceC9489qZ
    /* renamed from: e */
    public C9555rm d(JsonTypeInfo.Id id, InterfaceC9545rc interfaceC9545rc) {
        if (id == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this.c = id;
        this.d = interfaceC9545rc;
        this.i = id.e();
        return this;
    }

    @Override // o.InterfaceC9489qZ
    public AbstractC9544rb d(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this.c == JsonTypeInfo.Id.NONE || javaType.C()) {
            return null;
        }
        InterfaceC9545rc d = d(serializationConfig, javaType, c(serializationConfig), collection, true, false);
        int i = AnonymousClass4.e[this.g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new C9548rf(d, null, this.i);
                        }
                        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.g);
                    }
                    return new C9549rg(d, null, this.i);
                }
                return new C9550rh(d, null);
            }
            return new C9547re(d, null, this.i);
        }
        return new C9551ri(d, null);
    }

    @Override // o.InterfaceC9489qZ
    public AbstractC9543ra b(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this.c == JsonTypeInfo.Id.NONE || javaType.C()) {
            return null;
        }
        InterfaceC9545rc d = d(deserializationConfig, javaType, a((MapperConfig<?>) deserializationConfig, javaType), collection, false, true);
        JavaType a = a(deserializationConfig, javaType);
        int i = AnonymousClass4.e[this.g.ordinal()];
        if (i == 1) {
            return new AsArrayTypeDeserializer(javaType, d, this.i, this.j, a);
        }
        if (i != 2) {
            if (i == 3) {
                return new AsWrapperTypeDeserializer(javaType, d, this.i, this.j, a);
            }
            if (i == 4) {
                return new AsExternalTypeDeserializer(javaType, d, this.i, this.j, a);
            }
            if (i != 5) {
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.g);
            }
        }
        return new AsPropertyTypeDeserializer(javaType, d, this.i, this.j, a, this.g);
    }

    protected JavaType a(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this.a;
        if (cls == null) {
            if (deserializationConfig.a(MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL) && !javaType.s()) {
                return javaType;
            }
        } else if (cls == Void.class || cls == C9414pD.class) {
            return deserializationConfig.t().d((Type) this.a);
        } else {
            if (javaType.d(cls)) {
                return javaType;
            }
            if (javaType.b(this.a)) {
                return deserializationConfig.t().d(javaType, this.a);
            }
        }
        return null;
    }

    @Override // o.InterfaceC9489qZ
    /* renamed from: b */
    public C9555rm c(JsonTypeInfo.As as) {
        if (as != null) {
            this.g = as;
            return this;
        }
        throw new IllegalArgumentException("includeAs cannot be null");
    }

    @Override // o.InterfaceC9489qZ
    /* renamed from: b */
    public C9555rm e(String str) {
        if (str == null || str.length() == 0) {
            str = this.c.e();
        }
        this.i = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.rm$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonTypeInfo.Id.values().length];
            b = iArr;
            try {
                iArr[JsonTypeInfo.Id.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[JsonTypeInfo.Id.MINIMAL_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[JsonTypeInfo.Id.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[JsonTypeInfo.Id.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[JsonTypeInfo.Id.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonTypeInfo.As.values().length];
            e = iArr2;
            try {
                iArr2[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[JsonTypeInfo.As.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                e[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                e[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    protected InterfaceC9545rc d(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator, Collection<NamedType> collection, boolean z, boolean z2) {
        InterfaceC9545rc interfaceC9545rc = this.d;
        if (interfaceC9545rc != null) {
            return interfaceC9545rc;
        }
        JsonTypeInfo.Id id = this.c;
        if (id == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int i = AnonymousClass4.b[id.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.c);
                }
                return C9559rq.d(mapperConfig, javaType, collection, z, z2);
            }
            return C9553rk.e(javaType, mapperConfig, polymorphicTypeValidator);
        }
        return C9554rl.d(javaType, mapperConfig, polymorphicTypeValidator);
    }

    public PolymorphicTypeValidator c(MapperConfig<?> mapperConfig) {
        return mapperConfig.q();
    }

    protected PolymorphicTypeValidator a(MapperConfig<?> mapperConfig, JavaType javaType) {
        PolymorphicTypeValidator c = c(mapperConfig);
        JsonTypeInfo.Id id = this.c;
        if (id == JsonTypeInfo.Id.CLASS || id == JsonTypeInfo.Id.MINIMAL_CLASS) {
            PolymorphicTypeValidator.Validity c2 = c.c(mapperConfig, javaType);
            if (c2 == PolymorphicTypeValidator.Validity.DENIED) {
                return d(mapperConfig, javaType, c);
            }
            if (c2 == PolymorphicTypeValidator.Validity.ALLOWED) {
                return LaissezFaireSubTypeValidator.d;
            }
        }
        return c;
    }

    protected PolymorphicTypeValidator d(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw new IllegalArgumentException(String.format("Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s", C9537rU.d(polymorphicTypeValidator), C9537rU.d((Object) javaType.h())));
    }
}
