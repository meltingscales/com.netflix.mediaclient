package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = MutableVector.$stable;
    private final drO<dpR> onVectorMutated;
    private final MutableVector<T> vector;

    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public MutableVectorWithMutationTracking(MutableVector<T> mutableVector, drO<dpR> dro) {
        this.vector = mutableVector;
        this.onVectorMutated = dro;
    }

    public final int getSize() {
        return this.vector.getSize();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void add(int i, T t) {
        this.vector.add(i, t);
        this.onVectorMutated.invoke();
    }

    public final T removeAt(int i) {
        T removeAt = this.vector.removeAt(i);
        this.onVectorMutated.invoke();
        return removeAt;
    }

    public final List<T> asList() {
        return this.vector.asMutableList();
    }

    public final T get(int i) {
        return this.vector.getContent()[i];
    }
}
