package o;

import com.netflix.clcs.codegen.type.CLCSToastPosition;

/* renamed from: o.Cd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0776Cd implements InterfaceC9037hy {
    private final CLCSToastPosition a;
    private final String b;
    private final d c;
    private final c d;
    private final String e;
    private final Integer f;
    private final a g;
    private final String j;

    public final a a() {
        return this.g;
    }

    public final String b() {
        return this.b;
    }

    public final c c() {
        return this.d;
    }

    public final CLCSToastPosition d() {
        return this.a;
    }

    public final d e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0776Cd) {
            C0776Cd c0776Cd = (C0776Cd) obj;
            return C8632dsu.c((Object) this.e, (Object) c0776Cd.e) && C8632dsu.c((Object) this.j, (Object) c0776Cd.j) && C8632dsu.c((Object) this.b, (Object) c0776Cd.b) && C8632dsu.c(this.g, c0776Cd.g) && this.a == c0776Cd.a && C8632dsu.c(this.f, c0776Cd.f) && C8632dsu.c(this.c, c0776Cd.c) && C8632dsu.c(this.d, c0776Cd.d);
        }
        return false;
    }

    public final String f() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        String str = this.j;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        a aVar = this.g;
        int hashCode4 = aVar == null ? 0 : aVar.hashCode();
        CLCSToastPosition cLCSToastPosition = this.a;
        int hashCode5 = cLCSToastPosition == null ? 0 : cLCSToastPosition.hashCode();
        Integer num = this.f;
        int hashCode6 = num == null ? 0 : num.hashCode();
        d dVar = this.c;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String i() {
        return this.e;
    }

    public final Integer j() {
        return this.f;
    }

    public String toString() {
        String str = this.e;
        String str2 = this.j;
        String str3 = this.b;
        a aVar = this.g;
        CLCSToastPosition cLCSToastPosition = this.a;
        Integer num = this.f;
        d dVar = this.c;
        c cVar = this.d;
        return "ToastFragment(__typename=" + str + ", trackingInfo=" + str2 + ", loggingViewName=" + str3 + ", style=" + aVar + ", position=" + cLCSToastPosition + ", timerMs=" + num + ", onTimerComplete=" + dVar + ", content=" + cVar + ")";
    }

    public C0776Cd(String str, String str2, String str3, a aVar, CLCSToastPosition cLCSToastPosition, Integer num, d dVar, c cVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cVar, "");
        this.e = str;
        this.j = str2;
        this.b = str3;
        this.g = aVar;
        this.a = cLCSToastPosition;
        this.f = num;
        this.c = dVar;
        this.d = cVar;
    }

    /* renamed from: o.Cd$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final AU b;
        private final String c;

        public final AU c() {
            return this.b;
        }

        public final String d() {
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

    /* renamed from: o.Cd$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final String a;
        private final C0753Bi e;

        public final C0753Bi b() {
            return this.e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            C0753Bi c0753Bi = this.e;
            return "OnTimerComplete(__typename=" + str + ", effectRecursion=" + c0753Bi + ")";
        }

        public d(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.a = str;
            this.e = c0753Bi;
        }
    }

    /* renamed from: o.Cd$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final String a;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c((Object) this.e, (Object) cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            return "Content(__typename=" + str + ", key=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = str2;
        }
    }
}
