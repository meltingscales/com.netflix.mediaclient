package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2361aem;
import o.C2548aiE;

/* renamed from: o.aiF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2549aiF {
    public static final C2549aiF e = new C2549aiF();

    /* renamed from: o.aiF$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2544aiA> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2544aiA b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2547aiD b2 = C2548aiE.b.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2360ael b3 = C2361aem.c.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2544aiA(str, b2, b3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2544aiA c2544aiA) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2544aiA, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2544aiA.c());
            C2548aiE.b.b.e(interfaceC9069id, c9028hp, c2544aiA.e());
            C2361aem.c.b.e(interfaceC9069id, c9028hp, c2544aiA.d());
        }
    }

    private C2549aiF() {
    }
}
