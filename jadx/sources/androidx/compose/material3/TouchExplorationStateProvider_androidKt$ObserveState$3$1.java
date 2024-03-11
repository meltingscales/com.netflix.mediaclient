package androidx.compose.material3;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Lambda;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes5.dex */
final class TouchExplorationStateProvider_androidKt$ObserveState$3$1 extends Lambda implements drM<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ drM<Lifecycle.Event, dpR> $handleEvent;
    final /* synthetic */ drO<dpR> $onDispose;
    final /* synthetic */ Lifecycle $this_ObserveState;

    @Override // o.drM
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final drM<Lifecycle.Event, dpR> drm = this.$handleEvent;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt$ObserveState$3$1$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                drM.this.invoke(event);
            }
        };
        this.$this_ObserveState.addObserver(lifecycleEventObserver);
        final drO<dpR> dro = this.$onDispose;
        final Lifecycle lifecycle = this.$this_ObserveState;
        return new DisposableEffectResult() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt$ObserveState$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                drO.this.invoke();
                lifecycle.removeObserver(lifecycleEventObserver);
            }
        };
    }
}
