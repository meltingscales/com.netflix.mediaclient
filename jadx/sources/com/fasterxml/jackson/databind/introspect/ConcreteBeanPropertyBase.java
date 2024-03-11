package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import o.AbstractC9509qt;

/* loaded from: classes5.dex */
public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    private static final long serialVersionUID = 1;
    protected transient List<PropertyName> s;
    protected final PropertyMetadata y;

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyMetadata c() {
        return this.y;
    }

    public ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        this.y = propertyMetadata == null ? PropertyMetadata.c : propertyMetadata;
    }

    public ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this.y = concreteBeanPropertyBase.y;
    }

    public boolean q() {
        return this.y.d();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonFormat.Value d(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotatedMember e;
        JsonFormat.Value h = mapperConfig.h(cls);
        AnnotationIntrospector h2 = mapperConfig.h();
        JsonFormat.Value g = (h2 == null || (e = e()) == null) ? null : h2.g((AbstractC9509qt) e);
        return h == null ? g == null ? BeanProperty.c : g : g == null ? h : h.c(g);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonInclude.Value a(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotationIntrospector h = mapperConfig.h();
        AnnotatedMember e = e();
        if (e == null) {
            return mapperConfig.g(cls);
        }
        JsonInclude.Value e2 = mapperConfig.e(cls, e.e());
        if (h == null) {
            return e2;
        }
        JsonInclude.Value t = h.t(e);
        return e2 == null ? t : e2.b(t);
    }

    public List<PropertyName> d(MapperConfig<?> mapperConfig) {
        AnnotatedMember e;
        List<PropertyName> list = this.s;
        if (list == null) {
            AnnotationIntrospector h = mapperConfig.h();
            if (h != null && (e = e()) != null) {
                list = h.r(e);
            }
            if (list == null) {
                list = Collections.emptyList();
            }
            this.s = list;
        }
        return list;
    }
}
