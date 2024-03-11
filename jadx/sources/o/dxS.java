package o;

/* loaded from: classes5.dex */
final class dxS implements Runnable {
    private final dwQ a;
    private final InterfaceC8743dwx<dpR> c;

    /* JADX WARN: Multi-variable type inference failed */
    public dxS(dwQ dwq, InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
        this.a = dwq;
        this.c = interfaceC8743dwx;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.c.e(this.a, dpR.c);
    }
}
