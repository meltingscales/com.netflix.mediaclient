package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1348Yf;

/* renamed from: o.aag  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2143aag {
    public static final C2143aag c = new C2143aag();

    /* renamed from: o.aag$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1348Yf.e> {
        public static final b b = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e(SignupConstants.Field.VIDEOS);
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1348Yf.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(e) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.a, false, 1, null)))).b(jsonReader, c9028hp);
            }
            return new C1348Yf.e(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1348Yf.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.a, false, 1, null)))).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    private C2143aag() {
    }

    /* renamed from: o.aag$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1348Yf.d> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "promoVideo");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1348Yf.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C1348Yf.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    cVar = (C1348Yf.c) C8953gT.d(C8953gT.c(e.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1348Yf.d(str, num.intValue(), cVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1348Yf.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.d()));
            interfaceC9069id.e("promoVideo");
            C8953gT.d(C8953gT.c(e.a, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* renamed from: o.aag$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1348Yf.c> {
        public static final e a = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "video");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1348Yf.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1348Yf.j jVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    jVar = (C1348Yf.j) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1348Yf.c(str, jVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1348Yf.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e("video");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.aag$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1348Yf.j> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "storyArt");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1348Yf.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C1348Yf.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    aVar = (C1348Yf.a) C8953gT.d(C8953gT.c(d.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1348Yf.j(str, num.intValue(), aVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1348Yf.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(jVar.d()));
            interfaceC9069id.e("storyArt");
            C8953gT.d(C8953gT.c(d.c, false, 1, null)).e(interfaceC9069id, c9028hp, jVar.b());
        }
    }

    /* renamed from: o.aag$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1348Yf.a> {
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "available", SignupConstants.Field.URL);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1348Yf.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1348Yf.a(str, bool, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1348Yf.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }
}
