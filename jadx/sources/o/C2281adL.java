package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2280adK;

/* renamed from: o.adL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2281adL {
    public static final C2281adL c = new C2281adL();

    /* renamed from: o.adL$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2280adK> {
        public static final d a = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "horizontalArt");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2280adK b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2280adK.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    eVar = (C2280adK.e) C8953gT.d(C8953gT.c(c.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2280adK(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2280adK c2280adK) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2280adK, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2280adK.b());
            interfaceC9069id.e("horizontalArt");
            C8953gT.d(C8953gT.c(c.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2280adK.e());
        }
    }

    private C2281adL() {
    }

    /* renamed from: o.adL$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2280adK.e> {
        public static final c b = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2280adK.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(d);
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
                return new C2280adK.e(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2280adK.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }
}
