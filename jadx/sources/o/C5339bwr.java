package o;

/* renamed from: o.bwr  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5339bwr {
    private int a;
    private String b;
    private String c;
    private String d;
    private long e;
    private long f;
    private long h;
    private long i;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final long c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    public final long g() {
        return this.f;
    }

    public final long h() {
        return this.i;
    }

    public final long i() {
        return this.h;
    }

    public C5339bwr(long j, long j2, int i, String str, String str2, String str3, long j3, long j4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.f = j;
        this.e = j2;
        this.a = i;
        this.d = str;
        this.c = str2;
        this.b = str3;
        this.i = j3;
        this.h = j4;
    }

    public String toString() {
        long j = this.f;
        long j2 = this.e;
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        long j3 = this.i;
        long j4 = this.h;
        return "ThroughputSample(streamId=" + j + ", bytes=" + j2 + ", interval=" + i + ", locationID='" + str + "', ip='" + str2 + "', networkType='" + str3 + "', timestamp=" + j3 + ", totalBufferingTime=" + j4 + ")";
    }
}
