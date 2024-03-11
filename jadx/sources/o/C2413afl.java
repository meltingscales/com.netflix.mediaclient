package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2412afk;

/* renamed from: o.afl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2413afl {
    public static final C2413afl b = new C2413afl();

    /* renamed from: o.afl$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2412afk> {
        public static final d a = new d();
        private static final List<String> b;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "interactiveVideoData");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2412afk b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2412afk.b bVar = null;
            String str = null;
            C2412afk.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C2412afk.c) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = c.a.b(jsonReader, c9028hp);
            }
            return new C2412afk(str, cVar, bVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2412afk c2412afk) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2412afk, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2412afk.c());
            interfaceC9069id.e("interactiveVideoData");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2412afk.e());
            if (c2412afk.d() != null) {
                c.a.e(interfaceC9069id, c9028hp, c2412afk.d());
            }
        }
    }

    private C2413afl() {
    }

    /* renamed from: o.afl$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2412afk.c> {
        private static final List<String> a;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "interactiveSummaryFeatures");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2412afk.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2412afk.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    eVar = (C2412afk.e) C8953gT.d(C8953gT.c(a.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2412afk.c(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2412afk.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e("interactiveSummaryFeatures");
            C8953gT.d(C8953gT.c(a.c, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.afl$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2412afk.e> {
        public static final a c = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "prePlay", "fallbackTutorial", "videoMoments", "customBookmark", "playbackGraph", "resetUserState", "playerControlsSnapshots", "hideDetailedDurations", "interactiveAppUpdateDialogue", "interactiveTrailer", "choicePointDebugMenu", "ipp", "mainfeatureIdentifier", "supportedErrorDialogs", "pollingToggle", "bookmarkOverrideSeconds", "hideSubtitlesMenuDuringPlayback", "playerControlsPersistPlayPause");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2412afk.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            String str2 = null;
            List list = null;
            Boolean bool13 = null;
            Double d2 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            while (true) {
                switch (jsonReader.a(d)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        bool2 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        bool3 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        bool4 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        bool5 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        bool6 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        bool7 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 8:
                        bool8 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 9:
                        bool9 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 10:
                        bool10 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 11:
                        bool11 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 12:
                        bool12 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 13:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 14:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.p)).b(jsonReader, c9028hp);
                        break;
                    case 15:
                        bool13 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 16:
                        d2 = C8953gT.k.b(jsonReader, c9028hp);
                        break;
                    case 17:
                        bool14 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 18:
                        bool15 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2412afk.e(str, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, str2, list, bool13, d2, bool14, bool15);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2412afk.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.r());
            interfaceC9069id.e("prePlay");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.o());
            interfaceC9069id.e("fallbackTutorial");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("videoMoments");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.s());
            interfaceC9069id.e("customBookmark");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("playbackGraph");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.m());
            interfaceC9069id.e("resetUserState");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.p());
            interfaceC9069id.e("playerControlsSnapshots");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.n());
            interfaceC9069id.e("hideDetailedDurations");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("interactiveAppUpdateDialogue");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.f());
            interfaceC9069id.e("interactiveTrailer");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.h());
            interfaceC9069id.e("choicePointDebugMenu");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("ipp");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.g());
            interfaceC9069id.e("mainfeatureIdentifier");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.i());
            interfaceC9069id.e("supportedErrorDialogs");
            C8953gT.d(C8953gT.a(interfaceC8949gP)).e(interfaceC9069id, c9028hp, eVar.t());
            interfaceC9069id.e("pollingToggle");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.k());
            interfaceC9069id.e("bookmarkOverrideSeconds");
            C8953gT.k.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("hideSubtitlesMenuDuringPlayback");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.j());
            interfaceC9069id.e("playerControlsPersistPlayPause");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.l());
        }
    }

    /* renamed from: o.afl$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2412afk.b> {
        public static final c a = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("bookmark");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2412afk.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2412afk.d dVar = null;
            while (jsonReader.a(e) == 0) {
                dVar = (C2412afk.d) C8953gT.d(C8953gT.c(e.a, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C2412afk.b(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2412afk.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("bookmark");
            C8953gT.d(C8953gT.c(e.a, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.afl$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2412afk.d> {
        public static final e a = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "interactivePlaybackProgressPercentage");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2412afk.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2412afk.d(str, num);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2412afk.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("interactivePlaybackProgressPercentage");
            C8953gT.n.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
