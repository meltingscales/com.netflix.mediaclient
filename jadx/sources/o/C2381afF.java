package o;

/* renamed from: o.afF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2381afF implements InterfaceC9037hy {
    private final String a;
    private final String c;

    public final String a() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2381afF) {
            C2381afF c2381afF = (C2381afF) obj;
            return C8632dsu.c((Object) this.c, (Object) c2381afF.c) && C8632dsu.c((Object) this.a, (Object) c2381afF.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        String str = this.a;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.c;
        String str2 = this.a;
        return "LocalizedStringFields(__typename=" + str + ", value=" + str2 + ")";
    }

    public C2381afF(String str, String str2) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.a = str2;
    }
}
