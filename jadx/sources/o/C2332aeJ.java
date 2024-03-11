package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2288adS;
import o.C2294adY;
import o.C2328aeF;
import o.C2330aeH;
import o.C2349aea;
import o.C2413afl;

/* renamed from: o.aeJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2332aeJ {
    public static final C2332aeJ c = new C2332aeJ();

    /* renamed from: o.aeJ$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2328aeF> {
        private static final List<String> a;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "pageInfo", "edges");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2328aeF b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C2328aeF.d dVar = null;
            List list = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    dVar = (C2328aeF.d) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.c, false, 1, null)))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2328aeF(str, num, dVar, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2328aeF c2328aeF) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2328aeF, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2328aeF.e());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2328aeF.b());
            interfaceC9069id.e("pageInfo");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2328aeF.c());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(d.c, false, 1, null)))).e(interfaceC9069id, c9028hp, c2328aeF.a());
        }
    }

    private C2332aeJ() {
    }

    /* renamed from: o.aeJ$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2328aeF.d> {
        public static final e c = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "hasNextPage", "endCursor");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2328aeF.d b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    bool = C8953gT.i.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (bool != null) {
                return new C2328aeF.d(str, bool.booleanValue(), str2);
            } else {
                C8956gW.a(jsonReader, "hasNextPage");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2328aeF.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("hasNextPage");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(dVar.c()));
            interfaceC9069id.e("endCursor");
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    /* renamed from: o.aeJ$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2328aeF.b> {
        public static final d c = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2328aeF.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2328aeF.e eVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    eVar = (C2328aeF.e) C8953gT.d(C8953gT.a(c.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2328aeF.b(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2328aeF.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(c.b, true)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.aeJ$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2328aeF.e> {
        public static final c b = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, SignupConstants.Field.VIDEO_TITLE, "unifiedEntityId", "isAvailable", "isPlayable", "isAvailableForDownload", "availabilityDateMessaging", "synopsis", "interestingArtworkSmall", "isEpisodeNumberHidden", "number", "displayNewBadge", "isInRemindMeList");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2328aeF.e b(JsonReader jsonReader, C9028hp c9028hp) {
            Integer num;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str4 = null;
            String str5 = null;
            C2328aeF.a aVar = null;
            Boolean bool4 = null;
            Integer num3 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            while (true) {
                switch (jsonReader.a(c)) {
                    case 0:
                        num = num3;
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        num2 = C8953gT.j.b(jsonReader, c9028hp);
                        continue;
                    case 2:
                        num = num3;
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num = num3;
                        str3 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num = num3;
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        num = num3;
                        bool2 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        num = num3;
                        bool3 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        num = num3;
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 8:
                        num = num3;
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 9:
                        num = num3;
                        aVar = (C2328aeF.a) C8953gT.d(C8953gT.c(a.b, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 10:
                        bool4 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 11:
                        num3 = C8953gT.n.b(jsonReader, c9028hp);
                        continue;
                    case 12:
                        bool5 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 13:
                        bool6 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    default:
                        Integer num4 = num3;
                        jsonReader.q();
                        C2287adR b2 = C2288adS.a.c.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2295adZ b3 = C2294adY.c.c.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2289adT b4 = C2349aea.d.c.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2412afk b5 = C2413afl.d.a.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2329aeG b6 = C2330aeH.e.a.b(jsonReader, c9028hp);
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (num2 != null) {
                            int intValue = num2.intValue();
                            if (str3 != null) {
                                return new C2328aeF.e(str, intValue, str2, str3, bool, bool2, bool3, str4, str5, aVar, bool4, num4, bool5, bool6, b2, b3, b4, b5, b6);
                            }
                            C8956gW.a(jsonReader, "unifiedEntityId");
                            throw new KotlinNothingValueException();
                        } else {
                            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                            throw new KotlinNothingValueException();
                        }
                }
                num3 = num;
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2328aeF.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.n());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.k()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.m());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.l());
            interfaceC9069id.e("isAvailable");
            C8994hH<Boolean> c8994hH2 = C8953gT.l;
            c8994hH2.e(interfaceC9069id, c9028hp, eVar.o());
            interfaceC9069id.e("isPlayable");
            c8994hH2.e(interfaceC9069id, c9028hp, eVar.q());
            interfaceC9069id.e("isAvailableForDownload");
            c8994hH2.e(interfaceC9069id, c9028hp, eVar.r());
            interfaceC9069id.e("availabilityDateMessaging");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("synopsis");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.i());
            interfaceC9069id.e("interestingArtworkSmall");
            C8953gT.d(C8953gT.c(a.b, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.h());
            interfaceC9069id.e("isEpisodeNumberHidden");
            c8994hH2.e(interfaceC9069id, c9028hp, eVar.t());
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, eVar.g());
            interfaceC9069id.e("displayNewBadge");
            c8994hH2.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("isInRemindMeList");
            c8994hH2.e(interfaceC9069id, c9028hp, eVar.p());
            C2288adS.a.c.e(interfaceC9069id, c9028hp, eVar.d());
            C2294adY.c.c.e(interfaceC9069id, c9028hp, eVar.e());
            C2349aea.d.c.e(interfaceC9069id, c9028hp, eVar.b());
            C2413afl.d.a.e(interfaceC9069id, c9028hp, eVar.j());
            C2330aeH.e.a.e(interfaceC9069id, c9028hp, eVar.f());
        }
    }

    /* renamed from: o.aeJ$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2328aeF.a> {
        public static final a b = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2328aeF.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2328aeF.a(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2328aeF.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
