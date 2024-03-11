package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2370aev;
import o.C2407aff;
import o.C2526ahj;

/* renamed from: o.ahg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2523ahg {
    public static final C2523ahg e = new C2523ahg();

    /* renamed from: o.ahg$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2526ahj> {
        public static final c a = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "header", "trailerEntities");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2526ahj b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2526ahj.d dVar = null;
            C2526ahj.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    dVar = (C2526ahj.d) C8953gT.d(C8953gT.a(e.a, true)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    cVar = (C2526ahj.c) C8953gT.d(C8953gT.a(d.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2526ahj(str, dVar, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2526ahj c2526ahj) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2526ahj, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2526ahj.a());
            interfaceC9069id.e("header");
            C8953gT.d(C8953gT.a(e.a, true)).e(interfaceC9069id, c9028hp, c2526ahj.c());
            interfaceC9069id.e("trailerEntities");
            C8953gT.d(C8953gT.a(d.e, true)).e(interfaceC9069id, c9028hp, c2526ahj.b());
        }
    }

    private C2523ahg() {
    }

    /* renamed from: o.ahg$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2526ahj.d> {
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
        /* renamed from: e */
        public C2526ahj.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2409afh b2 = C2407aff.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2526ahj.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2526ahj.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            C2407aff.d.a.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    /* renamed from: o.ahg$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2526ahj.c> {
        private static final List<String> b;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2526ahj.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2526ahj.e b2 = a.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2526ahj.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2526ahj.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            a.a.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.ahg$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2526ahj.e> {
        public static final a a = new a();
        private static final List<String> b;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("edges");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2526ahj.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(b) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.e, true)))).b(jsonReader, c9028hp);
            }
            return new C2526ahj.e(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2526ahj.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.e, true)))).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.ahg$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2526ahj.a> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2526ahj.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2365aeq b2 = C2370aev.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2526ahj.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2526ahj.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            C2370aev.c.c.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }
}
