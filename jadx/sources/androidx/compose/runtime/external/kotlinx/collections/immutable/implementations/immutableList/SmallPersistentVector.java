package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import o.C8563dqf;
import o.C8564dqg;
import o.C8627dsp;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> {
    private final Object[] buffer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);

    public SmallPersistentVector(Object[] objArr) {
        this.buffer = objArr;
        CommonFunctionsKt.m1044assert(objArr.length <= 32);
    }

    @Override // o.dpQ
    public int getSize() {
        return this.buffer.length;
    }

    private final Object[] bufferOfSize(int i) {
        return new Object[i];
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(E e) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.buffer, size() + 1);
            C8632dsu.a(copyOf, "");
            copyOf[size()] = e;
            return new SmallPersistentVector(copyOf);
        }
        return new PersistentVector(this.buffer, UtilsKt.presizedBufferWith(e), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(Collection<? extends E> collection) {
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.buffer, size() + collection.size());
            C8632dsu.a(copyOf, "");
            int size = size();
            for (E e : collection) {
                copyOf[size] = e;
                size++;
            }
            return new SmallPersistentVector(copyOf);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAll(drM<? super E, Boolean> drm) {
        Object[] d;
        Object[] objArr = this.buffer;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.buffer[i];
            if (drm.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.buffer;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    C8632dsu.a(objArr, "");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return EMPTY;
        }
        d = C8564dqg.d(objArr, 0, size);
        return new SmallPersistentVector(d);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i, E e) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return add((SmallPersistentVector<E>) e);
        }
        if (size() < 32) {
            Object[] bufferOfSize = bufferOfSize(size() + 1);
            C8564dqg.e(this.buffer, bufferOfSize, 0, 0, i, 6, null);
            C8564dqg.d(this.buffer, bufferOfSize, i + 1, i, size());
            bufferOfSize[i] = e;
            return new SmallPersistentVector(bufferOfSize);
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C8632dsu.a(copyOf, "");
        C8564dqg.d(this.buffer, copyOf, i + 1, i, size() - 1);
        copyOf[i] = e;
        return new PersistentVector(copyOf, UtilsKt.presizedBufferWith(this.buffer[31]), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        if (size() == 1) {
            return EMPTY;
        }
        Object[] copyOf = Arrays.copyOf(this.buffer, size() - 1);
        C8632dsu.a(copyOf, "");
        C8564dqg.d(this.buffer, copyOf, i, i + 1, size());
        return new SmallPersistentVector(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // o.dpT, java.util.List
    public int indexOf(Object obj) {
        int g;
        g = C8563dqf.g(this.buffer, obj);
        return g;
    }

    @Override // o.dpT, java.util.List
    public int lastIndexOf(Object obj) {
        int f;
        f = C8563dqf.f(this.buffer, obj);
        return f;
    }

    @Override // o.dpT, java.util.List
    public ListIterator<E> listIterator(int i) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        return new BufferIterator(this.buffer, i, size());
    }

    @Override // o.dpT, java.util.List
    public E get(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        return (E) this.buffer[i];
    }

    @Override // o.dpT, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int i, E e) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C8632dsu.a(copyOf, "");
        copyOf[i] = e;
        return new SmallPersistentVector(copyOf);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }
    }
}
