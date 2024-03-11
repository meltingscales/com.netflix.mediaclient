package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.PostPlayAction;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2516ahZ;
import o.C2537ahu;
import o.C2581ail;
import o.C2582aim;
import o.C2586aiq;

/* renamed from: o.aiw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2592aiw {
    public static final C2592aiw d = new C2592aiw();

    /* renamed from: o.aiw$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C2586aiq> {
        private static final List<String> a;
        public static final h c = new h();

        private h() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2586aiq b(JsonReader jsonReader, C9028hp c9028hp) {
            C2586aiq.b bVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2586aiq.c cVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotPostNextEpisodeSeamlessSection", "PinotPostPlayHardwireSection", "PinotPostPlayLegacyOriginalsSection", "PinotPostPlayLiveEventEndSection", "PinotPostPlayOriginalsBackgroundTrailerSection", "PinotPostPlayPreview3Section", "PinotPostPlayTwoUpChoicePointSection", "PinotPrePlayRecapSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = e.a.b(jsonReader, c9028hp);
            } else {
                bVar = null;
            }
            if (C9014hb.d(C9014hb.c("PinotPrePlayRecapSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = c.e.b(jsonReader, c9028hp);
            }
            return new C2586aiq(str, bVar, cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2586aiq c2586aiq) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2586aiq, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2586aiq.a());
            if (c2586aiq.b() != null) {
                e.a.e(interfaceC9069id, c9028hp, c2586aiq.b());
            }
            if (c2586aiq.c() != null) {
                c.e.e(interfaceC9069id, c9028hp, c2586aiq.c());
            }
        }
    }

    private C2592aiw() {
    }

    /* renamed from: o.aiw$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2586aiq.b> {
        public static final e a = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "sectionId", "loggingData");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2586aiq.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2586aiq.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    aVar = (C2586aiq.a) C8953gT.d(C8953gT.c(d.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2586aiq.b(str, str2, aVar);
            } else {
                C8956gW.a(jsonReader, "sectionId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2586aiq.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("sectionId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("loggingData");
            C8953gT.d(C8953gT.c(d.c, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.aiw$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2586aiq.a> {
        public static final d c = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "trackId", "feature");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2586aiq.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2586aiq.a(str, num, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2586aiq.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e("trackId");
            C8953gT.n.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("feature");
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.aiw$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2586aiq.c> {
        private static final List<String> c;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("recapEntity", PostPlayAction.AUTO_ACTION_POST_PLAY_TRACK_ID_KEY, "impressionToken");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2586aiq.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2586aiq.h hVar = null;
            Boolean bool = null;
            String str = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    hVar = (C2586aiq.h) C8953gT.d(C8953gT.a(i.a, true)).b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str = C8953gT.t.b(jsonReader, c9028hp);
                } else {
                    return new C2586aiq.c(hVar, bool, str);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2586aiq.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("recapEntity");
            C8953gT.d(C8953gT.a(i.a, true)).e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e(PostPlayAction.AUTO_ACTION_POST_PLAY_TRACK_ID_KEY);
            C8953gT.l.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("impressionToken");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    /* renamed from: o.aiw$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2586aiq.h> {
        public static final i a = new i();
        private static final List<String> b;

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2586aiq.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2586aiq.e eVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(b);
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
                eVar = a.b.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2586aiq.h(str, str2, eVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2586aiq.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, hVar.a());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, hVar.d());
            if (hVar.b() != null) {
                a.b.e(interfaceC9069id, c9028hp, hVar.b());
            }
        }
    }

    /* renamed from: o.aiw$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2586aiq.e> {
        private static final List<String> a;
        public static final a b = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "__typename");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2586aiq.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2586aiq.d dVar = null;
            String str = null;
            Integer num = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = b.e.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2579aij b2 = C2582aim.d.a.b(jsonReader, c9028hp);
            if (num != null) {
                return new C2586aiq.e(num.intValue(), str, dVar, b2);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2586aiq.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.d()));
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            if (eVar.c() != null) {
                b.e.e(interfaceC9069id, c9028hp, eVar.c());
            }
            C2582aim.d.a.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.aiw$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2586aiq.d> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("parentShow");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2586aiq.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2586aiq.j jVar = null;
            while (jsonReader.a(b) == 0) {
                jVar = (C2586aiq.j) C8953gT.d(C8953gT.a(g.d, true)).b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2533ahq b2 = C2537ahu.e.d.b(jsonReader, c9028hp);
            jsonReader.q();
            return new C2586aiq.d(jVar, b2, C2516ahZ.d.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2586aiq.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.a(g.d, true)).e(interfaceC9069id, c9028hp, dVar.a());
            C2537ahu.e.d.e(interfaceC9069id, c9028hp, dVar.c());
            C2516ahZ.d.e.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.aiw$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2586aiq.j> {
        private static final List<String> a;
        public static final g d = new g();

        private g() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2586aiq.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2576aig b = C2581ail.a.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2586aiq.j(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2586aiq.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.d());
            C2581ail.a.c.e(interfaceC9069id, c9028hp, jVar.e());
        }
    }
}
