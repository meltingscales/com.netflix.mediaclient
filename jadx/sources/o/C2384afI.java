package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2318adw;
import o.C2386afK;
import o.C2511ahU;
import o.C2528ahl;

/* renamed from: o.afI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2384afI {
    public static final C2384afI e = new C2384afI();

    /* renamed from: o.afI$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2386afK> {
        public static final e a = new e();
        private static final List<String> b;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "billboardEntities");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2386afK b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2386afK.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    dVar = (C2386afK.d) C8953gT.d(C8953gT.a(b.a, true)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2529ahm b2 = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2386afK(str, dVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2386afK c2386afK) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2386afK, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2386afK.c());
            interfaceC9069id.e("billboardEntities");
            C8953gT.d(C8953gT.a(b.a, true)).e(interfaceC9069id, c9028hp, c2386afK.d());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2386afK.e());
        }
    }

    private C2384afI() {
    }

    /* renamed from: o.afI$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2386afK.d> {
        public static final b a = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2386afK.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2386afK.a b = d.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2386afK.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2386afK.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            d.c.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    /* renamed from: o.afI$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2386afK.a> {
        private static final List<String> a;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("edges");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2386afK.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(a) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(a.c, true)))).b(jsonReader, c9028hp);
            }
            return new C2386afK.a(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2386afK.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(a.c, true)))).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.afI$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2386afK.b> {
        public static final a c = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2386afK.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2386afK.c cVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (C2386afK.c) C8953gT.d(C8953gT.c(c.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2312adq b = C2318adw.e.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2386afK.b(str, cVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2386afK.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(c.a, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.b());
            C2318adw.e.b.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.afI$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2386afK.c> {
        public static final c a = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2386afK.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2386afK.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    eVar = (C2386afK.e) C8953gT.d(C8953gT.a(i.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2386afK.c(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2386afK.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(i.e, true)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.afI$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2386afK.e> {
        private static final List<String> a;
        public static final i e = new i();

        private i() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2386afK.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2514ahX c2514ahX = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2514ahX = C2511ahU.e.e.b(jsonReader, c9028hp);
            }
            return new C2386afK.e(str, c2514ahX);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2386afK.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            if (eVar.d() != null) {
                C2511ahU.e.e.e(interfaceC9069id, c9028hp, eVar.d());
            }
        }
    }
}
