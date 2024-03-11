package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import com.netflix.mediaclient.graphql.models.type.TitleGroupMemberKind;
import com.netflix.mediaclient.graphql.models.type.WatchStatus;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1362Yt;
import o.C2285adP;
import o.C2286adQ;
import o.C2288adS;
import o.C2291adV;
import o.C2294adY;
import o.C2330aeH;
import o.C2332aeJ;
import o.C2349aea;
import o.C2377afB;
import o.C2413afl;
import o.C2558aiO;
import o.C2632ajj;

/* renamed from: o.aaJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2114aaJ {
    public static final C2114aaJ e = new C2114aaJ();

    /* renamed from: o.aaJ$h  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2120h implements InterfaceC8949gP<C1362Yt.C1368g> {
        public static final C2120h b = new C2120h();
        private static final List<String> e;

        private C2120h() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEOS, "gatewayRequestDetails", "trackIdSdpSource", "trackIdMdpSource", "trackIdSdp", "trackIdMdp", "trackIdTrailers");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1362Yt.C1368g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            List list = null;
            C1362Yt.n nVar = null;
            while (true) {
                switch (jsonReader.a(e)) {
                    case 0:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(E.d, true)))).b(jsonReader, c9028hp);
                        break;
                    case 1:
                        nVar = (C1362Yt.n) C8953gT.d(C8953gT.c(o.d, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        num = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num2 = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num3 = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        num4 = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        num5 = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (num != null) {
                            int intValue = num.intValue();
                            if (num2 != null) {
                                int intValue2 = num2.intValue();
                                if (num3 != null) {
                                    int intValue3 = num3.intValue();
                                    if (num4 != null) {
                                        int intValue4 = num4.intValue();
                                        if (num5 != null) {
                                            return new C1362Yt.C1368g(list, nVar, intValue, intValue2, intValue3, intValue4, num5.intValue());
                                        }
                                        C8956gW.a(jsonReader, "trackIdTrailers");
                                        throw new KotlinNothingValueException();
                                    }
                                    C8956gW.a(jsonReader, "trackIdMdp");
                                    throw new KotlinNothingValueException();
                                }
                                C8956gW.a(jsonReader, "trackIdSdp");
                                throw new KotlinNothingValueException();
                            }
                            C8956gW.a(jsonReader, "trackIdMdpSource");
                            throw new KotlinNothingValueException();
                        }
                        C8956gW.a(jsonReader, "trackIdSdpSource");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.C1368g c1368g) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c1368g, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(E.d, true)))).e(interfaceC9069id, c9028hp, c1368g.j());
            interfaceC9069id.e("gatewayRequestDetails");
            C8953gT.d(C8953gT.c(o.d, false, 1, null)).e(interfaceC9069id, c9028hp, c1368g.d());
            interfaceC9069id.e("trackIdSdpSource");
            InterfaceC8949gP<Integer> interfaceC8949gP = C8953gT.j;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1368g.e()));
            interfaceC9069id.e("trackIdMdpSource");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1368g.a()));
            interfaceC9069id.e("trackIdSdp");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1368g.b()));
            interfaceC9069id.e("trackIdMdp");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1368g.c()));
            interfaceC9069id.e("trackIdTrailers");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(c1368g.i()));
        }
    }

    private C2114aaJ() {
    }

    /* renamed from: o.aaJ$E */
    /* loaded from: classes3.dex */
    public static final class E implements InterfaceC8949gP<C1362Yt.G> {
        private static final List<String> a;
        public static final E d = new E();

        private E() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_TITLE, SignupConstants.Field.VIDEO_ID, "unifiedEntityId", "latestYear", "isAvailable", "hasOriginalTreatment", "storyArt", "brandAndGenreBadge", "boxshot", "playbackBadges", "isPlayable", "isAvailableForDownload", "watchStatus", "actors", "creators", "directors", "isInPlaylist", "isInRemindMeList", "thumbRatingV2", "isEpisodeNumberHidden", "isInTurboCollections", "similarVideos", "titleGroupMemberships", "supplementalVideosList", "promoVideo");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.G b(JsonReader jsonReader, C9028hp c9028hp) {
            List list;
            Boolean bool;
            C1362Yt.y yVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num2 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            C1362Yt.A a2 = null;
            C1362Yt.C1366d c1366d = null;
            C1362Yt.e eVar = null;
            List list2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            WatchStatus watchStatus = null;
            C1362Yt.C1363a c1363a = null;
            C1362Yt.h hVar = null;
            C1362Yt.j jVar = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            ThumbRating thumbRating = null;
            Boolean bool8 = null;
            List list3 = null;
            List list4 = null;
            List list5 = null;
            C1362Yt.z zVar = null;
            C1362Yt.x xVar = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        list = list2;
                        bool = bool4;
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        list = list2;
                        bool = bool4;
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        list = list2;
                        bool = bool4;
                        num = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        list = list2;
                        bool = bool4;
                        str3 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        list = list2;
                        bool = bool4;
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        list = list2;
                        bool = bool4;
                        bool2 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        list = list2;
                        bool = bool4;
                        bool3 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        list = list2;
                        bool = bool4;
                        a2 = (C1362Yt.A) C8953gT.d(C8953gT.c(A.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        list = list2;
                        bool = bool4;
                        c1366d = (C1362Yt.C1366d) C8953gT.d(C8953gT.c(C2115a.b, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 9:
                        list = list2;
                        bool = bool4;
                        eVar = (C1362Yt.e) C8953gT.d(C8953gT.c(C2118d.c, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 10:
                        list2 = (List) C8953gT.d(C8953gT.a(C8953gT.d(C3483azo.e))).b(jsonReader, c9028hp);
                        continue;
                    case 11:
                        bool4 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 12:
                        bool5 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 13:
                        watchStatus = (WatchStatus) C8953gT.d(C1472aCo.b).b(jsonReader, c9028hp);
                        continue;
                    case 14:
                        c1363a = (C1362Yt.C1363a) C8953gT.d(C8953gT.a(C2119e.a, true)).b(jsonReader, c9028hp);
                        continue;
                    case 15:
                        hVar = (C1362Yt.h) C8953gT.d(C8953gT.a(f.c, true)).b(jsonReader, c9028hp);
                        continue;
                    case 16:
                        jVar = (C1362Yt.j) C8953gT.d(C8953gT.a(g.c, true)).b(jsonReader, c9028hp);
                        continue;
                    case 17:
                        bool6 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 18:
                        bool7 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 19:
                        thumbRating = (ThumbRating) C8953gT.d(C3456azN.d).b(jsonReader, c9028hp);
                        continue;
                    case 20:
                        bool8 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 21:
                        list3 = (List) C8953gT.d(C8953gT.a(C8953gT.j)).b(jsonReader, c9028hp);
                        continue;
                    case 22:
                        list4 = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(z.c, true)))).b(jsonReader, c9028hp);
                        continue;
                    case 23:
                        list = list2;
                        bool = bool4;
                        list5 = (List) C8953gT.d(C8953gT.a(C8953gT.c(C.b, false, 1, null))).b(jsonReader, c9028hp);
                        break;
                    case 24:
                        list = list2;
                        bool = bool4;
                        zVar = (C1362Yt.z) C8953gT.d(C8953gT.c(D.c, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 25:
                        list = list2;
                        bool = bool4;
                        xVar = (C1362Yt.x) C8953gT.d(C8953gT.c(u.c, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    default:
                        List list6 = list2;
                        Boolean bool9 = bool4;
                        if (str == null) {
                            throw new IllegalStateException("__typename was not found".toString());
                        }
                        if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                            jsonReader.q();
                            yVar = y.d.b(jsonReader, c9028hp);
                        } else {
                            yVar = null;
                        }
                        C1362Yt.y yVar2 = yVar;
                        C1362Yt.v vVar = null;
                        if (C9014hb.d(C9014hb.c("Movie"), c9028hp.f, str, c9028hp.d, null)) {
                            jsonReader.q();
                            vVar = p.d.b(jsonReader, c9028hp);
                        }
                        jsonReader.q();
                        C2278adI b = C2285adP.b.e.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2287adR b2 = C2288adS.a.c.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2412afk b3 = C2413afl.d.a.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2560aiQ b4 = C2558aiO.a.e.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2282adM b5 = C2286adQ.a.c.b(jsonReader, c9028hp);
                        if (num != null) {
                            int intValue = num.intValue();
                            if (str3 != null) {
                                return new C1362Yt.G(str, str2, intValue, str3, num2, bool2, bool3, a2, c1366d, eVar, list6, bool9, bool5, watchStatus, c1363a, hVar, jVar, bool6, bool7, thumbRating, bool8, list3, list4, list5, zVar, xVar, yVar2, vVar, b, b2, b3, b4, b5);
                            }
                            C8956gW.a(jsonReader, "unifiedEntityId");
                            throw new KotlinNothingValueException();
                        }
                        C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                        throw new KotlinNothingValueException();
                }
                bool4 = bool;
                list2 = list;
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.G g) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) g, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, g.A());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, g.u());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            InterfaceC8949gP<Integer> interfaceC8949gP2 = C8953gT.j;
            interfaceC8949gP2.e(interfaceC9069id, c9028hp, Integer.valueOf(g.v()));
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, g.w());
            interfaceC9069id.e("latestYear");
            C8953gT.n.e(interfaceC9069id, c9028hp, g.m());
            interfaceC9069id.e("isAvailable");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, g.D());
            interfaceC9069id.e("hasOriginalTreatment");
            c8994hH.e(interfaceC9069id, c9028hp, g.h());
            interfaceC9069id.e("storyArt");
            C8953gT.d(C8953gT.c(A.e, false, 1, null)).e(interfaceC9069id, c9028hp, g.q());
            interfaceC9069id.e("brandAndGenreBadge");
            C8953gT.d(C8953gT.c(C2115a.b, false, 1, null)).e(interfaceC9069id, c9028hp, g.e());
            interfaceC9069id.e("boxshot");
            C8953gT.d(C8953gT.c(C2118d.c, false, 1, null)).e(interfaceC9069id, c9028hp, g.d());
            interfaceC9069id.e("playbackBadges");
            C8953gT.d(C8953gT.a(C8953gT.d(C3483azo.e))).e(interfaceC9069id, c9028hp, g.o());
            interfaceC9069id.e("isPlayable");
            c8994hH.e(interfaceC9069id, c9028hp, g.G());
            interfaceC9069id.e("isAvailableForDownload");
            c8994hH.e(interfaceC9069id, c9028hp, g.B());
            interfaceC9069id.e("watchStatus");
            C8953gT.d(C1472aCo.b).e(interfaceC9069id, c9028hp, g.y());
            interfaceC9069id.e("actors");
            C8953gT.d(C8953gT.a(C2119e.a, true)).e(interfaceC9069id, c9028hp, g.b());
            interfaceC9069id.e("creators");
            C8953gT.d(C8953gT.a(f.c, true)).e(interfaceC9069id, c9028hp, g.i());
            interfaceC9069id.e("directors");
            C8953gT.d(C8953gT.a(g.c, true)).e(interfaceC9069id, c9028hp, g.g());
            interfaceC9069id.e("isInPlaylist");
            c8994hH.e(interfaceC9069id, c9028hp, g.z());
            interfaceC9069id.e("isInRemindMeList");
            c8994hH.e(interfaceC9069id, c9028hp, g.F());
            interfaceC9069id.e("thumbRatingV2");
            C8953gT.d(C3456azN.d).e(interfaceC9069id, c9028hp, g.s());
            interfaceC9069id.e("isEpisodeNumberHidden");
            c8994hH.e(interfaceC9069id, c9028hp, g.C());
            interfaceC9069id.e("isInTurboCollections");
            C8953gT.d(C8953gT.a(interfaceC8949gP2)).e(interfaceC9069id, c9028hp, g.E());
            interfaceC9069id.e("similarVideos");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(z.c, true)))).e(interfaceC9069id, c9028hp, g.r());
            interfaceC9069id.e("titleGroupMemberships");
            C8953gT.d(C8953gT.a(C8953gT.c(C.b, false, 1, null))).e(interfaceC9069id, c9028hp, g.x());
            interfaceC9069id.e("supplementalVideosList");
            C8953gT.d(C8953gT.c(D.c, false, 1, null)).e(interfaceC9069id, c9028hp, g.t());
            interfaceC9069id.e("promoVideo");
            C8953gT.d(C8953gT.c(u.c, false, 1, null)).e(interfaceC9069id, c9028hp, g.k());
            if (g.l() != null) {
                y.d.e(interfaceC9069id, c9028hp, g.l());
            }
            if (g.n() != null) {
                p.d.e(interfaceC9069id, c9028hp, g.n());
            }
            C2285adP.b.e.e(interfaceC9069id, c9028hp, g.a());
            C2288adS.a.c.e(interfaceC9069id, c9028hp, g.j());
            C2413afl.d.a.e(interfaceC9069id, c9028hp, g.f());
            C2558aiO.a.e.e(interfaceC9069id, c9028hp, g.p());
            C2286adQ.a.c.e(interfaceC9069id, c9028hp, g.c());
        }
    }

    /* renamed from: o.aaJ$A */
    /* loaded from: classes3.dex */
    public static final class A implements InterfaceC8949gP<C1362Yt.A> {
        private static final List<String> c;
        public static final A e = new A();

        private A() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "available", SignupConstants.Field.URL);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.A b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.A(str, bool, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.A a) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) a, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, a.b());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, a.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, a.e());
        }
    }

    /* renamed from: o.aaJ$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2115a implements InterfaceC8949gP<C1362Yt.C1366d> {
        public static final C2115a b = new C2115a();
        private static final List<String> d;

        private C2115a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, "available");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1362Yt.C1366d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.C1366d(str, str2, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.C1366d c1366d) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c1366d, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c1366d.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, c1366d.e());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, c1366d.d());
        }
    }

    /* renamed from: o.aaJ$d  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2118d implements InterfaceC8949gP<C1362Yt.e> {
        private static final List<String> a;
        public static final C2118d c = new C2118d();

        private C2118d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, "available");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1362Yt.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.e(str, str2, str3, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.aaJ$e  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2119e implements InterfaceC8949gP<C1362Yt.C1363a> {
        public static final C2119e a = new C2119e();
        private static final List<String> d;

        private C2119e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.C1363a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2290adU b = C2291adV.b.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1362Yt.C1363a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.C1363a c1363a) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c1363a, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c1363a.b());
            C2291adV.b.a.e(interfaceC9069id, c9028hp, c1363a.a());
        }
    }

    /* renamed from: o.aaJ$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C1362Yt.h> {
        private static final List<String> a;
        public static final f c = new f();

        private f() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1362Yt.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2290adU b = C2291adV.b.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1362Yt.h(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.a());
            C2291adV.b.a.e(interfaceC9069id, c9028hp, hVar.b());
        }
    }

    /* renamed from: o.aaJ$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C1362Yt.j> {
        public static final g c = new g();
        private static final List<String> e;

        private g() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1362Yt.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2290adU b = C2291adV.b.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1362Yt.j(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.c());
            C2291adV.b.a.e(interfaceC9069id, c9028hp, jVar.e());
        }
    }

    /* renamed from: o.aaJ$z */
    /* loaded from: classes3.dex */
    public static final class z implements InterfaceC8949gP<C1362Yt.D> {
        private static final List<String> a;
        public static final z c = new z();

        private z() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "boxshot");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1362Yt.D b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1362Yt.C1365c c1365c = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    c1365c = (C1362Yt.C1365c) C8953gT.d(C8953gT.c(C2117c.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1362Yt.D(str, c1365c, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.D d) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) d, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, d.e());
            interfaceC9069id.e("boxshot");
            C8953gT.d(C8953gT.c(C2117c.a, false, 1, null)).e(interfaceC9069id, c9028hp, d.c());
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, d.b());
        }
    }

    /* renamed from: o.aaJ$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2117c implements InterfaceC8949gP<C1362Yt.C1365c> {
        public static final C2117c a = new C2117c();
        private static final List<String> d;

        private C2117c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1362Yt.C1365c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.C1365c(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.C1365c c1365c) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c1365c, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c1365c.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c1365c.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, c1365c.e());
        }
    }

    /* renamed from: o.aaJ$C */
    /* loaded from: classes3.dex */
    public static final class C implements InterfaceC8949gP<C1362Yt.I> {
        public static final C b = new C();
        private static final List<String> e;

        private C() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "kind", "siblings");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1362Yt.I b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            TitleGroupMemberKind titleGroupMemberKind = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    titleGroupMemberKind = (TitleGroupMemberKind) C8953gT.d(C3458azP.a).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.a(B.c, true))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.I(str, titleGroupMemberKind, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.I i) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) i, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, i.d());
            interfaceC9069id.e("kind");
            C8953gT.d(C3458azP.a).e(interfaceC9069id, c9028hp, i.a());
            interfaceC9069id.e("siblings");
            C8953gT.d(C8953gT.a(C8953gT.a(B.c, true))).e(interfaceC9069id, c9028hp, i.b());
        }
    }

    /* renamed from: o.aaJ$B */
    /* loaded from: classes3.dex */
    public static final class B implements InterfaceC8949gP<C1362Yt.B> {
        public static final B c = new B();
        private static final List<String> d;

        private B() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "boxshot");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1362Yt.B b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1362Yt.C1364b c1364b = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    c1364b = (C1362Yt.C1364b) C8953gT.d(C8953gT.c(C2116b.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1362Yt.B(str, c1364b, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.B b) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) b, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, b.d());
            interfaceC9069id.e("boxshot");
            C8953gT.d(C8953gT.c(C2116b.c, false, 1, null)).e(interfaceC9069id, c9028hp, b.a());
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, b.c());
        }
    }

    /* renamed from: o.aaJ$b  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2116b implements InterfaceC8949gP<C1362Yt.C1364b> {
        private static final List<String> a;
        public static final C2116b c = new C2116b();

        private C2116b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.C1364b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.C1364b(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.C1364b c1364b) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c1364b, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c1364b.b());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c1364b.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, c1364b.a());
        }
    }

    /* renamed from: o.aaJ$D */
    /* loaded from: classes3.dex */
    public static final class D implements InterfaceC8949gP<C1362Yt.z> {
        public static final D c = new D();
        private static final List<String> e;

        private D() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1362Yt.z b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(j.d, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.z(str, num, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.z zVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) zVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, zVar.d());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, zVar.e());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(j.d, false, 1, null)))).e(interfaceC9069id, c9028hp, zVar.a());
        }
    }

    /* renamed from: o.aaJ$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C1362Yt.k> {
        private static final List<String> c;
        public static final j d = new j();

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1362Yt.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C1362Yt.r rVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    rVar = (C1362Yt.r) C8953gT.d(C8953gT.a(t.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.k(str, str2, rVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, kVar.c());
            interfaceC9069id.e("cursor");
            C8953gT.t.e(interfaceC9069id, c9028hp, kVar.e());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(t.d, true)).e(interfaceC9069id, c9028hp, kVar.a());
        }
    }

    /* renamed from: o.aaJ$t */
    /* loaded from: classes3.dex */
    public static final class t implements InterfaceC8949gP<C1362Yt.r> {
        private static final List<String> b;
        public static final t d = new t();

        private t() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "interestingArtworkLarge");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.r b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1362Yt.p pVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    pVar = (C1362Yt.p) C8953gT.d(C8953gT.c(n.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2630ajh b2 = C2632ajj.e.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2295adZ b3 = C2294adY.c.c.b(jsonReader, c9028hp);
            jsonReader.q();
            C2289adT b4 = C2349aea.d.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1362Yt.r(str, pVar, b2, b3, b4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.r rVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) rVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, rVar.e());
            interfaceC9069id.e("interestingArtworkLarge");
            C8953gT.d(C8953gT.c(n.a, false, 1, null)).e(interfaceC9069id, c9028hp, rVar.a());
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, rVar.d());
            C2294adY.c.c.e(interfaceC9069id, c9028hp, rVar.b());
            C2349aea.d.c.e(interfaceC9069id, c9028hp, rVar.c());
        }
    }

    /* renamed from: o.aaJ$n */
    /* loaded from: classes3.dex */
    public static final class n implements InterfaceC8949gP<C1362Yt.p> {
        public static final n a = new n();
        private static final List<String> d;

        private n() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1362Yt.p b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.p(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.p pVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) pVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, pVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, pVar.e());
        }
    }

    /* renamed from: o.aaJ$u */
    /* loaded from: classes3.dex */
    public static final class u implements InterfaceC8949gP<C1362Yt.x> {
        public static final u c = new u();
        private static final List<String> e;

        private u() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "computeId", "video");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1362Yt.x b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C1362Yt.F f = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    f = (C1362Yt.F) C8953gT.d(C8953gT.a(H.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.x(str, str2, f);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.x xVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) xVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, xVar.d());
            interfaceC9069id.e("computeId");
            C8953gT.t.e(interfaceC9069id, c9028hp, xVar.b());
            interfaceC9069id.e("video");
            C8953gT.d(C8953gT.a(H.d, true)).e(interfaceC9069id, c9028hp, xVar.c());
        }
    }

    /* renamed from: o.aaJ$H */
    /* loaded from: classes3.dex */
    public static final class H implements InterfaceC8949gP<C1362Yt.F> {
        private static final List<String> c;
        public static final H d = new H();

        private H() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.F b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1362Yt.w wVar = null;
            String str = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                wVar = v.e.b(jsonReader, c9028hp);
            }
            if (num != null) {
                return new C1362Yt.F(str, num.intValue(), wVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.F f) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) f, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, f.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(f.a()));
            if (f.c() != null) {
                v.e.e(interfaceC9069id, c9028hp, f.c());
            }
        }
    }

    /* renamed from: o.aaJ$v */
    /* loaded from: classes3.dex */
    public static final class v implements InterfaceC8949gP<C1362Yt.w> {
        private static final List<String> b;
        public static final v e = new v();

        private v() {
        }

        static {
            List<String> j;
            j = C8569dql.j("runtimeMs", "runtimeSec", "displayRuntimeMs", "displayRuntimeSec");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.w b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num3 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    num4 = C8953gT.n.b(jsonReader, c9028hp);
                } else {
                    return new C1362Yt.w(num, num2, num3, num4);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.w wVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) wVar, "");
            interfaceC9069id.e("runtimeMs");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, wVar.e());
            interfaceC9069id.e("runtimeSec");
            c8994hH.e(interfaceC9069id, c9028hp, wVar.b());
            interfaceC9069id.e("displayRuntimeMs");
            c8994hH.e(interfaceC9069id, c9028hp, wVar.a());
            interfaceC9069id.e("displayRuntimeSec");
            c8994hH.e(interfaceC9069id, c9028hp, wVar.d());
        }
    }

    /* renamed from: o.aaJ$y */
    /* loaded from: classes3.dex */
    public static final class y implements InterfaceC8949gP<C1362Yt.y> {
        private static final List<String> c;
        public static final y d = new y();

        private y() {
        }

        static {
            List<String> j;
            j = C8569dql.j("numSeasonsLabel", "currentEpisode", "nextLiveEvent", "seasons");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1362Yt.y b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1362Yt.C1367f c1367f = null;
            C1362Yt.s sVar = null;
            C1362Yt.C c2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    c1367f = (C1362Yt.C1367f) C8953gT.d(C8953gT.a(i.e, true)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    sVar = (C1362Yt.s) C8953gT.d(C8953gT.a(r.b, true)).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    c2 = (C1362Yt.C) C8953gT.d(C8953gT.c(x.b, false, 1, null)).b(jsonReader, c9028hp);
                } else {
                    return new C1362Yt.y(str, c1367f, sVar, c2);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.y yVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) yVar, "");
            interfaceC9069id.e("numSeasonsLabel");
            C8953gT.t.e(interfaceC9069id, c9028hp, yVar.c());
            interfaceC9069id.e("currentEpisode");
            C8953gT.d(C8953gT.a(i.e, true)).e(interfaceC9069id, c9028hp, yVar.b());
            interfaceC9069id.e("nextLiveEvent");
            C8953gT.d(C8953gT.a(r.b, true)).e(interfaceC9069id, c9028hp, yVar.e());
            interfaceC9069id.e("seasons");
            C8953gT.d(C8953gT.c(x.b, false, 1, null)).e(interfaceC9069id, c9028hp, yVar.d());
        }
    }

    /* renamed from: o.aaJ$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C1362Yt.C1367f> {
        private static final List<String> d;
        public static final i e = new i();

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_TITLE, SignupConstants.Field.VIDEO_ID, "number", "parentSeason");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1362Yt.C1367f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            Integer num2 = null;
            C1362Yt.u uVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    uVar = (C1362Yt.u) C8953gT.d(C8953gT.c(w.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2287adR b = C2288adS.a.c.b(jsonReader, c9028hp);
            jsonReader.q();
            C2295adZ b2 = C2294adY.c.c.b(jsonReader, c9028hp);
            jsonReader.q();
            C2289adT b3 = C2349aea.d.c.b(jsonReader, c9028hp);
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1362Yt.C1367f(str, str2, num.intValue(), num2, uVar, b, b2, b3);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.C1367f c1367f) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c1367f, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c1367f.g());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, c1367f.f());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c1367f.j()));
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, c1367f.b());
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.c(w.c, false, 1, null)).e(interfaceC9069id, c9028hp, c1367f.e());
            C2288adS.a.c.e(interfaceC9069id, c9028hp, c1367f.c());
            C2294adY.c.c.e(interfaceC9069id, c9028hp, c1367f.a());
            C2349aea.d.c.e(interfaceC9069id, c9028hp, c1367f.d());
        }
    }

    /* renamed from: o.aaJ$w */
    /* loaded from: classes3.dex */
    public static final class w implements InterfaceC8949gP<C1362Yt.u> {
        private static final List<String> a;
        public static final w c = new w();

        private w() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, SignupConstants.Field.VIDEO_TITLE, "numberLabelV2", "seasonSeqAbbrLabel", "number");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1362Yt.u b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1362Yt.u(str, num.intValue(), str2, str3, str4, num2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.u uVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) uVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, uVar.h());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(uVar.d()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, uVar.c());
            interfaceC9069id.e("numberLabelV2");
            c8994hH.e(interfaceC9069id, c9028hp, uVar.b());
            interfaceC9069id.e("seasonSeqAbbrLabel");
            c8994hH.e(interfaceC9069id, c9028hp, uVar.a());
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, uVar.e());
        }
    }

    /* renamed from: o.aaJ$r */
    /* loaded from: classes3.dex */
    public static final class r implements InterfaceC8949gP<C1362Yt.s> {
        public static final r b = new r();
        private static final List<String> e;

        private r() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "event");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.s b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1362Yt.o oVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    oVar = (C1362Yt.o) C8953gT.d(C8953gT.a(l.b, true)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2436afz b2 = C2377afB.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1362Yt.s(str, oVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.s sVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) sVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, sVar.d());
            interfaceC9069id.e("event");
            C8953gT.d(C8953gT.a(l.b, true)).e(interfaceC9069id, c9028hp, sVar.e());
            C2377afB.d.e.e(interfaceC9069id, c9028hp, sVar.b());
        }
    }

    /* renamed from: o.aaJ$l */
    /* loaded from: classes3.dex */
    public static final class l implements InterfaceC8949gP<C1362Yt.o> {
        public static final l b = new l();
        private static final List<String> d;

        private l() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.o b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1362Yt.q qVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                qVar = s.b.b(jsonReader, c9028hp);
            }
            return new C1362Yt.o(str, qVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.o oVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) oVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, oVar.a());
            if (oVar.b() != null) {
                s.b.e(interfaceC9069id, c9028hp, oVar.b());
            }
        }
    }

    /* renamed from: o.aaJ$s */
    /* loaded from: classes3.dex */
    public static final class s implements InterfaceC8949gP<C1362Yt.q> {
        private static final List<String> a;
        public static final s b = new s();

        private s() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "number");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1362Yt.q b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1362Yt.q(str, num.intValue(), num2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.q qVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) qVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, qVar.b());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(qVar.c()));
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, qVar.d());
        }
    }

    /* renamed from: o.aaJ$x */
    /* loaded from: classes3.dex */
    public static final class x implements InterfaceC8949gP<C1362Yt.C> {
        public static final x b = new x();
        private static final List<String> c;

        private x() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1362Yt.C b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(k.a, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.C(str, num, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.C c2) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2.d());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2.e());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(k.a, false, 1, null)))).e(interfaceC9069id, c9028hp, c2.b());
        }
    }

    /* renamed from: o.aaJ$k */
    /* loaded from: classes3.dex */
    public static final class k implements InterfaceC8949gP<C1362Yt.l> {
        public static final k a = new k();
        private static final List<String> b;

        private k() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.l b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1362Yt.t tVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    tVar = (C1362Yt.t) C8953gT.d(C8953gT.c(q.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.l(str, tVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.l lVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) lVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, lVar.d());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(q.c, false, 1, null)).e(interfaceC9069id, c9028hp, lVar.b());
        }
    }

    /* renamed from: o.aaJ$q */
    /* loaded from: classes3.dex */
    public static final class q implements InterfaceC8949gP<C1362Yt.t> {
        public static final q c = new q();
        private static final List<String> e;

        private q() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, SignupConstants.Field.VIDEO_TITLE, "unifiedEntityId", "number", "numberLabelV2", "releaseYear", "episodes");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.t b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num2 = null;
            String str4 = null;
            Integer num3 = null;
            C1362Yt.m mVar = null;
            while (true) {
                switch (jsonReader.a(e)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        num = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str3 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        num3 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        mVar = (C1362Yt.m) C8953gT.d(C8953gT.a(m.a, true)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (num != null) {
                            int intValue = num.intValue();
                            if (str3 != null) {
                                return new C1362Yt.t(str, intValue, str2, str3, num2, str4, num3, mVar);
                            }
                            C8956gW.a(jsonReader, "unifiedEntityId");
                            throw new KotlinNothingValueException();
                        } else {
                            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.t tVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) tVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, tVar.h());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(tVar.f()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, tVar.a());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, tVar.j());
            interfaceC9069id.e("number");
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, tVar.e());
            interfaceC9069id.e("numberLabelV2");
            c8994hH.e(interfaceC9069id, c9028hp, tVar.b());
            interfaceC9069id.e("releaseYear");
            c8994hH2.e(interfaceC9069id, c9028hp, tVar.d());
            interfaceC9069id.e("episodes");
            C8953gT.d(C8953gT.a(m.a, true)).e(interfaceC9069id, c9028hp, tVar.c());
        }
    }

    /* renamed from: o.aaJ$m */
    /* loaded from: classes3.dex */
    public static final class m implements InterfaceC8949gP<C1362Yt.m> {
        public static final m a = new m();
        private static final List<String> c;

        private m() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.m b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2328aeF b = C2332aeJ.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1362Yt.m(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.m mVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) mVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, mVar.b());
            C2332aeJ.b.d.e(interfaceC9069id, c9028hp, mVar.c());
        }
    }

    /* renamed from: o.aaJ$p */
    /* loaded from: classes3.dex */
    public static final class p implements InterfaceC8949gP<C1362Yt.v> {
        private static final List<String> b;
        public static final p d = new p();

        private p() {
        }

        static {
            List<String> j;
            j = C8569dql.j("runtimeMs", "displayRuntimeMs");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1362Yt.v b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else {
                    jsonReader.q();
                    C2295adZ b2 = C2294adY.c.c.b(jsonReader, c9028hp);
                    jsonReader.q();
                    C2289adT b3 = C2349aea.d.c.b(jsonReader, c9028hp);
                    jsonReader.q();
                    return new C1362Yt.v(num, num2, b2, b3, C2330aeH.e.a.b(jsonReader, c9028hp));
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.v vVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) vVar, "");
            interfaceC9069id.e("runtimeMs");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, vVar.e());
            interfaceC9069id.e("displayRuntimeMs");
            c8994hH.e(interfaceC9069id, c9028hp, vVar.b());
            C2294adY.c.c.e(interfaceC9069id, c9028hp, vVar.c());
            C2349aea.d.c.e(interfaceC9069id, c9028hp, vVar.a());
            C2330aeH.e.a.e(interfaceC9069id, c9028hp, vVar.d());
        }
    }

    /* renamed from: o.aaJ$o */
    /* loaded from: classes3.dex */
    public static final class o implements InterfaceC8949gP<C1362Yt.n> {
        private static final List<String> c;
        public static final o d = new o();

        private o() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1362Yt.n b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1362Yt.n(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1362Yt.n nVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) nVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, nVar.e());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            C8953gT.t.e(interfaceC9069id, c9028hp, nVar.a());
        }
    }
}
