package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2290adU;

/* renamed from: o.adV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2291adV {
    public static final C2291adV e = new C2291adV();

    /* renamed from: o.adV$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2290adU> {
        public static final b a = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2290adU b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(c.b, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2290adU(str, num, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2290adU c2290adU) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2290adU, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2290adU.a());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2290adU.d());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(c.b, false, 1, null)))).e(interfaceC9069id, c9028hp, c2290adU.b());
        }
    }

    private C2291adV() {
    }

    /* renamed from: o.adV$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2290adU.b> {
        public static final c b = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2290adU.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2290adU.c cVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (C2290adU.c) C8953gT.d(C8953gT.c(a.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2290adU.b(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2290adU.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.c(a.a, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.adV$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2290adU.c> {
        public static final a a = new a();
        private static final List<String> b;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId", "personId", SignupConstants.Field.VIDEO_TITLE, "name");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2290adU.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 4) {
                    break;
                } else {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 == null) {
                C8956gW.a(jsonReader, "unifiedEntityId");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2290adU.c(str, str2, num.intValue(), str3, str4);
            } else {
                C8956gW.a(jsonReader, "personId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2290adU.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("personId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.c()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("name");
            c8994hH.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }
}
