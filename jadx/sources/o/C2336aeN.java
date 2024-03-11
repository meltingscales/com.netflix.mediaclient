package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2331aeI;

/* renamed from: o.aeN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2336aeN {
    public static final C2336aeN a = new C2336aeN();

    /* renamed from: o.aeN$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2331aeI> {
        private static final List<String> b;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "artwork");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2331aeI b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2331aeI.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2331aeI.a) C8953gT.d(C8953gT.c(c.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2331aeI(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2331aeI c2331aeI) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2331aeI, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2331aeI.c());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(c.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2331aeI.a());
        }
    }

    private C2336aeN() {
    }

    /* renamed from: o.aeN$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2331aeI.a> {
        public static final c a = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2331aeI.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(c);
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
                return new C2331aeI.a(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2331aeI.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }
}
