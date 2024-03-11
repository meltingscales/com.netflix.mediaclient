package o;

import java.util.List;

/* renamed from: o.afk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2412afk implements InterfaceC9037hy {
    private final String c;
    private final c d;
    private final b e;

    public final String c() {
        return this.c;
    }

    public final b d() {
        return this.e;
    }

    public final c e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2412afk) {
            C2412afk c2412afk = (C2412afk) obj;
            return C8632dsu.c((Object) this.c, (Object) c2412afk.c) && C8632dsu.c(this.d, c2412afk.d) && C8632dsu.c(this.e, c2412afk.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        c cVar = this.d;
        int hashCode2 = cVar == null ? 0 : cVar.hashCode();
        b bVar = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        c cVar = this.d;
        b bVar = this.e;
        return "InteractiveVideo(__typename=" + str + ", interactiveVideoData=" + cVar + ", onViewable=" + bVar + ")";
    }

    public C2412afk(String str, c cVar, b bVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = cVar;
        this.e = bVar;
    }

    /* renamed from: o.afk$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final e c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final e d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            e eVar = this.c;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            e eVar = this.c;
            return "InteractiveVideoData(__typename=" + str + ", interactiveSummaryFeatures=" + eVar + ")";
        }

        public c(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = eVar;
        }
    }

    /* renamed from: o.afk$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final d a;

        public final d d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.a;
            return "OnViewable(bookmark=" + dVar + ")";
        }

        public b(d dVar) {
            this.a = dVar;
        }
    }

    /* renamed from: o.afk$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final Boolean a;
        private final Boolean b;
        private final Double c;
        private final String d;
        private final Boolean e;
        private final Boolean f;
        private final Boolean g;
        private final Boolean h;
        private final Boolean i;
        private final Boolean j;
        private final Boolean k;
        private final Boolean l;
        private final Boolean m;
        private final String n;

        /* renamed from: o  reason: collision with root package name */
        private final Boolean f13467o;
        private final Boolean p;
        private final Boolean q;
        private final Boolean r;
        private final List<String> s;

        public final Double a() {
            return this.c;
        }

        public final Boolean b() {
            return this.b;
        }

        public final Boolean c() {
            return this.g;
        }

        public final Boolean d() {
            return this.a;
        }

        public final Boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.p, eVar.p) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.q, eVar.q) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.m, eVar.m) && C8632dsu.c(this.r, eVar.r) && C8632dsu.c(this.l, eVar.l) && C8632dsu.c(this.g, eVar.g) && C8632dsu.c(this.f, eVar.f) && C8632dsu.c(this.j, eVar.j) && C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.h, eVar.h) && C8632dsu.c((Object) this.n, (Object) eVar.n) && C8632dsu.c(this.s, eVar.s) && C8632dsu.c(this.f13467o, eVar.f13467o) && C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.i, eVar.i) && C8632dsu.c(this.k, eVar.k);
            }
            return false;
        }

        public final Boolean f() {
            return this.f;
        }

        public final Boolean g() {
            return this.h;
        }

        public final Boolean h() {
            return this.j;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Boolean bool = this.p;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.a;
            int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.q;
            int hashCode4 = bool3 == null ? 0 : bool3.hashCode();
            Boolean bool4 = this.b;
            int hashCode5 = bool4 == null ? 0 : bool4.hashCode();
            Boolean bool5 = this.m;
            int hashCode6 = bool5 == null ? 0 : bool5.hashCode();
            Boolean bool6 = this.r;
            int hashCode7 = bool6 == null ? 0 : bool6.hashCode();
            Boolean bool7 = this.l;
            int hashCode8 = bool7 == null ? 0 : bool7.hashCode();
            Boolean bool8 = this.g;
            int hashCode9 = bool8 == null ? 0 : bool8.hashCode();
            Boolean bool9 = this.f;
            int hashCode10 = bool9 == null ? 0 : bool9.hashCode();
            Boolean bool10 = this.j;
            int hashCode11 = bool10 == null ? 0 : bool10.hashCode();
            Boolean bool11 = this.e;
            int hashCode12 = bool11 == null ? 0 : bool11.hashCode();
            Boolean bool12 = this.h;
            int hashCode13 = bool12 == null ? 0 : bool12.hashCode();
            String str = this.n;
            int hashCode14 = str == null ? 0 : str.hashCode();
            List<String> list = this.s;
            int hashCode15 = list == null ? 0 : list.hashCode();
            Boolean bool13 = this.f13467o;
            int hashCode16 = bool13 == null ? 0 : bool13.hashCode();
            Double d = this.c;
            int hashCode17 = d == null ? 0 : d.hashCode();
            Boolean bool14 = this.i;
            int hashCode18 = bool14 == null ? 0 : bool14.hashCode();
            Boolean bool15 = this.k;
            return (((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + (bool15 == null ? 0 : bool15.hashCode());
        }

        public final String i() {
            return this.n;
        }

        public final Boolean j() {
            return this.i;
        }

        public final Boolean k() {
            return this.f13467o;
        }

        public final Boolean l() {
            return this.k;
        }

        public final Boolean m() {
            return this.m;
        }

        public final Boolean n() {
            return this.l;
        }

        public final Boolean o() {
            return this.p;
        }

        public final Boolean p() {
            return this.r;
        }

        public final String r() {
            return this.d;
        }

        public final Boolean s() {
            return this.q;
        }

        public final List<String> t() {
            return this.s;
        }

        public String toString() {
            String str = this.d;
            Boolean bool = this.p;
            Boolean bool2 = this.a;
            Boolean bool3 = this.q;
            Boolean bool4 = this.b;
            Boolean bool5 = this.m;
            Boolean bool6 = this.r;
            Boolean bool7 = this.l;
            Boolean bool8 = this.g;
            Boolean bool9 = this.f;
            Boolean bool10 = this.j;
            Boolean bool11 = this.e;
            Boolean bool12 = this.h;
            String str2 = this.n;
            List<String> list = this.s;
            Boolean bool13 = this.f13467o;
            Double d = this.c;
            Boolean bool14 = this.i;
            Boolean bool15 = this.k;
            return "InteractiveSummaryFeatures(__typename=" + str + ", prePlay=" + bool + ", fallbackTutorial=" + bool2 + ", videoMoments=" + bool3 + ", customBookmark=" + bool4 + ", playbackGraph=" + bool5 + ", resetUserState=" + bool6 + ", playerControlsSnapshots=" + bool7 + ", hideDetailedDurations=" + bool8 + ", interactiveAppUpdateDialogue=" + bool9 + ", interactiveTrailer=" + bool10 + ", choicePointDebugMenu=" + bool11 + ", ipp=" + bool12 + ", mainfeatureIdentifier=" + str2 + ", supportedErrorDialogs=" + list + ", pollingToggle=" + bool13 + ", bookmarkOverrideSeconds=" + d + ", hideSubtitlesMenuDuringPlayback=" + bool14 + ", playerControlsPersistPlayPause=" + bool15 + ")";
        }

        public e(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, String str2, List<String> list, Boolean bool13, Double d, Boolean bool14, Boolean bool15) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.p = bool;
            this.a = bool2;
            this.q = bool3;
            this.b = bool4;
            this.m = bool5;
            this.r = bool6;
            this.l = bool7;
            this.g = bool8;
            this.f = bool9;
            this.j = bool10;
            this.e = bool11;
            this.h = bool12;
            this.n = str2;
            this.s = list;
            this.f13467o = bool13;
            this.c = d;
            this.i = bool14;
            this.k = bool15;
        }
    }

    /* renamed from: o.afk$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final Integer c;

        public final Integer b() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            Integer num = this.c;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.a;
            Integer num = this.c;
            return "Bookmark(__typename=" + str + ", interactivePlaybackProgressPercentage=" + num + ")";
        }

        public d(String str, Integer num) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = num;
        }
    }
}
