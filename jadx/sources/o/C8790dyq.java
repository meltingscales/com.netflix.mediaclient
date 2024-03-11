package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.dyq  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C8790dyq<E> extends C8795dyv<E> implements InterfaceC8791dyr<E> {
    public C8790dyq(dqZ dqz, InterfaceC8792dys<E> interfaceC8792dys, boolean z) {
        super(dqz, interfaceC8792dys, false, z);
        a((dxD) dqz.get(dxD.b));
    }

    @Override // o.dxM
    public void f(Throwable th) {
        InterfaceC8792dys<E> v = v();
        if (th != null) {
            r1 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r1 == null) {
                r1 = C8768dxv.e(dwW.c(this) + " was cancelled", th);
            }
        }
        v.e(r1);
    }

    @Override // o.dxM
    public boolean i(Throwable th) {
        dwS.a(getContext(), th);
        return true;
    }
}
