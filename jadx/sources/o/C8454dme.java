package o;

/* renamed from: o.dme  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8454dme {
    public static final C8454dme b = new C8454dme(2000, 3, 15000, 3);
    public static final C8454dme d = new C8454dme(2000, 3, 3000, 3);
    private final int a;
    private final int c;
    private final int e;
    private final int j;

    public int a() {
        return this.e;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.j;
    }

    public int e() {
        return this.c;
    }

    public C8454dme(int i, int i2, int i3, int i4) {
        this.j = Math.min(Math.max(i, 1000), 5000);
        this.a = i2;
        this.e = i3;
        this.c = i4;
    }

    public String toString() {
        return getClass().getSimpleName() + "{searchTimeoutMs=" + c() + ",discoveryAttemptsPerInterval=" + b() + ",discoveryIntervalMs=" + a() + ",attemptsBeforeLost=" + e() + "}";
    }
}
