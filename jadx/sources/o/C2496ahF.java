package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2498ahH;

/* renamed from: o.ahF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2496ahF {
    public static final C2496ahF b = new C2496ahF();

    /* renamed from: o.ahF$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2498ahH> {
        private static final List<String> b;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "sectionId", "sectionTreatment");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2498ahH b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2498ahH.e eVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    eVar = (C2498ahH.e) C8953gT.d(C8953gT.a(f.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2498ahH(str, str2, eVar);
            } else {
                C8956gW.a(jsonReader, "sectionId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2498ahH c2498ahH) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2498ahH, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2498ahH.c());
            interfaceC9069id.e("sectionId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2498ahH.d());
            interfaceC9069id.e("sectionTreatment");
            C8953gT.d(C8953gT.a(f.d, true)).e(interfaceC9069id, c9028hp, c2498ahH.a());
        }
    }

    private C2496ahF() {
    }

    /* renamed from: o.ahF$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2498ahH.e> {
        public static final f d = new f();
        private static final List<String> e;

        private f() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2498ahH.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2498ahH.b bVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotCreatorHomeSectionTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = c.d.b(jsonReader, c9028hp);
            }
            return new C2498ahH.e(str, bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2498ahH.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            if (eVar.d() != null) {
                c.d.e(interfaceC9069id, c9028hp, eVar.d());
            }
        }
    }

    /* renamed from: o.ahF$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2498ahH.b> {
        private static final List<String> b;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "creatorCollection");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2498ahH.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2498ahH.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2498ahH.a) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2498ahH.b(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2498ahH.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("creatorCollection");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.ahF$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2498ahH.a> {
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId", "artwork");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2498ahH.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2498ahH.d dVar = null;
            String str = null;
            String str2 = null;
            C2498ahH.c cVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    cVar = (C2498ahH.c) C8953gT.d(C8953gT.c(b.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("GenericContainer"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = e.e.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2498ahH.a(str, str2, cVar, dVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2498ahH.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(b.a, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.c());
            if (aVar.b() != null) {
                e.e.e(interfaceC9069id, c9028hp, aVar.b());
            }
        }
    }

    /* renamed from: o.ahF$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2498ahH.c> {
        public static final b a = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL, "type");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2498ahH.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2498ahH.c(str, str2, str3, str4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2498ahH.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }

    /* renamed from: o.ahF$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2498ahH.d> {
        private static final List<String> b;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_TITLE, SignupConstants.Field.LANG_ID);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2498ahH.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2498ahH.d(str2, str);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2498ahH.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
