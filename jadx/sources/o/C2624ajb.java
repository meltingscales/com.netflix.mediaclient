package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2628ajf;

/* renamed from: o.ajb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2624ajb {
    public static final C2624ajb b = new C2624ajb();

    /* renamed from: o.ajb$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2628ajf> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "certificationRating");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2628ajf b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2628ajf.a aVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2628ajf.a) C8953gT.d(C8953gT.c(c.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2628ajf(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2628ajf c2628ajf) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2628ajf, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2628ajf.e());
            interfaceC9069id.e("certificationRating");
            C8953gT.d(C8953gT.c(c.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2628ajf.c());
        }
    }

    private C2624ajb() {
    }

    /* renamed from: o.ajb$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2628ajf.a> {
        public static final c a = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "value", "maturityLevel", "maturityDescription", "shortDescription", "ratingId", "boardId", "boardName");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2628ajf.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            Integer num2 = null;
            Integer num3 = null;
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
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        num3 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2628ajf.a(str, str2, num, str3, str4, num2, num3, str5);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2628ajf.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.f());
            interfaceC9069id.e("value");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.h());
            interfaceC9069id.e("maturityLevel");
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e("maturityDescription");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("shortDescription");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.g());
            interfaceC9069id.e("ratingId");
            c8994hH2.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("boardId");
            c8994hH2.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("boardName");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }
}
