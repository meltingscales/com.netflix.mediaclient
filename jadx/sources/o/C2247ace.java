package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C1381Zf;
import o.C2554aiK;

/* renamed from: o.ace  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2247ace {
    public static final C2247ace d = new C2247ace();

    /* renamed from: o.ace$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1381Zf.e> {
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1381Zf.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(d) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.c, true)))).b(jsonReader, c9028hp);
            }
            return new C1381Zf.e(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1381Zf.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.c, true)))).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    private C2247ace() {
    }

    /* renamed from: o.ace$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1381Zf.b> {
        private static final List<String> b;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1381Zf.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1381Zf.d dVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = d.c.b(jsonReader, c9028hp);
            }
            return new C1381Zf.b(str, dVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1381Zf.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            if (bVar.b() != null) {
                d.c.e(interfaceC9069id, c9028hp, bVar.b());
            }
        }
    }

    /* renamed from: o.ace$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1381Zf.d> {
        public static final d c = new d();

        private d() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1381Zf.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C1381Zf.d(C2554aiK.e.b.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1381Zf.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            C2554aiK.e.b.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }
}
