package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import o.AbstractC9459pw;
import o.AbstractC9509qt;
import o.InterfaceC9480qQ;
import o.InterfaceC9539rW;

/* loaded from: classes5.dex */
public interface BeanProperty extends InterfaceC9539rW {
    public static final JsonFormat.Value c = new JsonFormat.Value();
    public static final JsonInclude.Value e = JsonInclude.Value.a();

    JsonInclude.Value a(MapperConfig<?> mapperConfig, Class<?> cls);

    @Override // o.InterfaceC9539rW
    String a();

    PropertyName b();

    PropertyMetadata c();

    JsonFormat.Value d(MapperConfig<?> mapperConfig, Class<?> cls);

    JavaType d();

    void d(InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw);

    AnnotatedMember e();

    /* loaded from: classes5.dex */
    public static class Std implements BeanProperty, Serializable {
        private static final long serialVersionUID = 1;
        protected final PropertyMetadata a;
        public final AnnotatedMember b;
        protected final PropertyName d;
        protected final PropertyName f;
        protected final JavaType j;

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyName b() {
            return this.d;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyMetadata c() {
            return this.a;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JavaType d() {
            return this.j;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember e() {
            return this.b;
        }

        public PropertyName h() {
            return this.f;
        }

        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this.d = propertyName;
            this.j = javaType;
            this.f = propertyName2;
            this.a = propertyMetadata;
            this.b = annotatedMember;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonFormat.Value d(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonFormat.Value g;
            JsonFormat.Value h = mapperConfig.h(cls);
            AnnotationIntrospector h2 = mapperConfig.h();
            return (h2 == null || (annotatedMember = this.b) == null || (g = h2.g((AbstractC9509qt) annotatedMember)) == null) ? h : h.c(g);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonInclude.Value a(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonInclude.Value t;
            JsonInclude.Value e = mapperConfig.e(cls, this.j.h());
            AnnotationIntrospector h = mapperConfig.h();
            return (h == null || (annotatedMember = this.b) == null || (t = h.t(annotatedMember)) == null) ? e : e.b(t);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty, o.InterfaceC9539rW
        public String a() {
            return this.d.c();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public void d(InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
            throw new UnsupportedOperationException("Instances of " + getClass().getName() + " should not get visited");
        }
    }

    /* loaded from: classes5.dex */
    public static class c implements BeanProperty {
        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonInclude.Value a(MapperConfig<?> mapperConfig, Class<?> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty, o.InterfaceC9539rW
        public String a() {
            return "";
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public void d(InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember e() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyName b() {
            return PropertyName.a;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JavaType d() {
            return TypeFactory.b();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyMetadata c() {
            return PropertyMetadata.c;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonFormat.Value d(MapperConfig<?> mapperConfig, Class<?> cls) {
            return JsonFormat.Value.d();
        }
    }
}
