package o;

import com.netflix.clcs.codegen.type.CLCSItemAlignment;
import com.netflix.clcs.codegen.type.CLCSSpaceSize;
import com.netflix.clcs.codegen.type.CLCSStackContentJustification;
import java.util.List;

/* renamed from: o.Bo  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0759Bo implements InterfaceC9037hy {
    private final CLCSSpaceSize a;
    private final String b;
    private final CLCSStackContentJustification c;
    private final d d;
    private final List<b> e;
    private final Boolean f;
    private final CLCSItemAlignment g;
    private final e i;

    public final CLCSSpaceSize a() {
        return this.a;
    }

    public final List<b> b() {
        return this.e;
    }

    public final Boolean c() {
        return this.f;
    }

    public final d d() {
        return this.d;
    }

    public final CLCSStackContentJustification e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0759Bo) {
            C0759Bo c0759Bo = (C0759Bo) obj;
            return C8632dsu.c((Object) this.b, (Object) c0759Bo.b) && this.c == c0759Bo.c && this.a == c0759Bo.a && C8632dsu.c(this.d, c0759Bo.d) && C8632dsu.c(this.f, c0759Bo.f) && this.g == c0759Bo.g && C8632dsu.c(this.i, c0759Bo.i) && C8632dsu.c(this.e, c0759Bo.e);
        }
        return false;
    }

    public final CLCSItemAlignment h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        CLCSStackContentJustification cLCSStackContentJustification = this.c;
        int hashCode2 = cLCSStackContentJustification == null ? 0 : cLCSStackContentJustification.hashCode();
        CLCSSpaceSize cLCSSpaceSize = this.a;
        int hashCode3 = cLCSSpaceSize == null ? 0 : cLCSSpaceSize.hashCode();
        d dVar = this.d;
        int hashCode4 = dVar == null ? 0 : dVar.hashCode();
        Boolean bool = this.f;
        int hashCode5 = bool == null ? 0 : bool.hashCode();
        CLCSItemAlignment cLCSItemAlignment = this.g;
        int hashCode6 = cLCSItemAlignment == null ? 0 : cLCSItemAlignment.hashCode();
        e eVar = this.i;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final e i() {
        return this.i;
    }

    public final String j() {
        return this.b;
    }

    public String toString() {
        String str = this.b;
        CLCSStackContentJustification cLCSStackContentJustification = this.c;
        CLCSSpaceSize cLCSSpaceSize = this.a;
        d dVar = this.d;
        Boolean bool = this.f;
        CLCSItemAlignment cLCSItemAlignment = this.g;
        e eVar = this.i;
        List<b> list = this.e;
        return "HorizontalStackFragment(__typename=" + str + ", contentJustification=" + cLCSStackContentJustification + ", contentSpacing=" + cLCSSpaceSize + ", contentSpacingSize=" + dVar + ", contentStretch=" + bool + ", itemAlignment=" + cLCSItemAlignment + ", style=" + eVar + ", children=" + list + ")";
    }

    public C0759Bo(String str, CLCSStackContentJustification cLCSStackContentJustification, CLCSSpaceSize cLCSSpaceSize, d dVar, Boolean bool, CLCSItemAlignment cLCSItemAlignment, e eVar, List<b> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        this.b = str;
        this.c = cLCSStackContentJustification;
        this.a = cLCSSpaceSize;
        this.d = dVar;
        this.f = bool;
        this.g = cLCSItemAlignment;
        this.i = eVar;
        this.e = list;
    }

    /* renamed from: o.Bo$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final C0747Bc b;
        private final String e;

        public final C0747Bc a() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.b, dVar.b);
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

        public d(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.e = str;
            this.b = c0747Bc;
        }
    }

    /* renamed from: o.Bo$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final AU a;
        private final String e;

        public final String d() {
            return this.e;
        }

        public final AU e() {
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
            AU au = this.a;
            return "Style(__typename=" + str + ", containerStyleFragment=" + au + ")";
        }

        public e(String str, AU au) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) au, "");
            this.e = str;
            this.a = au;
        }
    }

    /* renamed from: o.Bo$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final String a;
        private final String d;

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.d, (Object) bVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            return "Child(__typename=" + str + ", key=" + str2 + ")";
        }

        public b(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.d = str2;
        }
    }
}
