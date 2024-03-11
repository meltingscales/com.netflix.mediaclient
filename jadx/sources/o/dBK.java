package o;

/* loaded from: classes5.dex */
public interface dBK {
    Object a(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    void d(Object obj);

    boolean e(Object obj);

    /* loaded from: classes5.dex */
    public static final class b {
        public static /* synthetic */ boolean a(dBK dbk, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return dbk.e(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ Object b(dBK dbk, Object obj, InterfaceC8585dra interfaceC8585dra, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return dbk.a(obj, interfaceC8585dra);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ void d(dBK dbk, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            dbk.d(obj);
        }
    }
}
