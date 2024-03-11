package o;

/* renamed from: o.sb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9590sb<T> {
    protected b<T> a;
    protected int c;
    protected T d;
    protected b<T> e;

    protected abstract T a(int i);

    public int e() {
        return this.c;
    }

    public T a() {
        b();
        T t = this.d;
        return t == null ? a(12) : t;
    }

    public final T a(T t, int i) {
        b<T> bVar = new b<>(t, i);
        if (this.e == null) {
            this.a = bVar;
            this.e = bVar;
        } else {
            this.a.b(bVar);
            this.a = bVar;
        }
        this.c += i;
        return a(i < 16384 ? i + i : i + (i >> 2));
    }

    public T e(T t, int i) {
        int i2 = this.c + i;
        T a = a(i2);
        int i3 = 0;
        for (b<T> bVar = this.e; bVar != null; bVar = bVar.b()) {
            i3 = bVar.a(a, i3);
        }
        System.arraycopy(t, 0, a, i3, i);
        int i4 = i3 + i;
        if (i4 == i2) {
            return a;
        }
        throw new IllegalStateException("Should have gotten " + i2 + " entries, got " + i4);
    }

    protected void b() {
        b<T> bVar = this.a;
        if (bVar != null) {
            this.d = bVar.d();
        }
        this.a = null;
        this.e = null;
        this.c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.sb$b */
    /* loaded from: classes5.dex */
    public static final class b<T> {
        b<T> a;
        final int c;
        final T d;

        public b<T> b() {
            return this.a;
        }

        public T d() {
            return this.d;
        }

        public b(T t, int i) {
            this.d = t;
            this.c = i;
        }

        public int a(T t, int i) {
            System.arraycopy(this.d, 0, t, i, this.c);
            return i + this.c;
        }

        public void b(b<T> bVar) {
            if (this.a != null) {
                throw new IllegalStateException();
            }
            this.a = bVar;
        }
    }
}
