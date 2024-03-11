package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.RemoveProfileErrorCode;
import com.netflix.mediaclient.service.webclient.model.leafs.UserAccountConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1395Zt;

/* renamed from: o.acE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2221acE {
    public static final C2221acE b = new C2221acE();

    /* renamed from: o.acE$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1395Zt.c> {
        public static final b a = new b();
        private static final List<String> b;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("removeProfile");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1395Zt.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1395Zt.g gVar = null;
            while (jsonReader.a(b) == 0) {
                gVar = (C1395Zt.g) C8953gT.d(C8953gT.c(c.a, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1395Zt.c(gVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1395Zt.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("removeProfile");
            C8953gT.d(C8953gT.c(c.a, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    private C2221acE() {
    }

    /* renamed from: o.acE$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1395Zt.g> {
        public static final c a = new c();
        private static final List<String> b;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "account", "errors");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1395Zt.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1395Zt.a aVar = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    aVar = (C1395Zt.a) C8953gT.d(C8953gT.c(d.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.a(e.b, true))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1395Zt.g(str, aVar, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1395Zt.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.b());
            interfaceC9069id.e("account");
            C8953gT.d(C8953gT.c(d.c, false, 1, null)).e(interfaceC9069id, c9028hp, gVar.d());
            interfaceC9069id.e("errors");
            C8953gT.d(C8953gT.a(C8953gT.a(e.b, true))).e(interfaceC9069id, c9028hp, gVar.e());
        }
    }

    /* renamed from: o.acE$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1395Zt.a> {
        private static final List<String> b;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1395Zt.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1395Zt.a(str, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1395Zt.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e(UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE);
            C8953gT.l.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* renamed from: o.acE$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1395Zt.d> {
        public static final e b = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1395Zt.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1395Zt.b bVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("RemoveProfileError"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = a.c.b(jsonReader, c9028hp);
            }
            return new C1395Zt.d(str, bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1395Zt.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
            if (dVar.d() != null) {
                a.c.e(interfaceC9069id, c9028hp, dVar.d());
            }
        }
    }

    /* renamed from: o.acE$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1395Zt.b> {
        public static final a c = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("code");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1395Zt.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            RemoveProfileErrorCode removeProfileErrorCode = null;
            while (jsonReader.a(e) == 0) {
                removeProfileErrorCode = C3489azu.d.b(jsonReader, c9028hp);
            }
            if (removeProfileErrorCode != null) {
                return new C1395Zt.b(removeProfileErrorCode);
            }
            C8956gW.a(jsonReader, "code");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1395Zt.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("code");
            C3489azu.d.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }
}
