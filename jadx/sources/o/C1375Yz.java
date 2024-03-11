package o;

import com.netflix.mediaclient.graphql.models.type.GameOrientation;
import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2128aaR;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yz  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1375Yz implements InterfaceC8999hM<c> {
    public static final e a = new e(null);
    private final C2865aoD b;
    private final int c;
    private final boolean d;
    private final C2865aoD e;
    private final String h;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "d702fd30-6d33-47cd-b794-94b0d7b33b22";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1375Yz) {
            C1375Yz c1375Yz = (C1375Yz) obj;
            return this.c == c1375Yz.c && C8632dsu.c((Object) this.h, (Object) c1375Yz.h) && C8632dsu.c(this.b, c1375Yz.b) && C8632dsu.c(this.e, c1375Yz.e);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "GameDetails";
    }

    public final String g() {
        return this.h;
    }

    public final int h() {
        return this.c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.c) * 31) + this.h.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }

    public final C2865aoD i() {
        return this.e;
    }

    public final C2865aoD j() {
        return this.b;
    }

    public String toString() {
        int i2 = this.c;
        String str = this.h;
        C2865aoD c2865aoD = this.b;
        C2865aoD c2865aoD2 = this.e;
        return "GameDetailsQuery(gameId=" + i2 + ", sourceId=" + str + ", imageParamsForGamesIcon=" + c2865aoD + ", imageParamsForGamesBillboardBackground=" + c2865aoD2 + ")";
    }

    public C1375Yz(int i2, String str, C2865aoD c2865aoD, C2865aoD c2865aoD2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        this.c = i2;
        this.h = str;
        this.b = c2865aoD;
        this.e = c2865aoD2;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2126aaP.e.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2128aaR.c.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2835ana.e.a()).d();
    }

    /* renamed from: o.Yz$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC8999hM.c {
        private final int a;
        private final List<g> b;
        private final int c;
        private final f d;

        public final int a() {
            return this.a;
        }

        public final f b() {
            return this.d;
        }

        public final int c() {
            return this.c;
        }

        public final List<g> e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.b, cVar.b) && C8632dsu.c(this.d, cVar.d) && this.a == cVar.a && this.c == cVar.c;
            }
            return false;
        }

        public int hashCode() {
            List<g> list = this.b;
            int hashCode = list == null ? 0 : list.hashCode();
            f fVar = this.d;
            return (((((hashCode * 31) + (fVar != null ? fVar.hashCode() : 0)) * 31) + Integer.hashCode(this.a)) * 31) + Integer.hashCode(this.c);
        }

        public String toString() {
            List<g> list = this.b;
            f fVar = this.d;
            int i = this.a;
            int i2 = this.c;
            return "Data(games=" + list + ", gatewayRequestDetails=" + fVar + ", screenshotsTrackId=" + i + ", similarsTrackId=" + i2 + ")";
        }

        public c(List<g> list, f fVar, int i, int i2) {
            this.b = list;
            this.d = fVar;
            this.a = i;
            this.c = i2;
        }
    }

    /* renamed from: o.Yz$g */
    /* loaded from: classes6.dex */
    public static final class g {
        private final String a;
        private final String b;
        private final b c;
        private final a d;
        private final String e;
        private final C2340aeR f;
        private final C2339aeQ g;
        private final C2335aeM h;
        private final int i;
        private final C2331aeI j;
        private final C2344aeV k;
        private final List<i> l;
        private final List<n> m;
        private final Integer n;

        /* renamed from: o  reason: collision with root package name */
        private final GameOrientation f13418o;
        private final l p;
        private final ThumbRating q;
        private final String r;
        private final List<String> s;
        private final String t;
        private final List<o> u;
        private final String x;

        public final C2331aeI a() {
            return this.j;
        }

        public final String b() {
            return this.b;
        }

        public final b c() {
            return this.c;
        }

        public final a d() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.e, (Object) gVar.e) && C8632dsu.c((Object) this.t, (Object) gVar.t) && this.i == gVar.i && C8632dsu.c(this.c, gVar.c) && C8632dsu.c((Object) this.a, (Object) gVar.a) && C8632dsu.c(this.d, gVar.d) && this.f13418o == gVar.f13418o && C8632dsu.c((Object) this.b, (Object) gVar.b) && C8632dsu.c((Object) this.x, (Object) gVar.x) && C8632dsu.c(this.s, gVar.s) && C8632dsu.c((Object) this.r, (Object) gVar.r) && C8632dsu.c(this.n, gVar.n) && this.q == gVar.q && C8632dsu.c(this.m, gVar.m) && C8632dsu.c(this.l, gVar.l) && C8632dsu.c(this.u, gVar.u) && C8632dsu.c(this.p, gVar.p) && C8632dsu.c(this.k, gVar.k) && C8632dsu.c(this.j, gVar.j) && C8632dsu.c(this.f, gVar.f) && C8632dsu.c(this.h, gVar.h) && C8632dsu.c(this.g, gVar.g);
            }
            return false;
        }

        public final int f() {
            return this.i;
        }

        public final C2335aeM g() {
            return this.h;
        }

        public final C2340aeR h() {
            return this.f;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.t;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = Integer.hashCode(this.i);
            b bVar = this.c;
            int hashCode4 = bVar == null ? 0 : bVar.hashCode();
            String str2 = this.a;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            a aVar = this.d;
            int hashCode6 = aVar == null ? 0 : aVar.hashCode();
            GameOrientation gameOrientation = this.f13418o;
            int hashCode7 = gameOrientation == null ? 0 : gameOrientation.hashCode();
            String str3 = this.b;
            int hashCode8 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.x;
            int hashCode9 = str4 == null ? 0 : str4.hashCode();
            List<String> list = this.s;
            int hashCode10 = list == null ? 0 : list.hashCode();
            String str5 = this.r;
            int hashCode11 = str5 == null ? 0 : str5.hashCode();
            Integer num = this.n;
            int hashCode12 = num == null ? 0 : num.hashCode();
            ThumbRating thumbRating = this.q;
            int hashCode13 = thumbRating == null ? 0 : thumbRating.hashCode();
            List<n> list2 = this.m;
            int hashCode14 = list2 == null ? 0 : list2.hashCode();
            List<i> list3 = this.l;
            int hashCode15 = list3 == null ? 0 : list3.hashCode();
            List<o> list4 = this.u;
            int hashCode16 = list4 == null ? 0 : list4.hashCode();
            l lVar = this.p;
            return (((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.k.hashCode()) * 31) + this.j.hashCode()) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + this.g.hashCode();
        }

        public final C2344aeV i() {
            return this.k;
        }

        public final C2339aeQ j() {
            return this.g;
        }

        public final GameOrientation k() {
            return this.f13418o;
        }

        public final Integer l() {
            return this.n;
        }

        public final List<n> m() {
            return this.m;
        }

        public final List<String> n() {
            return this.s;
        }

        public final List<i> o() {
            return this.l;
        }

        public final l p() {
            return this.p;
        }

        public final String q() {
            return this.x;
        }

        public final ThumbRating r() {
            return this.q;
        }

        public final String s() {
            return this.r;
        }

        public final String t() {
            return this.t;
        }

        public String toString() {
            String str = this.e;
            String str2 = this.t;
            int i = this.i;
            b bVar = this.c;
            String str3 = this.a;
            a aVar = this.d;
            GameOrientation gameOrientation = this.f13418o;
            String str4 = this.b;
            String str5 = this.x;
            List<String> list = this.s;
            String str6 = this.r;
            Integer num = this.n;
            ThumbRating thumbRating = this.q;
            List<n> list2 = this.m;
            List<i> list3 = this.l;
            List<o> list4 = this.u;
            l lVar = this.p;
            C2344aeV c2344aeV = this.k;
            C2331aeI c2331aeI = this.j;
            C2340aeR c2340aeR = this.f;
            C2335aeM c2335aeM = this.h;
            C2339aeQ c2339aeQ = this.g;
            return "Game(__typename=" + str + ", title=" + str2 + ", gameId=" + i + ", developer=" + bVar + ", copyrights=" + str3 + ", features=" + aVar + ", orientation=" + gameOrientation + ", deviceCompatibility=" + str4 + ", version=" + str5 + ", supportedLanguages=" + list + ", synopsis=" + str6 + ", releaseYear=" + num + ", thumbRating=" + thumbRating + ", similarGames=" + list2 + ", horizontalArtworks=" + list3 + ", verticalArtworks=" + list4 + ", trailerEntities=" + lVar + ", gameSummary=" + c2344aeV + ", gameArtwork=" + c2331aeI + ", gameInstallationInfo=" + c2340aeR + ", gameBillboard=" + c2335aeM + ", gameInQueue=" + c2339aeQ + ")";
        }

        public final List<o> v() {
            return this.u;
        }

        public final String y() {
            return this.e;
        }

        public g(String str, String str2, int i, b bVar, String str3, a aVar, GameOrientation gameOrientation, String str4, String str5, List<String> list, String str6, Integer num, ThumbRating thumbRating, List<n> list2, List<i> list3, List<o> list4, l lVar, C2344aeV c2344aeV, C2331aeI c2331aeI, C2340aeR c2340aeR, C2335aeM c2335aeM, C2339aeQ c2339aeQ) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2344aeV, "");
            C8632dsu.c((Object) c2331aeI, "");
            C8632dsu.c((Object) c2340aeR, "");
            C8632dsu.c((Object) c2335aeM, "");
            C8632dsu.c((Object) c2339aeQ, "");
            this.e = str;
            this.t = str2;
            this.i = i;
            this.c = bVar;
            this.a = str3;
            this.d = aVar;
            this.f13418o = gameOrientation;
            this.b = str4;
            this.x = str5;
            this.s = list;
            this.r = str6;
            this.n = num;
            this.q = thumbRating;
            this.m = list2;
            this.l = list3;
            this.u = list4;
            this.p = lVar;
            this.k = c2344aeV;
            this.j = c2331aeI;
            this.f = c2340aeR;
            this.h = c2335aeM;
            this.g = c2339aeQ;
        }
    }

    /* renamed from: o.Yz$b */
    /* loaded from: classes6.dex */
    public static final class b {
        private final String b;
        private final String d;

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
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c((Object) this.b, (Object) bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            return "Developer(__typename=" + str + ", name=" + str2 + ")";
        }

        public b(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = str2;
        }
    }

    /* renamed from: o.Yz$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private final List<String> a;
        private final String b;
        private final Integer c;
        private final Integer d;
        private final String e;
        private final List<String> f;
        private final String h;

        public final Integer a() {
            return this.d;
        }

        public final List<String> b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public final List<String> d() {
            return this.f;
        }

        public final Integer e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.f, aVar.f) && C8632dsu.c(this.a, aVar.a) && C8632dsu.c((Object) this.h, (Object) aVar.h) && C8632dsu.c(this.d, aVar.d) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public final String f() {
            return this.b;
        }

        public final String h() {
            return this.h;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            List<String> list = this.f;
            int hashCode3 = list == null ? 0 : list.hashCode();
            List<String> list2 = this.a;
            int hashCode4 = list2 == null ? 0 : list2.hashCode();
            String str2 = this.h;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.d;
            int hashCode6 = num == null ? 0 : num.hashCode();
            Integer num2 = this.c;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            List<String> list = this.f;
            List<String> list2 = this.a;
            String str3 = this.h;
            Integer num = this.d;
            Integer num2 = this.c;
            return "Features(__typename=" + str + ", hasControllerSupport=" + str2 + ", playerModes=" + list + ", modes=" + list2 + ", requiresConnectivity=" + str3 + ", maximumPlayers=" + num + ", minimumPlayers=" + num2 + ")";
        }

        public a(String str, String str2, List<String> list, List<String> list2, String str3, Integer num, Integer num2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = str2;
            this.f = list;
            this.a = list2;
            this.h = str3;
            this.d = num;
            this.c = num2;
        }
    }

    /* renamed from: o.Yz$n */
    /* loaded from: classes6.dex */
    public static final class n {
        private final C2344aeV b;
        private final String c;
        private final C2331aeI d;

        public final C2331aeI b() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public final C2344aeV e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return C8632dsu.c((Object) this.c, (Object) nVar.c) && C8632dsu.c(this.b, nVar.b) && C8632dsu.c(this.d, nVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2344aeV c2344aeV = this.b;
            C2331aeI c2331aeI = this.d;
            return "SimilarGame(__typename=" + str + ", gameSummary=" + c2344aeV + ", gameArtwork=" + c2331aeI + ")";
        }

        public n(String str, C2344aeV c2344aeV, C2331aeI c2331aeI) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2344aeV, "");
            C8632dsu.c((Object) c2331aeI, "");
            this.c = str;
            this.b = c2344aeV;
            this.d = c2331aeI;
        }
    }

    /* renamed from: o.Yz$i */
    /* loaded from: classes6.dex */
    public static final class i {
        private final String a;
        private final String b;
        private final String d;

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.b, (Object) iVar.b) && C8632dsu.c((Object) this.d, (Object) iVar.d) && C8632dsu.c((Object) this.a, (Object) iVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            String str3 = this.a;
            return "HorizontalArtwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public i(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = str2;
            this.a = str3;
        }
    }

    /* renamed from: o.Yz$o */
    /* loaded from: classes6.dex */
    public static final class o {
        private final String b;
        private final String d;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return C8632dsu.c((Object) this.b, (Object) oVar.b) && C8632dsu.c((Object) this.d, (Object) oVar.d) && C8632dsu.c((Object) this.e, (Object) oVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            String str3 = this.e;
            return "VerticalArtwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public o(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = str2;
            this.e = str3;
        }
    }

    /* renamed from: o.Yz$l */
    /* loaded from: classes6.dex */
    public static final class l {
        private final Integer a;
        private final String d;
        private final List<d> e;

        public final List<d> c() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        public final Integer e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return C8632dsu.c((Object) this.d, (Object) lVar.d) && C8632dsu.c(this.e, lVar.e) && C8632dsu.c(this.a, lVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            List<d> list = this.e;
            int hashCode2 = list == null ? 0 : list.hashCode();
            Integer num = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            List<d> list = this.e;
            Integer num = this.a;
            return "TrailerEntities(__typename=" + str + ", edges=" + list + ", totalCount=" + num + ")";
        }

        public l(String str, List<d> list, Integer num) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = list;
            this.a = num;
        }
    }

    /* renamed from: o.Yz$d */
    /* loaded from: classes6.dex */
    public static final class d {
        private final j a;
        private final String c;
        private final String e;

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.e;
        }

        public final j d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            j jVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            j jVar = this.a;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + jVar + ")";
        }

        public d(String str, String str2, j jVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = str2;
            this.a = jVar;
        }
    }

    /* renamed from: o.Yz$j */
    /* loaded from: classes6.dex */
    public static final class j {
        private final String b;
        private final k e;

        public final k a() {
            return this.e;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.b, (Object) jVar.b) && C8632dsu.c(this.e, jVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            k kVar = this.e;
            return "Node(__typename=" + str + ", onSupplemental=" + kVar + ")";
        }

        public j(String str, k kVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) kVar, "");
            this.b = str;
            this.e = kVar;
        }
    }

    /* renamed from: o.Yz$k */
    /* loaded from: classes6.dex */
    public static final class k {
        private final m a;
        private final h b;
        private final int d;
        private final Integer e;

        public final m a() {
            return this.a;
        }

        public final int b() {
            return this.d;
        }

        public final h c() {
            return this.b;
        }

        public final Integer e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return this.d == kVar.d && C8632dsu.c(this.e, kVar.e) && C8632dsu.c(this.b, kVar.b) && C8632dsu.c(this.a, kVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.d);
            Integer num = this.e;
            int hashCode2 = num == null ? 0 : num.hashCode();
            h hVar = this.b;
            int hashCode3 = hVar == null ? 0 : hVar.hashCode();
            m mVar = this.a;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (mVar != null ? mVar.hashCode() : 0);
        }

        public String toString() {
            int i = this.d;
            Integer num = this.e;
            h hVar = this.b;
            m mVar = this.a;
            return "OnSupplemental(videoId=" + i + ", runtimeSec=" + num + ", interestingArtwork=" + hVar + ", verticalInterestingArtwork=" + mVar + ")";
        }

        public k(int i, Integer num, h hVar, m mVar) {
            this.d = i;
            this.e = num;
            this.b = hVar;
            this.a = mVar;
        }
    }

    /* renamed from: o.Yz$h */
    /* loaded from: classes6.dex */
    public static final class h {
        private final String a;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.e, (Object) hVar.e) && C8632dsu.c((Object) this.a, (Object) hVar.a) && C8632dsu.c((Object) this.d, (Object) hVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            String str3 = this.d;
            return "InterestingArtwork(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public h(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = str2;
            this.d = str3;
        }
    }

    /* renamed from: o.Yz$m */
    /* loaded from: classes6.dex */
    public static final class m {
        private final String c;
        private final String d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return C8632dsu.c((Object) this.d, (Object) mVar.d) && C8632dsu.c((Object) this.e, (Object) mVar.e) && C8632dsu.c((Object) this.c, (Object) mVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.e;
            String str3 = this.c;
            return "VerticalInterestingArtwork(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public m(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = str2;
            this.c = str3;
        }
    }

    /* renamed from: o.Yz$f */
    /* loaded from: classes6.dex */
    public static final class f {
        private final String b;
        private final String d;

        public final String b() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.d, (Object) fVar.d) && C8632dsu.c((Object) this.b, (Object) fVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            return "GatewayRequestDetails(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public f(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = str2;
        }
    }

    /* renamed from: o.Yz$e */
    /* loaded from: classes6.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
