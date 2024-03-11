package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class AZ {
    public static final AZ e = new AZ();

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0747Bc> {
        private static final List<String> b;
        public static final int c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "token");
            b = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0747Bc b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
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
                return new C0747Bc(str, str2);
            } else {
                C8956gW.a(jsonReader, "token");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0747Bc c0747Bc) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0747Bc, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0747Bc.c());
            interfaceC9069id.e("token");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0747Bc.b());
        }
    }

    private AZ() {
    }
}
