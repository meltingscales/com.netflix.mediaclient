package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2413afl;
import o.C2577aih;
import o.C2580aik;
import o.C2583ain;

/* renamed from: o.aii  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2578aii {
    public static final C2578aii b = new C2578aii();

    /* renamed from: o.aii$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2580aik> {
        private static final List<String> a;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isPlayable", "isAvailable", "supportsInteractiveExperiences", "mdxBoxart");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2580aik b(JsonReader jsonReader, C9028hp c9028hp) {
            C2580aik.d dVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2573aid c2573aid = null;
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            C2580aik.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    bool3 = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 != 4) {
                    break;
                } else {
                    aVar = (C2580aik.a) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = c.b.b(jsonReader, c9028hp);
            } else {
                dVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2573aid = C2577aih.c.d.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            return new C2580aik(str, bool, bool2, bool3, aVar, dVar, c2573aid, C2413afl.d.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2580aik c2580aik) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2580aik, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2580aik.g());
            interfaceC9069id.e("isPlayable");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, c2580aik.h());
            interfaceC9069id.e("isAvailable");
            c8994hH.e(interfaceC9069id, c9028hp, c2580aik.i());
            interfaceC9069id.e("supportsInteractiveExperiences");
            c8994hH.e(interfaceC9069id, c9028hp, c2580aik.e());
            interfaceC9069id.e("mdxBoxart");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2580aik.d());
            if (c2580aik.c() != null) {
                c.b.e(interfaceC9069id, c9028hp, c2580aik.c());
            }
            if (c2580aik.a() != null) {
                C2577aih.c.d.e(interfaceC9069id, c9028hp, c2580aik.a());
            }
            C2413afl.d.a.e(interfaceC9069id, c9028hp, c2580aik.b());
        }
    }

    private C2578aii() {
    }

    /* renamed from: o.aii$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2580aik.a> {
        private static final List<String> a;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2580aik.a b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2580aik.a(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2580aik.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* renamed from: o.aii$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2580aik.d> {
        public static final c b = new c();

        private c() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2580aik.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2580aik.d(C2583ain.a.b.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2580aik.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            C2583ain.a.b.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
