package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.afM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2388afM {
    public static final C2388afM d = new C2388afM();

    /* renamed from: o.afM$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2381afF> {
        public static final d a = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "value");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2381afF b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2381afF(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2381afF c2381afF) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2381afF, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2381afF.a());
            interfaceC9069id.e("value");
            C8953gT.t.e(interfaceC9069id, c9028hp, c2381afF.c());
        }
    }

    private C2388afM() {
    }
}
