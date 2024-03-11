package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Collection;

/* renamed from: o.rd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9546rd {
    public abstract void c(Collection<Class<?>> collection);

    public abstract void e(NamedType... namedTypeArr);

    public abstract void e(Class<?>... clsArr);

    public Collection<NamedType> d(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return a(annotatedMember, mapperConfig, mapperConfig.h(), javaType);
    }

    public Collection<NamedType> d(MapperConfig<?> mapperConfig, C9508qs c9508qs) {
        return a(c9508qs, mapperConfig, mapperConfig.h());
    }

    public Collection<NamedType> e(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return a(annotatedMember, mapperConfig, mapperConfig.h(), javaType);
    }

    public Collection<NamedType> e(MapperConfig<?> mapperConfig, C9508qs c9508qs) {
        return a(c9508qs, mapperConfig, mapperConfig.h());
    }

    @Deprecated
    public Collection<NamedType> a(AnnotatedMember annotatedMember, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, JavaType javaType) {
        return d(mapperConfig, annotatedMember, javaType);
    }

    @Deprecated
    public Collection<NamedType> a(C9508qs c9508qs, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector) {
        return d(mapperConfig, c9508qs);
    }
}
