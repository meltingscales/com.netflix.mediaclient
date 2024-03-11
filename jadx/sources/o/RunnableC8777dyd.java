package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dyd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC8777dyd<U, T extends U> extends dAE<T> implements Runnable {
    public final long d;

    public RunnableC8777dyd(long j, InterfaceC8585dra<? super U> interfaceC8585dra) {
        super(interfaceC8585dra.getContext(), interfaceC8585dra);
        this.d = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        a_((Throwable) C8779dyf.a(this.d, C8749dxc.c(getContext()), this));
    }

    @Override // o.AbstractC8730dwk, o.dxM
    public String c() {
        return super.c() + "(timeMillis=" + this.d + ')';
    }
}
