package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2473agj;

/* renamed from: o.agt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2483agt {
    public static final C2483agt e = new C2483agt();

    /* renamed from: o.agt$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2481agr> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2481agr b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2475agl b2 = C2473agj.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2481agr(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2481agr c2481agr) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2481agr, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2481agr.d());
            C2473agj.a.d.e(interfaceC9069id, c9028hp, c2481agr.c());
        }
    }

    private C2483agt() {
    }
}
