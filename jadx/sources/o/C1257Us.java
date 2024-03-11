package o;

/* renamed from: o.Us  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1257Us implements UD {
    private final long b;

    public C1257Us() {
        this(0L, 1, null);
    }

    @Override // o.UD
    public String b() {
        return "setCurrentTime";
    }

    public final long d() {
        return this.b;
    }

    public C1257Us(long j) {
        this.b = j;
    }

    public /* synthetic */ C1257Us(long j, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? System.currentTimeMillis() / 1000 : j);
    }
}
