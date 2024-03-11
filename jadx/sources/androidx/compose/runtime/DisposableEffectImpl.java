package androidx.compose.runtime;

import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DisposableEffectImpl implements RememberObserver {
    private final drM<DisposableEffectScope, DisposableEffectResult> effect;
    private DisposableEffectResult onDispose;

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DisposableEffectImpl(drM<? super DisposableEffectScope, ? extends DisposableEffectResult> drm) {
        this.effect = drm;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        DisposableEffectScope disposableEffectScope;
        drM<DisposableEffectScope, DisposableEffectResult> drm = this.effect;
        disposableEffectScope = EffectsKt.InternalDisposableEffectScope;
        this.onDispose = drm.invoke(disposableEffectScope);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.onDispose;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.onDispose = null;
    }
}
