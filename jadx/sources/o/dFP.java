package o;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class dFP {
    public /* synthetic */ dFP(C8627dsp c8627dsp) {
        this();
    }

    public abstract <T> dBP<T> a(InterfaceC8660dtv<? super T> interfaceC8660dtv, String str);

    public abstract <T> dBZ<T> a(InterfaceC8660dtv<? super T> interfaceC8660dtv, T t);

    public abstract <T> dBT<T> b(InterfaceC8660dtv<T> interfaceC8660dtv, List<? extends dBT<?>> list);

    public abstract void b(dFS dfs);

    private dFP() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ dBT a(dFP dfp, InterfaceC8660dtv interfaceC8660dtv, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                list = C8569dql.i();
            }
            return dfp.b(interfaceC8660dtv, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }
}
