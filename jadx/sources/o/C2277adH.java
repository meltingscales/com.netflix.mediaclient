package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2281adL;
import o.C2511ahU;
import o.C2632ajj;

/* renamed from: o.adH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2277adH {
    public static final C2277adH b = new C2277adH();

    /* renamed from: o.adH$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2279adJ> {
        private static final List<String> c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2279adJ b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2514ahX b2 = C2511ahU.e.e.b(jsonReader, c9028hp);
            jsonReader.q();
            C2280adK b3 = C2281adL.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2279adJ(str, b, b2, b3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2279adJ c2279adJ) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2279adJ, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2279adJ.a());
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, c2279adJ.b());
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, c2279adJ.e());
            C2281adL.d.a.e(interfaceC9069id, c9028hp, c2279adJ.c());
        }
    }

    private C2277adH() {
    }
}
