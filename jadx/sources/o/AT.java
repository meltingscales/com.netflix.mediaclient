package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AM;
import o.AP;
import o.BH;

/* loaded from: classes2.dex */
public final class AT {
    public static final AT c = new AT();

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<AM> {
        public static final b a = new b();
        public static final int b;
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "accessibilityDescription", "trackingInfo", "loggingViewName");
            e = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AM b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            AM.e eVar = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    eVar = (AM.e) C8953gT.d(C8953gT.a(e.b, true)).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str2 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            AS b2 = AP.d.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new AM(str, eVar, str2, str3, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AM am) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) am, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, am.c());
            interfaceC9069id.e("accessibilityDescription");
            C8953gT.d(C8953gT.a(e.b, true)).e(interfaceC9069id, c9028hp, am.b());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, am.a());
            interfaceC9069id.e("loggingViewName");
            C8953gT.t.e(interfaceC9069id, c9028hp, am.d());
            AP.d.b.e(interfaceC9069id, c9028hp, am.e());
        }
    }

    private AT() {
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<AM.e> {
        public static final e b = new e();
        public static final int c;
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AM.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new AM.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AM.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            BH.b.d.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }
}
