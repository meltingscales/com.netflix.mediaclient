package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2274adE;

/* renamed from: o.adF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2275adF {
    public static final C2275adF e = new C2275adF();

    /* renamed from: o.adF$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2274adE> {
        private static final List<String> b;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "boxArt");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2274adE b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2274adE.b bVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bVar = (C2274adE.b) C8953gT.d(C8953gT.c(b.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2274adE(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2274adE c2274adE) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2274adE, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2274adE.d());
            interfaceC9069id.e("boxArt");
            C8953gT.d(C8953gT.c(b.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2274adE.b());
        }
    }

    private C2275adF() {
    }

    /* renamed from: o.adF$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2274adE.b> {
        private static final List<String> b;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2274adE.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(b);
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
                return new C2274adE.b(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2274adE.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, bVar.e());
        }
    }
}
