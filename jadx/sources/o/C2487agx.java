package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2378afC;
import o.C2438agA;
import o.C2528ahl;

/* renamed from: o.agx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2487agx {
    public static final C2487agx c = new C2487agx();

    /* renamed from: o.agx$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2438agA> {
        private static final List<String> a;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "kidsFavoritesEntities");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2438agA b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2438agA.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bVar = (C2438agA.b) C8953gT.d(C8953gT.c(a.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2529ahm b = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2438agA(str, bVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2438agA c2438agA) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2438agA, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2438agA.d());
            interfaceC9069id.e("kidsFavoritesEntities");
            C8953gT.d(C8953gT.c(a.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2438agA.b());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2438agA.e());
        }
    }

    private C2487agx() {
    }

    /* renamed from: o.agx$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2438agA.b> {
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
        public C2438agA.b b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.a, true)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2438agA.b(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2438agA.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.a, true)))).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.agx$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2438agA.a> {
        public static final c a = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isMysteryTitle", "isImpressed");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2438agA.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2432afv b = C2378afC.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2438agA.a(str, bool, bool2, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2438agA.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("isMysteryTitle");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e("isImpressed");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.d());
            C2378afC.c.d.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }
}
