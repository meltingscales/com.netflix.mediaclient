package o;

/* renamed from: o.Uo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1253Uo {
    private final String a;
    private final String b;
    private final boolean c;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1253Uo) {
            C1253Uo c1253Uo = (C1253Uo) obj;
            return C8632dsu.c((Object) this.e, (Object) c1253Uo.e) && C8632dsu.c((Object) this.b, (Object) c1253Uo.b) && this.c == c1253Uo.c && C8632dsu.c((Object) this.a, (Object) c1253Uo.a);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.e.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.e;
        String str2 = this.b;
        boolean z = this.c;
        String str3 = this.a;
        return "AudioTrackData(trackId=" + str + ", languageDescription=" + str2 + ", offTrackDisallowed=" + z + ", defaultTimedTextTrackId=" + str3 + ")";
    }

    public C1253Uo(String str, String str2, boolean z, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.e = str;
        this.b = str2;
        this.c = z;
        this.a = str3;
    }
}
