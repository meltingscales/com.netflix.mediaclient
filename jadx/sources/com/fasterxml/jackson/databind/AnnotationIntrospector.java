package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import o.AbstractC9509qt;
import o.C9471qH;
import o.C9508qs;
import o.InterfaceC9411pA;
import o.InterfaceC9489qZ;

/* loaded from: classes5.dex */
public abstract class AnnotationIntrospector implements Serializable {
    public Class<?>[] B(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public PropertyName D(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    @Deprecated
    public boolean G(AbstractC9509qt abstractC9509qt) {
        return false;
    }

    public Boolean I(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public ReferenceProperty a(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType a(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, JavaType javaType) {
        return javaType;
    }

    public AnnotatedMethod a(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }

    public Enum<?> a(Class<Enum<?>> cls) {
        return null;
    }

    public Object a(C9508qs c9508qs) {
        return null;
    }

    public Object a(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public C9471qH a(AbstractC9509qt abstractC9509qt, C9471qH c9471qH) {
        return c9471qH;
    }

    public VisibilityChecker<?> b(C9508qs c9508qs, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public Object b(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public String b(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public boolean b(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public String[] b(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public String[] b(C9508qs c9508qs) {
        return null;
    }

    public Object c(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object c(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public InterfaceC9411pA.d c(C9508qs c9508qs) {
        return null;
    }

    public InterfaceC9489qZ<?> c(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    @Deprecated
    public boolean c(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public boolean c(Annotation annotation) {
        return false;
    }

    public PropertyName d(C9508qs c9508qs) {
        return null;
    }

    public Object d(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public InterfaceC9489qZ<?> d(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public InterfaceC9489qZ<?> d(MapperConfig<?> mapperConfig, C9508qs c9508qs, JavaType javaType) {
        return null;
    }

    @Deprecated
    public JsonCreator.Mode e(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public JavaType e(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt, JavaType javaType) {
        return javaType;
    }

    public Class<?> e(C9508qs c9508qs) {
        return null;
    }

    @Deprecated
    public Object e(AnnotatedMember annotatedMember) {
        return null;
    }

    public void e(MapperConfig<?> mapperConfig, C9508qs c9508qs, List<BeanPropertyWriter> list) {
    }

    public NameTransformer f(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object f(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public String g(C9508qs c9508qs) {
        return null;
    }

    public boolean g(AnnotatedMember annotatedMember) {
        return false;
    }

    public Object h(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object h(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public Boolean i(AnnotatedMember annotatedMember) {
        return null;
    }

    public Boolean i(C9508qs c9508qs) {
        return null;
    }

    public Boolean i(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public Boolean j(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object j(C9508qs c9508qs) {
        return null;
    }

    public Object j(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public PropertyName k(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public JsonProperty.Access l(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public Object m(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public C9471qH n(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public PropertyName o(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public String q(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public List<PropertyName> r(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public String s(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public Boolean u(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public JsonSerialize.Typing v(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public Integer w(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public Object x(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public Object y(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    public List<NamedType> z(AbstractC9509qt abstractC9509qt) {
        return null;
    }

    /* loaded from: classes5.dex */
    public static class ReferenceProperty {
        private final String a;
        private final Type e;

        /* loaded from: classes5.dex */
        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public String b() {
            return this.a;
        }

        public ReferenceProperty(Type type, String str) {
            this.e = type;
            this.a = str;
        }

        public static ReferenceProperty d(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }

        public static ReferenceProperty e(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        public boolean d() {
            return this.e == Type.MANAGED_REFERENCE;
        }

        public boolean c() {
            return this.e == Type.BACK_REFERENCE;
        }
    }

    public static AnnotationIntrospector c() {
        return NopAnnotationIntrospector.c;
    }

    public JsonIgnoreProperties.Value p(AbstractC9509qt abstractC9509qt) {
        return JsonIgnoreProperties.Value.a();
    }

    public JacksonInject.Value d(AnnotatedMember annotatedMember) {
        Object e = e(annotatedMember);
        if (e != null) {
            return JacksonInject.Value.a(e);
        }
        return null;
    }

    public JsonFormat.Value g(AbstractC9509qt abstractC9509qt) {
        return JsonFormat.Value.d();
    }

    public JsonInclude.Value t(AbstractC9509qt abstractC9509qt) {
        return JsonInclude.Value.a();
    }

    public Boolean H(AbstractC9509qt abstractC9509qt) {
        if ((abstractC9509qt instanceof AnnotatedMethod) && c((AnnotatedMethod) abstractC9509qt)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Boolean A(AbstractC9509qt abstractC9509qt) {
        if ((abstractC9509qt instanceof AnnotatedMethod) && b((AnnotatedMethod) abstractC9509qt)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public JsonSetter.Value C(AbstractC9509qt abstractC9509qt) {
        return JsonSetter.Value.b();
    }

    public JsonCreator.Mode d(MapperConfig<?> mapperConfig, AbstractC9509qt abstractC9509qt) {
        if (G(abstractC9509qt)) {
            JsonCreator.Mode e = e(abstractC9509qt);
            return e == null ? JsonCreator.Mode.DEFAULT : e;
        }
        return null;
    }

    public <A extends Annotation> A d(AbstractC9509qt abstractC9509qt, Class<A> cls) {
        return (A) abstractC9509qt.d(cls);
    }

    public boolean c(AbstractC9509qt abstractC9509qt, Class<? extends Annotation> cls) {
        return abstractC9509qt.a(cls);
    }

    public boolean d(AbstractC9509qt abstractC9509qt, Class<? extends Annotation>[] clsArr) {
        return abstractC9509qt.a(clsArr);
    }
}
