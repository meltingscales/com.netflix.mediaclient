package o;

import com.netflix.android.org.json.zip.JSONzip;

/* renamed from: o.bil  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4664bil {
    private final boolean a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final String f;
    private final long g;
    private final long h;
    private final long i;
    private final int j;

    public C4664bil(boolean z, long j, long j2, long j3, long j4, int i, long j5, String str) {
        this(z, j, j2, j3, j4, i, j5, str, 0L, 0L, 768, null);
    }

    public final long a() {
        return this.e;
    }

    public final int b() {
        return this.j;
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.g;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4664bil) {
            C4664bil c4664bil = (C4664bil) obj;
            return this.a == c4664bil.a && this.i == c4664bil.i && this.b == c4664bil.b && this.c == c4664bil.c && this.d == c4664bil.d && this.j == c4664bil.j && this.e == c4664bil.e && C8632dsu.c((Object) this.f, (Object) c4664bil.f) && this.g == c4664bil.g && this.h == c4664bil.h;
        }
        return false;
    }

    public final long h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.a);
        int hashCode2 = Long.hashCode(this.i);
        int hashCode3 = Long.hashCode(this.b);
        int hashCode4 = Long.hashCode(this.c);
        int hashCode5 = Long.hashCode(this.d);
        int hashCode6 = Integer.hashCode(this.j);
        int hashCode7 = Long.hashCode(this.e);
        String str = this.f;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.g)) * 31) + Long.hashCode(this.h);
    }

    public final boolean j() {
        return this.a;
    }

    public String toString() {
        boolean z = this.a;
        long j = this.i;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        int i = this.j;
        long j5 = this.e;
        String str = this.f;
        long j6 = this.g;
        long j7 = this.h;
        return "LocationSelectorParams(isLive=" + z + ", startTimeUs=" + j + ", endTimeUs=" + j2 + ", nowTimeUs=" + j3 + ", bufToLiveEdgeOffsetUs=" + j4 + ", ocLiveWindowDurationSeconds=" + i + ", movieId=" + j5 + ", pbcid=" + str + ", parentMovieId=" + j6 + ", startTimeWallClockUs=" + j7 + ")";
    }

    public C4664bil(boolean z, long j, long j2, long j3, long j4, int i, long j5, String str, long j6, long j7) {
        this.a = z;
        this.i = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.j = i;
        this.e = j5;
        this.f = str;
        this.g = j6;
        this.h = j7;
    }

    public /* synthetic */ C4664bil(boolean z, long j, long j2, long j3, long j4, int i, long j5, String str, long j6, long j7, int i2, C8627dsp c8627dsp) {
        this(z, j, j2, j3, j4, i, j5, str, (i2 & JSONzip.end) != 0 ? j5 : j6, (i2 & 512) != 0 ? -9223372036854775807L : j7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4664bil(android.net.Uri r23) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = ""
            o.C8632dsu.c(r0, r1)
            java.lang.String r1 = "samurai-live"
            java.lang.String r1 = r0.getQueryParameter(r1)
            r2 = 0
            if (r1 == 0) goto L16
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            r4 = r1
            goto L17
        L16:
            r4 = r2
        L17:
            java.lang.String r1 = "samurai-start"
            java.lang.String r1 = r0.getQueryParameter(r1)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L29
            long r7 = java.lang.Long.parseLong(r1)
            goto L2a
        L29:
            r7 = r5
        L2a:
            java.lang.String r1 = "samurai-end"
            java.lang.String r1 = r0.getQueryParameter(r1)
            if (r1 == 0) goto L37
            long r9 = java.lang.Long.parseLong(r1)
            goto L38
        L37:
            r9 = r5
        L38:
            java.lang.String r1 = "samurai-now"
            java.lang.String r1 = r0.getQueryParameter(r1)
            if (r1 == 0) goto L45
            long r11 = java.lang.Long.parseLong(r1)
            goto L46
        L45:
            r11 = r5
        L46:
            java.lang.String r1 = "samurai-offset"
            java.lang.String r1 = r0.getQueryParameter(r1)
            if (r1 == 0) goto L53
            long r13 = java.lang.Long.parseLong(r1)
            goto L54
        L53:
            r13 = r5
        L54:
            java.lang.String r1 = "samurai-live-window"
            java.lang.String r1 = r0.getQueryParameter(r1)
            if (r1 == 0) goto L60
            int r2 = java.lang.Integer.parseInt(r1)
        L60:
            java.lang.String r1 = "samurai-movie-id"
            java.lang.String r3 = r0.getQueryParameter(r1)
            r15 = -1
            if (r3 == 0) goto L6f
            long r17 = java.lang.Long.parseLong(r3)
            goto L71
        L6f:
            r17 = r15
        L71:
            java.lang.String r3 = "samurai-pbcid"
            java.lang.String r19 = r0.getQueryParameter(r3)
            java.lang.String r3 = "samurai-parent-movie-id"
            java.lang.String r3 = r0.getQueryParameter(r3)
            if (r3 != 0) goto L83
            java.lang.String r3 = r0.getQueryParameter(r1)
        L83:
            if (r3 == 0) goto L89
            long r15 = java.lang.Long.parseLong(r3)
        L89:
            r20 = r15
            java.lang.String r1 = "samurai-wall"
            java.lang.String r0 = r0.getQueryParameter(r1)
            if (r0 == 0) goto L98
            long r0 = java.lang.Long.parseLong(r0)
            goto L99
        L98:
            r0 = r5
        L99:
            r3 = r22
            r5 = r7
            r7 = r9
            r9 = r11
            r11 = r13
            r13 = r2
            r14 = r17
            r16 = r19
            r17 = r20
            r19 = r0
            r3.<init>(r4, r5, r7, r9, r11, r13, r14, r16, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4664bil.<init>(android.net.Uri):void");
    }
}
