package o;

/* renamed from: o.adu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2316adu implements InterfaceC9037hy {
    private final int a;
    private final String c;
    private final Integer d;
    private final String e;

    public final Integer a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2316adu) {
            C2316adu c2316adu = (C2316adu) obj;
            return C8632dsu.c((Object) this.e, (Object) c2316adu.e) && this.a == c2316adu.a && C8632dsu.c((Object) this.c, (Object) c2316adu.c) && C8632dsu.c(this.d, c2316adu.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = Integer.hashCode(this.a);
        String str = this.c;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.d;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        int i = this.a;
        String str2 = this.c;
        Integer num = this.d;
        return "BlockedTitleSummary(__typename=" + str + ", videoId=" + i + ", title=" + str2 + ", releaseYear=" + num + ")";
    }

    public C2316adu(String str, int i, String str2, Integer num) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.a = i;
        this.c = str2;
        this.d = num;
    }
}
