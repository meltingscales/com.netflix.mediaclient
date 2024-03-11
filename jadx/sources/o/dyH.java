package o;

import o.dyI;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dyH<E> extends C8795dyv<E> implements dyK<E> {
    @Override // o.dyK
    public /* synthetic */ dyI u() {
        return b();
    }

    public dyH(dqZ dqz, InterfaceC8792dys<E> interfaceC8792dys) {
        super(dqz, interfaceC8792dys, true, true);
    }

    @Override // o.AbstractC8730dwk, o.dxM, o.dxD
    public boolean cu_() {
        return super.cu_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC8730dwk
    /* renamed from: d */
    public void a(dpR dpr) {
        dyI.e.a(v(), null, 1, null);
    }

    @Override // o.AbstractC8730dwk
    public void b(Throwable th, boolean z) {
        if (v().b(th) || z) {
            return;
        }
        dwS.a(getContext(), th);
    }
}
