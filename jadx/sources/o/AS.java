package o;

import com.netflix.clcs.codegen.type.CLCSButtonSize;
import com.netflix.clcs.codegen.type.CLCSButtonType;

/* loaded from: classes2.dex */
public final class AS implements InterfaceC9037hy {
    private final b a;
    private final a b;
    private final CLCSButtonSize c;
    private final String d;
    private final e e;
    private final CLCSButtonType j;

    public final e a() {
        return this.e;
    }

    public final a b() {
        return this.b;
    }

    public final CLCSButtonType c() {
        return this.j;
    }

    public final b d() {
        return this.a;
    }

    public final CLCSButtonSize e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AS) {
            AS as = (AS) obj;
            return C8632dsu.c((Object) this.d, (Object) as.d) && C8632dsu.c(this.b, as.b) && this.c == as.c && this.j == as.j && C8632dsu.c(this.e, as.e) && C8632dsu.c(this.a, as.a);
        }
        return false;
    }

    public final String g() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        a aVar = this.b;
        int hashCode2 = aVar == null ? 0 : aVar.hashCode();
        CLCSButtonSize cLCSButtonSize = this.c;
        int hashCode3 = cLCSButtonSize == null ? 0 : cLCSButtonSize.hashCode();
        CLCSButtonType cLCSButtonType = this.j;
        int hashCode4 = cLCSButtonType == null ? 0 : cLCSButtonType.hashCode();
        e eVar = this.e;
        int hashCode5 = eVar == null ? 0 : eVar.hashCode();
        b bVar = this.a;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        a aVar = this.b;
        CLCSButtonSize cLCSButtonSize = this.c;
        CLCSButtonType cLCSButtonType = this.j;
        e eVar = this.e;
        b bVar = this.a;
        return "ButtonLikeFragment(__typename=" + str + ", label=" + aVar + ", buttonSize=" + cLCSButtonSize + ", type=" + cLCSButtonType + ", icon=" + eVar + ", onPress=" + bVar + ")";
    }

    public AS(String str, a aVar, CLCSButtonSize cLCSButtonSize, CLCSButtonType cLCSButtonType, e eVar, b bVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.b = aVar;
        this.c = cLCSButtonSize;
        this.j = cLCSButtonType;
        this.e = eVar;
        this.a = bVar;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final BG b;
        private final String d;

        public final BG b() {
            return this.b;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            BG bg = this.b;
            return "Label(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public a(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.d = str;
            this.b = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final C0746Bb a;
        private final String e;

        public final C0746Bb d() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            C0746Bb c0746Bb = this.a;
            return "Icon(__typename=" + str + ", designIconFragment=" + c0746Bb + ")";
        }

        public e(String str, C0746Bb c0746Bb) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0746Bb, "");
            this.e = str;
            this.a = c0746Bb;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final String d;
        private final C0753Bi e;

        public final C0753Bi b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0753Bi c0753Bi = this.e;
            return "OnPress(__typename=" + str + ", effectRecursion=" + c0753Bi + ")";
        }

        public b(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.d = str;
            this.e = c0753Bi;
        }
    }
}
