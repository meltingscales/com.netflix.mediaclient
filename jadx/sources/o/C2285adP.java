package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2278adI;

/* renamed from: o.adP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2285adP {
    public static final C2285adP a = new C2285adP();

    /* renamed from: o.adP$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2278adI> {
        private static final List<String> a;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contentAdvisory");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2278adI b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2278adI.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    dVar = (C2278adI.d) C8953gT.d(C8953gT.c(a.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2278adI(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2278adI c2278adI) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2278adI, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2278adI.a());
            interfaceC9069id.e("contentAdvisory");
            C8953gT.d(C8953gT.c(a.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2278adI.e());
        }
    }

    private C2285adP() {
    }

    /* renamed from: o.adP$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2278adI.d> {
        public static final a a = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "boardName", "boardId", "certificationValue", "certificationRatingId", "i18nRating", "i18nReasonsText", "maturityDescription", "maturityLevel", "shortDescription", "reasons");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2278adI.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            Integer num2 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Integer num3 = null;
            String str7 = null;
            List list = null;
            while (true) {
                switch (jsonReader.a(d)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
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
                    case 7:
                        str6 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 8:
                        num3 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 9:
                        str7 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 10:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(e.b, false, 1, null)))).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2278adI.d(str, str2, num, str3, num2, str4, str5, str6, num3, str7, list);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2278adI.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.l());
            interfaceC9069id.e("boardName");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("boardId");
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("certificationValue");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("certificationRatingId");
            c8994hH2.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("i18nRating");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("i18nReasonsText");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.i());
            interfaceC9069id.e("maturityDescription");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.j());
            interfaceC9069id.e("maturityLevel");
            c8994hH2.e(interfaceC9069id, c9028hp, dVar.f());
            interfaceC9069id.e("shortDescription");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.g());
            interfaceC9069id.e("reasons");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(e.b, false, 1, null)))).e(interfaceC9069id, c9028hp, dVar.h());
        }
    }

    /* renamed from: o.adP$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2278adI.e> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "iconId", "text");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2278adI.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2278adI.e(str, num, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2278adI.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("iconId");
            C8953gT.n.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("text");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }
}
