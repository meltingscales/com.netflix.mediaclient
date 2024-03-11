package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2325aeC;
import o.C2373aey;

/* renamed from: o.aeA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2323aeA {
    public static final C2323aeA c = new C2323aeA();

    /* renamed from: o.aeA$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2325aeC> {
        public static final b b = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "reference");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2325aeC b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2325aeC.b bVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    bVar = (C2325aeC.b) C8953gT.d(C8953gT.a(d.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2325aeC(str, str2, bVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2325aeC c2325aeC) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2325aeC, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2325aeC.a());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2325aeC.b());
            interfaceC9069id.e("reference");
            C8953gT.d(C8953gT.a(d.d, true)).e(interfaceC9069id, c9028hp, c2325aeC.d());
        }
    }

    private C2323aeA() {
    }

    /* renamed from: o.aeA$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2325aeC.b> {
        private static final List<String> b;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2325aeC.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2372aex b2 = C2373aey.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2325aeC.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2325aeC.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            C2373aey.a.d.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }
}
