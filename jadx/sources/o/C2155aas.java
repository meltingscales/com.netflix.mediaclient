package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1352Yj;
import o.C2292adW;

/* renamed from: o.aas  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2155aas {
    public static final C2155aas a = new C2155aas();

    /* renamed from: o.aas$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1352Yj.d> {
        public static final a a = new a();
        private static final List<String> b;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("downloadsForYou");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1352Yj.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1352Yj.b bVar = null;
            while (jsonReader.a(b) == 0) {
                bVar = (C1352Yj.b) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1352Yj.d(bVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1352Yj.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("downloadsForYou");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    private C2155aas() {
    }

    /* renamed from: o.aas$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1352Yj.b> {
        private static final List<String> a;
        public static final e b = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1352Yj.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(d.d, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1352Yj.b(str, num, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1352Yj.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(d.d, false, 1, null))).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.aas$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1352Yj.c> {
        private static final List<String> c;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1352Yj.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1352Yj.a aVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C1352Yj.a) C8953gT.d(C8953gT.a(c.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1352Yj.c(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1352Yj.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(c.a, true)).e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.aas$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1352Yj.a> {
        public static final c a = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1352Yj.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2293adX b = C2292adW.d.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1352Yj.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1352Yj.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            C2292adW.d.d.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
