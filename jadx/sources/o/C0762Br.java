package o;

import com.netflix.clcs.codegen.type.CLCSIconSize;

/* renamed from: o.Br  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0762Br implements InterfaceC9037hy {
    private final CLCSIconSize a;
    private final String b;
    private final b c;
    private final a d;
    private final e e;

    public final String a() {
        return this.b;
    }

    public final a b() {
        return this.d;
    }

    public final e c() {
        return this.e;
    }

    public final b d() {
        return this.c;
    }

    public final CLCSIconSize e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0762Br) {
            C0762Br c0762Br = (C0762Br) obj;
            return C8632dsu.c((Object) this.b, (Object) c0762Br.b) && C8632dsu.c(this.d, c0762Br.d) && C8632dsu.c(this.e, c0762Br.e) && this.a == c0762Br.a && C8632dsu.c(this.c, c0762Br.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        a aVar = this.d;
        int hashCode2 = aVar == null ? 0 : aVar.hashCode();
        e eVar = this.e;
        int hashCode3 = eVar == null ? 0 : eVar.hashCode();
        CLCSIconSize cLCSIconSize = this.a;
        int hashCode4 = cLCSIconSize == null ? 0 : cLCSIconSize.hashCode();
        b bVar = this.c;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        a aVar = this.d;
        e eVar = this.e;
        CLCSIconSize cLCSIconSize = this.a;
        b bVar = this.c;
        return "IconFragment(__typename=" + str + ", accessibilityDescription=" + aVar + ", icon=" + eVar + ", iconSize=" + cLCSIconSize + ", color=" + bVar + ")";
    }

    public C0762Br(String str, a aVar, e eVar, CLCSIconSize cLCSIconSize, b bVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.d = aVar;
        this.e = eVar;
        this.a = cLCSIconSize;
        this.c = bVar;
    }

    /* renamed from: o.Br$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final BG a;
        private final String d;

        public final String c() {
            return this.d;
        }

        public final BG e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            BG bg = this.a;
            return "AccessibilityDescription(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public a(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.d = str;
            this.a = bg;
        }
    }

    /* renamed from: o.Br$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final C0746Bb a;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final C0746Bb d() {
            return this.a;
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

    /* renamed from: o.Br$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final String a;
        private final AW e;

        public final AW a() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            AW aw = this.e;
            return "Color(__typename=" + str + ", colorFragment=" + aw + ")";
        }

        public b(String str, AW aw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aw, "");
            this.a = str;
            this.e = aw;
        }
    }
}
