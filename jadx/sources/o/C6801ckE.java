package o;

/* renamed from: o.ckE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6801ckE {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6801ckE) {
            C6801ckE c6801ckE = (C6801ckE) obj;
            return C8632dsu.c((Object) this.a, (Object) c6801ckE.a) && C8632dsu.c((Object) this.b, (Object) c6801ckE.b) && C8632dsu.c((Object) this.d, (Object) c6801ckE.d) && C8632dsu.c((Object) this.c, (Object) c6801ckE.c) && this.e == c6801ckE.e;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.d.hashCode();
        String str2 = this.c;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.e);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.d;
        String str4 = this.c;
        int i = this.e;
        return "CodeEntryScreenData(pinEntryId=" + str + ", titleText=" + str2 + ", subtitleText=" + str3 + ", expireText=" + str4 + ", icon=" + i + ")";
    }

    public C6801ckE(String str, String str2, String str3, String str4, int i) {
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.c = str4;
        this.e = i;
    }
}
