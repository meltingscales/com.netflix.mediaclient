package androidx.compose.runtime;

import o.drO;

/* loaded from: classes.dex */
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    private final SnapshotMutationPolicy<T> policy;

    public DynamicProvidableCompositionLocal(SnapshotMutationPolicy<T> snapshotMutationPolicy, drO<? extends T> dro) {
        super(dro);
        this.policy = snapshotMutationPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    public State<T> updatedStateOf$runtime_release(T t, State<? extends T> state) {
        if (state != 0 && (state instanceof MutableState)) {
            ((MutableState) state).setValue(t);
            return state;
        }
        return SnapshotStateKt.mutableStateOf(t, this.policy);
    }
}
