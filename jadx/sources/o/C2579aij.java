package o;

/* renamed from: o.aij  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2579aij implements InterfaceC9037hy {
    private final C2630ajh a;
    private final C2512ahV b;
    private final C2580aik c;
    private final String d;
    private final C2637ajo e;

    public final String a() {
        return this.d;
    }

    public final C2630ajh b() {
        return this.a;
    }

    public final C2637ajo c() {
        return this.e;
    }

    public final C2580aik d() {
        return this.c;
    }

    public final C2512ahV e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2579aij) {
            C2579aij c2579aij = (C2579aij) obj;
            return C8632dsu.c((Object) this.d, (Object) c2579aij.d) && C8632dsu.c(this.a, c2579aij.a) && C8632dsu.c(this.c, c2579aij.c) && C8632dsu.c(this.e, c2579aij.e) && C8632dsu.c(this.b, c2579aij.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.a.hashCode();
        int hashCode3 = this.c.hashCode();
        C2637ajo c2637ajo = this.e;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (c2637ajo == null ? 0 : c2637ajo.hashCode())) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.d;
        C2630ajh c2630ajh = this.a;
        C2580aik c2580aik = this.c;
        C2637ajo c2637ajo = this.e;
        C2512ahV c2512ahV = this.b;
        return "PlayerUIBasicInfo(__typename=" + str + ", videoSummary=" + c2630ajh + ", playerVideoDetails=" + c2580aik + ", videoTimeCodes=" + c2637ajo + ", playerAdvisories=" + c2512ahV + ")";
    }

    public C2579aij(String str, C2630ajh c2630ajh, C2580aik c2580aik, C2637ajo c2637ajo, C2512ahV c2512ahV) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2630ajh, "");
        C8632dsu.c((Object) c2580aik, "");
        C8632dsu.c((Object) c2512ahV, "");
        this.d = str;
        this.a = c2630ajh;
        this.c = c2580aik;
        this.e = c2637ajo;
        this.b = c2512ahV;
    }
}
