package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.XV;

/* loaded from: classes3.dex */
public final class ZK {
    public static final ZK e = new ZK();

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<XV.c> {
        private static final List<String> a;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("addTitleProtection");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XV.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            XV.b bVar = null;
            while (jsonReader.a(a) == 0) {
                bVar = (XV.b) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new XV.c(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XV.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("addTitleProtection");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    private ZK() {
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<XV.b> {
        public static final e b = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "success", "errors");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XV.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.i.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(a.c, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (bool != null) {
                return new XV.b(str, bool.booleanValue(), list);
            } else {
                C8956gW.a(jsonReader, "success");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XV.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("success");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(bVar.b()));
            interfaceC9069id.e("errors");
            C8953gT.d(C8953gT.a(C8953gT.c(a.c, false, 1, null))).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<XV.a> {
        private static final List<String> b;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "message");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public XV.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
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
                return new XV.a(str, str2);
            } else {
                C8956gW.a(jsonReader, "message");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XV.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("message");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }
}
