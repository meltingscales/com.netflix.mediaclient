package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2359aek;
import o.C2366aer;
import o.C2368aet;
import o.C2575aif;

/* renamed from: o.aeu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2369aeu {
    public static final C2369aeu c = new C2369aeu();

    /* renamed from: o.aeu$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2368aet> {
        public static final e a = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2368aet b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2368aet.a aVar = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Season"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = c.a.b(jsonReader, c9028hp);
            }
            return new C2368aet(str, aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2368aet c2368aet) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2368aet, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2368aet.b());
            if (c2368aet.c() != null) {
                c.a.e(interfaceC9069id, c9028hp, c2368aet.c());
            }
        }
    }

    private C2369aeu() {
    }

    /* renamed from: o.aeu$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2368aet.a> {
        public static final c a = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "__typename", "episodes");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2368aet.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            C2368aet.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    eVar = (C2368aet.e) C8953gT.d(C8953gT.c(a.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (str != null) {
                    return new C2368aet.a(intValue, str, eVar);
                }
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2368aet.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.a()));
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("episodes");
            C8953gT.d(C8953gT.c(a.c, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.d());
        }
    }

    /* renamed from: o.aeu$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2368aet.e> {
        public static final a c = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2368aet.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(b.b, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2368aet.e(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2368aet.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(b.b, false, 1, null)))).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.aeu$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2368aet.c> {
        public static final b b = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2368aet.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2368aet.b bVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    bVar = (C2368aet.b) C8953gT.d(C8953gT.a(d.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2368aet.c(str, str2, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2368aet.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("cursor");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(d.d, true)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.aeu$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2368aet.b> {
        public static final d d = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "availabilityStartTime");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2368aet.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Instant instant = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2356aeh b = C2359aek.a.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2364aep b2 = C2366aer.a.a.b(jsonReader, c9028hp);
            jsonReader.q();
            C2574aie b3 = C2575aif.i.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2368aet.b(str, instant, b, b2, b3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2368aet.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("availabilityStartTime");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, bVar.c());
            C2359aek.a.b.e(interfaceC9069id, c9028hp, bVar.e());
            C2366aer.a.a.e(interfaceC9069id, c9028hp, bVar.a());
            C2575aif.i.a.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }
}
