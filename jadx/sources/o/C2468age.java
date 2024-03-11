package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2528ahl;

/* renamed from: o.age  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2468age {
    public static final C2468age a = new C2468age();

    /* renamed from: o.age$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2469agf> {
        public static final c a = new c();
        private static final List<String> b;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2469agf b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2529ahm b2 = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2469agf(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2469agf c2469agf) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2469agf, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2469agf.d());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2469agf.e());
        }
    }

    private C2468age() {
    }
}
