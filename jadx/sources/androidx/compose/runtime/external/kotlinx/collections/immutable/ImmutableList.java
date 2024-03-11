package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import o.dpT;

/* loaded from: classes.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E> {
    @Override // java.util.List
    default ImmutableList<E> subList(int i, int i2) {
        return new SubList(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class SubList<E> extends dpT<E> implements ImmutableList<E> {
        private int _size;
        private final int fromIndex;
        private final ImmutableList<E> source;
        private final int toIndex;

        @Override // o.dpQ
        public int getSize() {
            return this._size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(ImmutableList<? extends E> immutableList, int i, int i2) {
            this.source = immutableList;
            this.fromIndex = i;
            this.toIndex = i2;
            ListImplementation.checkRangeIndexes$runtime_release(i, i2, immutableList.size());
            this._size = i2 - i;
        }

        @Override // o.dpT, java.util.List
        public E get(int i) {
            ListImplementation.checkElementIndex$runtime_release(i, this._size);
            return this.source.get(this.fromIndex + i);
        }

        @Override // o.dpT, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public ImmutableList<E> subList(int i, int i2) {
            ListImplementation.checkRangeIndexes$runtime_release(i, i2, this._size);
            ImmutableList<E> immutableList = this.source;
            int i3 = this.fromIndex;
            return new SubList(immutableList, i + i3, i3 + i2);
        }
    }
}
