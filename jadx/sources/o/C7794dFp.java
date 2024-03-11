package o;

/* renamed from: o.dFp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7794dFp extends C7784dFf {
    private final AbstractC7773dEv c;
    private int d;

    @Override // o.C7784dFf
    public void a() {
        this.d--;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7794dFp(dFD dfd, AbstractC7773dEv abstractC7773dEv) {
        super(dfd);
        C8632dsu.c((Object) dfd, "");
        C8632dsu.c((Object) abstractC7773dEv, "");
        this.c = abstractC7773dEv;
    }

    @Override // o.C7784dFf
    public void d() {
        c(true);
        this.d++;
    }

    @Override // o.C7784dFf
    public void b() {
        c(false);
        d("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            d(this.c.a().n());
        }
    }

    @Override // o.C7784dFf
    public void c() {
        d(' ');
    }
}
