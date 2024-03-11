package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2460agW;

/* renamed from: o.agK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2448agK {
    public static final C2448agK e = new C2448agK();

    /* renamed from: o.agK$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2443agF> {
        public static final c b = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2443agF b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2454agQ b2 = C2460agW.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2443agF(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2443agF c2443agF) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2443agF, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2443agF.e());
            C2460agW.d.a.e(interfaceC9069id, c9028hp, c2443agF.d());
        }
    }

    private C2448agK() {
    }
}
