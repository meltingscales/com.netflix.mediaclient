package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1388Zm;

/* renamed from: o.act  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2262act {
    public static final C2262act c = new C2262act();

    /* renamed from: o.act$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1388Zm.e> {
        private static final List<String> c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("currentProfile");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1388Zm.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1388Zm.d dVar = null;
            while (jsonReader.a(c) == 0) {
                dVar = (C1388Zm.d) C8953gT.d(C8953gT.c(a.c, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1388Zm.e(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1388Zm.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("currentProfile");
            C8953gT.d(C8953gT.c(a.c, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    private C2262act() {
    }

    /* renamed from: o.act$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1388Zm.d> {
        private static final List<String> a;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "publicIdentity");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1388Zm.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1388Zm.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C1388Zm.c) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1388Zm.d(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1388Zm.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("publicIdentity");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.act$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1388Zm.c> {
        public static final e c = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "handle");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1388Zm.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1388Zm.a aVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C1388Zm.a) C8953gT.d(C8953gT.c(b.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1388Zm.c(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1388Zm.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("handle");
            C8953gT.d(C8953gT.c(b.b, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.act$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1388Zm.a> {
        public static final b b = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "fullHandle");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1388Zm.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1388Zm.a(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1388Zm.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("fullHandle");
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
