package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.ahp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2532ahp {
    public static final C2532ahp d = new C2532ahp();

    /* renamed from: o.ahp$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2536aht> {
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "maturityLevel", "label", "description");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2536aht b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2536aht(str, num, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2536aht c2536aht) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2536aht, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2536aht.c());
            interfaceC9069id.e("maturityLevel");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2536aht.e());
            interfaceC9069id.e("label");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2536aht.a());
            interfaceC9069id.e("description");
            c8994hH.e(interfaceC9069id, c9028hp, c2536aht.d());
        }
    }

    private C2532ahp() {
    }
}
