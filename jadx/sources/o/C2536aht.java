package o;

/* renamed from: o.aht  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2536aht implements InterfaceC9037hy {
    private final String a;
    private final Integer b;
    private final String d;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final Integer e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2536aht) {
            C2536aht c2536aht = (C2536aht) obj;
            return C8632dsu.c((Object) this.d, (Object) c2536aht.d) && C8632dsu.c(this.b, c2536aht.b) && C8632dsu.c((Object) this.e, (Object) c2536aht.e) && C8632dsu.c((Object) this.a, (Object) c2536aht.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        Integer num = this.b;
        String str2 = this.e;
        String str3 = this.a;
        return "MaturityRating(__typename=" + str + ", maturityLevel=" + num + ", label=" + str2 + ", description=" + str3 + ")";
    }

    public C2536aht(String str, Integer num, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.b = num;
        this.e = str2;
        this.a = str3;
    }
}
