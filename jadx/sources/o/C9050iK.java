package o;

/* renamed from: o.iK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9050iK extends AbstractC9054iO {
    private final int c;
    private final long d;

    public C9050iK() {
        this(0, 0L, 3, null);
    }

    public /* synthetic */ C9050iK(int i, long j, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? -1L : j);
    }

    public C9050iK(int i, long j) {
        this.c = i;
        this.d = j;
    }

    @Override // o.AbstractC9054iO
    /* renamed from: a */
    public C9049iJ b() {
        return new C9049iJ(this.c, this.d);
    }
}
