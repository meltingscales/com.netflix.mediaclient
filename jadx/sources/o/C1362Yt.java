package o;

import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import com.netflix.mediaclient.graphql.models.type.TitleGroupMemberKind;
import com.netflix.mediaclient.graphql.models.type.WatchStatus;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2114aaJ;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1362Yt implements InterfaceC8999hM<C1368g> {
    public static final C1369i c = new C1369i(null);
    private final List<Integer> a;
    private final String b;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int i;
    private final int j;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "1146ec7e-cd28-4e83-9ca1-5f65ccb48162";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1362Yt) {
            C1362Yt c1362Yt = (C1362Yt) obj;
            return C8632dsu.c(this.a, c1362Yt.a) && C8632dsu.c((Object) this.b, (Object) c1362Yt.b) && this.i == c1362Yt.i && this.f == c1362Yt.f && this.j == c1362Yt.j && this.g == c1362Yt.g && this.e == c1362Yt.e;
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "FullDpVideoDetails";
    }

    public final int g() {
        return this.e;
    }

    public final List<Integer> h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.i)) * 31) + Integer.hashCode(this.f)) * 31) + Integer.hashCode(this.j)) * 31) + Integer.hashCode(this.g)) * 31) + Integer.hashCode(this.e);
    }

    public final int i() {
        return this.j;
    }

    public final String j() {
        return this.b;
    }

    public final int k() {
        return this.f;
    }

    public final int l() {
        return this.i;
    }

    public final int n() {
        return this.g;
    }

    public String toString() {
        List<Integer> list = this.a;
        String str = this.b;
        int i = this.i;
        int i2 = this.f;
        int i3 = this.j;
        int i4 = this.g;
        int i5 = this.e;
        return "FullDpVideoDetailsQuery(videoIds=" + list + ", videoId=" + str + ", widthForStoryArt=" + i + ", widthForEpisode=" + i2 + ", widthForBoxshot=" + i3 + ", widthForTrailer=" + i4 + ", heightForBrandAndGenreBadge=" + i5 + ")";
    }

    public C1362Yt(List<Integer> list, String str, int i, int i2, int i3, int i4, int i5) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        this.a = list;
        this.b = str;
        this.i = i;
        this.f = i2;
        this.j = i3;
        this.g = i4;
        this.e = i5;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z2) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2122aaL.c.c(interfaceC9069id, this, c9028hp, z2);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<C1368g> e() {
        return C8953gT.c(C2114aaJ.C2120h.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2837anc.c.d()).d();
    }

    /* renamed from: o.Yt$g  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C1368g implements InterfaceC8999hM.c {
        private final n a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final List<G> h;

        public final int a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.d;
        }

        public final n d() {
            return this.a;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1368g) {
                C1368g c1368g = (C1368g) obj;
                return C8632dsu.c(this.h, c1368g.h) && C8632dsu.c(this.a, c1368g.a) && this.e == c1368g.e && this.c == c1368g.c && this.b == c1368g.b && this.d == c1368g.d && this.f == c1368g.f;
            }
            return false;
        }

        public int hashCode() {
            List<G> list = this.h;
            int hashCode = list == null ? 0 : list.hashCode();
            n nVar = this.a;
            return (((((((((((hashCode * 31) + (nVar != null ? nVar.hashCode() : 0)) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f);
        }

        public final int i() {
            return this.f;
        }

        public final List<G> j() {
            return this.h;
        }

        public String toString() {
            List<G> list = this.h;
            n nVar = this.a;
            int i = this.e;
            int i2 = this.c;
            int i3 = this.b;
            int i4 = this.d;
            int i5 = this.f;
            return "Data(videos=" + list + ", gatewayRequestDetails=" + nVar + ", trackIdSdpSource=" + i + ", trackIdMdpSource=" + i2 + ", trackIdSdp=" + i3 + ", trackIdMdp=" + i4 + ", trackIdTrailers=" + i5 + ")";
        }

        public C1368g(List<G> list, n nVar, int i, int i2, int i3, int i4, int i5) {
            this.h = list;
            this.a = nVar;
            this.e = i;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.f = i5;
        }
    }

    /* renamed from: o.Yt$G */
    /* loaded from: classes3.dex */
    public static final class G {
        private final String A;
        private final List<I> B;
        private final z C;
        private final C2560aiQ D;
        private final int G;
        private final WatchStatus H;
        private final String I;
        private final C1366d a;
        private final C2278adI b;
        private final e c;
        private final C1363a d;
        private final String e;
        private final h f;
        private final Boolean g;
        private final j h;
        private final C2282adM i;
        private final C2287adR j;
        private final C2412afk k;
        private final Boolean l;
        private final Boolean m;
        private final Boolean n;

        /* renamed from: o  reason: collision with root package name */
        private final Boolean f13415o;
        private final Boolean p;
        private final v q;
        private final List<Integer> r;
        private final Integer s;
        private final Boolean t;
        private final x u;
        private final A v;
        private final y w;
        private final List<PlaybackBadge> x;
        private final List<D> y;
        private final ThumbRating z;

        public final String A() {
            return this.e;
        }

        public final Boolean B() {
            return this.n;
        }

        public final Boolean C() {
            return this.f13415o;
        }

        public final Boolean D() {
            return this.l;
        }

        public final List<Integer> E() {
            return this.r;
        }

        public final Boolean F() {
            return this.p;
        }

        public final Boolean G() {
            return this.t;
        }

        public final C2278adI a() {
            return this.b;
        }

        public final C1363a b() {
            return this.d;
        }

        public final C2282adM c() {
            return this.i;
        }

        public final e d() {
            return this.c;
        }

        public final C1366d e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof G) {
                G g = (G) obj;
                return C8632dsu.c((Object) this.e, (Object) g.e) && C8632dsu.c((Object) this.A, (Object) g.A) && this.G == g.G && C8632dsu.c((Object) this.I, (Object) g.I) && C8632dsu.c(this.s, g.s) && C8632dsu.c(this.l, g.l) && C8632dsu.c(this.g, g.g) && C8632dsu.c(this.v, g.v) && C8632dsu.c(this.a, g.a) && C8632dsu.c(this.c, g.c) && C8632dsu.c(this.x, g.x) && C8632dsu.c(this.t, g.t) && C8632dsu.c(this.n, g.n) && this.H == g.H && C8632dsu.c(this.d, g.d) && C8632dsu.c(this.f, g.f) && C8632dsu.c(this.h, g.h) && C8632dsu.c(this.m, g.m) && C8632dsu.c(this.p, g.p) && this.z == g.z && C8632dsu.c(this.f13415o, g.f13415o) && C8632dsu.c(this.r, g.r) && C8632dsu.c(this.y, g.y) && C8632dsu.c(this.B, g.B) && C8632dsu.c(this.C, g.C) && C8632dsu.c(this.u, g.u) && C8632dsu.c(this.w, g.w) && C8632dsu.c(this.q, g.q) && C8632dsu.c(this.b, g.b) && C8632dsu.c(this.j, g.j) && C8632dsu.c(this.k, g.k) && C8632dsu.c(this.D, g.D) && C8632dsu.c(this.i, g.i);
            }
            return false;
        }

        public final C2412afk f() {
            return this.k;
        }

        public final j g() {
            return this.h;
        }

        public final Boolean h() {
            return this.g;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.A;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = Integer.hashCode(this.G);
            int hashCode4 = this.I.hashCode();
            Integer num = this.s;
            int hashCode5 = num == null ? 0 : num.hashCode();
            Boolean bool = this.l;
            int hashCode6 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.g;
            int hashCode7 = bool2 == null ? 0 : bool2.hashCode();
            A a = this.v;
            int hashCode8 = a == null ? 0 : a.hashCode();
            C1366d c1366d = this.a;
            int hashCode9 = c1366d == null ? 0 : c1366d.hashCode();
            e eVar = this.c;
            int hashCode10 = eVar == null ? 0 : eVar.hashCode();
            List<PlaybackBadge> list = this.x;
            int hashCode11 = list == null ? 0 : list.hashCode();
            Boolean bool3 = this.t;
            int hashCode12 = bool3 == null ? 0 : bool3.hashCode();
            Boolean bool4 = this.n;
            int hashCode13 = bool4 == null ? 0 : bool4.hashCode();
            WatchStatus watchStatus = this.H;
            int hashCode14 = watchStatus == null ? 0 : watchStatus.hashCode();
            C1363a c1363a = this.d;
            int hashCode15 = c1363a == null ? 0 : c1363a.hashCode();
            h hVar = this.f;
            int hashCode16 = hVar == null ? 0 : hVar.hashCode();
            j jVar = this.h;
            int hashCode17 = jVar == null ? 0 : jVar.hashCode();
            Boolean bool5 = this.m;
            int hashCode18 = bool5 == null ? 0 : bool5.hashCode();
            Boolean bool6 = this.p;
            int hashCode19 = bool6 == null ? 0 : bool6.hashCode();
            ThumbRating thumbRating = this.z;
            int hashCode20 = thumbRating == null ? 0 : thumbRating.hashCode();
            Boolean bool7 = this.f13415o;
            int hashCode21 = bool7 == null ? 0 : bool7.hashCode();
            List<Integer> list2 = this.r;
            int hashCode22 = list2 == null ? 0 : list2.hashCode();
            List<D> list3 = this.y;
            int hashCode23 = list3 == null ? 0 : list3.hashCode();
            List<I> list4 = this.B;
            int hashCode24 = list4 == null ? 0 : list4.hashCode();
            z zVar = this.C;
            int hashCode25 = zVar == null ? 0 : zVar.hashCode();
            x xVar = this.u;
            int hashCode26 = xVar == null ? 0 : xVar.hashCode();
            y yVar = this.w;
            int hashCode27 = yVar == null ? 0 : yVar.hashCode();
            v vVar = this.q;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + hashCode26) * 31) + hashCode27) * 31) + (vVar == null ? 0 : vVar.hashCode())) * 31) + this.b.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.D.hashCode()) * 31) + this.i.hashCode();
        }

        public final h i() {
            return this.f;
        }

        public final C2287adR j() {
            return this.j;
        }

        public final x k() {
            return this.u;
        }

        public final y l() {
            return this.w;
        }

        public final Integer m() {
            return this.s;
        }

        public final v n() {
            return this.q;
        }

        public final List<PlaybackBadge> o() {
            return this.x;
        }

        public final C2560aiQ p() {
            return this.D;
        }

        public final A q() {
            return this.v;
        }

        public final List<D> r() {
            return this.y;
        }

        public final ThumbRating s() {
            return this.z;
        }

        public final z t() {
            return this.C;
        }

        public String toString() {
            String str = this.e;
            String str2 = this.A;
            int i = this.G;
            String str3 = this.I;
            Integer num = this.s;
            Boolean bool = this.l;
            Boolean bool2 = this.g;
            A a = this.v;
            C1366d c1366d = this.a;
            e eVar = this.c;
            List<PlaybackBadge> list = this.x;
            Boolean bool3 = this.t;
            Boolean bool4 = this.n;
            WatchStatus watchStatus = this.H;
            C1363a c1363a = this.d;
            h hVar = this.f;
            j jVar = this.h;
            Boolean bool5 = this.m;
            Boolean bool6 = this.p;
            ThumbRating thumbRating = this.z;
            Boolean bool7 = this.f13415o;
            List<Integer> list2 = this.r;
            List<D> list3 = this.y;
            List<I> list4 = this.B;
            z zVar = this.C;
            x xVar = this.u;
            y yVar = this.w;
            v vVar = this.q;
            C2278adI c2278adI = this.b;
            C2287adR c2287adR = this.j;
            C2412afk c2412afk = this.k;
            C2560aiQ c2560aiQ = this.D;
            C2282adM c2282adM = this.i;
            return "Video(__typename=" + str + ", title=" + str2 + ", videoId=" + i + ", unifiedEntityId=" + str3 + ", latestYear=" + num + ", isAvailable=" + bool + ", hasOriginalTreatment=" + bool2 + ", storyArt=" + a + ", brandAndGenreBadge=" + c1366d + ", boxshot=" + eVar + ", playbackBadges=" + list + ", isPlayable=" + bool3 + ", isAvailableForDownload=" + bool4 + ", watchStatus=" + watchStatus + ", actors=" + c1363a + ", creators=" + hVar + ", directors=" + jVar + ", isInPlaylist=" + bool5 + ", isInRemindMeList=" + bool6 + ", thumbRatingV2=" + thumbRating + ", isEpisodeNumberHidden=" + bool7 + ", isInTurboCollections=" + list2 + ", similarVideos=" + list3 + ", titleGroupMemberships=" + list4 + ", supplementalVideosList=" + zVar + ", promoVideo=" + xVar + ", onShow=" + yVar + ", onMovie=" + vVar + ", contentAdvisory=" + c2278adI + ", detailsContextualSynopsis=" + c2287adR + ", interactiveVideo=" + c2412afk + ", taglineMessages=" + c2560aiQ + ", contentWarning=" + c2282adM + ")";
        }

        public final String u() {
            return this.A;
        }

        public final int v() {
            return this.G;
        }

        public final String w() {
            return this.I;
        }

        public final List<I> x() {
            return this.B;
        }

        public final WatchStatus y() {
            return this.H;
        }

        public final Boolean z() {
            return this.m;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public G(String str, String str2, int i, String str3, Integer num, Boolean bool, Boolean bool2, A a, C1366d c1366d, e eVar, List<? extends PlaybackBadge> list, Boolean bool3, Boolean bool4, WatchStatus watchStatus, C1363a c1363a, h hVar, j jVar, Boolean bool5, Boolean bool6, ThumbRating thumbRating, Boolean bool7, List<Integer> list2, List<D> list3, List<I> list4, z zVar, x xVar, y yVar, v vVar, C2278adI c2278adI, C2287adR c2287adR, C2412afk c2412afk, C2560aiQ c2560aiQ, C2282adM c2282adM) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) c2278adI, "");
            C8632dsu.c((Object) c2287adR, "");
            C8632dsu.c((Object) c2412afk, "");
            C8632dsu.c((Object) c2560aiQ, "");
            C8632dsu.c((Object) c2282adM, "");
            this.e = str;
            this.A = str2;
            this.G = i;
            this.I = str3;
            this.s = num;
            this.l = bool;
            this.g = bool2;
            this.v = a;
            this.a = c1366d;
            this.c = eVar;
            this.x = list;
            this.t = bool3;
            this.n = bool4;
            this.H = watchStatus;
            this.d = c1363a;
            this.f = hVar;
            this.h = jVar;
            this.m = bool5;
            this.p = bool6;
            this.z = thumbRating;
            this.f13415o = bool7;
            this.r = list2;
            this.y = list3;
            this.B = list4;
            this.C = zVar;
            this.u = xVar;
            this.w = yVar;
            this.q = vVar;
            this.b = c2278adI;
            this.j = c2287adR;
            this.k = c2412afk;
            this.D = c2560aiQ;
            this.i = c2282adM;
        }
    }

    /* renamed from: o.Yt$A */
    /* loaded from: classes3.dex */
    public static final class A {
        private final String a;
        private final Boolean d;
        private final String e;

        public final Boolean a() {
            return this.d;
        }

        public final String b() {
            return this.e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof A) {
                A a = (A) obj;
                return C8632dsu.c((Object) this.e, (Object) a.e) && C8632dsu.c(this.d, a.d) && C8632dsu.c((Object) this.a, (Object) a.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Boolean bool = this.d;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            String str = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            Boolean bool = this.d;
            String str2 = this.a;
            return "StoryArt(__typename=" + str + ", available=" + bool + ", url=" + str2 + ")";
        }

        public A(String str, Boolean bool, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = bool;
            this.a = str2;
        }
    }

    /* renamed from: o.Yt$d  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C1366d {
        private final Boolean a;
        private final String b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final Boolean d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1366d) {
                C1366d c1366d = (C1366d) obj;
                return C8632dsu.c((Object) this.c, (Object) c1366d.c) && C8632dsu.c((Object) this.b, (Object) c1366d.b) && C8632dsu.c(this.a, c1366d.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Boolean bool = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            Boolean bool = this.a;
            return "BrandAndGenreBadge(__typename=" + str + ", url=" + str2 + ", available=" + bool + ")";
        }

        public C1366d(String str, String str2, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = str2;
            this.a = bool;
        }
    }

    /* renamed from: o.Yt$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String b;
        private final Boolean c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final Boolean d() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.c, eVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.a;
            String str3 = this.b;
            Boolean bool = this.c;
            return "Boxshot(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", available=" + bool + ")";
        }

        public e(String str, String str2, String str3, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = str2;
            this.b = str3;
            this.c = bool;
        }
    }

    /* renamed from: o.Yt$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C1363a {
        private final String a;
        private final C2290adU d;

        public final C2290adU a() {
            return this.d;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1363a) {
                C1363a c1363a = (C1363a) obj;
                return C8632dsu.c((Object) this.a, (Object) c1363a.a) && C8632dsu.c(this.d, c1363a.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2290adU c2290adU = this.d;
            return "Actors(__typename=" + str + ", detailPerson=" + c2290adU + ")";
        }

        public C1363a(String str, C2290adU c2290adU) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2290adU, "");
            this.a = str;
            this.d = c2290adU;
        }
    }

    /* renamed from: o.Yt$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final C2290adU a;
        private final String b;

        public final String a() {
            return this.b;
        }

        public final C2290adU b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.b, (Object) hVar.b) && C8632dsu.c(this.a, hVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2290adU c2290adU = this.a;
            return "Creators(__typename=" + str + ", detailPerson=" + c2290adU + ")";
        }

        public h(String str, C2290adU c2290adU) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2290adU, "");
            this.b = str;
            this.a = c2290adU;
        }
    }

    /* renamed from: o.Yt$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final String a;
        private final C2290adU d;

        public final String c() {
            return this.a;
        }

        public final C2290adU e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.a, (Object) jVar.a) && C8632dsu.c(this.d, jVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2290adU c2290adU = this.d;
            return "Directors(__typename=" + str + ", detailPerson=" + c2290adU + ")";
        }

        public j(String str, C2290adU c2290adU) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2290adU, "");
            this.a = str;
            this.d = c2290adU;
        }
    }

    /* renamed from: o.Yt$D */
    /* loaded from: classes3.dex */
    public static final class D {
        private final C2630ajh a;
        private final String c;
        private final C1365c d;

        public final C2630ajh b() {
            return this.a;
        }

        public final C1365c c() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof D) {
                D d = (D) obj;
                return C8632dsu.c((Object) this.c, (Object) d.c) && C8632dsu.c(this.d, d.d) && C8632dsu.c(this.a, d.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            C1365c c1365c = this.d;
            return (((hashCode * 31) + (c1365c == null ? 0 : c1365c.hashCode())) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            C1365c c1365c = this.d;
            C2630ajh c2630ajh = this.a;
            return "SimilarVideo(__typename=" + str + ", boxshot=" + c1365c + ", videoSummary=" + c2630ajh + ")";
        }

        public D(String str, C1365c c1365c, C2630ajh c2630ajh) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2630ajh, "");
            this.c = str;
            this.d = c1365c;
            this.a = c2630ajh;
        }
    }

    /* renamed from: o.Yt$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C1365c {
        private final String b;
        private final String c;
        private final String d;

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1365c) {
                C1365c c1365c = (C1365c) obj;
                return C8632dsu.c((Object) this.c, (Object) c1365c.c) && C8632dsu.c((Object) this.b, (Object) c1365c.b) && C8632dsu.c((Object) this.d, (Object) c1365c.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            String str3 = this.d;
            return "Boxshot1(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public C1365c(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = str2;
            this.d = str3;
        }
    }

    /* renamed from: o.Yt$I */
    /* loaded from: classes3.dex */
    public static final class I {
        private final TitleGroupMemberKind a;
        private final List<B> c;
        private final String e;

        public final TitleGroupMemberKind a() {
            return this.a;
        }

        public final List<B> b() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof I) {
                I i = (I) obj;
                return C8632dsu.c((Object) this.e, (Object) i.e) && this.a == i.a && C8632dsu.c(this.c, i.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            TitleGroupMemberKind titleGroupMemberKind = this.a;
            int hashCode2 = titleGroupMemberKind == null ? 0 : titleGroupMemberKind.hashCode();
            List<B> list = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            TitleGroupMemberKind titleGroupMemberKind = this.a;
            List<B> list = this.c;
            return "TitleGroupMembership(__typename=" + str + ", kind=" + titleGroupMemberKind + ", siblings=" + list + ")";
        }

        public I(String str, TitleGroupMemberKind titleGroupMemberKind, List<B> list) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = titleGroupMemberKind;
            this.c = list;
        }
    }

    /* renamed from: o.Yt$B */
    /* loaded from: classes3.dex */
    public static final class B {
        private final C1364b a;
        private final String c;
        private final C2630ajh e;

        public final C1364b a() {
            return this.a;
        }

        public final C2630ajh c() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof B) {
                B b = (B) obj;
                return C8632dsu.c((Object) this.c, (Object) b.c) && C8632dsu.c(this.a, b.a) && C8632dsu.c(this.e, b.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            C1364b c1364b = this.a;
            return (((hashCode * 31) + (c1364b == null ? 0 : c1364b.hashCode())) * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            C1364b c1364b = this.a;
            C2630ajh c2630ajh = this.e;
            return "Sibling(__typename=" + str + ", boxshot=" + c1364b + ", videoSummary=" + c2630ajh + ")";
        }

        public B(String str, C1364b c1364b, C2630ajh c2630ajh) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2630ajh, "");
            this.c = str;
            this.a = c1364b;
            this.e = c2630ajh;
        }
    }

    /* renamed from: o.Yt$b  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C1364b {
        private final String a;
        private final String c;
        private final String d;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1364b) {
                C1364b c1364b = (C1364b) obj;
                return C8632dsu.c((Object) this.c, (Object) c1364b.c) && C8632dsu.c((Object) this.d, (Object) c1364b.d) && C8632dsu.c((Object) this.a, (Object) c1364b.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            String str3 = this.a;
            return "Boxshot2(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public C1364b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = str2;
            this.a = str3;
        }
    }

    /* renamed from: o.Yt$z */
    /* loaded from: classes3.dex */
    public static final class z {
        private final String b;
        private final Integer c;
        private final List<k> d;

        public final List<k> a() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public final Integer e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof z) {
                z zVar = (z) obj;
                return C8632dsu.c((Object) this.b, (Object) zVar.b) && C8632dsu.c(this.c, zVar.c) && C8632dsu.c(this.d, zVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Integer num = this.c;
            int hashCode2 = num == null ? 0 : num.hashCode();
            List<k> list = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            Integer num = this.c;
            List<k> list = this.d;
            return "SupplementalVideosList(__typename=" + str + ", totalCount=" + num + ", edges=" + list + ")";
        }

        public z(String str, Integer num, List<k> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = num;
            this.d = list;
        }
    }

    /* renamed from: o.Yt$k */
    /* loaded from: classes3.dex */
    public static final class k {
        private final String a;
        private final String b;
        private final r c;

        public final r a() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return C8632dsu.c((Object) this.b, (Object) kVar.b) && C8632dsu.c((Object) this.a, (Object) kVar.a) && C8632dsu.c(this.c, kVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            r rVar = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (rVar != null ? rVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.a;
            r rVar = this.c;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + rVar + ")";
        }

        public k(String str, String str2, r rVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = str2;
            this.c = rVar;
        }
    }

    /* renamed from: o.Yt$r */
    /* loaded from: classes3.dex */
    public static final class r {
        private final C2289adT a;
        private final p b;
        private final C2630ajh c;
        private final String d;
        private final C2295adZ e;

        public final p a() {
            return this.b;
        }

        public final C2295adZ b() {
            return this.e;
        }

        public final C2289adT c() {
            return this.a;
        }

        public final C2630ajh d() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return C8632dsu.c((Object) this.d, (Object) rVar.d) && C8632dsu.c(this.b, rVar.b) && C8632dsu.c(this.c, rVar.c) && C8632dsu.c(this.e, rVar.e) && C8632dsu.c(this.a, rVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            p pVar = this.b;
            return (((((((hashCode * 31) + (pVar == null ? 0 : pVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            p pVar = this.b;
            C2630ajh c2630ajh = this.c;
            C2295adZ c2295adZ = this.e;
            C2289adT c2289adT = this.a;
            return "Node(__typename=" + str + ", interestingArtworkLarge=" + pVar + ", videoSummary=" + c2630ajh + ", detailsViewable=" + c2295adZ + ", detailsProtected=" + c2289adT + ")";
        }

        public r(String str, p pVar, C2630ajh c2630ajh, C2295adZ c2295adZ, C2289adT c2289adT) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2630ajh, "");
            C8632dsu.c((Object) c2295adZ, "");
            C8632dsu.c((Object) c2289adT, "");
            this.d = str;
            this.b = pVar;
            this.c = c2630ajh;
            this.e = c2295adZ;
            this.a = c2289adT;
        }
    }

    /* renamed from: o.Yt$p */
    /* loaded from: classes3.dex */
    public static final class p {
        private final String b;
        private final String c;

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return C8632dsu.c((Object) this.b, (Object) pVar.b) && C8632dsu.c((Object) this.c, (Object) pVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.c;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            return "InterestingArtworkLarge(__typename=" + str + ", url=" + str2 + ")";
        }

        public p(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = str2;
        }
    }

    /* renamed from: o.Yt$x */
    /* loaded from: classes3.dex */
    public static final class x {
        private final String a;
        private final F b;
        private final String c;

        public final String b() {
            return this.a;
        }

        public final F c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof x) {
                x xVar = (x) obj;
                return C8632dsu.c((Object) this.c, (Object) xVar.c) && C8632dsu.c((Object) this.a, (Object) xVar.a) && C8632dsu.c(this.b, xVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            F f = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.a;
            F f = this.b;
            return "PromoVideo(__typename=" + str + ", computeId=" + str2 + ", video=" + f + ")";
        }

        public x(String str, String str2, F f) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = str2;
            this.b = f;
        }
    }

    /* renamed from: o.Yt$F */
    /* loaded from: classes3.dex */
    public static final class F {
        private final w a;
        private final int b;
        private final String c;

        public final int a() {
            return this.b;
        }

        public final w c() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof F) {
                F f = (F) obj;
                return C8632dsu.c((Object) this.c, (Object) f.c) && this.b == f.b && C8632dsu.c(this.a, f.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            w wVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (wVar == null ? 0 : wVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            int i = this.b;
            w wVar = this.a;
            return "Video1(__typename=" + str + ", videoId=" + i + ", onSupplemental=" + wVar + ")";
        }

        public F(String str, int i, w wVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = i;
            this.a = wVar;
        }
    }

    /* renamed from: o.Yt$w */
    /* loaded from: classes3.dex */
    public static final class w {
        private final Integer a;
        private final Integer b;
        private final Integer c;
        private final Integer d;

        public final Integer a() {
            return this.a;
        }

        public final Integer b() {
            return this.b;
        }

        public final Integer d() {
            return this.c;
        }

        public final Integer e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof w) {
                w wVar = (w) obj;
                return C8632dsu.c(this.d, wVar.d) && C8632dsu.c(this.b, wVar.b) && C8632dsu.c(this.a, wVar.a) && C8632dsu.c(this.c, wVar.c);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.d;
            int hashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.b;
            int hashCode2 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.a;
            int hashCode3 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num4 != null ? num4.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.d;
            Integer num2 = this.b;
            Integer num3 = this.a;
            Integer num4 = this.c;
            return "OnSupplemental(runtimeMs=" + num + ", runtimeSec=" + num2 + ", displayRuntimeMs=" + num3 + ", displayRuntimeSec=" + num4 + ")";
        }

        public w(Integer num, Integer num2, Integer num3, Integer num4) {
            this.d = num;
            this.b = num2;
            this.a = num3;
            this.c = num4;
        }
    }

    /* renamed from: o.Yt$y */
    /* loaded from: classes3.dex */
    public static final class y {
        private final s b;
        private final String c;
        private final C1367f d;
        private final C e;

        public final C1367f b() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final C d() {
            return this.e;
        }

        public final s e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof y) {
                y yVar = (y) obj;
                return C8632dsu.c((Object) this.c, (Object) yVar.c) && C8632dsu.c(this.d, yVar.d) && C8632dsu.c(this.b, yVar.b) && C8632dsu.c(this.e, yVar.e);
            }
            return false;
        }

        public int hashCode() {
            String str = this.c;
            int hashCode = str == null ? 0 : str.hashCode();
            C1367f c1367f = this.d;
            int hashCode2 = c1367f == null ? 0 : c1367f.hashCode();
            s sVar = this.b;
            int hashCode3 = sVar == null ? 0 : sVar.hashCode();
            C c = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (c != null ? c.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            C1367f c1367f = this.d;
            s sVar = this.b;
            C c = this.e;
            return "OnShow(numSeasonsLabel=" + str + ", currentEpisode=" + c1367f + ", nextLiveEvent=" + sVar + ", seasons=" + c + ")";
        }

        public y(String str, C1367f c1367f, s sVar, C c) {
            this.c = str;
            this.d = c1367f;
            this.b = sVar;
            this.e = c;
        }
    }

    /* renamed from: o.Yt$f  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C1367f {
        private final Integer a;
        private final String b;
        private final C2287adR c;
        private final C2289adT d;
        private final C2295adZ e;
        private final String f;
        private final u g;
        private final int j;

        public final C2295adZ a() {
            return this.e;
        }

        public final Integer b() {
            return this.a;
        }

        public final C2287adR c() {
            return this.c;
        }

        public final C2289adT d() {
            return this.d;
        }

        public final u e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1367f) {
                C1367f c1367f = (C1367f) obj;
                return C8632dsu.c((Object) this.b, (Object) c1367f.b) && C8632dsu.c((Object) this.f, (Object) c1367f.f) && this.j == c1367f.j && C8632dsu.c(this.a, c1367f.a) && C8632dsu.c(this.g, c1367f.g) && C8632dsu.c(this.c, c1367f.c) && C8632dsu.c(this.e, c1367f.e) && C8632dsu.c(this.d, c1367f.d);
            }
            return false;
        }

        public final String f() {
            return this.f;
        }

        public final String g() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.f;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = Integer.hashCode(this.j);
            Integer num = this.a;
            int hashCode4 = num == null ? 0 : num.hashCode();
            u uVar = this.g;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (uVar != null ? uVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
        }

        public final int j() {
            return this.j;
        }

        public String toString() {
            String str = this.b;
            String str2 = this.f;
            int i = this.j;
            Integer num = this.a;
            u uVar = this.g;
            C2287adR c2287adR = this.c;
            C2295adZ c2295adZ = this.e;
            C2289adT c2289adT = this.d;
            return "CurrentEpisode(__typename=" + str + ", title=" + str2 + ", videoId=" + i + ", number=" + num + ", parentSeason=" + uVar + ", detailsContextualSynopsis=" + c2287adR + ", detailsViewable=" + c2295adZ + ", detailsProtected=" + c2289adT + ")";
        }

        public C1367f(String str, String str2, int i, Integer num, u uVar, C2287adR c2287adR, C2295adZ c2295adZ, C2289adT c2289adT) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2287adR, "");
            C8632dsu.c((Object) c2295adZ, "");
            C8632dsu.c((Object) c2289adT, "");
            this.b = str;
            this.f = str2;
            this.j = i;
            this.a = num;
            this.g = uVar;
            this.c = c2287adR;
            this.e = c2295adZ;
            this.d = c2289adT;
        }
    }

    /* renamed from: o.Yt$u */
    /* loaded from: classes3.dex */
    public static final class u {
        private final String a;
        private final String b;
        private final String c;
        private final Integer d;
        private final String e;
        private final int j;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public final int d() {
            return this.j;
        }

        public final Integer e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                return C8632dsu.c((Object) this.c, (Object) uVar.c) && this.j == uVar.j && C8632dsu.c((Object) this.b, (Object) uVar.b) && C8632dsu.c((Object) this.e, (Object) uVar.e) && C8632dsu.c((Object) this.a, (Object) uVar.a) && C8632dsu.c(this.d, uVar.d);
            }
            return false;
        }

        public final String h() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Integer.hashCode(this.j);
            String str = this.b;
            int hashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.a;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            Integer num = this.d;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            int i = this.j;
            String str2 = this.b;
            String str3 = this.e;
            String str4 = this.a;
            Integer num = this.d;
            return "ParentSeason(__typename=" + str + ", videoId=" + i + ", title=" + str2 + ", numberLabelV2=" + str3 + ", seasonSeqAbbrLabel=" + str4 + ", number=" + num + ")";
        }

        public u(String str, int i, String str2, String str3, String str4, Integer num) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.j = i;
            this.b = str2;
            this.e = str3;
            this.a = str4;
            this.d = num;
        }
    }

    /* renamed from: o.Yt$s */
    /* loaded from: classes3.dex */
    public static final class s {
        private final C2436afz a;
        private final o b;
        private final String c;

        public final C2436afz b() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public final o e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return C8632dsu.c((Object) this.c, (Object) sVar.c) && C8632dsu.c(this.b, sVar.b) && C8632dsu.c(this.a, sVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            o oVar = this.b;
            return (((hashCode * 31) + (oVar == null ? 0 : oVar.hashCode())) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            o oVar = this.b;
            C2436afz c2436afz = this.a;
            return "NextLiveEvent(__typename=" + str + ", event=" + oVar + ", liveEventData=" + c2436afz + ")";
        }

        public s(String str, o oVar, C2436afz c2436afz) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2436afz, "");
            this.c = str;
            this.b = oVar;
            this.a = c2436afz;
        }
    }

    /* renamed from: o.Yt$o */
    /* loaded from: classes3.dex */
    public static final class o {
        private final q a;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final q b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return C8632dsu.c((Object) this.d, (Object) oVar.d) && C8632dsu.c(this.a, oVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            q qVar = this.a;
            return (hashCode * 31) + (qVar == null ? 0 : qVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            q qVar = this.a;
            return "Event(__typename=" + str + ", onEpisode=" + qVar + ")";
        }

        public o(String str, q qVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = qVar;
        }
    }

    /* renamed from: o.Yt$q */
    /* loaded from: classes3.dex */
    public static final class q {
        private final int b;
        private final Integer c;
        private final String d;

        public final String b() {
            return this.d;
        }

        public final int c() {
            return this.b;
        }

        public final Integer d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return C8632dsu.c((Object) this.d, (Object) qVar.d) && this.b == qVar.b && C8632dsu.c(this.c, qVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            Integer num = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.d;
            int i = this.b;
            Integer num = this.c;
            return "OnEpisode(__typename=" + str + ", videoId=" + i + ", number=" + num + ")";
        }

        public q(String str, int i, Integer num) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = i;
            this.c = num;
        }
    }

    /* renamed from: o.Yt$C */
    /* loaded from: classes3.dex */
    public static final class C {
        private final String a;
        private final Integer c;
        private final List<l> d;

        public final List<l> b() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public final Integer e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C) {
                C c = (C) obj;
                return C8632dsu.c((Object) this.a, (Object) c.a) && C8632dsu.c(this.c, c.c) && C8632dsu.c(this.d, c.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            Integer num = this.c;
            int hashCode2 = num == null ? 0 : num.hashCode();
            List<l> list = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            Integer num = this.c;
            List<l> list = this.d;
            return "Seasons(__typename=" + str + ", totalCount=" + num + ", edges=" + list + ")";
        }

        public C(String str, Integer num, List<l> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = num;
            this.d = list;
        }
    }

    /* renamed from: o.Yt$l */
    /* loaded from: classes3.dex */
    public static final class l {
        private final String d;
        private final t e;

        public final t b() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return C8632dsu.c((Object) this.d, (Object) lVar.d) && C8632dsu.c(this.e, lVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            t tVar = this.e;
            return (hashCode * 31) + (tVar == null ? 0 : tVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            t tVar = this.e;
            return "Edge1(__typename=" + str + ", node=" + tVar + ")";
        }

        public l(String str, t tVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = tVar;
        }
    }

    /* renamed from: o.Yt$t */
    /* loaded from: classes3.dex */
    public static final class t {
        private final Integer a;
        private final Integer b;
        private final String c;
        private final String d;
        private final m e;
        private final String f;
        private final int h;
        private final String j;

        public final String a() {
            return this.j;
        }

        public final String b() {
            return this.c;
        }

        public final m c() {
            return this.e;
        }

        public final Integer d() {
            return this.b;
        }

        public final Integer e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return C8632dsu.c((Object) this.d, (Object) tVar.d) && this.h == tVar.h && C8632dsu.c((Object) this.j, (Object) tVar.j) && C8632dsu.c((Object) this.f, (Object) tVar.f) && C8632dsu.c(this.a, tVar.a) && C8632dsu.c((Object) this.c, (Object) tVar.c) && C8632dsu.c(this.b, tVar.b) && C8632dsu.c(this.e, tVar.e);
            }
            return false;
        }

        public final int f() {
            return this.h;
        }

        public final String h() {
            return this.d;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.h);
            String str = this.j;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = this.f.hashCode();
            Integer num = this.a;
            int hashCode5 = num == null ? 0 : num.hashCode();
            String str2 = this.c;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            Integer num2 = this.b;
            int hashCode7 = num2 == null ? 0 : num2.hashCode();
            m mVar = this.e;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (mVar != null ? mVar.hashCode() : 0);
        }

        public final String j() {
            return this.f;
        }

        public String toString() {
            String str = this.d;
            int i = this.h;
            String str2 = this.j;
            String str3 = this.f;
            Integer num = this.a;
            String str4 = this.c;
            Integer num2 = this.b;
            m mVar = this.e;
            return "Node1(__typename=" + str + ", videoId=" + i + ", title=" + str2 + ", unifiedEntityId=" + str3 + ", number=" + num + ", numberLabelV2=" + str4 + ", releaseYear=" + num2 + ", episodes=" + mVar + ")";
        }

        public t(String str, int i, String str2, String str3, Integer num, String str4, Integer num2, m mVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str3, "");
            this.d = str;
            this.h = i;
            this.j = str2;
            this.f = str3;
            this.a = num;
            this.c = str4;
            this.b = num2;
            this.e = mVar;
        }
    }

    /* renamed from: o.Yt$m */
    /* loaded from: classes3.dex */
    public static final class m {
        private final C2328aeF b;
        private final String c;

        public final String b() {
            return this.c;
        }

        public final C2328aeF c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return C8632dsu.c((Object) this.c, (Object) mVar.c) && C8632dsu.c(this.b, mVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2328aeF c2328aeF = this.b;
            return "Episodes(__typename=" + str + ", fullDpEpisodesPage=" + c2328aeF + ")";
        }

        public m(String str, C2328aeF c2328aeF) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2328aeF, "");
            this.c = str;
            this.b = c2328aeF;
        }
    }

    /* renamed from: o.Yt$v */
    /* loaded from: classes3.dex */
    public static final class v {
        private final C2295adZ a;
        private final C2329aeG b;
        private final Integer c;
        private final C2289adT d;
        private final Integer e;

        public final C2289adT a() {
            return this.d;
        }

        public final Integer b() {
            return this.e;
        }

        public final C2295adZ c() {
            return this.a;
        }

        public final C2329aeG d() {
            return this.b;
        }

        public final Integer e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                return C8632dsu.c(this.c, vVar.c) && C8632dsu.c(this.e, vVar.e) && C8632dsu.c(this.a, vVar.a) && C8632dsu.c(this.d, vVar.d) && C8632dsu.c(this.b, vVar.b);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.c;
            int hashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.e;
            return (((((((hashCode * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            Integer num = this.c;
            Integer num2 = this.e;
            C2295adZ c2295adZ = this.a;
            C2289adT c2289adT = this.d;
            C2329aeG c2329aeG = this.b;
            return "OnMovie(runtimeMs=" + num + ", displayRuntimeMs=" + num2 + ", detailsViewable=" + c2295adZ + ", detailsProtected=" + c2289adT + ", fullDpLiveEventViewable=" + c2329aeG + ")";
        }

        public v(Integer num, Integer num2, C2295adZ c2295adZ, C2289adT c2289adT, C2329aeG c2329aeG) {
            C8632dsu.c((Object) c2295adZ, "");
            C8632dsu.c((Object) c2289adT, "");
            C8632dsu.c((Object) c2329aeG, "");
            this.c = num;
            this.e = num2;
            this.a = c2295adZ;
            this.d = c2289adT;
            this.b = c2329aeG;
        }
    }

    /* renamed from: o.Yt$n */
    /* loaded from: classes3.dex */
    public static final class n {
        private final String b;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return C8632dsu.c((Object) this.b, (Object) nVar.b) && C8632dsu.c((Object) this.e, (Object) nVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.e;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            return "GatewayRequestDetails(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public n(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = str2;
        }
    }

    /* renamed from: o.Yt$i  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C1369i {
        public /* synthetic */ C1369i(C8627dsp c8627dsp) {
            this();
        }

        private C1369i() {
        }
    }
}
