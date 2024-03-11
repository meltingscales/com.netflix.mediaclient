package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2272adC;
import o.C2275adF;
import o.C2511ahU;
import o.C2624ajb;
import o.C2632ajj;
import o.C2636ajn;

/* renamed from: o.adD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2273adD {
    public static final C2273adD e = new C2273adD();

    /* renamed from: o.adD$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2272adC> {
        public static final c c = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "latestYear", "badges", "artworkForegroundColor", "playbackBadges");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2272adC b(JsonReader jsonReader, C9028hp c9028hp) {
            C2272adC.b bVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2272adC.e eVar = null;
            String str = null;
            Integer num = null;
            List list = null;
            String str2 = null;
            List list2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.t)).b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    list2 = (List) C8953gT.d(C8953gT.a(C8953gT.d(C3483azo.e))).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = b.b.b(jsonReader, c9028hp);
            } else {
                bVar = null;
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = d.b.b(jsonReader, c9028hp);
            }
            C2272adC.e eVar2 = eVar;
            jsonReader.q();
            C2630ajh b = C2632ajj.e.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2514ahX b2 = C2511ahU.e.e.b(jsonReader, c9028hp);
            jsonReader.q();
            C2274adE b3 = C2275adF.a.e.b(jsonReader, c9028hp);
            jsonReader.q();
            C2628ajf b4 = C2624ajb.d.b.b(jsonReader, c9028hp);
            jsonReader.q();
            return new C2272adC(str, num, list, str2, list2, bVar, eVar2, b, b2, b3, b4, C2636ajn.c.c.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2272adC c2272adC) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2272adC, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2272adC.o());
            interfaceC9069id.e("latestYear");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2272adC.c());
            interfaceC9069id.e("badges");
            C8994hH<String> c8994hH = C8953gT.t;
            C8953gT.d(C8953gT.a(c8994hH)).e(interfaceC9069id, c9028hp, c2272adC.a());
            interfaceC9069id.e("artworkForegroundColor");
            c8994hH.e(interfaceC9069id, c9028hp, c2272adC.e());
            interfaceC9069id.e("playbackBadges");
            C8953gT.d(C8953gT.a(C8953gT.d(C3483azo.e))).e(interfaceC9069id, c9028hp, c2272adC.i());
            if (c2272adC.d() != null) {
                b.b.e(interfaceC9069id, c9028hp, c2272adC.d());
            }
            if (c2272adC.g() != null) {
                d.b.e(interfaceC9069id, c9028hp, c2272adC.g());
            }
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, c2272adC.j());
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, c2272adC.h());
            C2275adF.a.e.e(interfaceC9069id, c9028hp, c2272adC.b());
            C2624ajb.d.b.e(interfaceC9069id, c9028hp, c2272adC.f());
            C2636ajn.c.c.e(interfaceC9069id, c9028hp, c2272adC.l());
        }
    }

    private C2273adD() {
    }

    /* renamed from: o.adD$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2272adC.b> {
        public static final b b = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("parentShow");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2272adC.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2272adC.c cVar = null;
            while (jsonReader.a(c) == 0) {
                cVar = (C2272adC.c) C8953gT.d(C8953gT.c(e.d, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C2272adC.b(cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2272adC.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.c(e.d, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.adD$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2272adC.c> {
        private static final List<String> c;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "artworkForegroundColor");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2272adC.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2272adC.c(str, num.intValue(), str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2272adC.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.b()));
            interfaceC9069id.e("artworkForegroundColor");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.adD$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2272adC.e> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "numSeasonsLabel");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2272adC.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2272adC.e(str, num.intValue(), str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2272adC.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.a()));
            interfaceC9069id.e("numSeasonsLabel");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }
}
