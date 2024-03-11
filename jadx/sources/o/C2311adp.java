package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2528ahl;

/* renamed from: o.adp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2311adp {
    public static final C2311adp a = new C2311adp();

    /* renamed from: o.adp$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2309adn> {
        public static final d c = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2309adn b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2529ahm b = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2309adn(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2309adn c2309adn) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2309adn, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2309adn.d());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2309adn.e());
        }
    }

    private C2311adp() {
    }
}
