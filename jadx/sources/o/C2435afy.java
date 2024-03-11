package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2376afA;

/* renamed from: o.afy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2435afy {
    public static final C2435afy c = new C2435afy();

    /* renamed from: o.afy$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2376afA> {
        public static final a a = new a();
        private static final List<String> b;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "liveArtwork");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2376afA b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.c, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2376afA(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2376afA c2376afA) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2376afA, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2376afA.e());
            interfaceC9069id.e("liveArtwork");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.c, false, 1, null)))).e(interfaceC9069id, c9028hp, c2376afA.a());
        }
    }

    private C2435afy() {
    }

    /* renamed from: o.afy$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2376afA.c> {
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "timeRange", "image");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2376afA.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2376afA.d dVar = null;
            C2376afA.e eVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    dVar = (C2376afA.d) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    eVar = (C2376afA.e) C8953gT.d(C8953gT.c(b.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2376afA.c(str, dVar, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2376afA.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("timeRange");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("image");
            C8953gT.d(C8953gT.c(b.c, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.afy$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2376afA.d> {
        public static final e b = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "startTime", "endTime");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2376afA.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Instant instant = null;
            Instant instant2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    instant2 = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2376afA.d(str, instant, instant2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2376afA.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("startTime");
            C8950gQ c8950gQ = C8950gQ.c;
            C8953gT.d(c8950gQ).e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("endTime");
            C8953gT.d(c8950gQ).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.afy$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2376afA.e> {
        public static final b c = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2376afA.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2376afA.e(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2376afA.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }
}
