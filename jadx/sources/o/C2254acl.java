package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C1384Zi;
import o.C2516ahZ;
import o.C2551aiH;
import o.C2582aim;

/* renamed from: o.acl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2254acl {
    public static final C2254acl a = new C2254acl();

    /* renamed from: o.acl$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1384Zi.e> {
        private static final List<String> c;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e(SignupConstants.Field.VIDEOS);
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1384Zi.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(c) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(f.e, true)))).b(jsonReader, c9028hp);
            }
            return new C1384Zi.e(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1384Zi.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(f.e, true)))).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    private C2254acl() {
    }

    /* renamed from: o.acl$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C1384Zi.j> {
        private static final List<String> d;
        public static final f e = new f();

        private f() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1384Zi.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C1384Zi.c cVar;
            C1384Zi.d dVar;
            C1384Zi.a aVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1384Zi.i iVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = e.a.b(jsonReader, c9028hp);
            } else {
                cVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = b.b.b(jsonReader, c9028hp);
            } else {
                dVar = null;
            }
            if (C9014hb.d(C9014hb.c("Movie"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = a.e.b(jsonReader, c9028hp);
            } else {
                aVar = null;
            }
            if (C9014hb.d(C9014hb.c("Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                iVar = c.d.b(jsonReader, c9028hp);
            }
            return new C1384Zi.j(str, cVar, dVar, aVar, iVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1384Zi.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.e());
            if (jVar.c() != null) {
                e.a.e(interfaceC9069id, c9028hp, jVar.c());
            }
            if (jVar.d() != null) {
                b.b.e(interfaceC9069id, c9028hp, jVar.d());
            }
            if (jVar.a() != null) {
                a.e.e(interfaceC9069id, c9028hp, jVar.a());
            }
            if (jVar.b() != null) {
                c.d.e(interfaceC9069id, c9028hp, jVar.b());
            }
        }
    }

    /* renamed from: o.acl$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1384Zi.c> {
        public static final e a = new e();

        private e() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1384Zi.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C1384Zi.c(C2551aiH.e.c.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1384Zi.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            C2551aiH.e.c.e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* renamed from: o.acl$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1384Zi.d> {
        public static final b b = new b();

        private b() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1384Zi.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            C2579aij b2 = C2582aim.d.a.b(jsonReader, c9028hp);
            jsonReader.q();
            return new C1384Zi.d(b2, C2516ahZ.d.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1384Zi.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            C2582aim.d.a.e(interfaceC9069id, c9028hp, dVar.d());
            C2516ahZ.d.e.e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* renamed from: o.acl$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1384Zi.a> {
        public static final a e = new a();

        private a() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1384Zi.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C1384Zi.a(C2582aim.d.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1384Zi.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            C2582aim.d.a.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }

    /* renamed from: o.acl$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1384Zi.i> {
        public static final c d = new c();

        private c() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1384Zi.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C1384Zi.i(C2582aim.d.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1384Zi.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            C2582aim.d.a.e(interfaceC9069id, c9028hp, iVar.d());
        }
    }
}
