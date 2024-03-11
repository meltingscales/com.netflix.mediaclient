package o;

/* renamed from: o.cPu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5987cPu {
    private final String b;
    private final int c;

    public final int b() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5987cPu) {
            C5987cPu c5987cPu = (C5987cPu) obj;
            return this.c == c5987cPu.c && C8632dsu.c((Object) this.b, (Object) c5987cPu.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.c);
        String str = this.b;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.c;
        String str = this.b;
        return "BlockedTitle(videoId=" + i + ", title=" + str + ")";
    }

    public C5987cPu(int i, String str) {
        this.c = i;
        this.b = str;
    }
}
