package o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.czp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7631czp {
    @SerializedName("uiLabel")
    private final String b;
    @SerializedName("inPostPlayPlayback")
    private boolean c;
    @SerializedName("postPlayEverywhereAutoPlayEnabled")
    private final boolean d;
    @SerializedName("impressionData")
    private final String e;

    public C7631czp() {
        this(false, null, null, false, 15, null);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7631czp) {
            C7631czp c7631czp = (C7631czp) obj;
            return this.c == c7631czp.c && C8632dsu.c((Object) this.b, (Object) c7631czp.b) && C8632dsu.c((Object) this.e, (Object) c7631czp.e) && this.d == c7631czp.d;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.c);
        int hashCode2 = this.b.hashCode();
        String str = this.e;
        return (((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        boolean z = this.c;
        String str = this.b;
        String str2 = this.e;
        boolean z2 = this.d;
        return "PostPlayExtras(inPostPlayPlayback=" + z + ", uiLabel=" + str + ", impressionData=" + str2 + ", postPlayEverywhereAutoPlayEnabled=" + z2 + ")";
    }

    public C7631czp(boolean z, String str, String str2, boolean z2) {
        C8632dsu.c((Object) str, "");
        this.c = z;
        this.b = str;
        this.e = str2;
        this.d = z2;
    }

    public /* synthetic */ C7631czp(boolean z, String str, String str2, boolean z2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "Default" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z2);
    }
}
