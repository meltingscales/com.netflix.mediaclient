package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o.AbstractC9415pE;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9453pq;
import o.AbstractC9497qh;
import o.AbstractC9509qt;
import o.C9471qH;
import o.C9508qs;
import o.C9537rU;
import o.C9541rY;
import o.C9555rm;
import o.InterfaceC9305nA;
import o.InterfaceC9306nB;
import o.InterfaceC9307nC;
import o.InterfaceC9308nD;
import o.InterfaceC9309nE;
import o.InterfaceC9310nF;
import o.InterfaceC9311nG;
import o.InterfaceC9312nH;
import o.InterfaceC9313nI;
import o.InterfaceC9314nJ;
import o.InterfaceC9315nK;
import o.InterfaceC9316nL;
import o.InterfaceC9318nN;
import o.InterfaceC9320nP;
import o.InterfaceC9346np;
import o.InterfaceC9348nr;
import o.InterfaceC9349ns;
import o.InterfaceC9350nt;
import o.InterfaceC9351nu;
import o.InterfaceC9352nv;
import o.InterfaceC9353nw;
import o.InterfaceC9354nx;
import o.InterfaceC9355ny;
import o.InterfaceC9356nz;
import o.InterfaceC9411pA;
import o.InterfaceC9412pB;
import o.InterfaceC9417pG;
import o.InterfaceC9455ps;
import o.InterfaceC9460px;
import o.InterfaceC9461py;
import o.InterfaceC9462pz;
import o.InterfaceC9489qZ;
import o.InterfaceC9535rS;
import o.InterfaceC9545rc;

/* loaded from: classes5.dex */
public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    private static final AbstractC9497qh c;
    private static final long serialVersionUID = 1;
    private static final Class<? extends Annotation>[] b = {JsonSerialize.class, InterfaceC9318nN.class, JsonFormat.class, JsonTypeInfo.class, InterfaceC9314nJ.class, InterfaceC9320nP.class, InterfaceC9350nt.class, InterfaceC9307nC.class};
    private static final Class<? extends Annotation>[] a = {InterfaceC9462pz.class, InterfaceC9318nN.class, JsonFormat.class, JsonTypeInfo.class, InterfaceC9320nP.class, InterfaceC9350nt.class, InterfaceC9307nC.class, InterfaceC9308nD.class};
    protected transient LRUMap<Class<?>, Boolean> e = new LRUMap<>(48, 48);
    protected boolean d = true;

    static {
        AbstractC9497qh abstractC9497qh;
        try {
            abstractC9497qh = AbstractC9497qh.a();
        } catch (Throwable unused) {
            abstractC9497qh = null;
        }
        c = abstractC9497qh;
    }

    protected Object readResolve() {
        if (this.e == null) {
            this.e = new LRUMap<>(48, 48);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean c(Annotation annotation) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Boolean a2 = this.e.a(annotationType);
        if (a2 == null) {
            a2 = Boolean.valueOf(annotationType.getAnnotation(InterfaceC9346np.class) != null);
            this.e.e(annotationType, a2);
        }
        return a2.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] b(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        Field[] h;
        JsonProperty jsonProperty;
        HashMap hashMap = null;
        for (Field field : C9537rU.h(cls)) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String d = jsonProperty.d();
                if (!d.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(field.getName(), d);
                }
            }
        }
        if (hashMap != null) {
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) hashMap.get(enumArr[i].name());
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return strArr;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> a(Class<Enum<?>> cls) {
        return C9537rU.c(cls, InterfaceC9348nr.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName d(C9508qs c9508qs) {
        InterfaceC9315nK interfaceC9315nK = (InterfaceC9315nK) d(c9508qs, InterfaceC9315nK.class);
        String str = null;
        if (interfaceC9315nK == null) {
            return null;
        }
        String a2 = interfaceC9315nK.a();
        if (a2 == null || a2.length() != 0) {
            str = a2;
        }
        return PropertyName.a(interfaceC9315nK.e(), str);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.Value p(AbstractC9509qt abstractC9509qt) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) d(abstractC9509qt, JsonIgnoreProperties.class);
        if (jsonIgnoreProperties == null) {
            return JsonIgnoreProperties.Value.a();
        }
        return JsonIgnoreProperties.Value.d(jsonIgnoreProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean i(C9508qs c9508qs) {
        InterfaceC9306nB interfaceC9306nB = (InterfaceC9306nB) d(c9508qs, InterfaceC9306nB.class);
        if (interfaceC9306nB == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC9306nB.c());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object h(AbstractC9509qt abstractC9509qt) {
        InterfaceC9305nA interfaceC9305nA = (InterfaceC9305nA) d(abstractC9509qt, InterfaceC9305nA.class);
        if (interfaceC9305nA != null) {
            String b2 = interfaceC9305nA.b();
            if (b2.length() > 0) {
                return b2;
            }
            return null;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object a(C9508qs c9508qs) {
        InterfaceC9460px interfaceC9460px = (InterfaceC9460px) d(c9508qs, InterfaceC9460px.class);
        if (interfaceC9460px == null) {
            return null;
        }
        return interfaceC9460px.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?>] */
    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> b(C9508qs c9508qs, VisibilityChecker<?> visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) d(c9508qs, JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.b(jsonAutoDetect);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String b(AnnotatedMember annotatedMember) {
        PropertyName F = F(annotatedMember);
        if (F == null) {
            return null;
        }
        return F.c();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<PropertyName> r(AbstractC9509qt abstractC9509qt) {
        InterfaceC9349ns interfaceC9349ns = (InterfaceC9349ns) d(abstractC9509qt, InterfaceC9349ns.class);
        if (interfaceC9349ns == null) {
            return null;
        }
        String[] e = interfaceC9349ns.e();
        int length = e.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : e) {
            arrayList.add(PropertyName.b(str));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean g(AnnotatedMember annotatedMember) {
        return E(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean i(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) d(annotatedMember, JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.e());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonProperty.Access l(AbstractC9509qt abstractC9509qt) {
        JsonProperty jsonProperty = (JsonProperty) d(abstractC9509qt, JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.c();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String s(AbstractC9509qt abstractC9509qt) {
        InterfaceC9309nE interfaceC9309nE = (InterfaceC9309nE) d(abstractC9509qt, InterfaceC9309nE.class);
        if (interfaceC9309nE == null) {
            return null;
        }
        return interfaceC9309nE.e();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer w(AbstractC9509qt abstractC9509qt) {
        int b2;
        JsonProperty jsonProperty = (JsonProperty) d(abstractC9509qt, JsonProperty.class);
        if (jsonProperty == null || (b2 = jsonProperty.b()) == -1) {
            return null;
        }
        return Integer.valueOf(b2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String q(AbstractC9509qt abstractC9509qt) {
        JsonProperty jsonProperty = (JsonProperty) d(abstractC9509qt, JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String a2 = jsonProperty.a();
        if (a2.isEmpty()) {
            return null;
        }
        return a2;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonFormat.Value g(AbstractC9509qt abstractC9509qt) {
        JsonFormat jsonFormat = (JsonFormat) d(abstractC9509qt, JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return new JsonFormat.Value(jsonFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty a(AnnotatedMember annotatedMember) {
        InterfaceC9307nC interfaceC9307nC = (InterfaceC9307nC) d(annotatedMember, InterfaceC9307nC.class);
        if (interfaceC9307nC != null) {
            return AnnotationIntrospector.ReferenceProperty.d(interfaceC9307nC.c());
        }
        InterfaceC9350nt interfaceC9350nt = (InterfaceC9350nt) d(annotatedMember, InterfaceC9350nt.class);
        if (interfaceC9350nt != null) {
            return AnnotationIntrospector.ReferenceProperty.e(interfaceC9350nt.c());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer f(AnnotatedMember annotatedMember) {
        InterfaceC9320nP interfaceC9320nP = (InterfaceC9320nP) d(annotatedMember, InterfaceC9320nP.class);
        if (interfaceC9320nP == null || !interfaceC9320nP.b()) {
            return null;
        }
        return NameTransformer.e(interfaceC9320nP.e(), interfaceC9320nP.a());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JacksonInject.Value d(AnnotatedMember annotatedMember) {
        String name;
        JacksonInject jacksonInject = (JacksonInject) d(annotatedMember, JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        JacksonInject.Value d = JacksonInject.Value.d(jacksonInject);
        if (d.b()) {
            return d;
        }
        if (!(annotatedMember instanceof AnnotatedMethod)) {
            name = annotatedMember.e().getName();
        } else {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.f() == 0) {
                name = annotatedMember.e().getName();
            } else {
                name = annotatedMethod.e(0).getName();
            }
        }
        return d.e(name);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Object e(AnnotatedMember annotatedMember) {
        JacksonInject.Value d = d(annotatedMember);
        if (d == null) {
            return null;
        }
        return d.a();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] B(AbstractC9509qt abstractC9509qt) {
        InterfaceC9318nN interfaceC9318nN = (InterfaceC9318nN) d(abstractC9509qt, InterfaceC9318nN.class);
        if (interfaceC9318nN == null) {
            return null;
        }
        return interfaceC9318nN.c();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotatedMethod a(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> e = annotatedMethod.e(0);
        Class<?> e2 = annotatedMethod2.e(0);
        if (e.isPrimitive()) {
            if (!e2.isPrimitive()) {
                return annotatedMethod;
            }
        } else if (e2.isPrimitive()) {
            return annotatedMethod2;
        }
        if (e == String.class) {
            if (e2 != String.class) {
                return annotatedMethod;
            }
            return null;
        } else if (e2 == String.class) {
            return annotatedMethod2;
        } else {
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC9489qZ<?> d(MapperConfig<?> mapperConfig, C9508qs c9508qs, JavaType javaType) {
        return d(mapperConfig, (AbstractC9509qt) c9508qs, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC9489qZ<?> c(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.x() || javaType.d()) {
            return null;
        }
        return d(mapperConfig, (AbstractC9509qt) annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC9489qZ<?> d(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.j() == null) {
            throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
        }
        return d(mapperConfig, (AbstractC9509qt) annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> z(AbstractC9509qt abstractC9509qt) {
        InterfaceC9313nI interfaceC9313nI = (InterfaceC9313nI) d(abstractC9509qt, InterfaceC9313nI.class);
        if (interfaceC9313nI == null) {
            return null;
        }
        InterfaceC9313nI.e[] c2 = interfaceC9313nI.c();
        ArrayList arrayList = new ArrayList(c2.length);
        for (InterfaceC9313nI.e eVar : c2) {
            arrayList.add(new NamedType(eVar.c(), eVar.a()));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String g(C9508qs c9508qs) {
        InterfaceC9312nH interfaceC9312nH = (InterfaceC9312nH) d(c9508qs, InterfaceC9312nH.class);
        if (interfaceC9312nH == null) {
            return null;
        }
        return interfaceC9312nH.c();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean j(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(c(annotatedMember, InterfaceC9311nG.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public C9471qH n(AbstractC9509qt abstractC9509qt) {
        InterfaceC9356nz interfaceC9356nz = (InterfaceC9356nz) d(abstractC9509qt, InterfaceC9356nz.class);
        if (interfaceC9356nz == null || interfaceC9356nz.a() == ObjectIdGenerators.None.class) {
            return null;
        }
        return new C9471qH(PropertyName.b(interfaceC9356nz.e()), interfaceC9356nz.b(), interfaceC9356nz.a(), interfaceC9356nz.d());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public C9471qH a(AbstractC9509qt abstractC9509qt, C9471qH c9471qH) {
        InterfaceC9353nw interfaceC9353nw = (InterfaceC9353nw) d(abstractC9509qt, InterfaceC9353nw.class);
        if (interfaceC9353nw == null) {
            return c9471qH;
        }
        if (c9471qH == null) {
            c9471qH = C9471qH.a();
        }
        return c9471qH.c(interfaceC9353nw.d());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object x(AbstractC9509qt abstractC9509qt) {
        Class<? extends AbstractC9453pq> m;
        JsonSerialize jsonSerialize = (JsonSerialize) d(abstractC9509qt, JsonSerialize.class);
        if (jsonSerialize == null || (m = jsonSerialize.m()) == AbstractC9453pq.d.class) {
            InterfaceC9314nJ interfaceC9314nJ = (InterfaceC9314nJ) d(abstractC9509qt, InterfaceC9314nJ.class);
            if (interfaceC9314nJ == null || !interfaceC9314nJ.d()) {
                return null;
            }
            return new RawSerializer(abstractC9509qt.e());
        }
        return m;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object f(AbstractC9509qt abstractC9509qt) {
        Class<? extends AbstractC9453pq> g;
        JsonSerialize jsonSerialize = (JsonSerialize) d(abstractC9509qt, JsonSerialize.class);
        if (jsonSerialize == null || (g = jsonSerialize.g()) == AbstractC9453pq.d.class) {
            return null;
        }
        return g;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object a(AbstractC9509qt abstractC9509qt) {
        Class<? extends AbstractC9453pq> b2;
        JsonSerialize jsonSerialize = (JsonSerialize) d(abstractC9509qt, JsonSerialize.class);
        if (jsonSerialize == null || (b2 = jsonSerialize.b()) == AbstractC9453pq.d.class) {
            return null;
        }
        return b2;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object m(AbstractC9509qt abstractC9509qt) {
        Class<? extends AbstractC9453pq> h;
        JsonSerialize jsonSerialize = (JsonSerialize) d(abstractC9509qt, JsonSerialize.class);
        if (jsonSerialize == null || (h = jsonSerialize.h()) == AbstractC9453pq.d.class) {
            return null;
        }
        return h;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.Value t(AbstractC9509qt abstractC9509qt) {
        JsonInclude jsonInclude = (JsonInclude) d(abstractC9509qt, JsonInclude.class);
        JsonInclude.Value a2 = jsonInclude == null ? JsonInclude.Value.a() : JsonInclude.Value.c(jsonInclude);
        return a2.d() == JsonInclude.Include.USE_DEFAULTS ? e(abstractC9509qt, a2) : a2;
    }

    private JsonInclude.Value e(AbstractC9509qt abstractC9509qt, JsonInclude.Value value) {
        JsonSerialize jsonSerialize = (JsonSerialize) d(abstractC9509qt, JsonSerialize.class);
        if (jsonSerialize != null) {
            int i = AnonymousClass3.e[jsonSerialize.j().ordinal()];
            if (i == 1) {
                return value.d(JsonInclude.Include.ALWAYS);
            }
            if (i == 2) {
                return value.d(JsonInclude.Include.NON_NULL);
            }
            if (i == 3) {
                return value.d(JsonInclude.Include.NON_DEFAULT);
            }
            if (i == 4) {
                return value.d(JsonInclude.Include.NON_EMPTY);
            }
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonSerialize.Inclusion.values().length];
            e = iArr;
            try {
                iArr[JsonSerialize.Inclusion.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[JsonSerialize.Inclusion.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing v(AbstractC9509qt abstractC9509qt) {
        JsonSerialize jsonSerialize = (JsonSerialize) d(abstractC9509qt, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.f();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object y(AbstractC9509qt abstractC9509qt) {
        JsonSerialize jsonSerialize = (JsonSerialize) d(abstractC9509qt, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return a(jsonSerialize.c(), InterfaceC9535rS.e.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object h(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) d(annotatedMember, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return a(jsonSerialize.a(), InterfaceC9535rS.e.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType a(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, JavaType javaType) {
        JavaType I;
        JavaType I2;
        TypeFactory t = mapperConfig.t();
        JsonSerialize jsonSerialize = (JsonSerialize) d(abstractC9509qt, JsonSerialize.class);
        Class<?> d = jsonSerialize == null ? null : d(jsonSerialize.e());
        if (d != null) {
            if (javaType.d(d)) {
                javaType = javaType.I();
            } else {
                Class<?> h = javaType.h();
                try {
                    if (d.isAssignableFrom(h)) {
                        javaType = t.a(javaType, d);
                    } else if (h.isAssignableFrom(d)) {
                        javaType = t.d(javaType, d);
                    } else if (c(h, d)) {
                        javaType = javaType.I();
                    } else {
                        throw new JsonMappingException(null, String.format("Cannot refine serialization type %s into %s; types not related", javaType, d.getName()));
                    }
                } catch (IllegalArgumentException e) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, d.getName(), abstractC9509qt.d(), e.getMessage()), e);
                }
            }
        }
        if (javaType.B()) {
            JavaType f = javaType.f();
            Class<?> d2 = jsonSerialize == null ? null : d(jsonSerialize.i());
            if (d2 != null) {
                if (f.d(d2)) {
                    I2 = f.I();
                } else {
                    Class<?> h2 = f.h();
                    try {
                        if (d2.isAssignableFrom(h2)) {
                            I2 = t.a(f, d2);
                        } else if (h2.isAssignableFrom(d2)) {
                            I2 = t.d(f, d2);
                        } else if (c(h2, d2)) {
                            I2 = f.I();
                        } else {
                            throw new JsonMappingException(null, String.format("Cannot refine serialization key type %s into %s; types not related", f, d2.getName()));
                        }
                    } catch (IllegalArgumentException e2) {
                        throw new JsonMappingException((Closeable) null, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, d2.getName(), abstractC9509qt.d(), e2.getMessage()), e2);
                    }
                }
                javaType = ((MapLikeType) javaType).b(I2);
            }
        }
        JavaType j = javaType.j();
        if (j != null) {
            Class<?> d3 = jsonSerialize == null ? null : d(jsonSerialize.d());
            if (d3 != null) {
                if (j.d(d3)) {
                    I = j.I();
                } else {
                    Class<?> h3 = j.h();
                    try {
                        if (d3.isAssignableFrom(h3)) {
                            I = t.a(j, d3);
                        } else if (h3.isAssignableFrom(d3)) {
                            I = t.d(j, d3);
                        } else if (c(h3, d3)) {
                            I = j.I();
                        } else {
                            throw new JsonMappingException(null, String.format("Cannot refine serialization content type %s into %s; types not related", j, d3.getName()));
                        }
                    } catch (IllegalArgumentException e3) {
                        throw new JsonMappingException((Closeable) null, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, d3.getName(), abstractC9509qt.d(), e3.getMessage()), e3);
                    }
                }
                return javaType.e(I);
            }
            return javaType;
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] b(C9508qs c9508qs) {
        InterfaceC9310nF interfaceC9310nF = (InterfaceC9310nF) d(c9508qs, InterfaceC9310nF.class);
        if (interfaceC9310nF == null) {
            return null;
        }
        return interfaceC9310nF.e();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean u(AbstractC9509qt abstractC9509qt) {
        return M(abstractC9509qt);
    }

    private final Boolean M(AbstractC9509qt abstractC9509qt) {
        InterfaceC9310nF interfaceC9310nF = (InterfaceC9310nF) d(abstractC9509qt, InterfaceC9310nF.class);
        if (interfaceC9310nF == null || !interfaceC9310nF.d()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void e(MapperConfig<?> mapperConfig, C9508qs c9508qs, List<BeanPropertyWriter> list) {
        InterfaceC9455ps interfaceC9455ps = (InterfaceC9455ps) d(c9508qs, InterfaceC9455ps.class);
        if (interfaceC9455ps == null) {
            return;
        }
        boolean d = interfaceC9455ps.d();
        InterfaceC9455ps.d[] c2 = interfaceC9455ps.c();
        int length = c2.length;
        JavaType javaType = null;
        for (int i = 0; i < length; i++) {
            if (javaType == null) {
                javaType = mapperConfig.b(Object.class);
            }
            BeanPropertyWriter c3 = c(c2[i], mapperConfig, c9508qs, javaType);
            if (d) {
                list.add(i, c3);
            } else {
                list.add(c3);
            }
        }
        InterfaceC9455ps.e[] a2 = interfaceC9455ps.a();
        int length2 = a2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            BeanPropertyWriter e = e(a2[i2], mapperConfig, c9508qs);
            if (d) {
                list.add(i2, e);
            } else {
                list.add(e);
            }
        }
    }

    protected BeanPropertyWriter c(InterfaceC9455ps.d dVar, MapperConfig<?> mapperConfig, C9508qs c9508qs, JavaType javaType) {
        PropertyMetadata propertyMetadata = dVar.b() ? PropertyMetadata.a : PropertyMetadata.b;
        String d = dVar.d();
        PropertyName e = e(dVar.e(), dVar.c());
        if (!e.b()) {
            e = PropertyName.b(d);
        }
        return AttributePropertyWriter.b(d, C9541rY.d(mapperConfig, new VirtualAnnotatedMember(c9508qs, c9508qs.e(), d, javaType), e, propertyMetadata, dVar.a()), c9508qs.f(), javaType);
    }

    protected BeanPropertyWriter e(InterfaceC9455ps.e eVar, MapperConfig<?> mapperConfig, C9508qs c9508qs) {
        PropertyMetadata propertyMetadata = eVar.d() ? PropertyMetadata.a : PropertyMetadata.b;
        PropertyName e = e(eVar.c(), eVar.a());
        JavaType b2 = mapperConfig.b(eVar.b());
        C9541rY d = C9541rY.d(mapperConfig, new VirtualAnnotatedMember(c9508qs, c9508qs.e(), e.c(), b2), e, propertyMetadata, eVar.e());
        Class<? extends VirtualBeanPropertyWriter> j = eVar.j();
        AbstractC9415pE n = mapperConfig.n();
        VirtualBeanPropertyWriter e2 = n == null ? null : n.e(mapperConfig, j);
        if (e2 == null) {
            e2 = (VirtualBeanPropertyWriter) C9537rU.b(j, mapperConfig.f());
        }
        return e2.d(mapperConfig, c9508qs, d, b2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName o(AbstractC9509qt abstractC9509qt) {
        boolean z;
        InterfaceC9354nx interfaceC9354nx = (InterfaceC9354nx) d(abstractC9509qt, InterfaceC9354nx.class);
        if (interfaceC9354nx != null) {
            String b2 = interfaceC9354nx.b();
            if (!b2.isEmpty()) {
                return PropertyName.b(b2);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) d(abstractC9509qt, JsonProperty.class);
        if (jsonProperty != null) {
            return PropertyName.b(jsonProperty.d());
        }
        if (z || d(abstractC9509qt, b)) {
            return PropertyName.e;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean H(AbstractC9509qt abstractC9509qt) {
        InterfaceC9316nL interfaceC9316nL = (InterfaceC9316nL) d(abstractC9509qt, InterfaceC9316nL.class);
        if (interfaceC9316nL == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC9316nL.d());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean A(AbstractC9509qt abstractC9509qt) {
        InterfaceC9351nu interfaceC9351nu = (InterfaceC9351nu) d(abstractC9509qt, InterfaceC9351nu.class);
        if (interfaceC9351nu == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC9351nu.c());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean b(AnnotatedMethod annotatedMethod) {
        return c(annotatedMethod, InterfaceC9351nu.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean c(AnnotatedMethod annotatedMethod) {
        InterfaceC9316nL interfaceC9316nL = (InterfaceC9316nL) d(annotatedMethod, InterfaceC9316nL.class);
        return interfaceC9316nL != null && interfaceC9316nL.d();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object b(AbstractC9509qt abstractC9509qt) {
        Class<? extends AbstractC9452pp> i;
        InterfaceC9462pz interfaceC9462pz = (InterfaceC9462pz) d(abstractC9509qt, InterfaceC9462pz.class);
        if (interfaceC9462pz == null || (i = interfaceC9462pz.i()) == AbstractC9452pp.d.class) {
            return null;
        }
        return i;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object j(AbstractC9509qt abstractC9509qt) {
        Class<? extends AbstractC9450pn> h;
        InterfaceC9462pz interfaceC9462pz = (InterfaceC9462pz) d(abstractC9509qt, InterfaceC9462pz.class);
        if (interfaceC9462pz == null || (h = interfaceC9462pz.h()) == AbstractC9450pn.d.class) {
            return null;
        }
        return h;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object d(AbstractC9509qt abstractC9509qt) {
        Class<? extends AbstractC9452pp> d;
        InterfaceC9462pz interfaceC9462pz = (InterfaceC9462pz) d(abstractC9509qt, InterfaceC9462pz.class);
        if (interfaceC9462pz == null || (d = interfaceC9462pz.d()) == AbstractC9452pp.d.class) {
            return null;
        }
        return d;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object c(AbstractC9509qt abstractC9509qt) {
        InterfaceC9462pz interfaceC9462pz = (InterfaceC9462pz) d(abstractC9509qt, InterfaceC9462pz.class);
        if (interfaceC9462pz == null) {
            return null;
        }
        return a(interfaceC9462pz.f(), InterfaceC9535rS.e.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object c(AnnotatedMember annotatedMember) {
        InterfaceC9462pz interfaceC9462pz = (InterfaceC9462pz) d(annotatedMember, InterfaceC9462pz.class);
        if (interfaceC9462pz == null) {
            return null;
        }
        return a(interfaceC9462pz.a(), InterfaceC9535rS.e.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType e(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, JavaType javaType) {
        TypeFactory t = mapperConfig.t();
        InterfaceC9462pz interfaceC9462pz = (InterfaceC9462pz) d(abstractC9509qt, InterfaceC9462pz.class);
        Class<?> d = interfaceC9462pz == null ? null : d(interfaceC9462pz.c());
        if (d != null && !javaType.d(d) && !b(javaType, d)) {
            try {
                javaType = t.d(javaType, d);
            } catch (IllegalArgumentException e) {
                throw new JsonMappingException((Closeable) null, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType, d.getName(), abstractC9509qt.d(), e.getMessage()), e);
            }
        }
        if (javaType.B()) {
            JavaType f = javaType.f();
            Class<?> d2 = interfaceC9462pz == null ? null : d(interfaceC9462pz.j());
            if (d2 != null && !b(f, d2)) {
                try {
                    javaType = ((MapLikeType) javaType).b(t.d(f, d2));
                } catch (IllegalArgumentException e2) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, d2.getName(), abstractC9509qt.d(), e2.getMessage()), e2);
                }
            }
        }
        JavaType j = javaType.j();
        if (j != null) {
            Class<?> d3 = interfaceC9462pz == null ? null : d(interfaceC9462pz.b());
            if (d3 == null || b(j, d3)) {
                return javaType;
            }
            try {
                return javaType.e(t.d(j, d3));
            } catch (IllegalArgumentException e3) {
                throw new JsonMappingException((Closeable) null, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, d3.getName(), abstractC9509qt.d(), e3.getMessage()), e3);
            }
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object j(C9508qs c9508qs) {
        InterfaceC9417pG interfaceC9417pG = (InterfaceC9417pG) d(c9508qs, InterfaceC9417pG.class);
        if (interfaceC9417pG == null) {
            return null;
        }
        return interfaceC9417pG.d();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> e(C9508qs c9508qs) {
        InterfaceC9462pz interfaceC9462pz = (InterfaceC9462pz) d(c9508qs, InterfaceC9462pz.class);
        if (interfaceC9462pz == null) {
            return null;
        }
        return d(interfaceC9462pz.e());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC9411pA.d c(C9508qs c9508qs) {
        InterfaceC9411pA interfaceC9411pA = (InterfaceC9411pA) d(c9508qs, InterfaceC9411pA.class);
        if (interfaceC9411pA == null) {
            return null;
        }
        return new InterfaceC9411pA.d(interfaceC9411pA);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName k(AbstractC9509qt abstractC9509qt) {
        boolean z;
        JsonSetter jsonSetter = (JsonSetter) d(abstractC9509qt, JsonSetter.class);
        if (jsonSetter != null) {
            String e = jsonSetter.e();
            if (!e.isEmpty()) {
                return PropertyName.b(e);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) d(abstractC9509qt, JsonProperty.class);
        if (jsonProperty != null) {
            return PropertyName.b(jsonProperty.d());
        }
        if (z || d(abstractC9509qt, a)) {
            return PropertyName.e;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean I(AbstractC9509qt abstractC9509qt) {
        InterfaceC9352nv interfaceC9352nv = (InterfaceC9352nv) d(abstractC9509qt, InterfaceC9352nv.class);
        if (interfaceC9352nv == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC9352nv.c());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSetter.Value C(AbstractC9509qt abstractC9509qt) {
        return JsonSetter.Value.a((JsonSetter) d(abstractC9509qt, JsonSetter.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean i(AbstractC9509qt abstractC9509qt) {
        InterfaceC9308nD interfaceC9308nD = (InterfaceC9308nD) d(abstractC9509qt, InterfaceC9308nD.class);
        if (interfaceC9308nD == null) {
            return null;
        }
        return interfaceC9308nD.a().e();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean G(AbstractC9509qt abstractC9509qt) {
        AbstractC9497qh abstractC9497qh;
        Boolean c2;
        JsonCreator jsonCreator = (JsonCreator) d(abstractC9509qt, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.a() != JsonCreator.Mode.DISABLED;
        } else if (!this.d || !(abstractC9509qt instanceof AnnotatedConstructor) || (abstractC9497qh = c) == null || (c2 = abstractC9497qh.c(abstractC9509qt)) == null) {
            return false;
        } else {
            return c2.booleanValue();
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonCreator.Mode e(AbstractC9509qt abstractC9509qt) {
        JsonCreator jsonCreator = (JsonCreator) d(abstractC9509qt, JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.a();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode d(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt) {
        AbstractC9497qh abstractC9497qh;
        Boolean c2;
        JsonCreator jsonCreator = (JsonCreator) d(abstractC9509qt, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.a();
        }
        if (this.d && mapperConfig.a(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (abstractC9509qt instanceof AnnotatedConstructor) && (abstractC9497qh = c) != null && (c2 = abstractC9497qh.c(abstractC9509qt)) != null && c2.booleanValue()) {
            return JsonCreator.Mode.PROPERTIES;
        }
        return null;
    }

    protected boolean E(AbstractC9509qt abstractC9509qt) {
        Boolean a2;
        InterfaceC9355ny interfaceC9355ny = (InterfaceC9355ny) d(abstractC9509qt, InterfaceC9355ny.class);
        if (interfaceC9355ny != null) {
            return interfaceC9355ny.c();
        }
        AbstractC9497qh abstractC9497qh = c;
        if (abstractC9497qh == null || (a2 = abstractC9497qh.a(abstractC9509qt)) == null) {
            return false;
        }
        return a2.booleanValue();
    }

    protected Class<?> d(Class<?> cls) {
        if (cls == null || C9537rU.l(cls)) {
            return null;
        }
        return cls;
    }

    protected Class<?> a(Class<?> cls, Class<?> cls2) {
        Class<?> d = d(cls);
        if (d == null || d == cls2) {
            return null;
        }
        return d;
    }

    protected PropertyName e(String str, String str2) {
        if (str.isEmpty()) {
            return PropertyName.e;
        }
        if (str2 == null || str2.isEmpty()) {
            return PropertyName.b(str);
        }
        return PropertyName.a(str, str2);
    }

    protected PropertyName F(AbstractC9509qt abstractC9509qt) {
        AbstractC9497qh abstractC9497qh;
        PropertyName e;
        if (abstractC9509qt instanceof AnnotatedParameter) {
            AnnotatedParameter annotatedParameter = (AnnotatedParameter) abstractC9509qt;
            if (annotatedParameter.f() == null || (abstractC9497qh = c) == null || (e = abstractC9497qh.e(annotatedParameter)) == null) {
                return null;
            }
            return e;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [o.qZ] */
    protected InterfaceC9489qZ<?> d(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, JavaType javaType) {
        InterfaceC9489qZ<?> a2;
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) d(abstractC9509qt, JsonTypeInfo.class);
        InterfaceC9461py interfaceC9461py = (InterfaceC9461py) d(abstractC9509qt, InterfaceC9461py.class);
        if (interfaceC9461py != null) {
            if (jsonTypeInfo == null) {
                return null;
            }
            a2 = mapperConfig.b(abstractC9509qt, interfaceC9461py.a());
        } else if (jsonTypeInfo == null) {
            return null;
        } else {
            if (jsonTypeInfo.e() == JsonTypeInfo.Id.NONE) {
                return e();
            }
            a2 = a();
        }
        InterfaceC9412pB interfaceC9412pB = (InterfaceC9412pB) d(abstractC9509qt, InterfaceC9412pB.class);
        InterfaceC9545rc a3 = interfaceC9412pB != null ? mapperConfig.a(abstractC9509qt, interfaceC9412pB.b()) : null;
        if (a3 != null) {
            a3.e(javaType);
        }
        ?? d = a2.d(jsonTypeInfo.e(), a3);
        JsonTypeInfo.As b2 = jsonTypeInfo.b();
        if (b2 == JsonTypeInfo.As.EXTERNAL_PROPERTY && (abstractC9509qt instanceof C9508qs)) {
            b2 = JsonTypeInfo.As.PROPERTY;
        }
        InterfaceC9489qZ e = d.c(b2).e(jsonTypeInfo.c());
        Class<?> d2 = jsonTypeInfo.d();
        if (d2 != JsonTypeInfo.a.class && !d2.isAnnotation()) {
            e = e.e(d2);
        }
        return e.d(jsonTypeInfo.a());
    }

    protected C9555rm a() {
        return new C9555rm();
    }

    protected C9555rm e() {
        return C9555rm.a();
    }

    private boolean c(Class<?> cls, Class<?> cls2) {
        return cls.isPrimitive() ? cls == C9537rU.v(cls2) : cls2.isPrimitive() && cls2 == C9537rU.v(cls);
    }

    private boolean b(JavaType javaType, Class<?> cls) {
        if (javaType.C()) {
            return javaType.d(C9537rU.v(cls));
        }
        return cls.isPrimitive() && cls == C9537rU.v(javaType.h());
    }
}
