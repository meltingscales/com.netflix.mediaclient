package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1359Yq;
import o.C2362aen;
import o.C2548aiE;
import o.C2550aiG;
import o.C2554aiK;

/* renamed from: o.aaH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2112aaH {
    public static final C2112aaH a = new C2112aaH();

    /* renamed from: o.aaH$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1359Yq.e> {
        public static final c d = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e(SignupConstants.Field.VIDEOS);
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1359Yq.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(e) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(d.a, true)))).b(jsonReader, c9028hp);
            }
            return new C1359Yq.e(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1359Yq.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(d.a, true)))).e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    private C2112aaH() {
    }

    /* renamed from: o.aaH$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1359Yq.j> {
        public static final d a = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1359Yq.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1359Yq.c cVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = b.e.b(jsonReader, c9028hp);
            }
            return new C1359Yq.j(str, cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1359Yq.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.c());
            if (jVar.e() != null) {
                b.e.e(interfaceC9069id, c9028hp, jVar.e());
            }
        }
    }

    /* renamed from: o.aaH$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1359Yq.c> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("parentSeason", "parentShow");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1359Yq.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1359Yq.d dVar = null;
            C1359Yq.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    dVar = (C1359Yq.d) C8953gT.d(C8953gT.a(e.b, true)).b(jsonReader, c9028hp);
                } else if (a == 1) {
                    aVar = (C1359Yq.a) C8953gT.d(C8953gT.a(a.e, true)).b(jsonReader, c9028hp);
                } else {
                    jsonReader.q();
                    return new C1359Yq.c(dVar, aVar, C2362aen.e.d.b(jsonReader, c9028hp));
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1359Yq.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.a(e.b, true)).e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.a(a.e, true)).e(interfaceC9069id, c9028hp, cVar.a());
            C2362aen.e.d.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    /* renamed from: o.aaH$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1359Yq.d> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1359Yq.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2547aiD b2 = C2548aiE.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1359Yq.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1359Yq.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            C2548aiE.b.b.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.aaH$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1359Yq.a> {
        private static final List<String> b;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1359Yq.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2546aiC b2 = C2550aiG.c.a.b(jsonReader, c9028hp);
            jsonReader.q();
            C2553aiJ b3 = C2554aiK.e.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1359Yq.a(str, b2, b3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1359Yq.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            C2550aiG.c.a.e(interfaceC9069id, c9028hp, aVar.e());
            C2554aiK.e.b.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }
}
