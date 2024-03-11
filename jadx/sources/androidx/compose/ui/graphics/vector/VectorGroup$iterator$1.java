package androidx.compose.ui.graphics.vector;

import java.util.Iterator;
import java.util.List;
import o.dsK;

/* loaded from: classes.dex */
public final class VectorGroup$iterator$1 implements Iterator<VectorNode>, dsK {
    private final Iterator<VectorNode> it;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VectorGroup$iterator$1(VectorGroup vectorGroup) {
        List list;
        list = vectorGroup.children;
        this.it = list.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.it.hasNext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public VectorNode next() {
        return this.it.next();
    }
}
