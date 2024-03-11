package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.util.Iterator;

/* renamed from: o.qB  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9465qB implements InterfaceC9539rW {
    public static final JsonInclude.Value a = JsonInclude.Value.a();

    public boolean A() {
        return false;
    }

    public abstract boolean D();

    @Override // o.InterfaceC9539rW
    public abstract String a();

    public C9471qH c() {
        return null;
    }

    public abstract JsonInclude.Value d();

    public AnnotationIntrospector.ReferenceProperty f() {
        return null;
    }

    public Class<?>[] i() {
        return null;
    }

    public abstract AnnotatedParameter j();

    public abstract AnnotatedField l();

    public abstract AnnotatedMethod m();

    public abstract PropertyMetadata n();

    public abstract PropertyName o();

    public abstract Class<?> p();

    public abstract JavaType q();

    public abstract AnnotatedMember s();

    public abstract AnnotatedMethod u();

    public abstract boolean v();

    public abstract PropertyName w();

    public abstract boolean x();

    public abstract boolean y();

    public boolean e(PropertyName propertyName) {
        return o().equals(propertyName);
    }

    public boolean C() {
        return D();
    }

    public boolean e() {
        return r() != null;
    }

    public boolean b() {
        return h() != null;
    }

    public Iterator<AnnotatedParameter> k() {
        return C9537rU.c();
    }

    public AnnotatedMember h() {
        AnnotatedMethod m = m();
        return m == null ? l() : m;
    }

    public AnnotatedMember r() {
        AnnotatedParameter j = j();
        if (j == null) {
            AnnotatedMethod u = u();
            return u == null ? l() : u;
        }
        return j;
    }

    public AnnotatedMember t() {
        AnnotatedMethod u = u();
        return u == null ? l() : u;
    }

    public String g() {
        AnnotationIntrospector.ReferenceProperty f = f();
        if (f == null) {
            return null;
        }
        return f.b();
    }
}
