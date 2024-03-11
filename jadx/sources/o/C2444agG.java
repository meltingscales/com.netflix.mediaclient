package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2460agW;

/* renamed from: o.agG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2444agG {
    public static final C2444agG d = new C2444agG();

    /* renamed from: o.agG$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2445agH> {
        private static final List<String> a;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2445agH b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2454agQ b = C2460agW.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2445agH(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2445agH c2445agH) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2445agH, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2445agH.c());
            C2460agW.d.a.e(interfaceC9069id, c9028hp, c2445agH.e());
        }
    }

    private C2444agG() {
    }
}
