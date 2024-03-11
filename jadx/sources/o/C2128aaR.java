package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.GameOrientation;
import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1375Yz;
import o.C2334aeL;
import o.C2336aeN;
import o.C2338aeP;
import o.C2341aeS;
import o.C2346aeX;

/* renamed from: o.aaR  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2128aaR {
    public static final C2128aaR a = new C2128aaR();

    /* renamed from: o.aaR$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC8949gP<C1375Yz.c> {
        public static final c d = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("games", "gatewayRequestDetails", "screenshotsTrackId", "similarsTrackId");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1375Yz.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            List list = null;
            C1375Yz.f fVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.c, true)))).b(jsonReader, c9028hp);
                } else if (a == 1) {
                    fVar = (C1375Yz.f) C8953gT.d(C8953gT.c(h.d, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    num2 = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (num2 != null) {
                    return new C1375Yz.c(list, fVar, intValue, num2.intValue());
                }
                C8956gW.a(jsonReader, "similarsTrackId");
                throw new KotlinNothingValueException();
            }
            C8956gW.a(jsonReader, "screenshotsTrackId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("games");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.c, true)))).e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("gatewayRequestDetails");
            C8953gT.d(C8953gT.c(h.d, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("screenshotsTrackId");
            InterfaceC8949gP<Integer> interfaceC8949gP = C8953gT.j;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.a()));
            interfaceC9069id.e("similarsTrackId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.c()));
        }
    }

    private C2128aaR() {
    }

    /* renamed from: o.aaR$b */
    /* loaded from: classes6.dex */
    public static final class b implements InterfaceC8949gP<C1375Yz.g> {
        private static final List<String> a;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_TITLE, "gameId", "developer", "copyrights", "features", "orientation", "deviceCompatibility", "version", "supportedLanguages", "synopsis", "releaseYear", "thumbRating", "similarGames", "horizontalArtworks", "verticalArtworks", "trailerEntities");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1375Yz.g b(JsonReader jsonReader, C9028hp c9028hp) {
            String str;
            Integer num;
            Object obj;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            C1375Yz.b bVar = null;
            String str4 = null;
            C1375Yz.a aVar = null;
            GameOrientation gameOrientation = null;
            String str5 = null;
            String str6 = null;
            List list = null;
            String str7 = null;
            Integer num3 = null;
            ThumbRating thumbRating = null;
            List list2 = null;
            List list3 = null;
            List list4 = null;
            C1375Yz.l lVar = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str2 = C8953gT.p.b(jsonReader, c9028hp);
                        num3 = num3;
                        continue;
                    case 1:
                        str = str7;
                        num = num3;
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str = str7;
                        num = num3;
                        num2 = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str = str7;
                        num = num3;
                        bVar = (C1375Yz.b) C8953gT.d(C8953gT.c(a.d, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        str = str7;
                        num = num3;
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str = str7;
                        num = num3;
                        aVar = (C1375Yz.a) C8953gT.d(C8953gT.c(d.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        gameOrientation = (GameOrientation) C8953gT.d(C3351axO.a).b(jsonReader, c9028hp);
                        continue;
                    case 7:
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        continue;
                    case 8:
                        str6 = C8953gT.t.b(jsonReader, c9028hp);
                        continue;
                    case 9:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.p)).b(jsonReader, c9028hp);
                        continue;
                    case 10:
                        str7 = C8953gT.t.b(jsonReader, c9028hp);
                        continue;
                    case 11:
                        num3 = C8953gT.n.b(jsonReader, c9028hp);
                        continue;
                    case 12:
                        thumbRating = (ThumbRating) C8953gT.d(C3456azN.d).b(jsonReader, c9028hp);
                        continue;
                    case 13:
                        list2 = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(n.a, true)))).b(jsonReader, c9028hp);
                        continue;
                    case 14:
                        str = str7;
                        num = num3;
                        list3 = (List) C8953gT.d(C8953gT.a(C8953gT.c(g.e, false, 1, null))).b(jsonReader, c9028hp);
                        break;
                    case 15:
                        str = str7;
                        num = num3;
                        obj = null;
                        list4 = (List) C8953gT.d(C8953gT.a(C8953gT.c(k.a, false, 1, null))).b(jsonReader, c9028hp);
                        break;
                    case 16:
                        str = str7;
                        num = num3;
                        obj = null;
                        lVar = (C1375Yz.l) C8953gT.d(C8953gT.c(l.a, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    default:
                        String str8 = str7;
                        Integer num4 = num3;
                        jsonReader.q();
                        C2344aeV b = C2346aeX.e.e.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2331aeI b2 = C2336aeN.a.e.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2340aeR b3 = C2338aeP.b.d.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2335aeM b4 = C2334aeL.e.a.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2339aeQ b5 = C2341aeS.b.e.b(jsonReader, c9028hp);
                        if (str2 == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (num2 != null) {
                            return new C1375Yz.g(str2, str3, num2.intValue(), bVar, str4, aVar, gameOrientation, str5, str6, list, str8, num4, thumbRating, list2, list3, list4, lVar, b, b2, b3, b4, b5);
                        } else {
                            C8956gW.a(jsonReader, "gameId");
                            throw new KotlinNothingValueException();
                        }
                }
                num3 = num;
                str7 = str;
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, gVar.y());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, gVar.t());
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(gVar.f()));
            interfaceC9069id.e("developer");
            C8953gT.d(C8953gT.c(a.d, false, 1, null)).e(interfaceC9069id, c9028hp, gVar.c());
            interfaceC9069id.e("copyrights");
            c8994hH.e(interfaceC9069id, c9028hp, gVar.e());
            interfaceC9069id.e("features");
            C8953gT.d(C8953gT.c(d.e, false, 1, null)).e(interfaceC9069id, c9028hp, gVar.d());
            interfaceC9069id.e("orientation");
            C8953gT.d(C3351axO.a).e(interfaceC9069id, c9028hp, gVar.k());
            interfaceC9069id.e("deviceCompatibility");
            c8994hH.e(interfaceC9069id, c9028hp, gVar.b());
            interfaceC9069id.e("version");
            c8994hH.e(interfaceC9069id, c9028hp, gVar.q());
            interfaceC9069id.e("supportedLanguages");
            C8953gT.d(C8953gT.a(interfaceC8949gP)).e(interfaceC9069id, c9028hp, gVar.n());
            interfaceC9069id.e("synopsis");
            c8994hH.e(interfaceC9069id, c9028hp, gVar.s());
            interfaceC9069id.e("releaseYear");
            C8953gT.n.e(interfaceC9069id, c9028hp, gVar.l());
            interfaceC9069id.e("thumbRating");
            C8953gT.d(C3456azN.d).e(interfaceC9069id, c9028hp, gVar.r());
            interfaceC9069id.e("similarGames");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(n.a, true)))).e(interfaceC9069id, c9028hp, gVar.m());
            interfaceC9069id.e("horizontalArtworks");
            C8953gT.d(C8953gT.a(C8953gT.c(g.e, false, 1, null))).e(interfaceC9069id, c9028hp, gVar.o());
            interfaceC9069id.e("verticalArtworks");
            C8953gT.d(C8953gT.a(C8953gT.c(k.a, false, 1, null))).e(interfaceC9069id, c9028hp, gVar.v());
            interfaceC9069id.e("trailerEntities");
            C8953gT.d(C8953gT.c(l.a, false, 1, null)).e(interfaceC9069id, c9028hp, gVar.p());
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, gVar.i());
            C2336aeN.a.e.e(interfaceC9069id, c9028hp, gVar.a());
            C2338aeP.b.d.e(interfaceC9069id, c9028hp, gVar.h());
            C2334aeL.e.a.e(interfaceC9069id, c9028hp, gVar.g());
            C2341aeS.b.e.e(interfaceC9069id, c9028hp, gVar.j());
        }
    }

    /* renamed from: o.aaR$a */
    /* loaded from: classes6.dex */
    public static final class a implements InterfaceC8949gP<C1375Yz.b> {
        public static final a d = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "name");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1375Yz.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1375Yz.b(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("name");
            C8953gT.t.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.aaR$d */
    /* loaded from: classes6.dex */
    public static final class d implements InterfaceC8949gP<C1375Yz.a> {
        private static final List<String> c;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "hasControllerSupport", "playerModes", "modes", "requiresConnectivity", "maximumPlayers", "minimumPlayers");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1375Yz.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            List list = null;
            List list2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            while (true) {
                switch (jsonReader.a(c)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.t)).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        list2 = (List) C8953gT.d(C8953gT.a(C8953gT.p)).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C1375Yz.a(str, str2, list, list2, str3, num, num2);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.f());
            interfaceC9069id.e("hasControllerSupport");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("playerModes");
            C8953gT.d(C8953gT.a(c8994hH)).e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("modes");
            C8953gT.d(C8953gT.a(interfaceC8949gP)).e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("requiresConnectivity");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.h());
            interfaceC9069id.e("maximumPlayers");
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("minimumPlayers");
            c8994hH2.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* renamed from: o.aaR$n */
    /* loaded from: classes6.dex */
    public static final class n implements InterfaceC8949gP<C1375Yz.n> {
        public static final n a = new n();
        private static final List<String> e;

        private n() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1375Yz.n b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2344aeV b = C2346aeX.e.e.b(jsonReader, c9028hp);
            jsonReader.q();
            C2331aeI b2 = C2336aeN.a.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1375Yz.n(str, b, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.n nVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) nVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, nVar.d());
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, nVar.e());
            C2336aeN.a.e.e(interfaceC9069id, c9028hp, nVar.b());
        }
    }

    /* renamed from: o.aaR$g */
    /* loaded from: classes6.dex */
    public static final class g implements InterfaceC8949gP<C1375Yz.i> {
        private static final List<String> d;
        public static final g e = new g();

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1375Yz.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1375Yz.i(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, iVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, iVar.c());
        }
    }

    /* renamed from: o.aaR$k */
    /* loaded from: classes6.dex */
    public static final class k implements InterfaceC8949gP<C1375Yz.o> {
        public static final k a = new k();
        private static final List<String> b;

        private k() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1375Yz.o b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(b);
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
                return new C1375Yz.o(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.o oVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) oVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, oVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, oVar.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, oVar.b());
        }
    }

    /* renamed from: o.aaR$l */
    /* loaded from: classes6.dex */
    public static final class l implements InterfaceC8949gP<C1375Yz.l> {
        public static final l a = new l();
        private static final List<String> c;

        private l() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges", "totalCount");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1375Yz.l b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            Integer num = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(e.d, false, 1, null)))).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1375Yz.l(str, list, num);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.l lVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) lVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, lVar.d());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(e.d, false, 1, null)))).e(interfaceC9069id, c9028hp, lVar.c());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, lVar.e());
        }
    }

    /* renamed from: o.aaR$e */
    /* loaded from: classes6.dex */
    public static final class e implements InterfaceC8949gP<C1375Yz.d> {
        private static final List<String> b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1375Yz.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C1375Yz.j jVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    jVar = (C1375Yz.j) C8953gT.d(C8953gT.a(f.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1375Yz.d(str, str2, jVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("cursor");
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(f.d, true)).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.aaR$f */
    /* loaded from: classes6.dex */
    public static final class f implements InterfaceC8949gP<C1375Yz.j> {
        private static final List<String> a;
        public static final f d = new f();

        private f() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1375Yz.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C1375Yz.k b = i.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1375Yz.j(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.b());
            i.a.e(interfaceC9069id, c9028hp, jVar.a());
        }
    }

    /* renamed from: o.aaR$i */
    /* loaded from: classes6.dex */
    public static final class i implements InterfaceC8949gP<C1375Yz.k> {
        public static final i a = new i();
        private static final List<String> b;

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "runtimeSec", "interestingArtwork", "verticalInterestingArtwork");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1375Yz.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            C1375Yz.h hVar = null;
            C1375Yz.m mVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    hVar = (C1375Yz.h) C8953gT.d(C8953gT.c(j.b, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    mVar = (C1375Yz.m) C8953gT.d(C8953gT.c(o.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C1375Yz.k(num.intValue(), num2, hVar, mVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(kVar.b()));
            interfaceC9069id.e("runtimeSec");
            C8953gT.n.e(interfaceC9069id, c9028hp, kVar.e());
            interfaceC9069id.e("interestingArtwork");
            C8953gT.d(C8953gT.c(j.b, false, 1, null)).e(interfaceC9069id, c9028hp, kVar.c());
            interfaceC9069id.e("verticalInterestingArtwork");
            C8953gT.d(C8953gT.c(o.d, false, 1, null)).e(interfaceC9069id, c9028hp, kVar.a());
        }
    }

    /* renamed from: o.aaR$j */
    /* loaded from: classes6.dex */
    public static final class j implements InterfaceC8949gP<C1375Yz.h> {
        private static final List<String> a;
        public static final j b = new j();

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1375Yz.h b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C1375Yz.h(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, hVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, hVar.a());
        }
    }

    /* renamed from: o.aaR$o */
    /* loaded from: classes6.dex */
    public static final class o implements InterfaceC8949gP<C1375Yz.m> {
        public static final o d = new o();
        private static final List<String> e;

        private o() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1375Yz.m b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1375Yz.m(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.m mVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) mVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, mVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, mVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, mVar.e());
        }
    }

    /* renamed from: o.aaR$h */
    /* loaded from: classes6.dex */
    public static final class h implements InterfaceC8949gP<C1375Yz.f> {
        private static final List<String> c;
        public static final h d = new h();

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1375Yz.f b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C1375Yz.f(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1375Yz.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.e());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            C8953gT.t.e(interfaceC9069id, c9028hp, fVar.b());
        }
    }
}
