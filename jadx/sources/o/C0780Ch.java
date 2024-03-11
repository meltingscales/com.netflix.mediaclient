package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.Ch  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0780Ch {
    public static final C0780Ch b = new C0780Ch();

    /* renamed from: o.Ch$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0779Cg> {
        public static final int a;
        public static final c b = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "token");
            e = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0779Cg b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C0779Cg(str, str2);
            } else {
                C8956gW.a(jsonReader, "token");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0779Cg c0779Cg) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0779Cg, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0779Cg.c());
            interfaceC9069id.e("token");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0779Cg.d());
        }
    }

    private C0780Ch() {
    }
}
