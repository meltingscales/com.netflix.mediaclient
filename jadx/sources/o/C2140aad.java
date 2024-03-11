package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1345Yc;
import o.C2594aiy;

/* renamed from: o.aad  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2140aad {
    public static final C2140aad b = new C2140aad();

    /* renamed from: o.aad$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1345Yc.d> {
        private static final List<String> d;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("availablePreferredSecondaryLocales");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1345Yc.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1345Yc.a aVar = null;
            while (jsonReader.a(d) == 0) {
                aVar = (C1345Yc.a) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1345Yc.d(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1345Yc.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("availablePreferredSecondaryLocales");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    private C2140aad() {
    }

    /* renamed from: o.aad$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1345Yc.a> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1345Yc.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.c, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1345Yc.a(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1345Yc.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.c, false, 1, null)))).e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    /* renamed from: o.aad$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1345Yc.c> {
        private static final List<String> b;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1345Yc.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1345Yc.e eVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    eVar = (C1345Yc.e) C8953gT.d(C8953gT.a(e.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1345Yc.c(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1345Yc.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(e.a, true)).e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    /* renamed from: o.aad$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1345Yc.e> {
        public static final e a = new e();
        private static final List<String> b;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1345Yc.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2545aiB b2 = C2594aiy.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1345Yc.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1345Yc.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            C2594aiy.d.e.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }
}
