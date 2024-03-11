package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2519ahc;
import o.C2528ahl;
import o.C2556aiM;

/* renamed from: o.aha  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2517aha {
    public static final C2517aha a = new C2517aha();

    /* renamed from: o.aha$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2519ahc> {
        public static final d b = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "renderRichUITreatment", "tallPanelEntities");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2519ahc b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            C2519ahc.d dVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    dVar = (C2519ahc.d) C8953gT.d(C8953gT.c(a.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2529ahm b2 = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2519ahc(str, bool, dVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2519ahc c2519ahc) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2519ahc, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2519ahc.a());
            interfaceC9069id.e("renderRichUITreatment");
            C8953gT.l.e(interfaceC9069id, c9028hp, c2519ahc.b());
            interfaceC9069id.e("tallPanelEntities");
            C8953gT.d(C8953gT.c(a.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2519ahc.c());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2519ahc.e());
        }
    }

    private C2517aha() {
    }

    /* renamed from: o.aha$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2519ahc.d> {
        public static final a b = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2519ahc.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(c.a, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2519ahc.d(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2519ahc.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(c.a, false, 1, null)))).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.aha$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2519ahc.c> {
        public static final c a = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2519ahc.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2519ahc.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bVar = (C2519ahc.b) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2519ahc.c(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2519ahc.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.aha$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2519ahc.b> {
        public static final e b = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2519ahc.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2519ahc.a aVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2519ahc.a) C8953gT.d(C8953gT.a(b.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2519ahc.b(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2519ahc.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(b.a, true)).e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* renamed from: o.aha$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2519ahc.a> {
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
        /* renamed from: c */
        public C2519ahc.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2559aiP c2559aiP = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2559aiP = C2556aiM.b.e.b(jsonReader, c9028hp);
            }
            return new C2519ahc.a(str, c2559aiP);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2519ahc.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            if (aVar.b() != null) {
                C2556aiM.b.e.e(interfaceC9069id, c9028hp, aVar.b());
            }
        }
    }
}
