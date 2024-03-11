package o;

import androidx.compose.runtime.Composer;

/* loaded from: classes5.dex */
public final class C {
    private final String a;
    private final String b;
    private final String c;
    private final drX<Composer, Integer, dpR> d;
    private final String e;
    private final boolean f;
    private final Integer g;
    private final String h;
    private final Integer j;

    public final drX<Composer, Integer, dpR> a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C) {
            C c = (C) obj;
            return C8632dsu.c((Object) this.c, (Object) c.c) && C8632dsu.c((Object) this.b, (Object) c.b) && C8632dsu.c((Object) this.a, (Object) c.a) && C8632dsu.c((Object) this.e, (Object) c.e) && C8632dsu.c(this.d, c.d) && C8632dsu.c((Object) this.h, (Object) c.h) && this.f == c.f && C8632dsu.c(this.g, c.g) && C8632dsu.c(this.j, c.j);
        }
        return false;
    }

    public final Integer f() {
        return this.g;
    }

    public final String g() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.a.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.d.hashCode();
        String str = this.h;
        int hashCode6 = str == null ? 0 : str.hashCode();
        boolean z = this.f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        Integer num = this.g;
        int hashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.j;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + hashCode7) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean i() {
        return this.f;
    }

    public final Integer j() {
        return this.j;
    }

    public String toString() {
        String str = this.c;
        String str2 = this.b;
        String str3 = this.a;
        String str4 = this.e;
        drX<Composer, Integer, dpR> drx = this.d;
        String str5 = this.h;
        boolean z = this.f;
        Integer num = this.g;
        Integer num2 = this.j;
        return "ShowkaseBrowserComponent(componentKey=" + str + ", group=" + str2 + ", componentName=" + str3 + ", componentKDoc=" + str4 + ", component=" + drx + ", styleName=" + str5 + ", isDefaultStyle=" + z + ", widthDp=" + num + ", heightDp=" + num2 + ")";
    }
}
