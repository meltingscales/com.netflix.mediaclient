package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2411afj;

/* renamed from: o.afm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2414afm {
    public static final C2414afm a = new C2414afm();

    /* renamed from: o.afm$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2411afj> {
        public static final d a = new d();
        private static final List<String> b;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "sectionId", "sectionTreatment");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2411afj b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2411afj.g gVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    gVar = (C2411afj.g) C8953gT.d(C8953gT.a(j.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2411afj(str, str2, gVar);
            } else {
                C8956gW.a(jsonReader, "sectionId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2411afj c2411afj) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2411afj, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2411afj.b());
            interfaceC9069id.e("sectionId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2411afj.a());
            interfaceC9069id.e("sectionTreatment");
            C8953gT.d(C8953gT.a(j.b, true)).e(interfaceC9069id, c9028hp, c2411afj.c());
        }
    }

    private C2414afm() {
    }

    /* renamed from: o.afm$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2411afj.g> {
        private static final List<String> a;
        public static final j b = new j();

        private j() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2411afj.g b(JsonReader jsonReader, C9028hp c9028hp) {
            C2411afj.a aVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2411afj.h hVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("IrmaCreatorHomeSectionTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = g.c.b(jsonReader, c9028hp);
            } else {
                aVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotCreatorHomeSectionTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                hVar = h.b.b(jsonReader, c9028hp);
            }
            return new C2411afj.g(str, aVar, hVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2411afj.g gVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) gVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, gVar.b());
            if (gVar.a() != null) {
                g.c.e(interfaceC9069id, c9028hp, gVar.a());
            }
            if (gVar.e() != null) {
                h.b.e(interfaceC9069id, c9028hp, gVar.e());
            }
        }
    }

    /* renamed from: o.afm$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2411afj.a> {
        public static final g c = new g();
        private static final List<String> d;

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "image", "unifiedEntityId", "creatorCollectionId", SignupConstants.Field.VIDEO_TITLE);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2411afj.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2411afj.b bVar = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bVar = (C2411afj.b) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str3 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 == null) {
                C8956gW.a(jsonReader, "unifiedEntityId");
                throw new KotlinNothingValueException();
            } else if (str3 != null) {
                return new C2411afj.a(str, bVar, str2, str3, str4);
            } else {
                C8956gW.a(jsonReader, "creatorCollectionId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2411afj.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("image");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("creatorCollectionId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* renamed from: o.afm$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2411afj.b> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2411afj.b b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2411afj.b(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2411afj.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* renamed from: o.afm$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2411afj.h> {
        public static final h b = new h();
        private static final List<String> c;

        private h() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "creatorCollection");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2411afj.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2411afj.d dVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    dVar = (C2411afj.d) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2411afj.h(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2411afj.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, hVar.b());
            interfaceC9069id.e("creatorCollection");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, hVar.d());
        }
    }

    /* renamed from: o.afm$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2411afj.d> {
        private static final List<String> a;
        public static final b b = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId", "artwork");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2411afj.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2411afj.c cVar = null;
            String str = null;
            String str2 = null;
            C2411afj.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    eVar = (C2411afj.e) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("GenericContainer"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = a.d.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2411afj.d(str, str2, eVar, cVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2411afj.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.e());
            if (dVar.c() != null) {
                a.d.e(interfaceC9069id, c9028hp, dVar.c());
            }
        }
    }

    /* renamed from: o.afm$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2411afj.e> {
        private static final List<String> a;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL, "type");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2411afj.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int a2 = jsonReader.a(a);
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
                return new C2411afj.e(str, str2, str3, str4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2411afj.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.afm$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2411afj.c> {
        private static final List<String> c;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_TITLE, SignupConstants.Field.LANG_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2411afj.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2411afj.c(str2, str);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2411afj.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }
}
