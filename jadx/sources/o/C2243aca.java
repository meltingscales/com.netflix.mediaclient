package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C1378Zc;
import o.C2549aiF;

/* renamed from: o.aca  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2243aca {
    public static final C2243aca b = new C2243aca();

    /* renamed from: o.aca$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1378Zc.c> {
        private static final List<String> a;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1378Zc.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(a) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.d, true)))).b(jsonReader, c9028hp);
            }
            return new C1378Zc.c(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1378Zc.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.d, true)))).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    private C2243aca() {
    }

    /* renamed from: o.aca$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1378Zc.b> {
        private static final List<String> b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1378Zc.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2544aiA c2544aiA = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Season"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2544aiA = C2549aiF.d.b.b(jsonReader, c9028hp);
            }
            return new C1378Zc.b(str, c2544aiA);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1378Zc.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            if (bVar.b() != null) {
                C2549aiF.d.b.e(interfaceC9069id, c9028hp, bVar.b());
            }
        }
    }
}
