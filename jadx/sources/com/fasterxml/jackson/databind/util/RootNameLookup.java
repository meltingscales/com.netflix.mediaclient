package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class RootNameLookup implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient LRUMap<ClassKey, PropertyName> c = new LRUMap<>(20, 200);

    public PropertyName e(JavaType javaType, MapperConfig<?> mapperConfig) {
        return a(javaType.h(), mapperConfig);
    }

    public PropertyName a(Class<?> cls, MapperConfig<?> mapperConfig) {
        ClassKey classKey = new ClassKey(cls);
        PropertyName a = this.c.a(classKey);
        if (a != null) {
            return a;
        }
        PropertyName d = mapperConfig.h().d(mapperConfig.j(cls).k());
        if (d == null || !d.b()) {
            d = PropertyName.b(cls.getSimpleName());
        }
        this.c.c(classKey, d);
        return d;
    }

    protected Object readResolve() {
        return new RootNameLookup();
    }
}
