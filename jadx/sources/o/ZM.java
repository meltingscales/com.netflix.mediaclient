package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.AddProfileErrorCode;
import com.netflix.mediaclient.service.webclient.model.leafs.UserAccountConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2623aja;
import o.XX;

/* loaded from: classes3.dex */
public final class ZM {
    public static final ZM a = new ZM();

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<XX.e> {
        public static final b c = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("addProfile");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public XX.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            XX.a aVar = null;
            while (jsonReader.a(d) == 0) {
                aVar = (XX.a) C8953gT.d(C8953gT.c(d.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new XX.e(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XX.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("addProfile");
            C8953gT.d(C8953gT.c(d.b, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    private ZM() {
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<XX.a> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "account", "errors");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XX.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            XX.d dVar = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    dVar = (XX.d) C8953gT.d(C8953gT.c(a.e, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.a(e.d, true))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new XX.a(str, dVar, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XX.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("account");
            C8953gT.d(C8953gT.c(a.e, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("errors");
            C8953gT.d(C8953gT.a(C8953gT.a(e.d, true))).e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<XX.d> {
        private static final List<String> d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE, "profiles");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public XX.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = C8953gT.a(C8953gT.a(g.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (list != null) {
                return new XX.d(str, bool, list);
            } else {
                C8956gW.a(jsonReader, "profiles");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XX.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e(UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE);
            C8953gT.l.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("profiles");
            C8953gT.a(C8953gT.a(g.a, true)).e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<XX.g> {
        public static final g a = new g();
        private static final List<String> b;

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public XX.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2567aiX b2 = C2623aja.j.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new XX.g(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XX.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.d());
            C2623aja.j.a.e(interfaceC9069id, c9028hp, gVar.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<XX.c> {
        private static final List<String> a;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public XX.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            XX.f fVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("AddProfileError"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                fVar = c.c.b(jsonReader, c9028hp);
            }
            return new XX.c(str, fVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XX.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            if (cVar.e() != null) {
                c.c.e(interfaceC9069id, c9028hp, cVar.e());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<XX.f> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("code");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public XX.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            AddProfileErrorCode addProfileErrorCode = null;
            while (jsonReader.a(b) == 0) {
                addProfileErrorCode = C3384axv.c.b(jsonReader, c9028hp);
            }
            if (addProfileErrorCode != null) {
                return new XX.f(addProfileErrorCode);
            }
            C8956gW.a(jsonReader, "code");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XX.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("code");
            C3384axv.c.e(interfaceC9069id, c9028hp, fVar.d());
        }
    }
}
