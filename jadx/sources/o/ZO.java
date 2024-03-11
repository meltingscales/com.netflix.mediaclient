package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.XQ;

/* loaded from: classes3.dex */
public final class ZO {
    public static final ZO e = new ZO();

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<XQ.e> {
        private static final List<String> b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("addEntityToPlaylist");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XQ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            XQ.b bVar = null;
            while (jsonReader.a(b) == 0) {
                bVar = (XQ.b) C8953gT.d(C8953gT.c(c.a, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new XQ.e(bVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XQ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("addEntityToPlaylist");
            C8953gT.d(C8953gT.c(c.a, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    private ZO() {
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<XQ.b> {
        public static final c a = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "entity", "errors");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public XQ.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            XQ.d dVar = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    dVar = (XQ.d) C8953gT.d(C8953gT.a(b.e, true)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(d.e, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new XQ.b(str, dVar, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XQ.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("entity");
            C8953gT.d(C8953gT.a(b.e, true)).e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("errors");
            C8953gT.d(C8953gT.a(C8953gT.c(d.e, false, 1, null))).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<XQ.d> {
        private static final List<String> a;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public XQ.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            XQ.j jVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
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
                jVar = a.b.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new XQ.d(str, str2, jVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XQ.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.d());
            if (dVar.b() != null) {
                a.b.e(interfaceC9069id, c9028hp, dVar.b());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<XQ.j> {
        public static final a b = new a();
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
        public XQ.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new XQ.j(num.intValue(), bool);
            }
            C8956gW.a(jsonReader, "gameId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XQ.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(jVar.c()));
            interfaceC9069id.e("isInPlaylist");
            C8953gT.l.e(interfaceC9069id, c9028hp, jVar.a());
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<XQ.a> {
        private static final List<String> a;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "message");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XQ.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new XQ.a(str, str2);
            } else {
                C8956gW.a(jsonReader, "message");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XQ.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e("message");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }
}
