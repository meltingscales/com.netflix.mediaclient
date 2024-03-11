package o;

/* renamed from: o.bid  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4656bid {
    private final long b;
    private final long c;
    private final long d;
    private final long e;

    public long a() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public long e() {
        return this.c + this.b;
    }

    public long f() {
        return this.d;
    }

    public long g() {
        return this.d + this.e;
    }

    public long j() {
        return this.e;
    }

    public C4656bid(long j, long j2, long j3, long j4) {
        this.d = j;
        this.e = j2;
        this.c = j3;
        this.b = j4;
    }

    public String toString() {
        return "ChunkInfo{pts=(" + androidx.media3.common.C.usToMs(f()) + "ms," + androidx.media3.common.C.usToMs(g()) + "ms), bytes=(" + c() + "," + e() + ")}";
    }
}
