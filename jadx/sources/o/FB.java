package o;

/* loaded from: classes2.dex */
public final class FB implements FD {
    private final String a;
    private final C0873Fw b;
    private final String c;
    private final String d;
    private final String e;
    private final String i;
    private final FE j;

    public final String a() {
        return this.a;
    }

    public final FE d() {
        return this.j;
    }

    public final C0873Fw e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FB) {
            FB fb = (FB) obj;
            return C8632dsu.c((Object) this.e, (Object) fb.e) && C8632dsu.c((Object) this.c, (Object) fb.c) && C8632dsu.c((Object) this.i, (Object) fb.i) && C8632dsu.c((Object) this.d, (Object) fb.d) && C8632dsu.c((Object) this.a, (Object) fb.a) && C8632dsu.c(this.b, fb.b) && C8632dsu.c(this.j, fb.j);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.i;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.d;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.a;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        C0873Fw c0873Fw = this.b;
        int hashCode6 = c0873Fw == null ? 0 : c0873Fw.hashCode();
        FE fe = this.j;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (fe != null ? fe.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.c;
        String str3 = this.i;
        String str4 = this.d;
        String str5 = this.a;
        C0873Fw c0873Fw = this.b;
        FE fe = this.j;
        return "Checkbox(key=" + str + ", accessibilityDescription=" + str2 + ", trackingInfo=" + str3 + ", loggingViewName=" + str4 + ", label=" + str5 + ", field=" + c0873Fw + ", onChange=" + fe + ")";
    }

    public FB(String str, String str2, String str3, String str4, String str5, C0873Fw c0873Fw, FE fe) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.c = str2;
        this.i = str3;
        this.d = str4;
        this.a = str5;
        this.b = c0873Fw;
        this.j = fe;
    }
}
