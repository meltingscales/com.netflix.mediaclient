package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C1391Zp;

/* renamed from: o.acs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2261acs {
    public static final C2261acs c = new C2261acs();

    /* renamed from: o.acs$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1391Zp.c> {
        private static final List<String> a;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("recordRdid");
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1391Zp.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Boolean bool = null;
            while (jsonReader.a(a) == 0) {
                bool = C8953gT.l.b(jsonReader, c9028hp);
            }
            return new C1391Zp.c(bool);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1391Zp.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("recordRdid");
            C8953gT.l.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    private C2261acs() {
    }
}
