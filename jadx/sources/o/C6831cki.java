package o;

/* renamed from: o.cki  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6831cki {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6831cki) {
            C6831cki c6831cki = (C6831cki) obj;
            return C8632dsu.c((Object) this.b, (Object) c6831cki.b) && C8632dsu.c((Object) this.d, (Object) c6831cki.d) && C8632dsu.c((Object) this.a, (Object) c6831cki.a) && C8632dsu.c((Object) this.c, (Object) c6831cki.c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.a;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.c;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        String str2 = this.d;
        String str3 = this.a;
        String str4 = this.c;
        return "HouseholdParsedData(lastUsedDeviceName=" + str + ", lastUsedProfileName=" + str2 + ", ownerHouseholdProfileIconUrl=" + str3 + ", formattedLocationName=" + str4 + ")";
    }

    public C6831cki(String str, String str2, String str3, String str4) {
        this.b = str;
        this.d = str2;
        this.a = str3;
        this.c = str4;
    }
}
