package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

@drN
/* loaded from: classes5.dex */
public final class dpN implements Collection<dpJ>, dsK {
    private final int[] c;

    public static int[] b(int[] iArr) {
        C8632dsu.c((Object) iArr, "");
        return iArr;
    }

    public static final /* synthetic */ dpN d(int[] iArr) {
        return new dpN(iArr);
    }

    public static int e(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean e(int[] iArr, Object obj) {
        return (obj instanceof dpN) && C8632dsu.c(iArr, ((dpN) obj).a());
    }

    public static String i(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public final /* synthetic */ int[] a() {
        return this.c;
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(dpJ dpj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends dpJ> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        return i(this.c);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof dpJ) {
            return c(((dpJ) obj).a());
        }
        return false;
    }

    private /* synthetic */ dpN(int[] iArr) {
        this.c = iArr;
    }

    public static int[] e(int i) {
        return b(new int[i]);
    }

    public static final int e(int[] iArr, int i) {
        return dpJ.c(iArr[i]);
    }

    public static final void b(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    public static int a(int[] iArr) {
        return iArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: e */
    public int size() {
        return a(this.c);
    }

    public static Iterator<dpJ> f(int[] iArr) {
        return new e(iArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<dpJ> iterator() {
        return f(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e implements Iterator<dpJ>, dsK {
        private int b;
        private final int[] e;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public e(int[] iArr) {
            C8632dsu.c((Object) iArr, "");
            this.e = iArr;
        }

        @Override // java.util.Iterator
        public /* synthetic */ dpJ next() {
            return dpJ.a(c());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.e.length;
        }

        public int c() {
            int i = this.b;
            int[] iArr = this.e;
            if (i < iArr.length) {
                this.b = i + 1;
                return dpJ.c(iArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.b));
        }
    }

    public boolean c(int i) {
        return d(this.c, i);
    }

    public static boolean d(int[] iArr, int i) {
        boolean h;
        h = C8563dqf.h(iArr, i);
        return h;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return e(this.c, (Collection<dpJ>) collection);
    }

    public static boolean e(int[] iArr, Collection<dpJ> collection) {
        boolean h;
        C8632dsu.c((Object) collection, "");
        Collection<dpJ> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof dpJ) {
                    h = C8563dqf.h(iArr, ((dpJ) obj).a());
                    if (!h) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean c(int[] iArr) {
        return iArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return c(this.c);
    }
}
