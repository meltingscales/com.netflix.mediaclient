package androidx.lifecycle;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) lifecycleOwner, "");
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
