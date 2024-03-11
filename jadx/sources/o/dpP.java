package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

@drN
/* loaded from: classes5.dex */
public final class dpP implements Collection<dpO>, dsK {
    private final short[] a;

    public static final /* synthetic */ dpP a(short[] sArr) {
        return new dpP(sArr);
    }

    public static int b(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean b(short[] sArr, Object obj) {
        return (obj instanceof dpP) && C8632dsu.c(sArr, ((dpP) obj).a());
    }

    public static short[] e(short[] sArr) {
        C8632dsu.c((Object) sArr, "");
        return sArr;
    }

    public static String f(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public final /* synthetic */ short[] a() {
        return this.a;
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(dpO dpo) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends dpO> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return b(this.a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return b(this.a);
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
        return f(this.a);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof dpO) {
            return e(((dpO) obj).c());
        }
        return false;
    }

    private /* synthetic */ dpP(short[] sArr) {
        this.a = sArr;
    }

    public static short[] a(int i) {
        return e(new short[i]);
    }

    public static final short c(short[] sArr, int i) {
        return dpO.c(sArr[i]);
    }

    public static final void b(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    public static int c(short[] sArr) {
        return sArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: b */
    public int size() {
        return c(this.a);
    }

    public static Iterator<dpO> j(short[] sArr) {
        return new d(sArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<dpO> iterator() {
        return j(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d implements Iterator<dpO>, dsK {
        private final short[] a;
        private int b;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public d(short[] sArr) {
            C8632dsu.c((Object) sArr, "");
            this.a = sArr;
        }

        @Override // java.util.Iterator
        public /* synthetic */ dpO next() {
            return dpO.a(e());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.a.length;
        }

        public short e() {
            int i = this.b;
            short[] sArr = this.a;
            if (i < sArr.length) {
                this.b = i + 1;
                return dpO.c(sArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.b));
        }
    }

    public boolean e(short s) {
        return a(this.a, s);
    }

    public static boolean a(short[] sArr, short s) {
        boolean e;
        e = C8563dqf.e(sArr, s);
        return e;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return d(this.a, collection);
    }

    public static boolean d(short[] sArr, Collection<dpO> collection) {
        boolean e;
        C8632dsu.c((Object) collection, "");
        Collection<dpO> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof dpO) {
                    e = C8563dqf.e(sArr, ((dpO) obj).c());
                    if (!e) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean d(short[] sArr) {
        return sArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return d(this.a);
    }
}
