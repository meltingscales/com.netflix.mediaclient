package o;

/* renamed from: o.afd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2405afd implements InterfaceC9037hy {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2405afd) {
            C2405afd c2405afd = (C2405afd) obj;
            return C8632dsu.c((Object) this.c, (Object) c2405afd.c) && this.e == c2405afd.e && C8632dsu.c((Object) this.d, (Object) c2405afd.d) && C8632dsu.c((Object) this.a, (Object) c2405afd.a) && C8632dsu.c((Object) this.b, (Object) c2405afd.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = Integer.hashCode(this.e);
        String str = this.d;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.a.hashCode();
        String str2 = this.b;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        int i = this.e;
        String str2 = this.d;
        String str3 = this.a;
        String str4 = this.b;
        return "GenreData(__typename=" + str + ", genreId=" + i + ", name=" + str2 + ", unifiedEntityId=" + str3 + ", title=" + str4 + ")";
    }

    public C2405afd(String str, int i, String str2, String str3, String str4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        this.c = str;
        this.e = i;
        this.d = str2;
        this.a = str3;
        this.b = str4;
    }
}
