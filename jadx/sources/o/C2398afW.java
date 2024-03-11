package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2395afT;
import o.C2402afa;
import o.C2460agW;

/* renamed from: o.afW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2398afW {
    public static final C2398afW a = new C2398afW();

    /* renamed from: o.afW$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2395afT> {
        private static final List<String> b;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "genericContainerEntities");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2395afT b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2395afT.d dVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    dVar = (C2395afT.d) C8953gT.d(C8953gT.c(d.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2454agQ b2 = C2460agW.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2395afT(str, dVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2395afT c2395afT) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2395afT, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2395afT.a());
            interfaceC9069id.e("genericContainerEntities");
            C8953gT.d(C8953gT.c(d.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2395afT.e());
            C2460agW.d.a.e(interfaceC9069id, c9028hp, c2395afT.b());
        }
    }

    private C2398afW() {
    }

    /* renamed from: o.afW$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2395afT.d> {
        private static final List<String> a;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2395afT.d b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(c.b, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2395afT.d(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2395afT.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(c.b, false, 1, null)))).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.afW$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2395afT.c> {
        private static final List<String> a;
        public static final c b = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2395afT.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2395afT.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    eVar = (C2395afT.e) C8953gT.d(C8953gT.c(b.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2395afT.c(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2395afT.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(b.c, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.afW$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2395afT.e> {
        private static final List<String> a;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2395afT.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2395afT.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bVar = (C2395afT.b) C8953gT.d(C8953gT.a(a.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2395afT.e(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2395afT.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(a.e, true)).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.afW$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2395afT.b> {
        private static final List<String> c;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2395afT.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2348aeZ c2348aeZ = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("GenericContainer"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2348aeZ = C2402afa.e.a.b(jsonReader, c9028hp);
            }
            return new C2395afT.b(str, c2348aeZ);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2395afT.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            if (bVar.e() != null) {
                C2402afa.e.a.e(interfaceC9069id, c9028hp, bVar.e());
            }
        }
    }
}
