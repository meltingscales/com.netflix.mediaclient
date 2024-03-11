package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.ZA;

/* renamed from: o.acX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2240acX {
    public static final C2240acX b = new C2240acX();

    /* renamed from: o.acX$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<ZA.e> {
        public static final a b = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("shouldRecordRdid");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZA.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Boolean bool = null;
            while (jsonReader.a(d) == 0) {
                bool = C8953gT.l.b(jsonReader, c9028hp);
            }
            return new ZA.e(bool);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZA.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("shouldRecordRdid");
            C8953gT.l.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    private C2240acX() {
    }
}
