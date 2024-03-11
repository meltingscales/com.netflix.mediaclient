package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.CountryCode;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.YT;

/* renamed from: o.abB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2165abB {
    public static final C2165abB b = new C2165abB();

    /* renamed from: o.abB$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YT.b> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("getOctoberSkyCountriesProperties");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YT.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(b) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.b, true)))).b(jsonReader, c9028hp);
            }
            return new YT.b(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YT.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("getOctoberSkyCountriesProperties");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.b, true)))).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    private C2165abB() {
    }

    /* renamed from: o.abB$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YT.a> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YT.a b(JsonReader jsonReader, C9028hp c9028hp) {
            YT.g gVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YT.j jVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("OctoberSkyPropertyURL"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                gVar = h.c.b(jsonReader, c9028hp);
            } else {
                gVar = null;
            }
            if (C9014hb.d(C9014hb.c("OctoberSkyPropertyBoolean"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                jVar = d.d.b(jsonReader, c9028hp);
            }
            return new YT.a(str, gVar, jVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YT.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            if (aVar.c() != null) {
                h.c.e(interfaceC9069id, c9028hp, aVar.c());
            }
            if (aVar.b() != null) {
                d.d.e(interfaceC9069id, c9028hp, aVar.b());
            }
        }
    }

    /* renamed from: o.abB$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<YT.g> {
        public static final h c = new h();
        private static final List<String> d;

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.LANG_ID, "country", "urlValue");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YT.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            YT.e eVar = null;
            Object obj = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    eVar = (YT.e) C8953gT.c(b.d, false, 1, null).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    obj = C8953gT.m.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            } else if (eVar != null) {
                return new YT.g(str, eVar, obj);
            } else {
                C8956gW.a(jsonReader, "country");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YT.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.a());
            interfaceC9069id.e("country");
            C8953gT.c(b.d, false, 1, null).e(interfaceC9069id, c9028hp, gVar.e());
            interfaceC9069id.e("urlValue");
            C8953gT.m.e(interfaceC9069id, c9028hp, gVar.d());
        }
    }

    /* renamed from: o.abB$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YT.e> {
        private static final List<String> a;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "englishName");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YT.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CountryCode countryCode = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    countryCode = C3350axN.c.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (countryCode != null) {
                return new YT.e(str, countryCode, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YT.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C3350axN.c.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("englishName");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.abB$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YT.j> {
        private static final List<String> a;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.LANG_ID, "country", "booleanValue");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YT.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            YT.c cVar = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    cVar = (YT.c) C8953gT.c(a.c, false, 1, null).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            } else if (cVar != null) {
                return new YT.j(str, cVar, bool);
            } else {
                C8956gW.a(jsonReader, "country");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YT.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.d());
            interfaceC9069id.e("country");
            C8953gT.c(a.c, false, 1, null).e(interfaceC9069id, c9028hp, jVar.a());
            interfaceC9069id.e("booleanValue");
            C8953gT.l.e(interfaceC9069id, c9028hp, jVar.b());
        }
    }

    /* renamed from: o.abB$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YT.c> {
        private static final List<String> a;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "englishName");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YT.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CountryCode countryCode = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    countryCode = C3350axN.c.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (countryCode != null) {
                return new YT.c(str, countryCode, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YT.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C3350axN.c.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("englishName");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }
}
