package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.ahx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2540ahx {
    public static final C2540ahx a = new C2540ahx();

    /* renamed from: o.ahx$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2538ahv> {
        public static final c a = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "latestYear");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2538ahv b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2538ahv(str, num);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2538ahv c2538ahv) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2538ahv, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2538ahv.e());
            interfaceC9069id.e("latestYear");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2538ahv.d());
        }
    }

    private C2540ahx() {
    }
}
