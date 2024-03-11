package o;

/* renamed from: o.Ul  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1250Ul {
    private final String a;
    private final String c;

    public final String c() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1250Ul) {
            C1250Ul c1250Ul = (C1250Ul) obj;
            return C8632dsu.c((Object) this.a, (Object) c1250Ul.a) && C8632dsu.c((Object) this.c, (Object) c1250Ul.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.c;
        return "DefaultTrackData(audioTrackId=" + str + ", timedTextTrackId=" + str2 + ")";
    }

    public C1250Ul(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.c = str2;
    }
}
