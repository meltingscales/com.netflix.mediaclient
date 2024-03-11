package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2334aeL;
import o.C2338aeP;
import o.C2343aeU;
import o.C2471agh;
import o.C2473agj;

/* renamed from: o.agk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2474agk {
    public static final C2474agk e = new C2474agk();

    /* renamed from: o.agk$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2471agh> {
        public static final c a = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "gameBillboardEntities");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2471agh b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2471agh.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    aVar = (C2471agh.a) C8953gT.d(C8953gT.c(a.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2475agl b = C2473agj.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2471agh(str, aVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2471agh c2471agh) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2471agh, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2471agh.a());
            interfaceC9069id.e("gameBillboardEntities");
            C8953gT.d(C8953gT.c(a.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2471agh.d());
            C2473agj.a.d.e(interfaceC9069id, c9028hp, c2471agh.e());
        }
    }

    private C2474agk() {
    }

    /* renamed from: o.agk$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2471agh.a> {
        public static final a a = new a();
        private static final List<String> b;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2471agh.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(b.b, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2471agh.a(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2471agh.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(b.b, false, 1, null)))).e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* renamed from: o.agk$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2471agh.c> {
        public static final b b = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node", "impressionToken");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2471agh.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2471agh.e eVar = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    eVar = (C2471agh.e) C8953gT.d(C8953gT.c(d.d, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2471agh.c(str, eVar, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2471agh.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(d.d, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("impressionToken");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.agk$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2471agh.e> {
        private static final List<String> b;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "reference");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2471agh.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2471agh.d dVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    dVar = (C2471agh.d) C8953gT.d(C8953gT.a(f.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2471agh.e(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2471agh.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(f.d, true)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* renamed from: o.agk$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2471agh.d> {
        private static final List<String> b;
        public static final f d = new f();

        private f() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2471agh.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C2471agh.b bVar;
            C2335aeM c2335aeM;
            C2340aeR c2340aeR;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2347aeY c2347aeY = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = e.e.b(jsonReader, c9028hp);
            } else {
                bVar = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2335aeM = C2334aeL.e.a.b(jsonReader, c9028hp);
            } else {
                c2335aeM = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2340aeR = C2338aeP.b.d.b(jsonReader, c9028hp);
            } else {
                c2340aeR = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2347aeY = C2343aeU.d.a.b(jsonReader, c9028hp);
            }
            return new C2471agh.d(str, bVar, c2335aeM, c2340aeR, c2347aeY);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2471agh.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            if (dVar.c() != null) {
                e.e.e(interfaceC9069id, c9028hp, dVar.c());
            }
            if (dVar.b() != null) {
                C2334aeL.e.a.e(interfaceC9069id, c9028hp, dVar.b());
            }
            if (dVar.d() != null) {
                C2338aeP.b.d.e(interfaceC9069id, c9028hp, dVar.d());
            }
            if (dVar.a() != null) {
                C2343aeU.d.a.e(interfaceC9069id, c9028hp, dVar.a());
            }
        }
    }

    /* renamed from: o.agk$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2471agh.b> {
        private static final List<String> d;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("gameId", "tags", "isInPlaylist");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2471agh.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            List list = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(g.d, false, 1, null)))).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C2471agh.b(num.intValue(), list, bool);
            }
            C8956gW.a(jsonReader, "gameId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2471agh.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.e()));
            interfaceC9069id.e("tags");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(g.d, false, 1, null)))).e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("isInPlaylist");
            C8953gT.l.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.agk$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2471agh.h> {
        private static final List<String> b;
        public static final g d = new g();

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "displayName");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2471agh.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2471agh.h(str, num, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2471agh.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.e());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8953gT.n.e(interfaceC9069id, c9028hp, hVar.d());
            interfaceC9069id.e("displayName");
            C8953gT.t.e(interfaceC9069id, c9028hp, hVar.a());
        }
    }
}
