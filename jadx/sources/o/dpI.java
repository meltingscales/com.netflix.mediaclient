package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

@drN
/* loaded from: classes5.dex */
public final class dpI implements Collection<dpF>, dsK {
    private final byte[] b;

    public static boolean b(byte[] bArr, Object obj) {
        return (obj instanceof dpI) && C8632dsu.c(bArr, ((dpI) obj).d());
    }

    public static byte[] c(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        return bArr;
    }

    public static final /* synthetic */ dpI d(byte[] bArr) {
        return new dpI(bArr);
    }

    public static int e(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static String i(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(dpF dpf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends dpF> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ byte[] d() {
        return this.b;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return b(this.b, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return e(this.b);
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
        return i(this.b);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof dpF) {
            return d(((dpF) obj).c());
        }
        return false;
    }

    private /* synthetic */ dpI(byte[] bArr) {
        this.b = bArr;
    }

    public static byte[] e(int i) {
        return c(new byte[i]);
    }

    public static final byte e(byte[] bArr, int i) {
        return dpF.a(bArr[i]);
    }

    public static final void a(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    public static int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: e */
    public int size() {
        return b(this.b);
    }

    public static Iterator<dpF> f(byte[] bArr) {
        return new e(bArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<dpF> iterator() {
        return f(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e implements Iterator<dpF>, dsK {
        private int c;
        private final byte[] d;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public e(byte[] bArr) {
            C8632dsu.c((Object) bArr, "");
            this.d = bArr;
        }

        @Override // java.util.Iterator
        public /* synthetic */ dpF next() {
            return dpF.e(b());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c < this.d.length;
        }

        public byte b() {
            int i = this.c;
            byte[] bArr = this.d;
            if (i < bArr.length) {
                this.c = i + 1;
                return dpF.a(bArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.c));
        }
    }

    public boolean d(byte b) {
        return c(this.b, b);
    }

    public static boolean c(byte[] bArr, byte b) {
        boolean c;
        c = C8563dqf.c(bArr, b);
        return c;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return e(this.b, (Collection<dpF>) collection);
    }

    public static boolean e(byte[] bArr, Collection<dpF> collection) {
        boolean c;
        C8632dsu.c((Object) collection, "");
        Collection<dpF> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof dpF) {
                    c = C8563dqf.c(bArr, ((dpF) obj).c());
                    if (!c) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean a(byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return a(this.b);
    }
}
