package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.webclient.model.leafs.UserAccountConstants;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2623aja;
import o.XP;

/* loaded from: classes3.dex */
public final class ZG {
    public static final ZG b = new ZG();

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<XP.e> {
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("account");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public XP.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            XP.d dVar = null;
            while (jsonReader.a(d) == 0) {
                dVar = (XP.d) C8953gT.d(C8953gT.c(b.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new XP.e(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XP.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("account");
            C8953gT.d(C8953gT.c(b.b, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    private ZG() {
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<XP.d> {
        private static final List<String> a;
        public static final b b = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE, UserAccountConstants.FIELD_SIGNUP_COUNTRY, "isAgeVerified", "isNonMember", UserAccountConstants.FIELD_MEMBER_SINCE, "ownerGuid", "planInfo", "profiles");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public XP.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            XP.c cVar = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Instant instant = null;
            String str2 = null;
            XP.a aVar = null;
            List list = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        cVar = (XP.c) C8953gT.d(C8953gT.c(a.b, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        bool2 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        bool3 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        str2 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        aVar = (XP.a) C8953gT.d(C8953gT.c(d.b, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        list = C8953gT.a(C8953gT.a(e.d, true)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (str2 == null) {
                            C8956gW.a(jsonReader, "ownerGuid");
                            throw new KotlinNothingValueException();
                        } else if (list != null) {
                            return new XP.d(str, bool, cVar, bool2, bool3, instant, str2, aVar, list);
                        } else {
                            C8956gW.a(jsonReader, "profiles");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XP.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.j());
            interfaceC9069id.e(UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE);
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e(UserAccountConstants.FIELD_SIGNUP_COUNTRY);
            C8953gT.d(C8953gT.c(a.b, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("isAgeVerified");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.g());
            interfaceC9069id.e("isNonMember");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.h());
            interfaceC9069id.e(UserAccountConstants.FIELD_MEMBER_SINCE);
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("ownerGuid");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("planInfo");
            C8953gT.d(C8953gT.c(d.b, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("profiles");
            C8953gT.a(C8953gT.a(e.d, true)).e(interfaceC9069id, c9028hp, dVar.i());
        }
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<XP.c> {
        public static final a b = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "code");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public XP.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
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
                return new XP.c(str, str2);
            } else {
                C8956gW.a(jsonReader, "code");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XP.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("code");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<XP.a> {
        private static final List<String> a;
        public static final d b = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isMobileOnlyPlan");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XP.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new XP.a(str, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XP.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("isMobileOnlyPlan");
            C8953gT.l.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<XP.h> {
        private static final List<String> b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public XP.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2567aiX b2 = C2623aja.j.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new XP.h(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XP.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.e());
            C2623aja.j.a.e(interfaceC9069id, c9028hp, hVar.a());
        }
    }
}
