package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AF;
import o.C0745Ba;

/* loaded from: classes2.dex */
public final class AJ {
    public static final AJ a = new AJ();

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<AF> {
        public static final int a;
        public static final e c = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "style", "content");
            e = j;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AF b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            AF.a aVar = null;
            AF.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    cVar = (AF.c) C8953gT.d(C8953gT.a(b.c, true)).b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    aVar = (AF.a) C8953gT.c(a.b, false, 1, null).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (aVar != null) {
                return new AF(str, cVar, aVar);
            } else {
                C8956gW.a(jsonReader, "content");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AF af) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) af, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, af.e());
            interfaceC9069id.e("style");
            C8953gT.d(C8953gT.a(b.c, true)).e(interfaceC9069id, c9028hp, af.a());
            interfaceC9069id.e("content");
            C8953gT.c(a.b, false, 1, null).e(interfaceC9069id, c9028hp, af.d());
        }
    }

    private AJ() {
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<AF.c> {
        public static final int a;
        private static final List<String> b;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public AF.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AU b2 = C0745Ba.f.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new AF.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AF.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            C0745Ba.f.e.e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<AF.a> {
        public static final a b = new a();
        public static final int d;
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY);
            e = j;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AF.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new AF.a(str, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Error.DEBUG_FIELD_KEY);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AF.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }
}
