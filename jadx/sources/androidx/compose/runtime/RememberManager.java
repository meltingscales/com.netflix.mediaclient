package androidx.compose.runtime;

import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public interface RememberManager {
    void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback);

    void forgetting(RememberObserver rememberObserver);

    void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback);

    void remembering(RememberObserver rememberObserver);

    void sideEffect(drO<dpR> dro);
}
