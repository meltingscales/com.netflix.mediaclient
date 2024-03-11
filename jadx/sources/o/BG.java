package o;

/* loaded from: classes2.dex */
public final class BG implements InterfaceC9037hy {
    private final String a;
    private final String b;

    public final String b() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BG) {
            BG bg = (BG) obj;
            return C8632dsu.c((Object) this.a, (Object) bg.a) && C8632dsu.c((Object) this.b, (Object) bg.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.b;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return "LocalizedStringFragment(__typename=" + str + ", value=" + str2 + ")";
    }

    public BG(String str, String str2) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.b = str2;
    }
}
