package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2282adM;

/* renamed from: o.adQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2286adQ {
    public static final C2286adQ a = new C2286adQ();

    /* renamed from: o.adQ$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2282adM> {
        private static final List<String> b;
        public static final a c = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "contentWarning");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2282adM b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2282adM.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2282adM.a) C8953gT.d(C8953gT.c(d.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2282adM(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2282adM c2282adM) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2282adM, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2282adM.b());
            interfaceC9069id.e("contentWarning");
            C8953gT.d(C8953gT.c(d.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2282adM.c());
        }
    }

    private C2286adQ() {
    }

    /* renamed from: o.adQ$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2282adM.a> {
        private static final List<String> d;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, "message");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2282adM.a b(JsonReader jsonReader, C9028hp c9028hp) {
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
                return new C2282adM.a(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2282adM.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("message");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }
}
