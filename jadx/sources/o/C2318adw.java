package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.BillboardType;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2312adq;
import o.C2379afD;
import o.C2632ajj;

/* renamed from: o.adw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2318adw {
    public static final C2318adw b = new C2318adw();

    /* renamed from: o.adw$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2312adq> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "billboardType", "billboardCallsToAction", "actionToken", "impressionToken", "node", "billboardPromotedVideo", "backgroundAsset", "fallbackBackgroundAsset", "storyArtAsset", "logoAsset", "horizontalLogoAsset", "logoAssetForAwards", "horizontalBackgroundAsset");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2312adq b(JsonReader jsonReader, C9028hp c9028hp) {
            C2312adq.g gVar;
            C2312adq.f fVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BillboardType billboardType = null;
            List list = null;
            String str2 = null;
            String str3 = null;
            C2312adq.n nVar = null;
            C2312adq.e eVar = null;
            C2312adq.a aVar = null;
            C2312adq.i iVar = null;
            C2312adq.s sVar = null;
            C2312adq.g gVar2 = null;
            C2312adq.f fVar2 = null;
            C2312adq.h hVar = null;
            C2312adq.j jVar = null;
            while (true) {
                switch (jsonReader.a(e)) {
                    case 0:
                        gVar = gVar2;
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        gVar = gVar2;
                        billboardType = (BillboardType) C8953gT.d(C3346axJ.b).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        gVar = gVar2;
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.e, false, 1, null)))).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        continue;
                    case 4:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        continue;
                    case 5:
                        gVar = gVar2;
                        nVar = (C2312adq.n) C8953gT.d(C8953gT.c(o.a, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        eVar = (C2312adq.e) C8953gT.d(C8953gT.a(a.b, true)).b(jsonReader, c9028hp);
                        continue;
                    case 7:
                        gVar = gVar2;
                        aVar = (C2312adq.a) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                        fVar2 = fVar2;
                        break;
                    case 8:
                        gVar = gVar2;
                        fVar = fVar2;
                        iVar = (C2312adq.i) C8953gT.d(C8953gT.c(f.b, false, 1, null)).b(jsonReader, c9028hp);
                        fVar2 = fVar;
                        break;
                    case 9:
                        gVar = gVar2;
                        fVar = fVar2;
                        sVar = (C2312adq.s) C8953gT.d(C8953gT.c(x.d, false, 1, null)).b(jsonReader, c9028hp);
                        fVar2 = fVar;
                        break;
                    case 10:
                        fVar = fVar2;
                        gVar = (C2312adq.g) C8953gT.d(C8953gT.c(g.b, false, 1, null)).b(jsonReader, c9028hp);
                        fVar2 = fVar;
                        break;
                    case 11:
                        gVar = gVar2;
                        fVar2 = (C2312adq.f) C8953gT.d(C8953gT.c(h.d, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 12:
                        gVar = gVar2;
                        fVar = fVar2;
                        hVar = (C2312adq.h) C8953gT.d(C8953gT.c(m.d, false, 1, null)).b(jsonReader, c9028hp);
                        fVar2 = fVar;
                        break;
                    case 13:
                        gVar = gVar2;
                        fVar = fVar2;
                        jVar = (C2312adq.j) C8953gT.d(C8953gT.c(j.d, false, 1, null)).b(jsonReader, c9028hp);
                        fVar2 = fVar;
                        break;
                    default:
                        C2312adq.g gVar3 = gVar2;
                        C2312adq.f fVar3 = fVar2;
                        if (str != null) {
                            return new C2312adq(str, billboardType, list, str2, str3, nVar, eVar, aVar, iVar, sVar, gVar3, fVar3, hVar, jVar);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
                gVar2 = gVar;
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq c2312adq) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2312adq, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2312adq.o());
            interfaceC9069id.e("billboardType");
            C8953gT.d(C3346axJ.b).e(interfaceC9069id, c9028hp, c2312adq.e());
            interfaceC9069id.e("billboardCallsToAction");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.e, false, 1, null)))).e(interfaceC9069id, c9028hp, c2312adq.b());
            interfaceC9069id.e("actionToken");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2312adq.d());
            interfaceC9069id.e("impressionToken");
            c8994hH.e(interfaceC9069id, c9028hp, c2312adq.j());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(o.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2312adq.n());
            interfaceC9069id.e("billboardPromotedVideo");
            C8953gT.d(C8953gT.a(a.b, true)).e(interfaceC9069id, c9028hp, c2312adq.a());
            interfaceC9069id.e("backgroundAsset");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2312adq.c());
            interfaceC9069id.e("fallbackBackgroundAsset");
            C8953gT.d(C8953gT.c(f.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2312adq.i());
            interfaceC9069id.e("storyArtAsset");
            C8953gT.d(C8953gT.c(x.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2312adq.k());
            interfaceC9069id.e("logoAsset");
            C8953gT.d(C8953gT.c(g.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2312adq.g());
            interfaceC9069id.e("horizontalLogoAsset");
            C8953gT.d(C8953gT.c(h.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2312adq.f());
            interfaceC9069id.e("logoAssetForAwards");
            C8953gT.d(C8953gT.c(m.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2312adq.l());
            interfaceC9069id.e("horizontalBackgroundAsset");
            C8953gT.d(C8953gT.c(j.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2312adq.h());
        }
    }

    private C2318adw() {
    }

    /* renamed from: o.adw$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2312adq.d> {
        private static final List<String> d;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "name", "type", SignupConstants.Field.VIDEO_ID, "suppressPostPlay", "ignoreBookmark");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2312adq.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 4) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2312adq.d(str, str2, str3, num, bool, bool2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.g());
            interfaceC9069id.e("name");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.n.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("suppressPostPlay");
            C8994hH<Boolean> c8994hH2 = C8953gT.l;
            c8994hH2.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("ignoreBookmark");
            c8994hH2.e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.adw$o */
    /* loaded from: classes3.dex */
    public static final class o implements InterfaceC8949gP<C2312adq.n> {
        public static final o a = new o();
        private static final List<String> b;

        private o() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2312adq.n b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2312adq.p pVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    pVar = (C2312adq.p) C8953gT.d(C8953gT.a(q.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2312adq.n(str, pVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.n nVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) nVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, nVar.d());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(q.e, true)).e(interfaceC9069id, c9028hp, nVar.e());
        }
    }

    /* renamed from: o.adw$q */
    /* loaded from: classes3.dex */
    public static final class q implements InterfaceC8949gP<C2312adq.p> {
        private static final List<String> c;
        public static final q e = new q();

        private q() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2312adq.p b(JsonReader jsonReader, C9028hp c9028hp) {
            C2312adq.k kVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2383afH c2383afH = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                kVar = s.b.b(jsonReader, c9028hp);
            } else {
                kVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2383afH = C2379afD.c.a.b(jsonReader, c9028hp);
            }
            return new C2312adq.p(str, kVar, c2383afH);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.p pVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) pVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, pVar.b());
            if (pVar.c() != null) {
                s.b.e(interfaceC9069id, c9028hp, pVar.c());
            }
            if (pVar.d() != null) {
                C2379afD.c.a.e(interfaceC9069id, c9028hp, pVar.d());
            }
        }
    }

    /* renamed from: o.adw$s */
    /* loaded from: classes3.dex */
    public static final class s implements InterfaceC8949gP<C2312adq.k> {
        public static final s b = new s();
        private static final List<String> d;

        private s() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "badges", "tags", "supplementalMessage", "artworkForegroundColor", "contextualSynopsis");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2312adq.k b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2312adq.o oVar = null;
            Integer num = null;
            List list = null;
            List list2 = null;
            C2312adq.x xVar = null;
            String str = null;
            C2312adq.c cVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.t)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    list2 = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(y.d, false, 1, null)))).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    xVar = (C2312adq.x) C8953gT.d(C8953gT.c(v.d, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a == 4) {
                    str = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    cVar = (C2312adq.c) C8953gT.d(C8953gT.c(c.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, C9070ie.b(jsonReader), c9028hp.d, null)) {
                jsonReader.q();
                oVar = k.b.b(jsonReader, c9028hp);
            }
            C2312adq.o oVar2 = oVar;
            jsonReader.q();
            C2630ajh b2 = C2632ajj.e.b.b(jsonReader, c9028hp);
            if (num != null) {
                return new C2312adq.k(num.intValue(), list, list2, xVar, str, cVar, oVar2, b2);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.k kVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) kVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(kVar.i()));
            interfaceC9069id.e("badges");
            C8994hH<String> c8994hH = C8953gT.t;
            C8953gT.d(C8953gT.a(c8994hH)).e(interfaceC9069id, c9028hp, kVar.e());
            interfaceC9069id.e("tags");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(y.d, false, 1, null)))).e(interfaceC9069id, c9028hp, kVar.h());
            interfaceC9069id.e("supplementalMessage");
            C8953gT.d(C8953gT.c(v.d, false, 1, null)).e(interfaceC9069id, c9028hp, kVar.d());
            interfaceC9069id.e("artworkForegroundColor");
            c8994hH.e(interfaceC9069id, c9028hp, kVar.c());
            interfaceC9069id.e("contextualSynopsis");
            C8953gT.d(C8953gT.c(c.b, false, 1, null)).e(interfaceC9069id, c9028hp, kVar.b());
            if (kVar.a() != null) {
                k.b.e(interfaceC9069id, c9028hp, kVar.a());
            }
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, kVar.g());
        }
    }

    /* renamed from: o.adw$y */
    /* loaded from: classes3.dex */
    public static final class y implements InterfaceC8949gP<C2312adq.y> {
        public static final y d = new y();
        private static final List<String> e;

        private y() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "displayName", "isDisplayable");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2312adq.y b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(e);
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
                return new C2312adq.y(str, str2, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.y yVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) yVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, yVar.a());
            interfaceC9069id.e("displayName");
            C8953gT.t.e(interfaceC9069id, c9028hp, yVar.b());
            interfaceC9069id.e("isDisplayable");
            C8953gT.l.e(interfaceC9069id, c9028hp, yVar.d());
        }
    }

    /* renamed from: o.adw$v */
    /* loaded from: classes3.dex */
    public static final class v implements InterfaceC8949gP<C2312adq.x> {
        private static final List<String> a;
        public static final v d = new v();

        private v() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "classification", "tagline");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2312adq.x b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2312adq.x(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.x xVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) xVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, xVar.b());
            interfaceC9069id.e("classification");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, xVar.d());
            interfaceC9069id.e("tagline");
            c8994hH.e(interfaceC9069id, c9028hp, xVar.a());
        }
    }

    /* renamed from: o.adw$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2312adq.c> {
        public static final c b = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "text", "evidenceKey");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2312adq.c b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2312adq.c(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("text");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("evidenceKey");
            c8994hH.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.adw$k */
    /* loaded from: classes3.dex */
    public static final class k implements InterfaceC8949gP<C2312adq.o> {
        public static final k b = new k();
        private static final List<String> d;

        private k() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("parentShow");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2312adq.o b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2312adq.r rVar = null;
            while (jsonReader.a(d) == 0) {
                rVar = (C2312adq.r) C8953gT.d(C8953gT.c(r.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C2312adq.o(rVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.o oVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) oVar, "");
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.c(r.b, false, 1, null)).e(interfaceC9069id, c9028hp, oVar.d());
        }
    }

    /* renamed from: o.adw$r */
    /* loaded from: classes3.dex */
    public static final class r implements InterfaceC8949gP<C2312adq.r> {
        public static final r b = new r();
        private static final List<String> c;

        private r() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "artworkForegroundColor");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2312adq.r b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2312adq.r(str, num.intValue(), str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.r rVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) rVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, rVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(rVar.a()));
            interfaceC9069id.e("artworkForegroundColor");
            C8953gT.t.e(interfaceC9069id, c9028hp, rVar.d());
        }
    }

    /* renamed from: o.adw$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2312adq.e> {
        public static final a b = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "badges", "contextualSynopsis");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2312adq.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C2312adq.l lVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2312adq.m mVar = null;
            Integer num = null;
            String str = null;
            List list = null;
            C2312adq.b bVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.t)).b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    bVar = (C2312adq.b) C8953gT.d(C8953gT.c(i.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                lVar = l.c.b(jsonReader, c9028hp);
            } else {
                lVar = null;
            }
            if (C9014hb.d(C9014hb.c("Season"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                mVar = n.a.b(jsonReader, c9028hp);
            }
            C2312adq.m mVar2 = mVar;
            if (num != null) {
                return new C2312adq.e(str, num.intValue(), list, bVar, lVar, mVar2);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.h());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.a()));
            interfaceC9069id.e("badges");
            C8953gT.d(C8953gT.a(C8953gT.t)).e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("contextualSynopsis");
            C8953gT.d(C8953gT.c(i.e, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.d());
            if (eVar.e() != null) {
                l.c.e(interfaceC9069id, c9028hp, eVar.e());
            }
            if (eVar.c() != null) {
                n.a.e(interfaceC9069id, c9028hp, eVar.c());
            }
        }
    }

    /* renamed from: o.adw$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2312adq.b> {
        private static final List<String> d;
        public static final i e = new i();

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "text", "evidenceKey");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2312adq.b b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2312adq.b(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("text");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("evidenceKey");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* renamed from: o.adw$l */
    /* loaded from: classes3.dex */
    public static final class l implements InterfaceC8949gP<C2312adq.l> {
        public static final l c = new l();
        private static final List<String> e;

        private l() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("parentSeason");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2312adq.l b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2312adq.t tVar = null;
            while (jsonReader.a(e) == 0) {
                tVar = (C2312adq.t) C8953gT.d(C8953gT.c(t.c, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C2312adq.l(tVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.l lVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) lVar, "");
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.c(t.c, false, 1, null)).e(interfaceC9069id, c9028hp, lVar.c());
        }
    }

    /* renamed from: o.adw$t */
    /* loaded from: classes3.dex */
    public static final class t implements InterfaceC8949gP<C2312adq.t> {
        private static final List<String> a;
        public static final t c = new t();

        private t() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, SignupConstants.Field.VIDEO_TITLE);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2312adq.t b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2312adq.t(str, num.intValue(), str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.t tVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) tVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, tVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(tVar.b()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, tVar.d());
        }
    }

    /* renamed from: o.adw$n */
    /* loaded from: classes3.dex */
    public static final class n implements InterfaceC8949gP<C2312adq.m> {
        public static final n a = new n();
        private static final List<String> e;

        private n() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("parentShow");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2312adq.m b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2312adq.q qVar = null;
            while (jsonReader.a(e) == 0) {
                qVar = (C2312adq.q) C8953gT.d(C8953gT.c(p.c, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C2312adq.m(qVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.m mVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) mVar, "");
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.c(p.c, false, 1, null)).e(interfaceC9069id, c9028hp, mVar.a());
        }
    }

    /* renamed from: o.adw$p */
    /* loaded from: classes3.dex */
    public static final class p implements InterfaceC8949gP<C2312adq.q> {
        private static final List<String> b;
        public static final p c = new p();

        private p() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, SignupConstants.Field.VIDEO_TITLE);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2312adq.q b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2312adq.q(str, num.intValue(), str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.q qVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) qVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, qVar.d());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(qVar.c()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, qVar.e());
        }
    }

    /* renamed from: o.adw$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2312adq.a> {
        private static final List<String> a;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, InteractiveAnimation.ANIMATION_TYPE.WIDTH, "type", "available", "dominantBackgroundColor");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2312adq.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            String str4 = null;
            Boolean bool = null;
            String str5 = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2312adq.a(str, str2, str3, num, num2, str4, bool, str5);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.f());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.g());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            c8994hH2.e(interfaceC9069id, c9028hp, aVar.h());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("dominantBackgroundColor");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* renamed from: o.adw$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2312adq.i> {
        private static final List<String> a;
        public static final f b = new f();

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, InteractiveAnimation.ANIMATION_TYPE.WIDTH, "type", "dominantBackgroundColor");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2312adq.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2312adq.i(str, str2, str3, num, num2, str4, str5);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.i());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, iVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, iVar.c());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, iVar.e());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            c8994hH2.e(interfaceC9069id, c9028hp, iVar.h());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, iVar.d());
            interfaceC9069id.e("dominantBackgroundColor");
            c8994hH.e(interfaceC9069id, c9028hp, iVar.a());
        }
    }

    /* renamed from: o.adw$x */
    /* loaded from: classes3.dex */
    public static final class x implements InterfaceC8949gP<C2312adq.s> {
        public static final x d = new x();
        private static final List<String> e;

        private x() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, InteractiveAnimation.ANIMATION_TYPE.WIDTH, "type", "dominantBackgroundColor");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2312adq.s b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                switch (jsonReader.a(e)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2312adq.s(str, str2, str3, num, num2, str4, str5);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.s sVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) sVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, sVar.j());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, sVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, sVar.b());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, sVar.e());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            c8994hH2.e(interfaceC9069id, c9028hp, sVar.i());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, sVar.d());
            interfaceC9069id.e("dominantBackgroundColor");
            c8994hH.e(interfaceC9069id, c9028hp, sVar.c());
        }
    }

    /* renamed from: o.adw$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2312adq.g> {
        public static final g b = new g();
        private static final List<String> c;

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, InteractiveAnimation.ANIMATION_TYPE.WIDTH, "type");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2312adq.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            String str4 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 4) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2312adq.g(str, str2, str3, num, num2, str4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.h());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, gVar.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, gVar.c());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, gVar.b());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            c8994hH2.e(interfaceC9069id, c9028hp, gVar.e());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, gVar.a());
        }
    }

    /* renamed from: o.adw$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2312adq.f> {
        private static final List<String> c;
        public static final h d = new h();

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, InteractiveAnimation.ANIMATION_TYPE.WIDTH, "type");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2312adq.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            String str4 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 4) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2312adq.f(str, str2, str3, num, num2, str4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.i());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, fVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, fVar.d());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, fVar.a());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            c8994hH2.e(interfaceC9069id, c9028hp, fVar.c());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, fVar.b());
        }
    }

    /* renamed from: o.adw$m */
    /* loaded from: classes3.dex */
    public static final class m implements InterfaceC8949gP<C2312adq.h> {
        private static final List<String> b;
        public static final m d = new m();

        private m() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, InteractiveAnimation.ANIMATION_TYPE.WIDTH, "type", "available");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2312adq.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            String str4 = null;
            Boolean bool = null;
            while (true) {
                switch (jsonReader.a(b)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2312adq.h(str, str2, str3, num, num2, str4, bool);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.f());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, hVar.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, hVar.a());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, hVar.e());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            c8994hH2.e(interfaceC9069id, c9028hp, hVar.g());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, hVar.b());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, hVar.c());
        }
    }

    /* renamed from: o.adw$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2312adq.j> {
        private static final List<String> c;
        public static final j d = new j();

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, InteractiveAnimation.ANIMATION_TYPE.WIDTH, "type", "dominantBackgroundColor");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2312adq.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                switch (jsonReader.a(c)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2312adq.j(str, str2, str3, num, num2, str4, str5);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2312adq.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.j());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, jVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, jVar.d());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, jVar.c());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            c8994hH2.e(interfaceC9069id, c9028hp, jVar.f());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, jVar.a());
            interfaceC9069id.e("dominantBackgroundColor");
            c8994hH.e(interfaceC9069id, c9028hp, jVar.b());
        }
    }
}
