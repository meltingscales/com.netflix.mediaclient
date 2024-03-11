package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2589ait;

/* renamed from: o.ais  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2588ais {
    public static final C2588ais d = new C2588ais();

    /* renamed from: o.ais$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2589ait> {
        private static final List<String> c;
        public static final h d = new h();

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "publicIdentity", "publicIdentityConfiguration");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2589ait b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2589ait.h hVar = null;
            C2589ait.i iVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    hVar = (C2589ait.h) C8953gT.d(C8953gT.c(j.d, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    iVar = (C2589ait.i) C8953gT.d(C8953gT.a(f.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2589ait(str, hVar, iVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2589ait c2589ait) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2589ait, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2589ait.b());
            interfaceC9069id.e("publicIdentity");
            C8953gT.d(C8953gT.c(j.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2589ait.e());
            interfaceC9069id.e("publicIdentityConfiguration");
            C8953gT.d(C8953gT.a(f.c, true)).e(interfaceC9069id, c9028hp, c2589ait.a());
        }
    }

    private C2588ais() {
    }

    /* renamed from: o.ais$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2589ait.h> {
        private static final List<String> c;
        public static final j d = new j();

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "handle");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2589ait.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2589ait.c cVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (C2589ait.c) C8953gT.d(C8953gT.c(b.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2589ait.h(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2589ait.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.d());
            interfaceC9069id.e("handle");
            C8953gT.d(C8953gT.c(b.d, false, 1, null)).e(interfaceC9069id, c9028hp, hVar.e());
        }
    }

    /* renamed from: o.ais$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2589ait.c> {
        public static final b d = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "fullHandle");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2589ait.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2589ait.c(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2589ait.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("fullHandle");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* renamed from: o.ais$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2589ait.i> {
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
        /* renamed from: e */
        public C2589ait.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C2589ait.a aVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2589ait.b bVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("UPIConfiguration"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = d.b.b(jsonReader, c9028hp);
            } else {
                aVar = null;
            }
            if (C9014hb.d(C9014hb.c("FeatureUnavailable"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = e.b.b(jsonReader, c9028hp);
            }
            return new C2589ait.i(str, aVar, bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2589ait.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.b());
            if (iVar.c() != null) {
                d.b.e(interfaceC9069id, c9028hp, iVar.c());
            }
            if (iVar.a() != null) {
                e.b.e(interfaceC9069id, c9028hp, iVar.a());
            }
        }
    }

    /* renamed from: o.ais$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2589ait.a> {
        public static final d b = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("handleConfiguration");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2589ait.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2589ait.d dVar = null;
            while (jsonReader.a(c) == 0) {
                dVar = (C2589ait.d) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
            }
            return new C2589ait.a(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2589ait.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("handleConfiguration");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* renamed from: o.ais$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2589ait.d> {
        public static final c c = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2589ait.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C2589ait.f fVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2589ait.e eVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("UPIHandleConfiguration"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                fVar = i.a.b(jsonReader, c9028hp);
            } else {
                fVar = null;
            }
            if (C9014hb.d(C9014hb.c("FeatureConfigurationUnavailable"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = a.b.b(jsonReader, c9028hp);
            }
            return new C2589ait.d(str, fVar, eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2589ait.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            if (dVar.c() != null) {
                i.a.e(interfaceC9069id, c9028hp, dVar.c());
            }
            if (dVar.b() != null) {
                a.b.e(interfaceC9069id, c9028hp, dVar.b());
            }
        }
    }

    /* renamed from: o.ais$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2589ait.f> {
        public static final i a = new i();
        private static final List<String> c;

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("handleMinLength", "handleMaxLength", "handlePattern");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2589ait.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            String str = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str = C8953gT.t.b(jsonReader, c9028hp);
                } else {
                    return new C2589ait.f(num, num2, str);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2589ait.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("handleMinLength");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, fVar.e());
            interfaceC9069id.e("handleMaxLength");
            c8994hH.e(interfaceC9069id, c9028hp, fVar.c());
            interfaceC9069id.e("handlePattern");
            C8953gT.t.e(interfaceC9069id, c9028hp, fVar.a());
        }
    }

    /* renamed from: o.ais$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2589ait.e> {
        public static final a b = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("reason");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2589ait.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.t.b(jsonReader, c9028hp);
            }
            return new C2589ait.e(str);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2589ait.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("reason");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* renamed from: o.ais$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2589ait.b> {
        private static final List<String> a;
        public static final e b = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("reason");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2589ait.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.t.b(jsonReader, c9028hp);
            }
            return new C2589ait.b(str);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2589ait.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("reason");
            C8953gT.t.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }
}
