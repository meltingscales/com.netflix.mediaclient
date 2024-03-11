package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1343Ya;
import o.C2532ahp;

/* loaded from: classes3.dex */
public final class ZY {
    public static final ZY e = new ZY();

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1343Ya.e> {
        private static final List<String> a;
        public static final c b = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("parentalControlMaturityRatings");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1343Ya.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(a) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.d, true)))).b(jsonReader, c9028hp);
            }
            return new C1343Ya.e(list);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1343Ya.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("parentalControlMaturityRatings");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.d, true)))).e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    private ZY() {
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1343Ya.a> {
        private static final List<String> a;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1343Ya.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2536aht b = C2532ahp.d.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1343Ya.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1343Ya.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            C2532ahp.d.c.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
