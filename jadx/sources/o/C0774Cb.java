package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BU;
import o.BY;

/* renamed from: o.Cb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0774Cb {
    public static final C0774Cb a = new C0774Cb();

    /* renamed from: o.Cb$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BU> {
        private static final List<String> b;
        public static final int c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "persistedCacheKey", "initialValue", "validations");
            b = j;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BU b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.a(e.a, true))).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new BU(str, str2, str3, str4, list);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BU bu) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bu, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bu.a());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bu.b());
            interfaceC9069id.e("persistedCacheKey");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bu.e());
            interfaceC9069id.e("initialValue");
            c8994hH.e(interfaceC9069id, c9028hp, bu.c());
            interfaceC9069id.e("validations");
            C8953gT.d(C8953gT.a(C8953gT.a(e.a, true))).e(interfaceC9069id, c9028hp, bu.d());
        }
    }

    private C0774Cb() {
    }

    /* renamed from: o.Cb$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<BU.e> {
        public static final e a = new e();
        public static final int c;
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BU.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BZ b = BY.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BU.e(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BU.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            BY.a.d.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }
}
