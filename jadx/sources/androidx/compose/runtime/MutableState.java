package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface MutableState<T> extends State<T> {
    T component1();

    @Override // androidx.compose.runtime.State
    T getValue();

    void setValue(T t);
}
