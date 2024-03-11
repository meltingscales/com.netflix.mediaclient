package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2310ado;
import o.C2388afM;
import o.ZD;

/* renamed from: o.acZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2242acZ {
    public static final C2242acZ d = new C2242acZ();

    /* renamed from: o.acZ$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<ZD.b> {
        public static final a b = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("upiHandleAvailability");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZD.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            ZD.f fVar = null;
            while (jsonReader.a(e) == 0) {
                fVar = (ZD.f) C8953gT.d(C8953gT.a(f.e, true)).b(jsonReader, c9028hp);
            }
            return new ZD.b(fVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZD.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("upiHandleAvailability");
            C8953gT.d(C8953gT.a(f.e, true)).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    private C2242acZ() {
    }

    /* renamed from: o.acZ$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<ZD.f> {
        private static final List<String> c;
        public static final f e = new f();

        private f() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZD.f b(JsonReader jsonReader, C9028hp c9028hp) {
            ZD.a aVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            ZD.i iVar = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("UPIHandleAvailable"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = e.b.b(jsonReader, c9028hp);
            } else {
                aVar = null;
            }
            if (C9014hb.d(C9014hb.c("UPIHandleUnavailableError"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                iVar = b.e.b(jsonReader, c9028hp);
            }
            return new ZD.f(str, aVar, iVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZD.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.c());
            if (fVar.d() != null) {
                e.b.e(interfaceC9069id, c9028hp, fVar.d());
            }
            if (fVar.e() != null) {
                b.e.e(interfaceC9069id, c9028hp, fVar.e());
            }
        }
    }

    /* renamed from: o.acZ$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<ZD.a> {
        public static final e b = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("localizedDescription");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZD.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            ZD.e eVar = null;
            while (jsonReader.a(c) == 0) {
                eVar = (ZD.e) C8953gT.d(C8953gT.a(d.d, true)).b(jsonReader, c9028hp);
            }
            return new ZD.a(eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZD.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("localizedDescription");
            C8953gT.d(C8953gT.a(d.d, true)).e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* renamed from: o.acZ$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<ZD.e> {
        private static final List<String> b;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZD.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2381afF b2 = C2388afM.d.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new ZD.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZD.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            C2388afM.d.a.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* renamed from: o.acZ$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<ZD.i> {
        private static final List<String> a;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("alert");
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public ZD.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            ZD.c cVar = null;
            while (jsonReader.a(a) == 0) {
                cVar = (ZD.c) C8953gT.d(C8953gT.a(c.c, true)).b(jsonReader, c9028hp);
            }
            return new ZD.i(cVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZD.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("alert");
            C8953gT.d(C8953gT.a(c.c, true)).e(interfaceC9069id, c9028hp, iVar.b());
        }
    }

    /* renamed from: o.acZ$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<ZD.c> {
        private static final List<String> a;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public ZD.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2313adr b = C2310ado.b.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new ZD.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZD.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            C2310ado.b.c.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }
}
