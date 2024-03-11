package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2310ado;
import o.ZC;

/* renamed from: o.ada  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2296ada {
    public static final C2296ada e = new C2296ada();

    /* renamed from: o.ada$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<ZC.d> {
        private static final List<String> c;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("upiSetHandle");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public ZC.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            ZC.o oVar = null;
            while (jsonReader.a(c) == 0) {
                oVar = (ZC.o) C8953gT.d(C8953gT.a(g.a, true)).b(jsonReader, c9028hp);
            }
            return new ZC.d(oVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZC.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("upiSetHandle");
            C8953gT.d(C8953gT.a(g.a, true)).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    private C2296ada() {
    }

    /* renamed from: o.ada$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<ZC.o> {
        public static final g a = new g();
        private static final List<String> b;

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public ZC.o b(JsonReader jsonReader, C9028hp c9028hp) {
            ZC.g gVar;
            ZC.h hVar;
            ZC.i iVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            ZC.j jVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("UPISetHandleSuccess"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                gVar = j.c.b(jsonReader, c9028hp);
            } else {
                gVar = null;
            }
            if (C9014hb.d(C9014hb.c("UPIHandleValidationError"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                hVar = i.d.b(jsonReader, c9028hp);
            } else {
                hVar = null;
            }
            if (C9014hb.d(C9014hb.c("UPIHandleModerationError"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                iVar = f.a.b(jsonReader, c9028hp);
            } else {
                iVar = null;
            }
            if (C9014hb.d(C9014hb.c("UPIHandleUnavailableError"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                jVar = h.a.b(jsonReader, c9028hp);
            }
            return new ZC.o(str, gVar, hVar, iVar, jVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZC.o oVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) oVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, oVar.a());
            if (oVar.d() != null) {
                j.c.e(interfaceC9069id, c9028hp, oVar.d());
            }
            if (oVar.e() != null) {
                i.d.e(interfaceC9069id, c9028hp, oVar.e());
            }
            if (oVar.b() != null) {
                f.a.e(interfaceC9069id, c9028hp, oVar.b());
            }
            if (oVar.c() != null) {
                h.a.e(interfaceC9069id, c9028hp, oVar.c());
            }
        }
    }

    /* renamed from: o.ada$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<ZC.g> {
        private static final List<String> a;
        public static final j c = new j();

        private j() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("handle");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZC.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            ZC.f fVar = null;
            while (jsonReader.a(a) == 0) {
                fVar = (ZC.f) C8953gT.d(C8953gT.c(a.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new ZC.g(fVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZC.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("handle");
            C8953gT.d(C8953gT.c(a.b, false, 1, null)).e(interfaceC9069id, c9028hp, gVar.c());
        }
    }

    /* renamed from: o.ada$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<ZC.f> {
        public static final a b = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "fullHandle");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZC.f b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new ZC.f(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZC.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.d());
            interfaceC9069id.e("fullHandle");
            C8953gT.t.e(interfaceC9069id, c9028hp, fVar.c());
        }
    }

    /* renamed from: o.ada$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<ZC.h> {
        private static final List<String> b;
        public static final i d = new i();

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "alert");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public ZC.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            ZC.b bVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bVar = (ZC.b) C8953gT.d(C8953gT.a(b.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new ZC.h(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZC.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.a());
            interfaceC9069id.e("alert");
            C8953gT.d(C8953gT.a(b.e, true)).e(interfaceC9069id, c9028hp, hVar.d());
        }
    }

    /* renamed from: o.ada$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<ZC.b> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZC.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2313adr b2 = C2310ado.b.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new ZC.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZC.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            C2310ado.b.c.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* renamed from: o.ada$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<ZC.i> {
        public static final f a = new f();
        private static final List<String> e;

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "alert");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZC.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            ZC.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    aVar = (ZC.a) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new ZC.i(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZC.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.e());
            interfaceC9069id.e("alert");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, iVar.b());
        }
    }

    /* renamed from: o.ada$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<ZC.a> {
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public ZC.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2313adr b = C2310ado.b.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new ZC.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZC.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            C2310ado.b.c.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }

    /* renamed from: o.ada$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<ZC.j> {
        public static final h a = new h();
        private static final List<String> d;

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "alert");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public ZC.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            ZC.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    eVar = (ZC.e) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new ZC.j(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZC.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.a());
            interfaceC9069id.e("alert");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, jVar.e());
        }
    }

    /* renamed from: o.ada$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<ZC.e> {
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public ZC.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2313adr b = C2310ado.b.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new ZC.e(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZC.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            C2310ado.b.c.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }
}
