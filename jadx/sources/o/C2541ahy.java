package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2362aen;
import o.C2516ahZ;
import o.C2539ahw;

/* renamed from: o.ahy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2541ahy {
    public static final C2541ahy b = new C2541ahy();

    /* renamed from: o.ahy$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2539ahw> {
        private static final List<String> b;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isInTurboCollections", "playbackBadges");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2539ahw b(JsonReader jsonReader, C9028hp c9028hp) {
            C2539ahw.h hVar;
            C2539ahw.d dVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2539ahw.a aVar = null;
            String str = null;
            List list = null;
            List list2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.j)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list2 = (List) C8953gT.d(C8953gT.a(C8953gT.d(C3483azo.e))).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                hVar = g.b.b(jsonReader, c9028hp);
            } else {
                hVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = d.a.b(jsonReader, c9028hp);
            } else {
                dVar = null;
            }
            if (C9014hb.d(C9014hb.c("Movie"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = f.c.b(jsonReader, c9028hp);
            }
            return new C2539ahw(str, list, list2, hVar, dVar, aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2539ahw c2539ahw) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2539ahw, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2539ahw.e());
            interfaceC9069id.e("isInTurboCollections");
            C8953gT.d(C8953gT.a(C8953gT.j)).e(interfaceC9069id, c9028hp, c2539ahw.h());
            interfaceC9069id.e("playbackBadges");
            C8953gT.d(C8953gT.a(C8953gT.d(C3483azo.e))).e(interfaceC9069id, c9028hp, c2539ahw.c());
            if (c2539ahw.b() != null) {
                g.b.e(interfaceC9069id, c9028hp, c2539ahw.b());
            }
            if (c2539ahw.a() != null) {
                d.a.e(interfaceC9069id, c9028hp, c2539ahw.a());
            }
            if (c2539ahw.d() != null) {
                f.c.e(interfaceC9069id, c9028hp, c2539ahw.d());
            }
        }
    }

    private C2541ahy() {
    }

    /* renamed from: o.ahy$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2539ahw.h> {
        public static final g b = new g();
        private static final List<String> e;

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "currentEpisode");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2539ahw.h b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            C2539ahw.c cVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (C2539ahw.c) C8953gT.d(C8953gT.a(e.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C2539ahw.h(num.intValue(), cVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2539ahw.h hVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) hVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(hVar.b()));
            interfaceC9069id.e("currentEpisode");
            C8953gT.d(C8953gT.a(e.a, true)).e(interfaceC9069id, c9028hp, hVar.d());
        }
    }

    /* renamed from: o.ahy$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2539ahw.c> {
        public static final e a = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "nextEpisode", "logicalEndOffsetSec", "logicalStartOffsetSec");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2539ahw.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            C2539ahw.e eVar = null;
            Integer num2 = null;
            Integer num3 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    eVar = (C2539ahw.e) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 != 4) {
                    break;
                } else {
                    num3 = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2572aic b = C2516ahZ.d.e.b(jsonReader, c9028hp);
            jsonReader.q();
            C2363aeo b2 = C2362aen.e.d.b(jsonReader, c9028hp);
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2539ahw.c(str, num.intValue(), eVar, num2, num3, b, b2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2539ahw.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.f());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.i()));
            interfaceC9069id.e("nextEpisode");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("logicalEndOffsetSec");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("logicalStartOffsetSec");
            c8994hH.e(interfaceC9069id, c9028hp, cVar.a());
            C2516ahZ.d.e.e(interfaceC9069id, c9028hp, cVar.d());
            C2362aen.e.d.e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* renamed from: o.ahy$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2539ahw.e> {
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "isPlayable");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2539ahw.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2539ahw.e(str, num.intValue(), bool);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2539ahw.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.a()));
            interfaceC9069id.e("isPlayable");
            C8953gT.l.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.ahy$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2539ahw.d> {
        public static final d a = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("logicalEndOffsetSec", "logicalStartOffsetSec", "nextEpisode", "parentSeason");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2539ahw.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            C2539ahw.b bVar = null;
            C2539ahw.i iVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    bVar = (C2539ahw.b) C8953gT.d(C8953gT.c(b.d, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    iVar = (C2539ahw.i) C8953gT.d(C8953gT.c(j.d, false, 1, null)).b(jsonReader, c9028hp);
                } else {
                    jsonReader.q();
                    C2572aic b = C2516ahZ.d.e.b(jsonReader, c9028hp);
                    jsonReader.q();
                    return new C2539ahw.d(num, num2, bVar, iVar, b, C2362aen.e.d.b(jsonReader, c9028hp));
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2539ahw.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("logicalEndOffsetSec");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("logicalStartOffsetSec");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("nextEpisode");
            C8953gT.d(C8953gT.c(b.d, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("parentSeason");
            C8953gT.d(C8953gT.c(j.d, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.c());
            C2516ahZ.d.e.e(interfaceC9069id, c9028hp, dVar.j());
            C2362aen.e.d.e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.ahy$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2539ahw.b> {
        private static final List<String> b;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "isPlayable");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2539ahw.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2539ahw.b(str, num.intValue(), bool);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2539ahw.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.b()));
            interfaceC9069id.e("isPlayable");
            C8953gT.l.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.ahy$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC8949gP<C2539ahw.i> {
        public static final j d = new j();
        private static final List<String> e;

        private j() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "longNumberLabel", "numberLabelV2", SignupConstants.Field.VIDEO_TITLE, "number");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2539ahw.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 4) {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2539ahw.i(str, num.intValue(), str2, str3, str4, num2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2539ahw.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, iVar.i());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(iVar.c()));
            interfaceC9069id.e("longNumberLabel");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, iVar.a());
            interfaceC9069id.e("numberLabelV2");
            c8994hH.e(interfaceC9069id, c9028hp, iVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            c8994hH.e(interfaceC9069id, c9028hp, iVar.b());
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, iVar.d());
        }
    }

    /* renamed from: o.ahy$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8949gP<C2539ahw.a> {
        private static final List<String> a;
        public static final f c = new f();

        private f() {
        }

        static {
            List<String> j;
            j = C8569dql.j("logicalEndOffsetSec", "logicalStartOffsetSec");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2539ahw.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else {
                    return new C2539ahw.a(num, num2);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2539ahw.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("logicalEndOffsetSec");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("logicalStartOffsetSec");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }
}
