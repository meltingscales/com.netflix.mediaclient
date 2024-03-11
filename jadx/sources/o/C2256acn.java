package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C1386Zk;
import o.C2585aip;

/* renamed from: o.acn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2256acn {
    public static final C2256acn e = new C2256acn();

    /* renamed from: o.acn$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1386Zk.c> {
        private static final List<String> d;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("pinotPrePlayPage");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1386Zk.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1386Zk.d dVar = null;
            while (jsonReader.a(d) == 0) {
                dVar = (C1386Zk.d) C8953gT.d(C8953gT.a(e.a, true)).b(jsonReader, c9028hp);
            }
            return new C1386Zk.c(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1386Zk.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("pinotPrePlayPage");
            C8953gT.d(C8953gT.a(e.a, true)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    private C2256acn() {
    }

    /* renamed from: o.acn$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1386Zk.d> {
        public static final e a = new e();
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
        public C1386Zk.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2584aio c2584aio = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotDefaultPrePlayPage"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2584aio = C2585aip.a.a.b(jsonReader, c9028hp);
            }
            return new C1386Zk.d(str, c2584aio);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1386Zk.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            if (dVar.b() != null) {
                C2585aip.a.a.e(interfaceC9069id, c9028hp, dVar.b());
            }
        }
    }
}
