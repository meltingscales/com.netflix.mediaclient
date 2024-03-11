package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o.C8564dqg;
import o.C8621dsj;
import o.C8632dsu;
import o.C8657dts;
import o.dpW;
import o.drM;

/* loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends dpW<E> implements PersistentList.Builder<E> {
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList<? extends E> vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    @Override // o.dpW
    public int getSize() {
        return this.size;
    }

    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    public PersistentVectorBuilder(PersistentList<? extends E> persistentList, Object[] objArr, Object[] objArr2, int i) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder
    public PersistentList<E> build() {
        PersistentList<? extends E> persistentVector;
        PersistentList<? extends E> persistentList;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentList = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentList = UtilsKt.persistentVectorOf();
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr2, size());
                    C8632dsu.a(copyOf, "");
                    persistentVector = new SmallPersistentVector<>(copyOf);
                }
            } else {
                C8632dsu.d(objArr);
                persistentVector = new PersistentVector<>(objArr, this.tail, size(), this.rootShift);
            }
            persistentList = persistentVector;
        }
        this.vector = persistentList;
        return (PersistentList<E>) persistentList;
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final int tailSize(int i) {
        return i <= 32 ? i : i - UtilsKt.rootSize(i);
    }

    private final int tailSize() {
        return tailSize(size());
    }

    private final boolean isMutable(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.ownership;
    }

    private final Object[] makeMutable(Object[] objArr) {
        int i;
        Object[] e;
        if (objArr == null) {
            return mutableBuffer();
        }
        if (isMutable(objArr)) {
            return objArr;
        }
        Object[] mutableBuffer = mutableBuffer();
        i = C8657dts.i(objArr.length, 32);
        e = C8564dqg.e(objArr, mutableBuffer, 0, 0, i, 6, null);
        return e;
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i) {
        Object[] d;
        Object[] d2;
        if (isMutable(objArr)) {
            d2 = C8564dqg.d(objArr, objArr, i, 0, 32 - i);
            return d2;
        }
        d = C8564dqg.d(objArr, mutableBuffer(), i, 0, 32 - i);
        return d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        if (tailSize < 32) {
            Object[] makeMutable = makeMutable(this.tail);
            makeMutable[tailSize] = e;
            this.tail = makeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e));
        }
        return true;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size();
        int i = this.rootShift;
        if ((size >> 5) > (1 << i)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
        } else if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, i);
        Object[] makeMutable = makeMutable(objArr);
        if (i == 5) {
            makeMutable[indexSegment] = objArr2;
        } else {
            makeMutable[indexSegment] = pushTail((Object[]) makeMutable[indexSegment], objArr2, i - 5);
        }
        return makeMutable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        Iterator<? extends E> it = collection.iterator();
        if (32 - tailSize >= collection.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), tailSize, it);
            this.size = size() + collection.size();
        } else {
            int size = ((collection.size() + tailSize) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = copyToBuffer(makeMutable(this.tail), tailSize, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + collection.size();
        }
        return true;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i, Object[][] objArr2) {
        Object[] makeMutable;
        Iterator<Object[]> b = C8621dsj.b(objArr2);
        int i2 = this.rootShift;
        if ((i >> 5) < (1 << i2)) {
            makeMutable = pushBuffers(objArr, i, i2, b);
        } else {
            makeMutable = makeMutable(objArr);
        }
        while (b.hasNext()) {
            this.rootShift += 5;
            makeMutable = mutableBufferWith(makeMutable);
            int i3 = this.rootShift;
            pushBuffers(makeMutable, 1 << i3, i3, b);
        }
        return makeMutable;
    }

    private final Object[] pushBuffers(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (it.hasNext()) {
            if (i2 >= 0) {
                if (i2 == 0) {
                    return it.next();
                }
                Object[] makeMutable = makeMutable(objArr);
                int indexSegment = UtilsKt.indexSegment(i, i2);
                int i3 = i2 - 5;
                makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], i, i3, it);
                while (true) {
                    indexSegment++;
                    if (indexSegment >= 32 || !it.hasNext()) {
                        break;
                    }
                    makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], 0, i3, it);
                }
                return makeMutable;
            }
            throw new IllegalArgumentException("negative shift".toString());
        }
        throw new IllegalArgumentException("invalid buffersIterator".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i >= rootSize) {
            insertIntoTail(this.root, i - rootSize, e);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        C8632dsu.d(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i, e, objectRef), 0, objectRef.getValue());
    }

    private final void insertIntoTail(Object[] objArr, int i, E e) {
        int tailSize = tailSize();
        Object[] makeMutable = makeMutable(this.tail);
        if (tailSize < 32) {
            C8564dqg.d(this.tail, makeMutable, i + 1, i, tailSize);
            makeMutable[i] = e;
            this.root = objArr;
            this.tail = makeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr2 = this.tail;
        Object obj = objArr2[31];
        C8564dqg.d(objArr2, makeMutable, i + 1, i, 31);
        makeMutable[i] = e;
        pushFilledTail(objArr, makeMutable, mutableBufferWith(obj));
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object obj2;
        Object[] d;
        int indexSegment = UtilsKt.indexSegment(i2, i);
        if (i == 0) {
            objectRef.setValue(objArr[31]);
            d = C8564dqg.d(objArr, makeMutable(objArr), indexSegment + 1, indexSegment, 31);
            d[indexSegment] = obj;
            return d;
        }
        Object[] makeMutable = makeMutable(objArr);
        int i3 = i - 5;
        Object obj3 = makeMutable[indexSegment];
        C8632dsu.d(obj3);
        makeMutable[indexSegment] = insertIntoRoot((Object[]) obj3, i3, i2, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj2 = makeMutable[indexSegment]) == null) {
                break;
            }
            C8632dsu.d(obj2);
            makeMutable[indexSegment] = insertIntoRoot((Object[]) obj2, i3, 0, objectRef.getValue(), objectRef);
        }
        return makeMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        Object[] d;
        Object[] d2;
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m1044assert(i >= rootSize());
            int i3 = i & 31;
            int size2 = collection.size();
            Object[] objArr = this.tail;
            d2 = C8564dqg.d(objArr, makeMutable(objArr), (((i + size2) - 1) & 31) + 1, i3, tailSize());
            copyToBuffer(d2, i3, collection.iterator());
            this.tail = d2;
            this.size = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int tailSize = tailSize();
        int tailSize2 = tailSize(size() + collection.size());
        if (i >= rootSize()) {
            d = mutableBuffer();
            splitToBuffers(collection, i, this.tail, tailSize, objArr2, size, d);
        } else if (tailSize2 > tailSize) {
            int i4 = tailSize2 - tailSize;
            d = makeMutableShiftingRight(this.tail, i4);
            insertIntoRoot(collection, i, i4, objArr2, size, d);
        } else {
            int i5 = tailSize - tailSize2;
            d = C8564dqg.d(this.tail, mutableBuffer(), 0, i5, tailSize);
            int i6 = 32 - i5;
            Object[] makeMutableShiftingRight = makeMutableShiftingRight(this.tail, i6);
            int i7 = size - 1;
            objArr2[i7] = makeMutableShiftingRight;
            insertIntoRoot(collection, i, i6, objArr2, i7, makeMutableShiftingRight);
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i2, objArr2);
        this.tail = d;
        this.size = size() + collection.size();
        return true;
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.root == null) {
            throw new IllegalStateException("root is null".toString());
        }
        int i4 = i >> 5;
        Object[] shiftLeafBuffers = shiftLeafBuffers(i4, i2, objArr, i3, objArr2);
        int rootSize = i3 - (((rootSize() >> 5) - 1) - i4);
        if (rootSize < i3) {
            objArr2 = objArr[rootSize];
            C8632dsu.d(objArr2);
        }
        splitToBuffers(collection, i, shiftLeafBuffers, 32, objArr, rootSize, objArr2);
    }

    private final Object[] shiftLeafBuffers(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.root == null) {
            throw new IllegalStateException("root is null".toString());
        }
        ListIterator<Object[]> leafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (leafBufferIterator.previousIndex() != i) {
            Object[] previous = leafBufferIterator.previous();
            C8564dqg.d(previous, objArr2, 0, 32 - i2, 32);
            objArr2 = makeMutableShiftingRight(previous, i2);
            i3--;
            objArr[i3] = objArr2;
        }
        return leafBufferIterator.previous();
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] mutableBuffer;
        if (i3 < 1) {
            throw new IllegalArgumentException("requires at least one nullBuffer".toString());
        }
        Object[] makeMutable = makeMutable(objArr);
        objArr2[0] = makeMutable;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            C8564dqg.d(makeMutable, objArr3, size + 1, i4, i2);
        } else {
            if (i3 == 1) {
                mutableBuffer = makeMutable;
            } else {
                mutableBuffer = mutableBuffer();
                i3--;
                objArr2[i3] = mutableBuffer;
            }
            int i6 = i2 - (i5 - 31);
            C8564dqg.d(makeMutable, objArr3, 0, i6, i2);
            C8564dqg.d(makeMutable, mutableBuffer, size + 1, i4, i6);
            objArr3 = mutableBuffer;
        }
        Iterator<? extends E> it = collection.iterator();
        copyToBuffer(makeMutable, i4, it);
        for (int i7 = 1; i7 < i3; i7++) {
            objArr2[i7] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(objArr3, 0, it);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        return (E) bufferFor(i)[i & 31];
    }

    private final Object[] bufferFor(int i) {
        if (rootSize() <= i) {
            return this.tail;
        }
        Object[] objArr = this.root;
        C8632dsu.d(objArr);
        for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i, i2)];
            C8632dsu.d(objArr2);
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // o.dpW
    public E removeAt(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i >= rootSize) {
            return (E) removeFromTailAt(this.root, rootSize, this.rootShift, i - rootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        C8632dsu.d(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i, objectRef), rootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    private final Object removeFromTailAt(Object[] objArr, int i, int i2, int i3) {
        Object[] d;
        int size = size() - i;
        CommonFunctionsKt.m1044assert(i3 < size);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[i3];
        d = C8564dqg.d(objArr2, makeMutable(objArr2), i3, i3 + 1, size);
        d[size - 1] = null;
        this.root = objArr;
        this.tail = d;
        this.size = (i + size) - 1;
        this.rootShift = i2;
        return obj2;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] d;
        int indexSegment = UtilsKt.indexSegment(i2, i);
        if (i == 0) {
            Object obj = objArr[indexSegment];
            d = C8564dqg.d(objArr, makeMutable(objArr), indexSegment, indexSegment + 1, 32);
            d[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return d;
        }
        int indexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i) : 31;
        Object[] makeMutable = makeMutable(objArr);
        int i3 = i - 5;
        int i4 = indexSegment + 1;
        if (i4 <= indexSegment2) {
            while (true) {
                Object obj2 = makeMutable[indexSegment2];
                C8632dsu.d(obj2);
                makeMutable[indexSegment2] = removeFromRootAt((Object[]) obj2, i3, 0, objectRef);
                if (indexSegment2 == i4) {
                    break;
                }
                indexSegment2--;
            }
        }
        Object obj3 = makeMutable[indexSegment];
        C8632dsu.d(obj3);
        makeMutable[indexSegment] = removeFromRootAt((Object[]) obj3, i3, i2, objectRef);
        return makeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i;
            this.rootShift = i2;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        C8632dsu.d(objArr);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i2, i, objectRef);
        C8632dsu.d(pullLastBuffer);
        Object value = objectRef.getValue();
        C8632dsu.d(value);
        this.tail = (Object[]) value;
        this.size = i;
        if (pullLastBuffer[1] == null) {
            this.root = (Object[]) pullLastBuffer[0];
            i2 -= 5;
        } else {
            this.root = pullLastBuffer;
        }
        this.rootShift = i2;
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i2 - 1, i);
        if (i == 5) {
            objectRef.setValue(objArr[indexSegment]);
            pullLastBuffer = null;
        } else {
            Object obj = objArr[indexSegment];
            C8632dsu.d(obj);
            pullLastBuffer = pullLastBuffer((Object[]) obj, i - 5, i2, objectRef);
        }
        if (pullLastBuffer == null && indexSegment == 0) {
            return null;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = pullLastBuffer;
        return makeMutable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection<? extends Object> collection) {
        return removeAllWithPredicate(new drM<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$removeAll$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drM
            public final Boolean invoke(E e) {
                return Boolean.valueOf(collection.contains(e));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((PersistentVectorBuilder$removeAll$1<E>) obj);
            }
        });
    }

    public final boolean removeAllWithPredicate(drM<? super E, Boolean> drm) {
        boolean removeAll = removeAll(drm);
        if (removeAll) {
            ((AbstractList) this).modCount++;
        }
        return removeAll;
    }

    private final boolean removeAll(drM<? super E, Boolean> drm) {
        Object[] pushBuffers;
        int tailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(drm, tailSize, objectRef) != tailSize;
        }
        ListIterator<Object[]> leafBufferIterator = leafBufferIterator(0);
        int i = 32;
        while (i == 32 && leafBufferIterator.hasNext()) {
            i = removeAll(drm, leafBufferIterator.next(), 32, objectRef);
        }
        if (i == 32) {
            CommonFunctionsKt.m1044assert(!leafBufferIterator.hasNext());
            int removeAllFromTail = removeAllFromTail(drm, tailSize, objectRef);
            if (removeAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return removeAllFromTail != tailSize;
        }
        int previousIndex = leafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (leafBufferIterator.hasNext()) {
            i2 = recyclableRemoveAll(drm, leafBufferIterator.next(), 32, i2, objectRef, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i3 = previousIndex;
        int recyclableRemoveAll = recyclableRemoveAll(drm, this.tail, tailSize, i2, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        C8632dsu.d(value);
        Object[] objArr = (Object[]) value;
        C8564dqg.d(objArr, null, recyclableRemoveAll, 32);
        if (arrayList.isEmpty()) {
            pushBuffers = this.root;
            C8632dsu.d(pushBuffers);
        } else {
            pushBuffers = pushBuffers(this.root, i3, this.rootShift, arrayList.iterator());
        }
        int size = i3 + (arrayList.size() << 5);
        this.root = retainFirst(pushBuffers, size);
        this.tail = objArr;
        this.size = size + recyclableRemoveAll;
        return true;
    }

    private final Object[] retainFirst(Object[] objArr, int i) {
        if ((i & 31) != 0) {
            throw new IllegalArgumentException("invalid size".toString());
        }
        if (i == 0) {
            this.rootShift = 0;
            return null;
        }
        int i2 = i - 1;
        while (true) {
            int i3 = this.rootShift;
            if ((i2 >> i3) == 0) {
                this.rootShift = i3 - 5;
                Object[] objArr2 = objArr[0];
                C8632dsu.d(objArr2);
                objArr = objArr2;
            } else {
                return nullifyAfter(objArr, i2, i3);
            }
        }
    }

    private final Object[] nullifyAfter(Object[] objArr, int i, int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return objArr;
            }
            int indexSegment = UtilsKt.indexSegment(i, i2);
            Object obj = objArr[indexSegment];
            C8632dsu.d(obj);
            Object nullifyAfter = nullifyAfter((Object[]) obj, i, i2 - 5);
            if (indexSegment < 31) {
                int i3 = indexSegment + 1;
                if (objArr[i3] != null) {
                    if (isMutable(objArr)) {
                        C8564dqg.d(objArr, null, i3, 32);
                    }
                    objArr = C8564dqg.d(objArr, mutableBuffer(), 0, 0, i3);
                }
            }
            if (nullifyAfter != objArr[indexSegment]) {
                Object[] makeMutable = makeMutable(objArr);
                makeMutable[indexSegment] = nullifyAfter;
                return makeMutable;
            }
            return objArr;
        }
        throw new IllegalArgumentException("shift should be positive".toString());
    }

    private final int removeAllFromTail(drM<? super E, Boolean> drm, int i, ObjectRef objectRef) {
        int removeAll = removeAll(drm, this.tail, i, objectRef);
        if (removeAll == i) {
            CommonFunctionsKt.m1044assert(objectRef.getValue() == this.tail);
            return i;
        }
        Object value = objectRef.getValue();
        C8632dsu.d(value);
        Object[] objArr = (Object[]) value;
        C8564dqg.d(objArr, null, removeAll, i);
        this.tail = objArr;
        this.size = size() - (i - removeAll);
        return removeAll;
    }

    private final int removeAll(drM<? super E, Boolean> drm, Object[] objArr, int i, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (drm.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = makeMutable(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        objectRef.setValue(objArr2);
        return i2;
    }

    private final int recyclableRemoveAll(drM<? super E, Boolean> drm, Object[] objArr, int i, int i2, ObjectRef objectRef, List<Object[]> list, List<Object[]> list2) {
        Object[] mutableBuffer;
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = objectRef.getValue();
        C8632dsu.d(value);
        Object[] objArr2 = (Object[]) value;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!drm.invoke(obj).booleanValue()) {
                if (i2 == 32) {
                    if (!list.isEmpty()) {
                        mutableBuffer = list.remove(list.size() - 1);
                    } else {
                        mutableBuffer = mutableBuffer();
                    }
                    objArr3 = mutableBuffer;
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        objectRef.setValue(objArr3);
        if (objArr2 != objectRef.getValue()) {
            list2.add(objArr2);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        if (rootSize() <= i) {
            Object[] makeMutable = makeMutable(this.tail);
            if (makeMutable != this.tail) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) makeMutable[i2];
            makeMutable[i2] = e;
            this.tail = makeMutable;
            return e2;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        C8632dsu.d(objArr);
        this.root = setInRoot(objArr, this.rootShift, i, e, objectRef);
        return (E) objectRef.getValue();
    }

    private final Object[] setInRoot(Object[] objArr, int i, int i2, E e, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        Object[] makeMutable = makeMutable(objArr);
        if (i == 0) {
            if (makeMutable != objArr) {
                ((AbstractList) this).modCount++;
            }
            objectRef.setValue(makeMutable[indexSegment]);
            makeMutable[indexSegment] = e;
            return makeMutable;
        }
        Object obj = makeMutable[indexSegment];
        C8632dsu.d(obj);
        makeMutable[indexSegment] = setInRoot((Object[]) obj, i - 5, i2, e, objectRef);
        return makeMutable;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        return new PersistentVectorMutableIterator(this, i);
    }

    private final ListIterator<Object[]> leafBufferIterator(int i) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root".toString());
        }
        int rootSize = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime_release(i, rootSize);
        int i2 = this.rootShift;
        if (i2 == 0) {
            return new SingleElementListIterator(objArr, i);
        }
        return new TrieIterator(objArr, i, rootSize, i2 / 5);
    }
}
