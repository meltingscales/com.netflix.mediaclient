package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.YM;

/* renamed from: o.aby  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2214aby {
    public static final C2214aby c = new C2214aby();

    /* renamed from: o.aby$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YM.b> {
        public static final a c = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("oAuth2Login");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YM.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YM.e eVar = null;
            while (jsonReader.a(e) == 0) {
                eVar = (YM.e) C8953gT.c(e.e, false, 1, null).b(jsonReader, c9028hp);
            }
            if (eVar != null) {
                return new YM.b(eVar);
            }
            C8956gW.a(jsonReader, "oAuth2Login");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YM.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("oAuth2Login");
            C8953gT.c(e.e, false, 1, null).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    private C2214aby() {
    }

    /* renamed from: o.aby$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YM.e> {
        private static final List<String> d;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "account");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YM.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            YM.a aVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (YM.a) C8953gT.c(c.b, false, 1, null).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (aVar != null) {
                return new YM.e(str, aVar);
            } else {
                C8956gW.a(jsonReader, "account");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YM.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("account");
            C8953gT.c(c.b, false, 1, null).e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.aby$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YM.a> {
        public static final c b = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "ownerGuid");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YM.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
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
                return new YM.a(str, str2);
            } else {
                C8956gW.a(jsonReader, "ownerGuid");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YM.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("ownerGuid");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }
}
