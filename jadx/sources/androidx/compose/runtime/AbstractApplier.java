package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    private T current;
    private final T root;
    private final List<T> stack = new ArrayList();

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    protected abstract void onClear();

    protected void setCurrent(T t) {
        this.current = t;
    }

    public AbstractApplier(T t) {
        this.root = t;
        this.current = t;
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T t) {
        this.stack.add(getCurrent());
        setCurrent(t);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (!(!this.stack.isEmpty())) {
            throw new IllegalStateException("empty stack".toString());
        }
        List<T> list = this.stack;
        setCurrent(list.remove(list.size() - 1));
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        this.stack.clear();
        setCurrent(this.root);
        onClear();
    }
}
