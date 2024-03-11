package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2518ahb;
import o.YH;

/* renamed from: o.abm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2202abm {
    public static final C2202abm a = new C2202abm();

    /* renamed from: o.abm$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YH.d> {
        private static final List<String> d;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("lolomoById", "gatewayRequestDetails");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YH.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YH.b bVar = null;
            YH.e eVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    bVar = (YH.b) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a == 1) {
                    eVar = (YH.e) C8953gT.d(C8953gT.c(c.d, false, 1, null)).b(jsonReader, c9028hp);
                } else {
                    return new YH.d(bVar, eVar);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YH.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("lolomoById");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("gatewayRequestDetails");
            C8953gT.d(C8953gT.c(c.d, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    private C2202abm() {
    }

    /* renamed from: o.abm$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YH.b> {
        private static final List<String> a;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "lolomoId", "rows");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YH.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            YH.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    cVar = (YH.c) C8953gT.d(C8953gT.a(b.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new YH.b(str, str2, cVar);
            } else {
                C8956gW.a(jsonReader, "lolomoId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YH.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("lolomoId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("rows");
            C8953gT.d(C8953gT.a(b.c, true)).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.abm$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YH.c> {
        private static final List<String> b;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YH.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2463agZ b2 = C2518ahb.a.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new YH.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YH.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            C2518ahb.a.a.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.abm$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YH.e> {
        private static final List<String> c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YH.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new YH.e(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YH.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }
}
