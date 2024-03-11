package o;

import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dzk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8811dzk<T> implements InterfaceC8822dzv<T>, dyP<T>, dzU<T> {
    private final /* synthetic */ InterfaceC8822dzv<T> c;
    private final dxD d;

    @Override // o.InterfaceC8822dzv
    public T b() {
        return this.c.b();
    }

    @Override // o.InterfaceC8814dzn, o.dyS
    public Object collect(dyQ<? super T> dyq, InterfaceC8585dra<?> interfaceC8585dra) {
        return this.c.collect(dyq, interfaceC8585dra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8811dzk(InterfaceC8822dzv<? extends T> interfaceC8822dzv, dxD dxd) {
        this.d = dxd;
        this.c = interfaceC8822dzv;
    }

    @Override // o.dzU
    public dyS<T> a(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return dzB.e(this, dqz, i, bufferOverflow);
    }
}
