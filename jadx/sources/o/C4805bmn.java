package o;

/* renamed from: o.bmn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4805bmn {
    private final long a;
    private final String b;
    private final boolean d;

    public final boolean b() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4805bmn) {
            C4805bmn c4805bmn = (C4805bmn) obj;
            return this.a == c4805bmn.a && this.d == c4805bmn.d && C8632dsu.c((Object) this.b, (Object) c4805bmn.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.a);
        int hashCode2 = Boolean.hashCode(this.d);
        String str = this.b;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.a;
        boolean z = this.d;
        String str = this.b;
        return "Ads3PConfig(id=" + j + ", is3pVerificationEnabled=" + z + ", thirdPartyVerificationToken=" + str + ")";
    }

    public C4805bmn(long j, boolean z, String str) {
        this.a = j;
        this.d = z;
        this.b = str;
    }
}
