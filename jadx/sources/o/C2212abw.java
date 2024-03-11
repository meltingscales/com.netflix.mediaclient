package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2518ahb;
import o.C2521ahe;
import o.YQ;

/* renamed from: o.abw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2212abw {
    public static final C2212abw a = new C2212abw();

    /* renamed from: o.abw$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YQ.e> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("newLolomo", "gatewayRequestDetails");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YQ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YQ.d dVar = null;
            YQ.c cVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    dVar = (YQ.d) C8953gT.d(C8953gT.a(c.d, true)).b(jsonReader, c9028hp);
                } else if (a == 1) {
                    cVar = (YQ.c) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                } else {
                    return new YQ.e(dVar, cVar);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YQ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("newLolomo");
            C8953gT.d(C8953gT.a(c.d, true)).e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("gatewayRequestDetails");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    private C2212abw() {
    }

    /* renamed from: o.abw$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YQ.d> {
        private static final List<String> c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "rows");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YQ.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            YQ.b bVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bVar = (YQ.b) C8953gT.d(C8953gT.a(a.d, true)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2520ahd b = C2521ahe.b.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new YQ.d(str, bVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YQ.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("rows");
            C8953gT.d(C8953gT.a(a.d, true)).e(interfaceC9069id, c9028hp, dVar.d());
            C2521ahe.b.c.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.abw$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YQ.b> {
        public static final a d = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YQ.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2463agZ b = C2518ahb.a.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new YQ.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YQ.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            C2518ahb.a.a.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    /* renamed from: o.abw$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YQ.c> {
        private static final List<String> a;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YQ.c b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new YQ.c(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YQ.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }
}
