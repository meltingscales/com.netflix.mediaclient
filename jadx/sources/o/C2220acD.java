package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1392Zq;

/* renamed from: o.acD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2220acD {
    public static final C2220acD c = new C2220acD();

    /* renamed from: o.acD$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1392Zq.b> {
        private static final List<String> d;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("removeEntityFromPlaylist");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1392Zq.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1392Zq.g gVar = null;
            while (jsonReader.a(d) == 0) {
                gVar = (C1392Zq.g) C8953gT.d(C8953gT.c(b.d, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1392Zq.b(gVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1392Zq.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("removeEntityFromPlaylist");
            C8953gT.d(C8953gT.c(b.d, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    private C2220acD() {
    }

    /* renamed from: o.acD$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1392Zq.g> {
        private static final List<String> c;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "entity", "errors");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1392Zq.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1392Zq.d dVar = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    dVar = (C1392Zq.d) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(d.c, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1392Zq.g(str, dVar, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1392Zq.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.a());
            interfaceC9069id.e("entity");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, gVar.d());
            interfaceC9069id.e("errors");
            C8953gT.d(C8953gT.a(C8953gT.c(d.c, false, 1, null))).e(interfaceC9069id, c9028hp, gVar.b());
        }
    }

    /* renamed from: o.acD$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1392Zq.d> {
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1392Zq.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1392Zq.c cVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = a.a.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C1392Zq.d(str, str2, cVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1392Zq.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.e());
            if (dVar.a() != null) {
                a.a.e(interfaceC9069id, c9028hp, dVar.a());
            }
        }
    }

    /* renamed from: o.acD$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1392Zq.c> {
        public static final a a = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("gameId", "isInPlaylist");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1392Zq.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C1392Zq.c(num.intValue(), bool);
            }
            C8956gW.a(jsonReader, "gameId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1392Zq.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.d()));
            interfaceC9069id.e("isInPlaylist");
            C8953gT.l.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.acD$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1392Zq.e> {
        public static final d c = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "message");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1392Zq.e b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C1392Zq.e(str, str2);
            } else {
                C8956gW.a(jsonReader, "message");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1392Zq.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("message");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }
}
