package o;

/* renamed from: o.agI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2446agI implements InterfaceC9037hy {
    private final String a;
    private final C2529ahm c;

    public final C2529ahm a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2446agI) {
            C2446agI c2446agI = (C2446agI) obj;
            return C8632dsu.c((Object) this.a, (Object) c2446agI.a) && C8632dsu.c(this.c, c2446agI.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        C2529ahm c2529ahm = this.c;
        return "LolomoMyRemindersRow(__typename=" + str + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2446agI(String str, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.a = str;
        this.c = c2529ahm;
    }
}
