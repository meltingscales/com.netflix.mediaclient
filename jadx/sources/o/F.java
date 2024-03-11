package o;

import androidx.compose.ui.text.TextStyle;

/* loaded from: classes5.dex */
public final class F {
    private final String a;
    private final String b;
    private final TextStyle c;
    private final String d;

    public final String a() {
        return this.a;
    }

    public final TextStyle c() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            F f = (F) obj;
            return C8632dsu.c((Object) this.a, (Object) f.a) && C8632dsu.c((Object) this.b, (Object) f.b) && C8632dsu.c((Object) this.d, (Object) f.d) && C8632dsu.c(this.c, f.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.d;
        TextStyle textStyle = this.c;
        return "ShowkaseBrowserTypography(typographyGroup=" + str + ", typographyName=" + str2 + ", typographyKDoc=" + str3 + ", textStyle=" + textStyle + ")";
    }
}
