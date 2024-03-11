package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2460agW;

/* renamed from: o.agq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2480agq {
    public static final C2480agq a = new C2480agq();

    /* renamed from: o.agq$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2477agn> {
        private static final List<String> b;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2477agn b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2454agQ b2 = C2460agW.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2477agn(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2477agn c2477agn) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2477agn, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2477agn.d());
            C2460agW.d.a.e(interfaceC9069id, c9028hp, c2477agn.b());
        }
    }

    private C2480agq() {
    }
}
