package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class IM<T> implements Iterable<T> {
    final Iterable<T> d;

    public IM(Iterable<T> iterable) {
        this.d = iterable;
    }

    public static <R> IM<R> c(final List<R> list) {
        return new IM<>(new Iterable<R>() { // from class: o.IM.4
            @Override // java.lang.Iterable
            public Iterator<R> iterator() {
                return new Iterator<R>() { // from class: o.IM.4.5
                    Integer a = null;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        Integer num = this.a;
                        if (num == null) {
                            this.a = 0;
                        } else {
                            this.a = Integer.valueOf(num.intValue() + 1);
                        }
                        return this.a.intValue() < list.size();
                    }

                    @Override // java.util.Iterator
                    public R next() {
                        return (R) list.get(this.a.intValue());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        });
    }

    public List<T> c() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.d.iterator();
    }
}
