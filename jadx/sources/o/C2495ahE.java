package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2336aeN;
import o.C2346aeX;
import o.C2492ahB;
import o.C2632ajj;

/* renamed from: o.ahE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2495ahE {
    public static final C2495ahE c = new C2495ahE();

    /* renamed from: o.ahE$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2492ahB> {
        public static final g b = new g();
        private static final List<String> e;

        private g() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2492ahB b(JsonReader jsonReader, C9028hp c9028hp) {
            C2492ahB.i iVar;
            C2492ahB.b bVar;
            C2492ahB.d dVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2492ahB.e eVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotAppIconBillboardEntityTreatment", "PinotAppIconEntityTreatment", "PinotAwardsBillboardEntityTreatment", "PinotBannerWithTrailerEntityTreatment", "PinotBasicSearchEntity", "PinotBoxShotEntityTreatment", "PinotBoxShotWithRankEntityTreatment", "PinotBoxshotWithReminderEntityTreatment", "PinotCharacterCircleEntityTreatment", "PinotContinueWatchingEntityTreatment", "PinotCreatorHomeEntityTreatment", "PinotDoubleWideBoxshotEntityTreatment", "PinotEpisodicBillboardEntityTreatment", "PinotHorizontalArtworkWithPlaybackEntityTreatment", "PinotStandardBillboardEntityTreatment", "PinotTallPanelEntityTreatment", "PinotTitleCardWithCharacterEntityTreatment", "PinotTrailerWithAppIconEntityTreatment", "PinotTripleWideBoxshotEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                iVar = i.e.b(jsonReader, c9028hp);
            } else {
                iVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotBasicSearchEntity"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = a.b.b(jsonReader, c9028hp);
            } else {
                bVar = null;
            }
            if (C9014hb.d(C9014hb.c("IrmaAndroidPreQuerySearchEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = d.b.b(jsonReader, c9028hp);
            } else {
                dVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotTextEntity"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = c.d.b(jsonReader, c9028hp);
            }
            return new C2492ahB(str, iVar, bVar, dVar, eVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2492ahB c2492ahB) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2492ahB, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2492ahB.d());
            if (c2492ahB.b() != null) {
                i.e.e(interfaceC9069id, c9028hp, c2492ahB.b());
            }
            if (c2492ahB.a() != null) {
                a.b.e(interfaceC9069id, c9028hp, c2492ahB.a());
            }
            if (c2492ahB.c() != null) {
                d.b.e(interfaceC9069id, c9028hp, c2492ahB.c());
            }
            if (c2492ahB.e() != null) {
                c.d.e(interfaceC9069id, c9028hp, c2492ahB.e());
            }
        }
    }

    private C2495ahE() {
    }

    /* renamed from: o.ahE$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2492ahB.i> {
        private static final List<String> a;
        public static final i e = new i();

        private i() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("unifiedEntity");
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2492ahB.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2492ahB.j jVar = null;
            while (jsonReader.a(a) == 0) {
                jVar = (C2492ahB.j) C8953gT.d(C8953gT.a(f.a, true)).b(jsonReader, c9028hp);
            }
            return new C2492ahB.i(jVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2492ahB.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("unifiedEntity");
            C8953gT.d(C8953gT.a(f.a, true)).e(interfaceC9069id, c9028hp, iVar.a());
        }
    }

    /* renamed from: o.ahE$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2492ahB.j> {
        public static final f a = new f();
        private static final List<String> e;

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2492ahB.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C2492ahB.h hVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2492ahB.a aVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                hVar = j.c.b(jsonReader, c9028hp);
            } else {
                hVar = null;
            }
            if (C9014hb.d(C9014hb.c("Game"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = e.b.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2492ahB.j(str, str2, hVar, aVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2492ahB.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, jVar.a());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, jVar.d());
            if (jVar.e() != null) {
                j.c.e(interfaceC9069id, c9028hp, jVar.e());
            }
            if (jVar.c() != null) {
                e.b.e(interfaceC9069id, c9028hp, jVar.c());
            }
        }
    }

    /* renamed from: o.ahE$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2492ahB.h> {
        public static final j c = new j();

        private j() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2492ahB.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2492ahB.h(C2632ajj.e.b.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2492ahB.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, hVar.d());
        }
    }

    /* renamed from: o.ahE$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2492ahB.a> {
        public static final e b = new e();

        private e() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2492ahB.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            C2344aeV b2 = C2346aeX.e.e.b(jsonReader, c9028hp);
            jsonReader.q();
            return new C2492ahB.a(b2, C2336aeN.a.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2492ahB.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, aVar.d());
            C2336aeN.a.e.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    /* renamed from: o.ahE$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2492ahB.b> {
        public static final a b = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("displayString", "artwork");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2492ahB.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2492ahB.c cVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    cVar = (C2492ahB.c) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                } else {
                    return new C2492ahB.b(str, cVar);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2492ahB.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("displayString");
            C8953gT.t.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.ahE$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2492ahB.c> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2492ahB.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(b);
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
                return new C2492ahB.c(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2492ahB.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* renamed from: o.ahE$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2492ahB.d> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEO_TITLE);
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2492ahB.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.t.b(jsonReader, c9028hp);
            }
            return new C2492ahB.d(str);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2492ahB.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.ahE$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2492ahB.e> {
        private static final List<String> b;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("displayString", "unifiedEntityId");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2492ahB.e b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2492ahB.e(str2, str);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2492ahB.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("displayString");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("unifiedEntityId");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }
}
