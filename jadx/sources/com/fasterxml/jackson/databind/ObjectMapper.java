package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC9378oU;
import o.AbstractC9380oW;
import o.AbstractC9415pE;
import o.AbstractC9425pO;
import o.AbstractC9447pk;
import o.AbstractC9452pp;
import o.AbstractC9454pr;
import o.AbstractC9457pu;
import o.AbstractC9459pw;
import o.AbstractC9464qA;
import o.AbstractC9519rC;
import o.AbstractC9521rE;
import o.AbstractC9543ra;
import o.AbstractC9544rb;
import o.AbstractC9546rd;
import o.C9322nR;
import o.C9396om;
import o.C9418pH;
import o.C9439pc;
import o.C9456pt;
import o.C9488qY;
import o.C9537rU;
import o.C9542rZ;
import o.C9555rm;
import o.C9558rp;
import o.InterfaceC9324nT;
import o.InterfaceC9326nV;
import o.InterfaceC9330nZ;
import o.InterfaceC9478qO;
import o.InterfaceC9489qZ;

/* loaded from: classes5.dex */
public class ObjectMapper extends ObjectCodec implements Serializable {
    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    private static final long serialVersionUID = 2;
    protected final ConfigOverrides _configOverrides;
    protected DeserializationConfig _deserializationConfig;
    protected DefaultDeserializationContext _deserializationContext;
    protected AbstractC9447pk _injectableValues;
    public final JsonFactory _jsonFactory;
    protected SimpleMixInResolver _mixIns;
    protected Set<Object> _registeredModuleTypes;
    protected final ConcurrentHashMap<JavaType, AbstractC9452pp<Object>> _rootDeserializers;
    protected SerializationConfig _serializationConfig;
    protected AbstractC9521rE _serializerFactory;
    protected DefaultSerializerProvider _serializerProvider;
    protected AbstractC9546rd _subtypeResolver;
    protected TypeFactory _typeFactory;

    /* loaded from: classes5.dex */
    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL,
        EVERYTHING
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public DeserializationContext getDeserializationContext() {
        return this._deserializationContext;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public AbstractC9447pk getInjectableValues() {
        return this._injectableValues;
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public AbstractC9521rE getSerializerFactory() {
        return this._serializerFactory;
    }

    public AbstractC9459pw getSerializerProvider() {
        return this._serializerProvider;
    }

    public AbstractC9546rd getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public ObjectMapper setInjectableValues(AbstractC9447pk abstractC9447pk) {
        this._injectableValues = abstractC9447pk;
        return this;
    }

    public ObjectMapper setSerializerFactory(AbstractC9521rE abstractC9521rE) {
        this._serializerFactory = abstractC9521rE;
        return this;
    }

    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        this._serializerProvider = defaultSerializerProvider;
        return this;
    }

    public JsonFactory tokenStreamFactory() {
        return this._jsonFactory;
    }

    /* loaded from: classes5.dex */
    public static class DefaultTypeResolverBuilder extends C9555rm implements Serializable {
        private static final long serialVersionUID = 1;
        protected final DefaultTyping b;
        protected final PolymorphicTypeValidator e;

        @Override // o.C9555rm
        public PolymorphicTypeValidator c(MapperConfig<?> mapperConfig) {
            return this.e;
        }

        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            Objects.requireNonNull(defaultTyping, "Can not pass `null` DefaultTyping");
            this.b = defaultTyping;
            Objects.requireNonNull(polymorphicTypeValidator, "Can not pass `null` PolymorphicTypeValidator");
            this.e = polymorphicTypeValidator;
        }

        public static DefaultTypeResolverBuilder d(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            return new DefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator);
        }

        @Override // o.C9555rm, o.InterfaceC9489qZ
        public AbstractC9543ra b(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (d(javaType)) {
                return super.b(deserializationConfig, javaType, collection);
            }
            return null;
        }

        @Override // o.C9555rm, o.InterfaceC9489qZ
        public AbstractC9544rb d(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (d(javaType)) {
                return super.d(serializationConfig, javaType, collection);
            }
            return null;
        }

        public boolean d(JavaType javaType) {
            if (javaType.C()) {
                return false;
            }
            int i = AnonymousClass5.e[this.b.ordinal()];
            if (i == 1) {
                while (javaType.p()) {
                    javaType = javaType.j();
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return javaType.D();
                    }
                    return true;
                }
                while (javaType.p()) {
                    javaType = javaType.j();
                }
                while (javaType.d()) {
                    javaType = javaType.c();
                }
                return (javaType.v() || InterfaceC9330nZ.class.isAssignableFrom(javaType.h())) ? false : true;
            }
            while (javaType.d()) {
                javaType = javaType.c();
            }
            return javaType.D() || !(javaType.w() || InterfaceC9330nZ.class.isAssignableFrom(javaType.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[DefaultTyping.values().length];
            e = iArr;
            try {
                iArr[DefaultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[DefaultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[DefaultTyping.NON_FINAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[DefaultTyping.EVERYTHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[DefaultTyping.JAVA_LANG_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        DEFAULT_BASE = new BaseSettings(null, jacksonAnnotationIntrospector, null, TypeFactory.a(), null, StdDateFormat.j, null, Locale.getDefault(), null, C9322nR.e(), LaissezFaireSubTypeValidator.d);
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, null, null);
    }

    public ObjectMapper(ObjectMapper objectMapper) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        JsonFactory copy = objectMapper._jsonFactory.copy();
        this._jsonFactory = copy;
        copy.setCodec(this);
        this._subtypeResolver = objectMapper._subtypeResolver;
        this._typeFactory = objectMapper._typeFactory;
        this._injectableValues = objectMapper._injectableValues;
        ConfigOverrides c = objectMapper._configOverrides.c();
        this._configOverrides = c;
        this._mixIns = objectMapper._mixIns.w();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._serializationConfig = new SerializationConfig(objectMapper._serializationConfig, this._mixIns, rootNameLookup, c);
        this._deserializationConfig = new DeserializationConfig(objectMapper._deserializationConfig, this._mixIns, rootNameLookup, c);
        this._serializerProvider = objectMapper._serializerProvider.k();
        this._deserializationContext = objectMapper._deserializationContext.p();
        this._serializerFactory = objectMapper._serializerFactory;
        Set<Object> set = objectMapper._registeredModuleTypes;
        if (set == null) {
            this._registeredModuleTypes = null;
        } else {
            this._registeredModuleTypes = new LinkedHashSet(set);
        }
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.a();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver(null);
        this._mixIns = simpleMixInResolver;
        BaseSettings d = DEFAULT_BASE.d(defaultClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._configOverrides = configOverrides;
        this._serializationConfig = new SerializationConfig(d, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserializationConfig = new DeserializationConfig(d, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        boolean requiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.a(mapperFeature) ^ requiresPropertyOrdering) {
            configure(mapperFeature, requiresPropertyOrdering);
        }
        this._serializerProvider = defaultSerializerProvider == null ? new DefaultSerializerProvider.Impl() : defaultSerializerProvider;
        this._deserializationContext = defaultDeserializationContext == null ? new DefaultDeserializationContext.Impl(BeanDeserializerFactory.e) : defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.c;
    }

    protected AbstractC9464qA defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    public ObjectMapper copy() {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this);
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    protected ObjectReader _newReader(DeserializationConfig deserializationConfig) {
        return new ObjectReader(this, deserializationConfig);
    }

    protected ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, InterfaceC9324nT interfaceC9324nT, AbstractC9447pk abstractC9447pk) {
        return new ObjectReader(this, deserializationConfig, javaType, obj, interfaceC9324nT, abstractC9447pk);
    }

    protected ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    protected ObjectWriter _newWriter(SerializationConfig serializationConfig, InterfaceC9324nT interfaceC9324nT) {
        return new ObjectWriter(this, serializationConfig, interfaceC9324nT);
    }

    protected ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, InterfaceC9326nV interfaceC9326nV) {
        return new ObjectWriter(this, serializationConfig, javaType, interfaceC9326nV);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public Version version() {
        return C9418pH.c;
    }

    public ObjectMapper registerModule(AbstractC9457pu abstractC9457pu) {
        Object d;
        _assertNotNull("module", abstractC9457pu);
        if (abstractC9457pu.e() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (abstractC9457pu.a() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        for (AbstractC9457pu abstractC9457pu2 : abstractC9457pu.c()) {
            registerModule(abstractC9457pu2);
        }
        if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (d = abstractC9457pu.d()) != null) {
            if (this._registeredModuleTypes == null) {
                this._registeredModuleTypes = new LinkedHashSet();
            }
            if (!this._registeredModuleTypes.add(d)) {
                return this;
            }
        }
        abstractC9457pu.b(new AbstractC9457pu.b() { // from class: com.fasterxml.jackson.databind.ObjectMapper.2
        });
        return this;
    }

    public ObjectMapper registerModules(AbstractC9457pu... abstractC9457puArr) {
        for (AbstractC9457pu abstractC9457pu : abstractC9457puArr) {
            registerModule(abstractC9457pu);
        }
        return this;
    }

    public ObjectMapper registerModules(Iterable<? extends AbstractC9457pu> iterable) {
        _assertNotNull("modules", iterable);
        for (AbstractC9457pu abstractC9457pu : iterable) {
            registerModule(abstractC9457pu);
        }
        return this;
    }

    public Set<Object> getRegisteredModuleIds() {
        Set<Object> set = this._registeredModuleTypes;
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    public static List<AbstractC9457pu> findModules() {
        return findModules(null);
    }

    public static List<AbstractC9457pu> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator it = secureGetServiceLoader(AbstractC9457pu.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add((AbstractC9457pu) it.next());
        }
        return arrayList;
    }

    private static <T> ServiceLoader<T> secureGetServiceLoader(final Class<T> cls, final ClassLoader classLoader) {
        if (System.getSecurityManager() == null) {
            return classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader);
        }
        return (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction<ServiceLoader<T>>() { // from class: com.fasterxml.jackson.databind.ObjectMapper.4
            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public ServiceLoader<T> run() {
                ClassLoader classLoader2 = classLoader;
                return classLoader2 == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader2);
            }
        });
    }

    public ObjectMapper findAndRegisterModules() {
        return registerModules(findModules());
    }

    public AbstractC9459pw getSerializerProviderInstance() {
        return _serializerProvider(this._serializationConfig);
    }

    public ObjectMapper setMixIns(Map<Class<?>, Class<?>> map) {
        this._mixIns.b(map);
        return this;
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.d(cls, cls2);
        return this;
    }

    public ObjectMapper setMixInResolver(AbstractC9464qA.c cVar) {
        SimpleMixInResolver c = this._mixIns.c(cVar);
        if (c != this._mixIns) {
            this._mixIns = c;
            this._deserializationConfig = new DeserializationConfig(this._deserializationConfig, c);
            this._serializationConfig = new SerializationConfig(this._serializationConfig, c);
        }
        return this;
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.i(cls);
    }

    public int mixInCount() {
        return this._mixIns.d();
    }

    @Deprecated
    public void setMixInAnnotations(Map<Class<?>, Class<?>> map) {
        setMixIns(map);
    }

    @Deprecated
    public final void addMixInAnnotations(Class<?> cls, Class<?> cls2) {
        addMixIn(cls, cls2);
    }

    public VisibilityChecker<?> getVisibilityChecker() {
        return this._serializationConfig.D();
    }

    public ObjectMapper setVisibility(VisibilityChecker<?> visibilityChecker) {
        this._configOverrides.a(visibilityChecker);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.fasterxml.jackson.databind.introspect.VisibilityChecker] */
    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._configOverrides.a((VisibilityChecker<?>) this._configOverrides.i().c(propertyAccessor, visibility));
        return this;
    }

    public ObjectMapper setSubtypeResolver(AbstractC9546rd abstractC9546rd) {
        this._subtypeResolver = abstractC9546rd;
        this._deserializationConfig = this._deserializationConfig.e(abstractC9546rd);
        this._serializationConfig = this._serializationConfig.a(abstractC9546rd);
        return this;
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._serializationConfig = this._serializationConfig.d(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.d(annotationIntrospector);
        return this;
    }

    public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._serializationConfig = this._serializationConfig.d(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.d(annotationIntrospector2);
        return this;
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = this._serializationConfig.d(propertyNamingStrategy);
        this._deserializationConfig = this._deserializationConfig.d(propertyNamingStrategy);
        return this;
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._serializationConfig.r();
    }

    public ObjectMapper setDefaultPrettyPrinter(InterfaceC9326nV interfaceC9326nV) {
        this._serializationConfig = this._serializationConfig.a(interfaceC9326nV);
        return this;
    }

    @Deprecated
    public void setVisibilityChecker(VisibilityChecker<?> visibilityChecker) {
        setVisibility(visibilityChecker);
    }

    public ObjectMapper setPolymorphicTypeValidator(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._deserializationConfig = this._deserializationConfig.e(this._deserializationConfig.d().e(polymorphicTypeValidator));
        return this;
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._deserializationConfig.d().g();
    }

    public ObjectMapper setSerializationInclusion(JsonInclude.Include include) {
        setPropertyInclusion(JsonInclude.Value.d(include, include));
        return this;
    }

    @Deprecated
    public ObjectMapper setPropertyInclusion(JsonInclude.Value value) {
        return setDefaultPropertyInclusion(value);
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.e(value);
        return this;
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Include include) {
        this._configOverrides.e(JsonInclude.Value.d(include, include));
        return this;
    }

    public ObjectMapper setDefaultSetterInfo(JsonSetter.Value value) {
        this._configOverrides.c(value);
        return this;
    }

    public ObjectMapper setDefaultVisibility(JsonAutoDetect.Value value) {
        this._configOverrides.a(VisibilityChecker.Std.b(value));
        return this;
    }

    public ObjectMapper setDefaultMergeable(Boolean bool) {
        this._configOverrides.c(bool);
        return this;
    }

    public ObjectMapper setDefaultLeniency(Boolean bool) {
        this._configOverrides.a(bool);
        return this;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        getSubtypeResolver().e(clsArr);
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().e(namedTypeArr);
    }

    public void registerSubtypes(Collection<Class<?>> collection) {
        getSubtypeResolver().c(collection);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator) {
        return activateDefaultTyping(polymorphicTypeValidator, DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping) {
        return activateDefaultTyping(polymorphicTypeValidator, defaultTyping, JsonTypeInfo.As.WRAPPER_ARRAY);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [o.qZ] */
    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, JsonTypeInfo.As as) {
        if (as == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
            throw new IllegalArgumentException("Cannot use includeAs of " + as);
        }
        return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).d(JsonTypeInfo.Id.CLASS, null).c(as));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [o.qZ] */
    public ObjectMapper activateDefaultTypingAsProperty(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, String str) {
        return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, getPolymorphicTypeValidator()).d(JsonTypeInfo.Id.CLASS, null).c(JsonTypeInfo.As.PROPERTY).e(str));
    }

    public ObjectMapper deactivateDefaultTyping() {
        return setDefaultTyping(null);
    }

    public ObjectMapper setDefaultTyping(InterfaceC9489qZ<?> interfaceC9489qZ) {
        this._deserializationConfig = this._deserializationConfig.c(interfaceC9489qZ);
        this._serializationConfig = this._serializationConfig.c(interfaceC9489qZ);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping() {
        return activateDefaultTyping(getPolymorphicTypeValidator());
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping) {
        return enableDefaultTyping(defaultTyping, JsonTypeInfo.As.WRAPPER_ARRAY);
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping, JsonTypeInfo.As as) {
        return activateDefaultTyping(getPolymorphicTypeValidator(), defaultTyping, as);
    }

    @Deprecated
    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaultTyping, String str) {
        return activateDefaultTypingAsProperty(getPolymorphicTypeValidator(), defaultTyping, str);
    }

    @Deprecated
    public ObjectMapper disableDefaultTyping() {
        return setDefaultTyping(null);
    }

    public MutableConfigOverride configOverride(Class<?> cls) {
        return this._configOverrides.e(cls);
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = this._deserializationConfig.c(typeFactory);
        this._serializationConfig = this._serializationConfig.c(typeFactory);
        return this;
    }

    public JavaType constructType(Type type) {
        _assertNotNull("t", type);
        return this._typeFactory.d(type);
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.b();
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._deserializationConfig = this._deserializationConfig.c(jsonNodeFactory);
        return this;
    }

    public ObjectMapper addHandler(AbstractC9425pO abstractC9425pO) {
        this._deserializationConfig = this._deserializationConfig.c(abstractC9425pO);
        return this;
    }

    public ObjectMapper clearProblemHandlers() {
        this._deserializationConfig = this._deserializationConfig.j();
        return this;
    }

    public ObjectMapper setConfig(DeserializationConfig deserializationConfig) {
        _assertNotNull("config", deserializationConfig);
        this._deserializationConfig = deserializationConfig;
        return this;
    }

    @Deprecated
    public void setFilters(AbstractC9519rC abstractC9519rC) {
        this._serializationConfig = this._serializationConfig.a(abstractC9519rC);
    }

    public ObjectMapper setFilterProvider(AbstractC9519rC abstractC9519rC) {
        this._serializationConfig = this._serializationConfig.a(abstractC9519rC);
        return this;
    }

    public ObjectMapper setBase64Variant(Base64Variant base64Variant) {
        this._serializationConfig = this._serializationConfig.c(base64Variant);
        this._deserializationConfig = this._deserializationConfig.c(base64Variant);
        return this;
    }

    public ObjectMapper setConfig(SerializationConfig serializationConfig) {
        _assertNotNull("config", serializationConfig);
        this._serializationConfig = serializationConfig;
        return this;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public ObjectMapper setDateFormat(DateFormat dateFormat) {
        this._deserializationConfig = this._deserializationConfig.e(dateFormat);
        this._serializationConfig = this._serializationConfig.e(dateFormat);
        return this;
    }

    public DateFormat getDateFormat() {
        return this._serializationConfig.m();
    }

    public Object setHandlerInstantiator(AbstractC9415pE abstractC9415pE) {
        this._deserializationConfig = this._deserializationConfig.a(abstractC9415pE);
        this._serializationConfig = this._serializationConfig.a(abstractC9415pE);
        return this;
    }

    public ObjectMapper setLocale(Locale locale) {
        this._deserializationConfig = this._deserializationConfig.b(locale);
        this._serializationConfig = this._serializationConfig.b(locale);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timeZone) {
        this._deserializationConfig = this._deserializationConfig.b(timeZone);
        this._serializationConfig = this._serializationConfig.b(timeZone);
        return this;
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.a(mapperFeature);
    }

    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.a(mapperFeature) : this._serializationConfig.b(mapperFeature);
        this._deserializationConfig = z ? this._deserializationConfig.a(mapperFeature) : this._deserializationConfig.b(mapperFeature);
        return this;
    }

    public ObjectMapper enable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.a(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.a(mapperFeatureArr);
        return this;
    }

    public ObjectMapper disable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.b(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.b(mapperFeatureArr);
        return this;
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._serializationConfig.c(serializationFeature);
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.a(serializationFeature) : this._serializationConfig.b(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.a(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.d(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.b(serializationFeature);
        return this;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.b(serializationFeature, serializationFeatureArr);
        return this;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.e(deserializationFeature);
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.c(deserializationFeature) : this._deserializationConfig.a(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.c(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.a(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.a(deserializationFeature);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.c(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._deserializationConfig.a(feature, this._jsonFactory);
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper enable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this._jsonFactory.enable(feature);
        }
        return this;
    }

    public ObjectMapper disable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this._jsonFactory.disable(feature);
        }
        return this;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._serializationConfig.a(feature, this._jsonFactory);
    }

    public ObjectMapper configure(JsonGenerator.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper enable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this._jsonFactory.enable(feature);
        }
        return this;
    }

    public ObjectMapper disable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this._jsonFactory.disable(feature);
        }
        return this;
    }

    public boolean isEnabled(JsonFactory.Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return isEnabled(streamReadFeature.c());
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.c());
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.d(cls));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, AbstractC9378oU<T> abstractC9378oU) {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.a((AbstractC9378oU<?>) abstractC9378oU));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public final <T> T readValue(JsonParser jsonParser, AbstractC9380oW abstractC9380oW) {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, (JavaType) abstractC9380oW);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, javaType);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T extends InterfaceC9330nZ> T readTree(JsonParser jsonParser) {
        _assertNotNull("p", jsonParser);
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.o() == null && jsonParser.Q() == null) {
            return null;
        }
        AbstractC9454pr abstractC9454pr = (AbstractC9454pr) _readValue(deserializationConfig, jsonParser, constructType(AbstractC9454pr.class));
        return abstractC9454pr == null ? getNodeFactory().e() : abstractC9454pr;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> C9456pt<T> readValues(JsonParser jsonParser, AbstractC9380oW abstractC9380oW) {
        return readValues(jsonParser, (JavaType) abstractC9380oW);
    }

    public <T> C9456pt<T> readValues(JsonParser jsonParser, JavaType javaType) {
        _assertNotNull("p", jsonParser);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
        return new C9456pt<>(javaType, jsonParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext, javaType), false, null);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> C9456pt<T> readValues(JsonParser jsonParser, Class<T> cls) {
        return readValues(jsonParser, this._typeFactory.d(cls));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> C9456pt<T> readValues(JsonParser jsonParser, AbstractC9378oU<T> abstractC9378oU) {
        return readValues(jsonParser, this._typeFactory.a((AbstractC9378oU<?>) abstractC9378oU));
    }

    public AbstractC9454pr readTree(InputStream inputStream) {
        _assertNotNull("in", inputStream);
        return _readTreeAndClose(this._jsonFactory.createParser(inputStream));
    }

    public AbstractC9454pr readTree(Reader reader) {
        _assertNotNull("r", reader);
        return _readTreeAndClose(this._jsonFactory.createParser(reader));
    }

    public AbstractC9454pr readTree(String str) {
        _assertNotNull("content", str);
        try {
            return _readTreeAndClose(this._jsonFactory.createParser(str));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.b(e2);
        }
    }

    public AbstractC9454pr readTree(byte[] bArr) {
        _assertNotNull("content", bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr));
    }

    public AbstractC9454pr readTree(byte[] bArr, int i, int i2) {
        _assertNotNull("content", bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr, i, i2));
    }

    public AbstractC9454pr readTree(File file) {
        _assertNotNull("file", file);
        return _readTreeAndClose(this._jsonFactory.createParser(file));
    }

    public AbstractC9454pr readTree(URL url) {
        _assertNotNull(NetflixActivity.EXTRA_SOURCE, url);
        return _readTreeAndClose(this._jsonFactory.createParser(url));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.c(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.f() == null) {
            jsonGenerator.a(serializationConfig.a());
        }
        if (serializationConfig.c(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseableValue(jsonGenerator, obj, serializationConfig);
            return;
        }
        _serializerProvider(serializationConfig).d(jsonGenerator, obj);
        if (serializationConfig.c(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeTree(JsonGenerator jsonGenerator, InterfaceC9330nZ interfaceC9330nZ) {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).d(jsonGenerator, interfaceC9330nZ);
        if (serializationConfig.c(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public void writeTree(JsonGenerator jsonGenerator, AbstractC9454pr abstractC9454pr) {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).d(jsonGenerator, abstractC9454pr);
        if (serializationConfig.c(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public ObjectNode createObjectNode() {
        return this._deserializationConfig.b().a();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public ArrayNode createArrayNode() {
        return this._deserializationConfig.b().c();
    }

    @Override // o.AbstractC9328nX
    public AbstractC9454pr missingNode() {
        return this._deserializationConfig.b().b();
    }

    @Override // o.AbstractC9328nX
    public AbstractC9454pr nullNode() {
        return this._deserializationConfig.b().e();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonParser treeAsTokens(InterfaceC9330nZ interfaceC9330nZ) {
        _assertNotNull("n", interfaceC9330nZ);
        return new C9558rp((AbstractC9454pr) interfaceC9330nZ, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T treeToValue(InterfaceC9330nZ interfaceC9330nZ, Class<T> cls) {
        T t;
        if (interfaceC9330nZ == 0) {
            return null;
        }
        try {
            if (InterfaceC9330nZ.class.isAssignableFrom(cls) && cls.isAssignableFrom(interfaceC9330nZ.getClass())) {
                return interfaceC9330nZ;
            }
            JsonToken e = interfaceC9330nZ.e();
            if (e == JsonToken.VALUE_NULL) {
                return null;
            }
            return (e == JsonToken.VALUE_EMBEDDED_OBJECT && (interfaceC9330nZ instanceof POJONode) && ((t = (T) ((POJONode) interfaceC9330nZ).x()) == null || cls.isInstance(t))) ? t : (T) readValue(treeAsTokens(interfaceC9330nZ), cls);
        } catch (JsonProcessingException e2) {
            throw e2;
        } catch (IOException e3) {
            throw new IllegalArgumentException(e3.getMessage(), e3);
        }
    }

    public <T extends AbstractC9454pr> T valueToTree(Object obj) {
        if (obj == null) {
            return getNodeFactory().e();
        }
        C9542rZ c9542rZ = new C9542rZ((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            c9542rZ = c9542rZ.d(true);
        }
        try {
            writeValue(c9542rZ, obj);
            JsonParser m = c9542rZ.m();
            T t = (T) readTree(m);
            m.close();
            return t;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).c(cls, (AtomicReference<Throwable>) null);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return _serializerProvider(getSerializationConfig()).c(cls, atomicReference);
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext(null, getDeserializationConfig()).e(javaType, (AtomicReference<Throwable>) null);
    }

    public boolean canDeserialize(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        return createDeserializationContext(null, getDeserializationConfig()).e(javaType, atomicReference);
    }

    public <T> T readValue(File file, Class<T> cls) {
        _assertNotNull("src", file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.d(cls));
    }

    public <T> T readValue(File file, AbstractC9378oU<T> abstractC9378oU) {
        _assertNotNull("src", file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.a((AbstractC9378oU<?>) abstractC9378oU));
    }

    public <T> T readValue(File file, JavaType javaType) {
        _assertNotNull("src", file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), javaType);
    }

    public <T> T readValue(URL url, Class<T> cls) {
        _assertNotNull("src", url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.d(cls));
    }

    public <T> T readValue(URL url, AbstractC9378oU<T> abstractC9378oU) {
        _assertNotNull("src", url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.a((AbstractC9378oU<?>) abstractC9378oU));
    }

    public <T> T readValue(URL url, JavaType javaType) {
        _assertNotNull("src", url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), javaType);
    }

    public <T> T readValue(String str, Class<T> cls) {
        _assertNotNull("content", str);
        return (T) readValue(str, this._typeFactory.d(cls));
    }

    public <T> T readValue(String str, AbstractC9378oU<T> abstractC9378oU) {
        _assertNotNull("content", str);
        return (T) readValue(str, this._typeFactory.a((AbstractC9378oU<?>) abstractC9378oU));
    }

    public <T> T readValue(String str, JavaType javaType) {
        _assertNotNull("content", str);
        try {
            return (T) _readMapAndClose(this._jsonFactory.createParser(str), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.b(e2);
        }
    }

    public <T> T readValue(Reader reader, Class<T> cls) {
        _assertNotNull("src", reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.d(cls));
    }

    public <T> T readValue(Reader reader, AbstractC9378oU<T> abstractC9378oU) {
        _assertNotNull("src", reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.a((AbstractC9378oU<?>) abstractC9378oU));
    }

    public <T> T readValue(Reader reader, JavaType javaType) {
        _assertNotNull("src", reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), javaType);
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) {
        _assertNotNull("src", inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.d(cls));
    }

    public <T> T readValue(InputStream inputStream, AbstractC9378oU<T> abstractC9378oU) {
        _assertNotNull("src", inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.a((AbstractC9378oU<?>) abstractC9378oU));
    }

    public <T> T readValue(InputStream inputStream, JavaType javaType) {
        _assertNotNull("src", inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), javaType);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.d(cls));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.d(cls));
    }

    public <T> T readValue(byte[] bArr, AbstractC9378oU<T> abstractC9378oU) {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.a((AbstractC9378oU<?>) abstractC9378oU));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, AbstractC9378oU<T> abstractC9378oU) {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.a((AbstractC9378oU<?>) abstractC9378oU));
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public <T> T readValue(byte[] bArr, int i, int i2, JavaType javaType) {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), javaType);
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) {
        _assertNotNull("src", dataInput);
        return (T) _readMapAndClose(this._jsonFactory.createParser(dataInput), this._typeFactory.d(cls));
    }

    public <T> T readValue(DataInput dataInput, JavaType javaType) {
        _assertNotNull("src", dataInput);
        return (T) _readMapAndClose(this._jsonFactory.createParser(dataInput), javaType);
    }

    public void writeValue(File file, Object obj) {
        _assertNotNull("resultFile", file);
        _configAndWriteValue(this._jsonFactory.createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public void writeValue(OutputStream outputStream, Object obj) {
        _assertNotNull("out", outputStream);
        _configAndWriteValue(this._jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public void writeValue(DataOutput dataOutput, Object obj) {
        _assertNotNull("out", dataOutput);
        _configAndWriteValue(this._jsonFactory.createGenerator(dataOutput, JsonEncoding.UTF8), obj);
    }

    public void writeValue(Writer writer, Object obj) {
        _assertNotNull("w", writer);
        _configAndWriteValue(this._jsonFactory.createGenerator(writer), obj);
    }

    public String writeValueAsString(Object obj) {
        C9396om c9396om = new C9396om(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator(c9396om), obj);
            return c9396om.d();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.b(e2);
        }
    }

    public byte[] writeValueAsBytes(Object obj) {
        C9439pc c9439pc = new C9439pc(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator(c9439pc, JsonEncoding.UTF8), obj);
            byte[] i = c9439pc.i();
            c9439pc.b();
            return i;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.b(e2);
        }
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writer(SerializationFeature serializationFeature) {
        return _newWriter(getSerializationConfig().a(serializationFeature));
    }

    public ObjectWriter writer(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _newWriter(getSerializationConfig().d(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter writer(DateFormat dateFormat) {
        return _newWriter(getSerializationConfig().e(dateFormat));
    }

    public ObjectWriter writerWithView(Class<?> cls) {
        return _newWriter(getSerializationConfig().c(cls));
    }

    public ObjectWriter writerFor(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.d((Type) cls), null);
    }

    public ObjectWriter writerFor(AbstractC9378oU<?> abstractC9378oU) {
        return _newWriter(getSerializationConfig(), abstractC9378oU == null ? null : this._typeFactory.a(abstractC9378oU), null);
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    public ObjectWriter writer(InterfaceC9326nV interfaceC9326nV) {
        if (interfaceC9326nV == null) {
            interfaceC9326nV = ObjectWriter.c;
        }
        return _newWriter(getSerializationConfig(), null, interfaceC9326nV);
    }

    public ObjectWriter writerWithDefaultPrettyPrinter() {
        SerializationConfig serializationConfig = getSerializationConfig();
        return _newWriter(serializationConfig, null, serializationConfig.c());
    }

    public ObjectWriter writer(AbstractC9519rC abstractC9519rC) {
        return _newWriter(getSerializationConfig().a(abstractC9519rC));
    }

    public ObjectWriter writer(InterfaceC9324nT interfaceC9324nT) {
        _verifySchemaType(interfaceC9324nT);
        return _newWriter(getSerializationConfig(), interfaceC9324nT);
    }

    public ObjectWriter writer(Base64Variant base64Variant) {
        return _newWriter(getSerializationConfig().c(base64Variant));
    }

    public ObjectWriter writer(CharacterEscapes characterEscapes) {
        return _newWriter(getSerializationConfig()).e(characterEscapes);
    }

    public ObjectWriter writer(ContextAttributes contextAttributes) {
        return _newWriter(getSerializationConfig().e(contextAttributes));
    }

    @Deprecated
    public ObjectWriter writerWithType(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.d((Type) cls), null);
    }

    @Deprecated
    public ObjectWriter writerWithType(AbstractC9378oU<?> abstractC9378oU) {
        return _newWriter(getSerializationConfig(), abstractC9378oU == null ? null : this._typeFactory.a(abstractC9378oU), null);
    }

    @Deprecated
    public ObjectWriter writerWithType(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    public ObjectReader reader() {
        return _newReader(getDeserializationConfig()).d(this._injectableValues);
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature) {
        return _newReader(getDeserializationConfig().c(deserializationFeature));
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _newReader(getDeserializationConfig().a(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader readerForUpdating(Object obj) {
        return _newReader(getDeserializationConfig(), this._typeFactory.d((Type) obj.getClass()), obj, null, this._injectableValues);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    public ObjectReader readerFor(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.d((Type) cls), null, null, this._injectableValues);
    }

    public ObjectReader readerFor(AbstractC9378oU<?> abstractC9378oU) {
        return _newReader(getDeserializationConfig(), this._typeFactory.a(abstractC9378oU), null, null, this._injectableValues);
    }

    public ObjectReader reader(JsonNodeFactory jsonNodeFactory) {
        return _newReader(getDeserializationConfig()).a(jsonNodeFactory);
    }

    public ObjectReader reader(InterfaceC9324nT interfaceC9324nT) {
        _verifySchemaType(interfaceC9324nT);
        return _newReader(getDeserializationConfig(), null, null, interfaceC9324nT, this._injectableValues);
    }

    public ObjectReader reader(AbstractC9447pk abstractC9447pk) {
        return _newReader(getDeserializationConfig(), null, null, null, abstractC9447pk);
    }

    public ObjectReader readerWithView(Class<?> cls) {
        return _newReader(getDeserializationConfig().d(cls));
    }

    public ObjectReader reader(Base64Variant base64Variant) {
        return _newReader(getDeserializationConfig().c(base64Variant));
    }

    public ObjectReader reader(ContextAttributes contextAttributes) {
        return _newReader(getDeserializationConfig().d(contextAttributes));
    }

    @Deprecated
    public ObjectReader reader(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    @Deprecated
    public ObjectReader reader(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.d((Type) cls), null, null, this._injectableValues);
    }

    @Deprecated
    public ObjectReader reader(AbstractC9378oU<?> abstractC9378oU) {
        return _newReader(getDeserializationConfig(), this._typeFactory.a(abstractC9378oU), null, null, this._injectableValues);
    }

    public <T> T convertValue(Object obj, Class<T> cls) {
        return (T) _convert(obj, this._typeFactory.d(cls));
    }

    public <T> T convertValue(Object obj, AbstractC9378oU<T> abstractC9378oU) {
        return (T) _convert(obj, this._typeFactory.a((AbstractC9378oU<?>) abstractC9378oU));
    }

    public <T> T convertValue(Object obj, JavaType javaType) {
        return (T) _convert(obj, javaType);
    }

    protected Object _convert(Object obj, JavaType javaType) {
        Object obj2;
        C9542rZ c9542rZ = new C9542rZ((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            c9542rZ = c9542rZ.d(true);
        }
        try {
            _serializerProvider(getSerializationConfig().b(SerializationFeature.WRAP_ROOT_VALUE)).d(c9542rZ, obj);
            JsonParser m = c9542rZ.m();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken _initForReading = _initForReading(m, javaType);
            if (_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext createDeserializationContext = createDeserializationContext(m, deserializationConfig);
                obj2 = _findRootDeserializer(createDeserializationContext, javaType).c(createDeserializationContext);
            } else {
                if (_initForReading != JsonToken.END_ARRAY && _initForReading != JsonToken.END_OBJECT) {
                    DefaultDeserializationContext createDeserializationContext2 = createDeserializationContext(m, deserializationConfig);
                    obj2 = _findRootDeserializer(createDeserializationContext2, javaType).b(m, createDeserializationContext2);
                }
                obj2 = null;
            }
            m.close();
            return obj2;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public <T> T updateValue(T t, Object obj) {
        if (t == null || obj == null) {
            return t;
        }
        C9542rZ c9542rZ = new C9542rZ((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            c9542rZ = c9542rZ.d(true);
        }
        try {
            _serializerProvider(getSerializationConfig().b(SerializationFeature.WRAP_ROOT_VALUE)).d(c9542rZ, obj);
            JsonParser m = c9542rZ.m();
            T t2 = (T) readerForUpdating(t).a(m);
            m.close();
            return t2;
        } catch (IOException e) {
            if (e instanceof JsonMappingException) {
                throw ((JsonMappingException) e);
            }
            throw JsonMappingException.b(e);
        }
    }

    @Deprecated
    public C9488qY generateJsonSchema(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).i(cls);
    }

    public void acceptJsonFormatVisitor(Class<?> cls, InterfaceC9478qO interfaceC9478qO) {
        acceptJsonFormatVisitor(this._typeFactory.d((Type) cls), interfaceC9478qO);
    }

    public void acceptJsonFormatVisitor(JavaType javaType, InterfaceC9478qO interfaceC9478qO) {
        if (javaType == null) {
            throw new IllegalArgumentException("type must be provided");
        }
        _serializerProvider(getSerializationConfig()).b(javaType, interfaceC9478qO);
    }

    protected InterfaceC9489qZ<?> _constructDefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
        return DefaultTypeResolverBuilder.d(defaultTyping, polymorphicTypeValidator);
    }

    protected DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.c(serializationConfig, this._serializerFactory);
    }

    protected final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) {
        SerializationConfig serializationConfig = getSerializationConfig();
        serializationConfig.b(jsonGenerator);
        if (serializationConfig.c(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _configAndWriteCloseable(jsonGenerator, obj, serializationConfig);
            return;
        }
        try {
            _serializerProvider(serializationConfig).d(jsonGenerator, obj);
            jsonGenerator.close();
        } catch (Exception e) {
            C9537rU.a(jsonGenerator, e);
        }
    }

    private final void _configAndWriteCloseable(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).d(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                C9537rU.e(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private final void _writeCloseableValue(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).d(jsonGenerator, obj);
            if (serializationConfig.c(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            C9537rU.e((JsonGenerator) null, closeable, e);
        }
    }

    protected Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) {
        Object obj;
        JsonToken _initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
        if (_initForReading == JsonToken.VALUE_NULL) {
            obj = _findRootDeserializer(createDeserializationContext, javaType).c(createDeserializationContext);
        } else if (_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT) {
            obj = null;
        } else {
            AbstractC9452pp<Object> _findRootDeserializer = _findRootDeserializer(createDeserializationContext, javaType);
            if (deserializationConfig.a()) {
                obj = _unwrapAndDeserialize(jsonParser, createDeserializationContext, deserializationConfig, javaType, _findRootDeserializer);
            } else {
                obj = _findRootDeserializer.b(jsonParser, createDeserializationContext);
            }
        }
        jsonParser.e();
        if (deserializationConfig.e(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, javaType);
        }
        return obj;
    }

    protected Object _readMapAndClose(JsonParser jsonParser, JavaType javaType) {
        Object obj;
        try {
            JsonToken _initForReading = _initForReading(jsonParser, javaType);
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            if (_initForReading == JsonToken.VALUE_NULL) {
                obj = _findRootDeserializer(createDeserializationContext, javaType).c(createDeserializationContext);
            } else {
                if (_initForReading != JsonToken.END_ARRAY && _initForReading != JsonToken.END_OBJECT) {
                    AbstractC9452pp<Object> _findRootDeserializer = _findRootDeserializer(createDeserializationContext, javaType);
                    if (deserializationConfig.a()) {
                        obj = _unwrapAndDeserialize(jsonParser, createDeserializationContext, deserializationConfig, javaType, _findRootDeserializer);
                    } else {
                        obj = _findRootDeserializer.b(jsonParser, createDeserializationContext);
                    }
                    createDeserializationContext.d();
                }
                obj = null;
            }
            if (deserializationConfig.e(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, createDeserializationContext, javaType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return obj;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    protected AbstractC9454pr _readTreeAndClose(JsonParser jsonParser) {
        AbstractC9454pr abstractC9454pr;
        DefaultDeserializationContext defaultDeserializationContext;
        try {
            JavaType constructType = constructType(AbstractC9454pr.class);
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            deserializationConfig.d(jsonParser);
            JsonToken o2 = jsonParser.o();
            if (o2 == null && (o2 = jsonParser.Q()) == null) {
                AbstractC9454pr b = deserializationConfig.b().b();
                jsonParser.close();
                return b;
            }
            boolean e = deserializationConfig.e(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
            if (o2 == JsonToken.VALUE_NULL) {
                abstractC9454pr = deserializationConfig.b().e();
                if (!e) {
                    jsonParser.close();
                    return abstractC9454pr;
                }
                defaultDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            } else {
                DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
                AbstractC9452pp<Object> _findRootDeserializer = _findRootDeserializer(createDeserializationContext, constructType);
                abstractC9454pr = deserializationConfig.a() ? (AbstractC9454pr) _unwrapAndDeserialize(jsonParser, createDeserializationContext, deserializationConfig, constructType, _findRootDeserializer) : (AbstractC9454pr) _findRootDeserializer.b(jsonParser, createDeserializationContext);
                defaultDeserializationContext = createDeserializationContext;
            }
            if (e) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContext, constructType);
            }
            jsonParser.close();
            return abstractC9454pr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    protected Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JavaType javaType, AbstractC9452pp<Object> abstractC9452pp) {
        String c = deserializationConfig.i(javaType).c();
        JsonToken o2 = jsonParser.o();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (o2 != jsonToken) {
            deserializationContext.d(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", c, jsonParser.o());
        }
        JsonToken Q = jsonParser.Q();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (Q != jsonToken2) {
            deserializationContext.d(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", c, jsonParser.o());
        }
        String l = jsonParser.l();
        if (!c.equals(l)) {
            deserializationContext.c(javaType, l, "Root name '%s' does not match expected ('%s') for type %s", l, c, javaType);
        }
        jsonParser.Q();
        Object b = abstractC9452pp.b(jsonParser, deserializationContext);
        JsonToken Q2 = jsonParser.Q();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (Q2 != jsonToken3) {
            deserializationContext.d(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", c, jsonParser.o());
        }
        if (deserializationConfig.e(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, deserializationContext, javaType);
        }
        return b;
    }

    protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.b(deserializationConfig, jsonParser, this._injectableValues);
    }

    protected JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) {
        this._deserializationConfig.d(jsonParser);
        JsonToken o2 = jsonParser.o();
        if (o2 == null && (o2 = jsonParser.Q()) == null) {
            throw MismatchedInputException.d(jsonParser, javaType, "No content to map due to end-of-input");
        }
        return o2;
    }

    @Deprecated
    protected JsonToken _initForReading(JsonParser jsonParser) {
        return _initForReading(jsonParser, null);
    }

    protected final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) {
        JsonToken Q = jsonParser.Q();
        if (Q != null) {
            deserializationContext.c(C9537rU.d(javaType), jsonParser, Q);
        }
    }

    protected AbstractC9452pp<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        AbstractC9452pp<Object> abstractC9452pp = this._rootDeserializers.get(javaType);
        if (abstractC9452pp != null) {
            return abstractC9452pp;
        }
        AbstractC9452pp<Object> c = deserializationContext.c(javaType);
        if (c == null) {
            return (AbstractC9452pp) deserializationContext.c(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, c);
        return c;
    }

    protected void _verifySchemaType(InterfaceC9324nT interfaceC9324nT) {
        if (interfaceC9324nT == null || this._jsonFactory.canUseSchema(interfaceC9324nT)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + interfaceC9324nT.getClass().getName() + " for format " + this._jsonFactory.getFormatName());
    }

    protected final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}
