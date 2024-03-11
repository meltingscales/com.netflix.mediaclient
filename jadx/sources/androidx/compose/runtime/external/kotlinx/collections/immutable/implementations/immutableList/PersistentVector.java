package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.ListIterator;
import o.C8564dqg;
import o.C8632dsu;
import o.C8657dts;
import o.drM;

/* loaded from: classes.dex */
public final class PersistentVector<E> extends AbstractPersistentList<E> {
    private final Object[] root;
    private final int rootShift;
    private final int size;
    private final Object[] tail;

    @Override // o.dpQ
    public int getSize() {
        return this.size;
    }

    public PersistentVector(Object[] objArr, Object[] objArr2, int i, int i2) {
        int i3;
        this.root = objArr;
        this.tail = objArr2;
        this.size = i;
        this.rootShift = i2;
        if (size() <= 32) {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
        }
        int size = size() - UtilsKt.rootSize(size());
        i3 = C8657dts.i(objArr2.length, 32);
        CommonFunctionsKt.m1044assert(size <= i3);
    }

    private final int rootSize() {
        return UtilsKt.rootSize(size());
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(E e) {
        int size = size() - rootSize();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.tail, 32);
            C8632dsu.a(copyOf, "");
            copyOf[size] = e;
            return new PersistentVector(this.root, copyOf, size() + 1, this.rootShift);
        }
        return pushFilledTail(this.root, this.tail, UtilsKt.presizedBufferWith(e));
    }

    private final PersistentVector<E> pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size();
        int i = this.rootShift;
        if ((size >> 5) > (1 << i)) {
            Object[] presizedBufferWith = UtilsKt.presizedBufferWith(objArr);
            int i2 = this.rootShift + 5;
            return new PersistentVector<>(pushTail(presizedBufferWith, i2, objArr2), objArr3, size() + 1, i2);
        }
        return new PersistentVector<>(pushTail(objArr, i, objArr2), objArr3, size() + 1, this.rootShift);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r4 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] pushTail(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = ""
            o.C8632dsu.a(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.pushTail(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector.pushTail(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i, E e) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return add((PersistentVector<E>) e);
        }
        int rootSize = rootSize();
        if (i >= rootSize) {
            return insertIntoTail(this.root, i - rootSize, e);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return insertIntoTail(insertIntoRoot(this.root, this.rootShift, i, e, objectRef), 0, objectRef.getValue());
    }

    private final PersistentVector<E> insertIntoTail(Object[] objArr, int i, Object obj) {
        int size = size() - rootSize();
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        C8632dsu.a(copyOf, "");
        if (size < 32) {
            C8564dqg.d(this.tail, copyOf, i + 1, i, size);
            copyOf[i] = obj;
            return new PersistentVector<>(objArr, copyOf, size() + 1, this.rootShift);
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[31];
        C8564dqg.d(objArr2, copyOf, i + 1, i, size - 1);
        copyOf[i] = obj;
        return pushFilledTail(objArr, copyOf, UtilsKt.presizedBufferWith(obj2));
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object[] copyOf;
        int indexSegment = UtilsKt.indexSegment(i2, i);
        if (i == 0) {
            if (indexSegment == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                C8632dsu.a(copyOf, "");
            }
            C8564dqg.d(objArr, copyOf, indexSegment + 1, indexSegment, 31);
            objectRef.setValue(objArr[31]);
            copyOf[indexSegment] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        C8632dsu.a(copyOf2, "");
        int i3 = i - 5;
        Object obj2 = objArr[indexSegment];
        C8632dsu.d(obj2);
        copyOf2[indexSegment] = insertIntoRoot((Object[]) obj2, i3, i2, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || copyOf2[indexSegment] == null) {
                break;
            }
            Object obj3 = objArr[indexSegment];
            C8632dsu.e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[indexSegment] = insertIntoRoot((Object[]) obj3, i3, 0, objectRef.getValue(), objectRef);
        }
        return copyOf2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        int rootSize = rootSize();
        if (i >= rootSize) {
            return removeFromTailAt(this.root, rootSize, this.rootShift, i - rootSize);
        }
        return removeFromTailAt(removeFromRootAt(this.root, this.rootShift, i, new ObjectRef(this.tail[0])), rootSize, this.rootShift, 0);
    }

    private final PersistentList<E> removeFromTailAt(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        CommonFunctionsKt.m1044assert(i3 < size);
        if (size == 1) {
            return pullLastBufferFromRoot(objArr, i, i2);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        C8632dsu.a(copyOf, "");
        int i4 = size - 1;
        if (i3 < i4) {
            C8564dqg.d(this.tail, copyOf, i3, i3 + 1, size);
        }
        copyOf[i4] = null;
        return new PersistentVector(objArr, copyOf, (i + size) - 1, i2);
    }

    private final PersistentList<E> pullLastBufferFromRoot(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                C8632dsu.a(objArr, "");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i2, i - 1, objectRef);
        C8632dsu.d(pullLastBuffer);
        Object value = objectRef.getValue();
        C8632dsu.d(value);
        Object[] objArr2 = (Object[]) value;
        if (pullLastBuffer[1] == null) {
            Object obj = pullLastBuffer[0];
            C8632dsu.d(obj);
            return new PersistentVector((Object[]) obj, objArr2, i, i2 - 5);
        }
        return new PersistentVector(pullLastBuffer, objArr2, i, i2);
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i2, i);
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
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C8632dsu.a(copyOf, "");
        copyOf[indexSegment] = pullLastBuffer;
        return copyOf;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] copyOf;
        int indexSegment = UtilsKt.indexSegment(i2, i);
        if (i == 0) {
            if (indexSegment == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                C8632dsu.a(copyOf, "");
            }
            C8564dqg.d(objArr, copyOf, indexSegment, indexSegment + 1, 32);
            copyOf[31] = objectRef.getValue();
            objectRef.setValue(objArr[indexSegment]);
            return copyOf;
        }
        int indexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        C8632dsu.a(copyOf2, "");
        int i3 = i - 5;
        int i4 = indexSegment + 1;
        if (i4 <= indexSegment2) {
            while (true) {
                Object obj = copyOf2[indexSegment2];
                C8632dsu.d(obj);
                copyOf2[indexSegment2] = removeFromRootAt((Object[]) obj, i3, 0, objectRef);
                if (indexSegment2 == i4) {
                    break;
                }
                indexSegment2--;
            }
        }
        Object obj2 = copyOf2[indexSegment];
        C8632dsu.d(obj2);
        copyOf2[indexSegment] = removeFromRootAt((Object[]) obj2, i3, i2, objectRef);
        return copyOf2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAll(drM<? super E, Boolean> drm) {
        PersistentVectorBuilder<E> builder = builder();
        builder.removeAllWithPredicate(drm);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // o.dpT, java.util.List
    public ListIterator<E> listIterator(int i) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        return new PersistentVectorIterator(this.root, this.tail, i, size(), (this.rootShift / 5) + 1);
    }

    private final Object[] bufferFor(int i) {
        if (rootSize() <= i) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i, i2)];
            C8632dsu.d(objArr2);
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // o.dpT, java.util.List
    public E get(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        return (E) bufferFor(i)[i & 31];
    }

    @Override // o.dpT, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int i, E e) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        if (rootSize() <= i) {
            Object[] copyOf = Arrays.copyOf(this.tail, 32);
            C8632dsu.a(copyOf, "");
            copyOf[i & 31] = e;
            return new PersistentVector(this.root, copyOf, size(), this.rootShift);
        }
        return new PersistentVector(setInRoot(this.root, this.rootShift, i, e), this.tail, size(), this.rootShift);
    }

    private final Object[] setInRoot(Object[] objArr, int i, int i2, Object obj) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C8632dsu.a(copyOf, "");
        if (i == 0) {
            copyOf[indexSegment] = obj;
        } else {
            Object obj2 = copyOf[indexSegment];
            C8632dsu.d(obj2);
            copyOf[indexSegment] = setInRoot((Object[]) obj2, i - 5, i2, obj);
        }
        return copyOf;
    }
}
