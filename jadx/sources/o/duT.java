package o;

import java.util.Collection;
import java.util.List;
import o.duS;

/* loaded from: classes5.dex */
public interface duT<E> extends duS<E>, duX<E> {

    /* loaded from: classes5.dex */
    public interface e<E> extends List<E>, duW<E>, dsI {
        duT<E> d();
    }

    duT<E> c(Collection<? extends E> collection);

    e<E> e();

    /* loaded from: classes5.dex */
    public static final class c {
        public static <E> duS<E> e(duT<? extends E> dut, int i, int i2) {
            C8632dsu.c((Object) dut, "");
            return duS.e.d(dut, i, i2);
        }
    }
}
