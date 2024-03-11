package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    private final GeneratedAdapter generatedAdapter;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        C8632dsu.c((Object) generatedAdapter, "");
        this.generatedAdapter = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        this.generatedAdapter.callMethods(lifecycleOwner, event, false, null);
        this.generatedAdapter.callMethods(lifecycleOwner, event, true, null);
    }
}
