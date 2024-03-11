package o;

/* renamed from: o.csY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7243csY implements InterfaceC8888fH {
    private final String a;
    private final String b;
    private final String e;

    public static /* synthetic */ C7243csY copy$default(C7243csY c7243csY, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c7243csY.b;
        }
        if ((i & 2) != 0) {
            str2 = c7243csY.a;
        }
        if ((i & 4) != 0) {
            str3 = c7243csY.e;
        }
        return c7243csY.b(str, str2, str3);
    }

    public final String a() {
        return this.b;
    }

    public final C7243csY b(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        return new C7243csY(str, str2, str3);
    }

    public final String component1() {
        return this.b;
    }

    public final String component2() {
        return this.a;
    }

    public final String component3() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7243csY) {
            C7243csY c7243csY = (C7243csY) obj;
            return C8632dsu.c((Object) this.b, (Object) c7243csY.b) && C8632dsu.c((Object) this.a, (Object) c7243csY.a) && C8632dsu.c((Object) this.e, (Object) c7243csY.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        String str = this.a;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.b;
        String str2 = this.a;
        String str3 = this.e;
        return "ErrorDownloadSheetState(title=" + str + ", episodeInfoText=" + str2 + ", errorStatus=" + str3 + ")";
    }

    public C7243csY(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        this.b = str;
        this.a = str2;
        this.e = str3;
    }
}
