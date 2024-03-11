package o;

/* renamed from: o.dFe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7783dFe extends C7784dFf {
    private final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7783dFe(dFD dfd, boolean z) {
        super(dfd);
        C8632dsu.c((Object) dfd, "");
        this.c = z;
    }

    @Override // o.C7784dFf
    public void b(int i) {
        boolean z = this.c;
        int c = dpJ.c(i);
        if (z) {
            c(C7791dFm.c(c));
        } else {
            d(C7788dFj.c(c));
        }
    }

    @Override // o.C7784dFf
    public void b(long j) {
        String d;
        String b;
        boolean z = this.c;
        long b2 = dpL.b(j);
        if (z) {
            b = C7795dFq.b(b2, 10);
            c(b);
            return;
        }
        d = C7789dFk.d(b2, 10);
        d(d);
    }

    @Override // o.C7784dFf
    public void d(byte b) {
        boolean z = this.c;
        String b2 = dpF.b(dpF.a(b));
        if (z) {
            c(b2);
        } else {
            d(b2);
        }
    }

    @Override // o.C7784dFf
    public void c(short s) {
        boolean z = this.c;
        String d = dpO.d(dpO.c(s));
        if (z) {
            c(d);
        } else {
            d(d);
        }
    }
}
