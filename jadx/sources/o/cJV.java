package o;

/* loaded from: classes4.dex */
public final class cJV {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public cJV() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ cJV e(cJV cjv, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cjv.e;
        }
        if ((i & 2) != 0) {
            str2 = cjv.a;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = cjv.c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = cjv.b;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = cjv.d;
        }
        return cjv.b(str, str6, str7, str8, str5);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public final cJV b(String str, String str2, String str3, String str4, String str5) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) str5, "");
        return new cJV(str, str2, str3, str4, str5);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cJV) {
            cJV cjv = (cJV) obj;
            return C8632dsu.c((Object) this.e, (Object) cjv.e) && C8632dsu.c((Object) this.a, (Object) cjv.a) && C8632dsu.c((Object) this.c, (Object) cjv.c) && C8632dsu.c((Object) this.b, (Object) cjv.b) && C8632dsu.c((Object) this.d, (Object) cjv.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.e.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.e;
        String str2 = this.a;
        String str3 = this.c;
        String str4 = this.b;
        String str5 = this.d;
        return "PlayerTitleState(currentPlayableTitle=" + str + ", currentPlayableTitleContentDescription=" + str2 + ", currentPlayableParentTitle=" + str3 + ", subtitle=" + str4 + ", subtitleContentDescription=" + str5 + ")";
    }

    public cJV(String str, String str2, String str3, String str4, String str5) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) str5, "");
        this.e = str;
        this.a = str2;
        this.c = str3;
        this.b = str4;
        this.d = str5;
    }

    public /* synthetic */ cJV(String str, String str2, String str3, String str4, String str5, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
