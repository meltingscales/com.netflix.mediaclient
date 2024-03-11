package o;

/* renamed from: o.cBx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5613cBx extends C5611cBv {
    private final aCG b;
    private final aDB d;
    private final aLP e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5613cBx(aCG acg, aLP alp, aDB adb) {
        super(alp);
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) adb, "");
        this.b = acg;
        this.e = alp;
        this.d = adb;
    }

    @Override // o.C5611cBv
    public InterfaceC5715cFr d() {
        return new C5720cFw(this.e, this.b, this.d);
    }
}
