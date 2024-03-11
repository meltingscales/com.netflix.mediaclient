package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2528ahl;

/* renamed from: o.aga  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2464aga {
    public static final C2464aga a = new C2464aga();

    /* renamed from: o.aga$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2399afX> {
        private static final List<String> b;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2399afX b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2529ahm b2 = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2399afX(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2399afX c2399afX) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2399afX, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2399afX.b());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2399afX.a());
        }
    }

    private C2464aga() {
    }
}
