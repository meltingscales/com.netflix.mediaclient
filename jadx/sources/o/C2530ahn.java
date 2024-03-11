package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2528ahl;

/* renamed from: o.ahn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2530ahn {
    public static final C2530ahn b = new C2530ahn();

    /* renamed from: o.ahn$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2525ahi> {
        public static final b b = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2525ahi b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2529ahm b2 = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2525ahi(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2525ahi c2525ahi) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2525ahi, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2525ahi.b());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2525ahi.c());
        }
    }

    private C2530ahn() {
    }
}
