package o;

/* loaded from: classes3.dex */
public final class KJ {
    public static final int d = 0;
    private final String a;
    private final String c;
    private final String e;

    public final String a() {
        return this.a;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KJ) {
            KJ kj = (KJ) obj;
            return C8632dsu.c((Object) this.a, (Object) kj.a) && C8632dsu.c((Object) this.e, (Object) kj.e) && C8632dsu.c((Object) this.c, (Object) kj.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.e;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.e;
        String str3 = this.c;
        return "HawkinsCheckboxText(label=" + str + ", description=" + str2 + ", errorMessage=" + str3 + ")";
    }

    public KJ(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = str2;
        this.c = str3;
    }

    public /* synthetic */ KJ(String str, String str2, String str3, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
