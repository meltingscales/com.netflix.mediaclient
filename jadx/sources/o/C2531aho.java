package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2527ahk;
import o.C2528ahl;
import o.C2562aiS;

/* renamed from: o.aho  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2531aho {
    public static final C2531aho b = new C2531aho();

    /* renamed from: o.aho$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2527ahk> {
        public static final b b = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "genericContainerEntities");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2527ahk b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2527ahk.a aVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2527ahk.a) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2529ahm b2 = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2527ahk(str, aVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2527ahk c2527ahk) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2527ahk, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2527ahk.e());
            interfaceC9069id.e("genericContainerEntities");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2527ahk.b());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2527ahk.d());
        }
    }

    private C2531aho() {
    }

    /* renamed from: o.aho$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2527ahk.a> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2527ahk.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.b, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2527ahk.a(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2527ahk.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.b, false, 1, null)))).e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    /* renamed from: o.aho$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2527ahk.e> {
        public static final a b = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2527ahk.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2527ahk.b bVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bVar = (C2527ahk.b) C8953gT.d(C8953gT.c(d.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2527ahk.e(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2527ahk.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(d.b, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.aho$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2527ahk.b> {
        public static final d b = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2527ahk.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2527ahk.c cVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (C2527ahk.c) C8953gT.d(C8953gT.a(c.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2527ahk.b(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2527ahk.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(c.a, true)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.aho$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2527ahk.c> {
        public static final c a = new c();
        private static final List<String> b;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2527ahk.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2561aiR c2561aiR = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("GenericContainer"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2561aiR = C2562aiS.d.c.b(jsonReader, c9028hp);
            }
            return new C2527ahk.c(str, c2561aiR);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2527ahk.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            if (cVar.c() != null) {
                C2562aiS.d.c.e(interfaceC9069id, c9028hp, cVar.c());
            }
        }
    }
}
