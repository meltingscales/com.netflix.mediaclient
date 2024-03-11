package o;

/* loaded from: classes5.dex */
public final class D {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final String e;
    private final String f;

    public D() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static /* synthetic */ D e(D d, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = d.b;
        }
        if ((i & 2) != 0) {
            str2 = d.e;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = d.a;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = d.c;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = d.d;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = d.f;
        }
        return d.b(str, str6, str7, str8, z2, str5);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.e;
    }

    public final D b(String str, String str2, String str3, String str4, boolean z, String str5) {
        return new D(str, str2, str3, str4, z, str5);
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            D d = (D) obj;
            return C8632dsu.c((Object) this.b, (Object) d.b) && C8632dsu.c((Object) this.e, (Object) d.e) && C8632dsu.c((Object) this.a, (Object) d.a) && C8632dsu.c((Object) this.c, (Object) d.c) && this.d == d.d && C8632dsu.c((Object) this.f, (Object) d.f);
        }
        return false;
    }

    public final boolean h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.a;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.c;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        String str5 = this.f;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        String str2 = this.e;
        String str3 = this.a;
        String str4 = this.c;
        boolean z = this.d;
        String str5 = this.f;
        return "ShowkaseBrowserScreenMetadata(currentGroup=" + str + ", currentComponentName=" + str2 + ", currentComponentStyleName=" + str3 + ", currentComponentKey=" + str4 + ", isSearchActive=" + z + ", searchQuery=" + str5 + ")";
    }

    public D(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.b = str;
        this.e = str2;
        this.a = str3;
        this.c = str4;
        this.d = z;
        this.f = str5;
    }

    public /* synthetic */ D(String str, String str2, String str3, String str4, boolean z, String str5, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5);
    }
}
