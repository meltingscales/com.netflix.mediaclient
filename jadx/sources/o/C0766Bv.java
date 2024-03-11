package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BH;
import o.C0760Bp;
import o.C0765Bu;

/* renamed from: o.Bv  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0766Bv {
    public static final C0766Bv b = new C0766Bv();

    /* renamed from: o.Bv$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0760Bp> {
        public static final int a;
        public static final c b = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "accessibilityDescription", "image", "imageResponsive");
            e = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0760Bp b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C0760Bp.d dVar = null;
            C0760Bp.c cVar = null;
            C0760Bp.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    dVar = (C0760Bp.d) C8953gT.d(C8953gT.a(a.c, true)).b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    cVar = (C0760Bp.c) C8953gT.d(C8953gT.a(e.c, true)).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    eVar = (C0760Bp.e) C8953gT.d(C8953gT.c(b.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0760Bp(str, dVar, cVar, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0760Bp c0760Bp) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0760Bp, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c0760Bp.b());
            interfaceC9069id.e("accessibilityDescription");
            C8953gT.d(C8953gT.a(a.c, true)).e(interfaceC9069id, c9028hp, c0760Bp.d());
            interfaceC9069id.e("image");
            C8953gT.d(C8953gT.a(e.c, true)).e(interfaceC9069id, c9028hp, c0760Bp.e());
            interfaceC9069id.e("imageResponsive");
            C8953gT.d(C8953gT.c(b.d, false, 1, null)).e(interfaceC9069id, c9028hp, c0760Bp.c());
        }
    }

    private C0766Bv() {
    }

    /* renamed from: o.Bv$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0760Bp.d> {
        private static final List<String> a;
        public static final int b;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0760Bp.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0760Bp.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0760Bp.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            BH.b.d.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.Bv$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0760Bp.c> {
        private static final List<String> a;
        public static final e c = new e();
        public static final int d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0760Bp.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0767Bw b = C0765Bu.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0760Bp.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0760Bp.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            C0765Bu.c.d.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.Bv$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0760Bp.e> {
        public static final int b;
        public static final b d = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "xs", "s", "m", "l", "xl");
            e = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0760Bp.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C0760Bp.f fVar = null;
            C0760Bp.g gVar = null;
            C0760Bp.b bVar = null;
            C0760Bp.a aVar = null;
            C0760Bp.i iVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    fVar = (C0760Bp.f) C8953gT.d(C8953gT.a(j.e, true)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    gVar = (C0760Bp.g) C8953gT.d(C8953gT.a(i.a, true)).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    bVar = (C0760Bp.b) C8953gT.d(C8953gT.a(f.d, true)).b(jsonReader, c9028hp);
                } else if (a == 4) {
                    aVar = (C0760Bp.a) C8953gT.d(C8953gT.a(d.d, true)).b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    iVar = (C0760Bp.i) C8953gT.d(C8953gT.a(h.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0760Bp.e(str, fVar, gVar, bVar, aVar, iVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0760Bp.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.j());
            interfaceC9069id.e("xs");
            C8953gT.d(C8953gT.a(j.e, true)).e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("s");
            C8953gT.d(C8953gT.a(i.a, true)).e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("m");
            C8953gT.d(C8953gT.a(f.d, true)).e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("l");
            C8953gT.d(C8953gT.a(d.d, true)).e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("xl");
            C8953gT.d(C8953gT.a(h.c, true)).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.Bv$j */
    /* loaded from: classes2.dex */
    public static final class j implements InterfaceC8949gP<C0760Bp.f> {
        private static final List<String> a;
        public static final int d;
        public static final j e = new j();

        private j() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            a = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0760Bp.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0767Bw b = C0765Bu.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0760Bp.f(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0760Bp.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.c());
            C0765Bu.c.d.e(interfaceC9069id, c9028hp, fVar.b());
        }
    }

    /* renamed from: o.Bv$i */
    /* loaded from: classes2.dex */
    public static final class i implements InterfaceC8949gP<C0760Bp.g> {
        public static final i a = new i();
        public static final int b;
        private static final List<String> c;

        private i() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0760Bp.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0767Bw b2 = C0765Bu.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0760Bp.g(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0760Bp.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.e());
            C0765Bu.c.d.e(interfaceC9069id, c9028hp, gVar.b());
        }
    }

    /* renamed from: o.Bv$f */
    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8949gP<C0760Bp.b> {
        public static final int c;
        public static final f d = new f();
        private static final List<String> e;

        private f() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0760Bp.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0767Bw b = C0765Bu.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0760Bp.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0760Bp.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            C0765Bu.c.d.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    /* renamed from: o.Bv$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0760Bp.a> {
        public static final int b;
        public static final d d = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0760Bp.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0767Bw b2 = C0765Bu.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0760Bp.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0760Bp.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            C0765Bu.c.d.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* renamed from: o.Bv$h */
    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8949gP<C0760Bp.i> {
        public static final int a;
        public static final h c = new h();
        private static final List<String> e;

        private h() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0760Bp.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0767Bw b = C0765Bu.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0760Bp.i(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0760Bp.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.a());
            C0765Bu.c.d.e(interfaceC9069id, c9028hp, iVar.d());
        }
    }
}
