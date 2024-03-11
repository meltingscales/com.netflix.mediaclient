package androidx.activity.contextaware;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ContextAwareHelper {
    private volatile Context context;
    private final Set<OnContextAvailableListener> listeners = new CopyOnWriteArraySet();

    public final void clearAvailableContext() {
        this.context = null;
    }

    public final Context peekAvailableContext() {
        return this.context;
    }

    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        C8632dsu.c((Object) onContextAvailableListener, "");
        Context context = this.context;
        if (context != null) {
            onContextAvailableListener.onContextAvailable(context);
        }
        this.listeners.add(onContextAvailableListener);
    }

    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        C8632dsu.c((Object) onContextAvailableListener, "");
        this.listeners.remove(onContextAvailableListener);
    }

    public final void dispatchOnContextAvailable(Context context) {
        C8632dsu.c((Object) context, "");
        this.context = context;
        for (OnContextAvailableListener onContextAvailableListener : this.listeners) {
            onContextAvailableListener.onContextAvailable(context);
        }
    }
}
