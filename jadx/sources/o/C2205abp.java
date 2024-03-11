package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2518ahb;
import o.YK;

/* renamed from: o.abp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2205abp {
    public static final C2205abp e = new C2205abp();

    /* renamed from: o.abp$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YK.b> {
        public static final a c = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("lolomoById", "gatewayRequestDetails");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YK.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YK.d dVar = null;
            YK.a aVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    dVar = (YK.d) C8953gT.d(C8953gT.c(b.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a == 1) {
                    aVar = (YK.a) C8953gT.d(C8953gT.c(e.a, false, 1, null)).b(jsonReader, c9028hp);
                } else {
                    return new YK.b(dVar, aVar);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YK.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("lolomoById");
            C8953gT.d(C8953gT.c(b.c, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("gatewayRequestDetails");
            C8953gT.d(C8953gT.c(e.a, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    private C2205abp() {
    }

    /* renamed from: o.abp$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YK.d> {
        private static final List<String> a;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "lolomoId", "rows");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YK.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            YK.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    cVar = (YK.c) C8953gT.d(C8953gT.a(d.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new YK.d(str, str2, cVar);
            } else {
                C8956gW.a(jsonReader, "lolomoId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YK.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("lolomoId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("rows");
            C8953gT.d(C8953gT.a(d.a, true)).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.abp$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YK.c> {
        public static final d a = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YK.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2463agZ b = C2518ahb.a.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new YK.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YK.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            C2518ahb.a.a.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.abp$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YK.a> {
        public static final e a = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YK.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new YK.a(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YK.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }
}
