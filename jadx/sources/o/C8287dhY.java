package o;

/* renamed from: o.dhY  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8287dhY implements InterfaceC8286dhX {
    private int b;
    private int c;
    private int d;
    private double f;
    private int g;
    private double h;
    private long i;
    private long j;

    private static int e(double d, double d2, int i) {
        if (d <= 0.0d) {
            return i;
        }
        double d3 = i;
        double d4 = d * d3;
        double d5 = d3 - d4;
        return (int) (d5 + (d2 * (((d3 + d4) - d5) + 1.0d)));
    }

    private void e() {
        double d = this.b;
        int i = this.g;
        double d2 = this.h;
        if (d >= i / d2) {
            this.b = i;
        } else {
            this.b = (int) (d * d2);
        }
    }

    public C8287dhY() {
        this.c = 1000;
        this.f = 0.5d;
        this.h = 1.5d;
        this.g = 60000;
        this.d = 120000;
        b();
    }

    public C8287dhY(int i, double d, double d2, int i2, int i3) {
        this.f = 0.5d;
        this.h = 1.5d;
        this.g = 60000;
        this.d = 120000;
        this.c = i;
        if (d > 1.0d || d <= 0.0d) {
            this.f = 0.0d;
        } else {
            this.f = d;
        }
        this.h = d2;
        this.g = i2;
        this.d = i3;
        b();
    }

    @Override // o.InterfaceC8286dhX
    public long d() {
        if (a()) {
            this.i++;
            int e = e(this.f, Math.random(), this.b);
            e();
            return e;
        }
        return -1L;
    }

    @Override // o.InterfaceC8286dhX
    public boolean a() {
        return c() <= ((long) this.d);
    }

    @Override // o.InterfaceC8286dhX
    public void b() {
        this.b = this.c;
        this.j = System.nanoTime();
        this.i = 0L;
    }

    public final long c() {
        return (System.nanoTime() - this.j) / 1000000;
    }
}
