package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class TrieIterator<E> extends AbstractListIterator<E> {
    private int height;
    private boolean isInRightEdge;
    private Object[] path;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.height = i3;
        Object[] objArr2 = new Object[i3];
        this.path = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.isInRightEdge = r5;
        objArr2[0] = objArr;
        fillPath(i - r5, 1);
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void reset$runtime_release(Object[] objArr, int i, int i2, int i3) {
        setIndex(i);
        setSize(i2);
        this.height = i3;
        if (this.path.length < i3) {
            this.path = new Object[i3];
        }
        this.path[0] = objArr;
        ?? r0 = i == i2 ? 1 : 0;
        this.isInRightEdge = r0;
        fillPath(i - r0, 1);
    }

    private final void fillPath(int i, int i2) {
        int i3 = (this.height - i2) * 5;
        while (i2 < this.height) {
            Object[] objArr = this.path;
            Object[] objArr2 = objArr[i2 - 1];
            C8632dsu.d(objArr2);
            objArr[i2] = objArr2[UtilsKt.indexSegment(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    private final void fillPathIfNeeded(int i) {
        int i2 = 0;
        while (UtilsKt.indexSegment(getIndex(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            fillPath(getIndex(), ((this.height - 1) - (i2 / 5)) + 1);
        }
    }

    private final E elementAtCurrentIndex() {
        int index = getIndex();
        Object obj = this.path[this.height - 1];
        C8632dsu.d(obj);
        return (E) ((Object[]) obj)[index & 31];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E elementAtCurrentIndex = elementAtCurrentIndex();
        setIndex(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.isInRightEdge = true;
            return elementAtCurrentIndex;
        }
        fillPathIfNeeded(0);
        return elementAtCurrentIndex;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        setIndex(getIndex() - 1);
        if (this.isInRightEdge) {
            this.isInRightEdge = false;
            return elementAtCurrentIndex();
        }
        fillPathIfNeeded(31);
        return elementAtCurrentIndex();
    }
}
