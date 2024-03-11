package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AP;
import o.BO;
import o.C0745Ba;
import o.C0774Cb;

/* loaded from: classes2.dex */
public final class BQ {
    public static final BQ d = new BQ();

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BO> {
        private static final List<String> a;
        public static final int b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "content", "field", "value", "button", "buttonSelected", "style", "styleSelected");
            a = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BO b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            BO.d dVar = null;
            BO.a aVar = null;
            String str2 = null;
            BO.e eVar = null;
            BO.c cVar = null;
            BO.b bVar = null;
            BO.i iVar = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        dVar = (BO.d) C8953gT.c(c.b, false, 1, null).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        aVar = (BO.a) C8953gT.d(C8953gT.a(a.a, true)).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        eVar = (BO.e) C8953gT.d(C8953gT.a(b.e, true)).b(jsonReader, c9028hp);
                        break;
                    case 5:
                        cVar = (BO.c) C8953gT.d(C8953gT.a(d.b, true)).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        bVar = (BO.b) C8953gT.d(C8953gT.a(f.d, true)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        iVar = (BO.i) C8953gT.d(C8953gT.a(i.a, true)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (dVar != null) {
                            return new BO(str, dVar, aVar, str2, eVar, cVar, bVar, iVar);
                        } else {
                            C8956gW.a(jsonReader, "content");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BO bo) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bo, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bo.j());
            interfaceC9069id.e("content");
            C8953gT.c(c.b, false, 1, null).e(interfaceC9069id, c9028hp, bo.a());
            interfaceC9069id.e("field");
            C8953gT.d(C8953gT.a(a.a, true)).e(interfaceC9069id, c9028hp, bo.c());
            interfaceC9069id.e("value");
            C8953gT.t.e(interfaceC9069id, c9028hp, bo.g());
            interfaceC9069id.e("button");
            C8953gT.d(C8953gT.a(b.e, true)).e(interfaceC9069id, c9028hp, bo.b());
            interfaceC9069id.e("buttonSelected");
            C8953gT.d(C8953gT.a(d.b, true)).e(interfaceC9069id, c9028hp, bo.d());
            interfaceC9069id.e("style");
            C8953gT.d(C8953gT.a(f.d, true)).e(interfaceC9069id, c9028hp, bo.e());
            interfaceC9069id.e("styleSelected");
            C8953gT.d(C8953gT.a(i.a, true)).e(interfaceC9069id, c9028hp, bo.i());
        }
    }

    private BQ() {
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BO.d> {
        private static final List<String> a;
        public static final c b = new c();
        public static final int d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY);
            a = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BO.d b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new BO.d(str, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Error.DEBUG_FIELD_KEY);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BO.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<BO.a> {
        public static final a a = new a();
        private static final List<String> b;
        public static final int e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BO.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BU b2 = C0774Cb.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BO.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BO.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            C0774Cb.b.e.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BO.e> {
        public static final int c;
        private static final List<String> d;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BO.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AS b = AP.d.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new BO.e(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BO.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            AP.d.b.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<BO.c> {
        private static final List<String> a;
        public static final d b = new d();
        public static final int e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BO.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AS b2 = AP.d.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new BO.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BO.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            AP.d.b.e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<BO.b> {
        public static final int b;
        private static final List<String> c;
        public static final f d = new f();

        private f() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public BO.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AU b2 = C0745Ba.f.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BO.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BO.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            C0745Ba.f.e.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements InterfaceC8949gP<BO.i> {
        public static final i a = new i();
        public static final int d;
        private static final List<String> e;

        private i() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BO.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AU b = C0745Ba.f.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new BO.i(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BO.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.a());
            C0745Ba.f.e.e(interfaceC9069id, c9028hp, iVar.e());
        }
    }
}
