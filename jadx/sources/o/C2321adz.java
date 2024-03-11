package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2276adG;
import o.C2632ajj;

/* renamed from: o.adz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2321adz {
    public static final C2321adz d = new C2321adz();

    /* renamed from: o.adz$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2271adB> {
        public static final e c = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2271adB b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2319adx b2 = C2276adG.a.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2271adB(str, b, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2271adB c2271adB) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2271adB, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2271adB.d());
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, c2271adB.a());
            C2276adG.a.a.e(interfaceC9069id, c9028hp, c2271adB.b());
        }
    }

    private C2321adz() {
    }
}
