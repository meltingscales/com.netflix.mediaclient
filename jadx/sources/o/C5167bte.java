package o;

/* renamed from: o.bte  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5167bte {
    private final String c;

    public String c() {
        return this.c;
    }

    public C5167bte(String str) {
        this.c = str;
    }

    public boolean b() {
        return this.c.equals("live");
    }

    public static boolean b(String str) {
        return "Default".equals(str) || "postplay".equals(str) || "branching".equals(str) || "live".equals(str) || "UserMarkPreview".equals(str);
    }

    public static boolean c(String str) {
        return "Default".equals(str) || "branching".equals(str) || "live".equals(str);
    }
}
