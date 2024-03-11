package o;

/* renamed from: o.aos  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2906aos {
    private final String a;
    private final boolean d;
    private final String e;

    public final String b() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2906aos) {
            C2906aos c2906aos = (C2906aos) obj;
            return C8632dsu.c((Object) this.a, (Object) c2906aos.a) && C8632dsu.c((Object) this.e, (Object) c2906aos.e) && this.d == c2906aos.d;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.e;
        boolean z = this.d;
        return "AddProfileInput(name=" + str + ", avatarKey=" + str2 + ", isKids=" + z + ")";
    }

    public C2906aos(String str, String str2, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.e = str2;
        this.d = z;
    }
}
