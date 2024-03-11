package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C1379Zd;
import o.C2550aiG;

/* renamed from: o.acd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2246acd {
    public static final C2246acd a = new C2246acd();

    /* renamed from: o.acd$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1379Zd.b> {
        public static final a b = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1379Zd.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(c) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.b, true)))).b(jsonReader, c9028hp);
            }
            return new C1379Zd.b(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1379Zd.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.b, true)))).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    private C2246acd() {
    }

    /* renamed from: o.acd$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1379Zd.e> {
        public static final c b = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1379Zd.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2546aiC c2546aiC = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2546aiC = C2550aiG.c.a.b(jsonReader, c9028hp);
            }
            return new C1379Zd.e(str, c2546aiC);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1379Zd.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            if (eVar.e() != null) {
                C2550aiG.c.a.e(interfaceC9069id, c9028hp, eVar.e());
            }
        }
    }
}
