package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2460agW;

/* renamed from: o.agp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2479agp {
    public static final C2479agp b = new C2479agp();

    /* renamed from: o.agp$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2472agi> {
        private static final List<String> d;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2472agi b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2454agQ b = C2460agW.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2472agi(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2472agi c2472agi) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2472agi, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2472agi.b());
            C2460agW.d.a.e(interfaceC9069id, c9028hp, c2472agi.d());
        }
    }

    private C2479agp() {
    }
}
