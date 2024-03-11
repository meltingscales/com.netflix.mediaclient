package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import o.InterfaceC9535rS;

/* renamed from: o.pj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9446pj {
    protected abstract JsonMappingException c(JavaType javaType, String str, String str2);

    public abstract MapperConfig<?> c();

    public abstract <T> T c(JavaType javaType, String str);

    public abstract TypeFactory e();

    public JavaType c(Type type) {
        if (type == null) {
            return null;
        }
        return e().d(type);
    }

    public JavaType b(JavaType javaType, Class<?> cls) {
        return javaType.h() == cls ? javaType : c().d(javaType, cls);
    }

    public JavaType e(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) {
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            return d(javaType, str, polymorphicTypeValidator, indexOf);
        }
        MapperConfig<?> c = c();
        PolymorphicTypeValidator.Validity a = polymorphicTypeValidator.a(c, javaType, str);
        if (a == PolymorphicTypeValidator.Validity.DENIED) {
            return (JavaType) c(javaType, str, polymorphicTypeValidator);
        }
        try {
            Class<?> d = e().d(str);
            if (!javaType.b(d)) {
                return (JavaType) a(javaType, str);
            }
            JavaType d2 = c.t().d(javaType, d);
            return (a != PolymorphicTypeValidator.Validity.INDETERMINATE || polymorphicTypeValidator.e(c, javaType, d2) == PolymorphicTypeValidator.Validity.ALLOWED) ? d2 : (JavaType) a(javaType, str, polymorphicTypeValidator);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            throw c(javaType, str, String.format("problem: (%s) %s", e.getClass().getName(), C9537rU.d((Throwable) e)));
        }
    }

    private JavaType d(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator, int i) {
        MapperConfig<?> c = c();
        PolymorphicTypeValidator.Validity a = polymorphicTypeValidator.a(c, javaType, str.substring(0, i));
        if (a == PolymorphicTypeValidator.Validity.DENIED) {
            return (JavaType) c(javaType, str, polymorphicTypeValidator);
        }
        JavaType c2 = e().c(str);
        if (!c2.e(javaType.h())) {
            return (JavaType) a(javaType, str);
        }
        PolymorphicTypeValidator.Validity validity = PolymorphicTypeValidator.Validity.ALLOWED;
        return (a == validity || polymorphicTypeValidator.e(c, javaType, c2) == validity) ? c2 : (JavaType) a(javaType, str, polymorphicTypeValidator);
    }

    protected <T> T a(JavaType javaType, String str) {
        throw c(javaType, str, "Not a subtype");
    }

    protected <T> T c(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw c(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + C9537rU.d(polymorphicTypeValidator) + ") denied resolution");
    }

    protected <T> T a(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw c(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + C9537rU.d(polymorphicTypeValidator) + ") denied resolution");
    }

    public ObjectIdGenerator<?> d(AbstractC9509qt abstractC9509qt, C9471qH c9471qH) {
        Class<? extends ObjectIdGenerator<?>> c = c9471qH.c();
        MapperConfig<?> c2 = c();
        AbstractC9415pE n = c2.n();
        ObjectIdGenerator<?> e = n == null ? null : n.e(c2, abstractC9509qt, c);
        if (e == null) {
            e = (ObjectIdGenerator) C9537rU.b(c, c2.f());
        }
        return e.a(c9471qH.f());
    }

    public InterfaceC9317nM a(AbstractC9509qt abstractC9509qt, C9471qH c9471qH) {
        Class<? extends InterfaceC9317nM> b = c9471qH.b();
        MapperConfig<?> c = c();
        AbstractC9415pE n = c.n();
        InterfaceC9317nM c2 = n == null ? null : n.c(c, abstractC9509qt, b);
        return c2 == null ? (InterfaceC9317nM) C9537rU.b(b, c.f()) : c2;
    }

    public InterfaceC9535rS<Object, Object> b(AbstractC9509qt abstractC9509qt, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC9535rS) {
            return (InterfaceC9535rS) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class<?> cls = (Class) obj;
        if (cls == InterfaceC9535rS.e.class || C9537rU.l(cls)) {
            return null;
        }
        if (!InterfaceC9535rS.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        MapperConfig<?> c = c();
        AbstractC9415pE n = c.n();
        InterfaceC9535rS<?, ?> b = n != null ? n.b(c, abstractC9509qt, cls) : null;
        return b == null ? (InterfaceC9535rS) C9537rU.b(cls, c.f()) : b;
    }

    public <T> T c(Class<?> cls, String str) {
        return (T) c(c(cls), str);
    }

    public final String c(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    protected final String c(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    public String b(String str) {
        return str == null ? "[N/A]" : String.format("\"%s\"", c(str));
    }

    public String b(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + ": " + str2;
    }
}
