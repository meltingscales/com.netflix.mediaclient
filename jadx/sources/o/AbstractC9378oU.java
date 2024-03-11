package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: o.oU  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9378oU<T> implements Comparable<AbstractC9378oU<T>> {
    protected final Type b;

    public Type b() {
        return this.b;
    }

    protected AbstractC9378oU() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
        }
        this.b = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
