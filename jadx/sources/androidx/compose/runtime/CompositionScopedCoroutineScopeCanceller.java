package androidx.compose.runtime;

import o.dwU;
import o.dwY;

/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    private final dwU coroutineScope;

    public final dwU getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    public CompositionScopedCoroutineScopeCanceller(dwU dwu) {
        this.coroutineScope = dwu;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        dwY.a(this.coroutineScope, new LeftCompositionCancellationException());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        dwY.a(this.coroutineScope, new LeftCompositionCancellationException());
    }
}
