package o;

/* renamed from: o.ckw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6845ckw {
    private final String a;
    private final String b;
    private final String c;
    private final int d;

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6845ckw) {
            C6845ckw c6845ckw = (C6845ckw) obj;
            return C8632dsu.c((Object) this.a, (Object) c6845ckw.a) && C8632dsu.c((Object) this.c, (Object) c6845ckw.c) && C8632dsu.c((Object) this.b, (Object) c6845ckw.b) && this.d == c6845ckw.d;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.c.hashCode();
        String str = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.c;
        String str3 = this.b;
        int i = this.d;
        return "ChallengeErrorScreenData(titleText=" + str + ", subtitleText=" + str2 + ", expireText=" + str3 + ", icon=" + i + ")";
    }

    public C6845ckw(String str, String str2, String str3, int i) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.c = str2;
        this.b = str3;
        this.d = i;
    }

    public /* synthetic */ C6845ckw(String str, String str2, String str3, int i, int i2, C8627dsp c8627dsp) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, i);
    }
}
