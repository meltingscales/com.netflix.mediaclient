package o;

/* loaded from: classes4.dex */
public final class cVG {
    private final int b;
    private final String c;
    private final String d;

    public final int c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cVG) {
            cVG cvg = (cVG) obj;
            return this.b == cvg.b && C8632dsu.c((Object) this.c, (Object) cvg.c) && C8632dsu.c((Object) this.d, (Object) cvg.d);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        int i = this.b;
        String str = this.c;
        String str2 = this.d;
        return "WebViewLoadError(errorCode=" + i + ", description=" + str + ", failingUrl=" + str2 + ")";
    }

    public cVG(int i, String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = i;
        this.c = str;
        this.d = str2;
    }
}
