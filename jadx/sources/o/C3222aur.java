package o;

/* renamed from: o.aur  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3222aur {
    private final String d;
    private final String e;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3222aur) {
            C3222aur c3222aur = (C3222aur) obj;
            return C8632dsu.c((Object) this.e, (Object) c3222aur.e) && C8632dsu.c((Object) this.d, (Object) c3222aur.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.e;
        String str2 = this.d;
        return "SetProfileAccessPinInput(profileGuid=" + str + ", profileAccessPin=" + str2 + ")";
    }

    public C3222aur(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.d = str2;
    }
}
