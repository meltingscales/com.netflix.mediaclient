package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.dbY  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7969dbY {
    public static final a e = new a(null);
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final int f;
    private final String g;
    private final int i;
    private final String j;

    public static final String a(long j) {
        return e.b(j);
    }

    public final String a() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7969dbY) {
            C7969dbY c7969dbY = (C7969dbY) obj;
            return C8632dsu.c((Object) this.d, (Object) c7969dbY.d) && C8632dsu.c((Object) this.g, (Object) c7969dbY.g) && this.c == c7969dbY.c && this.f == c7969dbY.f && C8632dsu.c((Object) this.j, (Object) c7969dbY.j) && C8632dsu.c((Object) this.b, (Object) c7969dbY.b) && C8632dsu.c((Object) this.a, (Object) c7969dbY.a) && this.i == c7969dbY.i;
        }
        return false;
    }

    public final String f() {
        return this.j;
    }

    public final int g() {
        return this.f;
    }

    public final int h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.g.hashCode();
        int hashCode3 = Integer.hashCode(this.c);
        int hashCode4 = Integer.hashCode(this.f);
        int hashCode5 = this.j.hashCode();
        String str = this.b;
        int hashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.i);
    }

    public final String i() {
        return this.g;
    }

    public String toString() {
        String str = this.d;
        String str2 = this.g;
        int i = this.c;
        int i2 = this.f;
        String str3 = this.j;
        String str4 = this.b;
        String str5 = this.a;
        int i3 = this.i;
        return "UserMark(id=" + str + ", videoId=" + str2 + ", runtime=" + i + ", timestamp=" + i2 + ", title=" + str3 + ", parentTitle=" + str4 + ", imageUrl=" + str5 + ", videoType=" + i3 + ")";
    }

    public C7969dbY(String str, String str2, int i, int i2, String str3, String str4, String str5, int i3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.d = str;
        this.g = str2;
        this.c = i;
        this.f = i2;
        this.j = str3;
        this.b = str4;
        this.a = str5;
        this.i = i3;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        if (str != null) {
            sb.append(str + "\n");
        }
        String str2 = this.j;
        sb.append(str2 + "\n");
        sb.append(e.b((long) this.f));
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        if (str != null) {
            sb.append(str + " - ");
        }
        sb.append(String.valueOf(this.j));
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    /* renamed from: o.dbY$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final String b(long j) {
            String d = new C8174dfR().d((int) TimeUnit.MILLISECONDS.toSeconds(j));
            C8632dsu.a(d, "");
            return d;
        }
    }
}
