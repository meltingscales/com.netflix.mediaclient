package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1371Yv;
import o.C2462agY;

/* renamed from: o.aaD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2108aaD {
    public static final C2108aaD b = new C2108aaD();

    /* renamed from: o.aaD$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1371Yv.e> {
        public static final e b = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("lolomoRowByIndex", "gatewayRequestDetails");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1371Yv.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1371Yv.d dVar = null;
            C1371Yv.a aVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    dVar = (C1371Yv.d) C8953gT.d(C8953gT.a(c.a, true)).b(jsonReader, c9028hp);
                } else if (a == 1) {
                    aVar = (C1371Yv.a) C8953gT.d(C8953gT.c(d.a, false, 1, null)).b(jsonReader, c9028hp);
                } else {
                    return new C1371Yv.e(dVar, aVar);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1371Yv.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("lolomoRowByIndex");
            C8953gT.d(C8953gT.a(c.a, true)).e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("gatewayRequestDetails");
            C8953gT.d(C8953gT.c(d.a, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    private C2108aaD() {
    }

    /* renamed from: o.aaD$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1371Yv.d> {
        public static final c a = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1371Yv.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2458agU b = C2462agY.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1371Yv.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1371Yv.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            C2462agY.a.d.e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* renamed from: o.aaD$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1371Yv.a> {
        public static final d a = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1371Yv.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1371Yv.a(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1371Yv.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }
}
