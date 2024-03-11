package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

@drN
/* loaded from: classes5.dex */
public final class dpK implements Collection<dpL>, dsK {
    private final long[] c;

    public static final /* synthetic */ dpK c(long[] jArr) {
        return new dpK(jArr);
    }

    public static long[] d(long[] jArr) {
        C8632dsu.c((Object) jArr, "");
        return jArr;
    }

    public static int e(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean e(long[] jArr, Object obj) {
        return (obj instanceof dpK) && C8632dsu.c(jArr, ((dpK) obj).c());
    }

    public static String h(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(dpL dpl) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends dpL> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ long[] c() {
        return this.c;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return e(this.c, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return e(this.c);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        return (T[]) C8628dsq.c(this, tArr);
    }

    public String toString() {
        return h(this.c);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof dpL) {
            return b(((dpL) obj).a());
        }
        return false;
    }

    private /* synthetic */ dpK(long[] jArr) {
        this.c = jArr;
    }

    public static long[] c(int i) {
        return d(new long[i]);
    }

    public static final long e(long[] jArr, int i) {
        return dpL.b(jArr[i]);
    }

    public static final void c(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    public static int b(long[] jArr) {
        return jArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: e */
    public int size() {
        return b(this.c);
    }

    public static Iterator<dpL> i(long[] jArr) {
        return new d(jArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<dpL> iterator() {
        return i(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d implements Iterator<dpL>, dsK {
        private final long[] d;
        private int e;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public d(long[] jArr) {
            C8632dsu.c((Object) jArr, "");
            this.d = jArr;
        }

        @Override // java.util.Iterator
        public /* synthetic */ dpL next() {
            return dpL.e(c());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.e < this.d.length;
        }

        public long c() {
            int i = this.e;
            long[] jArr = this.d;
            if (i < jArr.length) {
                this.e = i + 1;
                return dpL.b(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.e));
        }
    }

    public boolean b(long j) {
        return b(this.c, j);
    }

    public static boolean b(long[] jArr, long j) {
        boolean b;
        b = C8563dqf.b(jArr, j);
        return b;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return d(this.c, collection);
    }

    public static boolean d(long[] jArr, Collection<dpL> collection) {
        boolean b;
        C8632dsu.c((Object) collection, "");
        Collection<dpL> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof dpL) {
                    b = C8563dqf.b(jArr, ((dpL) obj).a());
                    if (!b) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean a(long[] jArr) {
        return jArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return a(this.c);
    }
}
