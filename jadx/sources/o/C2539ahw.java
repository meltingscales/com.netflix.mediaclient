package o;

import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import java.util.List;

/* renamed from: o.ahw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2539ahw implements InterfaceC9037hy {
    private final a a;
    private final d b;
    private final List<Integer> c;
    private final String d;
    private final h e;
    private final List<PlaybackBadge> g;

    public final d a() {
        return this.b;
    }

    public final h b() {
        return this.e;
    }

    public final List<PlaybackBadge> c() {
        return this.g;
    }

    public final a d() {
        return this.a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2539ahw) {
            C2539ahw c2539ahw = (C2539ahw) obj;
            return C8632dsu.c((Object) this.d, (Object) c2539ahw.d) && C8632dsu.c(this.c, c2539ahw.c) && C8632dsu.c(this.g, c2539ahw.g) && C8632dsu.c(this.e, c2539ahw.e) && C8632dsu.c(this.b, c2539ahw.b) && C8632dsu.c(this.a, c2539ahw.a);
        }
        return false;
    }

    public final List<Integer> h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        List<Integer> list = this.c;
        int hashCode2 = list == null ? 0 : list.hashCode();
        List<PlaybackBadge> list2 = this.g;
        int hashCode3 = list2 == null ? 0 : list2.hashCode();
        h hVar = this.e;
        int hashCode4 = hVar == null ? 0 : hVar.hashCode();
        d dVar = this.b;
        int hashCode5 = dVar == null ? 0 : dVar.hashCode();
        a aVar = this.a;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        List<Integer> list = this.c;
        List<PlaybackBadge> list2 = this.g;
        h hVar = this.e;
        d dVar = this.b;
        a aVar = this.a;
        return "OfflinePlayable(__typename=" + str + ", isInTurboCollections=" + list + ", playbackBadges=" + list2 + ", onShow=" + hVar + ", onEpisode=" + dVar + ", onMovie=" + aVar + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2539ahw(String str, List<Integer> list, List<? extends PlaybackBadge> list2, h hVar, d dVar, a aVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.c = list;
        this.g = list2;
        this.e = hVar;
        this.b = dVar;
        this.a = aVar;
    }

    /* renamed from: o.ahw$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final int b;
        private final c c;

        public final int b() {
            return this.b;
        }

        public final c d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.b == hVar.b && C8632dsu.c(this.c, hVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.b);
            c cVar = this.c;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            int i = this.b;
            c cVar = this.c;
            return "OnShow(videoId=" + i + ", currentEpisode=" + cVar + ")";
        }

        public h(int i, c cVar) {
            this.b = i;
            this.c = cVar;
        }
    }

    /* renamed from: o.ahw$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final b a;
        private final Integer b;
        private final i c;
        private final Integer d;
        private final C2363aeo e;
        private final C2572aic i;

        public final Integer a() {
            return this.d;
        }

        public final Integer b() {
            return this.b;
        }

        public final i c() {
            return this.c;
        }

        public final C2363aeo d() {
            return this.e;
        }

        public final b e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.i, dVar.i) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.b;
            int hashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.d;
            int hashCode2 = num2 == null ? 0 : num2.hashCode();
            b bVar = this.a;
            int hashCode3 = bVar == null ? 0 : bVar.hashCode();
            i iVar = this.c;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.i.hashCode()) * 31) + this.e.hashCode();
        }

        public final C2572aic j() {
            return this.i;
        }

        public String toString() {
            Integer num = this.b;
            Integer num2 = this.d;
            b bVar = this.a;
            i iVar = this.c;
            C2572aic c2572aic = this.i;
            C2363aeo c2363aeo = this.e;
            return "OnEpisode(logicalEndOffsetSec=" + num + ", logicalStartOffsetSec=" + num2 + ", nextEpisode=" + bVar + ", parentSeason=" + iVar + ", playerEpisodeDetails=" + c2572aic + ", episodeInfo=" + c2363aeo + ")";
        }

        public d(Integer num, Integer num2, b bVar, i iVar, C2572aic c2572aic, C2363aeo c2363aeo) {
            C8632dsu.c((Object) c2572aic, "");
            C8632dsu.c((Object) c2363aeo, "");
            this.b = num;
            this.d = num2;
            this.a = bVar;
            this.c = iVar;
            this.i = c2572aic;
            this.e = c2363aeo;
        }
    }

    /* renamed from: o.ahw$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final Integer a;
        private final Integer e;

        public final Integer b() {
            return this.e;
        }

        public final Integer c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.a, aVar.a) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.a;
            int hashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.e;
            return (hashCode * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.a;
            Integer num2 = this.e;
            return "OnMovie(logicalEndOffsetSec=" + num + ", logicalStartOffsetSec=" + num2 + ")";
        }

        public a(Integer num, Integer num2) {
            this.a = num;
            this.e = num2;
        }
    }

    /* renamed from: o.ahw$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final Integer a;
        private final Integer b;
        private final String c;
        private final e d;
        private final C2363aeo e;
        private final C2572aic f;
        private final int h;

        public final Integer a() {
            return this.a;
        }

        public final e b() {
            return this.d;
        }

        public final C2363aeo c() {
            return this.e;
        }

        public final C2572aic d() {
            return this.f;
        }

        public final Integer e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && this.h == cVar.h && C8632dsu.c(this.d, cVar.d) && C8632dsu.c(this.b, cVar.b) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c(this.f, cVar.f) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public final String f() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Integer.hashCode(this.h);
            e eVar = this.d;
            int hashCode3 = eVar == null ? 0 : eVar.hashCode();
            Integer num = this.b;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.a;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.e.hashCode();
        }

        public final int i() {
            return this.h;
        }

        public String toString() {
            String str = this.c;
            int i = this.h;
            e eVar = this.d;
            Integer num = this.b;
            Integer num2 = this.a;
            C2572aic c2572aic = this.f;
            C2363aeo c2363aeo = this.e;
            return "CurrentEpisode(__typename=" + str + ", videoId=" + i + ", nextEpisode=" + eVar + ", logicalEndOffsetSec=" + num + ", logicalStartOffsetSec=" + num2 + ", playerEpisodeDetails=" + c2572aic + ", episodeInfo=" + c2363aeo + ")";
        }

        public c(String str, int i, e eVar, Integer num, Integer num2, C2572aic c2572aic, C2363aeo c2363aeo) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2572aic, "");
            C8632dsu.c((Object) c2363aeo, "");
            this.c = str;
            this.h = i;
            this.d = eVar;
            this.b = num;
            this.a = num2;
            this.f = c2572aic;
            this.e = c2363aeo;
        }
    }

    /* renamed from: o.ahw$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final Boolean d;
        private final int e;

        public final int a() {
            return this.e;
        }

        public final Boolean b() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && this.e == eVar.e && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Integer.hashCode(this.e);
            Boolean bool = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.b;
            int i = this.e;
            Boolean bool = this.d;
            return "NextEpisode(__typename=" + str + ", videoId=" + i + ", isPlayable=" + bool + ")";
        }

        public e(String str, int i, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = i;
            this.d = bool;
        }
    }

    /* renamed from: o.ahw$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final Boolean a;
        private final String b;
        private final int e;

        public final int b() {
            return this.e;
        }

        public final Boolean c() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && this.e == bVar.e && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Integer.hashCode(this.e);
            Boolean bool = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.b;
            int i = this.e;
            Boolean bool = this.a;
            return "NextEpisode1(__typename=" + str + ", videoId=" + i + ", isPlayable=" + bool + ")";
        }

        public b(String str, int i, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = i;
            this.a = bool;
        }
    }

    /* renamed from: o.ahw$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final Integer e;
        private final int f;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final int c() {
            return this.f;
        }

        public final Integer d() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.c, (Object) iVar.c) && this.f == iVar.f && C8632dsu.c((Object) this.b, (Object) iVar.b) && C8632dsu.c((Object) this.d, (Object) iVar.d) && C8632dsu.c((Object) this.a, (Object) iVar.a) && C8632dsu.c(this.e, iVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Integer.hashCode(this.f);
            String str = this.b;
            int hashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.a;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            Integer num = this.e;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (num != null ? num.hashCode() : 0);
        }

        public final String i() {
            return this.c;
        }

        public String toString() {
            String str = this.c;
            int i = this.f;
            String str2 = this.b;
            String str3 = this.d;
            String str4 = this.a;
            Integer num = this.e;
            return "ParentSeason(__typename=" + str + ", videoId=" + i + ", longNumberLabel=" + str2 + ", numberLabelV2=" + str3 + ", title=" + str4 + ", number=" + num + ")";
        }

        public i(String str, int i, String str2, String str3, String str4, Integer num) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.f = i;
            this.b = str2;
            this.d = str3;
            this.a = str4;
            this.e = num;
        }
    }
}
