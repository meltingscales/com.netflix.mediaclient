package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.SubtitleColor;
import com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute;
import com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle;
import com.netflix.mediaclient.graphql.models.type.SubtitleOpacity;
import com.netflix.mediaclient.graphql.models.type.SubtitleSize;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2567aiX;

/* renamed from: o.aja  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2623aja {
    public static final C2623aja b = new C2623aja();

    /* renamed from: o.aja$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2567aiX> {
        public static final j a = new j();
        private static final List<String> e;

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_GUID, "avatar", "isAccountOwner", "isAutoStartEnabled", "isDefaultKidsProfile", "isKids", "isPinLocked", "isProfileCreationLocked", "isVideoMerchEnabled", "lockPin", "maturityRating", "name", "personalData", "primaryLanguage", SignupConstants.Field.SECONDARY_LANGUAGES, "suggestedLocales", "subtitleSettings", "firstProtectedVideos");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2567aiX b(JsonReader jsonReader, C9028hp c9028hp) {
            String str;
            C2567aiX.e eVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str2 = null;
            String str3 = null;
            C2567aiX.b bVar = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            String str4 = null;
            C2567aiX.e eVar2 = null;
            String str5 = null;
            C2567aiX.h hVar = null;
            String str6 = null;
            List list = null;
            List list2 = null;
            C2567aiX.i iVar = null;
            C2567aiX.a aVar = null;
            while (true) {
                switch (jsonReader.a(e)) {
                    case 0:
                        str = str4;
                        str2 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str = str4;
                        eVar = eVar2;
                        str3 = C8953gT.p.b(jsonReader, c9028hp);
                        eVar2 = eVar;
                        break;
                    case 2:
                        str = str4;
                        bVar = (C2567aiX.b) C8953gT.d(C8953gT.c(e.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 4:
                        bool2 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 5:
                        bool3 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 6:
                        bool4 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 7:
                        bool5 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 8:
                        bool6 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 9:
                        bool7 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 10:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        continue;
                    case 11:
                        str = str4;
                        eVar2 = (C2567aiX.e) C8953gT.d(C8953gT.c(a.d, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 12:
                        str = str4;
                        eVar = eVar2;
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        eVar2 = eVar;
                        break;
                    case 13:
                        str = str4;
                        eVar = eVar2;
                        hVar = (C2567aiX.h) C8953gT.d(C8953gT.c(g.a, false, 1, null)).b(jsonReader, c9028hp);
                        eVar2 = eVar;
                        break;
                    case 14:
                        str6 = C8953gT.t.b(jsonReader, c9028hp);
                        continue;
                    case 15:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.t)).b(jsonReader, c9028hp);
                        continue;
                    case 16:
                        str = str4;
                        list2 = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(i.c, false, 1, null)))).b(jsonReader, c9028hp);
                        eVar2 = eVar2;
                        break;
                    case 17:
                        str = str4;
                        eVar = eVar2;
                        iVar = (C2567aiX.i) C8953gT.d(C8953gT.c(f.b, false, 1, null)).b(jsonReader, c9028hp);
                        eVar2 = eVar;
                        break;
                    case 18:
                        str = str4;
                        eVar = eVar2;
                        aVar = (C2567aiX.a) C8953gT.d(C8953gT.c(c.d, false, 1, null)).b(jsonReader, c9028hp);
                        eVar2 = eVar;
                        break;
                    default:
                        String str7 = str4;
                        C2567aiX.e eVar3 = eVar2;
                        if (str2 == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (str3 != null) {
                            return new C2567aiX(str2, str3, bVar, bool, bool2, bool3, bool4, bool5, bool6, bool7, str7, eVar3, str5, hVar, str6, list, list2, iVar, aVar);
                        } else {
                            C8956gW.a(jsonReader, Payload.PARAM_GUID);
                            throw new KotlinNothingValueException();
                        }
                }
                str4 = str;
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2567aiX c2567aiX) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2567aiX, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2567aiX.k());
            interfaceC9069id.e(Payload.PARAM_GUID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2567aiX.e());
            interfaceC9069id.e("avatar");
            C8953gT.d(C8953gT.c(e.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2567aiX.b());
            interfaceC9069id.e("isAccountOwner");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, c2567aiX.n());
            interfaceC9069id.e("isAutoStartEnabled");
            c8994hH.e(interfaceC9069id, c9028hp, c2567aiX.o());
            interfaceC9069id.e("isDefaultKidsProfile");
            c8994hH.e(interfaceC9069id, c9028hp, c2567aiX.m());
            interfaceC9069id.e("isKids");
            c8994hH.e(interfaceC9069id, c9028hp, c2567aiX.p());
            interfaceC9069id.e("isPinLocked");
            c8994hH.e(interfaceC9069id, c9028hp, c2567aiX.t());
            interfaceC9069id.e("isProfileCreationLocked");
            c8994hH.e(interfaceC9069id, c9028hp, c2567aiX.r());
            interfaceC9069id.e("isVideoMerchEnabled");
            c8994hH.e(interfaceC9069id, c9028hp, c2567aiX.s());
            interfaceC9069id.e("lockPin");
            C8994hH<String> c8994hH2 = C8953gT.t;
            c8994hH2.e(interfaceC9069id, c9028hp, c2567aiX.c());
            interfaceC9069id.e("maturityRating");
            C8953gT.d(C8953gT.c(a.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2567aiX.d());
            interfaceC9069id.e("name");
            c8994hH2.e(interfaceC9069id, c9028hp, c2567aiX.h());
            interfaceC9069id.e("personalData");
            C8953gT.d(C8953gT.c(g.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2567aiX.j());
            interfaceC9069id.e("primaryLanguage");
            c8994hH2.e(interfaceC9069id, c9028hp, c2567aiX.i());
            interfaceC9069id.e(SignupConstants.Field.SECONDARY_LANGUAGES);
            C8953gT.d(C8953gT.a(c8994hH2)).e(interfaceC9069id, c9028hp, c2567aiX.f());
            interfaceC9069id.e("suggestedLocales");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(i.c, false, 1, null)))).e(interfaceC9069id, c9028hp, c2567aiX.l());
            interfaceC9069id.e("subtitleSettings");
            C8953gT.d(C8953gT.c(f.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2567aiX.g());
            interfaceC9069id.e("firstProtectedVideos");
            C8953gT.d(C8953gT.c(c.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2567aiX.a());
        }
    }

    private C2623aja() {
    }

    /* renamed from: o.aja$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2567aiX.b> {
        private static final List<String> a;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2567aiX.b b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2567aiX.b(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2567aiX.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* renamed from: o.aja$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2567aiX.e> {
        public static final a d = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isHighest", "isLowest", "labels", "value");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2567aiX.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            List list = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.t)).b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2567aiX.e(str, bool, bool2, list, num);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2567aiX.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("isHighest");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("isLowest");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("labels");
            C8953gT.d(C8953gT.a(C8953gT.t)).e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("value");
            C8953gT.n.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.aja$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2567aiX.h> {
        public static final g a = new g();
        private static final List<String> e;

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.EMAIL);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2567aiX.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2567aiX.h(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2567aiX.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.e());
            interfaceC9069id.e(SignupConstants.Field.EMAIL);
            C8953gT.t.e(interfaceC9069id, c9028hp, hVar.c());
        }
    }

    /* renamed from: o.aja$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2567aiX.f> {
        public static final i c = new i();
        private static final List<String> e;

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2567aiX.f b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2567aiX.f(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2567aiX.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.a());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8953gT.t.e(interfaceC9069id, c9028hp, fVar.c());
        }
    }

    /* renamed from: o.aja$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2567aiX.i> {
        public static final f b = new f();
        private static final List<String> d;

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "backgroundColor", "backgroundOpacity", "charColor", "charEdgeAttribute", "charEdgeColor", "charOpacity", "charSize", "charStyle", "windowColor", "windowOpacity");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2567aiX.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            SubtitleColor subtitleColor = null;
            SubtitleOpacity subtitleOpacity = null;
            SubtitleColor subtitleColor2 = null;
            SubtitleEdgeAttribute subtitleEdgeAttribute = null;
            SubtitleColor subtitleColor3 = null;
            SubtitleOpacity subtitleOpacity2 = null;
            SubtitleSize subtitleSize = null;
            SubtitleFontStyle subtitleFontStyle = null;
            SubtitleColor subtitleColor4 = null;
            SubtitleOpacity subtitleOpacity3 = null;
            while (true) {
                switch (jsonReader.a(d)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        subtitleColor = (SubtitleColor) C8953gT.d(C3445azC.b).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        subtitleOpacity = (SubtitleOpacity) C8953gT.d(C3450azH.e).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        subtitleColor2 = (SubtitleColor) C8953gT.d(C3445azC.b).b(jsonReader, c9028hp);
                        break;
                    case 4:
                        subtitleEdgeAttribute = (SubtitleEdgeAttribute) C8953gT.d(C3443azA.d).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        subtitleColor3 = (SubtitleColor) C8953gT.d(C3445azC.b).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        subtitleOpacity2 = (SubtitleOpacity) C8953gT.d(C3450azH.e).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        subtitleSize = (SubtitleSize) C8953gT.d(C3449azG.c).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        subtitleFontStyle = (SubtitleFontStyle) C8953gT.d(C3447azE.d).b(jsonReader, c9028hp);
                        break;
                    case 9:
                        subtitleColor4 = (SubtitleColor) C8953gT.d(C3445azC.b).b(jsonReader, c9028hp);
                        break;
                    case 10:
                        subtitleOpacity3 = (SubtitleOpacity) C8953gT.d(C3450azH.e).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2567aiX.i(str, subtitleColor, subtitleOpacity, subtitleColor2, subtitleEdgeAttribute, subtitleColor3, subtitleOpacity2, subtitleSize, subtitleFontStyle, subtitleColor4, subtitleOpacity3);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2567aiX.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.k());
            interfaceC9069id.e("backgroundColor");
            C3445azC c3445azC = C3445azC.b;
            C8953gT.d(c3445azC).e(interfaceC9069id, c9028hp, iVar.c());
            interfaceC9069id.e("backgroundOpacity");
            C3450azH c3450azH = C3450azH.e;
            C8953gT.d(c3450azH).e(interfaceC9069id, c9028hp, iVar.a());
            interfaceC9069id.e("charColor");
            C8953gT.d(c3445azC).e(interfaceC9069id, c9028hp, iVar.d());
            interfaceC9069id.e("charEdgeAttribute");
            C8953gT.d(C3443azA.d).e(interfaceC9069id, c9028hp, iVar.b());
            interfaceC9069id.e("charEdgeColor");
            C8953gT.d(c3445azC).e(interfaceC9069id, c9028hp, iVar.e());
            interfaceC9069id.e("charOpacity");
            C8953gT.d(c3450azH).e(interfaceC9069id, c9028hp, iVar.h());
            interfaceC9069id.e("charSize");
            C8953gT.d(C3449azG.c).e(interfaceC9069id, c9028hp, iVar.j());
            interfaceC9069id.e("charStyle");
            C8953gT.d(C3447azE.d).e(interfaceC9069id, c9028hp, iVar.g());
            interfaceC9069id.e("windowColor");
            C8953gT.d(c3445azC).e(interfaceC9069id, c9028hp, iVar.i());
            interfaceC9069id.e("windowOpacity");
            C8953gT.d(c3450azH).e(interfaceC9069id, c9028hp, iVar.f());
        }
    }

    /* renamed from: o.aja$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2567aiX.a> {
        public static final c d = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2567aiX.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(b.d, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2567aiX.a(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2567aiX.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(b.d, false, 1, null))).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.aja$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2567aiX.c> {
        private static final List<String> b;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2567aiX.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2567aiX.d dVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    dVar = (C2567aiX.d) C8953gT.d(C8953gT.c(d.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2567aiX.c(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2567aiX.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(d.c, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.aja$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2567aiX.d> {
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2567aiX.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2567aiX.d(str, num.intValue());
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2567aiX.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.a()));
        }
    }
}
