package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2284adO;
import o.C2550aiG;
import o.C2557aiN;

/* renamed from: o.aiK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2554aiK {
    public static final C2554aiK b = new C2554aiK();

    /* renamed from: o.aiK$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2553aiJ> {
        private static final List<String> a;
        public static final e b = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2553aiJ b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2283adN b2 = C2284adO.c.c.b(jsonReader, c9028hp);
            jsonReader.q();
            C2546aiC b3 = C2550aiG.c.a.b(jsonReader, c9028hp);
            jsonReader.q();
            C2555aiL b4 = C2557aiN.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2553aiJ(str, b2, b3, b4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2553aiJ c2553aiJ) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2553aiJ, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2553aiJ.e());
            C2284adO.c.c.e(interfaceC9069id, c9028hp, c2553aiJ.c());
            C2550aiG.c.a.e(interfaceC9069id, c9028hp, c2553aiJ.a());
            C2557aiN.c.d.e(interfaceC9069id, c9028hp, c2553aiJ.b());
        }
    }

    private C2554aiK() {
    }
}
