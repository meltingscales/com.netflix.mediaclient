package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1387Zl;
import o.C2462agY;

/* renamed from: o.acy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2267acy {
    public static final C2267acy c = new C2267acy();

    /* renamed from: o.acy$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1387Zl.c> {
        private static final List<String> c;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("refreshLolomoRow", "gatewayRequestDetails");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1387Zl.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1387Zl.b bVar = null;
            C1387Zl.d dVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    bVar = (C1387Zl.b) C8953gT.d(C8953gT.a(b.a, true)).b(jsonReader, c9028hp);
                } else if (a == 1) {
                    dVar = (C1387Zl.d) C8953gT.d(C8953gT.c(e.e, false, 1, null)).b(jsonReader, c9028hp);
                } else {
                    return new C1387Zl.c(bVar, dVar);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1387Zl.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("refreshLolomoRow");
            C8953gT.d(C8953gT.a(b.a, true)).e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("gatewayRequestDetails");
            C8953gT.d(C8953gT.c(e.e, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    private C2267acy() {
    }

    /* renamed from: o.acy$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1387Zl.b> {
        public static final b a = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1387Zl.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2458agU b = C2462agY.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1387Zl.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1387Zl.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            C2462agY.a.d.e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.acy$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1387Zl.d> {
        private static final List<String> a;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1387Zl.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1387Zl.d(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1387Zl.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }
}
