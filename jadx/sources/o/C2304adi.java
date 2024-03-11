package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2305adj;
import o.C2321adz;
import o.C2528ahl;

/* renamed from: o.adi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2304adi {
    public static final C2304adi a = new C2304adi();

    /* renamed from: o.adi$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2305adj> {
        private static final List<String> c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "recommendationRowEntities");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2305adj b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2305adj.b bVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bVar = (C2305adj.b) C8953gT.d(C8953gT.c(e.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2529ahm b = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2305adj(str, bVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2305adj c2305adj) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2305adj, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2305adj.c());
            interfaceC9069id.e("recommendationRowEntities");
            C8953gT.d(C8953gT.c(e.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2305adj.d());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2305adj.a());
        }
    }

    private C2304adi() {
    }

    /* renamed from: o.adi$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2305adj.b> {
        private static final List<String> b;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2305adj.b b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.e, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2305adj.b(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2305adj.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.e, false, 1, null)))).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.adi$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2305adj.e> {
        private static final List<String> b;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "ratedNode");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2305adj.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2305adj.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2305adj.a) C8953gT.d(C8953gT.c(a.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2305adj.e(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2305adj.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("ratedNode");
            C8953gT.d(C8953gT.c(a.b, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* renamed from: o.adi$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2305adj.a> {
        public static final a b = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2305adj.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2305adj.d dVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    dVar = (C2305adj.d) C8953gT.d(C8953gT.a(c.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2305adj.a(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2305adj.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(c.d, true)).e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* renamed from: o.adi$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2305adj.d> {
        private static final List<String> b;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2305adj.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2271adB c2271adB = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2271adB = C2321adz.e.c.b(jsonReader, c9028hp);
            }
            return new C2305adj.d(str, c2271adB);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2305adj.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            if (dVar.d() != null) {
                C2321adz.e.c.e(interfaceC9069id, c9028hp, dVar.d());
            }
        }
    }
}
