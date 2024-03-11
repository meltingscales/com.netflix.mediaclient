package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class BF {
    public static final BF e = new BF();

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BB> {
        public static final e a = new e();
        public static final int b;
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "value");
            e = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BB b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BB(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BB bb) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bb, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bb.a());
            interfaceC9069id.e("value");
            C8953gT.t.e(interfaceC9069id, c9028hp, bb.c());
        }
    }

    private BF() {
    }
}
