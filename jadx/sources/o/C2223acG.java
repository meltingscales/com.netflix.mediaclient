package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1396Zu;

/* renamed from: o.acG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2223acG {
    public static final C2223acG a = new C2223acG();

    /* renamed from: o.acG$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1396Zu.e> {
        private static final List<String> b;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("removeTitleProtection");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1396Zu.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1396Zu.d dVar = null;
            while (jsonReader.a(b) == 0) {
                dVar = (C1396Zu.d) C8953gT.d(C8953gT.c(d.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1396Zu.e(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1396Zu.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("removeTitleProtection");
            C8953gT.d(C8953gT.c(d.b, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    private C2223acG() {
    }

    /* renamed from: o.acG$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1396Zu.d> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "success", "errors");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1396Zu.d b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(c.c, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (bool != null) {
                return new C1396Zu.d(str, bool.booleanValue(), list);
            } else {
                C8956gW.a(jsonReader, "success");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1396Zu.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("success");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(dVar.a()));
            interfaceC9069id.e("errors");
            C8953gT.d(C8953gT.a(C8953gT.c(c.c, false, 1, null))).e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    /* renamed from: o.acG$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1396Zu.a> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "message");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1396Zu.a b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C1396Zu.a(str, str2);
            } else {
                C8956gW.a(jsonReader, "message");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1396Zu.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("message");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }
}
