package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2570aia;

/* renamed from: o.ahY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2515ahY {
    public static final C2515ahY b = new C2515ahY();

    /* renamed from: o.ahY$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2570aia> {
        private static final List<String> c;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "displayDurationMillis", "displayDelayMillis", "text");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2570aia b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2570aia.b bVar = null;
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("ContentAdvisory"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = c.e.b(jsonReader, c9028hp);
            }
            return new C2570aia(str, num, num2, str2, bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2570aia c2570aia) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2570aia, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2570aia.c());
            interfaceC9069id.e("displayDurationMillis");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, c2570aia.d());
            interfaceC9069id.e("displayDelayMillis");
            c8994hH.e(interfaceC9069id, c9028hp, c2570aia.e());
            interfaceC9069id.e("text");
            C8953gT.t.e(interfaceC9069id, c9028hp, c2570aia.b());
            if (c2570aia.a() != null) {
                c.e.e(interfaceC9069id, c9028hp, c2570aia.a());
            }
        }
    }

    private C2515ahY() {
    }

    /* renamed from: o.ahY$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2570aia.b> {
        private static final List<String> a;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("boardName", "boardId", "certificationValue", "certificationRatingId", "i18nRating", "i18nReasonsText", "maturityDescription", "maturityLevel", "shortDescription", "reasons", "certSystemConfirmationId");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2570aia.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            Integer num2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Integer num3 = null;
            String str6 = null;
            List list = null;
            String str7 = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
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
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        num3 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 8:
                        str6 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 9:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.a, false, 1, null)))).b(jsonReader, c9028hp);
                        break;
                    case 10:
                        str7 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                        break;
                    default:
                        return new C2570aia.b(str, num, str2, num2, str3, str4, str5, num3, str6, list, str7);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2570aia.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("boardName");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("boardId");
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("certificationValue");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("certificationRatingId");
            c8994hH2.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("i18nRating");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.i());
            interfaceC9069id.e("i18nReasonsText");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.h());
            interfaceC9069id.e("maturityDescription");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.j());
            interfaceC9069id.e("maturityLevel");
            c8994hH2.e(interfaceC9069id, c9028hp, bVar.f());
            interfaceC9069id.e("shortDescription");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.o());
            interfaceC9069id.e("reasons");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.a, false, 1, null)))).e(interfaceC9069id, c9028hp, bVar.g());
            interfaceC9069id.e("certSystemConfirmationId");
            C8953gT.d(C8953gT.p).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.ahY$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2570aia.a> {
        public static final d a = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "iconId", "text");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2570aia.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(e);
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
                return new C2570aia.a(str, num, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2570aia.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("iconId");
            C8953gT.n.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("text");
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }
}
