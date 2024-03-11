package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class WeakCache<T> {
    private final MutableVector<Reference<T>> values = new MutableVector<>(new Reference[16], 0);
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    public final void push(T t) {
        clearWeakReferences();
        this.values.add(new WeakReference(t, this.referenceQueue));
    }

    public final T pop() {
        clearWeakReferences();
        while (this.values.isNotEmpty()) {
            MutableVector<Reference<T>> mutableVector = this.values;
            T t = mutableVector.removeAt(mutableVector.getSize() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    private final void clearWeakReferences() {
        Reference<? extends T> poll;
        do {
            poll = this.referenceQueue.poll();
            if (poll != null) {
                this.values.remove(poll);
                continue;
            }
        } while (poll != null);
    }
}
