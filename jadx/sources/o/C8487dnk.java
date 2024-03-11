package o;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;

/* renamed from: o.dnk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8487dnk<T> implements ProduceStateScope<T> {
    private final dqZ b;
    private final /* synthetic */ MutableState<T> e;

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return this.e.component1();
    }

    @Override // o.dwU
    public dqZ getCoroutineContext() {
        return this.b;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return this.e.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t) {
        this.e.setValue(t);
    }

    public C8487dnk(MutableState<T> mutableState, dqZ dqz) {
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) dqz, "");
        this.b = dqz;
        this.e = mutableState;
    }
}
