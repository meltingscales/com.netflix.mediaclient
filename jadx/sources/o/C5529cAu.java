package o;

/* renamed from: o.cAu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5529cAu extends AbstractC5531cAw {
    private final long a;
    private final Integer b;
    private final String c;
    private final boolean d;
    private final String e;
    private final Integer f;
    private final String g;
    private final int h;
    private final Integer i;
    private final int j;
    private final String k;
    private final int l;
    private final int m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13646o;

    public final Integer a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final long c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5529cAu) {
            C5529cAu c5529cAu = (C5529cAu) obj;
            return C8632dsu.c((Object) this.e, (Object) c5529cAu.e) && C8632dsu.c(this.b, c5529cAu.b) && C8632dsu.c((Object) this.g, (Object) c5529cAu.g) && this.a == c5529cAu.a && this.d == c5529cAu.d && this.m == c5529cAu.m && C8632dsu.c((Object) this.c, (Object) c5529cAu.c) && C8632dsu.c((Object) this.k, (Object) c5529cAu.k) && C8632dsu.c((Object) this.n, (Object) c5529cAu.n) && this.l == c5529cAu.l && this.h == c5529cAu.h && C8632dsu.c(this.f, c5529cAu.f) && C8632dsu.c(this.i, c5529cAu.i) && this.j == c5529cAu.j && this.f13646o == c5529cAu.f13646o;
        }
        return false;
    }

    public final int f() {
        return this.j;
    }

    public final Integer g() {
        return this.f;
    }

    public final int h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.e;
        int hashCode = str == null ? 0 : str.hashCode();
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.g.hashCode();
        int hashCode4 = Long.hashCode(this.a);
        int hashCode5 = Boolean.hashCode(this.d);
        int hashCode6 = Integer.hashCode(this.m);
        String str2 = this.c;
        int hashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.k;
        int hashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.n;
        int hashCode9 = str4 == null ? 0 : str4.hashCode();
        int hashCode10 = Integer.hashCode(this.l);
        int hashCode11 = Integer.hashCode(this.h);
        Integer num2 = this.f;
        int hashCode12 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.i;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (num3 != null ? num3.hashCode() : 0)) * 31) + Integer.hashCode(this.j)) * 31) + Boolean.hashCode(this.f13646o);
    }

    public final String i() {
        return this.g;
    }

    public final Integer j() {
        return this.i;
    }

    public final String k() {
        return this.k;
    }

    public final boolean l() {
        return this.f13646o;
    }

    public final String m() {
        return this.n;
    }

    public final int n() {
        return this.l;
    }

    public final int o() {
        return this.m;
    }

    public String toString() {
        String str = this.e;
        Integer num = this.b;
        String str2 = this.g;
        long j = this.a;
        boolean z = this.d;
        int i = this.m;
        String str3 = this.c;
        String str4 = this.k;
        String str5 = this.n;
        int i2 = this.l;
        int i3 = this.h;
        Integer num2 = this.f;
        Integer num3 = this.i;
        int i4 = this.j;
        boolean z2 = this.f13646o;
        return "PostPlayNextEpisodeSeamlessData(backgroundImageUrl=" + str + ", autoPlayCountdownInSeconds=" + num + ", nextEpisodeVideoId=" + str2 + ", nextEpisodeStartOffset=" + j + ", doNotIncrementInterrupterForPlayEpisodeAction=" + z + ", seamlessEnd=" + i + ", impressionData=" + str3 + ", uuid=" + str4 + ", requestId=" + str5 + ", videoIdForTracking=" + i2 + ", playEpisodeActionTrackId=" + i3 + ", playEpisodeActionAutoPlayTrackId=" + num2 + ", playEpisodeActionUserPlayTrackId=" + num3 + ", playEpisodeActionListPositionForTracking=" + i4 + ", useLegacyIgnoreTapContainer=" + z2 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5529cAu(String str, Integer num, String str2, long j, boolean z, int i, String str3, String str4, String str5, int i2, int i3, Integer num2, Integer num3, int i4, boolean z2) {
        super(null);
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.b = num;
        this.g = str2;
        this.a = j;
        this.d = z;
        this.m = i;
        this.c = str3;
        this.k = str4;
        this.n = str5;
        this.l = i2;
        this.h = i3;
        this.f = num2;
        this.i = num3;
        this.j = i4;
        this.f13646o = z2;
    }
}
