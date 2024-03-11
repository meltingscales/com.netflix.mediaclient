package o;

/* renamed from: o.bws  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5340bws {
    private final int a;
    private final int b;
    private long c;
    private final long d;
    private final long e;
    private final String f;
    private final String g;
    private final boolean i;

    public final int a() {
        return this.b;
    }

    public final long b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final long d() {
        return this.c;
    }

    public final void d(long j) {
        this.c = j;
    }

    public final long e() {
        return this.e;
    }

    public final boolean f() {
        return this.i;
    }

    public final String h() {
        return this.f;
    }

    public final String i() {
        return this.g;
    }

    public C5340bws(String str, String str2, long j, int i, int i2, long j2, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.f = str;
        this.g = str2;
        this.e = j;
        this.b = i;
        this.a = i2;
        this.d = j2;
        this.i = z;
    }

    public String toString() {
        String str = this.f;
        String str2 = this.g;
        long j = this.e;
        int i = this.b;
        int i2 = this.a;
        long j2 = this.d;
        boolean z = this.i;
        long j3 = this.c;
        return "PlayEventEntity(playableId='" + str + "', xid='" + str2 + "', eventTime=" + j + ", eventType=" + i + ", network=" + i2 + ", duration=" + j2 + ", wasOffline=" + z + ", id=" + j3 + ")";
    }
}
