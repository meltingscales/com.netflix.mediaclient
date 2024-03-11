package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AZ;
import o.BK;

/* loaded from: classes2.dex */
public final class BI {
    public static final BI e = new BI();

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BK> {
        public static final int a;
        private static final List<String> c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "top", "bottom", "start", "end");
            c = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BK b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BK.a aVar = null;
            BK.b bVar = null;
            BK.e eVar = null;
            BK.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    aVar = (BK.a) C8953gT.d(C8953gT.a(d.b, true)).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    bVar = (BK.b) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    eVar = (BK.e) C8953gT.d(C8953gT.a(a.a, true)).b(jsonReader, c9028hp);
                } else if (a2 != 4) {
                    break;
                } else {
                    cVar = (BK.c) C8953gT.d(C8953gT.a(e.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BK(str, aVar, bVar, eVar, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BK bk) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bk, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bk.b());
            interfaceC9069id.e("top");
            C8953gT.d(C8953gT.a(d.b, true)).e(interfaceC9069id, c9028hp, bk.d());
            interfaceC9069id.e("bottom");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, bk.e());
            interfaceC9069id.e("start");
            C8953gT.d(C8953gT.a(a.a, true)).e(interfaceC9069id, c9028hp, bk.c());
            interfaceC9069id.e("end");
            C8953gT.d(C8953gT.a(e.a, true)).e(interfaceC9069id, c9028hp, bk.a());
        }
    }

    private BI() {
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BK.a> {
        private static final List<String> a;
        public static final d b = new d();
        public static final int c;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BK.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b2 = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BK.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BK.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            AZ.c.d.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BK.b> {
        public static final int a;
        public static final c c = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BK.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BK.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BK.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            AZ.c.d.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<BK.e> {
        public static final a a = new a();
        public static final int d;
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BK.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BK.e(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BK.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            AZ.c.d.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BK.c> {
        public static final e a = new e();
        public static final int c;
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BK.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BK.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BK.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            AZ.c.d.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }
}
