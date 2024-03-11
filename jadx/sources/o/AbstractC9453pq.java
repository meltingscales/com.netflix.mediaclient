package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* renamed from: o.pq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9453pq<T> implements InterfaceC9477qN {

    /* renamed from: o.pq$d */
    /* loaded from: classes5.dex */
    public static abstract class d extends AbstractC9453pq<Object> {
    }

    public AbstractC9453pq<T> a(NameTransformer nameTransformer) {
        return this;
    }

    public boolean b() {
        return false;
    }

    public Class<T> c() {
        return null;
    }

    public boolean c(AbstractC9459pw abstractC9459pw, T t) {
        return t == null;
    }

    public abstract void e(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw);

    public boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        Class c = c();
        if (c == null) {
            c = t.getClass();
        }
        abstractC9459pw.c(c, String.format("Type id handling not implemented for type %s (by serializer of type %s)", c.getName(), getClass().getName()));
    }

    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        interfaceC9478qO.a(javaType);
    }
}
