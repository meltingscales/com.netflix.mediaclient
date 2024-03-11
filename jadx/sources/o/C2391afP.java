package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2320ady;
import o.C2392afQ;
import o.C2460agW;

/* renamed from: o.afP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2391afP {
    public static final C2391afP c = new C2391afP();

    /* renamed from: o.afP$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2392afQ> {
        public static final b b = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "characterEntities");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2392afQ b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2392afQ.b bVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bVar = (C2392afQ.b) C8953gT.d(C8953gT.c(a.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2454agQ b2 = C2460agW.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2392afQ(str, bVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2392afQ c2392afQ) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2392afQ, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2392afQ.a());
            interfaceC9069id.e("characterEntities");
            C8953gT.d(C8953gT.c(a.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2392afQ.b());
            C2460agW.d.a.e(interfaceC9069id, c9028hp, c2392afQ.c());
        }
    }

    private C2391afP() {
    }

    /* renamed from: o.afP$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2392afQ.b> {
        private static final List<String> b;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2392afQ.b b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(c.c, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2392afQ.b(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2392afQ.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(c.c, false, 1, null)))).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.afP$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2392afQ.d> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2392afQ.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2392afQ.c cVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (C2392afQ.c) C8953gT.d(C8953gT.c(d.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2392afQ.d(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2392afQ.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(d.b, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* renamed from: o.afP$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2392afQ.c> {
        public static final d b = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2392afQ.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2392afQ.e eVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    eVar = (C2392afQ.e) C8953gT.d(C8953gT.a(e.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2392afQ.c(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2392afQ.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(e.e, true)).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.afP$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2392afQ.e> {
        private static final List<String> c;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2392afQ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2270adA c2270adA = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Character"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2270adA = C2320ady.e.a.b(jsonReader, c9028hp);
            }
            return new C2392afQ.e(str, c2270adA);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2392afQ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            if (eVar.b() != null) {
                C2320ady.e.a.e(interfaceC9069id, c9028hp, eVar.b());
            }
        }
    }
}
