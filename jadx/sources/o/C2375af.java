package o;

import androidx.collection.LongSparseArray;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.af  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2375af implements Iterable<C1511aE> {
    private final LongSparseArray<C1511aE> b = new LongSparseArray<>();

    public void b(C1511aE c1511aE) {
        this.b.put(c1511aE.getItemId(), c1511aE);
    }

    public void c(C1511aE c1511aE) {
        this.b.remove(c1511aE.getItemId());
    }

    public int b() {
        return this.b.size();
    }

    @Override // java.lang.Iterable
    public Iterator<C1511aE> iterator() {
        return new b();
    }

    /* renamed from: o.af$b */
    /* loaded from: classes2.dex */
    class b implements Iterator<C1511aE> {
        private int c;

        private b() {
            this.c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c < C2375af.this.b.size();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public C1511aE next() {
            if (hasNext()) {
                LongSparseArray longSparseArray = C2375af.this.b;
                int i = this.c;
                this.c = i + 1;
                return (C1511aE) longSparseArray.valueAt(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
