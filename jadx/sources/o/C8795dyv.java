package o;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* renamed from: o.dyv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8795dyv<E> extends AbstractC8730dwk<dpR> implements InterfaceC8792dys<E> {
    private final InterfaceC8792dys<E> e;

    public Object a(E e, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return this.e.a(e, interfaceC8585dra);
    }

    public final InterfaceC8792dys<E> b() {
        return this;
    }

    public boolean b(Throwable th) {
        return this.e.b(th);
    }

    @Override // o.dyJ
    public Object c(InterfaceC8585dra<? super E> interfaceC8585dra) {
        return this.e.c(interfaceC8585dra);
    }

    @Override // o.dyJ
    public InterfaceC8798dyy<E> ct_() {
        return this.e.ct_();
    }

    public Object d(E e) {
        return this.e.d((InterfaceC8792dys<E>) e);
    }

    @Override // o.dyI
    public void d(drM<? super Throwable, dpR> drm) {
        this.e.d(drm);
    }

    @Override // o.dyJ
    public Object e(InterfaceC8585dra<? super C8797dyx<? extends E>> interfaceC8585dra) {
        Object e = this.e.e(interfaceC8585dra);
        C8586drb.e();
        return e;
    }

    @Override // o.dyJ
    public dBB<E> f() {
        return this.e.f();
    }

    @Override // o.dyJ
    public dBB<C8797dyx<E>> h() {
        return this.e.h();
    }

    @Override // o.dyI
    public boolean n() {
        return this.e.n();
    }

    @Override // o.dyJ
    public Object s() {
        return this.e.s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC8792dys<E> v() {
        return this.e;
    }

    public C8795dyv(dqZ dqz, InterfaceC8792dys<E> interfaceC8792dys, boolean z, boolean z2) {
        super(dqz, z, z2);
        this.e = interfaceC8792dys;
    }

    @Override // o.dxM, o.dxD
    public final void e(CancellationException cancellationException) {
        if (g()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(a(), null, this);
        }
        d((Throwable) cancellationException);
    }

    @Override // o.dxM
    public void d(Throwable th) {
        CancellationException c = dxM.c(this, th, null, 1, null);
        this.e.e(c);
        a_((Throwable) c);
    }

    @Override // o.dxM
    public /* synthetic */ void m() {
        d((Throwable) new JobCancellationException(a(), null, this));
    }
}
