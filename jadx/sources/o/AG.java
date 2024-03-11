package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AI;
import o.BH;

/* loaded from: classes2.dex */
public final class AG {
    public static final AG d = new AG();

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<AI> {
        public static final c a = new c();
        public static final int c;
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "persistedCacheKey", "boolInitialValue", "mustBeTrue", "errorMessage");
            e = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public AI b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            AI.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    dVar = (AI.d) C8953gT.d(C8953gT.a(b.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new AI(str, str2, str3, bool, bool2, dVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AI ai) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) ai, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, ai.g());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, ai.e());
            interfaceC9069id.e("persistedCacheKey");
            C8953gT.t.e(interfaceC9069id, c9028hp, ai.a());
            interfaceC9069id.e("boolInitialValue");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, ai.b());
            interfaceC9069id.e("mustBeTrue");
            c8994hH.e(interfaceC9069id, c9028hp, ai.c());
            interfaceC9069id.e("errorMessage");
            C8953gT.d(C8953gT.a(b.c, true)).e(interfaceC9069id, c9028hp, ai.d());
        }
    }

    private AG() {
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<AI.d> {
        private static final List<String> b;
        public static final b c = new b();
        public static final int d;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AI.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b2 = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new AI.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AI.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            BH.b.d.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }
}
