package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2337aeO;

/* renamed from: o.aeK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2333aeK {
    public static final C2333aeK c = new C2333aeK();

    /* renamed from: o.aeK$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2337aeO> {
        public static final c a = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contentAdvisory");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2337aeO b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2337aeO.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bVar = (C2337aeO.b) C8953gT.d(C8953gT.c(b.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2337aeO(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2337aeO c2337aeO) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2337aeO, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2337aeO.b());
            interfaceC9069id.e("contentAdvisory");
            C8953gT.d(C8953gT.c(b.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2337aeO.d());
        }
    }

    private C2333aeK() {
    }

    /* renamed from: o.aeK$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2337aeO.b> {
        public static final b a = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "certificationValue", "certificationRatingId", "boardId", "boardName", "i18nRating", "maturityLevel", "reasons", "maturityDescription", "shortDescription");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2337aeO.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            String str3 = null;
            String str4 = null;
            Integer num3 = null;
            List list = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                switch (jsonReader.a(c)) {
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
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        num3 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(e.a, false, 1, null)))).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 9:
                        str6 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2337aeO.b(str, str2, num, num2, str3, str4, num3, list, str5, str6);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2337aeO.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.i());
            interfaceC9069id.e("certificationValue");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("certificationRatingId");
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("boardId");
            c8994hH2.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("boardName");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("i18nRating");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("maturityLevel");
            c8994hH2.e(interfaceC9069id, c9028hp, bVar.f());
            interfaceC9069id.e("reasons");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(e.a, false, 1, null)))).e(interfaceC9069id, c9028hp, bVar.j());
            interfaceC9069id.e("maturityDescription");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.h());
            interfaceC9069id.e("shortDescription");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.g());
        }
    }

    /* renamed from: o.aeK$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2337aeO.a> {
        public static final e a = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "iconId", "text");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2337aeO.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2337aeO.a(str, num, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2337aeO.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("iconId");
            C8953gT.n.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("text");
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
