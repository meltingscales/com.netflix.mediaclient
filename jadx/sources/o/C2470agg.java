package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2370aev;
import o.C2407aff;
import o.C2467agd;

/* renamed from: o.agg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2470agg {
    public static final C2470agg e = new C2470agg();

    /* renamed from: o.agg$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2467agd> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "header", "trailerEntities");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2467agd b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2467agd.e eVar = null;
            C2467agd.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    eVar = (C2467agd.e) C8953gT.d(C8953gT.a(d.a, true)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    bVar = (C2467agd.b) C8953gT.d(C8953gT.a(b.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2467agd(str, eVar, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2467agd c2467agd) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2467agd, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2467agd.c());
            interfaceC9069id.e("header");
            C8953gT.d(C8953gT.a(d.a, true)).e(interfaceC9069id, c9028hp, c2467agd.d());
            interfaceC9069id.e("trailerEntities");
            C8953gT.d(C8953gT.a(b.d, true)).e(interfaceC9069id, c9028hp, c2467agd.a());
        }
    }

    private C2470agg() {
    }

    /* renamed from: o.agg$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2467agd.e> {
        public static final d a = new d();
        private static final List<String> b;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2467agd.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2409afh b2 = C2407aff.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2467agd.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2467agd.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            C2407aff.d.a.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.agg$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2467agd.b> {
        public static final b d = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2467agd.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2467agd.c b = c.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2467agd.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2467agd.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            c.b.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* renamed from: o.agg$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2467agd.c> {
        public static final c b = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("edges");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2467agd.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(d) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.d, true)))).b(jsonReader, c9028hp);
            }
            return new C2467agd.c(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2467agd.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.d, true)))).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.agg$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2467agd.a> {
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
        /* renamed from: c */
        public C2467agd.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2365aeq b = C2370aev.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2467agd.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2467agd.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            C2370aev.c.c.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }
}
