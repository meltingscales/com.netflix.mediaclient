package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1398Zw;

/* renamed from: o.acP  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2232acP {
    public static final C2232acP a = new C2232acP();

    /* renamed from: o.acP$b */
    /* loaded from: classes6.dex */
    public static final class b implements InterfaceC8949gP<C1398Zw.b> {
        private static final List<String> a;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("setEntityThumbRating");
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1398Zw.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1398Zw.g gVar = null;
            while (jsonReader.a(a) == 0) {
                gVar = (C1398Zw.g) C8953gT.d(C8953gT.c(d.e, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1398Zw.b(gVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1398Zw.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("setEntityThumbRating");
            C8953gT.d(C8953gT.c(d.e, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    private C2232acP() {
    }

    /* renamed from: o.acP$d */
    /* loaded from: classes6.dex */
    public static final class d implements InterfaceC8949gP<C1398Zw.g> {
        private static final List<String> d;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "entity", "errors");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1398Zw.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1398Zw.d dVar = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    dVar = (C1398Zw.d) C8953gT.d(C8953gT.a(e.e, true)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(a.c, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1398Zw.g(str, dVar, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1398Zw.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.c());
            interfaceC9069id.e("entity");
            C8953gT.d(C8953gT.a(e.e, true)).e(interfaceC9069id, c9028hp, gVar.a());
            interfaceC9069id.e("errors");
            C8953gT.d(C8953gT.a(C8953gT.c(a.c, false, 1, null))).e(interfaceC9069id, c9028hp, gVar.b());
        }
    }

    /* renamed from: o.acP$e */
    /* loaded from: classes6.dex */
    public static final class e implements InterfaceC8949gP<C1398Zw.d> {
        private static final List<String> a;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1398Zw.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1398Zw.e eVar = null;
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
                eVar = c.e.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C1398Zw.d(str, str2, eVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1398Zw.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.e());
            if (dVar.a() != null) {
                c.e.e(interfaceC9069id, c9028hp, dVar.a());
            }
        }
    }

    /* renamed from: o.acP$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC8949gP<C1398Zw.e> {
        private static final List<String> b;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("gameId", "thumbRating");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1398Zw.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            ThumbRating thumbRating = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    thumbRating = (ThumbRating) C8953gT.d(C3456azN.d).b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C1398Zw.e(num.intValue(), thumbRating);
            }
            C8956gW.a(jsonReader, "gameId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1398Zw.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.d()));
            interfaceC9069id.e("thumbRating");
            C8953gT.d(C3456azN.d).e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.acP$a */
    /* loaded from: classes6.dex */
    public static final class a implements InterfaceC8949gP<C1398Zw.c> {
        private static final List<String> a;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "message");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1398Zw.c b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C1398Zw.c(str, str2);
            } else {
                C8956gW.a(jsonReader, "message");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1398Zw.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e("message");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
