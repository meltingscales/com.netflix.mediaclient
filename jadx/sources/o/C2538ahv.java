package o;

/* renamed from: o.ahv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2538ahv implements InterfaceC9037hy {
    private final Integer a;
    private final String d;

    public final Integer d() {
        return this.a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2538ahv) {
            C2538ahv c2538ahv = (C2538ahv) obj;
            return C8632dsu.c((Object) this.d, (Object) c2538ahv.d) && C8632dsu.c(this.a, c2538ahv.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        Integer num = this.a;
        return (hashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.d;
        Integer num = this.a;
        return "OfflineShowDetails(__typename=" + str + ", latestYear=" + num + ")";
    }

    public C2538ahv(String str, Integer num) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.a = num;
    }
}
