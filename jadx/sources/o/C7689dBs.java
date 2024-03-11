package o;

/* renamed from: o.dBs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7689dBs extends AbstractRunnableC7685dBo {
    public final Runnable d;

    public C7689dBs(Runnable runnable, long j, InterfaceC7688dBr interfaceC7688dBr) {
        super(j, interfaceC7688dBr);
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.d.run();
        } finally {
            this.f.b();
        }
    }

    public String toString() {
        return "Task[" + dwW.c(this.d) + '@' + dwW.a(this.d) + ", " + this.g + ", " + this.f + ']';
    }
}
