package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1351Yi;
import o.C2626ajd;

/* renamed from: o.aar  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2154aar {
    public static final C2154aar a = new C2154aar();

    /* renamed from: o.aar$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1351Yi.e> {
        private static final List<String> b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("downloadsForYou");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1351Yi.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1351Yi.c cVar = null;
            while (jsonReader.a(b) == 0) {
                cVar = (C1351Yi.c) C8953gT.d(C8953gT.c(d.d, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1351Yi.e(cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1351Yi.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("downloadsForYou");
            C8953gT.d(C8953gT.c(d.d, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    private C2154aar() {
    }

    /* renamed from: o.aar$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1351Yi.c> {
        private static final List<String> c;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1351Yi.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(a.c, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1351Yi.c(str, num, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1351Yi.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(a.c, false, 1, null))).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.aar$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1351Yi.b> {
        private static final List<String> a;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1351Yi.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1351Yi.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    aVar = (C1351Yi.a) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1351Yi.b(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1351Yi.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.aar$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1351Yi.a> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1351Yi.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2625ajc b2 = C2626ajd.d.d.b(jsonReader, c9028hp);
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1351Yi.a(str, num.intValue(), b2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1351Yi.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.e()));
            C2626ajd.d.d.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }
}
