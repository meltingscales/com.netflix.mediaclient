package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2394afS;
import o.C2511ahU;
import o.C2528ahl;
import o.C2641ajs;

/* renamed from: o.afU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2396afU {
    public static final C2396afU b = new C2396afU();

    /* renamed from: o.afU$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2394afS> {
        public static final d a = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cwEntities");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2394afS b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2394afS.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    eVar = (C2394afS.e) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2529ahm b = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2394afS(str, eVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2394afS c2394afS) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2394afS, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2394afS.e());
            interfaceC9069id.e("cwEntities");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2394afS.d());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2394afS.b());
        }
    }

    private C2396afU() {
    }

    /* renamed from: o.afU$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2394afS.e> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2394afS.e b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.a, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2394afS.e(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2394afS.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.a, false, 1, null)))).e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.afU$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2394afS.d> {
        public static final a a = new a();
        private static final List<String> b;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2394afS.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2394afS.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C2394afS.c) C8953gT.d(C8953gT.c(b.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2394afS.d(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2394afS.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(b.d, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.afU$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2394afS.c> {
        public static final b d = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2394afS.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2394afS.a aVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2394afS.a) C8953gT.d(C8953gT.a(e.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2394afS.c(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2394afS.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(e.d, true)).e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* renamed from: o.afU$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2394afS.a> {
        public static final e d = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2394afS.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C2514ahX c2514ahX;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2638ajp c2638ajp = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2514ahX = C2511ahU.e.e.b(jsonReader, c9028hp);
            } else {
                c2514ahX = null;
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2638ajp = C2641ajs.c.b.b(jsonReader, c9028hp);
            }
            return new C2394afS.a(str, c2514ahX, c2638ajp);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2394afS.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            if (aVar.c() != null) {
                C2511ahU.e.e.e(interfaceC9069id, c9028hp, aVar.c());
            }
            if (aVar.b() != null) {
                C2641ajs.c.b.e(interfaceC9069id, c9028hp, aVar.b());
            }
        }
    }
}
