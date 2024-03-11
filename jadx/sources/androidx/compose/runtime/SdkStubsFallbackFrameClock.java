package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import o.C8738dws;
import o.C8752dxf;
import o.InterfaceC8585dra;
import o.dqZ;
import o.drM;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SdkStubsFallbackFrameClock implements MonotonicFrameClock {
    public static final SdkStubsFallbackFrameClock INSTANCE = new SdkStubsFallbackFrameClock();

    private SdkStubsFallbackFrameClock() {
    }

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, drx);
    }

    @Override // o.dqZ.b, o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, dVar);
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, dVar);
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        return MonotonicFrameClock.DefaultImpls.plus(this, dqz);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return C8738dws.c(C8752dxf.d(), new SdkStubsFallbackFrameClock$withFrameNanos$2(drm, null), interfaceC8585dra);
    }
}
