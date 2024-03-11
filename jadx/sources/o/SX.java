package o;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class SX {
    private final String a;
    private Drawable b;
    private final String d;
    private final String e;

    public SX() {
        this(null, null, null, 7, null);
    }

    public final String b() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final Drawable e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SX) {
            SX sx = (SX) obj;
            return C8632dsu.c((Object) this.d, (Object) sx.d) && C8632dsu.c((Object) this.a, (Object) sx.a) && C8632dsu.c((Object) this.e, (Object) sx.e);
        }
        return false;
    }

    public int hashCode() {
        String str = this.d;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        String str2 = this.a;
        String str3 = this.e;
        return "TinyMaturityRatingData(ratingId=" + str + ", textCertification=" + str2 + ", contentDescription=" + str3 + ")";
    }

    public SX(String str, String str2, String str3) {
        this.d = str;
        this.a = str2;
        this.e = str3;
    }

    public /* synthetic */ SX(String str, String str2, String str3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public /* synthetic */ SX(String str, Drawable drawable, String str2, String str3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public SX(String str, Drawable drawable, String str2, String str3) {
        this(str, str2, str3);
        this.b = drawable;
    }

    public final boolean a() {
        boolean g;
        if (this.b == null) {
            String str = this.a;
            if (str != null) {
                g = C8691duz.g(str);
                if (g) {
                }
            }
            return false;
        }
        return true;
    }
}
