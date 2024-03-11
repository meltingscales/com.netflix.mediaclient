package o;

/* renamed from: o.aDg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1491aDg extends AbstractC9054iO {
    private final C9050iK e;

    public C1491aDg() {
        this(0, 0L, 3, null);
    }

    public /* synthetic */ C1491aDg(int i, long j, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? -1L : j);
    }

    public C1491aDg(int i, long j) {
        this.e = new C9050iK(i, j);
    }

    @Override // o.AbstractC9054iO
    public AbstractC9055iP b() {
        return new C1488aDd(this.e.b());
    }
}
