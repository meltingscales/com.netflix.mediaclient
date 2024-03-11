package o;

/* renamed from: o.Ut  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1258Ut {
    private final String a;
    private final String d;

    public final String b() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1258Ut) {
            C1258Ut c1258Ut = (C1258Ut) obj;
            return C8632dsu.c((Object) this.d, (Object) c1258Ut.d) && C8632dsu.c((Object) this.a, (Object) c1258Ut.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.d;
        String str2 = this.a;
        return "TimedTextTrackData(trackId=" + str + ", languageDescription=" + str2 + ")";
    }

    public C1258Ut(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d = str;
        this.a = str2;
    }
}
