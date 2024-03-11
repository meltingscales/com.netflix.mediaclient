package o;

/* renamed from: o.Ha  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0903Ha {
    private final String a;
    private final String e;

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0903Ha) {
            C0903Ha c0903Ha = (C0903Ha) obj;
            return C8632dsu.c((Object) this.e, (Object) c0903Ha.e) && C8632dsu.c((Object) this.a, (Object) c0903Ha.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.e;
        String str2 = this.a;
        return "CmpTaskUUIDData(userActionId=" + str + ", topLevelId=" + str2 + ")";
    }

    public C0903Ha(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.a = str2;
    }
}
