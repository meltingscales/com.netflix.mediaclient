package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2473agj;

/* renamed from: o.afZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2401afZ {
    public static final C2401afZ e = new C2401afZ();

    /* renamed from: o.afZ$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2400afY> {
        public static final e c = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2400afY b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2475agl b = C2473agj.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2400afY(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2400afY c2400afY) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2400afY, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2400afY.d());
            C2473agj.a.d.e(interfaceC9069id, c9028hp, c2400afY.a());
        }
    }

    private C2401afZ() {
    }
}
