package o;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.EnumMap;
import java.util.EnumSet;

/* renamed from: o.rl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9554rl extends AbstractC9552rj {
    protected final PolymorphicTypeValidator b;

    @Override // o.AbstractC9552rj, o.InterfaceC9545rc
    public String a() {
        return "class name used as type id";
    }

    public C9554rl(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory);
        this.b = polymorphicTypeValidator;
    }

    public static C9554rl d(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new C9554rl(javaType, mapperConfig.t(), polymorphicTypeValidator);
    }

    @Override // o.InterfaceC9545rc
    public String c(Object obj) {
        return d(obj, obj.getClass(), this.c);
    }

    @Override // o.InterfaceC9545rc
    public String e(Object obj, Class<?> cls) {
        return d(obj, cls, this.c);
    }

    @Override // o.AbstractC9552rj, o.InterfaceC9545rc
    public JavaType e(AbstractC9446pj abstractC9446pj, String str) {
        return b(str, abstractC9446pj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JavaType b(String str, AbstractC9446pj abstractC9446pj) {
        JavaType e = abstractC9446pj.e(this.d, str, this.b);
        return (e == null && (abstractC9446pj instanceof DeserializationContext)) ? ((DeserializationContext) abstractC9446pj).b(this.d, str, this, "no such class found") : e;
    }

    protected String d(Object obj, Class<?> cls, TypeFactory typeFactory) {
        if (C9537rU.t(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (!name.startsWith("java.util.")) {
            return (name.indexOf(36) < 0 || C9537rU.n(cls) == null || C9537rU.n(this.d.h()) != null) ? name : this.d.h().getName();
        } else if (obj instanceof EnumSet) {
            return typeFactory.b(EnumSet.class, C9537rU.a((EnumSet<?>) obj)).e();
        } else {
            return obj instanceof EnumMap ? typeFactory.a(EnumMap.class, C9537rU.c((EnumMap<?, ?>) obj), Object.class).e() : name;
        }
    }
}
