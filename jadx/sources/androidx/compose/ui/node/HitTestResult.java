package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import o.C8564dqg;
import o.C8569dql;
import o.C8627dsp;
import o.C8628dsq;
import o.C8632dsu;
import o.dpR;
import o.drO;
import o.dsK;

/* loaded from: classes.dex */
public final class HitTestResult implements List<Modifier.Node>, dsK {
    private int size;
    private Object[] values = new Object[16];
    private long[] distanceFromEdgeAndInLayer = new long[16];
    private int hitDepth = -1;

    @Override // java.util.List
    public /* synthetic */ void add(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public /* synthetic */ Modifier.Node remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C8628dsq.c(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    public final boolean hasHit() {
        long m1862findBestHitDistanceptXAw2c = m1862findBestHitDistanceptXAw2c();
        return DistanceAndInLayer.m1857getDistanceimpl(m1862findBestHitDistanceptXAw2c) < 0.0f && DistanceAndInLayer.m1859isInLayerimpl(m1862findBestHitDistanceptXAw2c);
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    private final void resizeToHitDepth() {
        int t;
        int i = this.hitDepth + 1;
        t = C8569dql.t(this);
        if (i <= t) {
            while (true) {
                this.values[i] = null;
                if (i == t) {
                    break;
                }
                i++;
            }
        }
        this.size = this.hitDepth + 1;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f, boolean z) {
        int t;
        long DistanceAndInLayer;
        int i = this.hitDepth;
        t = C8569dql.t(this);
        if (i == t) {
            return true;
        }
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(f, z);
        return DistanceAndInLayer.m1854compareToS_HNhKs(m1862findBestHitDistanceptXAw2c(), DistanceAndInLayer) > 0;
    }

    /* renamed from: findBestHitDistance-ptXAw2c  reason: not valid java name */
    private final long m1862findBestHitDistanceptXAw2c() {
        long DistanceAndInLayer;
        int t;
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(Float.POSITIVE_INFINITY, false);
        int i = this.hitDepth + 1;
        t = C8569dql.t(this);
        if (i <= t) {
            while (true) {
                long m1855constructorimpl = DistanceAndInLayer.m1855constructorimpl(this.distanceFromEdgeAndInLayer[i]);
                if (DistanceAndInLayer.m1854compareToS_HNhKs(m1855constructorimpl, DistanceAndInLayer) < 0) {
                    DistanceAndInLayer = m1855constructorimpl;
                }
                if (DistanceAndInLayer.m1857getDistanceimpl(DistanceAndInLayer) < 0.0f && DistanceAndInLayer.m1859isInLayerimpl(DistanceAndInLayer)) {
                    return DistanceAndInLayer;
                }
                if (i == t) {
                    break;
                }
                i++;
            }
        }
        return DistanceAndInLayer;
    }

    public final void hit(Modifier.Node node, boolean z, drO<dpR> dro) {
        hitInMinimumTouchTarget(node, -1.0f, z, dro);
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f, boolean z, drO<dpR> dro) {
        long DistanceAndInLayer;
        int i = this.hitDepth;
        this.hitDepth = i + 1;
        ensureContainerSize();
        Object[] objArr = this.values;
        int i2 = this.hitDepth;
        objArr[i2] = node;
        long[] jArr = this.distanceFromEdgeAndInLayer;
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(f, z);
        jArr[i2] = DistanceAndInLayer;
        resizeToHitDepth();
        dro.invoke();
        this.hitDepth = i;
    }

    public final void speculativeHit(Modifier.Node node, float f, boolean z, drO<dpR> dro) {
        int t;
        int t2;
        int t3;
        int t4;
        int i = this.hitDepth;
        t = C8569dql.t(this);
        if (i == t) {
            hitInMinimumTouchTarget(node, f, z, dro);
            int i2 = this.hitDepth + 1;
            t4 = C8569dql.t(this);
            if (i2 == t4) {
                resizeToHitDepth();
                return;
            }
            return;
        }
        long m1862findBestHitDistanceptXAw2c = m1862findBestHitDistanceptXAw2c();
        int i3 = this.hitDepth;
        t2 = C8569dql.t(this);
        this.hitDepth = t2;
        hitInMinimumTouchTarget(node, f, z, dro);
        int i4 = this.hitDepth + 1;
        t3 = C8569dql.t(this);
        if (i4 < t3 && DistanceAndInLayer.m1854compareToS_HNhKs(m1862findBestHitDistanceptXAw2c, m1862findBestHitDistanceptXAw2c()) > 0) {
            int i5 = this.hitDepth + 1;
            int i6 = i3 + 1;
            Object[] objArr = this.values;
            C8564dqg.d(objArr, objArr, i6, i5, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            C8564dqg.e(jArr, jArr, i6, i5, size());
            this.hitDepth = ((size() + i3) - this.hitDepth) - 1;
        }
        resizeToHitDepth();
        this.hitDepth = i3;
    }

    private final void ensureContainerSize() {
        int i = this.hitDepth;
        Object[] objArr = this.values;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            C8632dsu.a(copyOf, "");
            this.values = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            C8632dsu.a(copyOf2, "");
            this.distanceFromEdgeAndInLayer = copyOf2;
        }
    }

    public boolean contains(Modifier.Node node) {
        return indexOf((Object) node) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Object) ((Modifier.Node) it.next()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node get(int i) {
        Object obj = this.values[i];
        C8632dsu.d(obj);
        return (Modifier.Node) obj;
    }

    public int indexOf(Modifier.Node node) {
        int t;
        t = C8569dql.t(this);
        if (t >= 0) {
            int i = 0;
            while (!C8632dsu.c(this.values[i], node)) {
                if (i == t) {
                    return -1;
                }
                i++;
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Modifier.Node> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    public int lastIndexOf(Modifier.Node node) {
        int t;
        for (t = C8569dql.t(this); -1 < t; t--) {
            if (C8632dsu.c(this.values[t], node)) {
                return t;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator(int i) {
        return new HitTestResultIterator(this, i, 0, 0, 6, null);
    }

    @Override // java.util.List
    public List<Modifier.Node> subList(int i, int i2) {
        return new SubList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        resizeToHitDepth();
    }

    /* loaded from: classes.dex */
    final class HitTestResultIterator implements ListIterator<Modifier.Node>, dsK {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        @Override // java.util.ListIterator
        public /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public HitTestResultIterator(int i, int i2, int i3) {
            this.index = i;
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i, int i2, int i3, int i4, C8627dsp c8627dsp) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? hitTestResult.size() : i3);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Modifier.Node next() {
            Object[] objArr = HitTestResult.this.values;
            int i = this.index;
            this.index = i + 1;
            Object obj = objArr[i];
            C8632dsu.d(obj);
            return (Modifier.Node) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.ListIterator
        public Modifier.Node previous() {
            Object[] objArr = HitTestResult.this.values;
            int i = this.index - 1;
            this.index = i;
            Object obj = objArr[i];
            C8632dsu.d(obj);
            return (Modifier.Node) obj;
        }
    }

    /* loaded from: classes.dex */
    final class SubList implements List<Modifier.Node>, dsK {
        private final int maxIndex;
        private final int minIndex;

        @Override // java.util.List
        public /* synthetic */ void add(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public /* synthetic */ Modifier.Node remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return C8628dsq.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C8628dsq.c(this, tArr);
        }

        public SubList(int i, int i2) {
            this.minIndex = i;
            this.maxIndex = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return contains((Modifier.Node) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return indexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return lastIndexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return getSize();
        }

        public boolean contains(Modifier.Node node) {
            return indexOf((Object) node) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((Object) ((Modifier.Node) it.next()))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node get(int i) {
            Object obj = HitTestResult.this.values[i + this.minIndex];
            C8632dsu.d(obj);
            return (Modifier.Node) obj;
        }

        public int indexOf(Modifier.Node node) {
            int i = this.minIndex;
            int i2 = this.maxIndex;
            if (i <= i2) {
                while (!C8632dsu.c(HitTestResult.this.values[i], node)) {
                    if (i == i2) {
                        return -1;
                    }
                    i++;
                }
                return i - this.minIndex;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Modifier.Node> iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return new HitTestResultIterator(i, i, this.maxIndex);
        }

        public int lastIndexOf(Modifier.Node node) {
            int i = this.maxIndex;
            int i2 = this.minIndex;
            if (i2 <= i) {
                while (!C8632dsu.c(HitTestResult.this.values[i], node)) {
                    if (i == i2) {
                        return -1;
                    }
                    i--;
                }
                return i - this.minIndex;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return new HitTestResultIterator(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator(int i) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return new HitTestResultIterator(i + i2, i2, this.maxIndex);
        }

        @Override // java.util.List
        public List<Modifier.Node> subList(int i, int i2) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i3 = this.minIndex;
            return new SubList(i + i3, i3 + i2);
        }
    }
}
