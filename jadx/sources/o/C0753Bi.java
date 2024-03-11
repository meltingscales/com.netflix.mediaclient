package o;

import java.util.List;

/* renamed from: o.Bi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0753Bi implements InterfaceC9037hy {
    private final d b;
    private final String c;
    private final C0752Bh d;

    public final C0752Bh a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final d e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0753Bi) {
            C0753Bi c0753Bi = (C0753Bi) obj;
            return C8632dsu.c((Object) this.c, (Object) c0753Bi.c) && C8632dsu.c(this.b, c0753Bi.b) && C8632dsu.c(this.d, c0753Bi.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        d dVar = this.b;
        return (((hashCode * 31) + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.c;
        d dVar = this.b;
        C0752Bh c0752Bh = this.d;
        return "EffectRecursion(__typename=" + str + ", onCLCSCompositeEffect=" + dVar + ", effectFields=" + c0752Bh + ")";
    }

    public C0753Bi(String str, d dVar, C0752Bh c0752Bh) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c0752Bh, "");
        this.c = str;
        this.b = dVar;
        this.d = c0752Bh;
    }

    /* renamed from: o.Bi$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final List<c> c;

        public final List<c> c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.c, ((d) obj).c);
        }

        public int hashCode() {
            List<c> list = this.c;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<c> list = this.c;
            return "OnCLCSCompositeEffect(effects=" + list + ")";
        }

        public d(List<c> list) {
            this.c = list;
        }
    }

    /* renamed from: o.Bi$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final C0752Bh a;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final C0752Bh d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0752Bh c0752Bh = this.a;
            return "Effect(__typename=" + str + ", effectFields=" + c0752Bh + ")";
        }

        public c(String str, C0752Bh c0752Bh) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0752Bh, "");
            this.d = str;
            this.a = c0752Bh;
        }
    }
}
