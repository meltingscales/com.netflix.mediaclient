package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2528ahl;

/* renamed from: o.agJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2447agJ {
    public static final C2447agJ c = new C2447agJ();

    /* renamed from: o.agJ$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2446agI> {
        public static final d a = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2446agI b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2529ahm b = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2446agI(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2446agI c2446agI) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2446agI, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2446agI.b());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2446agI.a());
        }
    }

    private C2447agJ() {
    }
}
