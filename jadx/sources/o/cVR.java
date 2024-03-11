package o;

/* loaded from: classes6.dex */
public final class cVR {
    private final int a;
    private final boolean b;
    private final String d;
    private final String e;

    public static /* synthetic */ cVR b(cVR cvr, String str, String str2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cvr.e;
        }
        if ((i2 & 2) != 0) {
            str2 = cvr.d;
        }
        if ((i2 & 4) != 0) {
            z = cvr.b;
        }
        if ((i2 & 8) != 0) {
            i = cvr.a;
        }
        return cvr.a(str, str2, z, i);
    }

    public final int a() {
        return this.a;
    }

    public final cVR a(String str, String str2, boolean z, int i) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return new cVR(str, str2, z, i);
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cVR) {
            cVR cvr = (cVR) obj;
            return C8632dsu.c((Object) this.e, (Object) cvr.e) && C8632dsu.c((Object) this.d, (Object) cvr.d) && this.b == cvr.b && this.a == cvr.a;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.e.hashCode() * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.b)) * 31) + Integer.hashCode(this.a);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.d;
        boolean z = this.b;
        int i = this.a;
        return "InternalDevice(uuid=" + str + ", friendlyName=" + str2 + ", checked=" + z + ", status=" + i + ")";
    }

    public cVR(String str, String str2, boolean z, int i) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.d = str2;
        this.b = z;
        this.a = i;
    }

    public /* synthetic */ cVR(String str, String str2, boolean z, int i, int i2, C8627dsp c8627dsp) {
        this(str, str2, z, (i2 & 8) != 0 ? 0 : i);
    }
}
