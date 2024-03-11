package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2350aeb;
import o.C2358aej;

/* renamed from: o.adW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2292adW {
    public static final C2292adW a = new C2292adW();

    /* renamed from: o.adW$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2293adX> {
        private static final List<String> b;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2293adX b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2354aef c2354aef = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            jsonReader.q();
            C2352aed b2 = C2358aej.a.c.b(jsonReader, c9028hp);
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2354aef = C2350aeb.c.c.b(jsonReader, c9028hp);
            }
            return new C2293adX(str, b2, c2354aef);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2293adX c2293adX) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2293adX, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2293adX.b());
            C2358aej.a.c.e(interfaceC9069id, c9028hp, c2293adX.d());
            if (c2293adX.a() != null) {
                C2350aeb.c.c.e(interfaceC9069id, c9028hp, c2293adX.a());
            }
        }
    }

    private C2292adW() {
    }
}
