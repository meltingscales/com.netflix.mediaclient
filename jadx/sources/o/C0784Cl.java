package o;

import com.netflix.clcs.codegen.type.CLCSItemAlignment;
import com.netflix.clcs.codegen.type.CLCSSpaceSize;
import com.netflix.clcs.codegen.type.CLCSStackContentJustification;
import java.util.List;

/* renamed from: o.Cl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0784Cl implements InterfaceC9037hy {
    private final CLCSStackContentJustification a;
    private final String b;
    private final c c;
    private final List<e> d;
    private final CLCSSpaceSize e;
    private final Boolean f;
    private final CLCSItemAlignment i;
    private final a j;

    public final CLCSStackContentJustification a() {
        return this.a;
    }

    public final c b() {
        return this.c;
    }

    public final CLCSSpaceSize c() {
        return this.e;
    }

    public final Boolean d() {
        return this.f;
    }

    public final List<e> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0784Cl) {
            C0784Cl c0784Cl = (C0784Cl) obj;
            return C8632dsu.c((Object) this.b, (Object) c0784Cl.b) && this.a == c0784Cl.a && this.e == c0784Cl.e && C8632dsu.c(this.c, c0784Cl.c) && C8632dsu.c(this.f, c0784Cl.f) && this.i == c0784Cl.i && C8632dsu.c(this.j, c0784Cl.j) && C8632dsu.c(this.d, c0784Cl.d);
        }
        return false;
    }

    public final String g() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        CLCSStackContentJustification cLCSStackContentJustification = this.a;
        int hashCode2 = cLCSStackContentJustification == null ? 0 : cLCSStackContentJustification.hashCode();
        CLCSSpaceSize cLCSSpaceSize = this.e;
        int hashCode3 = cLCSSpaceSize == null ? 0 : cLCSSpaceSize.hashCode();
        c cVar = this.c;
        int hashCode4 = cVar == null ? 0 : cVar.hashCode();
        Boolean bool = this.f;
        int hashCode5 = bool == null ? 0 : bool.hashCode();
        CLCSItemAlignment cLCSItemAlignment = this.i;
        int hashCode6 = cLCSItemAlignment == null ? 0 : cLCSItemAlignment.hashCode();
        a aVar = this.j;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final a i() {
        return this.j;
    }

    public final CLCSItemAlignment j() {
        return this.i;
    }

    public String toString() {
        String str = this.b;
        CLCSStackContentJustification cLCSStackContentJustification = this.a;
        CLCSSpaceSize cLCSSpaceSize = this.e;
        c cVar = this.c;
        Boolean bool = this.f;
        CLCSItemAlignment cLCSItemAlignment = this.i;
        a aVar = this.j;
        List<e> list = this.d;
        return "VerticalStackFragment(__typename=" + str + ", contentJustification=" + cLCSStackContentJustification + ", contentSpacing=" + cLCSSpaceSize + ", contentSpacingSize=" + cVar + ", contentStretch=" + bool + ", itemAlignment=" + cLCSItemAlignment + ", style=" + aVar + ", children=" + list + ")";
    }

    public C0784Cl(String str, CLCSStackContentJustification cLCSStackContentJustification, CLCSSpaceSize cLCSSpaceSize, c cVar, Boolean bool, CLCSItemAlignment cLCSItemAlignment, a aVar, List<e> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        this.b = str;
        this.a = cLCSStackContentJustification;
        this.e = cLCSSpaceSize;
        this.c = cVar;
        this.f = bool;
        this.i = cLCSItemAlignment;
        this.j = aVar;
        this.d = list;
    }

    /* renamed from: o.Cl$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final C0747Bc b;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final C0747Bc d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.e;
            C0747Bc c0747Bc = this.b;
            return "ContentSpacingSize(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public c(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.e = str;
            this.b = c0747Bc;
        }
    }

    /* renamed from: o.Cl$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final AU b;
        private final String c;

        public final AU b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            AU au = this.b;
            return "Style(__typename=" + str + ", containerStyleFragment=" + au + ")";
        }

        public a(String str, AU au) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) au, "");
            this.c = str;
            this.b = au;
        }
    }

    /* renamed from: o.Cl$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final String a;
        private final String e;

        public final String b() {
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
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c((Object) this.e, (Object) eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            return "Child(__typename=" + str + ", key=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = str2;
        }
    }
}
