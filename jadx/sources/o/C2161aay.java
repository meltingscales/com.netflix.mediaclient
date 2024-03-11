package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1358Yp;
import o.C2408afg;
import o.C2511ahU;
import o.C2541ahy;
import o.C2548aiE;
import o.C2581ail;

/* renamed from: o.aay  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2161aay {
    public static final C2161aay b = new C2161aay();

    /* renamed from: o.aay$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1358Yp.b> {
        private static final List<String> a;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e(SignupConstants.Field.VIDEOS);
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1358Yp.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(a) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(f.d, true)))).b(jsonReader, c9028hp);
            }
            return new C1358Yp.b(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1358Yp.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(f.d, true)))).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    private C2161aay() {
    }

    /* renamed from: o.aay$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C1358Yp.i> {
        private static final List<String> a;
        public static final f d = new f();

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "interestingArtwork");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1358Yp.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1358Yp.a aVar = null;
            String str = null;
            C1358Yp.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C1358Yp.c) C8953gT.d(C8953gT.c(b.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = d.d.b(jsonReader, c9028hp);
            }
            C1358Yp.a aVar2 = aVar;
            jsonReader.q();
            C2539ahw b = C2541ahy.a.d.b(jsonReader, c9028hp);
            jsonReader.q();
            C2514ahX b2 = C2511ahU.e.e.b(jsonReader, c9028hp);
            jsonReader.q();
            return new C1358Yp.i(str, cVar, aVar2, b, b2, C2408afg.e.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1358Yp.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.j());
            interfaceC9069id.e("interestingArtwork");
            C8953gT.d(C8953gT.c(b.b, false, 1, null)).e(interfaceC9069id, c9028hp, iVar.b());
            if (iVar.a() != null) {
                d.d.e(interfaceC9069id, c9028hp, iVar.a());
            }
            C2541ahy.a.d.e(interfaceC9069id, c9028hp, iVar.c());
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, iVar.d());
            C2408afg.e.a.e(interfaceC9069id, c9028hp, iVar.e());
        }
    }

    /* renamed from: o.aay$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1358Yp.c> {
        private static final List<String> a;
        public static final b b = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1358Yp.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1358Yp.c(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1358Yp.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    /* renamed from: o.aay$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1358Yp.a> {
        private static final List<String> a;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "__typename", "parentSeason", "parentShow");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1358Yp.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            C1358Yp.e eVar = null;
            C1358Yp.j jVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    eVar = (C1358Yp.e) C8953gT.d(C8953gT.a(c.b, true)).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    jVar = (C1358Yp.j) C8953gT.d(C8953gT.a(a.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (str != null) {
                    return new C1358Yp.a(intValue, str, eVar, jVar);
                }
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1358Yp.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.a()));
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.a(c.b, true)).e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.a(a.d, true)).e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* renamed from: o.aay$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1358Yp.e> {
        public static final c b = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1358Yp.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2547aiD b2 = C2548aiE.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1358Yp.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1358Yp.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            C2548aiE.b.b.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* renamed from: o.aay$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1358Yp.j> {
        private static final List<String> a;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1358Yp.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2576aig b = C2581ail.a.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1358Yp.j(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1358Yp.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.a());
            C2581ail.a.c.e(interfaceC9069id, c9028hp, jVar.d());
        }
    }
}
