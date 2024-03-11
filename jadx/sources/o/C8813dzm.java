package o;

import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dzm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8813dzm<T> implements InterfaceC8814dzn<T>, dyP<T>, dzU<T> {
    private final dxD b;
    private final /* synthetic */ InterfaceC8814dzn<T> e;

    @Override // o.InterfaceC8814dzn, o.dyS
    public Object collect(dyQ<? super T> dyq, InterfaceC8585dra<?> interfaceC8585dra) {
        return this.e.collect(dyq, interfaceC8585dra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8813dzm(InterfaceC8814dzn<? extends T> interfaceC8814dzn, dxD dxd) {
        this.b = dxd;
        this.e = interfaceC8814dzn;
    }

    @Override // o.dzU
    public dyS<T> a(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return C8820dzt.d(this, dqz, i, bufferOverflow);
    }
}
