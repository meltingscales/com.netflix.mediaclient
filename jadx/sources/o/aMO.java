package o;

/* loaded from: classes3.dex */
public final class aMO {
    private long a;
    private String e;
    private final long d = 3600000;
    private final long c = 259200000;

    public final void a() {
        this.e = null;
        this.a = 0L;
    }

    public final String c() {
        if (C8170dfN.d() - this.a > this.d) {
            a();
        }
        return this.e;
    }

    public final void b(String str) {
        this.e = str;
        this.a = C8170dfN.d();
    }
}
