package o;

import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes5.dex */
public final class dzB {
    private static final dAH c = new dAH("NONE");
    private static final dAH a = new dAH("PENDING");

    public static final <T> InterfaceC8812dzl<T> d(T t) {
        if (t == null) {
            t = (T) dzT.b;
        }
        return new C8821dzu(t);
    }

    public static final <T> dyS<T> e(InterfaceC8822dzv<? extends T> interfaceC8822dzv, dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? C8820dzt.d(interfaceC8822dzv, dqz, i, bufferOverflow) : interfaceC8822dzv;
    }
}
