package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import o.duT;

/* renamed from: o.dvl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8704dvl<E> extends AbstractC8694dvb<E> {
    private final Object[] d;
    public static final a b = new a(null);
    private static final C8704dvl a = new C8704dvl(new Object[0]);

    public C8704dvl(Object[] objArr) {
        C8632dsu.c((Object) objArr, "");
        this.d = objArr;
        C8725dwf.d(objArr.length <= 32);
    }

    @Override // o.dpQ
    public int getSize() {
        return this.d.length;
    }

    @Override // o.AbstractC8694dvb, o.duT
    public duT<E> c(Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.d, size() + collection.size());
            C8632dsu.a(copyOf, "");
            int size = size();
            for (E e : collection) {
                copyOf[size] = e;
                size++;
            }
            return new C8704dvl(copyOf);
        }
        duT.e<E> e2 = e();
        e2.addAll(collection);
        return e2.d();
    }

    @Override // o.duT
    public duT.e<E> e() {
        return new C8699dvg(this, null, this.d, 0);
    }

    @Override // o.dpT, java.util.List
    public int indexOf(Object obj) {
        int g;
        g = C8563dqf.g(this.d, obj);
        return g;
    }

    @Override // o.dpT, java.util.List
    public int lastIndexOf(Object obj) {
        int f;
        f = C8563dqf.f(this.d, obj);
        return f;
    }

    @Override // o.dpT, java.util.List
    public ListIterator<E> listIterator(int i) {
        C8728dwi.c(i, size());
        return new duZ(this.d, i, size());
    }

    @Override // o.dpT, java.util.List
    public E get(int i) {
        C8728dwi.b(i, size());
        return (E) this.d[i];
    }

    /* renamed from: o.dvl$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C8704dvl c() {
            return C8704dvl.a;
        }
    }
}
