package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2313adr;
import o.C2388afM;

/* renamed from: o.ado  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2310ado {
    public static final C2310ado e = new C2310ado();

    /* renamed from: o.ado$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2313adr> {
        public static final b c = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_TITLE, "message", "errorCode", "dismissAction", "secondaryAction");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2313adr b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2313adr.f fVar = null;
            C2313adr.b bVar = null;
            String str2 = null;
            C2313adr.e eVar = null;
            C2313adr.a aVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    fVar = (C2313adr.f) C8953gT.d(C8953gT.a(f.c, true)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    bVar = (C2313adr.b) C8953gT.d(C8953gT.a(c.e, true)).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 4) {
                    eVar = (C2313adr.e) C8953gT.d(C8953gT.c(a.a, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    aVar = (C2313adr.a) C8953gT.d(C8953gT.c(i.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2313adr(str, fVar, bVar, str2, eVar, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2313adr c2313adr) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2313adr, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2313adr.i());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.d(C8953gT.a(f.c, true)).e(interfaceC9069id, c9028hp, c2313adr.d());
            interfaceC9069id.e("message");
            C8953gT.d(C8953gT.a(c.e, true)).e(interfaceC9069id, c9028hp, c2313adr.b());
            interfaceC9069id.e("errorCode");
            C8953gT.t.e(interfaceC9069id, c9028hp, c2313adr.e());
            interfaceC9069id.e("dismissAction");
            C8953gT.d(C8953gT.c(a.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2313adr.a());
            interfaceC9069id.e("secondaryAction");
            C8953gT.d(C8953gT.c(i.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2313adr.c());
        }
    }

    private C2310ado() {
    }

    /* renamed from: o.ado$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2313adr.f> {
        private static final List<String> b;
        public static final f c = new f();

        private f() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2313adr.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2381afF b2 = C2388afM.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2313adr.f(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2313adr.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.a());
            C2388afM.d.a.e(interfaceC9069id, c9028hp, fVar.b());
        }
    }

    /* renamed from: o.ado$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2313adr.b> {
        private static final List<String> d;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2313adr.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2381afF b = C2388afM.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2313adr.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2313adr.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            C2388afM.d.a.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    /* renamed from: o.ado$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2313adr.e> {
        public static final a a = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "label");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2313adr.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2313adr.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C2313adr.c) C8953gT.d(C8953gT.a(e.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2313adr.e(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2313adr.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("label");
            C8953gT.d(C8953gT.a(e.d, true)).e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.ado$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2313adr.c> {
        private static final List<String> a;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2313adr.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2381afF b = C2388afM.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2313adr.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2313adr.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            C2388afM.d.a.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.ado$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2313adr.a> {
        private static final List<String> c;
        public static final i d = new i();

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "label");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2313adr.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2313adr.d dVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    dVar = (C2313adr.d) C8953gT.d(C8953gT.a(d.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2313adr.a(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2313adr.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("label");
            C8953gT.d(C8953gT.a(d.b, true)).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.ado$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2313adr.d> {
        public static final d b = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2313adr.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2381afF b2 = C2388afM.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2313adr.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2313adr.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            C2388afM.d.a.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
