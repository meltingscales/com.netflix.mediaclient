package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import o.C8627dsp;
import o.C8628dsq;
import o.dsK;

/* loaded from: classes.dex */
public interface SubcomposeSlotReusePolicy {
    boolean areCompatible(Object obj, Object obj2);

    void getSlotsToRetain(SlotIdsSet slotIdsSet);

    /* loaded from: classes.dex */
    public static final class SlotIdsSet implements Collection<Object>, dsK {
        private final Set<Object> set;

        public SlotIdsSet() {
            this(null, 1, null);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.set.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            return this.set.containsAll(collection);
        }

        public int getSize() {
            return this.set.size();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return C8628dsq.a(this);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C8628dsq.c(this, tArr);
        }

        public SlotIdsSet(Set<Object> set) {
            this.set = set;
        }

        @Override // java.util.Collection
        public final int size() {
            return getSize();
        }

        public /* synthetic */ SlotIdsSet(Set set, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? new LinkedHashSet() : set);
        }

        @Override // java.util.Collection
        /* renamed from: add$ui_release */
        public final boolean add(Object obj) {
            return this.set.add(obj);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.set.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.set.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            return this.set.remove(collection);
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            return this.set.retainAll(collection);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }
    }
}
