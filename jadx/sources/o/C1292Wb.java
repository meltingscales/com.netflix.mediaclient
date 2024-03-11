package o;

/* renamed from: o.Wb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1292Wb {
    private final String a;
    private final String b;

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1292Wb) {
            C1292Wb c1292Wb = (C1292Wb) obj;
            return C8632dsu.c((Object) this.b, (Object) c1292Wb.b) && C8632dsu.c((Object) this.a, (Object) c1292Wb.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.b;
        String str2 = this.a;
        return "TimedTextTrackData(trackId=" + str + ", languageDescription=" + str2 + ")";
    }

    public C1292Wb(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = str;
        this.a = str2;
    }
}
