package o;

import java.util.Set;

/* loaded from: classes4.dex */
public interface bZI {
    Object c(Set<String> set, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    dyS<bZK> c(Set<Integer> set, C2865aoD c2865aoD, boolean z);

    /* loaded from: classes4.dex */
    public static final class d {
        public static /* synthetic */ dyS e(bZI bzi, Set set, C2865aoD c2865aoD, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    c2865aoD = null;
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                return bzi.c(set, c2865aoD, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeLiveState");
        }
    }
}
