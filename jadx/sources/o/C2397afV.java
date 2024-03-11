package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2528ahl;

/* renamed from: o.afV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2397afV {
    public static final C2397afV c = new C2397afV();

    /* renamed from: o.afV$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2393afR> {
        private static final List<String> a;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2393afR b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2529ahm b = C2528ahl.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2393afR(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2393afR c2393afR) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2393afR, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2393afR.a());
            C2528ahl.e.e.e(interfaceC9069id, c9028hp, c2393afR.d());
        }
    }

    private C2397afV() {
    }
}
