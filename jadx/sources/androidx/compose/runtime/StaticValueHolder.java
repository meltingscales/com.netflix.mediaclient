package androidx.compose.runtime;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class StaticValueHolder<T> implements State<T> {
    private final T value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && C8632dsu.c(this.value, ((StaticValueHolder) obj).value);
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.value + ')';
    }

    public StaticValueHolder(T t) {
        this.value = t;
    }
}
