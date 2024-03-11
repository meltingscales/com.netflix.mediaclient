package o;

/* renamed from: o.bwg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5328bwg {
    private final long a;
    private final String b;
    private final String c;
    private final long d;

    public final long a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.a;
    }

    public C5328bwg(String str, String str2, long j, long j2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = str;
        this.c = str2;
        this.d = j;
        this.a = j2;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        long j = this.d;
        long j2 = this.a;
        return "BookmarkStoreEntity(playableId='" + str + "', profileId='" + str2 + "', bookmarkInSecond=" + j + ", bookmarkUpdateTimeInUTCMs=" + j2 + ")";
    }
}
