package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2594aiy;
import o.XZ;

/* renamed from: o.aaa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2137aaa {
    public static final C2137aaa d = new C2137aaa();

    /* renamed from: o.aaa$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<XZ.a> {
        private static final List<String> c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("availablePreferredLocales");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public XZ.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            XZ.e eVar = null;
            while (jsonReader.a(c) == 0) {
                eVar = (XZ.e) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new XZ.a(eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XZ.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("availablePreferredLocales");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    private C2137aaa() {
    }

    /* renamed from: o.aaa$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<XZ.e> {
        private static final List<String> a;
        public static final e b = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XZ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(b.d, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new XZ.e(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XZ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(b.d, false, 1, null)))).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.aaa$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<XZ.b> {
        private static final List<String> c;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public XZ.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            XZ.c cVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (XZ.c) C8953gT.d(C8953gT.a(a.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new XZ.b(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XZ.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(a.a, true)).e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    /* renamed from: o.aaa$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<XZ.c> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XZ.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2545aiB b = C2594aiy.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new XZ.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XZ.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            C2594aiy.d.e.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }
}
