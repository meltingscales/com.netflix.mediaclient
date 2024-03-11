package o;

import com.netflix.clcs.codegen.type.CLCSTemplateItemFlexibleSize;

/* loaded from: classes2.dex */
public final class BX implements InterfaceC9037hy {
    private final d a;
    private final String b;
    private final a e;

    public final a c() {
        return this.e;
    }

    public final d d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BX) {
            BX bx = (BX) obj;
            return C8632dsu.c((Object) this.b, (Object) bx.b) && C8632dsu.c(this.a, bx.a) && C8632dsu.c(this.e, bx.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        d dVar = this.a;
        int hashCode2 = dVar == null ? 0 : dVar.hashCode();
        a aVar = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        d dVar = this.a;
        a aVar = this.e;
        return "TemplateItemFragment(__typename=" + str + ", onCLCSTemplateItemFlexible=" + dVar + ", onCLCSTemplateItemNumColumns=" + aVar + ")";
    }

    public BX(String str, d dVar, a aVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = dVar;
        this.e = aVar;
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final Integer a;
        private final CLCSTemplateItemFlexibleSize b;

        public final CLCSTemplateItemFlexibleSize c() {
            return this.b;
        }

        public final Integer d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.a, dVar.a) && this.b == dVar.b;
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.a;
            return ((num == null ? 0 : num.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            Integer num = this.a;
            CLCSTemplateItemFlexibleSize cLCSTemplateItemFlexibleSize = this.b;
            return "OnCLCSTemplateItemFlexible(order=" + num + ", size=" + cLCSTemplateItemFlexibleSize + ")";
        }

        public d(Integer num, CLCSTemplateItemFlexibleSize cLCSTemplateItemFlexibleSize) {
            C8632dsu.c((Object) cLCSTemplateItemFlexibleSize, "");
            this.a = num;
            this.b = cLCSTemplateItemFlexibleSize;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final int a;
        private final Integer c;

        public final Integer c() {
            return this.c;
        }

        public final int d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.c, aVar.c) && this.a == aVar.a;
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.c;
            return ((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            Integer num = this.c;
            int i = this.a;
            return "OnCLCSTemplateItemNumColumns(order=" + num + ", numColumns=" + i + ")";
        }

        public a(Integer num, int i) {
            this.c = num;
            this.a = i;
        }
    }
}
