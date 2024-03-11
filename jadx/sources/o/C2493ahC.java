package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2494ahD;
import o.C2495ahE;

/* renamed from: o.ahC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2493ahC {
    public static final C2493ahC e = new C2493ahC();

    /* renamed from: o.ahC$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2494ahD> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "trackId", "feature", SignupConstants.Field.LANG_ID, "displayString", "entities");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2494ahD b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            C2494ahD.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    str3 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    cVar = (C2494ahD.c) C8953gT.d(C8953gT.c(d.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str3 != null) {
                return new C2494ahD(str, num, str2, str3, str4, cVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2494ahD c2494ahD) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2494ahD, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2494ahD.f());
            interfaceC9069id.e("trackId");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2494ahD.d());
            interfaceC9069id.e("feature");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2494ahD.c());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2494ahD.b());
            interfaceC9069id.e("displayString");
            c8994hH.e(interfaceC9069id, c9028hp, c2494ahD.e());
            interfaceC9069id.e("entities");
            C8953gT.d(C8953gT.c(d.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2494ahD.a());
        }
    }

    private C2493ahC() {
    }

    /* renamed from: o.ahC$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2494ahD.c> {
        public static final d a = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2494ahD.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(b.d, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2494ahD.c(str, num.intValue(), list);
            } else {
                C8956gW.a(jsonReader, "totalCount");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2494ahD.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("totalCount");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.b()));
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(b.d, false, 1, null))).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.ahC$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2494ahD.b> {
        private static final List<String> a;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2494ahD.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2494ahD.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    dVar = (C2494ahD.d) C8953gT.d(C8953gT.a(c.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2494ahD.b(str, str2, dVar);
            } else {
                C8956gW.a(jsonReader, "cursor");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2494ahD.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("cursor");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(c.d, true)).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.ahC$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2494ahD.d> {
        public static final c d = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2494ahD.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2492ahB b = C2495ahE.g.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2494ahD.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2494ahD.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            C2495ahE.g.b.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
