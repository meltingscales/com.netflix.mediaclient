package o;

/* renamed from: o.Bw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0767Bw implements InterfaceC9037hy {
    private final Integer a;
    private final String b;
    private final Integer c;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final Integer b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final Integer e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0767Bw) {
            C0767Bw c0767Bw = (C0767Bw) obj;
            return C8632dsu.c((Object) this.e, (Object) c0767Bw.e) && C8632dsu.c(this.a, c0767Bw.a) && C8632dsu.c(this.c, c0767Bw.c) && C8632dsu.c((Object) this.b, (Object) c0767Bw.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        Integer num = this.a;
        int hashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.c;
        int hashCode3 = num2 == null ? 0 : num2.hashCode();
        String str = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        Integer num = this.a;
        Integer num2 = this.c;
        String str2 = this.b;
        return "ImageFragment(__typename=" + str + ", width=" + num + ", height=" + num2 + ", url=" + str2 + ")";
    }

    public C0767Bw(String str, Integer num, Integer num2, String str2) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.a = num;
        this.c = num2;
        this.b = str2;
    }
}
