package o;

/* renamed from: o.bqd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5007bqd {
    public static final d e = new d(null);
    private final boolean a;
    private final String b;
    private final String c;
    private final String d;
    private final String f;
    private final String g;
    private final String h;
    private final long j;

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5007bqd) {
            C5007bqd c5007bqd = (C5007bqd) obj;
            return C8632dsu.c((Object) this.d, (Object) c5007bqd.d) && C8632dsu.c((Object) this.h, (Object) c5007bqd.h) && C8632dsu.c((Object) this.b, (Object) c5007bqd.b) && C8632dsu.c((Object) this.c, (Object) c5007bqd.c) && this.a == c5007bqd.a && this.j == c5007bqd.j && C8632dsu.c((Object) this.f, (Object) c5007bqd.f) && C8632dsu.c((Object) this.g, (Object) c5007bqd.g);
        }
        return false;
    }

    public final String g() {
        return this.f;
    }

    public final boolean h() {
        return this.a;
    }

    public int hashCode() {
        String str = this.d;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.h;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.b;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.c;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        int hashCode5 = Boolean.hashCode(this.a);
        int hashCode6 = Long.hashCode(this.j);
        int hashCode7 = this.f.hashCode();
        String str5 = this.g;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final long i() {
        return this.j;
    }

    public String toString() {
        String str = this.d;
        String str2 = this.h;
        String str3 = this.b;
        String str4 = this.c;
        boolean z = this.a;
        long j = this.j;
        String str5 = this.f;
        String str6 = this.g;
        return "LoginParams(id=" + str + ", password=" + str2 + ", countryCode=" + str3 + ", countryIsoCode=" + str4 + ", isSmartLockLogin=" + z + ", recaptchaResponseTime=" + j + ", recaptchaResponseToken=" + str5 + ", recaptchaError=" + str6 + ")";
    }

    public C5007bqd(String str, String str2, String str3, String str4, boolean z, long j, String str5, String str6) {
        C8632dsu.c((Object) str5, "");
        this.d = str;
        this.h = str2;
        this.b = str3;
        this.c = str4;
        this.a = z;
        this.j = j;
        this.f = str5;
        this.g = str6;
    }

    /* renamed from: o.bqd$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
