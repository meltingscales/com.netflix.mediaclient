package o;

/* loaded from: classes3.dex */
public final class VR {
    private String b;
    private String e;

    public final String a() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VR) {
            VR vr = (VR) obj;
            return C8632dsu.c((Object) this.b, (Object) vr.b) && C8632dsu.c((Object) this.e, (Object) vr.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.b;
        String str2 = this.e;
        return "DefaultTrackData(audioTrackId=" + str + ", timedTextTrackId=" + str2 + ")";
    }

    public VR(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = str;
        this.e = str2;
    }
}
