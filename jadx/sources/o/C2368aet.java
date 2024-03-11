package o;

import j$.time.Instant;
import java.util.List;

/* renamed from: o.aet  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2368aet implements InterfaceC9037hy {
    private final String c;
    private final a d;

    public final String b() {
        return this.c;
    }

    public final a c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2368aet) {
            C2368aet c2368aet = (C2368aet) obj;
            return C8632dsu.c((Object) this.c, (Object) c2368aet.c) && C8632dsu.c(this.d, c2368aet.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        a aVar = this.d;
        return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        String str = this.c;
        a aVar = this.d;
        return "EpisodesInfo(__typename=" + str + ", onSeason=" + aVar + ")";
    }

    public C2368aet(String str, a aVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = aVar;
    }

    /* renamed from: o.aet$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final e c;
        private final int d;

        public final int a() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final e d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.d == aVar.d && C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.d);
            int hashCode2 = this.a.hashCode();
            e eVar = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            int i = this.d;
            String str = this.a;
            e eVar = this.c;
            return "OnSeason(videoId=" + i + ", __typename=" + str + ", episodes=" + eVar + ")";
        }

        public a(int i, String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.d = i;
            this.a = str;
            this.c = eVar;
        }
    }

    /* renamed from: o.aet$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final List<c> d;

        public final List<c> b() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            List<c> list = this.d;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.a;
            List<c> list = this.d;
            return "Episodes(__typename=" + str + ", edges=" + list + ")";
        }

        public e(String str, List<c> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = list;
        }
    }

    /* renamed from: o.aet$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final b b;
        private final String d;

        public final String a() {
            return this.a;
        }

        public final b b() {
            return this.b;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            b bVar = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.a;
            b bVar = this.b;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + bVar + ")";
        }

        public c(String str, String str2, b bVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = str2;
            this.b = bVar;
        }
    }

    /* renamed from: o.aet$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2364aep a;
        private final String b;
        private final C2574aie c;
        private final C2356aeh d;
        private final Instant e;

        public final C2364aep a() {
            return this.a;
        }

        public final C2574aie b() {
            return this.c;
        }

        public final Instant c() {
            return this.e;
        }

        public final String d() {
            return this.b;
        }

        public final C2356aeh e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Instant instant = this.e;
            return (((((((hashCode * 31) + (instant == null ? 0 : instant.hashCode())) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            Instant instant = this.e;
            C2356aeh c2356aeh = this.d;
            C2364aep c2364aep = this.a;
            C2574aie c2574aie = this.c;
            return "Node(__typename=" + str + ", availabilityStartTime=" + instant + ", episodeBasicInfo=" + c2356aeh + ", episodeListUIInfo=" + c2364aep + ", playerPrefetch=" + c2574aie + ")";
        }

        public b(String str, Instant instant, C2356aeh c2356aeh, C2364aep c2364aep, C2574aie c2574aie) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2356aeh, "");
            C8632dsu.c((Object) c2364aep, "");
            C8632dsu.c((Object) c2574aie, "");
            this.b = str;
            this.e = instant;
            this.d = c2356aeh;
            this.a = c2364aep;
            this.c = c2574aie;
        }
    }
}
