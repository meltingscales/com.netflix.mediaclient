package o;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC9411pA;

/* renamed from: o.pi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9445pi {
    protected final JavaType a;

    public abstract Constructor<?> a(Class<?>... clsArr);

    public abstract Class<?>[] a();

    public abstract JsonInclude.Value b(JsonInclude.Value value);

    public abstract AnnotatedConstructor b();

    public abstract AnnotatedMethod b(String str, Class<?>[] clsArr);

    public abstract Object b(boolean z);

    public abstract Method b(Class<?>... clsArr);

    public abstract AnnotatedMember c();

    public abstract List<AbstractC9465qB> d();

    public abstract JsonFormat.Value e(JsonFormat.Value value);

    public abstract AnnotatedMember e();

    public abstract Map<Object, AnnotatedMember> f();

    public abstract InterfaceC9535rS<Object, Object> g();

    public abstract Class<?> h();

    public abstract InterfaceC9411pA.d i();

    public abstract AnnotatedMember j();

    public abstract C9508qs k();

    public abstract List<AbstractC9465qB> l();

    public abstract InterfaceC9535rS<Object, Object> m();

    public abstract InterfaceC9532rP n();

    public abstract C9471qH p();

    public abstract List<AnnotatedConstructor> q();

    public abstract Set<String> r();

    public abstract List<AnnotatedMethod> s();

    public JavaType t() {
        return this.a;
    }

    public abstract boolean u();

    public AbstractC9445pi(JavaType javaType) {
        this.a = javaType;
    }

    public Class<?> o() {
        return this.a.h();
    }

    public boolean v() {
        return k().k();
    }
}
