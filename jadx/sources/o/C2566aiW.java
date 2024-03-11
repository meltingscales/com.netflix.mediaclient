package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2314ads;
import o.C2569aiZ;

/* renamed from: o.aiW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2566aiW {
    public static final C2566aiW a = new C2566aiW();

    /* renamed from: o.aiW$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC8949gP<C2569aiZ> {
        public static final g d = new g();
        private static final List<String> e;

        private g() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "avatar", "createdAt", Payload.PARAM_GUID, "isAccountOwner", "isAutoStartEnabled", "isKids", "isPinLocked", "isProfileCreationLocked", "isRecentlyCreated", "isVideoMerchEnabled", "lockPin", "maturityRating", "name", "primaryLanguage", SignupConstants.Field.SECONDARY_LANGUAGES, "titleProtectedVideos");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2569aiZ b(JsonReader jsonReader, C9028hp c9028hp) {
            Boolean bool;
            String str;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str2 = null;
            C2569aiZ.e eVar = null;
            Instant instant = null;
            String str3 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            String str4 = null;
            C2569aiZ.d dVar = null;
            String str5 = null;
            String str6 = null;
            List list = null;
            C2569aiZ.a aVar = null;
            while (true) {
                switch (jsonReader.a(e)) {
                    case 0:
                        bool = bool8;
                        str2 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        bool = bool8;
                        eVar = (C2569aiZ.e) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 2:
                        instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                        continue;
                    case 3:
                        str3 = C8953gT.p.b(jsonReader, c9028hp);
                        continue;
                    case 4:
                        bool2 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 5:
                        bool3 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 6:
                        bool4 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 7:
                        bool5 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 8:
                        bool6 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 9:
                        bool7 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 10:
                        bool8 = C8953gT.l.b(jsonReader, c9028hp);
                        continue;
                    case 11:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        continue;
                    case 12:
                        bool = bool8;
                        str = str4;
                        dVar = (C2569aiZ.d) C8953gT.d(C8953gT.c(a.d, false, 1, null)).b(jsonReader, c9028hp);
                        str4 = str;
                        break;
                    case 13:
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        continue;
                    case 14:
                        str6 = C8953gT.t.b(jsonReader, c9028hp);
                        continue;
                    case 15:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.t)).b(jsonReader, c9028hp);
                        continue;
                    case 16:
                        bool = bool8;
                        str = str4;
                        aVar = (C2569aiZ.a) C8953gT.d(C8953gT.c(e.e, false, 1, null)).b(jsonReader, c9028hp);
                        str4 = str;
                        break;
                    default:
                        Boolean bool9 = bool8;
                        String str7 = str4;
                        if (str2 == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (str3 != null) {
                            return new C2569aiZ(str2, eVar, instant, str3, bool2, bool3, bool4, bool5, bool6, bool7, bool9, str7, dVar, str5, str6, list, aVar);
                        } else {
                            C8956gW.a(jsonReader, Payload.PARAM_GUID);
                            throw new KotlinNothingValueException();
                        }
                }
                bool8 = bool;
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2569aiZ c2569aiZ) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2569aiZ, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2569aiZ.g());
            interfaceC9069id.e("avatar");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2569aiZ.a());
            interfaceC9069id.e("createdAt");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, c2569aiZ.e());
            interfaceC9069id.e(Payload.PARAM_GUID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2569aiZ.d());
            interfaceC9069id.e("isAccountOwner");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, c2569aiZ.k());
            interfaceC9069id.e("isAutoStartEnabled");
            c8994hH.e(interfaceC9069id, c9028hp, c2569aiZ.o());
            interfaceC9069id.e("isKids");
            c8994hH.e(interfaceC9069id, c9028hp, c2569aiZ.l());
            interfaceC9069id.e("isPinLocked");
            c8994hH.e(interfaceC9069id, c9028hp, c2569aiZ.m());
            interfaceC9069id.e("isProfileCreationLocked");
            c8994hH.e(interfaceC9069id, c9028hp, c2569aiZ.n());
            interfaceC9069id.e("isRecentlyCreated");
            c8994hH.e(interfaceC9069id, c9028hp, c2569aiZ.p());
            interfaceC9069id.e("isVideoMerchEnabled");
            c8994hH.e(interfaceC9069id, c9028hp, c2569aiZ.r());
            interfaceC9069id.e("lockPin");
            C8994hH<String> c8994hH2 = C8953gT.t;
            c8994hH2.e(interfaceC9069id, c9028hp, c2569aiZ.b());
            interfaceC9069id.e("maturityRating");
            C8953gT.d(C8953gT.c(a.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2569aiZ.c());
            interfaceC9069id.e("name");
            c8994hH2.e(interfaceC9069id, c9028hp, c2569aiZ.h());
            interfaceC9069id.e("primaryLanguage");
            c8994hH2.e(interfaceC9069id, c9028hp, c2569aiZ.f());
            interfaceC9069id.e(SignupConstants.Field.SECONDARY_LANGUAGES);
            C8953gT.d(C8953gT.a(c8994hH2)).e(interfaceC9069id, c9028hp, c2569aiZ.i());
            interfaceC9069id.e("titleProtectedVideos");
            C8953gT.d(C8953gT.c(e.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2569aiZ.j());
        }
    }

    private C2566aiW() {
    }

    /* renamed from: o.aiW$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2569aiZ.e> {
        private static final List<String> a;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2569aiZ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2569aiZ.e(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2569aiZ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    /* renamed from: o.aiW$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2569aiZ.d> {
        private static final List<String> c;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isHighest", "isLowest", "labels", "level", "value");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2569aiZ.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            List list = null;
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.t)).b(jsonReader, c9028hp);
                } else if (a == 4) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2569aiZ.d(str, bool, bool2, list, num, num2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2569aiZ.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("isHighest");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("isLowest");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.i());
            interfaceC9069id.e("labels");
            C8953gT.d(C8953gT.a(C8953gT.t)).e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("level");
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("value");
            c8994hH2.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.aiW$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2569aiZ.a> {
        private static final List<String> c;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "edges");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2569aiZ.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(d.d, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2569aiZ.a(str, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2569aiZ.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(d.d, false, 1, null))).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.aiW$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2569aiZ.b> {
        private static final List<String> a;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2569aiZ.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2569aiZ.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C2569aiZ.c) C8953gT.d(C8953gT.a(c.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2569aiZ.b(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2569aiZ.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(c.b, true)).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.aiW$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2569aiZ.c> {
        private static final List<String> a;
        public static final c b = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2569aiZ.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2316adu b2 = C2314ads.c.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2569aiZ.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2569aiZ.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            C2314ads.c.a.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
