package o;

/* loaded from: classes3.dex */
public final class VI {
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    public final String b() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VI) {
            VI vi = (VI) obj;
            return C8632dsu.c((Object) this.c, (Object) vi.c) && C8632dsu.c((Object) this.b, (Object) vi.b) && this.e == vi.e && C8632dsu.c((Object) this.d, (Object) vi.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.c;
        String str2 = this.b;
        boolean z = this.e;
        String str3 = this.d;
        return "AudioTrackData(trackId=" + str + ", languageDescription=" + str2 + ", offTrackDisallowed=" + z + ", defaultTimedTextTrackId=" + str3 + ")";
    }

    public VI(String str, String str2, boolean z, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.c = str;
        this.b = str2;
        this.e = z;
        this.d = str3;
    }
}
