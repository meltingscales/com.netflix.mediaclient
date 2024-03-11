package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2460agW;

/* renamed from: o.agD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2441agD {
    public static final C2441agD a = new C2441agD();

    /* renamed from: o.agD$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2440agC> {
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
        /* renamed from: d */
        public C2440agC b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2454agQ b2 = C2460agW.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2440agC(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2440agC c2440agC) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2440agC, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2440agC.c());
            C2460agW.d.a.e(interfaceC9069id, c9028hp, c2440agC.d());
        }
    }

    private C2441agD() {
    }
}
