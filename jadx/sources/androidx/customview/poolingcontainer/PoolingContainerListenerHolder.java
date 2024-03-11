package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import o.C8569dql;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener poolingContainerListener) {
        C8632dsu.c((Object) poolingContainerListener, "");
        this.listeners.add(poolingContainerListener);
    }

    public final void removeListener(PoolingContainerListener poolingContainerListener) {
        C8632dsu.c((Object) poolingContainerListener, "");
        this.listeners.remove(poolingContainerListener);
    }

    public final void onRelease() {
        int t;
        for (t = C8569dql.t(this.listeners); -1 < t; t--) {
            this.listeners.get(t).onRelease();
        }
    }
}
