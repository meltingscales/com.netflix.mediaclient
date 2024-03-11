package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2584aio;
import o.C2592aiw;

/* renamed from: o.aip  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2585aip {
    public static final C2585aip e = new C2585aip();

    /* renamed from: o.aip$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2584aio> {
        public static final a a = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "trackingInfo", "sections");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2584aio b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2584aio.e eVar = null;
            C2584aio.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    eVar = (C2584aio.e) C8953gT.d(C8953gT.c(d.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    aVar = (C2584aio.a) C8953gT.d(C8953gT.c(b.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2584aio(str, eVar, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2584aio c2584aio) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2584aio, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2584aio.d());
            interfaceC9069id.e("trackingInfo");
            C8953gT.d(C8953gT.c(d.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2584aio.a());
            interfaceC9069id.e("sections");
            C8953gT.d(C8953gT.c(b.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2584aio.b());
        }
    }

    private C2585aip() {
    }

    /* renamed from: o.aip$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2584aio.e> {
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", Payload.PARAM_RENO_REQUEST_ID);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2584aio.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2584aio.e(str, str2);
            } else {
                C8956gW.a(jsonReader, Payload.PARAM_RENO_REQUEST_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2584aio.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(Payload.PARAM_RENO_REQUEST_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.aip$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2584aio.a> {
        private static final List<String> b;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2584aio.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(c.a, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2584aio.a(str, num.intValue(), list);
            } else {
                C8956gW.a(jsonReader, "totalCount");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2584aio.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("totalCount");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.e()));
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(c.a, false, 1, null))).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.aip$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2584aio.b> {
        public static final c a = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2584aio.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2584aio.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    cVar = (C2584aio.c) C8953gT.d(C8953gT.a(e.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2584aio.b(str, str2, cVar);
            } else {
                C8956gW.a(jsonReader, "cursor");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2584aio.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("cursor");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(e.c, true)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.aip$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2584aio.c> {
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
        /* renamed from: c */
        public C2584aio.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2586aiq b2 = C2592aiw.h.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2584aio.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2584aio.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            C2592aiw.h.c.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }
}
