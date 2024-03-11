package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C1382Zg;
import o.C2516ahZ;
import o.C2551aiH;
import o.C2582aim;

/* renamed from: o.aci  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2251aci {
    public static final C2251aci e = new C2251aci();

    /* renamed from: o.aci$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1382Zg.c> {
        private static final List<String> d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e(SignupConstants.Field.VIDEOS);
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1382Zg.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(d) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(f.a, true)))).b(jsonReader, c9028hp);
            }
            return new C1382Zg.c(list);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1382Zg.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(f.a, true)))).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    private C2251aci() {
    }

    /* renamed from: o.aci$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C1382Zg.g> {
        public static final f a = new f();
        private static final List<String> b;

        private f() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1382Zg.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C1382Zg.a aVar;
            C1382Zg.d dVar;
            C1382Zg.b bVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1382Zg.i iVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = d.d.b(jsonReader, c9028hp);
            } else {
                aVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = b.e.b(jsonReader, c9028hp);
            } else {
                dVar = null;
            }
            if (C9014hb.d(C9014hb.c("Movie"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = c.a.b(jsonReader, c9028hp);
            } else {
                bVar = null;
            }
            if (C9014hb.d(C9014hb.c("Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                iVar = e.d.b(jsonReader, c9028hp);
            }
            return new C1382Zg.g(str, aVar, dVar, bVar, iVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1382Zg.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.b());
            if (gVar.c() != null) {
                d.d.e(interfaceC9069id, c9028hp, gVar.c());
            }
            if (gVar.a() != null) {
                b.e.e(interfaceC9069id, c9028hp, gVar.a());
            }
            if (gVar.d() != null) {
                c.a.e(interfaceC9069id, c9028hp, gVar.d());
            }
            if (gVar.e() != null) {
                e.d.e(interfaceC9069id, c9028hp, gVar.e());
            }
        }
    }

    /* renamed from: o.aci$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1382Zg.a> {
        public static final d d = new d();

        private d() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1382Zg.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C1382Zg.a(C2551aiH.e.c.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1382Zg.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            C2551aiH.e.c.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }

    /* renamed from: o.aci$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1382Zg.d> {
        public static final b e = new b();

        private b() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1382Zg.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            C2579aij b = C2582aim.d.a.b(jsonReader, c9028hp);
            jsonReader.q();
            return new C1382Zg.d(b, C2516ahZ.d.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1382Zg.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            C2582aim.d.a.e(interfaceC9069id, c9028hp, dVar.a());
            C2516ahZ.d.e.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.aci$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1382Zg.b> {
        public static final c a = new c();

        private c() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1382Zg.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C1382Zg.b(C2582aim.d.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1382Zg.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            C2582aim.d.a.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.aci$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1382Zg.i> {
        public static final e d = new e();

        private e() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1382Zg.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C1382Zg.i(C2582aim.d.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1382Zg.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            C2582aim.d.a.e(interfaceC9069id, c9028hp, iVar.c());
        }
    }
}
