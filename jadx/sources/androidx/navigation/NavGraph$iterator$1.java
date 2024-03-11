package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.C8632dsu;
import o.dsJ;

/* loaded from: classes5.dex */
public final class NavGraph$iterator$1 implements Iterator<NavDestination>, dsJ {
    private int index = -1;
    final /* synthetic */ NavGraph this$0;
    private boolean wentToNext;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NavGraph$iterator$1(NavGraph navGraph) {
        this.this$0 = navGraph;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index + 1 < this.this$0.getNodes().size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public NavDestination next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.wentToNext = true;
        SparseArrayCompat<NavDestination> nodes = this.this$0.getNodes();
        int i = this.index + 1;
        this.index = i;
        NavDestination valueAt = nodes.valueAt(i);
        C8632dsu.a(valueAt, "");
        return valueAt;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.wentToNext) {
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
        SparseArrayCompat<NavDestination> nodes = this.this$0.getNodes();
        nodes.valueAt(this.index).setParent(null);
        nodes.removeAt(this.index);
        this.index--;
        this.wentToNext = false;
    }
}
