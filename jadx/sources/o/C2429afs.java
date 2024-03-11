package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2415afn;
import o.C2422afq;

/* renamed from: o.afs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2429afs {
    public static final C2429afs e = new C2429afs();

    /* renamed from: o.afs$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2415afn> {
        private static final List<String> d;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "trackId", "feature", SignupConstants.Field.LANG_ID, "displayString", "entities");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2415afn b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            C2415afn.e eVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str3 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 4) {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    eVar = (C2415afn.e) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str3 != null) {
                return new C2415afn(str, num, str2, str3, str4, eVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2415afn c2415afn) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2415afn, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2415afn.f());
            interfaceC9069id.e("trackId");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2415afn.d());
            interfaceC9069id.e("feature");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2415afn.a());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2415afn.e());
            interfaceC9069id.e("displayString");
            c8994hH.e(interfaceC9069id, c9028hp, c2415afn.b());
            interfaceC9069id.e("entities");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2415afn.c());
        }
    }

    private C2429afs() {
    }

    /* renamed from: o.afs$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2415afn.e> {
        private static final List<String> a;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2415afn.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(d.b, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2415afn.e(str, num.intValue(), list);
            } else {
                C8956gW.a(jsonReader, "totalCount");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2415afn.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("totalCount");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.b()));
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(d.b, false, 1, null))).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* renamed from: o.afs$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2415afn.d> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2415afn.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2415afn.b bVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    bVar = (C2415afn.b) C8953gT.d(C8953gT.a(a.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2415afn.d(str, str2, bVar);
            } else {
                C8956gW.a(jsonReader, "cursor");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2415afn.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("cursor");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(a.d, true)).e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    /* renamed from: o.afs$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2415afn.b> {
        public static final a d = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2415afn.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2416afo b = C2422afq.g.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2415afn.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2415afn.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            C2422afq.g.d.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }
}
