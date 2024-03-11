package androidx.compose.runtime.tooling;

import androidx.compose.runtime.RecomposeScope;

/* loaded from: classes.dex */
public interface RecomposeScopeObserver {
    void onBeginScopeComposition(RecomposeScope recomposeScope);

    void onEndScopeComposition(RecomposeScope recomposeScope);

    void onScopeDisposed(RecomposeScope recomposeScope);
}
