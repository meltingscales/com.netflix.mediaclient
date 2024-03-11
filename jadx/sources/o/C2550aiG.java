package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2546aiC;
import o.C2548aiE;

/* renamed from: o.aiG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2550aiG {
    public static final C2550aiG e = new C2550aiG();

    /* renamed from: o.aiG$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2546aiC> {
        public static final c a = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "seasons");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2546aiC b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C2546aiC.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    eVar = (C2546aiC.e) C8953gT.d(C8953gT.c(b.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2546aiC(str, num.intValue(), eVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2546aiC c2546aiC) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2546aiC, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2546aiC.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2546aiC.b()));
            interfaceC9069id.e("seasons");
            C8953gT.d(C8953gT.c(b.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2546aiC.a());
        }
    }

    private C2550aiG() {
    }

    /* renamed from: o.aiG$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2546aiC.e> {
        public static final b a = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2546aiC.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(e.d, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2546aiC.e(str, num, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2546aiC.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(e.d, false, 1, null)))).e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.aiG$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2546aiC.d> {
        private static final List<String> b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2546aiC.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2546aiC.c cVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (C2546aiC.c) C8953gT.d(C8953gT.a(a.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2546aiC.d(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2546aiC.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(a.d, true)).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.aiG$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2546aiC.c> {
        private static final List<String> b;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2546aiC.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2547aiD b2 = C2548aiE.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2546aiC.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2546aiC.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            C2548aiE.b.b.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }
}
