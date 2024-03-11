package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2288adS;
import o.C2294adY;
import o.C2349aea;
import o.C2356aeh;
import o.C2413afl;
import o.C2632ajj;

/* renamed from: o.aek  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2359aek {
    public static final C2359aek b = new C2359aek();

    /* renamed from: o.aek$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2356aeh> {
        public static final a b = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isAvailable", "synopsis", "interestingSmallArtwork", "isEpisodeNumberHidden");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2356aeh b(JsonReader jsonReader, C9028hp c9028hp) {
            C2356aeh.c cVar;
            C2295adZ c2295adZ;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2289adT c2289adT = null;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            C2356aeh.e eVar = null;
            Boolean bool2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    eVar = (C2356aeh.e) C8953gT.d(C8953gT.c(d.b, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = e.b.b(jsonReader, c9028hp);
            } else {
                cVar = null;
            }
            jsonReader.q();
            C2630ajh b2 = C2632ajj.e.b.b(jsonReader, c9028hp);
            jsonReader.q();
            C2287adR b3 = C2288adS.a.c.b(jsonReader, c9028hp);
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2295adZ = C2294adY.c.c.b(jsonReader, c9028hp);
            } else {
                c2295adZ = null;
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2289adT = C2349aea.d.c.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            return new C2356aeh(str, bool, str2, eVar, bool2, cVar, b2, b3, c2295adZ, c2289adT, C2413afl.d.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2356aeh c2356aeh) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2356aeh, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2356aeh.f());
            interfaceC9069id.e("isAvailable");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, c2356aeh.j());
            interfaceC9069id.e("synopsis");
            C8953gT.t.e(interfaceC9069id, c9028hp, c2356aeh.h());
            interfaceC9069id.e("interestingSmallArtwork");
            C8953gT.d(C8953gT.c(d.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2356aeh.c());
            interfaceC9069id.e("isEpisodeNumberHidden");
            c8994hH.e(interfaceC9069id, c9028hp, c2356aeh.l());
            if (c2356aeh.i() != null) {
                e.b.e(interfaceC9069id, c9028hp, c2356aeh.i());
            }
            C2632ajj.e.b.e(interfaceC9069id, c9028hp, c2356aeh.g());
            C2288adS.a.c.e(interfaceC9069id, c9028hp, c2356aeh.a());
            if (c2356aeh.b() != null) {
                C2294adY.c.c.e(interfaceC9069id, c9028hp, c2356aeh.b());
            }
            if (c2356aeh.e() != null) {
                C2349aea.d.c.e(interfaceC9069id, c9028hp, c2356aeh.e());
            }
            C2413afl.d.a.e(interfaceC9069id, c9028hp, c2356aeh.d());
        }
    }

    private C2359aek() {
    }

    /* renamed from: o.aek$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2356aeh.e> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2356aeh.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2356aeh.e(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2356aeh.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.aek$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2356aeh.c> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("availabilityDateMessaging", "number", "displayNewBadge");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2356aeh.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else {
                    return new C2356aeh.c(str, num, bool);
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2356aeh.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("availabilityDateMessaging");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("displayNewBadge");
            C8953gT.l.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }
}
