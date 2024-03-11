package o;

import com.netflix.clcs.codegen.type.CLCSIconSize;
import com.netflix.clcs.codegen.type.CLCSStaticListType;
import java.util.List;

/* loaded from: classes2.dex */
public final class BT implements InterfaceC9037hy {
    private final String b;
    private final CLCSStaticListType d;
    private final List<g> e;

    public final CLCSStaticListType a() {
        return this.d;
    }

    public final List<g> b() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BT) {
            BT bt = (BT) obj;
            return C8632dsu.c((Object) this.b, (Object) bt.b) && C8632dsu.c(this.e, bt.e) && this.d == bt.d;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.e.hashCode();
        CLCSStaticListType cLCSStaticListType = this.d;
        return (((hashCode * 31) + hashCode2) * 31) + (cLCSStaticListType == null ? 0 : cLCSStaticListType.hashCode());
    }

    public String toString() {
        String str = this.b;
        List<g> list = this.e;
        CLCSStaticListType cLCSStaticListType = this.d;
        return "StaticListFragment(__typename=" + str + ", items=" + list + ", listType=" + cLCSStaticListType + ")";
    }

    public BT(String str, List<g> list, CLCSStaticListType cLCSStaticListType) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        this.b = str;
        this.e = list;
        this.d = cLCSStaticListType;
    }

    /* loaded from: classes2.dex */
    public static final class g {
        private final String b;
        private final a c;
        private final d d;
        private final j e;

        public final a a() {
            return this.c;
        }

        public final j c() {
            return this.e;
        }

        public final String d() {
            return this.b;
        }

        public final d e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.b, (Object) gVar.b) && C8632dsu.c(this.d, gVar.d) && C8632dsu.c(this.e, gVar.e) && C8632dsu.c(this.c, gVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            d dVar = this.d;
            int hashCode2 = dVar == null ? 0 : dVar.hashCode();
            j jVar = this.e;
            int hashCode3 = jVar == null ? 0 : jVar.hashCode();
            a aVar = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            d dVar = this.d;
            j jVar = this.e;
            a aVar = this.c;
            return "Item(__typename=" + str + ", icon=" + dVar + ", title=" + jVar + ", body=" + aVar + ")";
        }

        public g(String str, d dVar, j jVar, a aVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = dVar;
            this.e = jVar;
            this.c = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final e a;
        private final c b;
        private final CLCSIconSize c;
        private final String d;
        private final b e;

        public final String a() {
            return this.d;
        }

        public final c b() {
            return this.b;
        }

        public final CLCSIconSize c() {
            return this.c;
        }

        public final b d() {
            return this.e;
        }

        public final e e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.a, dVar.a) && this.c == dVar.c;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            b bVar = this.e;
            int hashCode2 = bVar == null ? 0 : bVar.hashCode();
            c cVar = this.b;
            int hashCode3 = cVar == null ? 0 : cVar.hashCode();
            e eVar = this.a;
            int hashCode4 = eVar == null ? 0 : eVar.hashCode();
            CLCSIconSize cLCSIconSize = this.c;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (cLCSIconSize != null ? cLCSIconSize.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            b bVar = this.e;
            c cVar = this.b;
            e eVar = this.a;
            CLCSIconSize cLCSIconSize = this.c;
            return "Icon(__typename=" + str + ", accessibilityDescription=" + bVar + ", icon=" + cVar + ", color=" + eVar + ", size=" + cLCSIconSize + ")";
        }

        public d(String str, b bVar, c cVar, e eVar, CLCSIconSize cLCSIconSize) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = bVar;
            this.b = cVar;
            this.a = eVar;
            this.c = cLCSIconSize;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final String a;
        private final BG b;

        public final BG b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            BG bg = this.b;
            return "AccessibilityDescription(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public b(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.a = str;
            this.b = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final C0746Bb b;
        private final String c;

        public final C0746Bb a() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            C0746Bb c0746Bb = this.b;
            return "Icon1(__typename=" + str + ", designIconFragment=" + c0746Bb + ")";
        }

        public c(String str, C0746Bb c0746Bb) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0746Bb, "");
            this.c = str;
            this.b = c0746Bb;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final String b;
        private final AW d;

        public final String b() {
            return this.b;
        }

        public final AW d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            AW aw = this.d;
            return "Color(__typename=" + str + ", colorFragment=" + aw + ")";
        }

        public e(String str, AW aw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aw, "");
            this.b = str;
            this.d = aw;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j {
        private final String c;
        private final BB d;

        public final BB c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.c, (Object) jVar.c) && C8632dsu.c(this.d, jVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            BB bb = this.d;
            return "Title(__typename=" + str + ", localizedFormattedStringFragment=" + bb + ")";
        }

        public j(String str, BB bb) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bb, "");
            this.c = str;
            this.d = bb;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final String a;
        private final BB e;

        public final BB a() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            BB bb = this.e;
            return "Body(__typename=" + str + ", localizedFormattedStringFragment=" + bb + ")";
        }

        public a(String str, BB bb) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bb, "");
            this.a = str;
            this.e = bb;
        }
    }
}
