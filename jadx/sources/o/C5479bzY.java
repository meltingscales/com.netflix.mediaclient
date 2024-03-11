package o;

/* renamed from: o.bzY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5479bzY {
    private final String a;
    private final String c;
    private final String d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5479bzY) {
            C5479bzY c5479bzY = (C5479bzY) obj;
            return C8632dsu.c((Object) this.d, (Object) c5479bzY.d) && C8632dsu.c((Object) this.a, (Object) c5479bzY.a) && C8632dsu.c((Object) this.c, (Object) c5479bzY.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
    }

    public C5479bzY(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.d = str;
        this.a = str2;
        this.c = str3;
    }

    public String toString() {
        String str = this.c;
        String str2 = this.a;
        return str + " +" + str2;
    }
}
