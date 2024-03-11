package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2338aeP;
import o.C2453agP;
import o.C2473agj;

/* renamed from: o.agL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2449agL {
    public static final C2449agL c = new C2449agL();

    /* renamed from: o.agL$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2453agP> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "readyToPlayEntities");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2453agP b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2453agP.b bVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bVar = (C2453agP.b) C8953gT.d(C8953gT.c(a.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2475agl b2 = C2473agj.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2453agP(str, bVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2453agP c2453agP) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2453agP, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2453agP.c());
            interfaceC9069id.e("readyToPlayEntities");
            C8953gT.d(C8953gT.c(a.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2453agP.d());
            C2473agj.a.d.e(interfaceC9069id, c9028hp, c2453agP.e());
        }
    }

    private C2449agL() {
    }

    /* renamed from: o.agL$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2453agP.b> {
        public static final a c = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2453agP.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(b.e, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2453agP.b(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2453agP.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(b.e, false, 1, null)))).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.agL$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2453agP.d> {
        private static final List<String> c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2453agP.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2453agP.e eVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    eVar = (C2453agP.e) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2453agP.d(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2453agP.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.agL$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2453agP.e> {
        private static final List<String> a;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2453agP.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2453agP.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C2453agP.c) C8953gT.d(C8953gT.a(d.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2453agP.e(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2453agP.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(d.b, true)).e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.agL$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2453agP.c> {
        public static final d b = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2453agP.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2340aeR c2340aeR = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2340aeR = C2338aeP.b.d.b(jsonReader, c9028hp);
            }
            return new C2453agP.c(str, c2340aeR);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2453agP.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            if (cVar.a() != null) {
                C2338aeP.b.d.e(interfaceC9069id, c9028hp, cVar.a());
            }
        }
    }
}
