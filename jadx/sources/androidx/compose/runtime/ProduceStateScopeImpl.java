package androidx.compose.runtime;

import o.dqZ;

/* loaded from: classes.dex */
final class ProduceStateScopeImpl<T> implements ProduceStateScope<T> {
    private final /* synthetic */ MutableState<T> $$delegate_0;
    private final dqZ coroutineContext;

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return this.$$delegate_0.component1();
    }

    @Override // o.dwU
    public dqZ getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t) {
        this.$$delegate_0.setValue(t);
    }

    public ProduceStateScopeImpl(MutableState<T> mutableState, dqZ dqz) {
        this.coroutineContext = dqz;
        this.$$delegate_0 = mutableState;
    }
}
