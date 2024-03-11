package o;

/* renamed from: o.aji  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2631aji implements InterfaceC9037hy {
    private final Boolean a;
    private final int d;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final Boolean b() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2631aji) {
            C2631aji c2631aji = (C2631aji) obj;
            return C8632dsu.c((Object) this.e, (Object) c2631aji.e) && this.d == c2631aji.d && C8632dsu.c(this.a, c2631aji.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = Integer.hashCode(this.d);
        Boolean bool = this.a;
        return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.e;
        int i = this.d;
        Boolean bool = this.a;
        return "VideoInRemindMe(__typename=" + str + ", videoId=" + i + ", isInRemindMeList=" + bool + ")";
    }

    public C2631aji(String str, int i, Boolean bool) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.d = i;
        this.a = bool;
    }
}
