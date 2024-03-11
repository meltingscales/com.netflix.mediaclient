package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class AN {
    public static final AN a = new AN();

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<AK> {
        public static final d b = new d();
        private static final List<String> c;
        public static final int d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "token");
            c = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AK b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new AK(str, str2);
            } else {
                C8956gW.a(jsonReader, "token");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AK ak) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) ak, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, ak.b());
            interfaceC9069id.e("token");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, ak.e());
        }
    }

    private AN() {
    }
}
