package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1377Zb;
import o.C2362aen;
import o.C2516ahZ;
import o.C2548aiE;
import o.C2581ail;

/* renamed from: o.abX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2187abX {
    public static final C2187abX b = new C2187abX();

    /* renamed from: o.abX$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1377Zb.d> {
        private static final List<String> a;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1377Zb.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(a) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.a, true)))).b(jsonReader, c9028hp);
            }
            return new C1377Zb.d(list);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1377Zb.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.a, true)))).e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    private C2187abX() {
    }

    /* renamed from: o.abX$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1377Zb.g> {
        public static final b a = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1377Zb.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1377Zb.b bVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = c.d.b(jsonReader, c9028hp);
            }
            return new C1377Zb.g(str, bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1377Zb.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.c());
            if (gVar.e() != null) {
                c.d.e(interfaceC9069id, c9028hp, gVar.e());
            }
        }
    }

    /* renamed from: o.abX$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1377Zb.b> {
        private static final List<String> b;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("parentSeason", "parentShow");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1377Zb.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1377Zb.c cVar = null;
            C1377Zb.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    cVar = (C1377Zb.c) C8953gT.d(C8953gT.a(d.d, true)).b(jsonReader, c9028hp);
                } else if (a == 1) {
                    aVar = (C1377Zb.a) C8953gT.d(C8953gT.a(e.c, true)).b(jsonReader, c9028hp);
                } else {
                    jsonReader.q();
                    C2363aeo b2 = C2362aen.e.d.b(jsonReader, c9028hp);
                    jsonReader.q();
                    return new C1377Zb.b(cVar, aVar, b2, C2516ahZ.d.e.b(jsonReader, c9028hp));
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1377Zb.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.a(d.d, true)).e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.a(e.c, true)).e(interfaceC9069id, c9028hp, bVar.c());
            C2362aen.e.d.e(interfaceC9069id, c9028hp, bVar.e());
            C2516ahZ.d.e.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    /* renamed from: o.abX$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1377Zb.c> {
        private static final List<String> c;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1377Zb.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2547aiD b = C2548aiE.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1377Zb.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1377Zb.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            C2548aiE.b.b.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.abX$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1377Zb.a> {
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
        /* renamed from: a */
        public C1377Zb.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2576aig b2 = C2581ail.a.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1377Zb.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1377Zb.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            C2581ail.a.c.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
