package o;

import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import java.util.List;

/* renamed from: o.adC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2272adC implements InterfaceC9037hy {
    private final String a;
    private final Integer b;
    private final String c;
    private final C2274adE d;
    private final List<String> e;
    private final C2628ajf f;
    private final b g;
    private final e h;
    private final C2514ahX i;
    private final List<PlaybackBadge> j;
    private final C2635ajm n;

    /* renamed from: o  reason: collision with root package name */
    private final C2630ajh f13463o;

    public final List<String> a() {
        return this.e;
    }

    public final C2274adE b() {
        return this.d;
    }

    public final Integer c() {
        return this.b;
    }

    public final b d() {
        return this.g;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2272adC) {
            C2272adC c2272adC = (C2272adC) obj;
            return C8632dsu.c((Object) this.c, (Object) c2272adC.c) && C8632dsu.c(this.b, c2272adC.b) && C8632dsu.c(this.e, c2272adC.e) && C8632dsu.c((Object) this.a, (Object) c2272adC.a) && C8632dsu.c(this.j, c2272adC.j) && C8632dsu.c(this.g, c2272adC.g) && C8632dsu.c(this.h, c2272adC.h) && C8632dsu.c(this.f13463o, c2272adC.f13463o) && C8632dsu.c(this.i, c2272adC.i) && C8632dsu.c(this.d, c2272adC.d) && C8632dsu.c(this.f, c2272adC.f) && C8632dsu.c(this.n, c2272adC.n);
        }
        return false;
    }

    public final C2628ajf f() {
        return this.f;
    }

    public final e g() {
        return this.h;
    }

    public final C2514ahX h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        List<String> list = this.e;
        int hashCode3 = list == null ? 0 : list.hashCode();
        String str = this.a;
        int hashCode4 = str == null ? 0 : str.hashCode();
        List<PlaybackBadge> list2 = this.j;
        int hashCode5 = list2 == null ? 0 : list2.hashCode();
        b bVar = this.g;
        int hashCode6 = bVar == null ? 0 : bVar.hashCode();
        e eVar = this.h;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f13463o.hashCode()) * 31) + this.i.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.n.hashCode();
    }

    public final List<PlaybackBadge> i() {
        return this.j;
    }

    public final C2630ajh j() {
        return this.f13463o;
    }

    public final C2635ajm l() {
        return this.n;
    }

    public final String o() {
        return this.c;
    }

    public String toString() {
        String str = this.c;
        Integer num = this.b;
        List<String> list = this.e;
        String str2 = this.a;
        List<PlaybackBadge> list2 = this.j;
        b bVar = this.g;
        e eVar = this.h;
        C2630ajh c2630ajh = this.f13463o;
        C2514ahX c2514ahX = this.i;
        C2274adE c2274adE = this.d;
        C2628ajf c2628ajf = this.f;
        C2635ajm c2635ajm = this.n;
        return "CollectTasteVideoData(__typename=" + str + ", latestYear=" + num + ", badges=" + list + ", artworkForegroundColor=" + str2 + ", playbackBadges=" + list2 + ", onEpisode=" + bVar + ", onShow=" + eVar + ", videoSummary=" + c2630ajh + ", playable=" + c2514ahX + ", collectTasteVideoBoxArt=" + c2274adE + ", videoCertificationRating=" + c2628ajf + ", videoTags=" + c2635ajm + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2272adC(String str, Integer num, List<String> list, String str2, List<? extends PlaybackBadge> list2, b bVar, e eVar, C2630ajh c2630ajh, C2514ahX c2514ahX, C2274adE c2274adE, C2628ajf c2628ajf, C2635ajm c2635ajm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2630ajh, "");
        C8632dsu.c((Object) c2514ahX, "");
        C8632dsu.c((Object) c2274adE, "");
        C8632dsu.c((Object) c2628ajf, "");
        C8632dsu.c((Object) c2635ajm, "");
        this.c = str;
        this.b = num;
        this.e = list;
        this.a = str2;
        this.j = list2;
        this.g = bVar;
        this.h = eVar;
        this.f13463o = c2630ajh;
        this.i = c2514ahX;
        this.d = c2274adE;
        this.f = c2628ajf;
        this.n = c2635ajm;
    }

    /* renamed from: o.adC$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final c c;

        public final c e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.c, ((b) obj).c);
        }

        public int hashCode() {
            c cVar = this.c;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            c cVar = this.c;
            return "OnEpisode(parentShow=" + cVar + ")";
        }

        public b(c cVar) {
            this.c = cVar;
        }
    }

    /* renamed from: o.adC$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String b;
        private final int d;

        public final int a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && this.d == eVar.d && C8632dsu.c((Object) this.a, (Object) eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Integer.hashCode(this.d);
            String str = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.b;
            int i = this.d;
            String str2 = this.a;
            return "OnShow(__typename=" + str + ", videoId=" + i + ", numSeasonsLabel=" + str2 + ")";
        }

        public e(String str, int i, String str2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = i;
            this.a = str2;
        }
    }

    /* renamed from: o.adC$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final int c;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final int b() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && this.c == cVar.c && C8632dsu.c((Object) this.e, (Object) cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.c);
            String str = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.d;
            int i = this.c;
            String str2 = this.e;
            return "ParentShow(__typename=" + str + ", videoId=" + i + ", artworkForegroundColor=" + str2 + ")";
        }

        public c(String str, int i, String str2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = i;
            this.e = str2;
        }
    }
}
