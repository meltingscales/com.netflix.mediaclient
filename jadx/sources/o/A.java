package o;

import androidx.compose.ui.graphics.Color;

/* loaded from: classes5.dex */
public final class A {
    private final String a;
    private final String b;
    private final String d;
    private final long e;

    public final long b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            A a = (A) obj;
            return C8632dsu.c((Object) this.d, (Object) a.d) && C8632dsu.c((Object) this.a, (Object) a.a) && C8632dsu.c((Object) this.b, (Object) a.b) && Color.m1294equalsimpl0(this.e, a.e);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + Color.m1300hashCodeimpl(this.e);
    }

    public String toString() {
        String str = this.d;
        String str2 = this.a;
        String str3 = this.b;
        String m1301toStringimpl = Color.m1301toStringimpl(this.e);
        return "ShowkaseBrowserColor(colorGroup=" + str + ", colorName=" + str2 + ", colorKDoc=" + str3 + ", color=" + m1301toStringimpl + ")";
    }
}
