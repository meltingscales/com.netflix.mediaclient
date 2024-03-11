package o;

import com.netflix.hawkins.consumer.tokens.Theme;
import java.util.List;

/* loaded from: classes2.dex */
public final class FX {
    private final String a;
    private final List<FI> b;
    private final b c;
    private final FE d;
    private final String e;
    private final FE f;
    private final Theme g;
    private final FE h;
    private final String i;
    private final String j;

    public final String a() {
        return this.e;
    }

    public final List<FI> b() {
        return this.b;
    }

    public final FE c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final b e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FX) {
            FX fx = (FX) obj;
            return C8632dsu.c((Object) this.j, (Object) fx.j) && C8632dsu.c(this.c, fx.c) && this.g == fx.g && C8632dsu.c(this.d, fx.d) && C8632dsu.c(this.f, fx.f) && C8632dsu.c(this.h, fx.h) && C8632dsu.c((Object) this.i, (Object) fx.i) && C8632dsu.c((Object) this.a, (Object) fx.a) && C8632dsu.c((Object) this.e, (Object) fx.e) && C8632dsu.c(this.b, fx.b);
        }
        return false;
    }

    public final Theme f() {
        return this.g;
    }

    public final FE g() {
        return this.f;
    }

    public final String h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.j.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.g.hashCode();
        FE fe = this.d;
        int hashCode4 = fe == null ? 0 : fe.hashCode();
        FE fe2 = this.f;
        int hashCode5 = fe2 == null ? 0 : fe2.hashCode();
        FE fe3 = this.h;
        int hashCode6 = fe3 == null ? 0 : fe3.hashCode();
        String str = this.i;
        int hashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.e;
        int hashCode9 = str3 == null ? 0 : str3.hashCode();
        List<FI> list = this.b;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String i() {
        return this.i;
    }

    public final FE j() {
        return this.h;
    }

    public String toString() {
        String str = this.j;
        b bVar = this.c;
        Theme theme = this.g;
        FE fe = this.d;
        FE fe2 = this.f;
        FE fe3 = this.h;
        String str2 = this.i;
        String str3 = this.a;
        String str4 = this.e;
        List<FI> list = this.b;
        return "Screen(serverState=" + str + ", componentTree=" + bVar + ", theme=" + theme + ", onBackControl=" + fe + ", onRender=" + fe2 + ", onUnload=" + fe3 + ", trackingInfo=" + str2 + ", loggingViewName=" + str3 + ", navigationMarker=" + str4 + ", fieldInitialization=" + list + ")";
    }

    public FX(String str, b bVar, Theme theme, FE fe, FE fe2, FE fe3, String str2, String str3, String str4, List<FI> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) theme, "");
        this.j = str;
        this.c = bVar;
        this.g = theme;
        this.d = fe;
        this.f = fe2;
        this.h = fe3;
        this.i = str2;
        this.a = str3;
        this.e = str4;
        this.b = list;
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final String b;
        private final FD c;

        public final FD a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.c, bVar.c) && C8632dsu.c((Object) this.b, (Object) bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            FD fd = this.c;
            String str = this.b;
            return "ComponentTree(root=" + fd + ", initialFocusKey=" + str + ")";
        }

        public b(FD fd, String str) {
            C8632dsu.c((Object) fd, "");
            this.c = fd;
            this.b = str;
        }
    }
}
